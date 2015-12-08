// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.gcm;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.widget.Toast;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playback.PlaySessionController;
import com.soundcloud.android.playback.PlaySessionStateProvider;
import com.soundcloud.android.properties.FeatureFlags;
import com.soundcloud.android.properties.Flag;
import com.soundcloud.android.utils.ErrorUtils;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.soundcloud.android.gcm:
//            GcmDecryptor

public class GcmMessageHandler
{

    private static final String EXTRA_DATA = "data";
    private static final String EXTRA_FROM = "from";
    private static final String RECEIVE_MESSSAGE_ACTION = "com.google.android.c2dm.intent.RECEIVE";
    private static final String SC_ACTION_STOP = "stop";
    private static final String TAG = "GcmMessageReceiver";
    private final AccountOperations accountOperations;
    private final FeatureFlags featureFlags;
    private final GcmDecryptor gcmDecryptor;
    private final PlaySessionController playSessionController;
    private final PlaySessionStateProvider playSessionStateProvider;
    private final Resources resources;

    public GcmMessageHandler(Resources resources1, FeatureFlags featureflags, GcmDecryptor gcmdecryptor, PlaySessionController playsessioncontroller, PlaySessionStateProvider playsessionstateprovider, AccountOperations accountoperations)
    {
        resources = resources1;
        featureFlags = featureflags;
        gcmDecryptor = gcmdecryptor;
        playSessionController = playsessioncontroller;
        playSessionStateProvider = playsessionstateprovider;
        accountOperations = accountoperations;
    }

    private void handleScMessage(Context context, String s)
    {
        try
        {
            JSONObject jsonobject = new JSONObject(gcmDecryptor.decrypt(s));
            if (isStopAction(jsonobject) && isLoggedInUser(jsonobject) && playSessionStateProvider.isPlaying() && featureFlags.isEnabled(Flag.KILL_CONCURRENT_STREAMING) && !jsonobject.optBoolean("stealth"))
            {
                playSessionController.pause();
                Toast.makeText(context, 0x7f070292, 1).show();
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            ErrorUtils.handleSilentException(context, "payload", s);
        }
    }

    private boolean isLoggedInUser(JSONObject jsonobject)
        throws JSONException
    {
        return accountOperations.getLoggedInUserUrn().getNumericId() == jsonobject.getLong("user_id");
    }

    private boolean isStopAction(JSONObject jsonobject)
        throws JSONException
    {
        return "stop".equals(jsonobject.getString("action"));
    }

    public void handleMessage(Context context, Intent intent)
    {
        (new StringBuilder("Received Push : ")).append(intent);
        if ("com.google.android.c2dm.intent.RECEIVE".equals(intent.getAction()) && resources.getString(0x7f0702b3).equals(intent.getStringExtra("from")))
        {
            handleScMessage(context, intent.getStringExtra("data"));
        }
    }
}

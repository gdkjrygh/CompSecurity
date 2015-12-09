// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import org.json.JSONException;
import org.json.JSONObject;

public final class egl
{

    private final Integer a = Integer.valueOf(1);
    private Context b;

    public egl(Context context)
    {
        dmz.a(fop);
        b = context;
    }

    public final void a(Boolean boolean1, String s, String s1)
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            getClass();
            jsonobject.put("playback-id", "232323");
            jsonobject.put("connected", boolean1);
            jsonobject.put("accessory-id", a);
            jsonobject.put("model-number", s);
            jsonobject.put("name", s1);
        }
        // Misplaced declaration of an exception variable
        catch (Boolean boolean1)
        {
            Logger.c("Could not setup automotiveAccessory JSON", new Object[] {
                boolean1
            });
        }
        boolean1 = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.Q, com.spotify.mobile.android.util.ClientEvent.SubEvent.bW);
        boolean1.a("AutomotiveAccessory", jsonobject.toString());
        jsonobject.toString();
        fop.a(b, ViewUri.bK, boolean1);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.arsenal;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.spotify.mobile.android.util.logging.Logger;
import dkf;
import dkw;
import dxh;

// Referenced classes of package com.spotify.mobile.android.arsenal:
//            FeedbackMode

public class ArsenalActivity extends dxh
{

    public ArsenalActivity()
    {
    }

    public static void a(Context context, FeedbackMode feedbackmode)
    {
        Intent intent = new Intent(context, com/spotify/mobile/android/arsenal/ArsenalActivity);
        intent.putExtra("feedbackMode", feedbackmode.ordinal());
        context.startActivity(intent);
    }

    private void a(String s, String s1)
    {
        dkw.a(this, s, s1);
        s = getIntent().getExtras();
        s.setClassLoader(getClassLoader());
        a(((dxk) (dkf.a(FeedbackMode.a(s, "feedbackMode")))));
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        if (j != -1)
        {
            return;
        }
        super.onActivityResult(i, j, intent);
        String s1 = intent.getStringExtra("env_name");
        String s = intent.getStringExtra("linking_url");
        intent = s;
        if (TextUtils.isEmpty(s))
        {
            intent = "https://sn.api.np.km.playstation.net/socialnetwork/api/v1/sp";
        }
        a(s1, intent);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030021);
        Intent intent = new Intent("com.spotify.arsenal.verifier.READ_ENV_NAME");
        if (bundle == null)
        {
            dkw.a(this, "");
            dkw.b(this, "", "");
            try
            {
                startActivityForResult(intent, 0);
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                Logger.a(bundle, "Verifier is not found, continue as planned #Arsenal", new Object[0]);
                a("", "https://sn.api.np.km.playstation.net/socialnetwork/api/v1/sp");
            }
        } else
        {
            finish();
        }
        setVisible(false);
    }
}

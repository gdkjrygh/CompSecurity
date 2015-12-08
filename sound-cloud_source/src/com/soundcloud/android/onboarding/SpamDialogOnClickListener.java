// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.soundcloud.android.api.oauth.OAuth;
import java.util.Locale;

class SpamDialogOnClickListener
    implements android.content.DialogInterface.OnClickListener
{

    private static final String SIGNUP_WITH_CAPTCHA_URI = "https://soundcloud.com/connect?c=true&highlight=signup&client_id=%s&redirect_uri=soundcloud://auth&response_type=code&scope=non-expiring";
    private final Context context;
    private final OAuth oAuth;

    SpamDialogOnClickListener(Context context1, OAuth oauth)
    {
        context = context1;
        oAuth = oauth;
    }

    private void onCaptchaRequested()
    {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, "https://soundcloud.com/connect?c=true&highlight=signup&client_id=%s&redirect_uri=soundcloud://auth&response_type=code&scope=non-expiring", new Object[] {
            oAuth.getClientId()
        })));
        context.startActivity(intent);
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        i;
        JVM INSTR tableswitch -1 -1: default 20
    //                   -1 27;
           goto _L1 _L2
_L1:
        dialoginterface.dismiss();
        return;
_L2:
        onCaptchaRequested();
        if (true) goto _L1; else goto _L3
_L3:
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.ui;

import android.accounts.AccountAuthenticatorResponse;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;

public final class UnpackingRedirectActivity extends Activity
{

    public static Intent createDefaultIntent(Context context, PendingIntent pendingintent)
    {
        Preconditions.checkNotNull(pendingintent, "The target cannot be null!");
        Intent intent = new Intent("com.google.android.gms.ui.UNPACKING_REDIRECT");
        intent.setPackage(context.getPackageName());
        intent.putExtra("target", pendingintent);
        return intent;
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = (PendingIntent)getIntent().getParcelableExtra("target");
        if (bundle != null)
        {
            Intent intent = new Intent();
            AccountAuthenticatorResponse accountauthenticatorresponse = (AccountAuthenticatorResponse)getIntent().getParcelableExtra("response");
            if (accountauthenticatorresponse != null)
            {
                intent.putExtra("response", accountauthenticatorresponse);
            }
            if (getCallingPackage() != null)
            {
                intent.putExtra("caller", getCallingPackage());
            }
            try
            {
                startIntentSender(bundle.getIntentSender(), intent, 0x2000000, 0x2000000, 0);
                finish();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                Log.e("UnpackingRedirectAct", "Unable to start unpacked pending intent!", bundle);
            }
        }
        setResult(0);
        finish();
    }
}

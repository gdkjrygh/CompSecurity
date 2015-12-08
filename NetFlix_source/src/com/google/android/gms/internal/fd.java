// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;

public class fd
    implements android.content.DialogInterface.OnClickListener
{

    private final int CV;
    private final Intent mIntent;
    private final Activity nS;

    public fd(Activity activity, Intent intent, int i)
    {
        nS = activity;
        mIntent = intent;
        CV = i;
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        try
        {
            if (mIntent != null)
            {
                nS.startActivityForResult(mIntent, CV);
            }
            dialoginterface.dismiss();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (DialogInterface dialoginterface)
        {
            Log.e("SettingsRedirect", "Can't redirect to app settings for Google Play services");
        }
    }
}

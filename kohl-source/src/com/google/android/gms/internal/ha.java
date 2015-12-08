// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.util.Log;

public class ha
    implements android.content.DialogInterface.OnClickListener
{

    private final Fragment FS;
    private final int FT;
    private final Intent mIntent;
    private final Activity oe;

    public ha(Activity activity, Intent intent, int i)
    {
        oe = activity;
        FS = null;
        mIntent = intent;
        FT = i;
    }

    public ha(Fragment fragment, Intent intent, int i)
    {
        oe = null;
        FS = fragment;
        mIntent = intent;
        FT = i;
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (mIntent == null || FS == null) goto _L2; else goto _L1
_L1:
        FS.startActivityForResult(mIntent, FT);
_L4:
        dialoginterface.dismiss();
        return;
_L2:
        if (mIntent != null)
        {
            oe.startActivityForResult(mIntent, FT);
        }
        if (true) goto _L4; else goto _L3
_L3:
        dialoginterface;
        Log.e("SettingsRedirect", "Can't redirect to app settings for Google Play services");
        return;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.util.Log;

public class zzg
    implements android.content.DialogInterface.OnClickListener
{

    private final Intent mIntent;
    private final Fragment zzTb;
    private final int zzTc;
    private final Activity zzpf;

    public zzg(Activity activity, Intent intent, int i)
    {
        zzpf = activity;
        zzTb = null;
        mIntent = intent;
        zzTc = i;
    }

    public zzg(Fragment fragment, Intent intent, int i)
    {
        zzpf = null;
        zzTb = fragment;
        mIntent = intent;
        zzTc = i;
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (mIntent == null || zzTb == null) goto _L2; else goto _L1
_L1:
        zzTb.startActivityForResult(mIntent, zzTc);
_L4:
        dialoginterface.dismiss();
        return;
_L2:
        if (mIntent != null)
        {
            zzpf.startActivityForResult(mIntent, zzTc);
        }
        if (true) goto _L4; else goto _L3
_L3:
        dialoginterface;
        Log.e("SettingsRedirect", "Can't redirect to app settings for Google Play services");
        return;
    }
}

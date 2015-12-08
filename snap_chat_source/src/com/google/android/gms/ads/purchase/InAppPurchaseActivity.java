// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.purchase;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.zzfp;
import com.google.android.gms.internal.zzfu;
import com.google.android.gms.internal.zzhx;

public class InAppPurchaseActivity extends Activity
{

    private zzfp zzAx;

    public InAppPurchaseActivity()
    {
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        try
        {
            if (zzAx != null)
            {
                zzAx.onActivityResult(i, j, intent);
            }
        }
        catch (RemoteException remoteexception)
        {
            zzhx.zzd("Could not forward onActivityResult to in-app purchase manager:", remoteexception);
        }
        super.onActivityResult(i, j, intent);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        zzAx = zzfu.zze(this);
        if (zzAx == null)
        {
            zzhx.zzac("Could not create in-app purchase manager.");
            finish();
            return;
        }
        try
        {
            zzAx.onCreate();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            zzhx.zzd("Could not forward onCreate to in-app purchase manager:", bundle);
        }
        finish();
    }

    protected void onDestroy()
    {
        try
        {
            if (zzAx != null)
            {
                zzAx.onDestroy();
            }
        }
        catch (RemoteException remoteexception)
        {
            zzhx.zzd("Could not forward onDestroy to in-app purchase manager:", remoteexception);
        }
        super.onDestroy();
    }
}

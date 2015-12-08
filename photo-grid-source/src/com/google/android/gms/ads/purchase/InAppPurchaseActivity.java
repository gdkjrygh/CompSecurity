// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.purchase;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.ll;
import com.google.android.gms.internal.ly;

public class InAppPurchaseActivity extends Activity
{

    public static final String CLASS_NAME = "com.google.android.gms.ads.purchase.InAppPurchaseActivity";
    public static final String SIMPLE_CLASS_NAME = "InAppPurchaseActivity";
    private ll a;

    public InAppPurchaseActivity()
    {
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        try
        {
            if (a != null)
            {
                a.onActivityResult(i, j, intent);
            }
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Could not forward onActivityResult to in-app purchase manager:", remoteexception);
        }
        super.onActivityResult(i, j, intent);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        a = ly.a(this);
        if (a == null)
        {
            zzb.zzaH("Could not create in-app purchase manager.");
            finish();
            return;
        }
        try
        {
            a.onCreate();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            zzb.zzd("Could not forward onCreate to in-app purchase manager:", bundle);
        }
        finish();
    }

    protected void onDestroy()
    {
        try
        {
            if (a != null)
            {
                a.onDestroy();
            }
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Could not forward onDestroy to in-app purchase manager:", remoteexception);
        }
        super.onDestroy();
    }
}

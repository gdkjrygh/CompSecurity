// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.purchase;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.dd;
import com.google.android.gms.internal.di;
import com.google.android.gms.internal.eu;

public final class InAppPurchaseActivity extends Activity
{

    public static final String CLASS_NAME = "com.google.android.gms.ads.purchase.InAppPurchaseActivity";
    public static final String SIMPLE_CLASS_NAME = "InAppPurchaseActivity";
    private dd tb;

    public InAppPurchaseActivity()
    {
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        try
        {
            if (tb != null)
            {
                tb.onActivityResult(i, j, intent);
            }
        }
        catch (RemoteException remoteexception)
        {
            eu.c("Could not forward onActivityResult to in-app purchase manager:", remoteexception);
        }
        super.onActivityResult(i, j, intent);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        tb = di.d(this);
        if (tb == null)
        {
            eu.D("Could not create in-app purchase manager.");
            finish();
            return;
        }
        try
        {
            tb.onCreate();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            eu.c("Could not forward onCreate to in-app purchase manager:", bundle);
        }
        finish();
    }

    protected void onDestroy()
    {
        try
        {
            if (tb != null)
            {
                tb.onDestroy();
            }
        }
        catch (RemoteException remoteexception)
        {
            eu.c("Could not forward onDestroy to in-app purchase manager:", remoteexception);
        }
        super.onDestroy();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.purchase;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.de;
import com.google.android.gms.internal.dj;
import com.google.android.gms.internal.ev;

public final class InAppPurchaseActivity extends Activity
{

    public static final String CLASS_NAME = "com.google.android.gms.ads.purchase.InAppPurchaseActivity";
    public static final String SIMPLE_CLASS_NAME = "InAppPurchaseActivity";
    private de sY;

    public InAppPurchaseActivity()
    {
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        try
        {
            if (sY != null)
            {
                sY.onActivityResult(i, j, intent);
            }
        }
        catch (RemoteException remoteexception)
        {
            ev.c("Could not forward onActivityResult to in-app purchase manager:", remoteexception);
        }
        super.onActivityResult(i, j, intent);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        sY = dj.d(this);
        if (sY == null)
        {
            ev.D("Could not create in-app purchase manager.");
            finish();
            return;
        }
        try
        {
            sY.onCreate();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            ev.c("Could not forward onCreate to in-app purchase manager:", bundle);
        }
        finish();
    }

    protected void onDestroy()
    {
        try
        {
            if (sY != null)
            {
                sY.onDestroy();
            }
        }
        catch (RemoteException remoteexception)
        {
            ev.c("Could not forward onDestroy to in-app purchase manager:", remoteexception);
        }
        super.onDestroy();
    }
}

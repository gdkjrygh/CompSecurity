// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.purchase;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.dv;
import com.google.android.gms.internal.eb;
import com.google.android.gms.internal.fj;

public class InAppPurchaseActivity extends Activity
{

    private dv a;

    public InAppPurchaseActivity()
    {
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        try
        {
            if (a != null)
            {
                a.a(i, j, intent);
            }
        }
        catch (RemoteException remoteexception)
        {
            fj.c("Could not forward onActivityResult to in-app purchase manager:", remoteexception);
        }
        super.onActivityResult(i, j, intent);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        a = eb.a(this);
        if (a == null)
        {
            fj.e("Could not create in-app purchase manager.");
            finish();
            return;
        }
        try
        {
            a.a();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            fj.c("Could not forward onCreate to in-app purchase manager:", bundle);
        }
        finish();
    }

    protected void onDestroy()
    {
        try
        {
            if (a != null)
            {
                a.b();
            }
        }
        catch (RemoteException remoteexception)
        {
            fj.c("Could not forward onDestroy to in-app purchase manager:", remoteexception);
        }
        super.onDestroy();
    }
}

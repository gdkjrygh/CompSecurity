// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.bm;
import com.google.android.gms.internal.bn;
import com.google.android.gms.internal.cn;

public final class AdActivity extends Activity
{

    public static final String CLASS_NAME = "com.google.android.gms.ads.AdActivity";
    public static final String SIMPLE_CLASS_NAME = "AdActivity";
    private bn dH;

    public AdActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        dH = bm.a(this);
        if (dH == null)
        {
            cn.q("Could not create ad overlay.");
            finish();
            return;
        }
        try
        {
            dH.onCreate(bundle);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            cn.b("Could not forward onCreate to ad overlay:", bundle);
        }
        finish();
    }

    protected void onDestroy()
    {
        try
        {
            if (dH != null)
            {
                dH.onDestroy();
            }
        }
        catch (RemoteException remoteexception)
        {
            cn.b("Could not forward onDestroy to ad overlay:", remoteexception);
        }
        super.onDestroy();
    }

    protected void onPause()
    {
        try
        {
            if (dH != null)
            {
                dH.onPause();
            }
        }
        catch (RemoteException remoteexception)
        {
            cn.b("Could not forward onPause to ad overlay:", remoteexception);
            finish();
        }
        super.onPause();
    }

    protected void onRestart()
    {
        super.onRestart();
        try
        {
            if (dH != null)
            {
                dH.onRestart();
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            cn.b("Could not forward onRestart to ad overlay:", remoteexception);
        }
        finish();
    }

    protected void onResume()
    {
        super.onResume();
        try
        {
            if (dH != null)
            {
                dH.onResume();
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            cn.b("Could not forward onResume to ad overlay:", remoteexception);
        }
        finish();
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        try
        {
            if (dH != null)
            {
                dH.onSaveInstanceState(bundle);
            }
        }
        catch (RemoteException remoteexception)
        {
            cn.b("Could not forward onSaveInstanceState to ad overlay:", remoteexception);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    protected void onStart()
    {
        super.onStart();
        try
        {
            if (dH != null)
            {
                dH.onStart();
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            cn.b("Could not forward onStart to ad overlay:", remoteexception);
        }
        finish();
    }

    protected void onStop()
    {
        try
        {
            if (dH != null)
            {
                dH.onStop();
            }
        }
        catch (RemoteException remoteexception)
        {
            cn.b("Could not forward onStop to ad overlay:", remoteexception);
            finish();
        }
        super.onStop();
    }
}

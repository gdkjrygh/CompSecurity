// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.internal.cj;
import com.google.android.gms.internal.ck;
import com.google.android.gms.internal.dw;

public final class AdActivity extends Activity
{

    public static final String CLASS_NAME = "com.google.android.gms.ads.AdActivity";
    public static final String SIMPLE_CLASS_NAME = "AdActivity";
    private ck ko;

    public AdActivity()
    {
    }

    private void N()
    {
        if (ko == null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        ko.N();
        return;
        RemoteException remoteexception;
        remoteexception;
        dw.c("Could not forward setContentViewSet to ad overlay:", remoteexception);
        return;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        ko = cj.a(this);
        if (ko == null)
        {
            dw.z("Could not create ad overlay.");
            finish();
            return;
        }
        try
        {
            ko.onCreate(bundle);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            dw.c("Could not forward onCreate to ad overlay:", bundle);
        }
        finish();
    }

    protected void onDestroy()
    {
        try
        {
            if (ko != null)
            {
                ko.onDestroy();
            }
        }
        catch (RemoteException remoteexception)
        {
            dw.c("Could not forward onDestroy to ad overlay:", remoteexception);
        }
        super.onDestroy();
    }

    protected void onPause()
    {
        try
        {
            if (ko != null)
            {
                ko.onPause();
            }
        }
        catch (RemoteException remoteexception)
        {
            dw.c("Could not forward onPause to ad overlay:", remoteexception);
            finish();
        }
        super.onPause();
    }

    protected void onRestart()
    {
        super.onRestart();
        try
        {
            if (ko != null)
            {
                ko.onRestart();
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            dw.c("Could not forward onRestart to ad overlay:", remoteexception);
        }
        finish();
    }

    protected void onResume()
    {
        super.onResume();
        try
        {
            if (ko != null)
            {
                ko.onResume();
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            dw.c("Could not forward onResume to ad overlay:", remoteexception);
        }
        finish();
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        try
        {
            if (ko != null)
            {
                ko.onSaveInstanceState(bundle);
            }
        }
        catch (RemoteException remoteexception)
        {
            dw.c("Could not forward onSaveInstanceState to ad overlay:", remoteexception);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    protected void onStart()
    {
        super.onStart();
        try
        {
            if (ko != null)
            {
                ko.onStart();
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            dw.c("Could not forward onStart to ad overlay:", remoteexception);
        }
        finish();
    }

    protected void onStop()
    {
        try
        {
            if (ko != null)
            {
                ko.onStop();
            }
        }
        catch (RemoteException remoteexception)
        {
            dw.c("Could not forward onStop to ad overlay:", remoteexception);
            finish();
        }
        super.onStop();
    }

    public void setContentView(int i)
    {
        super.setContentView(i);
        N();
    }

    public void setContentView(View view)
    {
        super.setContentView(view);
        N();
    }

    public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.setContentView(view, layoutparams);
        N();
    }
}

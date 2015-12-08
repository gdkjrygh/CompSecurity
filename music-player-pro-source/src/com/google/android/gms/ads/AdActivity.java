// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.internal.dw;
import com.google.android.gms.internal.dx;
import com.google.android.gms.internal.gr;

public final class AdActivity extends Activity
{

    public static final String CLASS_NAME = "com.google.android.gms.ads.AdActivity";
    public static final String SIMPLE_CLASS_NAME = "AdActivity";
    private dx lf;

    public AdActivity()
    {
    }

    private void X()
    {
        if (lf == null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        lf.X();
        return;
        RemoteException remoteexception;
        remoteexception;
        gr.d("Could not forward setContentViewSet to ad overlay:", remoteexception);
        return;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        lf = dw.b(this);
        if (lf == null)
        {
            gr.W("Could not create ad overlay.");
            finish();
            return;
        }
        try
        {
            lf.onCreate(bundle);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            gr.d("Could not forward onCreate to ad overlay:", bundle);
        }
        finish();
    }

    protected void onDestroy()
    {
        try
        {
            if (lf != null)
            {
                lf.onDestroy();
            }
        }
        catch (RemoteException remoteexception)
        {
            gr.d("Could not forward onDestroy to ad overlay:", remoteexception);
        }
        super.onDestroy();
    }

    protected void onPause()
    {
        try
        {
            if (lf != null)
            {
                lf.onPause();
            }
        }
        catch (RemoteException remoteexception)
        {
            gr.d("Could not forward onPause to ad overlay:", remoteexception);
            finish();
        }
        super.onPause();
    }

    protected void onRestart()
    {
        super.onRestart();
        try
        {
            if (lf != null)
            {
                lf.onRestart();
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            gr.d("Could not forward onRestart to ad overlay:", remoteexception);
        }
        finish();
    }

    protected void onResume()
    {
        super.onResume();
        try
        {
            if (lf != null)
            {
                lf.onResume();
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            gr.d("Could not forward onResume to ad overlay:", remoteexception);
        }
        finish();
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        try
        {
            if (lf != null)
            {
                lf.onSaveInstanceState(bundle);
            }
        }
        catch (RemoteException remoteexception)
        {
            gr.d("Could not forward onSaveInstanceState to ad overlay:", remoteexception);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    protected void onStart()
    {
        super.onStart();
        try
        {
            if (lf != null)
            {
                lf.onStart();
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            gr.d("Could not forward onStart to ad overlay:", remoteexception);
        }
        finish();
    }

    protected void onStop()
    {
        try
        {
            if (lf != null)
            {
                lf.onStop();
            }
        }
        catch (RemoteException remoteexception)
        {
            gr.d("Could not forward onStop to ad overlay:", remoteexception);
            finish();
        }
        super.onStop();
    }

    public void setContentView(int i)
    {
        super.setContentView(i);
        X();
    }

    public void setContentView(View view)
    {
        super.setContentView(view);
        X();
    }

    public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.setContentView(view, layoutparams);
        X();
    }
}

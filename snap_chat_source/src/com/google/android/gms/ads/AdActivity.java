// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.internal.zzeu;
import com.google.android.gms.internal.zzev;
import com.google.android.gms.internal.zzhx;

public class AdActivity extends Activity
{

    private zzev zzlf;

    public AdActivity()
    {
    }

    private void zzX()
    {
        if (zzlf == null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        zzlf.zzX();
        return;
        RemoteException remoteexception;
        remoteexception;
        zzhx.zzd("Could not forward setContentViewSet to ad overlay:", remoteexception);
        return;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        zzlf = zzeu.zzb(this);
        if (zzlf == null)
        {
            zzhx.zzac("Could not create ad overlay.");
            finish();
            return;
        }
        try
        {
            zzlf.onCreate(bundle);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            zzhx.zzd("Could not forward onCreate to ad overlay:", bundle);
        }
        finish();
    }

    protected void onDestroy()
    {
        try
        {
            if (zzlf != null)
            {
                zzlf.onDestroy();
            }
        }
        catch (RemoteException remoteexception)
        {
            zzhx.zzd("Could not forward onDestroy to ad overlay:", remoteexception);
        }
        super.onDestroy();
    }

    protected void onPause()
    {
        try
        {
            if (zzlf != null)
            {
                zzlf.onPause();
            }
        }
        catch (RemoteException remoteexception)
        {
            zzhx.zzd("Could not forward onPause to ad overlay:", remoteexception);
            finish();
        }
        super.onPause();
    }

    protected void onRestart()
    {
        super.onRestart();
        try
        {
            if (zzlf != null)
            {
                zzlf.onRestart();
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzhx.zzd("Could not forward onRestart to ad overlay:", remoteexception);
        }
        finish();
    }

    protected void onResume()
    {
        super.onResume();
        try
        {
            if (zzlf != null)
            {
                zzlf.onResume();
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzhx.zzd("Could not forward onResume to ad overlay:", remoteexception);
        }
        finish();
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        try
        {
            if (zzlf != null)
            {
                zzlf.onSaveInstanceState(bundle);
            }
        }
        catch (RemoteException remoteexception)
        {
            zzhx.zzd("Could not forward onSaveInstanceState to ad overlay:", remoteexception);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    protected void onStart()
    {
        super.onStart();
        try
        {
            if (zzlf != null)
            {
                zzlf.onStart();
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzhx.zzd("Could not forward onStart to ad overlay:", remoteexception);
        }
        finish();
    }

    protected void onStop()
    {
        try
        {
            if (zzlf != null)
            {
                zzlf.onStop();
            }
        }
        catch (RemoteException remoteexception)
        {
            zzhx.zzd("Could not forward onStop to ad overlay:", remoteexception);
            finish();
        }
        super.onStop();
    }

    public void setContentView(int i)
    {
        super.setContentView(i);
        zzX();
    }

    public void setContentView(View view)
    {
        super.setContentView(view);
        zzX();
    }

    public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.setContentView(view, layoutparams);
        zzX();
    }
}

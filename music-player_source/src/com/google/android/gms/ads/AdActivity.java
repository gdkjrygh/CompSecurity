// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.cb;
import com.google.android.gms.internal.ce;
import com.google.android.gms.internal.ek;

public final class AdActivity extends Activity
{

    private ce a;

    public AdActivity()
    {
    }

    protected final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        a = cb.a(this);
        if (a == null)
        {
            ek.d("Could not create ad overlay.");
            finish();
            return;
        }
        try
        {
            a.a(bundle);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            ek.a("Could not forward onCreate to ad overlay:", bundle);
        }
        finish();
    }

    protected final void onDestroy()
    {
        try
        {
            if (a != null)
            {
                a.i();
            }
        }
        catch (RemoteException remoteexception)
        {
            ek.a("Could not forward onDestroy to ad overlay:", remoteexception);
        }
        super.onDestroy();
    }

    protected final void onPause()
    {
        try
        {
            if (a != null)
            {
                a.g();
            }
        }
        catch (RemoteException remoteexception)
        {
            ek.a("Could not forward onPause to ad overlay:", remoteexception);
            finish();
        }
        super.onPause();
    }

    protected final void onRestart()
    {
        super.onRestart();
        try
        {
            if (a != null)
            {
                a.d();
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            ek.a("Could not forward onRestart to ad overlay:", remoteexception);
        }
        finish();
    }

    protected final void onResume()
    {
        super.onResume();
        try
        {
            if (a != null)
            {
                a.f();
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            ek.a("Could not forward onResume to ad overlay:", remoteexception);
        }
        finish();
    }

    protected final void onSaveInstanceState(Bundle bundle)
    {
        try
        {
            if (a != null)
            {
                a.b(bundle);
            }
        }
        catch (RemoteException remoteexception)
        {
            ek.a("Could not forward onSaveInstanceState to ad overlay:", remoteexception);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    protected final void onStart()
    {
        super.onStart();
        try
        {
            if (a != null)
            {
                a.e();
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            ek.a("Could not forward onStart to ad overlay:", remoteexception);
        }
        finish();
    }

    protected final void onStop()
    {
        try
        {
            if (a != null)
            {
                a.h();
            }
        }
        catch (RemoteException remoteexception)
        {
            ek.a("Could not forward onStop to ad overlay:", remoteexception);
            finish();
        }
        super.onStop();
    }
}

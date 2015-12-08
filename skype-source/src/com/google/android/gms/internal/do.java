// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.b.d;
import com.google.android.gms.ads.b.f;
import com.google.android.gms.ads.b.g;
import com.google.android.gms.ads.b.l;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.common.internal.y;

// Referenced classes of package com.google.android.gms.internal:
//            dj

public final class do
    implements d, f, l
{

    private final dj a;
    private g b;

    public do(dj dj1)
    {
        a = dj1;
    }

    public final void a()
    {
        y.b("onAdLoaded must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.b.a(3);
        try
        {
            a.e();
            return;
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.b.b("Could not call onAdLoaded.", remoteexception);
        }
    }

    public final void a(int i1)
    {
        y.b("onAdFailedToLoad must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.b.a(3);
        try
        {
            a.a(i1);
            return;
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.b.b("Could not call onAdFailedToLoad.", remoteexception);
        }
    }

    public final void a(g g1)
    {
        y.b("onAdLoaded must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.b.a(3);
        b = g1;
        try
        {
            a.e();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (g g1)
        {
            com.google.android.gms.ads.internal.util.client.b.b("Could not call onAdLoaded.", g1);
        }
    }

    public final void b()
    {
        y.b("onAdOpened must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.b.a(3);
        try
        {
            a.d();
            return;
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.b.b("Could not call onAdOpened.", remoteexception);
        }
    }

    public final void b(int i1)
    {
        y.b("onAdFailedToLoad must be called on the main UI thread.");
        (new StringBuilder("Adapter called onAdFailedToLoad with error ")).append(i1).append(".");
        com.google.android.gms.ads.internal.util.client.b.a(3);
        try
        {
            a.a(i1);
            return;
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.b.b("Could not call onAdFailedToLoad.", remoteexception);
        }
    }

    public final void c()
    {
        y.b("onAdClosed must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.b.a(3);
        try
        {
            a.b();
            return;
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.b.b("Could not call onAdClosed.", remoteexception);
        }
    }

    public final void c(int i1)
    {
        y.b("onAdFailedToLoad must be called on the main UI thread.");
        (new StringBuilder("Adapter called onAdFailedToLoad with error ")).append(i1).append(".");
        com.google.android.gms.ads.internal.util.client.b.a(3);
        try
        {
            a.a(i1);
            return;
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.b.b("Could not call onAdFailedToLoad.", remoteexception);
        }
    }

    public final void d()
    {
        y.b("onAdLeftApplication must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.b.a(3);
        try
        {
            a.c();
            return;
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.b.b("Could not call onAdLeftApplication.", remoteexception);
        }
    }

    public final void e()
    {
        y.b("onAdClicked must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.b.a(3);
        try
        {
            a.a();
            return;
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.b.b("Could not call onAdClicked.", remoteexception);
        }
    }

    public final void f()
    {
        y.b("onAdLoaded must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.b.a(3);
        try
        {
            a.e();
            return;
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.b.b("Could not call onAdLoaded.", remoteexception);
        }
    }

    public final void g()
    {
        y.b("onAdOpened must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.b.a(3);
        try
        {
            a.d();
            return;
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.b.b("Could not call onAdOpened.", remoteexception);
        }
    }

    public final void h()
    {
        y.b("onAdClosed must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.b.a(3);
        try
        {
            a.b();
            return;
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.b.b("Could not call onAdClosed.", remoteexception);
        }
    }

    public final void i()
    {
        y.b("onAdLeftApplication must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.b.a(3);
        try
        {
            a.c();
            return;
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.b.b("Could not call onAdLeftApplication.", remoteexception);
        }
    }

    public final void j()
    {
        y.b("onAdClicked must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.b.a(3);
        try
        {
            a.a();
            return;
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.b.b("Could not call onAdClicked.", remoteexception);
        }
    }

    public final void k()
    {
        y.b("onAdOpened must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.b.a(3);
        try
        {
            a.d();
            return;
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.b.b("Could not call onAdOpened.", remoteexception);
        }
    }

    public final void l()
    {
        y.b("onAdClosed must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.b.a(3);
        try
        {
            a.b();
            return;
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.b.b("Could not call onAdClosed.", remoteexception);
        }
    }

    public final void m()
    {
        y.b("onAdLeftApplication must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.b.a(3);
        try
        {
            a.c();
            return;
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.b.b("Could not call onAdLeftApplication.", remoteexception);
        }
    }

    public final void n()
    {
        y.b("onAdClicked must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.b.a(3);
        try
        {
            a.a();
            return;
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.b.b("Could not call onAdClicked.", remoteexception);
        }
    }

    public final g o()
    {
        return b;
    }
}

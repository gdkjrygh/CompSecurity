// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.RemoteException;

public final class cfr
    implements blb, bld, blf
{

    blg a;
    private final cfd b;

    public cfr(cfd cfd1)
    {
        b = cfd1;
    }

    public final void a()
    {
        btl.b("onAdLoaded must be called on the main UI thread.");
        bka.a("Adapter called onAdLoaded.");
        try
        {
            b.e();
            return;
        }
        catch (RemoteException remoteexception)
        {
            bka.c("Could not call onAdLoaded.", remoteexception);
        }
    }

    public final void a(int i1)
    {
        btl.b("onAdFailedToLoad must be called on the main UI thread.");
        bka.a((new StringBuilder("Adapter called onAdFailedToLoad with error. ")).append(i1).toString());
        try
        {
            b.a(i1);
            return;
        }
        catch (RemoteException remoteexception)
        {
            bka.c("Could not call onAdFailedToLoad.", remoteexception);
        }
    }

    public final void a(blg blg)
    {
        btl.b("onAdLoaded must be called on the main UI thread.");
        bka.a("Adapter called onAdLoaded.");
        a = blg;
        try
        {
            b.e();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (blg blg)
        {
            bka.c("Could not call onAdLoaded.", blg);
        }
    }

    public final void b()
    {
        btl.b("onAdOpened must be called on the main UI thread.");
        bka.a("Adapter called onAdOpened.");
        try
        {
            b.d();
            return;
        }
        catch (RemoteException remoteexception)
        {
            bka.c("Could not call onAdOpened.", remoteexception);
        }
    }

    public final void b(int i1)
    {
        btl.b("onAdFailedToLoad must be called on the main UI thread.");
        bka.a((new StringBuilder("Adapter called onAdFailedToLoad with error ")).append(i1).append(".").toString());
        try
        {
            b.a(i1);
            return;
        }
        catch (RemoteException remoteexception)
        {
            bka.c("Could not call onAdFailedToLoad.", remoteexception);
        }
    }

    public final void c()
    {
        btl.b("onAdClosed must be called on the main UI thread.");
        bka.a("Adapter called onAdClosed.");
        try
        {
            b.b();
            return;
        }
        catch (RemoteException remoteexception)
        {
            bka.c("Could not call onAdClosed.", remoteexception);
        }
    }

    public final void c(int i1)
    {
        btl.b("onAdFailedToLoad must be called on the main UI thread.");
        bka.a((new StringBuilder("Adapter called onAdFailedToLoad with error ")).append(i1).append(".").toString());
        try
        {
            b.a(i1);
            return;
        }
        catch (RemoteException remoteexception)
        {
            bka.c("Could not call onAdFailedToLoad.", remoteexception);
        }
    }

    public final void d()
    {
        btl.b("onAdLeftApplication must be called on the main UI thread.");
        bka.a("Adapter called onAdLeftApplication.");
        try
        {
            b.c();
            return;
        }
        catch (RemoteException remoteexception)
        {
            bka.c("Could not call onAdLeftApplication.", remoteexception);
        }
    }

    public final void e()
    {
        btl.b("onAdClicked must be called on the main UI thread.");
        bka.a("Adapter called onAdClicked.");
        try
        {
            b.a();
            return;
        }
        catch (RemoteException remoteexception)
        {
            bka.c("Could not call onAdClicked.", remoteexception);
        }
    }

    public final void f()
    {
        btl.b("onAdLoaded must be called on the main UI thread.");
        bka.a("Adapter called onAdLoaded.");
        try
        {
            b.e();
            return;
        }
        catch (RemoteException remoteexception)
        {
            bka.c("Could not call onAdLoaded.", remoteexception);
        }
    }

    public final void g()
    {
        btl.b("onAdOpened must be called on the main UI thread.");
        bka.a("Adapter called onAdOpened.");
        try
        {
            b.d();
            return;
        }
        catch (RemoteException remoteexception)
        {
            bka.c("Could not call onAdOpened.", remoteexception);
        }
    }

    public final void h()
    {
        btl.b("onAdClosed must be called on the main UI thread.");
        bka.a("Adapter called onAdClosed.");
        try
        {
            b.b();
            return;
        }
        catch (RemoteException remoteexception)
        {
            bka.c("Could not call onAdClosed.", remoteexception);
        }
    }

    public final void i()
    {
        btl.b("onAdLeftApplication must be called on the main UI thread.");
        bka.a("Adapter called onAdLeftApplication.");
        try
        {
            b.c();
            return;
        }
        catch (RemoteException remoteexception)
        {
            bka.c("Could not call onAdLeftApplication.", remoteexception);
        }
    }

    public final void j()
    {
        btl.b("onAdClicked must be called on the main UI thread.");
        bka.a("Adapter called onAdClicked.");
        try
        {
            b.a();
            return;
        }
        catch (RemoteException remoteexception)
        {
            bka.c("Could not call onAdClicked.", remoteexception);
        }
    }

    public final void k()
    {
        btl.b("onAdOpened must be called on the main UI thread.");
        bka.a("Adapter called onAdOpened.");
        try
        {
            b.d();
            return;
        }
        catch (RemoteException remoteexception)
        {
            bka.c("Could not call onAdOpened.", remoteexception);
        }
    }

    public final void l()
    {
        btl.b("onAdClosed must be called on the main UI thread.");
        bka.a("Adapter called onAdClosed.");
        try
        {
            b.b();
            return;
        }
        catch (RemoteException remoteexception)
        {
            bka.c("Could not call onAdClosed.", remoteexception);
        }
    }

    public final void m()
    {
        btl.b("onAdLeftApplication must be called on the main UI thread.");
        bka.a("Adapter called onAdLeftApplication.");
        try
        {
            b.c();
            return;
        }
        catch (RemoteException remoteexception)
        {
            bka.c("Could not call onAdLeftApplication.", remoteexception);
        }
    }

    public final void n()
    {
        btl.b("onAdClicked must be called on the main UI thread.");
        bka.a("Adapter called onAdClicked.");
        try
        {
            b.a();
            return;
        }
        catch (RemoteException remoteexception)
        {
            bka.c("Could not call onAdClicked.", remoteexception);
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.RemoteException;

public final class aeu
    implements ox, oz
{

    private final aep a;

    public aeu(aep aep1)
    {
        a = aep1;
    }

    public final void a()
    {
        wn.b("onAdLoaded must be called on the main UI thread.");
        of.a("Adapter called onAdLoaded.");
        try
        {
            a.e();
            return;
        }
        catch (RemoteException remoteexception)
        {
            of.d("Could not call onAdLoaded.", remoteexception);
        }
    }

    public final void a(int k)
    {
        wn.b("onAdFailedToLoad must be called on the main UI thread.");
        of.a((new StringBuilder("Adapter called onAdFailedToLoad with error. ")).append(k).toString());
        try
        {
            a.a(k);
            return;
        }
        catch (RemoteException remoteexception)
        {
            of.d("Could not call onAdFailedToLoad.", remoteexception);
        }
    }

    public final void b()
    {
        wn.b("onAdOpened must be called on the main UI thread.");
        of.a("Adapter called onAdOpened.");
        try
        {
            a.d();
            return;
        }
        catch (RemoteException remoteexception)
        {
            of.d("Could not call onAdOpened.", remoteexception);
        }
    }

    public final void b(int k)
    {
        wn.b("onAdFailedToLoad must be called on the main UI thread.");
        of.a((new StringBuilder("Adapter called onAdFailedToLoad with error ")).append(k).append(".").toString());
        try
        {
            a.a(k);
            return;
        }
        catch (RemoteException remoteexception)
        {
            of.d("Could not call onAdFailedToLoad.", remoteexception);
        }
    }

    public final void c()
    {
        wn.b("onAdClosed must be called on the main UI thread.");
        of.a("Adapter called onAdClosed.");
        try
        {
            a.b();
            return;
        }
        catch (RemoteException remoteexception)
        {
            of.d("Could not call onAdClosed.", remoteexception);
        }
    }

    public final void d()
    {
        wn.b("onAdLeftApplication must be called on the main UI thread.");
        of.a("Adapter called onAdLeftApplication.");
        try
        {
            a.c();
            return;
        }
        catch (RemoteException remoteexception)
        {
            of.d("Could not call onAdLeftApplication.", remoteexception);
        }
    }

    public final void e()
    {
        wn.b("onAdClicked must be called on the main UI thread.");
        of.a("Adapter called onAdClicked.");
        try
        {
            a.a();
            return;
        }
        catch (RemoteException remoteexception)
        {
            of.d("Could not call onAdClicked.", remoteexception);
        }
    }

    public final void f()
    {
        wn.b("onAdLoaded must be called on the main UI thread.");
        of.a("Adapter called onAdLoaded.");
        try
        {
            a.e();
            return;
        }
        catch (RemoteException remoteexception)
        {
            of.d("Could not call onAdLoaded.", remoteexception);
        }
    }

    public final void g()
    {
        wn.b("onAdOpened must be called on the main UI thread.");
        of.a("Adapter called onAdOpened.");
        try
        {
            a.d();
            return;
        }
        catch (RemoteException remoteexception)
        {
            of.d("Could not call onAdOpened.", remoteexception);
        }
    }

    public final void h()
    {
        wn.b("onAdClosed must be called on the main UI thread.");
        of.a("Adapter called onAdClosed.");
        try
        {
            a.b();
            return;
        }
        catch (RemoteException remoteexception)
        {
            of.d("Could not call onAdClosed.", remoteexception);
        }
    }

    public final void i()
    {
        wn.b("onAdLeftApplication must be called on the main UI thread.");
        of.a("Adapter called onAdLeftApplication.");
        try
        {
            a.c();
            return;
        }
        catch (RemoteException remoteexception)
        {
            of.d("Could not call onAdLeftApplication.", remoteexception);
        }
    }

    public final void j()
    {
        wn.b("onAdClicked must be called on the main UI thread.");
        of.a("Adapter called onAdClicked.");
        try
        {
            a.a();
            return;
        }
        catch (RemoteException remoteexception)
        {
            of.d("Could not call onAdClicked.", remoteexception);
        }
    }
}

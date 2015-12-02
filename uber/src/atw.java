// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;

public final class atw
    implements ave
{

    private final ViewGroup a;
    private final aux b;
    private View c;

    public atw(ViewGroup viewgroup, aux aux1)
    {
        b = (aux)wn.a(aux1);
        a = (ViewGroup)wn.a(viewgroup);
    }

    public final void a()
    {
        try
        {
            b.b();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new ayb(remoteexception);
        }
    }

    public final void a(Bundle bundle)
    {
        try
        {
            b.a(bundle);
            c = (View)aai.a(b.f());
            a.removeAllViews();
            a.addView(c);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw new ayb(bundle);
        }
    }

    public final void a(att att)
    {
        try
        {
            b.a(new axp(att) {

                final att a;
                final atw b;

                public final void a(aur aur)
                {
                    new atv(aur);
                }

            
            {
                b = atw.this;
                a = att;
                super();
            }
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (att att)
        {
            throw new ayb(att);
        }
    }

    public final void b()
    {
        try
        {
            b.c();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new ayb(remoteexception);
        }
    }

    public final void b(Bundle bundle)
    {
        try
        {
            b.b(bundle);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw new ayb(bundle);
        }
    }

    public final void c()
    {
        try
        {
            b.d();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new ayb(remoteexception);
        }
    }

    public final void d()
    {
        try
        {
            b.e();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new ayb(remoteexception);
        }
    }
}

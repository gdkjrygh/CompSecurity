// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;

public final class atp
    implements avd
{

    private final ViewGroup a;
    private final aul b;
    private View c;

    public atp(ViewGroup viewgroup, aul aul1)
    {
        b = (aul)wn.a(aul1);
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

    public final void a(ats ats)
    {
        try
        {
            b.a(new awo(ats) {

                final ats a;
                final atp b;

                public final void a(auc auc)
                {
                    ats ats1 = a;
                    new ath(auc);
                    ats1.a();
                }

            
            {
                b = atp.this;
                a = ats1;
                super();
            }
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ats ats)
        {
            throw new ayb(ats);
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

    public final aul e()
    {
        return b;
    }
}

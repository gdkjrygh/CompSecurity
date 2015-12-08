// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.IBinder;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ccf extends bfa
{

    private final ccc a;
    private final List b;
    private final cbv c;

    public ccf(ccc ccc1)
    {
        b = new ArrayList();
        a = ccc1;
        Iterator iterator = a.b().iterator();
_L6:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        ccc1 = ((ccc) (iterator.next()));
        if (!(ccc1 instanceof IBinder)) goto _L4; else goto _L3
_L3:
        ccc1 = cbt.a((IBinder)ccc1);
_L7:
        if (ccc1 == null) goto _L6; else goto _L5
_L5:
        b.add(new cbv(ccc1));
          goto _L6
        ccc1;
        bka.b("Failed to get image.", ccc1);
_L2:
        ccc1 = a.d();
        if (ccc1 == null)
        {
            break MISSING_BLOCK_LABEL_139;
        }
        ccc1 = new cbv(ccc1);
_L8:
        c = ccc1;
        return;
_L4:
        ccc1 = null;
          goto _L7
        ccc1;
        bka.b("Failed to get icon.", ccc1);
        ccc1 = null;
          goto _L8
    }

    private byb j()
    {
        byb byb;
        try
        {
            byb = a.i();
        }
        catch (RemoteException remoteexception)
        {
            bka.b("Failed to retrieve native ad engine.", remoteexception);
            return null;
        }
        return byb;
    }

    protected final Object a()
    {
        return j();
    }

    public final CharSequence b()
    {
        String s;
        try
        {
            s = a.a();
        }
        catch (RemoteException remoteexception)
        {
            bka.b("Failed to get headline.", remoteexception);
            return null;
        }
        return s;
    }

    public final List c()
    {
        return b;
    }

    public final CharSequence d()
    {
        String s;
        try
        {
            s = a.c();
        }
        catch (RemoteException remoteexception)
        {
            bka.b("Failed to get body.", remoteexception);
            return null;
        }
        return s;
    }

    public final bex e()
    {
        return c;
    }

    public final CharSequence f()
    {
        String s;
        try
        {
            s = a.e();
        }
        catch (RemoteException remoteexception)
        {
            bka.b("Failed to get call to action.", remoteexception);
            return null;
        }
        return s;
    }

    public final Double g()
    {
        double d1;
        try
        {
            d1 = a.f();
        }
        catch (RemoteException remoteexception)
        {
            bka.b("Failed to get star rating.", remoteexception);
            return null;
        }
        if (d1 == -1D)
        {
            return null;
        } else
        {
            return Double.valueOf(d1);
        }
    }

    public final CharSequence h()
    {
        String s;
        try
        {
            s = a.g();
        }
        catch (RemoteException remoteexception)
        {
            bka.b("Failed to get store", remoteexception);
            return null;
        }
        return s;
    }

    public final CharSequence i()
    {
        String s;
        try
        {
            s = a.h();
        }
        catch (RemoteException remoteexception)
        {
            bka.b("Failed to get price.", remoteexception);
            return null;
        }
        return s;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.IBinder;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ccj extends bfc
{

    private final ccg a;
    private final List b;
    private final cbv c;

    public ccj(ccg ccg1)
    {
        b = new ArrayList();
        a = ccg1;
        Iterator iterator = a.b().iterator();
_L6:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        ccg1 = ((ccg) (iterator.next()));
        if (!(ccg1 instanceof IBinder)) goto _L4; else goto _L3
_L3:
        ccg1 = cbt.a((IBinder)ccg1);
_L7:
        if (ccg1 == null) goto _L6; else goto _L5
_L5:
        b.add(new cbv(ccg1));
          goto _L6
        ccg1;
        bka.b("Failed to get image.", ccg1);
_L2:
        ccg1 = a.d();
        if (ccg1 == null)
        {
            break MISSING_BLOCK_LABEL_139;
        }
        ccg1 = new cbv(ccg1);
_L8:
        c = ccg1;
        return;
_L4:
        ccg1 = null;
          goto _L7
        ccg1;
        bka.b("Failed to get icon.", ccg1);
        ccg1 = null;
          goto _L8
    }

    private byb h()
    {
        byb byb;
        try
        {
            byb = a.g();
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
        return h();
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

    public final CharSequence g()
    {
        String s;
        try
        {
            s = a.f();
        }
        catch (RemoteException remoteexception)
        {
            bka.b("Failed to get attribution.", remoteexception);
            return null;
        }
        return s;
    }
}

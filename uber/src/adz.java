// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import java.util.Iterator;
import java.util.List;

public final class adz
{

    private final AdRequestInfoParcel a;
    private final aej b;
    private final Context c;
    private final Object d = new Object();
    private final aeb e;
    private boolean f;
    private aee g;

    public adz(Context context, AdRequestInfoParcel adrequestinfoparcel, aej aej, aeb aeb1)
    {
        f = false;
        c = context;
        a = adrequestinfoparcel;
        b = aej;
        e = aeb1;
    }

    public final aef a(long l)
    {
        Iterator iterator;
        of.a("Starting mediation.");
        iterator = e.a.iterator();
_L4:
        aea aea1;
        Iterator iterator1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_233;
        }
        aea1 = (aea)iterator.next();
        of.c((new StringBuilder("Trying mediation network: ")).append(aea1.b).toString());
        iterator1 = aea1.c.iterator();
_L2:
        String s;
label0:
        {
            if (!iterator1.hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
            s = (String)iterator1.next();
            aef aef1;
            synchronized (d)
            {
                if (!f)
                {
                    break label0;
                }
                aef1 = new aef(-1);
            }
            return aef1;
        }
        g = new aee(c, s, b, e, aea1, a.c, a.d, a.k);
        obj;
        JVM INSTR monitorexit ;
        obj = g.a(l);
        if (((aef) (obj)).a == 0)
        {
            of.a("Adapter succeeded.");
            return ((aef) (obj));
        }
        break MISSING_BLOCK_LABEL_207;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        if (((aef) (obj)).c != null)
        {
            ajc.a.post(new _cls1(((aef) (obj))));
        }
        if (true) goto _L2; else goto _L1
_L1:
        if (true) goto _L4; else goto _L3
_L3:
        return new aef(1);
    }

    public final void a()
    {
        synchronized (d)
        {
            f = true;
            if (g != null)
            {
                g.a();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    /* member class not found */
    class _cls1 {}

}

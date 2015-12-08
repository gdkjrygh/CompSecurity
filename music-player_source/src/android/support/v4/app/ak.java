// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package android.support.v4.app:
//            af, am, ad, aa, 
//            ac, ae, ab

final class ak
    implements af
{

    ak()
    {
    }

    public final Notification a(ad ad1)
    {
        am am1;
        am1 = new am(ad1.a, ad1.r, ad1.b, ad1.c, ad1.h, ad1.f, ad1.i, ad1.d, ad1.e, ad1.g, ad1.n, ad1.o, ad1.p, ad1.k, ad1.j, ad1.m);
        aa aa1;
        for (Iterator iterator = ad1.q.iterator(); iterator.hasNext(); am1.a(aa1.a, aa1.b, aa1.c))
        {
            aa1 = (aa)iterator.next();
        }

        if (ad1.l == null) goto _L2; else goto _L1
_L1:
        if (!(ad1.l instanceof ac)) goto _L4; else goto _L3
_L3:
        ad1 = (ac)ad1.l;
        am1.a(((ac) (ad1)).d, ((ac) (ad1)).f, ((ac) (ad1)).e, ((ac) (ad1)).a);
_L2:
        return am1.a();
_L4:
        if (ad1.l instanceof ae)
        {
            ad1 = (ae)ad1.l;
            am1.a(((ae) (ad1)).d, ((ae) (ad1)).f, ((ae) (ad1)).e, ((ae) (ad1)).a);
        } else
        if (ad1.l instanceof ab)
        {
            ad1 = (ab)ad1.l;
            am1.a(((ab) (ad1)).d, ((ab) (ad1)).f, ((ab) (ad1)).e, ((ab) (ad1)).a, ((ab) (ad1)).b, ((ab) (ad1)).c);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package android.support.v4.app:
//            ar, az, ap, am, 
//            ao, aq, an

class av
    implements ar
{

    av()
    {
    }

    public Notification a(ap ap1)
    {
        az az1;
        az1 = new az(ap1.a, ap1.r, ap1.b, ap1.c, ap1.h, ap1.f, ap1.i, ap1.d, ap1.e, ap1.g, ap1.n, ap1.o, ap1.p, ap1.k, ap1.j, ap1.m);
        am am1;
        for (Iterator iterator = ap1.q.iterator(); iterator.hasNext(); az1.a(am1.a, am1.b, am1.c))
        {
            am1 = (am)iterator.next();
        }

        if (ap1.l == null) goto _L2; else goto _L1
_L1:
        if (!(ap1.l instanceof ao)) goto _L4; else goto _L3
_L3:
        ap1 = (ao)ap1.l;
        az1.a(((ao) (ap1)).b, ((ao) (ap1)).d, ((ao) (ap1)).c, ((ao) (ap1)).a);
_L2:
        return az1.a();
_L4:
        if (ap1.l instanceof aq)
        {
            ap1 = (aq)ap1.l;
            az1.a(((aq) (ap1)).b, ((aq) (ap1)).d, ((aq) (ap1)).c, ((aq) (ap1)).a);
        } else
        if (ap1.l instanceof an)
        {
            ap1 = (an)ap1.l;
            az1.a(((an) (ap1)).b, ((an) (ap1)).d, ((an) (ap1)).c, ((an) (ap1)).a);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }
}

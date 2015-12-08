// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;

public final class ntj extends nzc
{

    private static final String a = ntn.a(ntj);
    private final int b;
    private final mmv c;
    private final ArrayList d;
    private final nqx e;

    public ntj(Context context, int i, ArrayList arraylist, nqx nqx)
    {
        super(context, new nyg(context, i), "notificationsack", new pcd(), new pce());
        d = arraylist;
        e = nqx;
        b = i;
        c = (mmv)olm.a(context, mmv);
    }

    private long a(long l)
    {
        this;
        JVM INSTR monitorenter ;
        long l1;
        l1 = c.a(b).a("NotificationsAckOperationTag", 0L);
        long l2 = Math.max(l1, l);
        c.b(b).b("NotificationsAckOperationTag", l2).d();
        ntn.b(a, String.format("lastAckVersion with Account Id %d is: %d. maxAckVersion from MonitorPayloads is: %d", new Object[] {
            Integer.valueOf(b), Long.valueOf(l1), Long.valueOf(l)
        }));
        this;
        JVM INSTR monitorexit ;
        return l1;
        Exception exception;
        exception;
        throw exception;
    }

    private static long a(ArrayList arraylist)
    {
        arraylist = arraylist.iterator();
        long l;
        long l1;
label0:
        for (l = 0L; arraylist.hasNext(); l = l1)
        {
            oyk oyk1 = (oyk)((oyi)arraylist.next()).a(oyk.a);
            if (oyk1 != null)
            {
                oyj aoyj[] = oyk1.b;
                int j = aoyj.length;
                int i = 0;
                do
                {
                    l1 = l;
                    if (i >= j)
                    {
                        continue label0;
                    }
                    l = Math.max(aoyj[i].a.longValue(), l);
                    i++;
                } while (true);
            }
            l1 = l;
        }

        return l;
    }

    protected final void a(qlw qlw)
    {
        qlw = (pcd)qlw;
        pid pid1 = new pid();
        ArrayList arraylist = new ArrayList();
        Object obj = d.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            oyc oyc1 = (oyc)((Iterator) (obj)).next();
            if (oyc1.i != null)
            {
                arraylist.add(oyc1.i);
            }
        } while (true);
        pid1.a = (oyi[])arraylist.toArray(new oyi[arraylist.size()]);
        obj = new pie();
        ntl.a(g);
        obj.a = ntl.a(e);
        pid1.b = ((pie) (obj));
        pid1.c = Long.valueOf(a(a(arraylist)));
        qlw.a = pid1;
    }

}

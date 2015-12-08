// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Process;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class nlh extends Thread
{

    final nlm a;
    final noz b;
    volatile boolean c;
    volatile nlg d;
    volatile boolean e;
    private final nlm f;
    private final nlj g[];
    private final Context h;
    private final List i;
    private final noz j;
    private boolean k;

    public nlh(Context context, boolean flag, nlm nlm1, nlm nlm2, nlj anlj[], Class class1, noz noz1, 
            noz noz2)
    {
        super("allphotos_local_media_sync");
        h = context;
        k = flag;
        f = nlm1;
        a = nlm2;
        g = anlj;
        i = olm.c(context, class1);
        j = noz1;
        b = noz2;
    }

    private void a(nlg nlg1)
    {
        int l;
        int i1;
        d = nlg1;
        nlg1 = g;
        i1 = nlg1.length;
        l = 0;
_L2:
        Object obj;
        nlj nlj;
        Context context1;
        if (l >= i1)
        {
            break; /* Loop/switch isn't completed */
        }
        nlj = nlg1[l];
        obj = d;
        context1 = h;
        boolean flag = k;
        obj;
        JVM INSTR monitorenter ;
        obj.e = true;
        obj.d = System.currentTimeMillis() / 1000L;
        obj.f = new nlr(context1, ((nlg) (obj)).a.a, ((nlg) (obj)).a.b, flag, ((nlg) (obj)).c, ((nlg) (obj)).b, nlj);
        obj;
        JVM INSTR monitorexit ;
        obj = ((nlg) (obj)).f;
        long l1 = noy.a();
        nlt nlt1 = ((nlr) (obj)).a();
        if (((nlr) (obj)).g.a())
        {
            noy.a(((nlr) (obj)).c);
            noy.a("inserted and/or updated", Integer.valueOf(nlt1.a));
            noy.a("removed", Integer.valueOf(nlt1.b));
            noy.a("uri", ((nlr) (obj)).b);
            noy.a("cancelled", Boolean.valueOf(((nlr) (obj)).h));
            noy.a("last scan", Long.valueOf(((nlr) (obj)).f));
            noy.a("now", Long.valueOf(System.currentTimeMillis()));
            noy.a("duration", l1);
        }
        l++;
        if (true) goto _L2; else goto _L1
        nlg1;
        obj;
        JVM INSTR monitorexit ;
        throw nlg1;
_L1:
        if (!k && !c)
        {
            nlg1 = a;
            nlg nlg2 = d;
            Context context = ((nlm) (nlg1)).a;
            nlq nlq1 = nlg2.a;
            long l2 = nlg2.d;
            String s = nlm.b(nlq1.a);
            nlm.b(context, nlq1.b).b(s, l2).d();
            context = ((nlm) (nlg1)).a;
            nlq1 = nlg2.a;
            l2 = ((nlp)((nlm) (nlg1)).b.get(nlg2.a)).a;
            nlg1 = nlm.a(nlq1.a);
            nlm.b(context, nlq1.b).b(nlg1, l2).d();
            if (b.a())
            {
                noy.a("MediaStoreTokenMapKey", d.a.toString());
                noy.a("lastMod", Long.valueOf(d.d));
            }
        }
        return;
    }

    public final void run()
    {
        Process.setThreadPriority(10);
        if (c) goto _L2; else goto _L1
_L1:
        Object obj;
        Iterator iterator;
        long l1;
        obj = a.a(f);
        l1 = noy.a();
        iterator = ((nlc) (obj)).b().iterator();
        int l = 0;
_L10:
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        nlg nlg1 = (nlg)iterator.next();
        if (!c) goto _L6; else goto _L5
_L5:
        if (b.a())
        {
            (new StringBuilder(44)).append("cancelled, returning, total run: ").append(l);
        }
_L8:
        if (!c)
        {
            obj = ((nlc) (obj)).a();
            if (!k)
            {
                a.b();
            }
            if (i != null)
            {
                for (Iterator iterator1 = i.iterator(); iterator1.hasNext(); ((nll)iterator1.next()).a(((List) (obj)))) { }
            }
        }
          goto _L2
        obj;
        e = true;
        throw obj;
_L6:
        a(nlg1);
        l++;
        continue; /* Loop/switch isn't completed */
_L4:
        if (!j.a()) goto _L8; else goto _L7
_L7:
        noy.a("duration", l1);
        noy.a("cancelled", Boolean.valueOf(c));
        noy.a("updated uris and accounts", ((nlc) (obj)).toString());
          goto _L8
_L2:
        e = true;
        return;
        if (true) goto _L10; else goto _L9
_L9:
    }
}

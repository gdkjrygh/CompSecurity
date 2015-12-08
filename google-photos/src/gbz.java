// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.Iterator;
import java.util.List;

final class gbz
    implements hqf
{

    private final Context a;
    private final noz b;

    gbz(Context context)
    {
        a = context;
        b = noz.a(context, 3, "MediaSyncBgJob", new String[] {
            "sync"
        });
    }

    public final String a()
    {
        return "MediaSyncJob";
    }

    public final void a(int i, hqo hqo)
    {
        if (i != -1) goto _L2; else goto _L1
_L1:
        return;
_L2:
        long l;
        long l1;
        long l2;
        hqo = new gbt(a, i, hqo);
        l2 = noy.a();
        if (((gbt) (hqo)).b.a())
        {
            int j = ((gbt) (hqo)).d.size();
            Iterator iterator = ((gbt) (hqo)).d.iterator();
            for (i = 0; iterator.hasNext(); i = ((gbq)iterator.next()).a().size() + i) { }
            noy.a(((gbt) (hqo)).c);
            noy.a("providers", Integer.valueOf(j));
            noy.a("sizes", Integer.valueOf(i));
        }
        Iterator iterator1 = ((gbt) (hqo)).d.iterator();
        l = 0L;
        while (iterator1.hasNext()) 
        {
            gbq gbq1 = (gbq)iterator1.next();
            if (gbq1.b(((gbt) (hqo)).c))
            {
                for (Iterator iterator2 = gbq1.a().iterator(); iterator2.hasNext();)
                {
                    gbr gbr1 = (gbr)iterator2.next();
                    if (((gbt) (hqo)).e.a())
                    {
                        break; /* Loop/switch isn't completed */
                    }
                    Context context = ((gbt) (hqo)).a;
                    i = gbr1.c;
                    ekq ekq = gbq1.a(((gbt) (hqo)).c);
                    l += (new gby(context, ((gbt) (hqo)).c, ekq, i, gbr1.a, gbr1.b, ((gbt) (hqo)).e)).a();
                    hqo.g = ((gbt) (hqo)).g + 1;
                }

                hqo.f = ((gbt) (hqo)).f + 1;
            }
        }
        l1 = l;
        if (((gbt) (hqo)).f > 0)
        {
            ((gbt) (hqo)).e.b();
            l1 = l;
        }
_L4:
        if (((gbt) (hqo)).b.a())
        {
            noy.a("duration", l2);
            noy.a(((gbt) (hqo)).c);
            noy.a("run providers", Integer.valueOf(((gbt) (hqo)).f));
            noy.a("run sizes", Integer.valueOf(((gbt) (hqo)).g));
            noy.a(((gbt) (hqo)).a, l1);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        l1 = l;
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.List;

final class glh
    implements Runnable
{

    private final int a;
    private final gli b;
    private final int c;
    private final noz d;
    private final gld e;
    private final gly f;
    private final ekk g;
    private final ehr h;
    private final int i;

    public glh(Context context, int j, int k, ehr ehr, int l, gli gli1, gld gld1, 
            gly gly1, ekk ekk)
    {
        h = ehr;
        i = l;
        g = ekk;
        c = j;
        a = k;
        b = gli1;
        e = gld1;
        f = (gly)p.a(gly1);
        d = noz.a(context, 3, "MediaPage", new String[0]);
    }

    private Object a(int j)
    {
        Object obj;
        Object obj1;
        obj1 = f.a(h, j);
        obj = null;
        obj1 = ((elb) (obj1)).a();
        obj = obj1;
_L2:
        return obj;
        eke eke1;
        eke1;
        if (d.a())
        {
            noy.a("key", h);
            noy.a("position", Integer.valueOf(j));
            return null;
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    private List a(Object obj, int j)
    {
        int k = e.a;
        int l = a;
        obj = f.a(h, obj, j, k * l, g);
        try
        {
            obj = (List)((elb) (obj)).a();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            if (d.a())
            {
                noy.a("page", Integer.valueOf(c));
                noy.a("features", g);
            }
            return null;
        }
        return ((List) (obj));
    }

    public final void run()
    {
        int j = 1;
        int k = 0;
        iwf.a("PageRetriver Run");
        long l1 = noy.a();
        gld gld1 = e;
        int l = c;
        l = gld1.a * l;
        Object obj = a(l);
        if (obj != null)
        {
            long l2 = noy.a();
            List list = a(obj, l);
            if (list != null)
            {
                if (d.a())
                {
                    noy.a("items", obj);
                    noy.a("key", h);
                    noy.a("page", Integer.valueOf(c));
                    noy.a("total items", Integer.valueOf(list.size()));
                    noy.b("start items time", l2 - l1);
                    noy.a("total runtime", l1);
                }
                int i1 = list.size() / e.a;
                if (list.size() % e.a == 0)
                {
                    j = 0;
                }
                for (; k < j + i1; k++)
                {
                    int j1 = e.a * k;
                    int k1 = Math.min((k + 1) * e.a, list.size());
                    if (k1 < j1)
                    {
                        throw new IllegalArgumentException((new StringBuilder(61)).append("cannot load page: ").append(k).append(" from ").append(j1).append(" to ").append(k1).toString());
                    }
                    List list1 = list.subList(j1, k1);
                    b.a(c + k, h, list1, i);
                }

                iwf.a();
                return;
            }
        }
    }
}

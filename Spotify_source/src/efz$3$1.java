// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;
import java.util.Map;

final class g.Object
    implements egc
{

    private egk a;
    private b b;

    public final void a(boolean flag)
    {
        if (flag)
        {
            b.b.b.put(b.b, a);
            return;
        } else
        {
            b.b.b.remove(b.b);
            return;
        }
    }

    ( , egk egk)
    {
        b = ;
        a = egk;
        super();
    }

    // Unreferenced inner class efz$3

/* anonymous class */
    final class efz._cls3
        implements ebg
    {

        final String a;
        final efz b;
        private String c;
        private String d;

        public final void a(Throwable throwable)
        {
        }

        public final void a(List list)
        {
            list = efz.a(list);
            list = efz.a(b, list, c, d);
            b.a.a(list, new efz._cls3._cls1(this, list));
        }

            
            {
                b = efz1;
                c = s;
                d = s1;
                a = s2;
                super();
            }
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class dwq
{

    final dwr a;
    final Set b = new HashSet();
    private final dws c = new dws() {

        private dwq a;

        public final void a()
        {
            Object obj;
            for (Iterator iterator = a.b.iterator(); iterator.hasNext(); a.a.a(obj))
            {
                obj = iterator.next();
            }

        }

        public final void b()
        {
            if (a.a.a())
            {
                Object obj;
                for (Iterator iterator = a.b.iterator(); iterator.hasNext(); a.a.b(obj))
                {
                    obj = iterator.next();
                }

            }
        }

            
            {
                a = dwq.this;
                super();
            }
    };

    public dwq(dwr dwr1)
    {
        a = dwr1;
        dwr1.a(c);
    }
}

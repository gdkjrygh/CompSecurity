// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.q;

import com.google.android.m4b.maps.h.k;
import com.google.android.m4b.maps.h.l;
import com.google.android.m4b.maps.o.f;
import com.google.android.m4b.maps.o.p;
import com.google.android.m4b.maps.o.q;

// Referenced classes of package com.google.android.m4b.maps.q:
//            i, h, p, f, 
//            j, l

public final class d
    implements f
{
    static abstract class a extends com.google.android.m4b.maps.o.v.a
    {

        public final l a(com.google.android.m4b.maps.h.q q)
        {
            return q;
        }

        public a(com.google.android.m4b.maps.h.d d1)
        {
            super(d1);
        }
    }


    public d()
    {
    }

    public final k a(com.google.android.m4b.maps.h.d d1, p p, q q)
    {
        return d1.b(new a(d1, p, q) {

            private p b;
            private q c;
            private d d;

            protected final void a(com.google.android.m4b.maps.h.b.a a1)
            {
                Object obj1 = (i)a1;
                p p1 = b;
                Object obj = c;
                synchronized (((i) (obj1)).e)
                {
                    obj1 = ((i) (obj1)).e;
                    ((h) (obj1)).a.a();
                    obj = ((h) (obj1)).a(((q) (obj)));
                    ((com.google.android.m4b.maps.q.f)((h) (obj1)).a.b()).a(l.a(j.a(p1), ((com.google.android.m4b.maps.o.n) (obj))));
                }
                a(((l) (com.google.android.m4b.maps.h.q.a)));
                return;
                exception;
                a1;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                d = d.this;
                b = p1;
                c = q1;
                super(d2);
            }
        });
    }
}

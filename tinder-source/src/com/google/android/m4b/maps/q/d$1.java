// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.q;

import com.google.android.m4b.maps.h.d;
import com.google.android.m4b.maps.h.q;
import com.google.android.m4b.maps.o.p;

// Referenced classes of package com.google.android.m4b.maps.q:
//            d, i, h, p, 
//            f, j, l

final class <init> extends <init>
{

    private p b;
    private com.google.android.m4b.maps.o.q c;
    private com.google.android.m4b.maps.q.d d;

    protected final void a(com.google.android.m4b.maps.h.t> t>)
    {
        Object obj1 = (i)t>;
        p p1 = b;
        Object obj = c;
        synchronized (((i) (obj1)).e)
        {
            obj1 = ((i) (obj1)).e;
            ((h) (obj1)).a.a();
            obj = ((h) (obj1)).a(((com.google.android.m4b.maps.o.q) (obj)));
            ((f)((h) (obj1)).a.b()).a(l.a(j.a(p1), ((com.google.android.m4b.maps.o.n) (obj))));
        }
        a(((com.google.android.m4b.maps.h.l) (q.a)));
        return;
        exception;
        t>;
        JVM INSTR monitorexit ;
        throw exception;
    }

    (com.google.android.m4b.maps.q.d d1, d d2, p p1, com.google.android.m4b.maps.o.q q1)
    {
        d = d1;
        b = p1;
        c = q1;
        super(d2);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.b.a.a;

import com.google.android.apps.gsa.shared.exception.GsaIOException;
import com.google.android.apps.gsa.shared.io.b;
import com.google.android.apps.gsa.shared.io.c;
import com.google.android.apps.gsa.shared.io.d;
import com.google.android.apps.gsa.shared.io.k;
import com.google.android.apps.gsa.shared.io.l;
import com.google.android.apps.gsa.shared.io.o;
import com.google.common.base.p;
import com.google.common.base.s;
import com.google.common.util.concurrent.t;
import com.google.common.util.concurrent.u;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.apps.gsa.b.a.a:
//            h, p, c, q, 
//            b, l

public abstract class a extends h
{

    protected a(Executor executor, k k, s s, b b1)
    {
        super(executor, k, s, b1);
    }

    static void a(a a1, com.google.android.apps.gsa.b.a.a.p p1, l l, d d1, c c1)
    {
        com.google.android.apps.gsa.shared.io.a a2 = null;
        int i = d1.b();
        if (i != -1) goto _L2; else goto _L1
_L1:
        l = ((l) (a1.a(l, c1)));
        byte abyte0[];
        Object obj;
        abyte0 = a1.d.b();
        obj = ByteBuffer.wrap(abyte0);
_L8:
        a2 = (com.google.android.apps.gsa.shared.io.a)com.google.android.apps.gsa.shared.util.a.d.a(Arrays.asList(new t[] {
            d1.a(), p1.e
        })).get(10000L, TimeUnit.MILLISECONDS);
        if (a2.b != 3) goto _L4; else goto _L3
_L3:
        a1.a(l, abyte0, 0, true, c1);
        a2.a();
        a1.d.a(abyte0);
        d1 = a1.a(l, c1);
        l = d1;
_L11:
        a2 = null;
        p1.a.a(((com.google.android.apps.gsa.b.a.a.c) (l)).b);
        obj = a1.a(((com.google.android.apps.gsa.b.a.a.c) (l)).a, ((com.google.android.apps.gsa.b.a.a.c) (l)).b, c1);
_L6:
        abyte0 = (com.google.android.apps.gsa.shared.io.a)com.google.android.apps.gsa.shared.util.a.d.a(p1.e);
        d1 = abyte0;
        if (abyte0 != null)
        {
            break MISSING_BLOCK_LABEL_214;
        }
        d1 = a1.d.a(((InputStream) (obj)));
        if (((com.google.android.apps.gsa.shared.io.a) (d1)).b == 2)
        {
            d1 = new com.google.android.apps.gsa.shared.io.a(a1.a(d1.b(), c1));
        }
        p1.d.a(d1);
        i = ((com.google.android.apps.gsa.shared.io.a) (d1)).b;
        if (i == 1) goto _L6; else goto _L5
_L5:
        if (l != null)
        {
            a1.b(((com.google.android.apps.gsa.b.a.a.c) (l)).a);
        }
        return;
_L4:
        if (a2.b == 2)
        {
            throw a2.b();
        }
          goto _L7
        p1;
        a2.a();
        throw p1;
        p1;
        d1 = l;
        l = null;
_L14:
        if (d1 != null)
        {
            a1.a(d1);
        }
        if (l != null)
        {
            a1.b(((com.google.android.apps.gsa.b.a.a.c) (l)).a);
        }
        throw p1;
_L7:
        a2.a(((ByteBuffer) (obj)));
        boolean flag;
        if (a2.c() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag);
        a1.a(l, abyte0, ((ByteBuffer) (obj)).position(), false, c1);
        ((ByteBuffer) (obj)).clear();
        a2.a();
          goto _L8
_L2:
        if (i != 0) goto _L10; else goto _L9
_L9:
        d1 = null;
_L12:
        l = a1.a(l, ((byte []) (d1)), c1);
          goto _L11
_L10:
        obj = ByteBuffer.allocate(i);
_L13:
        com.google.android.apps.gsa.shared.io.a a3 = (com.google.android.apps.gsa.shared.io.a)com.google.android.apps.gsa.shared.util.a.d.a(Arrays.asList(new t[] {
            d1.a(), p1.e
        })).get(10000L, TimeUnit.MILLISECONDS);
        int j = a3.b;
        if (j != 3)
        {
            break MISSING_BLOCK_LABEL_470;
        }
        a3.a();
        if (((ByteBuffer) (obj)).position() == i)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag);
        d1 = ((ByteBuffer) (obj)).array();
          goto _L12
        a3.a(((ByteBuffer) (obj)));
        a3.a();
          goto _L13
        p1;
        a3.a();
        throw p1;
        p1;
        d1 = a2;
          goto _L14
        p1;
        l = null;
        d1 = a2;
          goto _L14
    }

    protected abstract com.google.android.apps.gsa.b.a.a.c a(l l, byte abyte0[], c c1);

    protected abstract com.google.android.apps.gsa.b.a.a.c a(Object obj, c c1);

    protected final com.google.android.apps.gsa.b.a.a.l a(l l, d d1, c c1)
    {
        Object obj = u.a();
        q q1 = new q();
        obj = new com.google.android.apps.gsa.b.a.a.p(((u) (obj)), q1);
        a.execute(new com.google.android.apps.gsa.b.a.a.b(this, ((com.google.android.apps.gsa.b.a.a.p) (obj)), l, d1, c1, q1));
        return ((com.google.android.apps.gsa.b.a.a.l) (obj));
    }

    protected abstract GsaIOException a(IOException ioexception, c c1);

    protected abstract InputStream a(Object obj, o o, c c1);

    protected abstract Object a(l l, c c1);

    protected abstract void a(Object obj);

    protected abstract void a(Object obj, byte abyte0[], int i, boolean flag, c c1);

    protected abstract void b(Object obj);
}

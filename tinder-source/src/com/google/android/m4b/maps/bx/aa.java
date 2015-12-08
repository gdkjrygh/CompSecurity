// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bx;

import com.google.android.m4b.maps.bi.b;
import com.google.android.m4b.maps.bm.d;
import com.google.android.m4b.maps.cc.h;
import java.util.Iterator;
import java.util.List;
import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.google.android.m4b.maps.bx:
//            r, ab, i

public final class aa extends r
{

    List a;

    public aa()
    {
    }

    public final void a(d d1, b b, ab ab1)
    {
        if (ab1.b > 0 || ab1.a == i.f || a == null || a.isEmpty())
        {
            return;
        }
        d1.c();
        d1.a.glBlendFunc(1, 771);
        d1.a.glTexEnvx(8960, 8704, 8448);
        this;
        JVM INSTR monitorenter ;
        for (Iterator iterator = a.iterator(); iterator.hasNext(); d1.g())
        {
            h h1 = (h)iterator.next();
            d1.f();
            h1.a(d1, b, ab1);
        }

        break MISSING_BLOCK_LABEL_131;
        d1;
        this;
        JVM INSTR monitorexit ;
        throw d1;
        this;
        JVM INSTR monitorexit ;
    }

    public final boolean a(b b, d d1)
    {
        return true;
    }

    public final r.a d()
    {
        return r.a.l;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.f.a;

import com.kik.g.p;
import com.kik.g.r;

// Referenced classes of package kik.android.f.a:
//            f

final class g extends r
{

    final int a;
    final p b;
    final f c;

    g(f f, int i, p p1)
    {
        c = f;
        a = i;
        b = p1;
        super();
    }

    public final void a(Object obj)
    {
        if (((Long)obj).longValue() < (long)a)
        {
            b.a(null);
            return;
        } else
        {
            b.a(new IllegalArgumentException("Image too large."));
            return;
        }
    }
}

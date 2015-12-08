// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.b;

import com.kik.g.p;
import com.kik.g.r;
import java.util.Map;

// Referenced classes of package kik.android.b:
//            f, a

final class e extends r
{

    final p a;
    final p b;
    final a c;

    e(a a1, p p1, p p2)
    {
        c = a1;
        a = p1;
        b = p2;
        super();
    }

    public final void a(Object obj)
    {
        obj = (Map)obj;
        a.a(new f(this, ((Map) (obj))));
    }

    public final void a(Throwable throwable)
    {
        b.a(throwable);
    }
}

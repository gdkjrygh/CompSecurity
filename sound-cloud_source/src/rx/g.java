// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx;

import rx.b.f;

// Referenced classes of package rx:
//            b

final class g
    implements f
{

    final Class a;
    final b b;

    g(b b1, Class class1)
    {
        b = b1;
        a = class1;
        super();
    }

    public final Object call(Object obj)
    {
        return Boolean.valueOf(a.isInstance(obj));
    }
}

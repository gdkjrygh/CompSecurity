// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import rx.b;
import rx.b.f;

// Referenced classes of package rx.internal.a:
//            w, G

public static final class a
    implements f
{

    final long a;

    public final Object call(Object obj)
    {
        return ((b)obj).map(new G(this)).dematerialize();
    }

    public (long l)
    {
        a = l;
    }
}

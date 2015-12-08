// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx;

import rx.b.e;

// Referenced classes of package rx:
//            b

final class s
    implements e
{

    final b a;

    s(b b1)
    {
        a = b1;
        super();
    }

    public final Object call()
    {
        return a.replay();
    }
}

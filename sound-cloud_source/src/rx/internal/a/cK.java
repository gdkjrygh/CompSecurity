// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import rx.b.f;
import rx.b.g;

public final class cK
    implements g
{

    final f a;

    public cK(f f1)
    {
        a = f1;
        super();
    }

    public final volatile Object call(Object obj, Object obj1)
    {
        return (Boolean)a.call(obj);
    }
}

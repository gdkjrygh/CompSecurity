// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.c;

import rx.b;

public final class d extends b
{

    private final Object a;

    private d(Object obj, rx.b.f f)
    {
        super(f);
        a = obj;
    }

    public static final d a(Object obj, rx.b.f f)
    {
        return new d(obj, f);
    }
}

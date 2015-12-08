// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util.a;

import java.util.concurrent.atomic.AtomicReference;

public final class a extends AtomicReference
{

    public Object a;

    public a()
    {
    }

    public a(Object obj)
    {
        a = obj;
    }

    public final Object a()
    {
        Object obj = a;
        a = null;
        return obj;
    }
}

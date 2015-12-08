// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.atomic.AtomicReference;

public final class bul extends bui
{

    public bul(String s)
    {
        super(s);
    }

    public final void a(Object obj)
    {
        if (obj == null)
        {
            obj = a;
        } else
        {
            obj = obj.toString();
        }
        super.b.set(b.a(obj, "description", null));
    }
}

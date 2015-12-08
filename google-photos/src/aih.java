// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.reflect.Array;

public final class aih extends aig
{

    aih(agu agu)
    {
        super(agu);
    }

    public final void b(Object obj)
    {
        super.a(obj);
    }

    public final Object n()
    {
        Object obj = super.m();
        if (obj == null || obj.getClass().isArray())
        {
            return super.m();
        } else
        {
            Object aobj[] = (Object[])Array.newInstance(obj.getClass(), 1);
            aobj[0] = obj;
            return ((Object) (aobj));
        }
    }
}

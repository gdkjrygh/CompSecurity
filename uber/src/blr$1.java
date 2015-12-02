// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.reflect.GenericArrayType;

final class 
    implements bkr
{

    public final bkq create(bjw bjw1, bmj bmj1)
    {
        bmj1 = bmj1.getType();
        if (!(bmj1 instanceof GenericArrayType) && (!(bmj1 instanceof Class) || !((Class)bmj1).isArray()))
        {
            return null;
        } else
        {
            bmj1 = bky.d(bmj1);
            return new blr(bjw1, bjw1.a(bmj.get(bmj1)), bky.b(bmj1));
        }
    }

    ()
    {
    }
}

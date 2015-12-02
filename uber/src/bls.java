// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;

public final class bls
    implements bkr
{

    private final blc a;

    public bls(blc blc1)
    {
        a = blc1;
    }

    public final bkq create(bjw bjw1, bmj bmj1)
    {
        java.lang.reflect.Type type = bmj1.getType();
        Class class1 = bmj1.getRawType();
        if (!java/util/Collection.isAssignableFrom(class1))
        {
            return null;
        } else
        {
            type = bky.a(type, class1);
            return new blt(bjw1, type, bjw1.a(bmj.get(type)), a.a(bmj1));
        }
    }
}

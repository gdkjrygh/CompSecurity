// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.EnumSet;

public class hwd
    implements hzv
{

    public boolean a;

    public hwd()
    {
        a = false;
    }

    public final EnumSet a()
    {
        EnumSet enumset = EnumSet.of(hzz.a, hzz.b, hzz.c);
        if (a)
        {
            enumset.add(hzz.h);
        }
        return enumset;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.reflect.Field;

public final class mzj
{

    public final String a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final String f;

    public mzj(String s, int i, boolean flag, boolean flag1, boolean flag2, String s1, Field field, 
            int j)
    {
        a = s.toLowerCase();
        b = i;
        c = flag;
        d = flag1;
        e = flag2;
        f = s1;
        field.setAccessible(true);
    }
}

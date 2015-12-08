// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;

final class ltk extends lqd
{

    private static final String b;

    public ltk()
    {
        super(b, new String[0]);
    }

    public final ksp a(Map map)
    {
        return ltw.a(Integer.valueOf(android.os.Build.VERSION.SDK_INT));
    }

    public final boolean b()
    {
        return true;
    }

    static 
    {
        b = kse.r.toString();
    }
}

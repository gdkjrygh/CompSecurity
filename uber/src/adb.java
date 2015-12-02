// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;

public final class adb
    implements acu
{

    private final adc a;

    public adb(adc adc1)
    {
        a = adc1;
    }

    public final void a(akk akk, Map map)
    {
        boolean flag = "1".equals(map.get("transparentBackground"));
        a.b(flag);
    }
}

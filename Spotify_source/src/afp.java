// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class afp extends agq
{

    private final aha a;

    public afp(String s, int i, aha aha)
    {
        super((new StringBuilder()).append(s).append(":").append(i).toString());
        b.b("InternalButton set %s:%d", new Object[] {
            s, Integer.valueOf(i)
        });
        a = aha;
        ahu.a(a, ahb, 1);
    }
}

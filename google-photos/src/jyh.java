// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jyh
{

    final String a;
    private final jyi b;
    private final k c = null;
    private final jym d;
    private final b e = null;

    public jyh(String s, jyi jyi, jym jym)
    {
        b.f(jyi, "Cannot construct an Api with a null ClientBuilder");
        b.f(jym, "Cannot construct an Api with a null ClientKey");
        a = s;
        b = jyi;
        d = jym;
    }

    public final jyi a()
    {
        boolean flag;
        if (b != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b.a(flag, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return b;
    }

    public final jym b()
    {
        boolean flag;
        if (d != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b.a(flag, "This API was constructed with a SimpleClientKey. Use getSimpleClientKey");
        return d;
    }
}

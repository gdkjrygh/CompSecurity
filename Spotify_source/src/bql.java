// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class bql
{

    public final String a;
    private final bqq b;
    private final bqs c;

    public bql(String s, bqq bqq, bqs bqs)
    {
        btl.a(bqq, "Cannot construct an Api with a null ClientBuilder");
        btl.a(bqs, "Cannot construct an Api with a null ClientKey");
        a = s;
        b = bqq;
        c = bqs;
    }

    public final bqq a()
    {
        boolean flag;
        if (b != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        btl.a(flag, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return b;
    }

    public final bqs b()
    {
        boolean flag;
        if (c != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        btl.a(flag, "This API was constructed with a SimpleClientKey. Use getSimpleClientKey");
        return c;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lgu
{

    public static final jyh a;
    public static final lgr b = new lgr();
    private static final jym c;
    private static final jyi d;

    public static lhm a(jyn jyn1)
    {
        boolean flag1 = true;
        boolean flag;
        if (jyn1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b.b(flag, "GoogleApiClient parameter is required.");
        jyn1 = (lhm)jyn1.a(c);
        if (jyn1 != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        b.a(flag, "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.");
        return jyn1;
    }

    static 
    {
        c = new jym();
        d = new lgv();
        a = new jyh("LocationServices.API", d, c);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class aip
    implements ain
{

    private String a;
    private String b;
    private String c;
    private String d;

    public aip(String s, String s1, String s2, String s3)
    {
        a = s;
        b = s1;
        c = s2;
        d = s3;
    }

    public final void a(aio aio1)
    {
        Object obj = aio1.b;
        aio1 = a;
        String s = b;
        String s1 = c;
        String s2 = d;
        ahn ahn1 = ((ahr) (obj)).a(aio1);
        obj = ((ahr) (obj)).a(s1);
        if (ahn1 == null)
        {
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(aio1).length() + 18)).append("Unknown filter '").append(aio1).append("'!").toString());
        }
        if (obj == null)
        {
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(s1).length() + 18)).append("Unknown filter '").append(s1).append("'!").toString());
        } else
        {
            ahn1.a(s, ((ahn) (obj)), s2);
            return;
        }
    }
}

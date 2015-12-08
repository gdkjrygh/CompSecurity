// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public static final class a extends Enum
{

    private static e b;
    private static e c;
    private static e d;
    private static e e;
    private static final e g[];
    final String a;
    private final String f;

    public static ang.String a(String s)
    {
        if (s.matches("[0-9a-fA-F]+")) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        if (s.length() == 24)
        {
            return b;
        }
        if (s.length() == 40)
        {
            s = s.substring(s.length() - 8);
            ang.String as[] = values();
            int j = as.length;
            int i = 0;
            while (i < j) 
            {
                ring ring = as[i];
                if (s.equals(ring.f))
                {
                    return ring;
                }
                i++;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public static ang.String valueOf(String s)
    {
        return (f)Enum.valueOf(aad$a, s);
    }

    public static ang.String[] values()
    {
        return ([])g.clone();
    }

    static 
    {
        b = new <init>("US_WEST_1_PROD", 0, "00555300", "crittercism.com");
        c = new <init>("US_WEST_2_CI", 1, "00555304", "crit-ci.com");
        d = new <init>("US_WEST_2_STAGING", 2, "00555305", "crit-staging.com");
        e = new <init>("EU_CENTRAL_1", 3, "00444503", "eu.crittercism.com");
        g = (new g[] {
            b, c, d, e
        });
    }

    private (String s, int i, String s1, String s2)
    {
        super(s, i);
        f = s1;
        a = s2;
    }
}

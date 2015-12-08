// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f.g;


public final class c extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    public static final c d;
    private static final c e[];

    private c(String s, int i)
    {
        super(s, i);
    }

    public static c valueOf(String s)
    {
        return (c)Enum.valueOf(kik/a/f/g/c, s);
    }

    public static c[] values()
    {
        return (c[])e.clone();
    }

    static 
    {
        a = new c("PLAINTEXT", 0);
        b = new c("TLS", 1);
        c = new c("KIK56", 2);
        d = new c("TLS_INSECURE", 3);
        e = (new c[] {
            a, b, c, d
        });
    }
}

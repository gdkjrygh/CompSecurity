// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.msnp;


public final class MsnpLayer extends Enum
{

    public static final MsnpLayer a;
    public static final MsnpLayer b;
    public static final MsnpLayer c;
    public static final MsnpLayer d;
    public static final MsnpLayer e;
    private static final MsnpLayer g[];
    private String f;

    private MsnpLayer(String s, int i, String s1)
    {
        super(s, i);
        f = s1;
    }

    public static MsnpLayer valueOf(String s)
    {
        return (MsnpLayer)Enum.valueOf(com/skype/msnp/MsnpLayer, s);
    }

    public static MsnpLayer[] values()
    {
        return (MsnpLayer[])g.clone();
    }

    static 
    {
        a = new MsnpLayer("ROUTING", 0, "Routing");
        b = new MsnpLayer("RELIABILITY", 1, "Reliability");
        c = new MsnpLayer("MESSAGING", 2, "Messaging");
        d = new MsnpLayer("PUBLICATION", 3, "Publication");
        e = new MsnpLayer("NOTIFICATION", 4, "Notification");
        g = (new MsnpLayer[] {
            a, b, c, d, e
        });
    }
}

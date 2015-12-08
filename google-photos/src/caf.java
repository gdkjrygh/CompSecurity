// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class caf extends Enum
{

    public static final caf a;
    public static final caf b;
    public static final caf c;
    public static final caf d;
    private static final caf i[];
    public final boolean e;
    public final boolean f;
    public cad g;
    public boolean h;

    private caf(String s, int j, boolean flag, boolean flag1, boolean flag2, cad cad1)
    {
        super(s, j);
        e = flag;
        f = flag1;
        h = flag2;
        g = (cad)b.a(cad1, "nameProvider", null);
    }

    public static caf valueOf(String s)
    {
        return (caf)Enum.valueOf(caf, s);
    }

    public static caf[] values()
    {
        return (caf[])i.clone();
    }

    static 
    {
        a = new caf("NONE", 0, false, false, false, cad.a);
        b = new caf("TO_SHARE", 1, true, false, false, new bzu(c.bn));
        c = new caf("TO_EXPORT", 2, true, true, true, new bzn());
        d = new caf("TO_SHARE_PREVIEW", 3, true, false, false, new bzu(c.bo));
        i = (new caf[] {
            a, b, c, d
        });
    }
}

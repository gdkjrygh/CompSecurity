// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class efb extends Enum
{

    public static final efb a;
    public static final efb b;
    public static final efb c;
    public static final efb d;
    public static final efb e;
    public static final efb f;
    public static final efb g;
    public static final efb h;
    public static final efb i;
    private static final efb j[];

    private efb(String s, int k)
    {
        super(s, k);
    }

    public static efb valueOf(String s)
    {
        return (efb)Enum.valueOf(efb, s);
    }

    public static efb[] values()
    {
        return (efb[])j.clone();
    }

    static 
    {
        a = new efb("UNKNOWN", 0);
        b = new efb("AUTO_BACKUP_OFF", 1);
        c = new efb("BACKING_UP", 2);
        d = new efb("PROCESSING", 3);
        e = new efb("UP_TO_DATE", 4);
        f = new efb("OTHER_ACCOUNT", 5);
        g = new efb("PENDING_NETWORK", 6);
        h = new efb("PENDING_WIFI", 7);
        i = new efb("PENDING_POWER", 8);
        j = (new efb[] {
            a, b, c, d, e, f, g, h, i
        });
    }
}

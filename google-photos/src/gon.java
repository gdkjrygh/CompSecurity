// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gon extends Enum
{

    public static final gon a;
    public static final gon b;
    public static final gon c;
    public static final gon d;
    public static final gon e;
    public static final gon f;
    public static final gon g;
    private static final gon h[];

    private gon(String s, int i)
    {
        super(s, i);
    }

    public static gon valueOf(String s)
    {
        return (gon)Enum.valueOf(gon, s);
    }

    public static gon[] values()
    {
        return (gon[])h.clone();
    }

    static 
    {
        a = new gon("MAIN", 0);
        b = new gon("TRANSITION_TO_PHOTO", 1);
        c = new gon("SCALING_TO_PHOTO", 2);
        d = new gon("SCALING_FROM_PHOTO", 3);
        e = new gon("PHOTO", 4);
        f = new gon("DRAGGING_PHOTO", 5);
        g = new gon("TRANSITION_TO_MAIN", 6);
        h = (new gon[] {
            a, b, c, d, e, f, g
        });
    }
}

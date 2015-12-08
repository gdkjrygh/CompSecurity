// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hzz extends Enum
{

    public static final hzz a;
    public static final hzz b;
    public static final hzz c;
    public static final hzz d;
    public static final hzz e;
    public static final hzz f;
    public static final hzz g;
    public static final hzz h;
    public static final hzz i;
    private static final hzz k[];
    final int j;

    private hzz(String s, int l, int i1)
    {
        super(s, l);
        j = i1;
    }

    public static hzz valueOf(String s)
    {
        return (hzz)Enum.valueOf(hzz, s);
    }

    public static hzz[] values()
    {
        return (hzz[])k.clone();
    }

    static 
    {
        a = new hzz("Share", 0, p.aM);
        b = new hzz("CreateFlow", 1, p.aD);
        c = new hzz("MoveToTrash", 2, p.aH);
        d = new hzz("Restore", 3, p.aK);
        e = new hzz("DeleteDeviceCopy", 4, p.aF);
        f = new hzz("DeleteFromTrash", 5, p.aE);
        g = new hzz("RemoveFromAlbum", 6, p.aJ);
        h = new hzz("RemoveFromSearchResults", 7, p.aI);
        i = new hzz("SaveToLibrary", 8, p.aL);
        k = (new hzz[] {
            a, b, c, d, e, f, g, h, i
        });
    }
}

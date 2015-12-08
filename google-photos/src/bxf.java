// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class bxf extends Enum
{

    public static final bxf a;
    public static final bxf b;
    public static final bxf c;
    public static final bxf d;
    public static final bxf e;
    public static final bxf f;
    public static final bxf g;
    public static final bxf h;
    public static final bxf i;
    private static final bxf k[];
    final bxd j;

    private bxf(String s, int l, bxd bxd1)
    {
        super(s, l);
        j = bxd1;
    }

    public static bxf valueOf(String s)
    {
        return (bxf)Enum.valueOf(bxf, s);
    }

    public static bxf[] values()
    {
        return (bxf[])k.clone();
    }

    static 
    {
        a = new bxf("UNINITIALIZED", 0, bxd.a);
        b = new bxf("CLOUD_UNINITIALIZED", 1, bxd.b);
        c = new bxf("CLOUD_NO_EDIT", 2, bxd.b);
        d = new bxf("CLOUD_READY", 3, bxd.b);
        e = new bxf("PREVIEW_UNINITIALIZED", 4, bxd.c);
        f = new bxf("PREVIEW_DEAD", 5, bxd.c);
        g = new bxf("PREVIEW_NOT_EDITABLE", 6, bxd.c);
        h = new bxf("PREVIEW_EDIT_RECOVERABLE", 7, bxd.c);
        i = new bxf("PREVIEW_READY", 8, bxd.c);
        k = (new bxf[] {
            a, b, c, d, e, f, g, h, i
        });
    }
}

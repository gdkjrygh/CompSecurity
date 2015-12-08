// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cx;


// Referenced classes of package p.cx:
//            x

public static final class .String extends Enum
{

    public static final m a;
    public static final m b;
    public static final m c;
    public static final m d;
    public static final m e;
    public static final m f;
    public static final m g;
    public static final m h;
    public static final m i;
    public static final m j;
    public static final m k;
    public static final m l;
    public static final m m;
    private static final m n[];

    public static .String valueOf(String s)
    {
        return (.String)Enum.valueOf(p/cx/x$a, s);
    }

    public static .String[] values()
    {
        return (.String[])n.clone();
    }

    static 
    {
        a = new <init>("Clicked", 0);
        b = new <init>("Dismissed", 1);
        c = new <init>("Ignored", 2);
        d = new <init>("ErrorParseIntent", 3);
        e = new <init>("ErrorBuildContent", 4);
        f = new <init>("ErrorBuildFeedbackIntent", 5);
        g = new <init>("ErrorSetIcon", 6);
        h = new <init>("ErrorNotify", 7);
        i = new <init>("ErrorLoadBitmap", 8);
        j = new <init>("Received", 9);
        k = new <init>("Viewed", 10);
        l = new <init>("ErrorBitmapNoNetwork", 11);
        m = new <init>("ErrorInboxPayload", 12);
        n = (new n[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m
        });
    }

    private .String(String s, int i1)
    {
        super(s, i1);
    }
}

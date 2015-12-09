// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cp;


// Referenced classes of package p.cp:
//            d

public static final class .String extends Enum
{

    public static final j a;
    public static final j b;
    public static final j c;
    public static final j d;
    public static final j e;
    public static final j f;
    public static final j g;
    public static final j h;
    public static final j i;
    public static final j j;
    private static final j k[];

    public static .String valueOf(String s)
    {
        return (.String)Enum.valueOf(p/cp/d$a, s);
    }

    public static .String[] values()
    {
        return (.String[])k.clone();
    }

    static 
    {
        a = new <init>("PANDORA_APP", 0);
        b = new <init>("PANDORA_IPHONE_APP", 1);
        c = new <init>("PANDORA_BROWSER", 2);
        d = new <init>("PANDORA_SCHEME", 3);
        e = new <init>("PANDORA_INTERNAL_SCHEME", 4);
        f = new <init>("TELEPHONE", 5);
        g = new <init>("PANDORA_INTERNAL_SCHEME_OFFER_UPGRADE", 6);
        h = new <init>("PANDORA_START_VALUE_EXCHANGE", 7);
        i = new <init>("PANDORA_STAGE_OPEN_PAGE", 8);
        j = new <init>("PANDORA_STAGE_SCHEME", 9);
        k = (new k[] {
            a, b, c, d, e, f, g, h, i, j
        });
    }

    private .String(String s, int l)
    {
        super(s, l);
    }
}

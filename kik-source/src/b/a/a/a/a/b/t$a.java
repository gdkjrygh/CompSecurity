// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a.a.b;


// Referenced classes of package b.a.a.a.a.b:
//            t

public static final class h extends Enum
{

    public static final g a;
    public static final g b;
    public static final g c;
    public static final g d;
    public static final g e;
    public static final g f;
    public static final g g;
    private static final g i[];
    public final int h;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(b/a/a/a/a/b/t$a, s);
    }

    public static [] values()
    {
        return ([])i.clone();
    }

    static 
    {
        a = new <init>("WIFI_MAC_ADDRESS", 0, 1);
        b = new <init>("BLUETOOTH_MAC_ADDRESS", 1, 2);
        c = new <init>("FONT_TOKEN", 2, 53);
        d = new <init>("ANDROID_ID", 3, 100);
        e = new <init>("ANDROID_DEVICE_ID", 4, 101);
        f = new <init>("ANDROID_SERIAL", 5, 102);
        g = new <init>("ANDROID_ADVERTISING_ID", 6, 103);
        i = (new i[] {
            a, b, c, d, e, f, g
        });
    }

    private (String s, int j, int k)
    {
        super(s, j);
        h = k;
    }
}

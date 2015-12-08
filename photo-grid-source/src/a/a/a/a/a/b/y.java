// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.a.a.b;


public final class y extends Enum
{

    public static final y a;
    public static final y b;
    public static final y c;
    public static final y d;
    public static final y e;
    public static final y f;
    public static final y g;
    private static final y i[];
    public final int h;

    private y(String s, int j, int k)
    {
        super(s, j);
        h = k;
    }

    public static y valueOf(String s)
    {
        return (y)Enum.valueOf(a/a/a/a/a/b/y, s);
    }

    public static y[] values()
    {
        return (y[])i.clone();
    }

    static 
    {
        a = new y("WIFI_MAC_ADDRESS", 0, 1);
        b = new y("BLUETOOTH_MAC_ADDRESS", 1, 2);
        c = new y("FONT_TOKEN", 2, 53);
        d = new y("ANDROID_ID", 3, 100);
        e = new y("ANDROID_DEVICE_ID", 4, 101);
        f = new y("ANDROID_SERIAL", 5, 102);
        g = new y("ANDROID_ADVERTISING_ID", 6, 103);
        i = (new y[] {
            a, b, c, d, e, f, g
        });
    }
}

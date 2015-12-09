// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dj;


// Referenced classes of package p.dj:
//            b

public static final class l extends Enum
{

    public static final i a;
    public static final i b;
    public static final i c;
    public static final i d;
    public static final i e;
    public static final i f;
    public static final i g;
    public static final i h;
    public static final i i;
    private static final i m[];
    public int j;
    public String k;
    public .String l;

    public static .String valueOf(String s)
    {
        return (.String)Enum.valueOf(p/dj/b$a, s);
    }

    public static .String[] values()
    {
        return (.String[])m.clone();
    }

    static 
    {
        a = new <init>("NULL", 0, 29, "Null A/B Test");
        b = new <init>("MEDIA_STORE_DATA_COLLECTION", 1, 160, "Music Library");
        c = new <init>("NEW_USER_ONBOARDING", 2, 28, "New User Onboarding", a);
        d = new <init>("ENHANCED_PERSISTANT_NOTIFICATION", 3, 33, "Rich Notifications");
        e = new <init>("STATION_REC_PLACEMENT_A", 4, 129, "Station Rec Placement A");
        f = new <init>("STATION_REC_PLACEMENT_B", 5, 132, "Station Rec Placement B");
        g = new <init>("GOOGLE_AD_SDK", 6, 201, "Google Ad SDK");
        h = new <init>("ENHANCED_PERSISTANT_NOTIFICATION_V2", 7, 284, "Rich Notifications V2");
        i = new <init>("STATIONS_EXPERIENCE", 8, 0x7fffffff, "Stations Experience", d);
        m = (new m[] {
            a, b, c, d, e, f, g, h, i
        });
    }

    private .String(String s, int i1, int j1, String s1)
    {
        super(s, i1);
        j = j1;
        k = s1;
        l = c;
    }

    private .String(String s, int i1, int j1, String s1, .String s2)
    {
        super(s, i1);
        j = j1;
        k = s1;
        l = s2;
    }
}

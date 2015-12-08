// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dj;


public interface p.dj.b
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final a f;
        public static final a g;
        public static final a h;
        public static final a i;
        private static final a m[];
        public int j;
        public String k;
        public b l;

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(p/dj/b$a, s);
        }

        public static a[] values()
        {
            return (a[])m.clone();
        }

        static 
        {
            a = new a("NULL", 0, 29, "Null A/B Test");
            b = new a("MEDIA_STORE_DATA_COLLECTION", 1, 160, "Music Library");
            c = new a("NEW_USER_ONBOARDING", 2, 28, "New User Onboarding", b.a);
            d = new a("ENHANCED_PERSISTANT_NOTIFICATION", 3, 33, "Rich Notifications");
            e = new a("STATION_REC_PLACEMENT_A", 4, 129, "Station Rec Placement A");
            f = new a("STATION_REC_PLACEMENT_B", 5, 132, "Station Rec Placement B");
            g = new a("GOOGLE_AD_SDK", 6, 201, "Google Ad SDK");
            h = new a("ENHANCED_PERSISTANT_NOTIFICATION_V2", 7, 284, "Rich Notifications V2");
            i = new a("STATIONS_EXPERIENCE", 8, 0x7fffffff, "Stations Experience", b.d);
            m = (new a[] {
                a, b, c, d, e, f, g, h, i
            });
        }

        private a(String s, int i1, int j1, String s1)
        {
            super(s, i1);
            j = j1;
            k = s1;
            l = b.c;
        }

        private a(String s, int i1, int j1, String s1, b b1)
        {
            super(s, i1);
            j = j1;
            k = s1;
            l = b1;
        }
    }

    public static final class b extends Enum
    {

        public static final b a;
        public static final b b;
        public static final b c;
        public static final b d;
        private static final b e[];

        public static b valueOf(String s)
        {
            return (b)Enum.valueOf(p/dj/b$b, s);
        }

        public static b[] values()
        {
            return (b[])e.clone();
        }

        static 
        {
            a = new b("PHONE", 0);
            b = new b("TABLET", 1);
            c = new b("BOTH", 2);
            d = new b("NONE", 3);
            e = (new b[] {
                a, b, c, d
            });
        }

        private b(String s, int i)
        {
            super(s, i);
        }
    }


    public abstract void a();

    public abstract boolean a(a a1);
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dd;

import com.pandora.radio.data.y;

public class ay
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        private static final a e[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(p/dd/ay$a, s);
        }

        public static a[] values()
        {
            return (a[])e.clone();
        }

        static 
        {
            a = new a("NEW_STATION_START", 0);
            b = new a("EXISTING_STATION_START", 1);
            c = new a("DATA_CHANGE", 2);
            d = new a("STATION_STOP", 3);
            e = (new a[] {
                a, b, c, d
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    public final y a;
    public final a b;
    public final Object c;

    public ay(y y, a a1)
    {
        this(y, a1, null);
    }

    public ay(y y, a a1, Object obj)
    {
        a = y;
        b = a1;
        c = obj;
    }
}

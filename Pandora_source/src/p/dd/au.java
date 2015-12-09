// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dd;

import com.pandora.radio.data.y;

public class au
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
        private static final a h[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(p/dd/au$a, s);
        }

        public static a[] values()
        {
            return (a[])h.clone();
        }

        static 
        {
            a = new a("DATA_FETCH", 0);
            b = new a("THUMB_UP", 1);
            c = new a("THUMB_DOWN", 2);
            d = new a("UN_THUMB", 3);
            e = new a("RENAME", 4);
            f = new a("ADD_VARIETY", 5);
            g = new a("REMOVE_VARIETY", 6);
            h = (new a[] {
                a, b, c, d, e, f, g
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    public final y a;
    public final a b;

    public au(y y, a a1)
    {
        a = y;
        b = a1;
    }
}

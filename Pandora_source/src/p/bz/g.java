// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bz;

import com.pandora.android.coachmark.CoachmarkBuilder;

public class g
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        private static final a c[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(p/bz/g$a, s);
        }

        public static a[] values()
        {
            return (a[])c.clone();
        }

        static 
        {
            a = new a("SHOWN", 0);
            b = new a("DISMISSED", 1);
            c = (new a[] {
                a, b
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    public final a a;
    public final com.pandora.android.coachmark.e.d b;
    public final CoachmarkBuilder c;

    public g(a a1, com.pandora.android.coachmark.e.d d, CoachmarkBuilder coachmarkbuilder)
    {
        a = a1;
        c = coachmarkbuilder;
        b = d;
    }
}

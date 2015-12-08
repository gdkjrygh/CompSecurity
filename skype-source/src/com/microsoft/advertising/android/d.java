// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import java.util.List;

// Referenced classes of package com.microsoft.advertising.android:
//            l

interface d
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
            return (a)Enum.valueOf(com/microsoft/advertising/android/d$a, s);
        }

        public static a[] values()
        {
            a aa[] = e;
            int i = aa.length;
            a aa1[] = new a[i];
            System.arraycopy(aa, 0, aa1, 0, i);
            return aa1;
        }

        static 
        {
            a = new a("LegacyImage", 0);
            b = new a("LegacyText", 1);
            c = new a("RichMedia", 2);
            d = new a("PolyMorphic", 3);
            e = (new a[] {
                a, b, c, d
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    public abstract long a();

    public abstract List b();

    public abstract l c();

    public abstract float d();

    public abstract a e();

    public abstract boolean f();
}

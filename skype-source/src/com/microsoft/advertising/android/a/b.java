// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android.a;

import com.microsoft.advertising.android.AdControl;

// Referenced classes of package com.microsoft.advertising.android.a:
//            e, a, d

public interface b
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        private static final a d[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/microsoft/advertising/android/a/b$a, s);
        }

        public static a[] values()
        {
            a aa[] = d;
            int i = aa.length;
            a aa1[] = new a[i];
            System.arraycopy(aa, 0, aa1, 0, i);
            return aa1;
        }

        static 
        {
            a = new a("DEFAULT", 0);
            b = new a("EXPANDED", 1);
            c = new a("CLICK", 2);
            d = (new a[] {
                a, b, c
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    public abstract void a(AdControl adcontrol, a a1);

    public abstract void a(AdControl adcontrol, String s, e e);

    public abstract void a(com.microsoft.advertising.android.a.a a1);

    public abstract void a(d d);

    public abstract void a(String s, String s1);
}

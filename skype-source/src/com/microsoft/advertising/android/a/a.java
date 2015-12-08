// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android.a;

import com.microsoft.advertising.android.AdControl;

public interface com.microsoft.advertising.android.a.a
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
        public static final a j;
        public static final a k;
        private static final a m[];
        private final boolean l;

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/microsoft/advertising/android/a/a$a, s);
        }

        public static a[] values()
        {
            a aa[] = m;
            int i1 = aa.length;
            a aa1[] = new a[i1];
            System.arraycopy(aa, 0, aa1, 0, i1);
            return aa1;
        }

        static 
        {
            a = new a("AD_FETCH_STARTED", 0, false);
            b = new a("AD_FETCH_COMPLETED", 1, false);
            c = new a("AD_REFRESH_COMPLETE", 2, true);
            d = new a("AD_FETCHED", 3, true);
            e = new a("ERROR", 4, false);
            f = new a("AD_OBJECT_CREATED", 5, false);
            g = new a("PRE_RENDER_STARTED", 6, false);
            h = new a("PRE_RENDER_FINISHED", 7, false);
            i = new a("PUBLISHER_MESSAGE", 8, false);
            j = new a("DEBUG_EVENT", 9, false);
            k = new a("OTHER", 10, true);
            m = (new a[] {
                a, b, c, d, e, f, g, h, i, j, 
                k
            });
        }

        private a(String s, int i1, boolean flag)
        {
            super(s, i1);
            l = flag;
        }
    }


    public abstract AdControl a();

    public abstract Object a(String s);

    public abstract a b();
}

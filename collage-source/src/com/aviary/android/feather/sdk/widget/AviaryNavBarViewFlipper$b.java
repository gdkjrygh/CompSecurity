// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;


// Referenced classes of package com.aviary.android.feather.sdk.widget:
//            AviaryNavBarViewFlipper

private static class <init>
{
    static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        private static final a d[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/aviary/android/feather/sdk/widget/AviaryNavBarViewFlipper$b$a, s);
        }

        public static a[] values()
        {
            return (a[])d.clone();
        }

        static 
        {
            a = new a("Open", 0);
            b = new a("Close", 1);
            c = new a("Restore", 2);
            d = (new a[] {
                a, b, c
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    a a;
    a b;

    void a(a a1)
    {
        b = a;
        a = a1;
    }

    private a()
    {
    }

    a(a a1)
    {
        this();
    }
}

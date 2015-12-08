// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller;


// Referenced classes of package com.cardinalblue.android.piccollage.controller:
//            a

public static class b
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
            return (a)Enum.valueOf(com/cardinalblue/android/piccollage/controller/a$a$a, s);
        }

        public static a[] values()
        {
            return (a[])h.clone();
        }

        static 
        {
            a = new a("START", 0);
            b = new a("PROGRESSING", 1);
            c = new a("SUCCESS", 2);
            d = new a("FAILED", 3);
            e = new a("CANCELLED", 4);
            f = new a("DATA_CHANGED", 5);
            g = new a("BUNDLE_LIST_UPDATED", 6);
            h = (new a[] {
                a, b, c, d, e, f, g
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    public a a;
    public Object b;

    public a(a a1, Object obj)
    {
        a = a1;
        b = obj;
    }
}

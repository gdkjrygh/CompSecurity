// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.auth;

import com.cardinalblue.android.piccollage.model.gson.IGsonable;

// Referenced classes of package com.cardinalblue.android.piccollage.auth:
//            PicAuth

public static class a
    implements IGsonable
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        private static final a c[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/cardinalblue/android/piccollage/auth/PicAuth$PicLoginResultEvent$a, s);
        }

        public static a[] values()
        {
            return (a[])c.clone();
        }

        static 
        {
            a = new a("OK", 0);
            b = new a("FAIL", 1);
            c = (new a[] {
                a, b
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    private final a a;

    public a a()
    {
        return a;
    }

    public a(a a1)
    {
        a = a1;
    }
}

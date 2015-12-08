// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


interface bg
{
    public static final class a extends Enum
    {

        public static final a agd;
        public static final a age;
        public static final a agf;
        private static final a agg[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/google/android/gms/tagmanager/bg$a, s);
        }

        public static a[] values()
        {
            return (a[])agg.clone();
        }

        static 
        {
            agd = new a("NOT_AVAILABLE", 0);
            age = new a("IO_ERROR", 1);
            agf = new a("SERVER_ERROR", 2);
            agg = (new a[] {
                agd, age, agf
            });
        }

        private a(String s, int j)
        {
            super(s, j);
        }
    }


    public abstract void a(a a1);

    public abstract void i(Object obj);

    public abstract void lq();
}

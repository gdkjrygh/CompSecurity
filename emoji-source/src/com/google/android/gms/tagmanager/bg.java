// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


interface bg
{
    public static final class a extends Enum
    {

        public static final a agg;
        public static final a agh;
        public static final a agi;
        private static final a agj[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/google/android/gms/tagmanager/bg$a, s);
        }

        public static a[] values()
        {
            return (a[])agj.clone();
        }

        static 
        {
            agg = new a("NOT_AVAILABLE", 0);
            agh = new a("IO_ERROR", 1);
            agi = new a("SERVER_ERROR", 2);
            agj = (new a[] {
                agg, agh, agi
            });
        }

        private a(String s, int j)
        {
            super(s, j);
        }
    }


    public abstract void a(a a1);

    public abstract void i(Object obj);

    public abstract void lv();
}

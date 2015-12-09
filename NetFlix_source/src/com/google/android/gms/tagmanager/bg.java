// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


interface bg
{
    public static final class a extends Enum
    {

        public static final a YA;
        private static final a YB[];
        public static final a Yy;
        public static final a Yz;

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/google/android/gms/tagmanager/bg$a, s);
        }

        public static a[] values()
        {
            return (a[])YB.clone();
        }

        static 
        {
            Yy = new a("NOT_AVAILABLE", 0);
            Yz = new a("IO_ERROR", 1);
            YA = new a("SERVER_ERROR", 2);
            YB = (new a[] {
                Yy, Yz, YA
            });
        }

        private a(String s, int j)
        {
            super(s, j);
        }
    }


    public abstract void a(a a1);

    public abstract void i(Object obj);

    public abstract void kl();
}

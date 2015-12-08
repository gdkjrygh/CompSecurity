// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


interface bg
{
    public static final class a extends Enum
    {

        public static final a apM;
        public static final a apN;
        public static final a apO;
        private static final a apP[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/google/android/gms/tagmanager/bg$a, s);
        }

        public static a[] values()
        {
            return (a[])apP.clone();
        }

        static 
        {
            apM = new a("NOT_AVAILABLE", 0);
            apN = new a("IO_ERROR", 1);
            apO = new a("SERVER_ERROR", 2);
            apP = (new a[] {
                apM, apN, apO
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    public abstract void a(a a1);

    public abstract void l(Object obj);

    public abstract void ob();
}

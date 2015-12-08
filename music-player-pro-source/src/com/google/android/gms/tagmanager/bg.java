// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


interface bg
{
    public static final class a extends Enum
    {

        public static final a arV;
        public static final a arW;
        public static final a arX;
        private static final a arY[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/google/android/gms/tagmanager/bg$a, s);
        }

        public static a[] values()
        {
            return (a[])arY.clone();
        }

        static 
        {
            arV = new a("NOT_AVAILABLE", 0);
            arW = new a("IO_ERROR", 1);
            arX = new a("SERVER_ERROR", 2);
            arY = (new a[] {
                arV, arW, arX
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    public abstract void a(a a1);

    public abstract void l(Object obj);

    public abstract void ps();
}

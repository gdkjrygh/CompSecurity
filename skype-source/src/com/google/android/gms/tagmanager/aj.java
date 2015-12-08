// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


interface aj
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        private static final a d[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/google/android/gms/tagmanager/aj$a, s);
        }

        public static a[] values()
        {
            return (a[])d.clone();
        }

        static 
        {
            a = new a("NOT_AVAILABLE", 0);
            b = new a("IO_ERROR", 1);
            c = new a("SERVER_ERROR", 2);
            d = (new a[] {
                a, b, c
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }

}

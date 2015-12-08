// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.richmedia;


public class am
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        private static final a d[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/tremorvideo/sdk/android/richmedia/am$a, s);
        }

        public static a[] values()
        {
            return (a[])d.clone();
        }

        static 
        {
            a = new a("Normal", 0);
            b = new a("Bold", 1);
            c = new a("Time", 2);
            d = (new a[] {
                a, b, c
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    public a a;
    public String b;
    public int c;
    public String d;

    public am(String s, a a1)
    {
        a = a1;
        b = s;
        c = 0;
        d = "";
    }

    public am(String s, String s1, a a1)
    {
        a = a1;
        b = s;
        d = s1;
        c = 0;
    }
}

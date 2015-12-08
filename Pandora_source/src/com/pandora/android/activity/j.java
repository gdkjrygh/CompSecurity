// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;


public interface j
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        private static final a e[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/pandora/android/activity/j$a, s);
        }

        public static a[] values()
        {
            return (a[])e.clone();
        }

        static 
        {
            a = new a("NOW_PLAYING", 0);
            b = new a("HISTORY_TRACK", 1);
            c = new a("AUDIO_AD", 2);
            d = new a("DISABLED", 3);
            e = (new a[] {
                a, b, c, d
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    public abstract a getDisplayMode();

    public abstract void setDisplayMode(a a1);

    public abstract void setShowProgressTime(boolean flag);
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.app.Activity;

public interface du
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
            return (a)Enum.valueOf(com/flurry/sdk/du$a, s);
        }

        public static a[] values()
        {
            return (a[])h.clone();
        }

        static 
        {
            a = new a("kCreated", 0);
            b = new a("kDestroyed", 1);
            c = new a("kPaused", 2);
            d = new a("kResumed", 3);
            e = new a("kStarted", 4);
            f = new a("kStopped", 5);
            g = new a("kSaveState", 6);
            h = (new a[] {
                a, b, c, d, e, f, g
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    public abstract void a(Activity activity, a a1);
}

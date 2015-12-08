// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.skylib;

import android.content.Context;
import com.skype.Setup;

public interface GISetup
{
    public static final class Scope extends Enum
    {

        public static final Scope a;
        public static final Scope b;
        private static final Scope c[];

        public static Scope valueOf(String s)
        {
            return (Scope)Enum.valueOf(com/skype/android/skylib/GISetup$Scope, s);
        }

        public static Scope[] values()
        {
            return (Scope[])c.clone();
        }

        static 
        {
            a = new Scope("GLOBAL", 0);
            b = new Scope("ACCOUNT", 1);
            c = (new Scope[] {
                a, b
            });
        }

        private Scope(String s, int i)
        {
            super(s, i);
        }
    }


    public abstract void a(Context context, Setup setup, Scope scope);
}

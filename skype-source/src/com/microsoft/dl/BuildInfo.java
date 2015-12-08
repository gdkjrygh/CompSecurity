// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.dl;


public final class BuildInfo
{
    public static final class Flavour extends Enum
    {

        public static final Flavour DEBUG;
        public static final Flavour INTERNAL;
        public static final Flavour RELEASE;
        private static final Flavour a[];

        public static Flavour valueOf(String s)
        {
            return (Flavour)Enum.valueOf(com/microsoft/dl/BuildInfo$Flavour, s);
        }

        public static Flavour[] values()
        {
            return (Flavour[])a.clone();
        }

        static 
        {
            DEBUG = new Flavour("DEBUG", 0);
            INTERNAL = new Flavour("INTERNAL", 1);
            RELEASE = new Flavour("RELEASE", 2);
            a = (new Flavour[] {
                DEBUG, INTERNAL, RELEASE
            });
        }

        private Flavour(String s, int i)
        {
            super(s, i);
        }
    }


    public static final Flavour FLAVOUR = Flavour.values()[getFlavourNative()];

    private BuildInfo()
    {
    }

    private static native int getFlavourNative();

}

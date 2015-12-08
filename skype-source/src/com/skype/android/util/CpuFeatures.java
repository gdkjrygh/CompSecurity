// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;

import java.util.EnumSet;

public class CpuFeatures
{
    public static final class Family extends Enum
    {

        public static final Family a;
        public static final Family b;
        public static final Family c;
        private static final Family e[];
        private int d;

        public static Family a(int i)
        {
            switch (i)
            {
            default:
                return a;

            case 1: // '\001'
                return b;

            case 2: // '\002'
                return c;
            }
        }

        public static Family valueOf(String s)
        {
            return (Family)Enum.valueOf(com/skype/android/util/CpuFeatures$Family, s);
        }

        public static Family[] values()
        {
            return (Family[])e.clone();
        }

        static 
        {
            a = new Family("UNKNOWN", 0, 0);
            b = new Family("ARM", 1, 1);
            c = new Family("X86", 2, 2);
            e = (new Family[] {
                a, b, c
            });
        }

        private Family(String s, int i, int j)
        {
            super(s, i);
            d = j;
        }
    }

    public static final class Feature extends Enum
    {

        public static final Feature a;
        public static final Feature b;
        public static final Feature c;
        public static final Feature d;
        public static final Feature e;
        public static final Feature f;
        public static final Feature g;
        private static final Feature j[];
        private int h;
        private Family i;

        public static Feature valueOf(String s)
        {
            return (Feature)Enum.valueOf(com/skype/android/util/CpuFeatures$Feature, s);
        }

        public static Feature[] values()
        {
            return (Feature[])j.clone();
        }

        public final int a()
        {
            return h;
        }

        public final Family b()
        {
            return i;
        }

        static 
        {
            a = new Feature("ARM_FEATURE_ARMv7", 0, Family.b, 1);
            b = new Feature("ARM_FEATURE_VFPv3", 1, Family.b, 2);
            c = new Feature("ARM_FEATURE_NEON", 2, Family.b, 4);
            d = new Feature("ARM_FEATURE_LDREX_STREX", 3, Family.b, 8);
            e = new Feature("X86_FEATURE_SSSE3", 4, Family.c, 1);
            f = new Feature("X86_FEATURE_POPCNT", 5, Family.c, 2);
            g = new Feature("X86_FEATURE_MOVBE", 6, Family.c, 4);
            j = (new Feature[] {
                a, b, c, d, e, f, g
            });
        }

        private Feature(String s, int k, Family family, int l)
        {
            super(s, k);
            i = family;
            h = l;
        }
    }


    private CpuFeatures()
    {
    }

    public static boolean a(Feature feature)
    {
        Family family = Family.a(nativeGetCpuFamily());
        int j = nativeGetCpuFeatures();
        EnumSet enumset = EnumSet.noneOf(com/skype/android/util/CpuFeatures$Feature);
        Feature afeature[] = Feature.values();
        int k = afeature.length;
        for (int i = 0; i < k; i++)
        {
            Feature feature1 = afeature[i];
            if (feature1.b() == family && (feature1.a() & j) != 0)
            {
                enumset.add(feature1);
            }
        }

        return enumset.contains(feature);
    }

    private static native int nativeGetCpuFamily();

    private static native int nativeGetCpuFeatures();

    static 
    {
        System.loadLibrary("SkypeAndroid");
    }
}

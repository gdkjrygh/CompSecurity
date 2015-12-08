// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.util;

import android.os.Build;
import java.util.Locale;

public final class CpuArchitecture extends Enum
{

    public static final CpuArchitecture a;
    private static CpuArchitecture b;
    private static CpuArchitecture c;
    private static final CpuArchitecture d[];
    private final String mArchString;

    private CpuArchitecture(String s, int i, String s1)
    {
        super(s, i);
        mArchString = s1;
    }

    public static CpuArchitecture a()
    {
        String s = Build.CPU_ABI.toLowerCase(Locale.US);
        CpuArchitecture acpuarchitecture[] = values();
        int j = acpuarchitecture.length;
        for (int i = 0; i < j; i++)
        {
            CpuArchitecture cpuarchitecture = acpuarchitecture[i];
            if (s.contains(cpuarchitecture.mArchString))
            {
                return cpuarchitecture;
            }
        }

        return b;
    }

    public static CpuArchitecture valueOf(String s)
    {
        return (CpuArchitecture)Enum.valueOf(com/spotify/mobile/android/util/CpuArchitecture, s);
    }

    public static CpuArchitecture[] values()
    {
        return (CpuArchitecture[])d.clone();
    }

    static 
    {
        b = new CpuArchitecture("ARM", 0, "arm");
        c = new CpuArchitecture("MIPS", 1, "mips");
        a = new CpuArchitecture("X86", 2, "x86");
        d = (new CpuArchitecture[] {
            b, c, a
        });
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.orbit;

import android.os.Build;
import gcl;
import java.net.URL;

public class 
{

    public String[] getABIs()
    {
        if (gcl.j)
        {
            return Build.SUPPORTED_ABIS;
        } else
        {
            return (new String[] {
                Build.CPU_ABI
            });
        }
    }

    public URL getResource(String s)
    {
        return com/spotify/mobile/android/orbit/OrbitLibraryLoader$LibraryLoader.getResource(s);
    }

    public void load(String s)
    {
        System.load(s);
    }

    public void loadLibrary(String s)
    {
        System.loadLibrary(s);
    }

    public ()
    {
    }
}

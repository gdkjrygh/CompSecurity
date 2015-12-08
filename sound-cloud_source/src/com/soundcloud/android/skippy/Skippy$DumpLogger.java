// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.skippy;

import android.util.Log;

// Referenced classes of package com.soundcloud.android.skippy:
//            Skippy

public static class 
{

    private static final int LOG_ENTRY_MAX_LEN = 4096;

    public static void log(int i, String s)
    {
        while (!s.isEmpty()) 
        {
            int k = s.lastIndexOf('\n', 4096);
            int j;
            if (k != -1)
            {
                j = k;
            } else
            {
                j = Math.min(4096, s.length());
            }
            Log.println(i, "Skippy", s.substring(0, j));
            if (k != -1)
            {
                s = s.substring(j + 1);
            } else
            {
                s = s.substring(j);
            }
        }
    }

    public ()
    {
    }
}

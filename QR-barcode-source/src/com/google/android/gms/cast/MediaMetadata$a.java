// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.cast:
//            MediaMetadata

private static class 
{

    private final Map Fr = new HashMap();
    private final Map Fs = new HashMap();
    private final Map Ft = new HashMap();

    public  a(String s, String s1, int i)
    {
        Fr.put(s, s1);
        Fs.put(s1, s);
        Ft.put(s, Integer.valueOf(i));
        return this;
    }

    public String aA(String s)
    {
        return (String)Fs.get(s);
    }

    public int aB(String s)
    {
        s = (Integer)Ft.get(s);
        if (s != null)
        {
            return s.intValue();
        } else
        {
            return 0;
        }
    }

    public String az(String s)
    {
        return (String)Fr.get(s);
    }

    public ()
    {
    }
}

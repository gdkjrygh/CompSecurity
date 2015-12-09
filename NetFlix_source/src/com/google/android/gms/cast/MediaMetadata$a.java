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

    private final Map yt = new HashMap();
    private final Map yu = new HashMap();
    private final Map yv = new HashMap();

    public String R(String s)
    {
        return (String)yt.get(s);
    }

    public String S(String s)
    {
        return (String)yu.get(s);
    }

    public int T(String s)
    {
        s = (Integer)yv.get(s);
        if (s != null)
        {
            return s.intValue();
        } else
        {
            return 0;
        }
    }

    public yv a(String s, String s1, int i)
    {
        yt.put(s, s1);
        yu.put(s1, s);
        yv.put(s, Integer.valueOf(i));
        return this;
    }

    public ()
    {
    }
}

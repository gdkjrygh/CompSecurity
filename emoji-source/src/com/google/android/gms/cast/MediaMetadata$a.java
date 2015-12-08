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

    private final Map AG = new HashMap();
    private final Map AH = new HashMap();
    private final Map AI = new HashMap();

    public  a(String s, String s1, int i)
    {
        AG.put(s, s1);
        AH.put(s1, s);
        AI.put(s, Integer.valueOf(i));
        return this;
    }

    public String ae(String s)
    {
        return (String)AG.get(s);
    }

    public String af(String s)
    {
        return (String)AH.get(s);
    }

    public int ag(String s)
    {
        s = (Integer)AI.get(s);
        if (s != null)
        {
            return s.intValue();
        } else
        {
            return 0;
        }
    }

    public ()
    {
    }
}

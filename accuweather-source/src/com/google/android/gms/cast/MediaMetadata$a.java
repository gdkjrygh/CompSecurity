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

    private final Map AD = new HashMap();
    private final Map AE = new HashMap();
    private final Map AF = new HashMap();

    public  a(String s, String s1, int i)
    {
        AD.put(s, s1);
        AE.put(s1, s);
        AF.put(s, Integer.valueOf(i));
        return this;
    }

    public String ae(String s)
    {
        return (String)AD.get(s);
    }

    public String af(String s)
    {
        return (String)AE.get(s);
    }

    public int ag(String s)
    {
        s = (Integer)AF.get(s);
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

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;


// Referenced classes of package com.taplytics:
//            gs

public final class be
    implements Comparable
{

    public String a;

    public be(String s)
    {
        if (s == null)
        {
            try
            {
                throw new IllegalArgumentException("Version can not be null");
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                gs.b("Version number invalid, defaulting to 0", s);
            }
            a = "0";
            return;
        }
        if (!s.matches("[0-9]+(\\.[0-9]+)*"))
        {
            throw new IllegalArgumentException("Invalid version format");
        } else
        {
            a = s;
            return;
        }
    }

    public final int a(be be1)
    {
        if (be1 != null) goto _L2; else goto _L1
_L1:
        return 1;
_L2:
        String as[];
        int i;
        int j;
        int k;
        int l;
        try
        {
            as = a.split("\\.");
            be1 = be1.a.split("\\.");
            l = Math.max(as.length, be1.length);
        }
        // Misplaced declaration of an exception variable
        catch (be be1)
        {
            return 0;
        }
        i = 0;
        if (i >= l)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        if (i >= as.length) goto _L4; else goto _L3
_L3:
        j = Integer.parseInt(as[i]);
_L5:
        if (i >= be1.length)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        k = Integer.parseInt(be1[i]);
_L6:
        if (j < k)
        {
            return -1;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        j = 0;
          goto _L5
        k = 0;
          goto _L6
        if (j > k) goto _L1; else goto _L7
_L7:
        i++;
        break MISSING_BLOCK_LABEL_37;
        if (true) goto _L1; else goto _L8
_L8:
        return 0;
    }

    public final int compareTo(Object obj)
    {
        return a((be)obj);
    }

    public final boolean equals(Object obj)
    {
        return this == obj || obj != null && getClass() == obj.getClass() && a((be)obj) == 0;
    }
}

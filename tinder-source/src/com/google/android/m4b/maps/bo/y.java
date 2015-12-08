// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bo;

import java.io.DataInput;

// Referenced classes of package com.google.android.m4b.maps.bo:
//            s

public final class y
{

    private static y c = new y(0, s.a());
    public final int a;
    private final s b;

    public y(int i, s s1)
    {
        a = i;
        b = s1;
    }

    public static y a()
    {
        return c;
    }

    public static y a(DataInput datainput)
    {
        return new y(datainput.readInt(), s.a(datainput));
    }

    public final boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        obj = (y)obj;
        if (a != ((y) (obj)).a)
        {
            return false;
        }
        if (b != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((y) (obj)).b == null) goto _L1; else goto _L3
_L3:
        return false;
        if (b.equals(((y) (obj)).b)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public final int hashCode()
    {
        int j = a;
        int i;
        if (b == null)
        {
            i = 0;
        } else
        {
            i = b.hashCode();
        }
        return i + (j + 31) * 31;
    }

}

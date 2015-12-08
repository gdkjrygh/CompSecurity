// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.data;

import android.os.Bundle;

public class c
{

    public final boolean a;
    public final Bundle b;

    public c(boolean flag)
    {
        this(flag, null);
    }

    public c(boolean flag, Bundle bundle)
    {
        a = flag;
        b = bundle;
    }

    public boolean equals(Object obj)
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
        obj = (c)obj;
        if (a != ((c) (obj)).a)
        {
            return false;
        }
        if (b != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((c) (obj)).b == null) goto _L1; else goto _L3
_L3:
        return false;
        if (b.equals(((c) (obj)).b)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public int hashCode()
    {
        char c1;
        int i;
        if (a)
        {
            c1 = '\u04CF';
        } else
        {
            c1 = '\u04D5';
        }
        if (b == null)
        {
            i = 0;
        } else
        {
            i = b.hashCode();
        }
        return i + (c1 + 31) * 31;
    }
}

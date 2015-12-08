// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bx;

import com.google.android.m4b.maps.bo.ah;
import java.util.HashMap;

// Referenced classes of package com.google.android.m4b.maps.bx:
//            t, s

static final class 
{

    HashMap a;
    a b[];

    static int a(int i, int j, int k)
    {
        return (i >> k & 1) + ((j >> k & 1) << 1);
    }

    static s a( , ah ah)
    {
        if (.a == null)
        {
            return null;
        } else
        {
            return (s).a.get(ah);
        }
    }

    ()
    {
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ax;

import com.google.android.m4b.maps.bo.ag;
import com.google.android.m4b.maps.bo.ah;

// Referenced classes of package com.google.android.m4b.maps.ax:
//            h, e, c, f

public class g
    implements h
{

    public g()
    {
    }

    public e a(ah ah, boolean flag, ag ag, com.google.android.m4b.maps.bw.g g1)
    {
        if (flag)
        {
            return new e(ah, ag, g1);
        } else
        {
            return null;
        }
    }

    public f a(ah ah, int i, boolean flag, ag ag, com.google.android.m4b.maps.bw.g g1)
    {
        if (flag)
        {
            return new c(ah, i, ag, g1);
        } else
        {
            return new e(ah, ag, g1);
        }
    }
}

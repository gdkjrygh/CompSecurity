// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import java.util.Comparator;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            ea

final class fj
    implements Comparator
{

    fj()
    {
    }

    public int a(ea ea1, ea ea2)
    {
        if (ea1.j() < ea2.j())
        {
            return -1;
        }
        return ea1.j() <= ea2.j() ? 0 : 1;
    }

    public int compare(Object obj, Object obj1)
    {
        return a((ea)obj, (ea)obj1);
    }
}

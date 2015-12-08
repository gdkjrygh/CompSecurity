// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.c;

import com.bumptech.glide.load.a.c;

// Referenced classes of package com.bumptech.glide.load.c:
//            s, i

public final class h
    implements s
{

    private final s a;
    private final s b;

    public h(s s1, s s2)
    {
        if (s1 == null && s2 == null)
        {
            throw new NullPointerException("At least one of streamLoader and fileDescriptorLoader must be non null");
        } else
        {
            a = s1;
            b = s2;
            return;
        }
    }

    public final c a(Object obj, int j, int k)
    {
        i l = null;
        c c;
        if (a != null)
        {
            c = a.a(obj, j, k);
        } else
        {
            c = null;
        }
        if (b != null)
        {
            obj = b.a(obj, j, k);
        } else
        {
            obj = null;
        }
        if (c != null || obj != null)
        {
            l = new i(c, ((c) (obj)));
        }
        return l;
    }
}

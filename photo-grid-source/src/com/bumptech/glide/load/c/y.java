// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.c;

import com.bumptech.glide.load.a.c;
import java.net.URL;

// Referenced classes of package com.bumptech.glide.load.c:
//            s, e

public class y
    implements s
{

    private final s a;

    public y(s s1)
    {
        a = s1;
    }

    public final c a(Object obj, int i, int j)
    {
        obj = (URL)obj;
        return a.a(new e(((URL) (obj))), i, j);
    }
}

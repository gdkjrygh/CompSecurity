// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.miteksystems.misnap;

import android.view.SurfaceHolder;

// Referenced classes of package com.miteksystems.misnap:
//            l

final class p
    implements Runnable
{

    final l a;
    private final SurfaceHolder b;

    p(l l1, SurfaceHolder surfaceholder)
    {
        a = l1;
        b = surfaceholder;
        super();
    }

    public final void run()
    {
        l.a(a, b);
    }
}

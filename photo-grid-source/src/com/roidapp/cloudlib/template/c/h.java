// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.template.c;

import android.support.v7.widget.RecyclerView;

// Referenced classes of package com.roidapp.cloudlib.template.c:
//            f

final class h
    implements Runnable
{

    final int a;
    final f b;

    h(f f1, int i)
    {
        b = f1;
        a = i;
        super();
    }

    public final void run()
    {
        b.b.a_(a);
    }
}

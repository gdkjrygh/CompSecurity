// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget.fastscroll;

import android.os.Debug;

// Referenced classes of package com.skype.android.widget.fastscroll:
//            LayoutCostMeter

static final class nit> extends nit>
{

    public final void a()
    {
        Debug.stopMethodTracing();
    }

    public final void a(String s)
    {
        Debug.startMethodTracingSampling(s, 0x1000000, 100);
    }

    public final void b()
    {
        Debug.stopMethodTracing();
    }

    A(String s)
    {
        super(s, 2, (byte)0);
    }
}

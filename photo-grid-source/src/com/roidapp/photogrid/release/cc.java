// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.widget.HorizontalScrollView;

// Referenced classes of package com.roidapp.photogrid.release:
//            by

final class cc
    implements Runnable
{

    final by a;

    cc(by by1)
    {
        a = by1;
        super();
    }

    public final void run()
    {
        by.g(a).fullScroll(66);
    }
}

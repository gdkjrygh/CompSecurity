// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.widget.HorizontalScrollView;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            SelectorBaseActivity

final class bq
    implements Runnable
{

    final SelectorBaseActivity a;

    bq(SelectorBaseActivity selectorbaseactivity)
    {
        a = selectorbaseactivity;
        super();
    }

    public final void run()
    {
        a.h.fullScroll(66);
    }
}

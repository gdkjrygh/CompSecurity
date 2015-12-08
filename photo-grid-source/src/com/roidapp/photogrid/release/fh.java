// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.widget.HorizontalScrollView;

// Referenced classes of package com.roidapp.photogrid.release:
//            fb

final class fh
    implements Runnable
{

    final fb a;

    fh(fb fb1)
    {
        a = fb1;
        super();
    }

    public final void run()
    {
        fb.d(a).fullScroll(66);
    }
}

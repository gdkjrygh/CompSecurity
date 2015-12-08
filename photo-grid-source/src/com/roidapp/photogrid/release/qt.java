// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.widget.RelativeLayout;

// Referenced classes of package com.roidapp.photogrid.release:
//            qs, RetouchActivity

final class qt
    implements Runnable
{

    final qs a;

    qt(qs qs1)
    {
        a = qs1;
        super();
    }

    public final void run()
    {
        RetouchActivity.a(a.f).setVisibility(8);
        RetouchActivity.b(a.f);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.widget.RelativeLayout;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            BaseShareActivity

final class e
    implements Runnable
{

    final BaseShareActivity a;

    e(BaseShareActivity baseshareactivity)
    {
        a = baseshareactivity;
        super();
    }

    public final void run()
    {
        BaseShareActivity.a(a).setVisibility(8);
    }
}

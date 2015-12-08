// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import com.pinterest.pinit.PinItListener;
import com.roidapp.photogrid.b.f;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            BaseShareActivity

final class j extends PinItListener
{

    final BaseShareActivity a;

    j(BaseShareActivity baseshareactivity)
    {
        a = baseshareactivity;
        super();
    }

    public final void onComplete(boolean flag)
    {
        super.onComplete(flag);
        f.a("SharePage_View", "Share_BackShare");
    }
}

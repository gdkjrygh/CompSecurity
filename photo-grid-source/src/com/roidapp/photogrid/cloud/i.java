// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import com.pinterest.pinit.PinItListener;
import com.pinterest.pinit.exceptions.NotInstalledException;
import com.roidapp.baselib.c.an;
import com.roidapp.photogrid.common.af;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            BaseShareActivity

final class i extends PinItListener
{

    final BaseShareActivity a;

    i(BaseShareActivity baseshareactivity)
    {
        a = baseshareactivity;
        super();
    }

    public final void onException(Exception exception)
    {
label0:
        {
            super.onException(exception);
            if (exception != null)
            {
                if (!(exception instanceof NotInstalledException))
                {
                    break label0;
                }
                af.b(a, (new StringBuilder()).append(a.l).append("Pinterest/NotInstall").toString());
            }
            return;
        }
        an.a(a, (new StringBuilder()).append(exception.getMessage()).toString());
    }
}

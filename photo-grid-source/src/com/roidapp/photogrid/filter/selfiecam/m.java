// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.filter.selfiecam;

import android.os.Handler;
import android.os.Message;
import com.roidapp.baselib.a.a;

// Referenced classes of package com.roidapp.photogrid.filter.selfiecam:
//            SelfieCamImageShowActivity

public final class m
    implements Runnable
{

    final SelfieCamImageShowActivity a;

    public m(SelfieCamImageShowActivity selfiecamimageshowactivity)
    {
        a = selfiecamimageshowactivity;
        super();
    }

    public final void run()
    {
        com.roidapp.baselib.a.a.a();
        Object obj = com.roidapp.baselib.a.a.b(SelfieCamImageShowActivity.b(a), SelfieCamImageShowActivity.e(a), SelfieCamImageShowActivity.f(a));
        if (obj == null)
        {
            obj = Message.obtain(SelfieCamImageShowActivity.g(a), 1021);
            SelfieCamImageShowActivity.g(a).sendMessage(((Message) (obj)));
            return;
        } else
        {
            obj = Message.obtain(SelfieCamImageShowActivity.g(a), 1020, obj);
            SelfieCamImageShowActivity.g(a).sendMessage(((Message) (obj)));
            return;
        }
    }
}

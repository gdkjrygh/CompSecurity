// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.os.Handler;
import android.os.Message;
import android.view.View;

// Referenced classes of package com.roidapp.photogrid.release:
//            cu, ih

final class cv extends Handler
{

    final cu a;

    cv(cu cu1)
    {
        a = cu1;
        super();
    }

    public final void handleMessage(Message message)
    {
        View view;
label0:
        {
            super.handleMessage(message);
            view = (View)message.obj;
            if (message.what == cu.a(a))
            {
                if (cu.b(a) != view.getScrollX())
                {
                    break label0;
                }
                ih.C().a(cu.b(a));
            }
            return;
        }
        cu.a(a, view.getScrollX());
        a.a.sendMessageDelayed(a.a.obtainMessage(cu.a(a), view), 1L);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.os.Handler;
import android.os.Message;
import android.widget.Toast;
import com.roidapp.baselib.c.an;
import com.roidapp.photogrid.common.al;
import java.lang.ref.WeakReference;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            SelectorBaseActivity

final class bn extends Handler
{

    final SelectorBaseActivity a;

    bn(SelectorBaseActivity selectorbaseactivity)
    {
        a = selectorbaseactivity;
        super();
    }

    public final void dispatchMessage(Message message)
    {
        if (message.what == 566)
        {
            if (a.p != null)
            {
                a.p.a();
            }
        } else
        if (message.what == SelectorBaseActivity.k())
        {
            if (a.o == 1)
            {
                Toast.makeText(a, 0x7f0701f6, 0).show();
                return;
            } else
            {
                an.a(new WeakReference(a), String.format(a.getString(0x7f0701f7), new Object[] {
                    Integer.valueOf(a.o)
                }));
                return;
            }
        }
    }
}

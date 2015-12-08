// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid;

import android.os.Handler;
import android.os.Message;
import android.view.ViewGroup;
import com.roidapp.baselib.gl.GPUTestView;
import com.roidapp.baselib.gl.c;
import com.roidapp.photogrid.common.al;

// Referenced classes of package com.roidapp.photogrid:
//            MainPage

final class v extends Handler
{

    final MainPage a;

    v(MainPage mainpage)
    {
        a = mainpage;
        super();
    }

    public final void handleMessage(Message message)
    {
        if (!a.isFinishing()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        message.what;
        JVM INSTR lookupswitch 6: default 72
    //                   2: 73
    //                   3: 97
    //                   4: 166
    //                   10: 257
    //                   566: 175
    //                   4656: 196;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L3:
        return;
_L4:
        MainPage.a(a);
        MainPage.b(a);
        sendEmptyMessageDelayed(3, 600L);
        return;
_L5:
        a.a(true);
        if (com.roidapp.photogrid.MainPage.c(a))
        {
            a.w();
            MainPage.d(a);
            return;
        }
        if (MainPage.e(a) > 0L)
        {
            a.b(MainPage.e(a));
            MainPage.f(a);
            return;
        }
          goto _L1
_L6:
        a.a(false);
        return;
_L8:
        if (MainPage.g(a) != null)
        {
            MainPage.g(a).a();
            return;
        }
          goto _L1
_L9:
        c.a().a(a.getApplicationContext(), (String)message.obj);
        message = (GPUTestView)a.findViewById(16);
        if (message == null) goto _L1; else goto _L10
_L10:
        ViewGroup viewgroup = (ViewGroup)message.getParent();
        if (viewgroup != null)
        {
            try
            {
                viewgroup.removeView(message);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Message message)
            {
                message.printStackTrace();
            }
            return;
        }
          goto _L1
_L7:
        MainPage.h(a);
        return;
    }
}

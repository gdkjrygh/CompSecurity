// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.os.Handler;
import android.os.Message;
import android.view.ViewGroup;
import com.roidapp.baselib.gl.GPUTestView;
import com.roidapp.baselib.gl.c;

// Referenced classes of package com.roidapp.photogrid.release:
//            ShareEntryVideo

final class qw extends Handler
{

    final ShareEntryVideo a;

    qw(ShareEntryVideo shareentryvideo)
    {
        a = shareentryvideo;
        super();
    }

    public final void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 4656 4656: default 24
    //                   4656 25;
           goto _L1 _L2
_L1:
        return;
_L2:
        c.a().a(a.getApplicationContext(), (String)message.obj);
        message = (GPUTestView)a.findViewById(16);
        if (message == null)
        {
            continue; /* Loop/switch isn't completed */
        }
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
        if (true) goto _L1; else goto _L3
_L3:
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.os.Handler;
import android.os.Message;
import android.view.ViewGroup;
import com.roidapp.baselib.gl.GPUTestView;
import com.roidapp.baselib.gl.c;
import com.roidapp.photogrid.common.al;
import java.lang.ref.WeakReference;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            TemplateSelectorActivity

final class ct extends Handler
{

    final TemplateSelectorActivity a;
    private WeakReference b;

    public ct(TemplateSelectorActivity templateselectoractivity, TemplateSelectorActivity templateselectoractivity1)
    {
        a = templateselectoractivity;
        super();
        b = new WeakReference(templateselectoractivity1);
    }

    public final void handleMessage(Message message)
    {
        message.what;
        JVM INSTR lookupswitch 2: default 32
    //                   566: 33
    //                   4656: 54;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        if (TemplateSelectorActivity.f(a) != null)
        {
            TemplateSelectorActivity.f(a).a();
            return;
        }
          goto _L1
_L3:
        TemplateSelectorActivity templateselectoractivity = (TemplateSelectorActivity)b.get();
        if (templateselectoractivity == null) goto _L1; else goto _L4
_L4:
        message = (String)message.obj;
        c.a().a(templateselectoractivity, message);
        message = (GPUTestView)templateselectoractivity.findViewById(16);
        if (message == null) goto _L6; else goto _L5
_L5:
        ViewGroup viewgroup = (ViewGroup)message.getParent();
        if (viewgroup != null)
        {
            try
            {
                viewgroup.removeView(message);
            }
            // Misplaced declaration of an exception variable
            catch (Message message)
            {
                message.printStackTrace();
            }
        }
_L6:
        c.a();
        if (c.b(templateselectoractivity))
        {
            c.a().a(true);
            return;
        } else
        {
            c.a().a(false);
            return;
        }
    }
}

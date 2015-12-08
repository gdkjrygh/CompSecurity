// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.ImageView;
import com.roidapp.baselib.c.x;
import com.roidapp.cloudlib.template.TemplateInfo;
import com.roidapp.photogrid.cloud.a.q;
import java.io.File;
import java.lang.ref.WeakReference;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            BaseShareActivity, q, m

final class r extends Handler
{

    private WeakReference a;
    private boolean b;

    public r(BaseShareActivity baseshareactivity)
    {
        a = new WeakReference(baseshareactivity);
    }

    static boolean a(r r1)
    {
        return r1.b;
    }

    static WeakReference b(r r1)
    {
        return r1.a;
    }

    public final void a()
    {
        b = true;
    }

    public final void handleMessage(Message message)
    {
        if (!b && a != null) goto _L2; else goto _L1
_L1:
        a = null;
_L4:
        return;
_L2:
        BaseShareActivity baseshareactivity = (BaseShareActivity)a.get();
        if (baseshareactivity == null || baseshareactivity.isFinishing())
        {
            a = null;
            return;
        }
        switch (message.what)
        {
        default:
            return;

        case 52225: 
            String s = (String)message.obj;
            if (s != null && (new File(s)).exists())
            {
                (new Thread(new com.roidapp.photogrid.cloud.q(this, s, message.arg1, baseshareactivity.j, BaseShareActivity.c(baseshareactivity), (byte)0))).start();
                return;
            }
            break;

        case 52226: 
            message = (x)message.obj;
            if (message != null)
            {
                Bitmap bitmap = (Bitmap)((x) (message)).a;
                if (bitmap != null)
                {
                    ImageView imageview = BaseShareActivity.d(baseshareactivity);
                    if (imageview != null)
                    {
                        imageview.setImageBitmap(bitmap);
                        imageview.setVisibility(0);
                    }
                }
                message = (Bitmap)((x) (message)).b;
                if (message != null && BaseShareActivity.e(baseshareactivity) != null)
                {
                    BaseShareActivity.e(baseshareactivity).a(message);
                    return;
                }
            }
            break;

        case 52227: 
            if (baseshareactivity.e != null)
            {
                baseshareactivity.e.setVisibility(8);
            }
            String s1 = (String)message.obj;
            if (message.arg1 == 1)
            {
                message = "image/png";
            } else
            {
                message = "image/jpeg";
            }
            BaseShareActivity.a(baseshareactivity, s1, message);
            return;

        case 52228: 
            message = (m)message.obj;
            if (message != null)
            {
                (new Thread(new m(this, message, (byte)0))).start();
                return;
            }
            break;

        case 52229: 
            BaseShareActivity.a(baseshareactivity, (TemplateInfo)message.obj);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}

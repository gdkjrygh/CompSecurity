// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

// Referenced classes of package com.roidapp.photogrid.release:
//            jj

final class jk extends Handler
{

    final jj a;

    jk(jj jj1)
    {
        a = jj1;
        super();
    }

    public final void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 0 0: default 24
    //                   0 25;
           goto _L1 _L2
_L1:
        return;
_L2:
        if (jj.a(a) != null)
        {
            jj.a(a).setVisibility(8);
        }
        jj.a(a, true);
        if (jj.b(a) != null && !jj.b(a).isRecycled())
        {
            jj.c(a).setImageBitmap(jj.b(a));
            int i = jj.d(a).getMeasuredWidth();
            int j = jj.d(a).getMeasuredHeight();
            if (i > 0 && j > 0)
            {
                jj.a(a, i);
                jj.b(a, j);
                return;
            }
        } else
        {
            jj.e(a).setVisibility(8);
            jj.f(a).setVisibility(8);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }
}

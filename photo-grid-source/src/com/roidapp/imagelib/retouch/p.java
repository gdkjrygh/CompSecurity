// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.retouch;

import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.util.concurrent.atomic.AtomicBoolean;
import jp.co.cyberagent.android.gpuimage.GPUImageFilter;
import jp.co.cyberagent.android.gpuimage.GPUImageView;

// Referenced classes of package com.roidapp.imagelib.retouch:
//            m

final class p
    implements android.view.View.OnTouchListener
{

    final m a;

    p(m m1)
    {
        a = m1;
        super();
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        int i;
        for (i = motionevent.getAction(); m.b(a).get() || m.n(a) == null;)
        {
            return false;
        }

        switch (i)
        {
        default:
            return false;

        case 0: // '\0'
            m.k(a).setFilter(new GPUImageFilter());
            m.k(a).requestRender();
            m.o(a).setPressed(true);
            return false;

        case 1: // '\001'
            m.k(a).setFilter(m.n(a));
            break;
        }
        m.k(a).requestRender();
        m.o(a).setPressed(false);
        return false;
    }
}

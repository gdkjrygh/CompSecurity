// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.retouch;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;
import jp.co.cyberagent.android.gpuimage.GPUImageView;

// Referenced classes of package com.roidapp.imagelib.retouch:
//            m, ac, v, l

final class o
    implements android.view.View.OnClickListener
{

    final m a;

    o(m m1)
    {
        a = m1;
        super();
    }

    public final void onClick(View view)
    {
        if (m.b(a).get())
        {
            return;
        }
        m.f(a);
        m.g(a);
        if (m.h(a).isSelected())
        {
            m.h(a).setSelected(false);
            m.i(a).b(0);
            m.j(a).b(0);
            m.k(a).requestRender();
            m.l(a).setVisibility(8);
            l.f().a(false);
            return;
        } else
        {
            m.h(a).setSelected(true);
            m.i(a).b(50);
            m.j(a).b(50);
            m.k(a).requestRender();
            m.m(a);
            l.f().a(true);
            m.l(a).setVisibility(0);
            return;
        }
    }
}

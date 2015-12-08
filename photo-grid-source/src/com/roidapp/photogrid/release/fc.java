// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.view.View;
import com.roidapp.baselib.c.an;
import com.roidapp.photogrid.common.b;

// Referenced classes of package com.roidapp.photogrid.release:
//            fb, fi, PhotoGridActivity

final class fc
    implements android.view.View.OnClickListener
{

    final fb a;

    fc(fb fb1)
    {
        a = fb1;
        super();
    }

    public final void onClick(View view)
    {
        if (!fb.a(a))
        {
            an.a(com.roidapp.photogrid.release.fb.b(a), 0x7f070202);
            return;
        } else
        {
            b.a((new StringBuilder()).append(fb.c(a)).append("/banner/Ratio").toString());
            view = new fi();
            com.roidapp.photogrid.release.fb.b(a).a(0x7f0d03ec, view, "ProportionFragment");
            return;
        }
    }
}

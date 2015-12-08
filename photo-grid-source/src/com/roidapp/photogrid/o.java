// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.av;
import android.support.v7.widget.bi;
import android.view.View;
import com.roidapp.baselib.c.b;
import com.roidapp.photogrid.b.f;
import com.roidapp.photogrid.common.af;
import java.util.Set;

// Referenced classes of package com.roidapp.photogrid:
//            k

final class o
    implements av
{

    final k a;

    o(k k1)
    {
        a = k1;
        super();
    }

    public final void a(View view)
    {
        int i = k.c(a).a(view).d();
        if (i == 3)
        {
            if (!k.d(a).contains(Integer.valueOf(3)))
            {
                f.a("MainPage_template_card", 1, 5);
                k.d(a).add(Integer.valueOf(3));
            }
        } else
        if (i == 2 && !k.d(a).contains(Integer.valueOf(2)))
        {
            k.a(a);
            b.a("SNS", "UpGlide", "SNS/UpGlide/Home");
            af.b(k.a(a), "SNS", "UpGlide", "SNS/UpGlide/Home", Long.valueOf(1L));
            k.d(a).add(Integer.valueOf(2));
            return;
        }
    }
}

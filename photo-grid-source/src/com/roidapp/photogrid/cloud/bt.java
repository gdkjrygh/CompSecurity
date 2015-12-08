// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.roidapp.baselib.c.an;
import com.roidapp.baselib.c.n;
import com.roidapp.cloudlib.sns.upload.b;
import com.roidapp.cloudlib.sns.upload.e;
import com.roidapp.cloudlib.sns.upload.j;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            br, BaseShareActivity

final class bt
    implements j
{

    final br a;

    bt(br br1)
    {
        a = br1;
        super();
    }

    public final void a()
    {
        e.a().b();
        a.a(e.a().c());
    }

    public final void a(long l, int i)
    {
        if (br.k(a) == l)
        {
            if (i == 0)
            {
                br.l(a).setVisibility(8);
                br.m(a).setVisibility(0);
                com.roidapp.photogrid.cloud.br.n(a).setVisibility(0);
                com.roidapp.photogrid.cloud.br.n(a).setProgress(0);
                br.m(a).setBackgroundColor(-1);
                br.o(a).setText(br.c(a).getString(0x7f0700fa));
                n.a(br.o(a), 0, 0, 0);
                return;
            }
            if (i < 100)
            {
                com.roidapp.photogrid.cloud.br.n(a).setProgress(i);
                return;
            } else
            {
                an.a(br.c(a), br.c(a).getString(0x7f0700c1));
                br.o(a).setText(br.c(a).getString(0x7f070060));
                n.a(br.o(a), 0x7f020370, 0, 0);
                br.c(a, b.c);
                br.l(a).setVisibility(8);
                br.m(a).setVisibility(0);
                com.roidapp.photogrid.cloud.br.n(a).setVisibility(8);
                br.m(a).setBackgroundResource(0x7f0200c9);
                return;
            }
        } else
        {
            br.a(a, l, i);
            return;
        }
    }

    public final void b()
    {
        a.a(e.a().c());
    }
}

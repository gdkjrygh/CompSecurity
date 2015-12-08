// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.roidapp.baselib.c.an;
import com.roidapp.baselib.c.n;
import com.roidapp.cloudlib.sns.upload.b;
import com.roidapp.cloudlib.sns.upload.e;
import com.roidapp.cloudlib.sns.upload.j;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            PGShareActivity

final class az
    implements j
{

    final PGShareActivity a;

    az(PGShareActivity pgshareactivity)
    {
        a = pgshareactivity;
        super();
    }

    public final void a()
    {
        e.a().b();
        a.a(e.a().c());
    }

    public final void a(long l, int i)
    {
        if (PGShareActivity.k(a) == l)
        {
            if (i == 0)
            {
                PGShareActivity.g(a).setVisibility(8);
                PGShareActivity.l(a).setVisibility(0);
                PGShareActivity.m(a).setVisibility(0);
                PGShareActivity.m(a).setProgress(0);
                PGShareActivity.l(a).setBackgroundColor(-1);
                com.roidapp.photogrid.cloud.PGShareActivity.n(a).setText(a.getString(0x7f0700fa));
                n.a(com.roidapp.photogrid.cloud.PGShareActivity.n(a), 0, 0, 0);
                return;
            }
            if (i < 100)
            {
                PGShareActivity.m(a).setProgress(i);
                return;
            } else
            {
                an.a(a, a.getString(0x7f0700c1));
                com.roidapp.photogrid.cloud.PGShareActivity.n(a).setText(a.getString(0x7f070060));
                n.a(com.roidapp.photogrid.cloud.PGShareActivity.n(a), 0x7f020370, 0, 0);
                PGShareActivity.c(a, b.c);
                PGShareActivity.g(a).setVisibility(8);
                PGShareActivity.l(a).setVisibility(0);
                PGShareActivity.m(a).setVisibility(8);
                PGShareActivity.l(a).setBackgroundResource(0x7f0200c9);
                PGShareActivity.o(a).smoothScrollBy(0, 0);
                PGShareActivity.o(a).requestLayout();
                return;
            }
        } else
        {
            PGShareActivity.a(a, l, i);
            return;
        }
    }

    public final void b()
    {
        a.a(e.a().c());
    }
}

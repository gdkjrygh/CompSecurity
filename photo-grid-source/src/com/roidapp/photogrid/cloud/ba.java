// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.roidapp.baselib.c.b;
import com.roidapp.baselib.e.l;
import com.roidapp.cloudlib.sns.upload.UploadProgressStatusView;
import com.roidapp.cloudlib.sns.upload.e;
import com.roidapp.cloudlib.sns.upload.i;
import com.roidapp.photogrid.common.af;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            PGShareActivity

final class ba
    implements android.view.View.OnClickListener
{

    final UploadProgressStatusView a;
    final i b;
    final PGShareActivity c;

    ba(PGShareActivity pgshareactivity, UploadProgressStatusView uploadprogressstatusview, i j)
    {
        c = pgshareactivity;
        a = uploadprogressstatusview;
        b = j;
        super();
    }

    public final void onClick(View view)
    {
        int j = view.getId();
        if (j == UploadProgressStatusView.b())
        {
            com.roidapp.baselib.c.b.a("SNS", "click", "Save/Save/CancelUpload");
            af.b(c, "SNS", "click", "Save/Save/CancelUpload", Long.valueOf(1L));
            e.a().b(b.e);
            com.roidapp.photogrid.cloud.PGShareActivity.b(c).removeView(a);
            PGShareActivity.o(c).smoothScrollBy(0, 0);
            PGShareActivity.o(c).requestLayout();
        } else
        if (j == UploadProgressStatusView.c())
        {
            if (!l.b(c))
            {
                l.a(c, null);
                return;
            } else
            {
                com.roidapp.baselib.c.b.a("SNS", "click", "Save/Save/RetryUpload");
                af.b(c, "SNS", "click", "Save/Save/RetryUpload", Long.valueOf(1L));
                a.a();
                e.a().b(b.e);
                e.a(c, b);
                PGShareActivity.o(c).smoothScrollBy(0, 0);
                PGShareActivity.o(c).requestLayout();
                return;
            }
        }
    }
}

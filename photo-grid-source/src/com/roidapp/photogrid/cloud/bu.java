// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.view.View;
import android.widget.LinearLayout;
import com.roidapp.baselib.c.b;
import com.roidapp.baselib.e.l;
import com.roidapp.cloudlib.sns.upload.UploadProgressStatusView;
import com.roidapp.cloudlib.sns.upload.e;
import com.roidapp.cloudlib.sns.upload.i;
import com.roidapp.photogrid.common.af;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            br

final class bu
    implements android.view.View.OnClickListener
{

    final UploadProgressStatusView a;
    final i b;
    final br c;

    bu(br br1, UploadProgressStatusView uploadprogressstatusview, i j)
    {
        c = br1;
        a = uploadprogressstatusview;
        b = j;
        super();
    }

    public final void onClick(View view)
    {
        int j = view.getId();
        if (j == UploadProgressStatusView.b())
        {
            br.c(c);
            com.roidapp.baselib.c.b.a("SNS", "click", "Save/Share/CancelUpload");
            af.b(br.c(c), "SNS", "click", "Save/Share/CancelUpload", Long.valueOf(1L));
            e.a().b(b.e);
            c.a.removeView(a);
        } else
        if (j == UploadProgressStatusView.c())
        {
            if (!l.b(br.c(c)))
            {
                l.a(br.c(c), null);
                return;
            } else
            {
                br.c(c);
                com.roidapp.baselib.c.b.a("SNS", "click", "Save/Share/RetryUpload");
                af.b(br.c(c), "SNS", "click", "Save/Share/RetryUpload", Long.valueOf(1L));
                a.a();
                e.a().b(b.e);
                e.a(br.c(c), b);
                return;
            }
        }
    }
}

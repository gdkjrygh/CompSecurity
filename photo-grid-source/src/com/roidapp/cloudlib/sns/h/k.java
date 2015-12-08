// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.h;

import android.view.View;
import android.widget.LinearLayout;
import com.roidapp.baselib.e.l;
import com.roidapp.cloudlib.sns.upload.UploadProgressStatusView;
import com.roidapp.cloudlib.sns.upload.e;
import com.roidapp.cloudlib.sns.upload.i;

// Referenced classes of package com.roidapp.cloudlib.sns.h:
//            h

final class k
    implements android.view.View.OnClickListener
{

    final UploadProgressStatusView a;
    final i b;
    final h c;

    k(h h1, UploadProgressStatusView uploadprogressstatusview, i j)
    {
        c = h1;
        a = uploadprogressstatusview;
        b = j;
        super();
    }

    public final void onClick(View view)
    {
        int j = view.getId();
        if (j == UploadProgressStatusView.b())
        {
            e.a().b(b.e);
            h.p(c).removeView(a);
        } else
        if (j == UploadProgressStatusView.c())
        {
            if (!l.b(c.getActivity()))
            {
                l.a(c.getActivity(), null);
                return;
            }
            e.a().b(b.e);
            e.a(c.getActivity(), b);
        }
        if (h.p(c) != null && h.p(c).getChildCount() > 0)
        {
            h.q(c).setVisibility(0);
            return;
        } else
        {
            h.q(c).setVisibility(8);
            return;
        }
    }
}

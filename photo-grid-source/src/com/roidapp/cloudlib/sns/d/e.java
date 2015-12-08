// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.d;

import android.view.View;
import android.widget.LinearLayout;
import com.roidapp.baselib.e.l;
import com.roidapp.cloudlib.sns.upload.UploadProgressStatusView;
import com.roidapp.cloudlib.sns.upload.i;

// Referenced classes of package com.roidapp.cloudlib.sns.d:
//            a

final class e
    implements android.view.View.OnClickListener
{

    final UploadProgressStatusView a;
    final i b;
    final a c;

    e(a a1, UploadProgressStatusView uploadprogressstatusview, i j)
    {
        c = a1;
        a = uploadprogressstatusview;
        b = j;
        super();
    }

    public final void onClick(View view)
    {
        int j = view.getId();
        if (j == UploadProgressStatusView.b())
        {
            com.roidapp.cloudlib.sns.upload.e.a().b(b.e);
            com.roidapp.cloudlib.sns.d.a.J(c).removeView(a);
        } else
        if (j == UploadProgressStatusView.c())
        {
            if (!l.b(c.getActivity()))
            {
                l.a(c.getActivity(), null);
                return;
            }
            com.roidapp.cloudlib.sns.upload.e.a().b(b.e);
            com.roidapp.cloudlib.sns.upload.e.a(c.getActivity(), b);
        }
        if (com.roidapp.cloudlib.sns.d.a.J(c) != null && com.roidapp.cloudlib.sns.d.a.J(c).getChildCount() > 0)
        {
            com.roidapp.cloudlib.sns.d.a.K(c).setVisibility(0);
            return;
        } else
        {
            com.roidapp.cloudlib.sns.d.a.K(c).setVisibility(8);
            return;
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.view.View;
import com.kik.h.c;
import kik.android.util.cq;
import kik.android.util.p;

// Referenced classes of package kik.android.widget:
//            BugmeBarView, h, g, f

final class e
    implements android.view.View.OnClickListener
{

    final BugmeBarView a;

    e(BugmeBarView bugmebarview)
    {
        a = bugmebarview;
        super();
    }

    public final void onClick(View view)
    {
        BugmeBarView.a(a, true);
        if (p.a().c())
        {
            view = (new kik.android.chat.fragment.KikDialogFragment.a(a.getResources())).a(cq.a()).b(0x7f090149).b(true).a(new h(this)).a(0x7f090300, new g(this)).b(0x7f090299, new f(this));
            BugmeBarView.b(a).a(view.a());
            return;
        } else
        {
            p.a().a(kik.android.widget.BugmeBarView.c(a), BugmeBarView.d(a));
            return;
        }
    }
}

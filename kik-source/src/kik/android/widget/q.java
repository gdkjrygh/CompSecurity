// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.view.View;
import com.kik.g.p;
import kik.android.b.g;

// Referenced classes of package kik.android.widget:
//            ContentLinkView, r

final class q
    implements android.view.View.OnClickListener
{

    final ContentLinkView a;

    q(ContentLinkView contentlinkview)
    {
        a = contentlinkview;
        super();
    }

    public final void onClick(View view)
    {
        ContentLinkView.c(a).a(a.getContext(), ContentLinkView.a(a), ContentLinkView.b(a)).a(new r(this));
    }
}

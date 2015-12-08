// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.View;
import android.view.ViewGroup;
import com.kik.cards.web.video.b;
import kik.android.widget.WebVideoView;

// Referenced classes of package kik.android.chat.fragment:
//            WebVideoFragment

final class ts
    implements android.view.View.OnClickListener
{

    final WebVideoFragment a;

    ts(WebVideoFragment webvideofragment)
    {
        a = webvideofragment;
        super();
    }

    public final void onClick(View view)
    {
        a._errorLayout.setVisibility(8);
        a._loadingLayout.setVisibility(0);
        WebVideoFragment.c(a).j();
        WebVideoFragment.d(a).removeView(WebVideoFragment.c(a));
        WebVideoFragment.d(a).addView(WebVideoFragment.c(a));
        WebVideoFragment.c(a).k();
        WebVideoFragment.a(a).d();
        WebVideoFragment.a(a).l();
    }
}

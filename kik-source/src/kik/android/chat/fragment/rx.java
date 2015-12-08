// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.widget.ImageView;
import kik.android.widget.VideoKeyFrameView;

// Referenced classes of package kik.android.chat.fragment:
//            rv, VideoTrimmingFragment

final class rx
    implements Runnable
{

    final rv a;

    rx(rv rv1)
    {
        a = rv1;
        super();
    }

    public final void run()
    {
        a.a._videoPlayIcon.setVisibility(0);
        a.a._videoKeyFrameView.c(a.a._videoKeyFrameView.b());
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.video.trim.VideoTrimView;

public final class ovz extends AnimatorListenerAdapter
{

    private ovl a;
    private VideoTrimView b;

    public ovz(VideoTrimView videotrimview, ovl ovl)
    {
        b = videotrimview;
        a = ovl;
        super();
    }

    public final void onAnimationEnd(Animator animator)
    {
        VideoTrimView.a(b, a);
    }
}

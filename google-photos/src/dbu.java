// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.moviemaker.ui.VideoTrimView;

public final class dbu extends AnimatorListenerAdapter
{

    private ovl a;
    private VideoTrimView b;

    public dbu(VideoTrimView videotrimview, ovl ovl)
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

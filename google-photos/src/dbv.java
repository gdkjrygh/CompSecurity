// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.moviemaker.ui.VideoTrimView;

public final class dbv
    implements Runnable
{

    private ovr a;
    private VideoTrimView b;

    public dbv(VideoTrimView videotrimview, ovr ovr)
    {
        b = videotrimview;
        a = ovr;
        super();
    }

    public final void run()
    {
        while (VideoTrimView.j(b).a() || a != VideoTrimView.k(b)) 
        {
            return;
        }
        VideoTrimView.a(b, VideoTrimView.l(b));
        VideoTrimView.a(b, VideoTrimView.m(b));
    }
}

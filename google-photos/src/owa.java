// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.libraries.video.trim.VideoTrimView;

public final class owa
    implements Runnable
{

    private ovr a;
    private VideoTrimView b;

    public owa(VideoTrimView videotrimview, ovr ovr)
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

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.libraries.video.preview.VideoWithPreviewView;

public final class ouc
    implements Runnable
{

    private ovg a;
    private boolean b;
    private VideoWithPreviewView c;

    ouc(VideoWithPreviewView videowithpreviewview, ovg ovg1, boolean flag)
    {
        c = videowithpreviewview;
        a = ovg1;
        b = flag;
        super();
    }

    public final void run()
    {
        c.a(a, b);
        a.e();
    }
}

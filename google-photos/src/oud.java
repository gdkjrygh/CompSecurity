// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.libraries.video.preview.VideoWithPreviewView;

public final class oud
    implements Runnable
{

    private int a;
    private VideoWithPreviewView b;

    public oud(VideoWithPreviewView videowithpreviewview, int i)
    {
        b = videowithpreviewview;
        a = i;
        super();
    }

    public final void run()
    {
        if (VideoWithPreviewView.a(b) != null)
        {
            VideoWithPreviewView.a(b, a);
        }
    }
}

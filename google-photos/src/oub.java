// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.libraries.video.preview.VideoWithPreviewView;

public final class oub
    implements Runnable
{

    private VideoWithPreviewView a;

    public oub(VideoWithPreviewView videowithpreviewview)
    {
        a = videowithpreviewview;
        super();
    }

    public final void run()
    {
        a.c();
    }
}

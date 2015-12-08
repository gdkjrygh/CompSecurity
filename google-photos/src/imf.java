// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Message;
import com.google.android.apps.photos.slideshow.SlideshowService;

public final class imf
    implements android.os.Handler.Callback
{

    private SlideshowService a;

    public imf(SlideshowService slideshowservice)
    {
        a = slideshowservice;
        super();
    }

    public final boolean handleMessage(Message message)
    {
        if (message.what == 1)
        {
            (new img(a)).execute(new emp[] {
                SlideshowService.a(a, SlideshowService.a(a))
            });
        }
        return true;
    }
}

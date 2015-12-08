// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.display;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;
import com.brightcove.player.display.tasks.LoadImageTask;
import com.brightcove.player.event.AbstractComponent;
import com.brightcove.player.event.Component;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.util.ErrorUtil;

// Referenced classes of package com.brightcove.player.display:
//            y

public class VideoStillDisplayComponent extends AbstractComponent
    implements Component
{

    public static final String TAG = com/brightcove/player/display/VideoStillDisplayComponent.getSimpleName();
    private ImageView a;
    private LoadImageTask b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;

    public VideoStillDisplayComponent(ImageView imageview, EventEmitter eventemitter)
    {
        super(eventemitter, com/brightcove/player/display/VideoStillDisplayComponent);
        if (imageview == null)
        {
            throw new IllegalArgumentException(ErrorUtil.getMessage("imageViewRequired"));
        } else
        {
            a = imageview;
            addListener("setVideoStill", new y(this, null));
            return;
        }
    }

    static int a(VideoStillDisplayComponent videostilldisplaycomponent, int i1)
    {
        videostilldisplaycomponent.c = i1;
        return i1;
    }

    static ImageView a(VideoStillDisplayComponent videostilldisplaycomponent)
    {
        return videostilldisplaycomponent.a;
    }

    static LoadImageTask a(VideoStillDisplayComponent videostilldisplaycomponent, LoadImageTask loadimagetask)
    {
        videostilldisplaycomponent.b = loadimagetask;
        return loadimagetask;
    }

    private void a()
    {
        android.graphics.drawable.Drawable drawable = a.getDrawable();
        if (drawable != null && (drawable instanceof BitmapDrawable))
        {
            ((BitmapDrawable)drawable).getBitmap().recycle();
        }
    }

    static int b(VideoStillDisplayComponent videostilldisplaycomponent, int i1)
    {
        videostilldisplaycomponent.d = i1;
        return i1;
    }

    static LoadImageTask b(VideoStillDisplayComponent videostilldisplaycomponent)
    {
        return videostilldisplaycomponent.b;
    }

    static int c(VideoStillDisplayComponent videostilldisplaycomponent, int i1)
    {
        videostilldisplaycomponent.e = i1;
        return i1;
    }

    static void c(VideoStillDisplayComponent videostilldisplaycomponent)
    {
        videostilldisplaycomponent.a();
    }

    static int d(VideoStillDisplayComponent videostilldisplaycomponent)
    {
        return videostilldisplaycomponent.c;
    }

    static int d(VideoStillDisplayComponent videostilldisplaycomponent, int i1)
    {
        videostilldisplaycomponent.f = i1;
        return i1;
    }

    static int e(VideoStillDisplayComponent videostilldisplaycomponent, int i1)
    {
        videostilldisplaycomponent.g = i1;
        return i1;
    }

    static EventEmitter e(VideoStillDisplayComponent videostilldisplaycomponent)
    {
        return videostilldisplaycomponent.F;
    }

    static int f(VideoStillDisplayComponent videostilldisplaycomponent)
    {
        return videostilldisplaycomponent.d;
    }

    static int f(VideoStillDisplayComponent videostilldisplaycomponent, int i1)
    {
        videostilldisplaycomponent.h = i1;
        return i1;
    }

    static EventEmitter g(VideoStillDisplayComponent videostilldisplaycomponent)
    {
        return videostilldisplaycomponent.F;
    }

    static int h(VideoStillDisplayComponent videostilldisplaycomponent)
    {
        return videostilldisplaycomponent.e;
    }

    static EventEmitter i(VideoStillDisplayComponent videostilldisplaycomponent)
    {
        return videostilldisplaycomponent.F;
    }

    static int j(VideoStillDisplayComponent videostilldisplaycomponent)
    {
        return videostilldisplaycomponent.f;
    }

    static EventEmitter k(VideoStillDisplayComponent videostilldisplaycomponent)
    {
        return videostilldisplaycomponent.F;
    }

    static int l(VideoStillDisplayComponent videostilldisplaycomponent)
    {
        return videostilldisplaycomponent.g;
    }

    static EventEmitter m(VideoStillDisplayComponent videostilldisplaycomponent)
    {
        return videostilldisplaycomponent.F;
    }

    static int n(VideoStillDisplayComponent videostilldisplaycomponent)
    {
        return videostilldisplaycomponent.h;
    }

    static EventEmitter o(VideoStillDisplayComponent videostilldisplaycomponent)
    {
        return videostilldisplaycomponent.F;
    }

    static EventEmitter p(VideoStillDisplayComponent videostilldisplaycomponent)
    {
        return videostilldisplaycomponent.F;
    }

    static EventEmitter q(VideoStillDisplayComponent videostilldisplaycomponent)
    {
        return videostilldisplaycomponent.F;
    }

    static EventEmitter r(VideoStillDisplayComponent videostilldisplaycomponent)
    {
        return videostilldisplaycomponent.F;
    }

    static EventEmitter s(VideoStillDisplayComponent videostilldisplaycomponent)
    {
        return videostilldisplaycomponent.F;
    }

    static EventEmitter t(VideoStillDisplayComponent videostilldisplaycomponent)
    {
        return videostilldisplaycomponent.F;
    }

    static EventEmitter u(VideoStillDisplayComponent videostilldisplaycomponent)
    {
        return videostilldisplaycomponent.F;
    }

    static EventEmitter v(VideoStillDisplayComponent videostilldisplaycomponent)
    {
        return videostilldisplaycomponent.F;
    }

}

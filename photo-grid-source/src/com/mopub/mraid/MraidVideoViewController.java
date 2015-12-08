// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mraid;

import android.content.Context;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.VideoView;
import com.mopub.common.util.Dips;
import com.mopub.common.util.Drawables;
import com.mopub.mobileads.BaseVideoViewController;

// Referenced classes of package com.mopub.mraid:
//            ai, aj, ak

public class MraidVideoViewController extends BaseVideoViewController
{

    private final VideoView a;
    private ImageButton b;
    private int c;
    private int d;

    public MraidVideoViewController(Context context, Bundle bundle, com.mopub.mobileads.BaseVideoViewController.BaseVideoViewControllerListener basevideoviewcontrollerlistener)
    {
        super(context, null, basevideoviewcontrollerlistener);
        a = new VideoView(context);
        a.setOnCompletionListener(new ai(this));
        a.setOnErrorListener(new aj(this));
        a.setVideoPath(bundle.getString("video_url"));
    }

    static ImageButton a(MraidVideoViewController mraidvideoviewcontroller)
    {
        return mraidvideoviewcontroller.b;
    }

    static void b(MraidVideoViewController mraidvideoviewcontroller)
    {
        mraidvideoviewcontroller.a(true);
    }

    static void c(MraidVideoViewController mraidvideoviewcontroller)
    {
        mraidvideoviewcontroller.h();
    }

    static com.mopub.mobileads.BaseVideoViewController.BaseVideoViewControllerListener d(MraidVideoViewController mraidvideoviewcontroller)
    {
        return mraidvideoviewcontroller.f();
    }

    protected final void a()
    {
        super.a();
        d = Dips.asIntPixels(50F, g());
        c = Dips.asIntPixels(8F, g());
        b = new ImageButton(g());
        Object obj = new StateListDrawable();
        android.graphics.drawable.Drawable drawable = Drawables.INTERSTITIAL_CLOSE_BUTTON_NORMAL.createDrawable(g());
        ((StateListDrawable) (obj)).addState(new int[] {
            0xfefeff59
        }, drawable);
        drawable = Drawables.INTERSTITIAL_CLOSE_BUTTON_PRESSED.createDrawable(g());
        ((StateListDrawable) (obj)).addState(new int[] {
            0x10100a7
        }, drawable);
        b.setImageDrawable(((android.graphics.drawable.Drawable) (obj)));
        b.setBackgroundDrawable(null);
        b.setOnClickListener(new ak(this));
        obj = new android.widget.RelativeLayout.LayoutParams(d, d);
        ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(11);
        ((android.widget.RelativeLayout.LayoutParams) (obj)).setMargins(c, 0, c, 0);
        getLayout().addView(b, ((android.view.ViewGroup.LayoutParams) (obj)));
        b.setVisibility(8);
        a.start();
    }

    protected final VideoView b()
    {
        return a;
    }

    protected final void c()
    {
    }

    protected final void d()
    {
    }

    protected final void e()
    {
    }
}

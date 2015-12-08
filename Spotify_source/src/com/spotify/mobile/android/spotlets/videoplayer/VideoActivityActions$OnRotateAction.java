// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.videoplayer;

import android.view.View;
import flq;

// Referenced classes of package com.spotify.mobile.android.spotlets.videoplayer:
//            FullscreenVideoActivity

public abstract class <init> extends Enum
{

    public static final b a;
    public static final b b;
    private static final b c[];

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(com/spotify/mobile/android/spotlets/videoplayer/VideoActivityActions$OnRotateAction, s);
    }

    public static <init>[] values()
    {
        return (<init>[])c.clone();
    }

    abstract void a(FullscreenVideoActivity fullscreenvideoactivity);

    static 
    {
        a = new VideoActivityActions.OnRotateAction("ROTATE") {

            public final void a(FullscreenVideoActivity fullscreenvideoactivity)
            {
                fullscreenvideoactivity.d.b();
            }

        };
        b = new VideoActivityActions.OnRotateAction("CLOSE") {

            public final void a(FullscreenVideoActivity fullscreenvideoactivity)
            {
                fullscreenvideoactivity.d.o.setVisibility(4);
                fullscreenvideoactivity.finish();
            }

        };
        c = (new c[] {
            a, b
        });
    }

    private _cls2(String s, int i)
    {
        super(s, i);
    }

    _cls2(String s, int i, byte byte0)
    {
        this(s, i);
    }
}

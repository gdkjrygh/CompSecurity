// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.apps.photos.videoplayer.view.VideoSurfaceView;

final class jhi
    implements jhh
{

    private static final onj b = new onj("debug.videoplayer.surfaceview");
    private final Context a;

    jhi(Context context)
    {
        a = context;
    }

    public final jhg a(ViewGroup viewgroup, boolean flag)
    {
        boolean flag1;
        if (android.os.Build.VERSION.SDK_INT >= 23 && !flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            VideoSurfaceView videosurfaceview = (VideoSurfaceView)viewgroup.findViewById(b.CI);
            return new jgy(a, viewgroup, videosurfaceview);
        } else
        {
            return new jhf(a, viewgroup, null);
        }
    }

}

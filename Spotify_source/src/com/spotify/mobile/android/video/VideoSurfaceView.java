// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.video;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.Assertion;
import com.squareup.picasso.Picasso;
import ctz;
import dmz;
import fbn;
import gft;
import gjy;
import gkk;
import gkl;
import gmr;
import gwb;

// Referenced classes of package com.spotify.mobile.android.video:
//            VideoSurfacePriority

public class VideoSurfaceView extends FrameLayout
{

    public TextureView a;
    public ProgressBar b;
    public gjy c;
    public gkk d;
    public VideoSurfacePriority e;
    public ScaleType f;
    public Surface g;
    public android.view.TextureView.SurfaceTextureListener h;
    public PlayerTrack i;
    public long j;
    public boolean k;
    public final android.view.TextureView.SurfaceTextureListener l;
    private Context m;
    private ImageView n;
    private Matrix o;
    private Flags p;
    private Handler q;
    private int r;
    private int s;
    private final Runnable t;

    public VideoSurfaceView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        f = ScaleType.a;
        q = new Handler();
        j = -1L;
        t = new Runnable() {

            private VideoSurfaceView a;

            public final void run()
            {
                if (VideoSurfaceView.a(a) != null)
                {
                    VideoSurfaceView.a(a).setVisibility(0);
                }
            }

            
            {
                a = VideoSurfaceView.this;
                super();
            }
        };
        l = new android.view.TextureView.SurfaceTextureListener() {

            private VideoSurfaceView a;

            public final void onSurfaceTextureAvailable(SurfaceTexture surfacetexture, int i1, int j1)
            {
                a.g = new Surface(surfacetexture);
                if (VideoSurfaceView.b(a) != null)
                {
                    VideoSurfaceView.b(a).onSurfaceTextureAvailable(surfacetexture, i1, j1);
                }
            }

            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfacetexture)
            {
                VideoSurfaceView videosurfaceview = a;
                if (videosurfaceview.d != null)
                {
                    videosurfaceview.d.d();
                }
                boolean flag1 = true;
                if (VideoSurfaceView.b(a) != null)
                {
                    flag1 = VideoSurfaceView.b(a).onSurfaceTextureDestroyed(surfacetexture);
                }
                if (a.g != null)
                {
                    a.g.release();
                }
                return flag1;
            }

            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfacetexture, int i1, int j1)
            {
                if (VideoSurfaceView.b(a) != null)
                {
                    VideoSurfaceView.b(a).onSurfaceTextureSizeChanged(surfacetexture, i1, j1);
                }
            }

            public final void onSurfaceTextureUpdated(SurfaceTexture surfacetexture)
            {
                if (VideoSurfaceView.b(a) != null)
                {
                    VideoSurfaceView.b(a).onSurfaceTextureUpdated(surfacetexture);
                }
            }

            
            {
                a = VideoSurfaceView.this;
                super();
            }
        };
        attributeset = context.getTheme().obtainStyledAttributes(attributeset, gmr.i, 0, 0);
        boolean flag;
        if (!attributeset.hasValue(0))
        {
            Assertion.b("fullscreen attribute on VideoSurfaceView must be explicitly defined!");
        }
        flag = attributeset.getBoolean(0, false);
        attributeset.recycle();
        a(context, flag);
        return;
        context;
        attributeset.recycle();
        throw context;
    }

    VideoSurfaceView(Context context, TextureView textureview, ProgressBar progressbar)
    {
        super(context);
        f = ScaleType.a;
        q = new Handler();
        j = -1L;
        t = new _cls1();
        l = new _cls2();
        a = textureview;
        b = progressbar;
    }

    public VideoSurfaceView(Context context, boolean flag)
    {
        super(context);
        f = ScaleType.a;
        q = new Handler();
        j = -1L;
        t = new _cls1();
        l = new _cls2();
        a(context, flag);
    }

    static ProgressBar a(VideoSurfaceView videosurfaceview)
    {
        return videosurfaceview.b;
    }

    private void a(Context context, boolean flag)
    {
        m = context;
        k = flag;
        e = VideoSurfacePriority.b;
        o = new Matrix();
        context = new android.widget.FrameLayout.LayoutParams(-1, -1);
        a = new TextureView(m);
        a.setLayoutParams(context);
        addView(a);
        a.setSurfaceTextureListener(l);
        context = new android.widget.FrameLayout.LayoutParams(-1, -1);
        n = new ImageView(m);
        n.setLayoutParams(context);
        n.setVisibility(0);
        addView(n);
        a(f);
        b = (ProgressBar)LayoutInflater.from(getContext()).inflate(0x7f03013a, null);
        b.setVisibility(8);
        addView(b);
    }

    static android.view.TextureView.SurfaceTextureListener b(VideoSurfaceView videosurfaceview)
    {
        return videosurfaceview.h;
    }

    public final void a()
    {
        a(true);
        b(false);
        if (d != null)
        {
            d.b();
        }
    }

    public final void a(int i1, int j1)
    {
        r = i1;
        s = j1;
        Object obj = this;
        if (getParent() != null)
        {
            obj = getParent();
        }
        ((ViewParent) (obj)).requestLayout();
    }

    public final void a(PlayerTrack playertrack, long l1)
    {
        i = playertrack;
        j = l1;
        b();
    }

    public final void a(Flags flags)
    {
        p = flags;
        b();
    }

    public final void a(VideoSurfacePriority videosurfacepriority)
    {
        ctz.a(videosurfacepriority);
        e = videosurfacepriority;
    }

    public final void a(ScaleType scaletype)
    {
        if (n == null) goto _L2; else goto _L1
_L1:
        final class _cls3
        {

            static final int a[];

            static 
            {
                a = new int[ScaleType.values().length];
                try
                {
                    a[ScaleType.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[ScaleType.a.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[ScaleType.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls3.a[scaletype.ordinal()];
        JVM INSTR tableswitch 1 3: default 40
    //                   1 41
    //                   2 52
    //                   3 63;
           goto _L2 _L3 _L4 _L5
_L2:
        return;
_L3:
        n.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        return;
_L4:
        n.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        return;
_L5:
        n.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
        return;
    }

    public final void a(boolean flag)
    {
        if (flag)
        {
            n.setVisibility(0);
            b();
            return;
        } else
        {
            n.setVisibility(8);
            return;
        }
    }

    public final void b()
    {
        Picasso picasso = ((gft)dmz.a(gft)).a();
        picasso.a(n);
        android.net.Uri uri;
        if (j >= 0L)
        {
            uri = fbn.a(i, p, j);
            a(f);
        } else
        {
            uri = fbn.c(i);
            n.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        }
        picasso.a(uri).a(n, null);
    }

    public final void b(boolean flag)
    {
        if (flag)
        {
            q.postDelayed(t, 800L);
            return;
        } else
        {
            q.removeCallbacks(t);
            b.setVisibility(8);
            return;
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        ((gkl)dmz.a(gkl)).b(this);
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        super.onLayout(flag, i1, j1, k1, l1);
        int k2 = getPaddingLeft();
        int i2 = getPaddingTop();
        int l2 = getPaddingRight();
        int j2 = getPaddingBottom();
        i1 = (k1 - i1 - l2 - k2) / 2;
        j1 = (l1 - j1 - j2 - i2) / 2;
        k1 = b.getMeasuredWidth() / 2;
        l1 = b.getMeasuredHeight() / 2;
        b.layout(i1 - k1, j1 - l1, i1 + k1, j1 + l1);
    }

    protected void onMeasure(int i1, int j1)
    {
        double d1;
        int k1;
        int l1;
        int i2;
        if (r == 0 && s == 0)
        {
            super.onMeasure(i1, j1);
            b.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
            return;
        }
        d1 = (double)s / (double)r;
        k1 = android.view.View.MeasureSpec.getMode(i1);
        i2 = android.view.View.MeasureSpec.getMode(j1);
        l1 = f.mType;
        int ai[];
        View view;
        if (k1 == 0x80000000)
        {
            k1 = android.view.View.MeasureSpec.getSize(i1);
            l1 |= 1;
        } else
        if (k1 == 0x40000000)
        {
            l1 |= 2;
            k1 = 0;
        } else
        {
            l1 |= 1;
            k1 = 0x7fffffff;
        }
        if (i2 == 0x80000000)
        {
            int j2 = android.view.View.MeasureSpec.getSize(j1);
            i2 = l1 | 4;
            l1 = j2;
        } else
        if (i2 == 0x40000000)
        {
            i2 = l1 | 8;
            l1 = 0;
        } else
        {
            i2 = l1 | 4;
            l1 = 0x7fffffff;
        }
        i2;
        JVM INSTR lookupswitch 12: default 224
    //                   21: 488
    //                   22: 511
    //                   25: 530
    //                   26: 549
    //                   37: 488
    //                   38: 566
    //                   41: 584
    //                   42: 549
    //                   69: 488
    //                   70: 566
    //                   73: 584
    //                   74: 549;
           goto _L1 _L2 _L3 _L4 _L5 _L2 _L6 _L7 _L5 _L2 _L6 _L7 _L5
_L1:
        Assertion.a((new StringBuilder("Invalid combination: ")).append(Integer.toHexString(i2)).toString());
        i1 = 0;
        j1 = 0;
_L9:
        d1 = (double)s / (double)r;
        if (i1 > (int)((double)j1 * d1))
        {
            if (f == ScaleType.b)
            {
                l1 = (int)((double)i1 / d1);
                k1 = i1;
            } else
            {
                if (f != ScaleType.a)
                {
                    break MISSING_BLOCK_LABEL_746;
                }
                k1 = (int)(d1 * (double)j1);
                l1 = j1;
            }
        } else
        if (f == ScaleType.b)
        {
            k1 = (int)(d1 * (double)j1);
            l1 = j1;
        } else
        {
            if (f != ScaleType.a)
            {
                break MISSING_BLOCK_LABEL_746;
            }
            l1 = (int)((double)i1 / d1);
            k1 = i1;
        }
          goto _L8
_L2:
        j1 = Math.min(r, k1);
        i1 = Math.min(s, l1);
          goto _L9
_L3:
        j1 = android.view.View.MeasureSpec.getSize(i1);
        i1 = Math.min((int)(d1 * (double)j1), l1);
          goto _L9
_L4:
        i1 = android.view.View.MeasureSpec.getSize(j1);
        j1 = Math.min((int)((double)i1 / d1), k1);
          goto _L9
_L5:
        k1 = android.view.View.MeasureSpec.getSize(i1);
        i1 = android.view.View.MeasureSpec.getSize(j1);
        j1 = k1;
          goto _L9
_L6:
        j1 = android.view.View.MeasureSpec.getSize(i1);
        i1 = Math.min(s, l1);
          goto _L9
_L7:
        k1 = Math.min(r, k1);
        i1 = android.view.View.MeasureSpec.getSize(j1);
        j1 = k1;
          goto _L9
_L8:
        ai = new int[2];
        ai[0] = l1;
        ai[1] = k1;
        i2 = ai[0];
        int k2 = ai[1];
        int l2 = (j1 - i2) / 2;
        int i3 = (i1 - k2) / 2;
        b.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        k1 = 0;
        while (k1 < getChildCount()) 
        {
            view = getChildAt(k1);
            if (!(view instanceof ProgressBar))
            {
                if (view == null)
                {
                    l1 = 0x80000000;
                } else
                {
                    l1 = 0x40000000;
                }
                view.measure(android.view.View.MeasureSpec.makeMeasureSpec(j1, l1), android.view.View.MeasureSpec.makeMeasureSpec(i1, l1));
            }
            k1++;
        }
        a.getTransform(o);
        o.setScale((float)i2 / (float)j1, (float)k2 / (float)i1);
        o.postTranslate(l2, i3);
        a.setTransform(o);
        setMeasuredDimension(j1, i1);
        return;
        k1 = i1;
        l1 = j1;
        if (true) goto _L8; else goto _L10
_L10:
    }

    private class ScaleType extends Enum
    {

        public static final ScaleType a;
        public static final ScaleType b;
        public static final ScaleType c;
        private static final ScaleType d[];
        final int mType;

        public static ScaleType valueOf(String s1)
        {
            return (ScaleType)Enum.valueOf(com/spotify/mobile/android/video/VideoSurfaceView$ScaleType, s1);
        }

        public static ScaleType[] values()
        {
            return (ScaleType[])d.clone();
        }

        static 
        {
            a = new ScaleType("ASPECT_FIT", 0, 16);
            b = new ScaleType("ASPECT_FILL", 1, 32);
            c = new ScaleType("STRETCH", 2, 64);
            d = (new ScaleType[] {
                a, b, c
            });
        }

        private ScaleType(String s1, int i1, int j1)
        {
            super(s1, i1);
            mType = j1;
        }
    }

}

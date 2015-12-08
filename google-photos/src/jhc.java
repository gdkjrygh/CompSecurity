// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

public class jhc extends TextureView
    implements android.media.MediaPlayer.OnVideoSizeChangedListener, android.view.TextureView.SurfaceTextureListener
{

    final noz a;
    jgw b;
    jfq c;
    android.view.TextureView.SurfaceTextureListener d;
    boolean e;
    boolean f;
    private final noz g;
    private final noz h;

    public jhc(Context context)
    {
        this(context, null);
    }

    private jhc(Context context, AttributeSet attributeset)
    {
        this(context, null, 0);
    }

    private jhc(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, 0);
        g = noz.a(context, "VideoTextureView", new String[0]);
        a = noz.a(context, 2, "VideoTextureView", new String[0]);
        h = noz.a(context, 5, "VideoTextureView", new String[0]);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        setSurfaceTextureListener(this);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        super.onInitializeAccessibilityEvent(accessibilityevent);
        accessibilityevent.setClassName(jhc.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
    {
        super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
        accessibilitynodeinfo.setClassName(jhc.getName());
    }

    protected void onMeasure(int i, int j)
    {
        float f1;
        float f2;
        float f3;
        float f4;
        float f5;
        float f7;
        int k;
        int l;
        if (c == null)
        {
            f1 = 0.0F;
        } else
        {
            f1 = c.c();
        }
        if (c == null)
        {
            f2 = 0.0F;
        } else
        {
            f2 = c.d();
        }
        f3 = getDefaultSize((int)f1, i);
        f4 = getDefaultSize((int)f2, j);
        if (f1 <= 0.0F || f2 <= 0.0F) goto _L2; else goto _L1
_L1:
        k = android.view.View.MeasureSpec.getMode(i);
        i = android.view.View.MeasureSpec.getSize(i);
        l = android.view.View.MeasureSpec.getMode(j);
        j = android.view.View.MeasureSpec.getSize(j);
        if (k != 0x40000000 || l != 0x40000000) goto _L4; else goto _L3
_L3:
        f5 = i;
        f7 = j;
        if (f1 * f7 >= f5 * f2) goto _L6; else goto _L5
_L5:
        f2 = (f1 * f7) / f2;
        f1 = f7;
_L9:
        setMeasuredDimension((int)f2, (int)f1);
        return;
_L6:
        f4 = f7;
        f3 = f5;
        if (f1 * f7 > f5 * f2)
        {
            f1 = (f5 * f2) / f1;
            f2 = f5;
            continue; /* Loop/switch isn't completed */
        }
          goto _L7
_L4:
        if (k == 0x40000000)
        {
            f3 = i;
            f4 = (f2 * f3) / f1;
            f1 = f4;
            f2 = f3;
            if (l == 0x80000000)
            {
                f1 = f4;
                f2 = f3;
                if (f4 > (float)j)
                {
                    f1 = j;
                    f2 = f3;
                }
            }
            continue; /* Loop/switch isn't completed */
        }
        if (l == 0x40000000)
        {
            f3 = j;
            f2 = (f1 * f3) / f2;
            float f6;
            float f8;
            if (k == 0x80000000 && f2 > (float)i)
            {
                f2 = i;
                f1 = f3;
            } else
            {
                f1 = f3;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (l == 0x80000000 && f2 > (float)j)
        {
            f6 = j;
            f8 = (f6 * f1) / f2;
        } else
        {
            f6 = f2;
            f8 = f1;
        }
        f4 = f6;
        f3 = f8;
        if (k == 0x80000000)
        {
            f4 = f6;
            f3 = f8;
            if (f8 > (float)i)
            {
                f3 = i;
                f1 = (f2 * f3) / f1;
                f2 = f3;
                continue; /* Loop/switch isn't completed */
            }
        }
_L7:
        f1 = f4;
        f2 = f3;
        continue; /* Loop/switch isn't completed */
_L2:
        f1 = f4;
        f2 = f3;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfacetexture, int i, int j)
    {
        if (a.a())
        {
            noy.a("VideoTextureView", this);
            noy.a("rawSurfaceTexture", surfacetexture);
        }
        b = new jgw(getContext(), surfacetexture, false);
        if (c != null && (android.os.Build.VERSION.SDK_INT < 16 || c.d == null || c.d.equals(b)))
        {
            c.a(b);
            e = true;
        }
        if (d != null)
        {
            d.onSurfaceTextureAvailable(surfacetexture, i, j);
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfacetexture)
    {
        boolean flag3 = false;
        if (a.a())
        {
            noy.a("VideoTextureView", this);
            noy.a("rawSurfaceTexture", surfacetexture);
        }
        boolean flag;
        boolean flag1;
        if (b != null && !b.e)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!e && flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            if (a.a())
            {
                boolean flag2;
                if (android.os.Build.VERSION.SDK_INT < 16)
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                noy.a("VERSION.SDK_INT < VERSION_CODES.JELLY_BEAN", Boolean.valueOf(flag2));
                flag2 = flag3;
                if (!e)
                {
                    flag2 = true;
                }
                noy.a("!hasDelegatedSurfaceTextureToMediaPlayer", Boolean.valueOf(flag2));
            }
            b.a();
        }
        b = null;
        if (d != null)
        {
            d.onSurfaceTextureDestroyed(surfacetexture);
        }
        return flag1;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfacetexture, int i, int j)
    {
        if (d != null)
        {
            d.onSurfaceTextureSizeChanged(surfacetexture, i, j);
        }
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfacetexture)
    {
        f = true;
        if (d != null)
        {
            d.onSurfaceTextureUpdated(surfacetexture);
        }
    }

    public void onVideoSizeChanged(MediaPlayer mediaplayer, int i, int j)
    {
        requestLayout();
    }

    public String toString()
    {
        String s = String.valueOf(super.toString());
        String s1 = String.valueOf(c);
        String s2 = String.valueOf(b);
        boolean flag = e;
        return (new StringBuilder(String.valueOf(s).length() + 78 + String.valueOf(s1).length() + String.valueOf(s2).length())).append(s).append("{mediaPlayer=").append(s1).append(", surfaceTexture=").append(s2).append(", hasDelegatedSurfaceTextureToMediaPlayer=").append(flag).append("}").toString();
    }
}

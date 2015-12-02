// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.tiles;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.facebook.common.w.j;
import com.facebook.debug.d.e;
import com.facebook.inject.t;
import com.facebook.q;
import com.facebook.widget.f;
import com.facebook.widget.images.UrlImage;
import com.google.common.a.hq;
import java.util.List;

// Referenced classes of package com.facebook.widget.tiles:
//            i, b, j

public class ThreadTileView extends f
{

    private static final int a = Color.argb(127, 255, 255, 255);
    private static final i b[];
    private final b c;
    private final List d;
    private final List e;
    private final Drawable f;
    private final float g;
    private final i h;
    private final boolean i;
    private final Paint j;
    private int k;
    private int l;
    private com.facebook.widget.tiles.j m;
    private int n;
    private int o;
    private int p;

    public ThreadTileView(Context context)
    {
        this(context, null, 0);
    }

    public ThreadTileView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ThreadTileView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        c = (b)getInjector().a(com/facebook/widget/tiles/b);
        attributeset = getContext().obtainStyledAttributes(attributeset, q.ThreadTileView);
        k = attributeset.getDimensionPixelSize(q.ThreadTileView_threadTileSize, -1);
        if (k == -1)
        {
            k = com.facebook.common.w.j.a(context, 50F);
        }
        g = attributeset.getFloat(q.ThreadTileView_bigImageWidthPercent, 0.6666667F);
        i1 = attributeset.getInt(q.ThreadTileView_bigImageLocation, -1);
        if (i1 >= 0)
        {
            h = b[i1];
        } else
        {
            h = i.LEFT;
        }
        i = attributeset.getBoolean(q.ThreadTileView_overlayDivider, false);
        l = com.facebook.common.w.j.a(context, 1.0F);
        if (i)
        {
            j = new Paint();
            j.setStrokeWidth(l);
            j.setColor(a);
        } else
        {
            j = null;
        }
        attributeset.recycle();
        if (getBackground() == null)
        {
            setBackgroundDrawable(new ColorDrawable(-1));
        }
        d = hq.c(3);
        e = hq.c(3);
        f = new ColorDrawable(Color.argb(255, 204, 211, 224));
    }

    private Drawable a(int i1, int j1)
    {
        if (m.b() == null)
        {
            return null;
        } else
        {
            return c.a(m.b(), i1, j1);
        }
    }

    private void a()
    {
        if (m == null)
        {
            return;
        }
        int j1 = m.a();
        int i1 = j1;
        if (j1 == 0)
        {
            i1 = 1;
        }
        if (i1 == n && d.size() >= n)
        {
            b();
            return;
        } else
        {
            n = i1;
            e();
            b();
            requestLayout();
            invalidate();
            return;
        }
    }

    private void a(int i1)
    {
        for (int j1 = d.size(); j1 < i1; j1++)
        {
            UrlImage urlimage = new UrlImage(getContext());
            addView(urlimage);
            d.add(urlimage);
            e.add(new Rect());
        }

    }

    private void b()
    {
        if (n < 2)
        {
            c();
            return;
        } else
        {
            d();
            return;
        }
    }

    private void c()
    {
        UrlImage urlimage = (UrlImage)d.get(0);
        urlimage.setPlaceHolderScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        if (m.a() == 1)
        {
            urlimage.setImageParams(m.a(0, k, k));
            urlimage.setPlaceHolderDrawable(a(k, k));
        }
        if (m.a() == 0)
        {
            urlimage.setImageParams(UrlImage.a);
            urlimage.setPlaceHolderDrawable(a(k, k));
            return;
        } else
        {
            urlimage.setImageParams(m.a(0, k, k));
            urlimage.setPlaceHolderDrawable(a(k, k));
            return;
        }
    }

    private void d()
    {
        Rect rect = (Rect)e.get(0);
        UrlImage urlimage = (UrlImage)d.get(0);
        urlimage.setImageParams(m.a(0, rect.width(), rect.height()));
        setBackground(urlimage);
        rect = (Rect)e.get(1);
        urlimage = (UrlImage)d.get(1);
        urlimage.setImageParams(m.a(1, rect.width(), rect.height()));
        setBackground(urlimage);
        urlimage.setVisibility(0);
        if (n < 3)
        {
            return;
        } else
        {
            Rect rect1 = (Rect)e.get(2);
            UrlImage urlimage1 = (UrlImage)d.get(2);
            urlimage1.setImageParams(m.a(2, rect1.width(), rect1.height()));
            setBackground(urlimage1);
            return;
        }
    }

    private void e()
    {
        if (m != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        a(n);
        if (n != 1) goto _L4; else goto _L3
_L3:
        ((UrlImage)d.get(0)).setPlaceHolderScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        o = 0;
        p = 0;
_L5:
        int i1 = 0;
        while (i1 < d.size()) 
        {
            int j1;
            int k1;
            if (i1 < n)
            {
                if (((UrlImage)d.get(i1)).getVisibility() == 8)
                {
                    ((UrlImage)d.get(i1)).setVisibility(0);
                }
            } else
            {
                ((UrlImage)d.get(i1)).setVisibility(8);
            }
            i1++;
        }
        if (true) goto _L1; else goto _L4
_L4:
        if (i)
        {
            i1 = 0;
        } else
        {
            i1 = l;
        }
        j1 = (int)((float)(k - i1) * g);
        if (n == 2)
        {
            j1 = (k - i1) / 2;
        }
        o = j1;
        if (h == i.LEFT)
        {
            ((Rect)e.get(0)).set(0, 0, j1, k);
        } else
        {
            ((Rect)e.get(0)).set(j1 + i1, 0, k, k);
        }
        if (n == 2)
        {
            if (h == i.LEFT)
            {
                ((Rect)e.get(1)).set(i1 + j1, 0, k, k);
            } else
            {
                ((Rect)e.get(1)).set(0, 0, j1, k);
            }
            p = 0;
        } else
        {
            k1 = (k - i1) / 2;
            p = k1;
            if (h == i.LEFT)
            {
                ((Rect)e.get(1)).set(j1 + i1, 0, k, k1);
                ((Rect)e.get(2)).set(j1 + i1, i1 + k1, k, k);
            } else
            {
                ((Rect)e.get(1)).set(0, 0, j1, k1);
                ((Rect)e.get(2)).set(0, i1 + k1, j1, k);
            }
        }
          goto _L5
    }

    private void setBackground(UrlImage urlimage)
    {
        urlimage.setPlaceHolderDrawable(f);
    }

    protected void dispatchDraw(Canvas canvas)
    {
label0:
        {
            super.dispatchDraw(canvas);
            if (i && o != 0)
            {
                canvas.drawLine(o, 0.0F, o, k, j);
                if (h != i.RIGHT)
                {
                    break label0;
                }
                canvas.drawLine(0.0F, p, o, p, j);
            }
            return;
        }
        canvas.drawLine(o, p, k, p, j);
    }

    public int getTileSizePx()
    {
        return k;
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        e e1 = com.facebook.debug.d.e.a("ThreadTileView.onLayout");
        if (n == 1)
        {
            UrlImage urlimage = (UrlImage)d.get(0);
            urlimage.layout(getPaddingLeft(), getPaddingTop(), getPaddingLeft() + urlimage.getMeasuredWidth(), getPaddingTop() + urlimage.getMeasuredHeight());
        } else
        {
            i1 = 0;
            while (i1 < n) 
            {
                UrlImage urlimage1 = (UrlImage)d.get(i1);
                Rect rect = (Rect)e.get(i1);
                urlimage1.layout(rect.left, rect.top, rect.right, rect.bottom);
                i1++;
            }
        }
        e1.a();
    }

    protected void onMeasure(int i1, int j1)
    {
        int k1 = 0;
        e e1 = com.facebook.debug.d.e.a("ThreadTileView.onMeasure");
        int i2 = 0 + (getPaddingLeft() + getPaddingRight());
        int l1 = 0 + (getPaddingTop() + getPaddingBottom());
        a(n);
        if (n == 1)
        {
            UrlImage urlimage = (UrlImage)d.get(0);
            measureChildWithMargins(urlimage, i1, 0, j1, 0);
            k1 = Math.max(i2, urlimage.getMeasuredWidth());
            l1 = Math.max(l1, urlimage.getMeasuredHeight());
        } else
        {
            for (; k1 < n; k1++)
            {
                UrlImage urlimage1 = (UrlImage)d.get(k1);
                Rect rect = (Rect)e.get(k1);
                urlimage1.measure(android.view.View.MeasureSpec.makeMeasureSpec(rect.width(), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(rect.height(), 0x40000000));
            }

            k1 = i2;
        }
        l1 = Math.max(l1, getSuggestedMinimumHeight());
        setMeasuredDimension(resolveSize(Math.max(k1, getSuggestedMinimumWidth()), i1), resolveSize(l1, j1));
        e1.a();
    }

    public void setThreadTileViewData(com.facebook.widget.tiles.j j1)
    {
        m = j1;
        a();
    }

    public void setTileSizePx(int i1)
    {
        k = i1;
        a();
    }

    static 
    {
        b = (new i[] {
            i.LEFT, i.RIGHT
        });
    }
}

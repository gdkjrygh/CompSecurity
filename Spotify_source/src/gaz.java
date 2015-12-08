// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.logging.Logger;
import com.squareup.picasso.Picasso;

public final class gaz extends Drawable
    implements gwi, lu
{

    private Bitmap a;
    private final Rect b = new Rect();
    private final Rect c = new Rect();
    private final int d;
    private int e;
    private int f;
    private int g;
    private final Paint h = new Paint();
    private boolean i;

    public gaz(int j, int k)
    {
        ((gft)dmz.a(gft)).a().a(0x7f020083).b(0, k).a(this);
        if (j > 0)
        {
            d = j;
            return;
        } else
        {
            Assertion.b("Created with 0 splits, setting splits to 1 to avoid division by zero");
            d = 1;
            return;
        }
    }

    private void a(int j, float f1)
    {
        f1 = (float)j + f1;
        if (a != null)
        {
            b.left = (int)Math.floor((float)e * f1);
            b.right = (int)Math.ceil(f1 * (float)e + (float)f);
        }
    }

    private void a(Rect rect)
    {
        if (a == null)
        {
            return;
        }
        int j = rect.width();
        int k = rect.height();
        int l = a.getWidth();
        int i1 = a.getHeight();
        if (l < j && l < i1)
        {
            Logger.a("Bitmap not suitable for parallax on current device.", new Object[0]);
        }
        b.top = 0;
        b.bottom = i1;
        f = (int)Math.ceil((float)j / ((float)k / (float)i1));
        e = (l - f) / d;
        c.left = 0;
        c.top = 0;
        c.right = j;
        c.bottom = k;
        a(g, 0.0F);
    }

    public final void a(int j)
    {
    }

    public final void a(int j, float f1, int k)
    {
        a(j, f1);
        g = j;
    }

    public final void a(Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom loadedfrom)
    {
        a = bitmap;
        if (i)
        {
            a(getBounds());
        }
        invalidateSelf();
    }

    public final void a(Drawable drawable)
    {
        Assertion.b("Failed to load bitmap");
    }

    public final void b(int j)
    {
    }

    public final void b(Drawable drawable)
    {
    }

    public final void draw(Canvas canvas)
    {
        if (a != null)
        {
            canvas.drawBitmap(a, b, c, h);
        }
    }

    public final int getOpacity()
    {
        return a == null || !a.hasAlpha() ? -1 : -3;
    }

    protected final void onBoundsChange(Rect rect)
    {
        super.onBoundsChange(rect);
        i = true;
        a(rect);
    }

    public final void setAlpha(int j)
    {
        h.setAlpha(j);
    }

    public final void setColorFilter(ColorFilter colorfilter)
    {
        h.setColorFilter(colorfilter);
    }
}

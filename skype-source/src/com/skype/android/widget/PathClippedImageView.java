// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.StateSet;
import android.widget.ImageView;

// Referenced classes of package com.skype.android.widget:
//            PathType

public class PathClippedImageView extends ImageView
{

    private static final PorterDuffXfermode a;
    private static final int s[] = {
        0x10100a7
    };
    private Paint b;
    private Path c;
    private int d;
    private ColorStateList e;
    private int f;
    private Paint g;
    private Path h;
    private Paint i;
    private Path j;
    private Bitmap k;
    private Canvas l;
    private boolean m;
    private float n;
    private Drawable o;
    private boolean p;
    private boolean q;
    private boolean r;
    private PathType t;
    private RectF u;
    private boolean v;

    public PathClippedImageView(Context context)
    {
        super(context);
        a(((AttributeSet) (null)), R.attr.pathClippedImageViewStyle);
    }

    public PathClippedImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a(attributeset, R.attr.pathClippedImageViewStyle);
    }

    public PathClippedImageView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        a(attributeset, i1);
    }

    private void a()
    {
        if (u == null)
        {
            u = new RectF();
        }
        float f1 = getWidth();
        float f2 = getHeight();
        if (m)
        {
            u.set(0.0F, 0.0F, f1, f2);
        } else
        {
            float f3 = f1 / 4F;
            float f4 = f2 / 4F;
            u.set(-1F * f3, -1F * f4, f3 + f1, f4 + f2);
        }
        t.b(h, u);
        g.setPathEffect(t.a(u.width()));
        b.setPathEffect(t.a(u.width()));
        if (m)
        {
            f1 = (int)((float)d / 2.0F);
            u.set(u.left + f1, u.top + f1, u.right - f1, u.bottom - f1);
            u.inset(-1F, -1F);
            if (d > 0)
            {
                t.b(c, u);
            }
            if (r)
            {
                t.b(j, u);
            }
        }
    }

    private void a(int i1, int j1)
    {
        e = new ColorStateList(new int[][] {
            s, StateSet.WILD_CARD
        }, new int[] {
            j1, i1
        });
    }

    private void a(AttributeSet attributeset, int i1)
    {
        m = true;
        attributeset = getContext().obtainStyledAttributes(attributeset, R.styleable.PathClippedImageView, i1, R.style.PathClippedImageView);
        e = attributeset.getColorStateList(0);
        if (isInEditMode())
        {
            a(getContext().getResources().getColor(R.color.white), getContext().getResources().getColor(R.color.white));
        }
        n = attributeset.getFloat(2, 0.0F);
        d = attributeset.getDimensionPixelSize(1, getResources().getDimensionPixelSize(R.dimen.avatar_stroke_width));
        b = new Paint();
        b.setAntiAlias(true);
        b.setStyle(android.graphics.Paint.Style.STROKE);
        c = new Path();
        v = attributeset.getBoolean(4, false);
        i = new Paint();
        i.setColor(getResources().getColor(R.color.skype_blue));
        i.setStyle(android.graphics.Paint.Style.STROKE);
        i.setStrokeWidth(getResources().getDimensionPixelSize(R.dimen.avatar_dash_border_width));
        i.setAntiAlias(true);
        j = new Path();
        float f1 = getResources().getDimensionPixelSize(R.dimen.avatar_dash_border_gaps);
        i.setPathEffect(new DashPathEffect(new float[] {
            f1, f1
        }, 0.0F));
        String s1 = attributeset.getString(3);
        if (s1 != null)
        {
            t = PathType.valueOf(s1);
        } else
        {
            t = PathType.a;
        }
        g = new Paint();
        h = new Path();
        o = getResources().getDrawable(R.drawable.avatar_protection);
        f = getResources().getColor(R.color.image_click_overlay);
        attributeset.recycle();
        a();
    }

    private int b()
    {
        return e.getColorForState(s, e.getDefaultColor());
    }

    public final void a(boolean flag)
    {
        p = flag;
    }

    protected void drawableStateChanged()
    {
        invalidate();
        super.drawableStateChanged();
    }

    public CharSequence getContentDescription()
    {
        CharSequence charsequence = super.getContentDescription();
        Object obj = charsequence;
        if (TextUtils.isEmpty(charsequence))
        {
            obj = ",";
        }
        return ((CharSequence) (obj));
    }

    protected void onDraw(Canvas canvas)
    {
        Drawable drawable;
        int i1;
        int j1;
        int k1;
        int i2;
        drawable = getDrawable();
        j1 = getWidth();
        i1 = getHeight();
        k1 = j1 / 2;
        if (isPressed())
        {
            i2 = b();
        } else
        {
            i2 = e.getDefaultColor();
        }
        if (!m)
        {
            break MISSING_BLOCK_LABEL_420;
        }
        if (drawable != null) goto _L2; else goto _L1
_L1:
        super.onDraw(canvas);
_L4:
        return;
_L2:
        int k2 = canvas.saveLayer(0.0F, 0.0F, j1, i1, g, 31);
        canvas.drawColor(0);
        g.setColor(0xff000000);
        g.setAntiAlias(true);
        canvas.drawPath(h, g);
        android.graphics.Xfermode xfermode = g.getXfermode();
        g.setXfermode(a);
        float f1 = (float)drawable.getIntrinsicWidth() / (float)drawable.getIntrinsicHeight();
        int l1;
        if (f1 > 1.0F)
        {
            k1 = (int)((float)i1 * f1);
            l1 = 0;
            j1 = (j1 - k1) / 2;
            k1 = j1 + k1;
        } else
        if (f1 < 1.0F)
        {
            int l2 = (int)((float)j1 / f1);
            l1 = 0;
            k1 = j1;
            int j2 = (i1 - l2) / 2;
            i1 = j2 + l2;
            j1 = l1;
            l1 = j2;
        } else
        {
            boolean flag = false;
            l1 = 0;
            k1 = j1;
            j1 = ((flag) ? 1 : 0);
        }
        drawable.setBounds(j1, l1, k1, i1);
        drawable.draw(l);
        if (p)
        {
            o.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            o.draw(l);
        }
        if (q && isPressed())
        {
            l.drawColor(f);
        }
        canvas.drawBitmap(k, 0.0F, 0.0F, g);
        g.setXfermode(xfermode);
        canvas.restoreToCount(k2);
        if (d > 0)
        {
            b.setStrokeWidth(d);
            b.setColor(i2);
            canvas.drawPath(c, b);
        }
        if (!r) goto _L4; else goto _L3
_L3:
        canvas.drawPath(j, i);
        return;
        super.onDraw(canvas);
        if (p)
        {
            o.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            o.draw(canvas);
        }
        if (q && isPressed())
        {
            canvas.drawColor(f);
        }
        g.setColor(i2);
        g.setAntiAlias(true);
        g.setStyle(android.graphics.Paint.Style.STROKE);
        g.setStrokeWidth(k1);
        canvas.drawPath(h, g);
        return;
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        super.onLayout(flag, i1, j1, k1, l1);
        k1 = getWidth();
        int i2 = getHeight();
        l1 = i2;
        j1 = k1;
        if (isInEditMode())
        {
            j1 = getContext().getResources().getDimensionPixelSize(R.dimen.skype_avatar_large);
            i1 = k1;
            if (k1 <= 0)
            {
                i1 = j1;
            }
            k1 = getContext().getResources().getDimensionPixelSize(R.dimen.skype_avatar_large);
            l1 = i2;
            j1 = i1;
            if (i2 <= 0)
            {
                l1 = k1;
                j1 = i1;
            }
        }
        if (m && j1 != 0 && l1 != 0 && (k == null || k.getWidth() != j1 || k.getHeight() != l1))
        {
            k = Bitmap.createBitmap(j1, l1, android.graphics.Bitmap.Config.ARGB_8888);
            l = new Canvas(k);
        }
    }

    protected void onMeasure(int i1, int j1)
    {
        if (v)
        {
            j1 = i1;
        }
        super.onMeasure(i1, j1);
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        a();
    }

    public void setBorderClickedColor(int i1)
    {
        a(e.getDefaultColor(), i1);
    }

    public void setBorderColor(int i1)
    {
        a(i1, b());
    }

    public void setBorderWidth(int i1)
    {
        d = i1;
        a();
    }

    public void setClipCircleEnabled(boolean flag)
    {
        m = flag;
    }

    public void setDottedBorderDefaultAvatar(boolean flag, int i1)
    {
        boolean flag1;
        if (!flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        p = flag1;
        r = flag;
        if (flag)
        {
            ColorDrawable colordrawable = new ColorDrawable(-1);
            Drawable drawable = getResources().getDrawable(i1).mutate();
            i1 = i.getColor();
            drawable.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[] {
                (float)Color.red(i1) / 255F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, (float)Color.green(i1) / 255F, 0.0F, 0.0F, 0.0F, 
                0.0F, 0.0F, (float)Color.blue(i1) / 255F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F
            })));
            setImageDrawable(new LayerDrawable(new Drawable[] {
                colordrawable, drawable
            }));
            a();
        }
    }

    public void setDrawOverlayOnClick(boolean flag)
    {
        q = flag;
    }

    public void setPathType(PathType pathtype)
    {
        t = pathtype;
        a();
        postInvalidate();
    }

    static 
    {
        a = new PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_IN);
    }
}

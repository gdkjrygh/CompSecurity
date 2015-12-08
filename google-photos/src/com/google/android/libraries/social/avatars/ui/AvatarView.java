// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.social.avatars.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import b;
import java.util.ArrayList;
import mug;
import nxb;
import nxc;
import nxe;
import nxg;
import oiq;
import olm;

public final class AvatarView extends View
    implements nxe
{

    private static boolean b;
    private static Paint c;
    private static RectF d = new RectF();
    private static mug e;
    public int a;
    private int f;
    private String g;
    private nxb h;
    private int i;
    private Matrix j;
    private Paint k;
    private boolean l;
    private boolean m;
    private String n;
    private String o;
    private Drawable p;
    private String q;

    public AvatarView(Context context)
    {
        this(context, null);
    }

    public AvatarView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public AvatarView(Context context, AttributeSet attributeset, int i1)
    {
        boolean flag;
        flag = true;
        super(context, attributeset, i1);
        m = true;
        Resources resources = context.getResources();
        if (!b)
        {
            e = (mug)olm.a(context, mug);
            context = new Paint();
            c = context;
            context.setAntiAlias(true);
            c.setStrokeWidth(4F);
            c.setColor(resources.getColor(b.Ej));
            c.setStyle(android.graphics.Paint.Style.STROKE);
            b = true;
        }
        p = resources.getDrawable(b.Eq);
        p.setCallback(this);
        f = 2;
        a = 2;
        if (attributeset == null) goto _L2; else goto _L1
_L1:
        context = attributeset.getAttributeValue(null, "size");
        if (context != null)
        {
            if ("tiny".equals(context))
            {
                i1 = 0;
            } else
            if ("small".equals(context))
            {
                i1 = 1;
            } else
            if ("medium".equals(context))
            {
                i1 = 2;
            } else
            if ("large".equals(context))
            {
                i1 = 3;
            } else
            {
                context = String.valueOf(context);
                if (context.length() != 0)
                {
                    context = "Invalid avatar size: ".concat(context);
                } else
                {
                    context = new String("Invalid avatar size: ");
                }
                throw new IllegalArgumentException(context);
            }
            f = i1;
        }
        context = attributeset.getAttributeValue(null, "shape");
        if (context == null) goto _L4; else goto _L3
_L3:
        if (!"normal".equals(context)) goto _L6; else goto _L5
_L5:
        i1 = 0;
_L8:
        a = i1;
_L4:
        context = attributeset.getAttributeValue(null, "selectable");
        if (context != null)
        {
            m = Boolean.parseBoolean(context);
        }
        l = attributeset.getAttributeBooleanValue(null, "allowNonSquare", false);
_L2:
        a(f);
        return;
_L6:
        i1 = ((flag) ? 1 : 0);
        if ("round".equals(context))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!"rounded_corners".equals(context))
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = 2;
        if (true) goto _L8; else goto _L7
_L7:
        context = String.valueOf(context);
        if (context.length() != 0)
        {
            context = "Invalid avatar shape: ".concat(context);
        } else
        {
            context = new String("Invalid avatar shape: ");
        }
        throw new IllegalArgumentException(context);
    }

    private void a(int i1, int j1)
    {
        if (j != null)
        {
            j.reset();
        }
        while (i1 == 0 || i1 == j1) 
        {
            return;
        }
        if (k == null)
        {
            k = new Paint(2);
        }
        if (j == null)
        {
            j = new Matrix();
        }
        float f1 = (float)i1 / (float)j1;
        j.setScale(f1, f1);
    }

    public final void a()
    {
        c();
        g = null;
        q = null;
        o = null;
        n = null;
        if (j != null)
        {
            j.reset();
        }
    }

    public final void a(int i1)
    {
        f = i1;
        switch (f)
        {
        case 2: // '\002'
        default:
            i = b.l(getContext());
            return;

        case 0: // '\0'
            i = b.h(getContext());
            return;

        case 1: // '\001'
            i = b.j(getContext());
            return;

        case 3: // '\003'
            i = b.n(getContext());
            break;
        }
    }

    public final void a(String s, String s1)
    {
        if (!TextUtils.equals(g, s) || !TextUtils.equals(q, s1))
        {
            c();
            g = s;
            q = s1;
            o = null;
            n = null;
            b();
        }
    }

    public final void a(nxb nxb1)
    {
        if (nxb1.i == 1)
        {
            int i1 = ((Bitmap)nxb1.h).getWidth();
            a(getMeasuredWidth(), i1);
        }
        invalidate();
    }

    public final void b()
    {
label0:
        {
            boolean flag;
            if (getWindowToken() != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                if (q == null)
                {
                    break label0;
                }
                h = e.a(getContext(), q, f, a, this);
            }
            return;
        }
        invalidate();
    }

    public final void c()
    {
        if (h == null) goto _L2; else goto _L1
_L1:
        nxb nxb1;
        nxb1 = h;
        b.u();
        nxb1.r();
        if (nxb1.n != this || nxb1.o != null && (nxb1.o == null || !nxb1.o.equals(null))) goto _L4; else goto _L3
_L3:
        nxb1.n = null;
        nxb1.o = null;
        nxb1.f.b(nxb1);
_L6:
        h = null;
_L2:
        return;
_L4:
        int i1;
        int j1;
        if (nxb1.p == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        j1 = nxb1.p.size();
        i1 = 0;
_L7:
label0:
        {
            if (i1 < j1)
            {
                if (!((nxc)nxb1.p.get(i1)).a(this, null))
                {
                    break label0;
                }
                nxb1.p.remove(i1);
            }
            if (nxb1.p.isEmpty())
            {
                nxb1.f.b(nxb1);
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
        i1++;
          goto _L7
        if (true) goto _L6; else goto _L8
_L8:
    }

    protected final void drawableStateChanged()
    {
        p.setState(getDrawableState());
        invalidate();
        super.drawableStateChanged();
    }

    public final CharSequence getContentDescription()
    {
        if (!TextUtils.isEmpty(o))
        {
            return o;
        }
        if (!TextUtils.isEmpty(null))
        {
            if (isClickable())
            {
                return getResources().getString(b.Eu, new Object[] {
                    null
                });
            } else
            {
                return getResources().getString(b.Et);
            }
        }
        if (isClickable())
        {
            return getResources().getString(b.Es);
        } else
        {
            return getResources().getString(b.Er);
        }
    }

    protected final void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        b();
    }

    protected final void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        c();
    }

    protected final void onDraw(Canvas canvas)
    {
        float f1;
        Object obj;
        Bitmap bitmap;
        int i1;
        if (h != null && h.i == 1)
        {
            bitmap = (Bitmap)h.h;
        } else
        {
            bitmap = null;
        }
        obj = bitmap;
        if (bitmap != null) goto _L2; else goto _L1
_L1:
        f;
        JVM INSTR tableswitch 0 3: default 72
    //                   0 149
    //                   1 238
    //                   2 326
    //                   3 414;
           goto _L3 _L4 _L5 _L6 _L7
_L3:
        obj = bitmap;
_L2:
        if (j != null)
        {
            canvas.drawBitmap(((Bitmap) (obj)), j, k);
        } else
        {
            canvas.drawBitmap(((Bitmap) (obj)), 0.0F, 0.0F, null);
        }
        if (!m || !isPressed() && !isFocused()) goto _L9; else goto _L8
_L8:
        a;
        JVM INSTR tableswitch 0 2: default 148
    //                   0 513
    //                   1 522
    //                   2 549;
           goto _L9 _L10 _L11 _L12
_L9:
        return;
_L4:
        obj = getContext();
        switch (a)
        {
        default:
            obj = b.i(((Context) (obj)));
            break;

        case 1: // '\001'
            if (b.DX == null)
            {
                b.DX = oiq.a(b.i(((Context) (obj))));
            }
            obj = b.DX;
            break;

        case 2: // '\002'
            if (b.DY == null)
            {
                b.DY = oiq.a(b.i(((Context) (obj))), b.p(((Context) (obj))));
            }
            obj = b.DY;
            break;
        }
        if (true) goto _L2; else goto _L13
_L13:
_L5:
        obj = getContext();
        switch (a)
        {
        default:
            obj = b.k(((Context) (obj)));
            break;

        case 1: // '\001'
            if (b.Ea == null)
            {
                b.Ea = oiq.a(b.k(((Context) (obj))));
            }
            obj = b.Ea;
            break;

        case 2: // '\002'
            if (b.Eb == null)
            {
                b.Eb = oiq.a(b.k(((Context) (obj))), b.p(((Context) (obj))));
            }
            obj = b.Eb;
            break;
        }
        if (true) goto _L2; else goto _L14
_L14:
_L6:
        obj = getContext();
        switch (a)
        {
        default:
            obj = b.m(((Context) (obj)));
            break;

        case 1: // '\001'
            if (b.Ed == null)
            {
                b.Ed = oiq.a(b.m(((Context) (obj))));
            }
            obj = b.Ed;
            break;

        case 2: // '\002'
            if (b.Ee == null)
            {
                b.Ee = oiq.a(b.m(((Context) (obj))), b.p(((Context) (obj))));
            }
            obj = b.Ee;
            break;
        }
        if (true) goto _L2; else goto _L15
_L15:
_L7:
        obj = getContext();
        switch (a)
        {
        default:
            obj = b.o(((Context) (obj)));
            break;

        case 1: // '\001'
            if (b.Eg == null)
            {
                b.Eg = oiq.a(b.o(((Context) (obj))));
            }
            obj = b.Eg;
            break;

        case 2: // '\002'
            if (b.Eh == null)
            {
                b.Eh = oiq.a(b.o(((Context) (obj))), b.p(((Context) (obj))));
            }
            obj = b.Eh;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L10:
        p.draw(canvas);
        return;
_L11:
        i1 = getWidth() / 2;
        canvas.drawCircle(i1, i1, i1 - 2, c);
        return;
_L12:
        f1 = b.p(getContext());
        d.set(0.0F, 0.0F, getWidth(), getHeight());
        canvas.drawRoundRect(d, f1, f1, c);
        return;
        if (true) goto _L2; else goto _L16
_L16:
    }

    protected final void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        super.onLayout(flag, i1, j1, k1, l1);
        if (a == 0)
        {
            p.setBounds(0, 0, k1 - i1, l1 - j1);
        }
    }

    protected final void onMeasure(int i1, int j1)
    {
        int l1 = i;
        int i2 = android.view.View.MeasureSpec.getMode(i1);
        int k1;
        if (i2 == 0x40000000)
        {
            k1 = android.view.View.MeasureSpec.getSize(i1);
        } else
        {
            k1 = l1;
            if (i2 == 0x80000000)
            {
                k1 = Math.min(l1, android.view.View.MeasureSpec.getSize(i1));
            }
        }
        l1 = android.view.View.MeasureSpec.getMode(j1);
        if (l)
        {
            i1 = i;
            if (l1 == 0x40000000 || l1 == 0x80000000)
            {
                i1 = Math.min(i1, android.view.View.MeasureSpec.getSize(j1));
                j1 = k1;
            } else
            {
                j1 = k1;
            }
        } else
        {
            if (l1 == 0x40000000)
            {
                i1 = Math.min(k1, android.view.View.MeasureSpec.getSize(j1));
            } else
            {
                i1 = Math.min(k1, i);
            }
            j1 = i1;
            k1 = i1;
            i1 = j1;
            j1 = k1;
        }
        if (h != null && h.i == 1)
        {
            k1 = ((Bitmap)h.h).getWidth();
        } else
        {
            k1 = i;
        }
        a(j1, k1);
        setMeasuredDimension(j1, i1);
    }

    public final void setContentDescription(CharSequence charsequence)
    {
        super.setContentDescription(charsequence);
        o = (String)charsequence;
    }

    protected final boolean verifyDrawable(Drawable drawable)
    {
        if (drawable == p)
        {
            return true;
        } else
        {
            return super.verifyDrawable(drawable);
        }
    }

}

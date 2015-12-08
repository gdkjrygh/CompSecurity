// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.support.v4.app.Fragment;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import com.facebook.a.a;

// Referenced classes of package com.facebook:
//            m, p

public abstract class l extends Button
{

    public android.view.View.OnClickListener a;
    public Fragment b;
    private String c;
    private android.view.View.OnClickListener d;
    private boolean e;
    private int f;
    private int g;

    public l(Context context, AttributeSet attributeset, int i, String s)
    {
        super(context, attributeset, 0);
        int k = c();
        int j = k;
        if (k == 0)
        {
            j = O.g.com_facebook_button;
        }
        a(context, attributeset, i, j);
        c = s;
    }

    static android.view.View.OnClickListener a(l l1)
    {
        return l1.a;
    }

    static android.view.View.OnClickListener b(l l1)
    {
        return l1.d;
    }

    public abstract int a();

    public final int a(String s)
    {
        return (int)Math.ceil(getPaint().measureText(s));
    }

    public void a(Context context, AttributeSet attributeset, int i, int j)
    {
        if (isInEditMode()) goto _L2; else goto _L1
_L1:
        TypedArray typedarray = context.getTheme().obtainStyledAttributes(attributeset, new int[] {
            0x10100d4
        }, i, j);
        if (!typedarray.hasValue(0)) goto _L4; else goto _L3
_L3:
        int k = typedarray.getResourceId(0, 0);
        if (k == 0) goto _L6; else goto _L5
_L5:
        setBackgroundResource(k);
_L8:
        typedarray.recycle();
_L2:
        typedarray = context.getTheme().obtainStyledAttributes(attributeset, new int[] {
            0x101016f, 0x101016d, 0x1010170, 0x101016e, 0x1010171
        }, i, j);
        setCompoundDrawablesWithIntrinsicBounds(typedarray.getResourceId(0, 0), typedarray.getResourceId(1, 0), typedarray.getResourceId(2, 0), typedarray.getResourceId(3, 0));
        setCompoundDrawablePadding(typedarray.getDimensionPixelSize(4, 0));
        typedarray.recycle();
        typedarray = context.getTheme().obtainStyledAttributes(attributeset, new int[] {
            0x10100d6, 0x10100d7, 0x10100d8, 0x10100d9
        }, i, j);
        setPadding(typedarray.getDimensionPixelSize(0, 0), typedarray.getDimensionPixelSize(1, 0), typedarray.getDimensionPixelSize(2, 0), typedarray.getDimensionPixelSize(3, 0));
        typedarray.recycle();
        typedarray = context.getTheme().obtainStyledAttributes(attributeset, new int[] {
            0x1010098
        }, i, j);
        setTextColor(typedarray.getColor(0, -1));
        typedarray.recycle();
        typedarray = context.getTheme().obtainStyledAttributes(attributeset, new int[] {
            0x10100af
        }, i, j);
        setGravity(typedarray.getInt(0, 17));
        typedarray.recycle();
        context = context.getTheme().obtainStyledAttributes(attributeset, new int[] {
            0x1010095, 0x1010097, 0x101014f
        }, i, j);
        setTextSize(0, context.getDimensionPixelSize(0, 0));
        setTypeface(Typeface.defaultFromStyle(context.getInt(1, 1)));
        setText(context.getString(2));
        context.recycle();
        super.setOnClickListener(new m(this));
        return;
_L6:
        setBackgroundColor(typedarray.getColor(0, 0));
        continue; /* Loop/switch isn't completed */
        context;
        typedarray.recycle();
        throw context;
_L4:
        setBackgroundColor(typedarray.getColor(0, O.a.com_facebook_blue));
        if (true) goto _L8; else goto _L7
_L7:
        context;
        typedarray.recycle();
        throw context;
        context;
        typedarray.recycle();
        throw context;
        context;
        typedarray.recycle();
        throw context;
        context;
        typedarray.recycle();
        throw context;
        attributeset;
        context.recycle();
        throw attributeset;
    }

    public final void a(View view)
    {
        if (d != null)
        {
            d.onClick(view);
        }
    }

    public final Activity b()
    {
        Context context;
        for (context = getContext(); !(context instanceof Activity) && (context instanceof ContextWrapper); context = ((ContextWrapper)context).getBaseContext()) { }
        if (context instanceof Activity)
        {
            return (Activity)context;
        } else
        {
            throw new p("Unable to get Activity.");
        }
    }

    public int c()
    {
        return 0;
    }

    public int getCompoundPaddingLeft()
    {
        if (e)
        {
            return f;
        } else
        {
            return super.getCompoundPaddingLeft();
        }
    }

    public int getCompoundPaddingRight()
    {
        if (e)
        {
            return g;
        } else
        {
            return super.getCompoundPaddingRight();
        }
    }

    public void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (!isInEditMode())
        {
            com.facebook.a.a.a(getContext()).a(c, null, true);
        }
    }

    public void onDraw(Canvas canvas)
    {
        int i;
        if ((getGravity() & 1) != 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            i = getCompoundPaddingLeft();
            int j = getCompoundPaddingRight();
            int k = getCompoundDrawablePadding();
            k = Math.min((getWidth() - (k + i) - j - a(getText().toString())) / 2, (i - getPaddingLeft()) / 2);
            f = i - k;
            g = j + k;
            e = true;
        }
        super.onDraw(canvas);
        e = false;
    }

    public void setOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        d = onclicklistener;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.app.Application;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.TextView;
import com.skype.android.text.SegoeTypeFaceFactory;
import com.skype.android.text.TypeFaceFactory;

// Referenced classes of package com.skype.android.widget:
//            SymbolElement

public class SymbolView extends TextView
    implements SymbolElement
{

    private TypeFaceFactory a;
    private SymbolElement.SymbolCode b;
    private Drawable c;
    private boolean d;

    public SymbolView(Context context)
    {
        super(context);
        d = false;
        a(null);
    }

    public SymbolView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        d = false;
        a(attributeset);
    }

    public SymbolView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        d = false;
        a(attributeset);
    }

    private void a(AttributeSet attributeset)
    {
        if (isInEditMode())
        {
            setText("?");
            setGravity(17);
            return;
        }
        a = SegoeTypeFaceFactory.getInstance((Application)getContext().getApplicationContext());
        if (attributeset == null) goto _L2; else goto _L1
_L1:
        int i;
        attributeset = getContext().obtainStyledAttributes(attributeset, R.styleable.SymbolView);
        i = attributeset.getInt(0, -1);
        if (i != -1)
        {
            setText(String.valueOf((char)i));
        } else
        {
            setSymbolCode(SymbolElement.SymbolCode.dt);
        }
        i = attributeset.getColor(2, 0);
        if (!attributeset.getBoolean(3, false) || i == 0) goto _L4; else goto _L3
_L3:
        setSymbolRoundBackgroundColor(i);
_L6:
        d = attributeset.getBoolean(1, false);
        attributeset.recycle();
_L2:
        setIncludeFontPadding(false);
        setTypeface(a.getSymbolFont());
        setGravity(17);
        c = getBackground();
        setBackgroundResource(0);
        return;
_L4:
        if (i != 0)
        {
            setBackgroundColor(i);
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void a()
    {
        d = true;
    }

    public final SymbolElement.SymbolCode b()
    {
        return b;
    }

    public Drawable getBackground()
    {
        if (c == null)
        {
            return super.getBackground();
        } else
        {
            return c;
        }
    }

    protected void onDraw(Canvas canvas)
    {
        if (getTextSize() - (float)getHeight() > 0.0F)
        {
            setScrollY((int)(getTextSize() - (float)getHeight()) / 2);
        }
        if (c != null)
        {
            c.setState(getDrawableState());
            if (d)
            {
                c.setBounds(0, 0, getWidth(), getHeight());
            } else
            {
                c.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            }
            c.draw(canvas);
        }
        super.onDraw(canvas);
    }

    protected void onMeasure(int i, int j)
    {
        if (c != null && c.getMinimumWidth() != 0 && c.getMinimumHeight() != 0)
        {
            setMeasuredDimension(c.getMinimumWidth(), c.getMinimumHeight());
            return;
        } else
        {
            super.onMeasure(i, j);
            return;
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (motionevent.getAction() != 2)
        {
            invalidate();
        }
        return super.onTouchEvent(motionevent);
    }

    public void setSymbolCode(SymbolElement.SymbolCode symbolcode)
    {
        SymbolElement.SymbolCode symbolcode1 = symbolcode;
        if (symbolcode == null)
        {
            symbolcode1 = SymbolElement.SymbolCode.a;
        }
        b = symbolcode1;
        if (symbolcode1 == SymbolElement.SymbolCode.a)
        {
            setText("");
        } else
        {
            setText(symbolcode1.gi);
        }
        if (symbolcode1.gh)
        {
            setTypeface(a.getIllustrationFont());
            return;
        } else
        {
            setTypeface(a.getSymbolFont());
            return;
        }
    }

    public void setSymbolColor(int i)
    {
        setTextColor(i);
    }

    public void setSymbolRoundBackgroundColor(int i)
    {
        ShapeDrawable shapedrawable = new ShapeDrawable();
        shapedrawable.setShape(new OvalShape());
        shapedrawable.getPaint().setColor(i);
        setBackgroundDrawable(shapedrawable);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.text;

import android.content.Context;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.TextView;

public class ExpandingTextView extends TextView
{

    private boolean _isExpanded;

    public ExpandingTextView(Context context)
    {
        this(context, null);
    }

    public ExpandingTextView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ExpandingTextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        _isExpanded = false;
        setOnTouchListener(new LinkMovementMethodOverride(null));
    }

    public void expand()
    {
        _isExpanded = true;
        setMaxLines(0x7fffffff);
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        if (flag)
        {
            android.text.TextPaint textpaint;
            if (android.os.Build.VERSION.SDK_INT >= 16)
            {
                i = getMaxLines();
            } else
            if (_isExpanded)
            {
                i = 0x7fffffff;
            } else
            {
                i = 5;
            }
            textpaint = getPaint();
            if (textpaint.getShader() != null)
            {
                j = 1;
            } else
            {
                j = 0;
            }
            if (i != -1 && getLineCount() > i)
            {
                k = 1;
            } else
            {
                k = 0;
            }
            if (k != 0 && j == 0)
            {
                j = getCurrentTextColor();
                k = Color.argb(0, Color.red(j), Color.green(j), Color.blue(j));
                textpaint.setShader(new LinearGradient(0.0F, getLayout().getLineTop(i - 3), 0.0F, getHeight(), j, k, android.graphics.Shader.TileMode.CLAMP));
            } else
            if (k == 0 && j != 0)
            {
                textpaint.setShader(null);
                return;
            }
        }
    }

    public boolean performClick()
    {
        expand();
        return super.performClick();
    }

    private class LinkMovementMethodOverride
        implements android.view.View.OnTouchListener
    {

        final ExpandingTextView this$0;

        public boolean onTouch(View view, MotionEvent motionevent)
        {
            if (!(view instanceof ExpandingTextView))
            {
                return false;
            }
            view = (ExpandingTextView)view;
            int i = motionevent.getAction();
            if (i == 1)
            {
                view.expand();
            }
            Object obj = view.getText();
            if (obj instanceof Spanned)
            {
                obj = (Spanned)obj;
                if (i == 1 || i == 0)
                {
                    int j = (int)motionevent.getX();
                    int k = (int)motionevent.getY();
                    int l = view.getTotalPaddingLeft();
                    int i1 = view.getTotalPaddingTop();
                    int j1 = view.getScrollX();
                    int k1 = view.getScrollY();
                    motionevent = view.getLayout();
                    j = motionevent.getOffsetForHorizontal(motionevent.getLineForVertical((k - i1) + k1), (j - l) + j1);
                    motionevent = (ClickableSpan[])((Spanned) (obj)).getSpans(j, j, android/text/style/ClickableSpan);
                    if (motionevent.length != 0)
                    {
                        if (i == 1)
                        {
                            motionevent[0].onClick(view);
                        }
                        return true;
                    }
                }
            }
            return false;
        }

        private LinkMovementMethodOverride()
        {
            this$0 = ExpandingTextView.this;
            super();
        }

        LinkMovementMethodOverride(_cls1 _pcls1)
        {
            this();
        }
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.wobl.view;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.util.AttributeSet;
import android.widget.TextView;

public class EllipsizingTextView extends TextView
{

    private CharSequence fullText;
    private boolean isStale;
    private float lineAdditionalVerticalPadding;
    private float lineSpacingMultiplier;
    private int maxLines;
    private boolean programmaticChange;

    public EllipsizingTextView(Context context)
    {
        super(context);
        lineSpacingMultiplier = 1.0F;
        lineAdditionalVerticalPadding = 0.0F;
    }

    public EllipsizingTextView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        lineSpacingMultiplier = 1.0F;
        lineAdditionalVerticalPadding = 0.0F;
    }

    public EllipsizingTextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        lineSpacingMultiplier = 1.0F;
        lineAdditionalVerticalPadding = 0.0F;
    }

    private CharSequence addBackAllSpans(String s)
    {
        boolean flag = false;
        Object obj;
        if (fullText instanceof Spanned)
        {
            int i = 0;
            if (s.endsWith("\u2026"))
            {
                i = 1;
            }
            Spanned spanned = (Spanned)fullText;
            Object aobj[] = spanned.getSpans(0, s.length() - i, java/lang/Object);
            SpannableStringBuilder spannablestringbuilder = SpannableStringBuilder.valueOf(s);
            int j = aobj.length;
            i = ((flag) ? 1 : 0);
            do
            {
                obj = spannablestringbuilder;
                if (i >= j)
                {
                    break;
                }
                obj = aobj[i];
                spannablestringbuilder.setSpan(obj, spanned.getSpanStart(obj), Math.min(s.length(), spanned.getSpanEnd(obj)), spanned.getSpanFlags(obj));
                i++;
            } while (true);
        } else
        {
            obj = s;
        }
        return ((CharSequence) (obj));
    }

    private Layout createWorkingLayout(CharSequence charsequence)
    {
        return new StaticLayout(charsequence, getPaint(), Math.max(0, getWidth() - getPaddingLeft() - getPaddingRight()), android.text.Layout.Alignment.ALIGN_NORMAL, lineSpacingMultiplier, lineAdditionalVerticalPadding, false);
    }

    private void resetText()
    {
        String s;
        String s1 = fullText.toString();
        s = s1;
        if (maxLines == -1)
        {
            break MISSING_BLOCK_LABEL_174;
        }
        Layout layout = createWorkingLayout(addBackAllSpans(s1));
        s = s1;
        if (layout.getLineCount() <= maxLines)
        {
            break MISSING_BLOCK_LABEL_174;
        }
        s = fullText.toString().substring(0, layout.getLineEnd(maxLines - 1)).trim();
        do
        {
label0:
            {
                String s2 = String.valueOf(s);
                String s4 = String.valueOf("\u2026");
                int i;
                if (s4.length() != 0)
                {
                    s2 = s2.concat(s4);
                } else
                {
                    s2 = new String(s2);
                }
                if (createWorkingLayout(addBackAllSpans(s2)).getLineCount() <= maxLines)
                {
                    break label0;
                }
                i = s.lastIndexOf(' ');
                if (i == -1)
                {
                    break label0;
                }
                s = s.substring(0, i);
            }
        } while (true);
        s = String.valueOf(s);
        String s3 = String.valueOf("\u2026");
        if (s3.length() != 0)
        {
            s = s.concat(s3);
        } else
        {
            s = new String(s);
        }
        if (s.equals(getText().toString()))
        {
            break MISSING_BLOCK_LABEL_209;
        }
        programmaticChange = true;
        setText(addBackAllSpans(s));
        programmaticChange = false;
        isStale = false;
        return;
        Exception exception;
        exception;
        programmaticChange = false;
        throw exception;
    }

    protected void onDraw(Canvas canvas)
    {
        if (maxLines == 0)
        {
            return;
        }
        if (isStale)
        {
            super.setEllipsize(null);
            resetText();
        }
        super.onDraw(canvas);
    }

    protected void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        super.onTextChanged(charsequence, i, j, k);
        if (!programmaticChange)
        {
            fullText = charsequence;
            isStale = true;
        }
    }

    public void setEllipsize(android.text.TextUtils.TruncateAt truncateat)
    {
    }

    public void setLineSpacing(float f, float f1)
    {
        lineAdditionalVerticalPadding = f;
        lineSpacingMultiplier = f1;
        super.setLineSpacing(f, f1);
    }

    public void setMaxLines(int i)
    {
        super.setMaxLines(i);
        maxLines = i;
        isStale = true;
    }
}

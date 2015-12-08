// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package kik.android.widget:
//            RobotoTextView

public class EllipsizingTextView extends RobotoTextView
{

    private static final Spanned a = new SpannedString("\u2026");
    private final List b;
    private boolean c;
    private boolean d;
    private boolean e;
    private Spanned f;
    private int g;
    private float h;
    private float i;

    public EllipsizingTextView(Context context)
    {
        this(context, null);
    }

    public EllipsizingTextView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset, 0);
        b = new ArrayList();
        h = 1.0F;
        i = 0.0F;
    }

    public EllipsizingTextView(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        b = new ArrayList();
        h = 1.0F;
        i = 0.0F;
        super.setEllipsize(null);
    }

    private Layout a(Spanned spanned)
    {
        return new StaticLayout(spanned, getPaint(), getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), android.text.Layout.Alignment.ALIGN_NORMAL, h, i, false);
    }

    public int getMaxLines()
    {
        return g;
    }

    protected void onConfigurationChanged(Configuration configuration)
    {
        d = true;
        super.onConfigurationChanged(configuration);
    }

    protected void onMeasure(int j, int k)
    {
        super.onMeasure(j, k);
        if (!d) goto _L2; else goto _L1
_L1:
        Spanned spanned;
        int l;
        l = getMaxLines();
        spanned = f;
        if (spanned == null) goto _L4; else goto _L3
_L3:
        if (l == 0) goto _L6; else goto _L5
_L5:
        Layout layout = a(spanned);
        if (layout.getLineCount() <= l) goto _L6; else goto _L7
_L7:
        boolean flag;
        for (spanned = (Spanned)f.subSequence(0, layout.getLineEnd(l - 1)); spanned.length() > 0 && (spanned.charAt(spanned.length() - 1) == '\n' || a((Spanned)TextUtils.concat(new CharSequence[] {
    spanned, a
})).getLineCount() > l); spanned = (Spanned)spanned.subSequence(0, spanned.toString().length() - 1)) { }
        spanned = (Spanned)TextUtils.concat(new CharSequence[] {
            spanned, a
        });
        flag = true;
_L9:
        if (spanned.equals(getText()))
        {
            break MISSING_BLOCK_LABEL_206;
        }
        e = true;
        setText(spanned);
        e = false;
        d = false;
        if (flag != c)
        {
            c = flag;
            for (Iterator iterator = b.iterator(); iterator.hasNext(); iterator.next()) { }
        }
          goto _L4
        Exception exception;
        exception;
        e = false;
        throw exception;
_L4:
        super.onMeasure(j, k);
_L2:
        return;
_L6:
        flag = false;
        if (true) goto _L9; else goto _L8
_L8:
    }

    protected void onTextChanged(CharSequence charsequence, int j, int k, int l)
    {
        super.onTextChanged(charsequence, j, k, l);
        if (!e)
        {
            f = new SpannedString(charsequence.toString());
            d = true;
        }
    }

    public void setEllipsize(android.text.TextUtils.TruncateAt truncateat)
    {
    }

    public void setLineSpacing(float f1, float f2)
    {
        i = f1;
        h = f2;
        super.setLineSpacing(f1, f2);
    }

    public void setMaxLines(int j)
    {
        super.setMaxLines(j);
        g = j;
        d = true;
    }

    public void setText(CharSequence charsequence, android.widget.TextView.BufferType buffertype)
    {
        if (!e && (charsequence instanceof Spanned))
        {
            f = (Spanned)charsequence;
            d = true;
        }
        super.setText(charsequence, buffertype);
    }

}

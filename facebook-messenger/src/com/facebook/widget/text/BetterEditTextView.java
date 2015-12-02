// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.text;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.EditText;
import com.facebook.q;

// Referenced classes of package com.facebook.widget.text:
//            d, c, a

public class BetterEditTextView extends EditText
{

    private a a;

    public BetterEditTextView(Context context)
    {
        super(context);
    }

    public BetterEditTextView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a(context, attributeset);
    }

    public BetterEditTextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a(context, attributeset);
    }

    private void a(Context context, AttributeSet attributeset)
    {
        context = context.obtainStyledAttributes(attributeset, q.BetterEditTextView);
        c.a(this, d.fromIndex(context.getInt(q.BetterEditTextView_fontFamily, 0)), getTypeface());
        context.recycle();
    }

    protected void onScrollChanged(int i, int j, int k, int l)
    {
        super.onScrollChanged(i, j, k, l);
        if (a != null)
        {
            a.a(i, j, k, l);
        }
    }

    public void setOnScrollListener(a a1)
    {
        a = a1;
    }
}

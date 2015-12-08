// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Html;
import android.util.AttributeSet;
import com.jcp.d;

// Referenced classes of package com.jcp.views:
//            TypefaceTextView

public class HtmlTypefaceTextView extends TypefaceTextView
{

    public HtmlTypefaceTextView(Context context)
    {
        this(context, null);
    }

    public HtmlTypefaceTextView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public HtmlTypefaceTextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        attributeset = context.obtainStyledAttributes(attributeset, d.HtmlTypefaceTextView);
        context = null;
        if (attributeset != null)
        {
            context = attributeset.getString(0);
            attributeset.recycle();
        }
        if (context == null)
        {
            throw new UnsupportedOperationException("HtmlTypefaceTextView must refer to a string");
        } else
        {
            setHtmlText(context);
            return;
        }
    }

    public void setHtmlText(String s)
    {
        super.setText(Html.fromHtml(s));
    }
}

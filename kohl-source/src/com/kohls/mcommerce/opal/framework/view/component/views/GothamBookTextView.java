// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.component.views;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;
import com.kohls.mcommerce.opal.common.util.FontUtils;

public class GothamBookTextView extends TextView
{

    Typeface mGothamBoldTypeface;

    public GothamBookTextView(Context context)
    {
        super(context);
        init();
    }

    public GothamBookTextView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    public GothamBookTextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private void init()
    {
        if (!isInEditMode())
        {
            mGothamBoldTypeface = FontUtils.loadTypeFace(getContext(), "Gotham-Book.otf");
            setTypeface(mGothamBoldTypeface);
        }
    }
}

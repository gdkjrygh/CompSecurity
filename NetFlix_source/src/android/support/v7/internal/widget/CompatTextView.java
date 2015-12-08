// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import java.util.Locale;

public class CompatTextView extends TextView
{
    private static class AllCapsTransformationMethod
        implements TransformationMethod
    {

        private final Locale mLocale;

        public CharSequence getTransformation(CharSequence charsequence, View view)
        {
            if (charsequence != null)
            {
                return charsequence.toString().toUpperCase(mLocale);
            } else
            {
                return null;
            }
        }

        public void onFocusChanged(View view, CharSequence charsequence, boolean flag, int i, Rect rect)
        {
        }

        public AllCapsTransformationMethod(Context context)
        {
            mLocale = context.getResources().getConfiguration().locale;
        }
    }


    public CompatTextView(Context context)
    {
        this(context, null);
    }

    public CompatTextView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public CompatTextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        attributeset = context.obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.CompatTextView, i, 0);
        boolean flag = attributeset.getBoolean(0, false);
        attributeset.recycle();
        if (flag)
        {
            setTransformationMethod(new AllCapsTransformationMethod(context));
        }
    }
}

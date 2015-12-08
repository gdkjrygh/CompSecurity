// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.bind.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewCompat;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.widget.TextView;
import com.google.android.libraries.bind.data.Bound;
import com.google.android.libraries.bind.data.BoundHelper;
import com.google.android.libraries.bind.data.Data;

public class BoundTextView extends TextView
    implements Bound
{

    private Integer bindDrawableEndKey;
    private Integer bindDrawableStartKey;
    private Integer bindTextColorKey;
    private Integer bindTextKey;
    private final BoundHelper boundHelper;

    public BoundTextView(Context context)
    {
        this(context, null, 0);
    }

    public BoundTextView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public BoundTextView(Context context, AttributeSet attributeset, int i)
    {
        this(context, attributeset, i, 0);
    }

    public BoundTextView(Context context, AttributeSet attributeset, int i, int j)
    {
        super(context, attributeset, i);
        boundHelper = new BoundHelper(context, attributeset, this);
        context = context.obtainStyledAttributes(attributeset, com.google.android.libraries.bind.R.styleable.BoundTextView, i, j);
        if (isInEditMode())
        {
            attributeset = context.getString(0);
            if (attributeset != null)
            {
                setText(attributeset);
            }
        }
        bindTextKey = BoundHelper.getInteger(context, 1);
        bindTextColorKey = BoundHelper.getInteger(context, 2);
        bindDrawableStartKey = BoundHelper.getInteger(context, 3);
        bindDrawableEndKey = BoundHelper.getInteger(context, 4);
        context.recycle();
    }

    private void updateBoundDrawableIfSpecified(Drawable adrawable[], Data data, Integer integer, boolean flag)
    {
        if (integer != null)
        {
            int i;
            if (data == null)
            {
                data = null;
            } else
            {
                data = data.getAsInteger(integer.intValue());
            }
            if (ViewCompat.getLayoutDirection(this) == 0 && flag)
            {
                i = 0;
            } else
            {
                i = 2;
            }
            if (data == null)
            {
                data = null;
            } else
            {
                data = getContext().getResources().getDrawable(data.intValue());
            }
            adrawable[i] = data;
        }
    }

    public final void updateBoundData(Data data)
    {
        boundHelper.updateBoundData(data);
        if (bindTextKey == null) goto _L2; else goto _L1
_L1:
        if (data != null) goto _L4; else goto _L3
_L3:
        Object obj = null;
_L6:
        setText(((CharSequence) (obj)));
_L2:
        if (bindTextColorKey != null)
        {
            if (data == null)
            {
                obj = null;
            } else
            {
                obj = data.get(bindTextColorKey.intValue());
            }
            if (obj == null)
            {
                setTextColor(-1);
            } else
            if (obj instanceof ColorStateList)
            {
                setTextColor((ColorStateList)obj);
            } else
            {
                setTextColor(getContext().getResources().getColor(((Integer)obj).intValue()));
            }
        }
        if (bindDrawableStartKey != null || bindDrawableEndKey != null)
        {
            obj = getCompoundDrawables();
            updateBoundDrawableIfSpecified(((Drawable []) (obj)), data, bindDrawableStartKey, true);
            updateBoundDrawableIfSpecified(((Drawable []) (obj)), data, bindDrawableEndKey, false);
            setCompoundDrawablesWithIntrinsicBounds(obj[0], obj[1], obj[2], obj[3]);
        }
        return;
_L4:
label0:
        {
            obj = data.get(bindTextKey.intValue());
            if (!(obj instanceof SpannableString))
            {
                break label0;
            }
            setText((SpannableString)obj, android.widget.TextView.BufferType.SPANNABLE);
        }
          goto _L2
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = obj.toString();
        }
        if (true) goto _L6; else goto _L5
_L5:
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.support.v7.internal.text.AllCapsTransformationMethod;
import android.support.v7.internal.widget.ThemeUtils;
import android.util.AttributeSet;
import android.widget.TextView;

class AppCompatTextHelper
{

    private static final int TEXT_APPEARANCE_ATTRS[];
    private static final int VIEW_ATTRS[] = {
        0x1010034
    };
    private final TextView mView;

    AppCompatTextHelper(TextView textview)
    {
        mView = textview;
    }

    void loadFromAttributes(AttributeSet attributeset, int i)
    {
        Context context = mView.getContext();
        TypedArray typedarray = context.obtainStyledAttributes(attributeset, VIEW_ATTRS, i, 0);
        int j = typedarray.getResourceId(0, -1);
        typedarray.recycle();
        if (j != -1)
        {
            TypedArray typedarray1 = context.obtainStyledAttributes(j, android.support.v7.appcompat.R.styleable.TextAppearance);
            if (typedarray1.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_textAllCaps))
            {
                setAllCaps(typedarray1.getBoolean(android.support.v7.appcompat.R.styleable.TextAppearance_textAllCaps, false));
            }
            typedarray1.recycle();
        }
        attributeset = context.obtainStyledAttributes(attributeset, TEXT_APPEARANCE_ATTRS, i, 0);
        if (attributeset.hasValue(0))
        {
            setAllCaps(attributeset.getBoolean(0, false));
        }
        attributeset.recycle();
        attributeset = mView.getTextColors();
        if (attributeset != null && !attributeset.isStateful())
        {
            if (android.os.Build.VERSION.SDK_INT < 21)
            {
                i = ThemeUtils.getDisabledThemeAttrColor(context, 0x1010038);
            } else
            {
                i = ThemeUtils.getThemeAttrColor(context, 0x1010038);
            }
            mView.setTextColor(ThemeUtils.createDisabledStateList(attributeset.getDefaultColor(), i));
        }
    }

    void onSetTextAppearance(Context context, int i)
    {
        context = context.obtainStyledAttributes(i, TEXT_APPEARANCE_ATTRS);
        if (context.hasValue(0))
        {
            setAllCaps(context.getBoolean(0, false));
        }
        context.recycle();
    }

    void setAllCaps(boolean flag)
    {
        TextView textview = mView;
        AllCapsTransformationMethod allcapstransformationmethod;
        if (flag)
        {
            allcapstransformationmethod = new AllCapsTransformationMethod(mView.getContext());
        } else
        {
            allcapstransformationmethod = null;
        }
        textview.setTransformationMethod(allcapstransformationmethod);
    }

    static 
    {
        TEXT_APPEARANCE_ATTRS = (new int[] {
            android.support.v7.appcompat.R.attr.textAllCaps
        });
    }
}

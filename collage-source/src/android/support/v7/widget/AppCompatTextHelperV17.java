// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

// Referenced classes of package android.support.v7.widget:
//            AppCompatTextHelper, TintManager, TintInfo

class AppCompatTextHelperV17 extends AppCompatTextHelper
{

    private static final int VIEW_ATTRS_v17[] = {
        0x1010392, 0x1010393
    };
    private TintInfo mDrawableEndTint;
    private TintInfo mDrawableStartTint;

    AppCompatTextHelperV17(TextView textview)
    {
        super(textview);
    }

    void applyCompoundDrawablesTints()
    {
        super.applyCompoundDrawablesTints();
        if (mDrawableStartTint != null || mDrawableEndTint != null)
        {
            android.graphics.drawable.Drawable adrawable[] = mView.getCompoundDrawablesRelative();
            applyCompoundDrawableTint(adrawable[0], mDrawableStartTint);
            applyCompoundDrawableTint(adrawable[2], mDrawableEndTint);
        }
    }

    void loadFromAttributes(AttributeSet attributeset, int i)
    {
        super.loadFromAttributes(attributeset, i);
        Context context = mView.getContext();
        TintManager tintmanager = TintManager.get(context);
        attributeset = context.obtainStyledAttributes(attributeset, VIEW_ATTRS_v17, i, 0);
        if (attributeset.hasValue(0))
        {
            mDrawableStartTint = createTintInfo(context, tintmanager, attributeset.getResourceId(0, 0));
        }
        if (attributeset.hasValue(1))
        {
            mDrawableEndTint = createTintInfo(context, tintmanager, attributeset.getResourceId(1, 0));
        }
        attributeset.recycle();
    }

}

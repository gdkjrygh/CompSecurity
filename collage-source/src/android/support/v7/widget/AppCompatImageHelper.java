// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.widget.ImageView;

// Referenced classes of package android.support.v7.widget:
//            TintTypedArray, TintManager

class AppCompatImageHelper
{

    private static final int VIEW_ATTRS[] = {
        0x1010119
    };
    private final TintManager mTintManager;
    private final ImageView mView;

    AppCompatImageHelper(ImageView imageview, TintManager tintmanager)
    {
        mView = imageview;
        mTintManager = tintmanager;
    }

    void loadFromAttributes(AttributeSet attributeset, int i)
    {
        attributeset = TintTypedArray.obtainStyledAttributes(mView.getContext(), attributeset, VIEW_ATTRS, i, 0);
        if (attributeset.hasValue(0))
        {
            mView.setImageDrawable(attributeset.getDrawable(0));
        }
        attributeset.recycle();
        return;
        Exception exception;
        exception;
        attributeset.recycle();
        throw exception;
    }

    void setImageResource(int i)
    {
        if (i != 0)
        {
            ImageView imageview = mView;
            android.graphics.drawable.Drawable drawable;
            if (mTintManager != null)
            {
                drawable = mTintManager.getDrawable(i);
            } else
            {
                drawable = ContextCompat.getDrawable(mView.getContext(), i);
            }
            imageview.setImageDrawable(drawable);
            return;
        } else
        {
            mView.setImageDrawable(null);
            return;
        }
    }

}

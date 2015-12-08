// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.util.AttributeSet;
import android.widget.SeekBar;

// Referenced classes of package android.support.v7.widget:
//            AppCompatProgressBarHelper, TintTypedArray, TintManager

class AppCompatSeekBarHelper extends AppCompatProgressBarHelper
{

    private static final int TINT_ATTRS[] = {
        0x1010142
    };
    private final SeekBar mView;

    AppCompatSeekBarHelper(SeekBar seekbar, TintManager tintmanager)
    {
        super(seekbar, tintmanager);
        mView = seekbar;
    }

    void loadFromAttributes(AttributeSet attributeset, int i)
    {
        super.loadFromAttributes(attributeset, i);
        attributeset = TintTypedArray.obtainStyledAttributes(mView.getContext(), attributeset, TINT_ATTRS, i, 0);
        android.graphics.drawable.Drawable drawable = attributeset.getDrawableIfKnown(0);
        if (drawable != null)
        {
            mView.setThumb(drawable);
        }
        attributeset.recycle();
    }

}

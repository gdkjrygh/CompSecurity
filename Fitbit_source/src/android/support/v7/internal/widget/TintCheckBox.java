// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CheckBox;

// Referenced classes of package android.support.v7.internal.widget:
//            TintTypedArray, TintManager

public class TintCheckBox extends CheckBox
{

    private static final int TINT_ATTRS[] = {
        0x1010107
    };
    private final TintManager mTintManager;

    public TintCheckBox(Context context)
    {
        this(context, null);
    }

    public TintCheckBox(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x101006c);
    }

    public TintCheckBox(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        context = TintTypedArray.obtainStyledAttributes(context, attributeset, TINT_ATTRS, i, 0);
        setButtonDrawable(context.getDrawable(0));
        context.recycle();
        mTintManager = context.getTintManager();
    }

    public void setButtonDrawable(int i)
    {
        setButtonDrawable(mTintManager.getDrawable(i));
    }

}

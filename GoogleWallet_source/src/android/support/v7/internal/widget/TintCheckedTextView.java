// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CheckedTextView;

// Referenced classes of package android.support.v7.internal.widget:
//            TintTypedArray, TintManager

public class TintCheckedTextView extends CheckedTextView
{

    private static final int TINT_ATTRS[] = {
        0x1010108
    };
    private final TintManager mTintManager;

    public TintCheckedTextView(Context context)
    {
        this(context, null);
    }

    public TintCheckedTextView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x10103c8);
    }

    public TintCheckedTextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        context = TintTypedArray.obtainStyledAttributes(context, attributeset, TINT_ATTRS, i, 0);
        setCheckMarkDrawable(context.getDrawable(0));
        context.recycle();
        mTintManager = context.getTintManager();
    }

    public void setCheckMarkDrawable(int i)
    {
        setCheckMarkDrawable(mTintManager.getDrawable(i));
    }

}

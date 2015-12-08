// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;

// Referenced classes of package android.support.v7.internal.widget:
//            TintTypedArray

public class TintEditText extends EditText
{

    private static final int TINT_ATTRS[] = {
        0x10100d4
    };

    public TintEditText(Context context)
    {
        this(context, null);
    }

    public TintEditText(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x101006e);
    }

    public TintEditText(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        context = TintTypedArray.obtainStyledAttributes(context, attributeset, TINT_ATTRS, i, 0);
        setBackgroundDrawable(context.getDrawable(0));
        context.recycle();
    }

}

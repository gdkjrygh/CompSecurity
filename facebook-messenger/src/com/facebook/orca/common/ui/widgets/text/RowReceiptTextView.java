// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.common.ui.widgets.text;

import android.content.Context;
import android.util.AttributeSet;
import com.facebook.inject.t;
import com.facebook.widget.text.l;
import com.facebook.widget.text.m;

// Referenced classes of package com.facebook.orca.common.ui.widgets.text:
//            f, e

public class RowReceiptTextView extends m
{

    private f a;

    public RowReceiptTextView(Context context)
    {
        super(context);
        b();
    }

    public RowReceiptTextView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b();
    }

    public RowReceiptTextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        b();
    }

    private void b()
    {
        a = (f)t.a(getContext()).a(com/facebook/orca/common/ui/widgets/text/f);
    }

    protected l getVariableTextLayoutComputer()
    {
        return a;
    }

    public void setText(String s)
    {
        setData(new e(s));
    }
}

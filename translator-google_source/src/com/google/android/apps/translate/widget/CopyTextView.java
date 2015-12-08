// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.widget;

import android.content.Context;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.widget.TextView;

// Referenced classes of package com.google.android.apps.translate.widget:
//            c

public class CopyTextView extends TextView
{

    private final TextWatcher a = new c(this);
    private TextView b;

    public CopyTextView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = null;
    }

    public void setCopySource(TextView textview)
    {
        if (b != null)
        {
            b.removeTextChangedListener(a);
        }
        b = textview;
        if (b != null)
        {
            b.addTextChangedListener(a);
            setTypeface(b.getTypeface());
            setText(b.getText());
        }
    }
}

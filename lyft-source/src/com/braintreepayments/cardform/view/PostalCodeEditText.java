// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.cardform.view;

import android.content.Context;
import android.text.InputFilter;
import android.util.AttributeSet;

// Referenced classes of package com.braintreepayments.cardform.view:
//            FloatingLabelEditText

public class PostalCodeEditText extends FloatingLabelEditText
{

    public PostalCodeEditText(Context context)
    {
        super(context);
        init();
    }

    public PostalCodeEditText(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    public PostalCodeEditText(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private void init()
    {
        setInputType(112);
        setFilters(new InputFilter[] {
            new android.text.InputFilter.LengthFilter(16)
        });
    }

    public boolean isValid()
    {
        return getText().toString().length() > 0;
    }
}

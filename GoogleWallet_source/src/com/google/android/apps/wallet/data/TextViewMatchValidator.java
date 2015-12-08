// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.data;

import android.content.res.Resources;
import android.widget.TextView;
import com.google.android.apps.wallet.validator.DataValidator;

public final class TextViewMatchValidator
    implements DataValidator
{

    private final TextView matchingTextView;
    private final int noMatchMessageId;

    public TextViewMatchValidator(TextView textview, int i)
    {
        matchingTextView = textview;
        noMatchMessageId = i;
    }

    private boolean isValid(String s, Resources resources)
    {
        return "".equals(validate(s, resources));
    }

    private String validate(String s, Resources resources)
    {
        if (!matchingTextView.getText().toString().equals(s))
        {
            return resources.getString(noMatchMessageId);
        } else
        {
            return "";
        }
    }

    public final volatile boolean isValid(Object obj, Resources resources)
    {
        return isValid((String)obj, resources);
    }

    public final volatile String validate(Object obj, Resources resources)
    {
        return validate((String)obj, resources);
    }
}

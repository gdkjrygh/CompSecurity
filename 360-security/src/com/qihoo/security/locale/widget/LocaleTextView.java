// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.locale.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.qihoo.security.locale.d;

public class LocaleTextView extends TextView
{

    public LocaleTextView(Context context)
    {
        super(context);
    }

    public LocaleTextView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        if (isInEditMode())
        {
            return;
        } else
        {
            setLocalText(attributeset.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "text", 0));
            return;
        }
    }

    public LocaleTextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        if (isInEditMode())
        {
            return;
        } else
        {
            setLocalText(attributeset.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "text", 0));
            return;
        }
    }

    public void setLocalText(int i)
    {
        if (i > 0 && !isInEditMode())
        {
            setText(d.a().a(i));
        }
    }

    public void setLocalText(CharSequence charsequence)
    {
        setText(charsequence);
    }
}

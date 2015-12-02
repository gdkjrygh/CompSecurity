// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.locale.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;
import com.qihoo.security.locale.d;

public class LocaleEditText extends EditText
{

    public LocaleEditText(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        if (isInEditMode())
        {
            return;
        } else
        {
            setLocalText(attributeset.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "text", 0));
            setLocalHint(attributeset.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "hint", 0));
            return;
        }
    }

    public void setLocalHint(int i)
    {
        if (i > 0)
        {
            setHint(d.a().a(i));
        }
    }

    public void setLocalHint(CharSequence charsequence)
    {
        setHint(charsequence);
    }

    public void setLocalText(int i)
    {
        if (i > 0)
        {
            setText(d.a().a(i));
        }
    }

    public void setLocalText(CharSequence charsequence)
    {
        setText(charsequence);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util.accessibility;

import android.text.TextUtils;
import android.widget.TextView;

public class AccessibilityTextDecorator
{

    private TextView a;

    public AccessibilityTextDecorator(TextView textview)
    {
        a = textview;
    }

    public final CharSequence a(CharSequence charsequence)
    {
        Object obj1 = a.getText();
        if (TextUtils.isEmpty(((CharSequence) (obj1))) || (a.getInputType() & 3) != 3) goto _L2; else goto _L1
_L1:
        Object obj = ((CharSequence) (obj1)).toString().replace("", " ").trim();
_L4:
        obj1 = charsequence;
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            if (TextUtils.isEmpty(charsequence))
            {
                break; /* Loop/switch isn't completed */
            }
            obj1 = (new StringBuilder()).append(charsequence).append(", ").append(obj).toString();
        }
        return ((CharSequence) (obj1));
_L2:
        if (!TextUtils.isEmpty(((CharSequence) (obj1))) && (a.getInputType() & 0x80) == 128)
        {
            obj = null;
        } else
        {
            obj = obj1;
            if (TextUtils.isEmpty(((CharSequence) (obj1))))
            {
                obj = a.getHint();
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        return ((CharSequence) (obj));
    }
}

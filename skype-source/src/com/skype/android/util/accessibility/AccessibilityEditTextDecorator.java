// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util.accessibility;

import android.text.TextUtils;
import android.widget.EditText;

public class AccessibilityEditTextDecorator
{

    private EditText a;

    public AccessibilityEditTextDecorator(EditText edittext)
    {
        a = edittext;
    }

    public final CharSequence a(CharSequence charsequence, boolean flag)
    {
        Object obj1 = charsequence;
        if (!flag) goto _L2; else goto _L1
_L1:
        obj1 = a.getText();
        if (TextUtils.isEmpty(((CharSequence) (obj1))) || (a.getInputType() & 3) != 3) goto _L4; else goto _L3
_L3:
        Object obj = ((CharSequence) (obj1)).toString().replace("", " ").trim();
_L6:
        obj1 = charsequence;
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            if (TextUtils.isEmpty(charsequence))
            {
                break; /* Loop/switch isn't completed */
            }
            obj1 = (new StringBuilder()).append(charsequence).append(", ").append(obj).toString();
        }
_L2:
        return ((CharSequence) (obj1));
_L4:
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
        if (true) goto _L6; else goto _L5
_L5:
        return ((CharSequence) (obj));
    }
}

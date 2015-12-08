// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.skype.android.util.accessibility.AccessibilityEditTextDecorator;

// Referenced classes of package com.skype.android.widget:
//            FocusableEditText

public class AccessibleEditText extends FocusableEditText
{

    private AccessibilityEditTextDecorator decorator;
    private Drawable errorIcon;
    private boolean forceImeAction;
    private boolean includeText;

    public AccessibleEditText(Context context)
    {
        super(context);
        includeText = true;
        init(context, null);
    }

    public AccessibleEditText(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        includeText = true;
        init(context, attributeset);
    }

    public AccessibleEditText(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        includeText = true;
        init(context, attributeset);
    }

    public void forceImeAction(boolean flag)
    {
        forceImeAction = flag;
    }

    public CharSequence getContentDescription()
    {
        return decorator.a(super.getContentDescription(), includeText);
    }

    protected void init(Context context, AttributeSet attributeset)
    {
        decorator = new AccessibilityEditTextDecorator(this);
        context = context.obtainStyledAttributes(attributeset, com.skype.android.app.R.styleable.SignUpInputField);
        if (context != null)
        {
            if (context.hasValue(0))
            {
                errorIcon = context.getDrawable(0);
            }
            context.recycle();
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorinfo)
    {
        InputConnection inputconnection = super.onCreateInputConnection(editorinfo);
        if (forceImeAction)
        {
            editorinfo.imeOptions = editorinfo.imeOptions & 0xbfffffff;
        }
        return inputconnection;
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
    {
        super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
        if (!TextUtils.isEmpty(getContentDescription()))
        {
            accessibilitynodeinfo.setText(getContentDescription());
        }
    }

    public void setError(CharSequence charsequence)
    {
        if (charsequence == null)
        {
            setError(null, null);
            return;
        }
        Drawable drawable = errorIcon;
        if (drawable != null)
        {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        setError(charsequence, drawable);
    }

    public void setIncludeTextInContentDescription(boolean flag)
    {
        includeText = flag;
    }
}

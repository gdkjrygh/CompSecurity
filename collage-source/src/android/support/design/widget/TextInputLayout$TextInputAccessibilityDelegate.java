// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.TextView;
import java.util.List;

// Referenced classes of package android.support.design.widget:
//            TextInputLayout, CollapsingTextHelper

private class <init> extends AccessibilityDelegateCompat
{

    final TextInputLayout this$0;

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
    {
        super.onInitializeAccessibilityEvent(view, accessibilityevent);
        accessibilityevent.setClassName(android/support/design/widget/TextInputLayout.getSimpleName());
    }

    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
    {
        super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat);
        accessibilitynodeinfocompat.setClassName(android/support/design/widget/TextInputLayout.getSimpleName());
        view = TextInputLayout.access$400(TextInputLayout.this).getText();
        if (!TextUtils.isEmpty(view))
        {
            accessibilitynodeinfocompat.setText(view);
        }
        if (TextInputLayout.access$500(TextInputLayout.this) != null)
        {
            accessibilitynodeinfocompat.setLabelFor(TextInputLayout.access$500(TextInputLayout.this));
        }
        if (TextInputLayout.access$600(TextInputLayout.this) != null)
        {
            view = TextInputLayout.access$600(TextInputLayout.this).getText();
        } else
        {
            view = null;
        }
        if (!TextUtils.isEmpty(view))
        {
            accessibilitynodeinfocompat.setContentInvalid(true);
            accessibilitynodeinfocompat.setError(view);
        }
    }

    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
    {
        super.onPopulateAccessibilityEvent(view, accessibilityevent);
        view = TextInputLayout.access$400(TextInputLayout.this).getText();
        if (!TextUtils.isEmpty(view))
        {
            accessibilityevent.getText().add(view);
        }
    }

    private ()
    {
        this$0 = TextInputLayout.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}

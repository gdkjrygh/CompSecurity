// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.support.v4.view.a;
import android.support.v4.view.accessibility.c;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.TextView;
import java.util.List;

// Referenced classes of package android.support.design.widget:
//            TextInputLayout, d

private final class <init> extends a
{

    final TextInputLayout a;

    public final void a(View view, c c1)
    {
        super.a(view, c1);
        c1.b(android/support/design/widget/TextInputLayout.getSimpleName());
        view = TextInputLayout.b(a).e();
        if (!TextUtils.isEmpty(view))
        {
            c1.c(view);
        }
        if (android.support.design.widget.TextInputLayout.c(a) != null)
        {
            c1.d(android.support.design.widget.TextInputLayout.c(a));
        }
        if (TextInputLayout.d(a) != null)
        {
            view = TextInputLayout.d(a).getText();
        } else
        {
            view = null;
        }
        if (!TextUtils.isEmpty(view))
        {
            c1.p();
            c1.e(view);
        }
    }

    public final void a(View view, AccessibilityEvent accessibilityevent)
    {
        super.a(view, accessibilityevent);
        accessibilityevent.setClassName(android/support/design/widget/TextInputLayout.getSimpleName());
    }

    public final void b(View view, AccessibilityEvent accessibilityevent)
    {
        super.b(view, accessibilityevent);
        view = TextInputLayout.b(a).e();
        if (!TextUtils.isEmpty(view))
        {
            accessibilityevent.getText().add(view);
        }
    }

    private (TextInputLayout textinputlayout)
    {
        a = textinputlayout;
        super();
    }

    a(TextInputLayout textinputlayout, byte byte0)
    {
        this(textinputlayout);
    }
}

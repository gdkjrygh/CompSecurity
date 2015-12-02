// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.locale.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.qihoo.security.opti.trashclear.ui.mainpage.opti.a;

// Referenced classes of package com.qihoo.security.locale.widget:
//            LocaleTextView

public class AppLabelLocaleTextView extends LocaleTextView
    implements com.qihoo.security.opti.trashclear.ui.mainpage.opti.a.a
{

    private String a;

    public AppLabelLocaleTextView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public void a(String s, String s1)
    {
        String s2 = s;
        if (s == null)
        {
            s2 = "";
        }
        if (a != null && a.equals(s1))
        {
            setText(s2);
        }
    }

    public void setPackageName(String s)
    {
        a = s;
        setText("");
        com.qihoo.security.opti.trashclear.ui.mainpage.opti.a.a().a(this, "app-label", s, "");
    }
}

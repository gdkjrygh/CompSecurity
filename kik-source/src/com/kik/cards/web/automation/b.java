// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.automation;

import android.view.KeyEvent;
import android.widget.TextView;
import com.kik.cards.web.bd;
import org.a.a.b.c;

// Referenced classes of package com.kik.cards.web.automation:
//            a

final class b
    implements android.widget.TextView.OnEditorActionListener
{

    final a a;

    b(a a1)
    {
        a = a1;
        super();
    }

    public final boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 2 || keyevent.getKeyCode() == 66 && keyevent.getAction() == 0)
        {
            textview = c.a(com.kik.cards.web.automation.a.a(a));
            com.kik.cards.web.automation.a.b(a).loadUrl((new StringBuilder("javascript:window.automation.setSyncValue(eval('")).append(textview).append("'));").toString());
            com.kik.cards.web.automation.a.c(a).setText("");
            return true;
        } else
        {
            return false;
        }
    }
}

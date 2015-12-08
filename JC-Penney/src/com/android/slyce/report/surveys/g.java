// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.surveys;

import android.view.KeyEvent;
import android.widget.TextView;

// Referenced classes of package com.android.slyce.report.surveys:
//            f, CardCarouselLayout, e

class g
    implements android.widget.TextView.OnEditorActionListener
{

    final CardCarouselLayout a;
    final f b;

    g(f f1, CardCarouselLayout cardcarousellayout)
    {
        b = f1;
        a = cardcarousellayout;
        super();
    }

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        boolean flag1 = false;
        boolean flag;
        if (keyevent != null && keyevent.getKeyCode() == 66 && keyevent.getAction() == 0 && (keyevent.getFlags() & 0x20) == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag || i == 6)
        {
            textview.clearComposingText();
            if (CardCarouselLayout.a(b.a) != null)
            {
                textview = textview.getText().toString();
                CardCarouselLayout.a(b.a).a(f.a(b), textview);
            }
            flag1 = true;
        }
        return flag1;
    }
}

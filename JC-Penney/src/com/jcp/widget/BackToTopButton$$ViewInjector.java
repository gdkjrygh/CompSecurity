// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.widget;

import android.view.View;
import com.getbase.floatingactionbutton.FloatingActionButton;

// Referenced classes of package com.jcp.widget:
//            BackToTopButton, a

public class onButton
    implements butterknife.or
{

    public void inject(butterknife.or or, BackToTopButton backtotopbutton, Object obj)
    {
        obj = (View)or.dView(obj, 0x7f0e04eb, "field 'backToTopButton' and method 'onBackToTopClick'");
        backtotopbutton.backToTopButton = (FloatingActionButton)or.ctionButton(((View) (obj)), 0x7f0e04eb, "field 'backToTopButton'");
        ((View) (obj)).setOnClickListener(new a(this, backtotopbutton));
    }

    public volatile void inject(butterknife.or or, Object obj, Object obj1)
    {
        inject(or, (BackToTopButton)obj, obj1);
    }

    public void reset(BackToTopButton backtotopbutton)
    {
        backtotopbutton.backToTopButton = null;
    }

    public volatile void reset(Object obj)
    {
        reset((BackToTopButton)obj);
    }

    public onButton()
    {
    }
}

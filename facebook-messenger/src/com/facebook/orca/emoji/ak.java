// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.emoji;

import android.view.View;

// Referenced classes of package com.facebook.orca.emoji:
//            TabbedPageView

class ak
    implements android.view.View.OnClickListener
{

    final String a;
    final int b;
    final TabbedPageView c;

    ak(TabbedPageView tabbedpageview, String s, int i)
    {
        c = tabbedpageview;
        a = s;
        b = i;
        super();
    }

    public void onClick(View view)
    {
        TabbedPageView.a(c, a, b);
    }
}

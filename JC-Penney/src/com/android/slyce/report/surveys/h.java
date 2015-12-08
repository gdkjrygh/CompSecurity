// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.surveys;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.android.slyce.report.surveys:
//            f, CardCarouselLayout, i

class h
    implements android.widget.AdapterView.OnItemClickListener
{

    final CardCarouselLayout a;
    final f b;

    h(f f1, CardCarouselLayout cardcarousellayout)
    {
        b = f1;
        a = cardcarousellayout;
        super();
    }

    public void onItemClick(AdapterView adapterview, View view, int j, long l)
    {
        if (CardCarouselLayout.a(b.a) != null)
        {
            adapterview = adapterview.getItemAtPosition(j).toString();
            b.a.postDelayed(new i(this, adapterview), 165L);
        }
    }
}

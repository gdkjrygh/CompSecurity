// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.surveys;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.mixpanel.android.surveys:
//            CardCarouselLayout, d

final class c
    implements android.widget.AdapterView.OnItemClickListener
{

    final CardCarouselLayout a;
    final CardCarouselLayout.d b;

    c(CardCarouselLayout.d d1, CardCarouselLayout cardcarousellayout)
    {
        b = d1;
        a = cardcarousellayout;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (CardCarouselLayout.a(b.a) != null)
        {
            adapterview = adapterview.getItemAtPosition(i).toString();
            b.a.postDelayed(new d(this, adapterview), 165L);
        }
    }
}

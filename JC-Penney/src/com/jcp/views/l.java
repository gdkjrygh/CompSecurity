// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.views;

import android.view.View;
import com.jcp.pojo.Accordion;

// Referenced classes of package com.jcp.views:
//            j, DataListView, i

class l
    implements android.view.View.OnClickListener
{

    final Accordion a;
    final j b;

    l(j j1, Accordion accordion)
    {
        b = j1;
        a = accordion;
        super();
    }

    public void onClick(View view)
    {
        DataListView.e(b.a).a(a);
    }
}

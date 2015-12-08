// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            SelectorBaseActivity

final class bj
    implements android.view.View.OnClickListener
{

    final SelectorBaseActivity a;

    bj(SelectorBaseActivity selectorbaseactivity)
    {
        a = selectorbaseactivity;
        super();
    }

    public final void onClick(View view)
    {
        a.i.setVisibility(8);
        a.j.setVisibility(0);
        a.l = new ArrayList();
        a.e.removeAllViews();
        a.f();
        SelectorBaseActivity.a(a);
        a.g();
    }
}

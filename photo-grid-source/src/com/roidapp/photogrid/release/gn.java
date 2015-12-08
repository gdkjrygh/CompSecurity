// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.view.View;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

// Referenced classes of package com.roidapp.photogrid.release:
//            ge

final class gn
    implements android.view.View.OnClickListener
{

    final TextView a;
    final RelativeLayout b;
    final ge c;

    gn(ge ge1, TextView textview, RelativeLayout relativelayout)
    {
        c = ge1;
        a = textview;
        b = relativelayout;
        super();
    }

    public final void onClick(View view)
    {
        a.setBackgroundDrawable(null);
        b.setBackgroundResource(0x7f020074);
        ge.b(c).setVisibility(8);
        ge.c(c).setVisibility(0);
        ge.e(c);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.widget;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import com.jcp.activities.MainActivity;

// Referenced classes of package com.jcp.widget:
//            g

class h
    implements android.widget.AdapterView.OnItemClickListener
{

    final g a;

    h(g g1)
    {
        a = g1;
        super();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        g.a(a).c(i, "popupmenu");
        adapterview = AnimationUtils.loadAnimation(g.a(a), 0x10a0001);
        adapterview.setDuration(5L);
        view.startAnimation(adapterview);
        a.a();
    }
}

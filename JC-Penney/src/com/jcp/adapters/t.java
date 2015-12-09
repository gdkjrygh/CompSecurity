// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

// Referenced classes of package com.jcp.adapters:
//            s

class t
    implements android.view.View.OnClickListener
{

    final ViewGroup a;
    final android.widget.RelativeLayout.LayoutParams b;
    final int c;
    final ImageView d;
    final ImageView e;
    final s f;

    t(s s1, ViewGroup viewgroup, android.widget.RelativeLayout.LayoutParams layoutparams, int i, ImageView imageview, ImageView imageview1)
    {
        f = s1;
        a = viewgroup;
        b = layoutparams;
        c = i;
        d = imageview;
        e = imageview1;
        super();
    }

    public void onClick(View view)
    {
        s.a(f, a, b, c, d, e);
    }
}

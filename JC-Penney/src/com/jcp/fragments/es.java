// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.content.SharedPreferences;
import android.view.View;
import android.widget.ListView;

// Referenced classes of package com.jcp.fragments:
//            el

class es
    implements android.view.View.OnClickListener
{

    final el a;

    es(el el1)
    {
        a = el1;
        super();
    }

    public void onClick(View view)
    {
        boolean flag = true;
        int i = el.g(a).getFirstVisiblePosition();
        int j = el.h(a);
        view = el.i(a);
        android.content.SharedPreferences.Editor editor = view.edit();
        if (view.getBoolean("show_products_as_list", true))
        {
            flag = false;
        }
        editor.putBoolean("show_products_as_list", flag).apply();
        el.j(a);
        el.k(a);
        el.a(a, el.g(a), el.l(a), i, j);
    }
}

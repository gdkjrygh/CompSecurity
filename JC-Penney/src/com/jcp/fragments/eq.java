// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.ac;
import android.view.View;
import android.widget.TextView;

// Referenced classes of package com.jcp.fragments:
//            el

class eq
    implements android.view.View.OnClickListener
{

    final TextView a;
    final el b;

    eq(el el1, TextView textview)
    {
        b = el1;
        a = textview;
        super();
    }

    public void onClick(View view)
    {
        el.a(b, (TextView)b.i().findViewById(0x7f0e045d));
        String s = a.getText().toString();
        el.f(b).setText(s);
        Bundle bundle = new Bundle();
        bundle.putString("SELECTED_VALUE", view.getTag().toString());
        bundle.putString("Title", b.j().getString(0x7f0703b9));
        bundle.putBoolean("progress", false);
        bundle.putString("SEARCH_TAG", s);
        if (view.getTag().toString().contains(b.j().getString(0x7f0703b8)))
        {
            bundle.putBoolean("SEARCH", true);
        }
        el.a(b, bundle);
    }
}

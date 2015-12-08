// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.jcp.fragments:
//            SavedCardFragment, et, s, t

class ey
    implements android.widget.AdapterView.OnItemClickListener
{

    final et a;

    ey(et et1)
    {
        a = et1;
        super();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = new SavedCardFragment();
        view = s.a(a.i());
        if (view != null)
        {
            view.c(adapterview, "SavedCardFragment");
        }
    }
}

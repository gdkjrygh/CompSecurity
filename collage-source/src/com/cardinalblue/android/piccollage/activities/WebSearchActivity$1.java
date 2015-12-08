// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.text.TextUtils;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            WebSearchActivity

class a
    implements android.support.v7.widget.xtListener
{

    final WebSearchActivity a;

    public boolean onQueryTextChange(String s)
    {
        WebSearchActivity.a(a, s);
        return true;
    }

    public boolean onQueryTextSubmit(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return false;
        } else
        {
            a.a(s);
            return true;
        }
    }

    (WebSearchActivity websearchactivity)
    {
        a = websearchactivity;
        super();
    }
}

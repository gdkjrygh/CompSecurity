// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.picker;

import android.widget.AbsListView;

// Referenced classes of package com.facebook.contacts.picker:
//            ak

class al
    implements android.widget.AbsListView.OnScrollListener
{

    final ak a;

    al(ak ak1)
    {
        a = ak1;
        super();
    }

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
        ak.a(a, i);
    }
}

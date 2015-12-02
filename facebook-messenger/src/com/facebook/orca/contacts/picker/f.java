// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.picker;

import android.widget.AbsListView;

// Referenced classes of package com.facebook.orca.contacts.picker:
//            ContactMultipickerFragment, ContactPickerFragment

class f
    implements android.widget.AbsListView.OnScrollListener
{

    final ContactMultipickerFragment a;

    f(ContactMultipickerFragment contactmultipickerfragment)
    {
        a = contactmultipickerfragment;
        super();
    }

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
        if (i == 1)
        {
            ContactMultipickerFragment.c(a).Q();
        }
    }
}

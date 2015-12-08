// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.addfriends;

import com.emilsjolander.components.stickylistheaders.StickyListHeadersListView;

// Referenced classes of package com.snapchat.android.fragments.addfriends:
//            AddedMeFragment

final class a
    implements Runnable
{

    private int a;
    private AddedMeFragment b;

    public final void run()
    {
        b.d.setSelection(a);
    }

    dersListView(AddedMeFragment addedmefragment, int i)
    {
        b = addedmefragment;
        a = i;
        super();
    }
}

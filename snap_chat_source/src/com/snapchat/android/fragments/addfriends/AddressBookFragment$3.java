// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.addfriends;

import android.content.DialogInterface;

// Referenced classes of package com.snapchat.android.fragments.addfriends:
//            AddressBookFragment

final class a
    implements android.content.kListener
{

    private AddressBookFragment a;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        a.d(true);
        a.P();
    }

    (AddressBookFragment addressbookfragment)
    {
        a = addressbookfragment;
        super();
    }
}

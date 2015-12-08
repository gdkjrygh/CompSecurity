// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.addfriends;

import PF;
import android.os.Handler;
import android.widget.Button;

// Referenced classes of package com.snapchat.android.fragments.addfriends:
//            AddressBookFragment

public final class a extends PF
{

    private int a;
    private AddressBookFragment b;

    public final void a()
    {
        if (!b.isAdded())
        {
            return;
        } else
        {
            a = a - 1;
            b.z.setText((new StringBuilder()).append(b.getString(0x7f080216)).append(" ").append(a).toString());
            return;
        }
    }

    public final void b()
    {
        if (!b.isAdded())
        {
            return;
        } else
        {
            b.z.setText(0x7f080216);
            b.z.setEnabled(true);
            return;
        }
    }

    public (AddressBookFragment addressbookfragment)
    {
        b = addressbookfragment;
        super(3, 1000L, new Handler());
        addressbookfragment.z.setEnabled(false);
        a = 3;
        addressbookfragment.z.setText((new StringBuilder()).append(addressbookfragment.getString(0x7f080216)).append(" ").append(a).toString());
    }
}

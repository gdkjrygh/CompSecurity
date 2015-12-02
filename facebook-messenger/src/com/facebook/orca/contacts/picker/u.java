// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.picker;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.facebook.orca.contacts.picker:
//            ContactPickerFragment

class u
    implements android.widget.AdapterView.OnItemClickListener
{

    final ContactPickerFragment a;

    u(ContactPickerFragment contactpickerfragment)
    {
        a = contactpickerfragment;
        super();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        ContactPickerFragment.a(a, i);
    }
}

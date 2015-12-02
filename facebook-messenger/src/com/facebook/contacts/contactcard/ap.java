// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.contactcard;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.facebook.contacts.contactcard:
//            HiddenEntryPickerActivity

class ap
    implements android.widget.AdapterView.OnItemClickListener
{

    final HiddenEntryPickerActivity a;

    ap(HiddenEntryPickerActivity hiddenentrypickeractivity)
    {
        a = hiddenentrypickeractivity;
        super();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = new Intent();
        adapterview.putExtra("entry_position", i);
        a.setResult(1, adapterview);
        a.finish();
    }
}

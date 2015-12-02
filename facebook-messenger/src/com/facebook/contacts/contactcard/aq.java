// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.contactcard;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.facebook.contacts.models.entry.Entry;
import com.facebook.k;
import com.google.common.a.es;

// Referenced classes of package com.facebook.contacts.contactcard:
//            ao, HiddenEntryPickerActivity

class aq extends ArrayAdapter
{

    final HiddenEntryPickerActivity a;
    private final Context b;
    private final es c;

    public aq(HiddenEntryPickerActivity hiddenentrypickeractivity, Context context, es es1)
    {
        a = hiddenentrypickeractivity;
        super(context, k.orca_quick_action_menu_item, es1);
        b = context;
        c = es1;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            view = new ao(b);
        } else
        {
            view = (ao)view;
        }
        view.setEntry((Entry)c.get(i));
        return view;
    }
}

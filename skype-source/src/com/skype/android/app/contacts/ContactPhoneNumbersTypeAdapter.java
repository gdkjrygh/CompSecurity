// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.skype.android.widget.SpinnerAdapter;
import java.util.List;

public class ContactPhoneNumbersTypeAdapter extends SpinnerAdapter
{

    public ContactPhoneNumbersTypeAdapter(Context context, List list)
    {
        super(context, list);
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        view = super.getView(i, view, viewgroup);
        viewgroup = (TextView)view.findViewById(0x7f100532);
        String s = (String)getItem(i);
        viewgroup.setText(s);
        view.setContentDescription(getContext().getResources().getString(0x7f080078, new Object[] {
            s
        }));
        return view;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.actionbar;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.pinterest.kit.utils.PhoneNumberSignupUtils;
import java.util.List;

public class PhoneNumberSpinnerAdapter extends ArrayAdapter
{

    private Context _context;
    private List _countries;

    public PhoneNumberSpinnerAdapter(Context context, int i, List list)
    {
        super(context, i, list);
        _context = context;
        _countries = list;
    }

    public View getDropDownView(int i, View view, ViewGroup viewgroup)
    {
        view = new TextView(_context);
        view.setText(PhoneNumberSignupUtils.getFormattedCountryCode((String)_countries.get(i)));
        return view;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        view = new TextView(_context);
        i = PhoneNumberSignupUtils.getCountryCode((String)_countries.get(i));
        view.setText((new StringBuilder("+")).append(String.valueOf(i)).toString());
        return view;
    }
}

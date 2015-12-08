// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.developer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import com.pinterest.experiment.Experiments;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DeveloperExperimentView extends LinearLayout
{

    public DeveloperExperimentView(Context context)
    {
        this(context, null);
    }

    public DeveloperExperimentView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    private static int a(String s, String as[])
    {
        for (int i = 0; i < as.length; i++)
        {
            if (as[i].equals(s))
            {
                return i;
            }
        }

        return 0;
    }

    public void onFinishInflate()
    {
        super.onFinishInflate();
        setOrientation(1);
        LayoutInflater layoutinflater = LayoutInflater.from(getContext());
        Map map = Experiments.ad();
        LinearLayout linearlayout;
        for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); addView(linearlayout))
        {
            String s2 = (String)iterator.next();
            linearlayout = (LinearLayout)layoutinflater.inflate(0x7f03012f, null);
            ((TextView)linearlayout.findViewById(0x7f0f0304)).setText(s2);
            Spinner spinner = (Spinner)linearlayout.findViewById(0x7f0f0095);
            String as[] = (String[])map.get(s2);
            spinner.setAdapter(new ArrayAdapter(getContext(), 0x1090009, as));
            String s1 = Experiments.a(s2, false);
            String s = s1;
            if (s1 == null)
            {
                s = "no_group";
            }
            spinner.setSelection(a(s, as));
            spinner.setOnItemSelectedListener(new _cls1(as, s2));
        }

    }

    private class _cls1
        implements android.widget.AdapterView.OnItemSelectedListener
    {

        final String a[];
        final String b;
        final DeveloperExperimentView c;

        public void onItemSelected(AdapterView adapterview, View view, int i, long l)
        {
            if (a[i] == "no_group")
            {
                adapterview = null;
            } else
            {
                adapterview = a[i];
            }
            Experiments.b(b, adapterview);
            Experiments.a(b, adapterview);
        }

        public void onNothingSelected(AdapterView adapterview)
        {
        }

        _cls1(String as[], String s)
        {
            c = DeveloperExperimentView.this;
            a = as;
            b = s;
            super();
        }
    }

}

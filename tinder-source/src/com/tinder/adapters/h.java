// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.m4b.maps.model.j;
import com.tinder.model.TinderLocation;
import java.util.HashMap;
import java.util.Map;

public final class h
    implements com.google.android.m4b.maps.c.a
{

    public Map a;
    private Context b;

    public h(Context context)
    {
        b = context;
        a = new HashMap();
    }

    public final View a(j j)
    {
        View view = View.inflate(b, 0x7f0300a4, null);
        TextView textview = (TextView)view.findViewById(0x7f0e02f8);
        TextView textview1 = (TextView)view.findViewById(0x7f0e02f9);
        ImageView imageview = (ImageView)view.findViewById(0x7f0e02fa);
        j = (TinderLocation)a.get(j);
        if (j != null)
        {
            Object obj = j.getLabels();
            j = (String)((Pair) (obj)).first;
            obj = (String)((Pair) (obj)).second;
            if (TextUtils.isEmpty(j))
            {
                textview.setText(0x7f060136);
                textview1.setVisibility(8);
                imageview.setVisibility(8);
                return view;
            }
            String s = b.getResources().getString(0x7f0600d0, new Object[] {
                j
            });
            SpannableString spannablestring = new SpannableString(s);
            spannablestring.setSpan(new StyleSpan(1), s.indexOf(j), s.length(), 0);
            textview.setText(spannablestring);
            if (TextUtils.isEmpty(((CharSequence) (obj))))
            {
                textview1.setVisibility(8);
            } else
            {
                textview1.setText(((CharSequence) (obj)));
            }
            imageview.setVisibility(0);
            return view;
        } else
        {
            j = new SpannableString(b.getString(0x7f0601c6));
            j.setSpan(new StyleSpan(1), 0, j.length(), 0);
            textview.setText(j);
            textview1.setVisibility(8);
            imageview.setVisibility(8);
            return view;
        }
    }

    public final TinderLocation b(j j)
    {
        return (TinderLocation)a.get(j);
    }
}

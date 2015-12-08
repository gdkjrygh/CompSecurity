// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.cards;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.translate.m;
import com.google.android.apps.translate.o;

// Referenced classes of package com.google.android.apps.translate.cards:
//            AbstractCard, b, a

public class DictionaryCard extends AbstractCard
    implements android.view.View.OnClickListener
{

    private final LayoutInflater a;
    private final b b;
    private final LinearLayout c;
    private final a d;

    public DictionaryCard(Context context, b b1, int i, a a1)
    {
        super(context, o.card_dictionary);
        if ((i & 2) != 0)
        {
            View view = findViewById(m.layout_dict_card);
            if (view != null)
            {
                view.setBackgroundResource(0);
                view.setBackgroundColor(0);
            }
        }
        if ((i & 1) != 0)
        {
            View view1 = findViewById(m.label_dictionary);
            if (view1 != null)
            {
                view1.setVisibility(8);
            }
        }
        b1.h.put(2, this);
        a = LayoutInflater.from(context);
        b = b1;
        c = (LinearLayout)findViewById(m.resultContainer);
        String as[] = b1.c.a(2).split("\n");
        int j = as.length;
        i = 0;
        while (i < j) 
        {
            b1 = as[i];
            if (!b1.isEmpty())
            {
                if (b1.startsWith(" "))
                {
                    context = a(b1.split("\\. ", 2)[1], o.card_dictionary_row);
                    if (b.g != null)
                    {
                        context.setTypeface(b.g);
                    }
                    context.setTag(o.card_dictionary_row, Boolean.valueOf(true));
                    context.setOnClickListener(this);
                } else
                {
                    context = b1;
                    if (b1.endsWith(":"))
                    {
                        context = b1.substring(0, b1.length() - 1);
                    }
                    a(context, o.card_dictionary_header);
                }
            }
            i++;
        }
        d = a1;
    }

    private TextView a(CharSequence charsequence, int i)
    {
        TextView textview = (TextView)a.inflate(i, null);
        textview.setText(charsequence);
        c.addView(textview);
        return textview;
    }

    public void onClick(View view)
    {
        if (d != null)
        {
            d.a(((TextView)view).getText().toString(), b);
        }
    }
}

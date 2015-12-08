// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.widget;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.apps.translate.e.d;
import com.google.android.apps.translate.o;
import com.google.android.apps.translate.r;
import com.google.android.libraries.translate.core.Entry;
import com.google.android.libraries.translate.languages.Language;
import com.google.android.libraries.translate.languages.e;

final class ap extends ArrayAdapter
{

    private final com.google.android.libraries.translate.languages.d a;

    public ap(Context context)
    {
        super(context, o.widget_phrase_item);
        a = e.a(context);
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        Entry entry;
        Language language;
        Language language1;
        if (view == null)
        {
            view = View.inflate(getContext(), o.widget_phrase_item, null);
            viewgroup = Pair.create((TextView)view.findViewById(0x1020014), (TextView)view.findViewById(0x1020015));
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (Pair)view.getTag();
        }
        entry = (Entry)getItem(i);
        language = entry.getFromLanguage(a);
        language1 = entry.getToLanguage(a);
        ((TextView)((Pair) (viewgroup)).first).setText(entry.getInputText());
        ((TextView)((Pair) (viewgroup)).first).setContentDescription(getContext().getString(r.label_language_of_text, new Object[] {
            language.getLongName(), entry.getInputText()
        }));
        ((TextView)((Pair) (viewgroup)).first).setTypeface(d.b(entry.getFromLanguageShortName()));
        ((TextView)((Pair) (viewgroup)).second).setText(entry.getTranslation());
        ((TextView)((Pair) (viewgroup)).second).setContentDescription(getContext().getString(r.label_language_of_text, new Object[] {
            language1.getLongName(), entry.getTranslation()
        }));
        ((TextView)((Pair) (viewgroup)).second).setTypeface(d.b(entry.getToLanguageShortName()));
        return view;
    }
}

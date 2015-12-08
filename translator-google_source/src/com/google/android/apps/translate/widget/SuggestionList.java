// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.apps.translate.m;
import com.google.android.apps.translate.o;
import com.google.android.apps.translate.r;
import com.google.android.libraries.translate.core.Entry;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.languages.Language;
import com.google.android.libraries.translate.languages.d;
import com.google.android.libraries.translate.languages.e;
import com.google.android.libraries.translate.logging.Event;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.apps.translate.widget:
//            av, aw

public class SuggestionList extends ScrollView
    implements android.view.View.OnClickListener
{

    private final List a = new ArrayList();
    private final ViewGroup b;
    private final d c;
    private boolean d;
    private aw e;

    public SuggestionList(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        LayoutInflater.from(context).inflate(o.input_suggestion_list, this, true);
        b = (ViewGroup)findViewById(m.suggest_list_container);
        c = com.google.android.libraries.translate.languages.e.a(context);
        d = true;
    }

    public final void a(List list)
    {
        boolean flag = list.isEmpty();
        if (!d || !flag)
        {
            d = flag;
            b.removeAllViews();
            for (int i = list.size() - a.size(); i > 0; i--)
            {
                View view = View.inflate(getContext(), o.input_suggestion_item, null);
                view.setTag(new av(view));
                view.setOnClickListener(this);
                a.add(view);
            }

            int k = list.size();
            int j = 0;
            while (j <= k - 1) 
            {
                Object obj = (View)a.get(j);
                b.addView(((View) (obj)));
                obj = (av)((View) (obj)).getTag();
                Entry entry = (Entry)list.get(j);
                d d1 = c;
                obj.c = entry;
                ((av) (obj)).a.setText(entry.getInputText());
                if (!entry.getOutputText().isEmpty())
                {
                    ((av) (obj)).b.setVisibility(8);
                } else
                if ("spell_correct".equals(entry.getId()))
                {
                    ((av) (obj)).b.setVisibility(0);
                    ((av) (obj)).b.setText(r.label_did_you_mean);
                } else
                if ("lang_suggest".equals(entry.getId()))
                {
                    ((av) (obj)).b.setVisibility(0);
                    ((av) (obj)).b.setText(r.label_translate_from);
                    ((av) (obj)).a.setText(entry.getFromLanguage(d1).getLongName());
                } else
                {
                    entry.getId();
                    ((av) (obj)).b.setVisibility(8);
                }
                j++;
            }
        }
    }

    public void onClick(View view)
    {
        if (e != null)
        {
            av av1 = (av)view.getTag();
            aw aw1 = e;
            if (av1 == null)
            {
                view = null;
            } else
            {
                view = av1.c;
            }
            aw1.a(view);
            if (av1 != null)
            {
                view = av1.c.getId();
                if ("spell_correct".equals(view))
                {
                    view = Event.SPELL_CORRECTION_CLICKED_IN_EDIT_MODE;
                } else
                if ("lang_suggest".equals(view))
                {
                    view = Event.LANGID_CLICKED_IN_EDIT_MODE;
                } else
                {
                    view = Event.HISTORY_CLICKED_IN_EDIT_MODE;
                }
                Singleton.b().a(view, null, null);
            }
        }
    }

    public void setOnSuggestClickListener(aw aw1)
    {
        e = aw1;
    }
}

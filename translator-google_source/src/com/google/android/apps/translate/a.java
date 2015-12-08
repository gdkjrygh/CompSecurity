// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.apps.translate.e.d;
import com.google.android.apps.translate.e.k;
import com.google.android.apps.translate.widget.StarButton;
import com.google.android.libraries.translate.core.Entry;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.e.h;
import com.google.android.libraries.translate.languages.Language;
import com.google.android.libraries.translate.languages.e;
import com.google.android.libraries.translate.logging.Event;
import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.google.android.apps.translate:
//            o, b, r

public final class a extends ArrayAdapter
    implements android.view.View.OnClickListener
{

    private static final Entry a = Entry.getNullHistoryEntry();
    private static final Entry b = Entry.getNullHistoryEntry();
    private final HashMap c = Maps.b();
    private final android.view.View.OnTouchListener d = null;
    private final View e;
    private View f;
    private int g;
    private boolean h;
    private int i;
    private int j;
    private boolean k;
    private final com.google.android.libraries.translate.languages.d l;

    public a(Context context, View view)
    {
        super(context, o.card_history_item);
        g = 4;
        e = view;
        b(a);
        l = com.google.android.libraries.translate.languages.e.a(context);
    }

    private void b()
    {
        boolean flag = true;
        i = getCount() - 1;
        int i1;
        if (h)
        {
            i1 = 2;
        } else
        {
            i1 = 1;
        }
        j = i1;
        if (i != j)
        {
            flag = false;
        }
        k = flag;
    }

    private void b(Entry entry)
    {
        HashMap hashmap = c;
        int i1 = g;
        g = i1 + 1;
        hashmap.put(entry, Integer.valueOf(i1));
        super.add(entry);
    }

    public final void a()
    {
        f = null;
        h = false;
        a(b);
    }

    public final void a(Entry entry)
    {
        super.remove(entry);
        b();
    }

    public final void a(List list, View view)
    {
        clear();
        if (view != null)
        {
            f = view;
            boolean flag;
            if (f != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            h = flag;
            b(b);
            c.put(b, Integer.valueOf(1));
        }
        for (list = list.iterator(); list.hasNext(); b((Entry)list.next())) { }
        b();
    }

    public final void add(Object obj)
    {
        b((Entry)obj);
    }

    public final void clear()
    {
        super.clear();
        g = 4;
        c.clear();
        b(a);
    }

    public final long getItemId(int i1)
    {
        return (long)((Integer)c.get(getItem(i1))).intValue();
    }

    public final int getItemViewType(int i1)
    {
        int j1 = 2;
        if (h)
        {
            j1 = Math.min(i1, 2);
        } else
        if (i1 <= 0)
        {
            return 0;
        }
        return j1;
    }

    public final View getView(int i1, View view, ViewGroup viewgroup)
    {
        if (i1 == 0)
        {
            return e;
        }
        if (h && i1 == 1)
        {
            return f;
        }
        Context context;
        Language language;
        Object obj;
        com.google.android.libraries.translate.languages.d d1;
        if (view == null)
        {
            view = View.inflate(getContext(), o.card_history_item, null);
            viewgroup = new b(view);
            if (d != null)
            {
                view.setOnTouchListener(d);
                view.setOnClickListener(this);
            }
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (b)view.getTag();
        }
        context = getContext();
        obj = (Entry)getItem(i1);
        d1 = l;
        viewgroup.e = ((Entry) (obj));
        language = ((Entry) (obj)).getFromLanguage(d1);
        obj = ((Entry) (obj)).getToLanguage(d1);
        ((b) (viewgroup)).b.setText(((b) (viewgroup)).e.getInputText());
        ((b) (viewgroup)).b.setContentDescription(context.getString(r.label_language_of_text, new Object[] {
            language.getLongName(), ((b) (viewgroup)).e.getInputText()
        }));
        ((b) (viewgroup)).b.setTypeface(com.google.android.apps.translate.e.d.b(((b) (viewgroup)).e.getFromLanguageShortName()));
        ((b) (viewgroup)).c.setText(((b) (viewgroup)).e.getTranslation());
        ((b) (viewgroup)).c.setContentDescription(context.getString(r.label_language_of_text, new Object[] {
            ((Language) (obj)).getLongName(), ((b) (viewgroup)).e.getTranslation()
        }));
        ((b) (viewgroup)).c.setTypeface(com.google.android.apps.translate.e.d.b(((b) (viewgroup)).e.getToLanguageShortName()));
        ((b) (viewgroup)).d.setEntry(((b) (viewgroup)).e);
        if (k)
        {
            i1 = com.google.android.apps.translate.b.a.a;
        } else
        if (i1 == j)
        {
            i1 = com.google.android.apps.translate.b.a.b;
        } else
        if (i1 == i)
        {
            i1 = com.google.android.apps.translate.b.a.d;
        } else
        {
            i1 = com.google.android.apps.translate.b.a.c;
        }
        com.google.android.apps.translate.b.a.a(((b) (viewgroup)).a, i1);
        return view;
    }

    public final int getViewTypeCount()
    {
        return 3;
    }

    public final boolean hasStableIds()
    {
        return true;
    }

    public final void onClick(View view)
    {
        view = (b)view.getTag();
        if (view != null && ((b) (view)).e != null)
        {
            view = ((b) (view)).e;
            Singleton.b().a(Event.HISTORY_VIEW_ITEM_EXPANSIONS, null, null);
            Object obj = com.google.android.libraries.translate.languages.e.a().a(getContext(), Locale.getDefault());
            obj = com.google.android.apps.translate.e.k.a(view.getInputText(), view.getFromLanguage(((com.google.android.libraries.translate.languages.d) (obj))), view.getToLanguage(((com.google.android.libraries.translate.languages.d) (obj))), null);
            ((Bundle) (obj)).putString("output", view.getOutputText());
            com.google.android.libraries.translate.e.h.a(3, ((Bundle) (obj)));
        }
    }

    public final void remove(Object obj)
    {
        a((Entry)obj);
    }

}

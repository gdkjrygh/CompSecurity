// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import com.google.android.apps.translate.r;
import com.google.android.libraries.translate.c.b;
import com.google.android.libraries.translate.core.Entry;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.e.m;
import com.google.android.libraries.translate.logging.Event;
import com.google.android.libraries.translate.logging.e;

public class StarButton extends ImageButton
    implements android.view.View.OnClickListener
{

    private Entry a;

    public StarButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        setOnClickListener(this);
    }

    private void a()
    {
        setSelected(a.isFavorite);
        Context context = getContext();
        int i;
        if (a.isFavorite)
        {
            i = r.label_remove_from_phrasebook;
        } else
        {
            i = r.label_add_to_phrasebook;
        }
        setContentDescription(context.getText(i));
    }

    private static boolean a(String s)
    {
        return !TextUtils.isEmpty(s) && s.length() < 300;
    }

    public void onClick(View view)
    {
        e e1;
        if (a.isFavorite)
        {
            a.isFavorite = false;
            b.b().b(getContext(), a);
        } else
        if (a(a.getInputText()) && a(a.getTranslation()))
        {
            a.isFavorite = true;
            b.b().a(getContext(), a);
        } else
        {
            m.a(r.msg_phrase_too_long, 1);
        }
        e1 = Singleton.b();
        if (a.isFavorite)
        {
            view = Event.STARS_TRANSLATION;
        } else
        {
            view = Event.UNSTARS_TRANSLATION;
        }
        e1.a(view, a.getFromLanguageShortName(), a.getToLanguageShortName());
        a();
    }

    public void setEntry(Entry entry)
    {
        a = entry;
        a();
    }
}

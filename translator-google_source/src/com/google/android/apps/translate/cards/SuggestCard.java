// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.cards;

import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.translate.e.k;
import com.google.android.apps.translate.m;
import com.google.android.apps.translate.o;
import com.google.android.apps.translate.r;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.e.h;
import com.google.android.libraries.translate.languages.Language;
import com.google.android.libraries.translate.languages.d;
import com.google.android.libraries.translate.logging.Event;
import com.google.android.libraries.translate.logging.e;

// Referenced classes of package com.google.android.apps.translate.cards:
//            AbstractCard, b

public class SuggestCard extends AbstractCard
    implements android.view.View.OnClickListener
{

    private final Bundle a;
    private final Event b;

    private SuggestCard(Context context, int i, String s, Bundle bundle, Event event)
    {
        super(context, o.card_suggestion);
        a(0x1020015, context.getText(i));
        a(0x1020014, s);
        a = bundle;
        b = event;
        findViewById(m.card_suggest).setOnClickListener(this);
    }

    public static SuggestCard a(Context context, b b1)
    {
        Object obj = b1.c;
        String s = ((com.google.android.libraries.translate.core.m) (obj)).a(4);
        if (!TextUtils.isEmpty(s))
        {
            obj = Html.fromHtml(s).toString().trim();
            Singleton.b().a(Event.SPELL_CORRECTION_SHOWN_ON_CHIP_VIEW, null, null);
            return new SuggestCard(context, r.label_did_you_mean, ((String) (obj)), k.a(((String) (obj)), b1.e, b1.f, null), Event.SPELL_CORRECTION_CLICKED_ON_CHIP_VIEW);
        }
        s = b1.e.getShortName();
        obj = ((com.google.android.libraries.translate.core.m) (obj)).a(s);
        if (!TextUtils.isEmpty(((CharSequence) (obj))) && !s.equals(obj))
        {
            Object obj1 = com.google.android.libraries.translate.languages.e.a(context);
            Language language1 = ((d) (obj1)).a(((String) (obj)));
            if (language1 != null)
            {
                Language language;
                if (language1.equals(b1.f))
                {
                    language = ((d) (obj1)).c(b1.e.getShortName());
                } else
                {
                    language = null;
                }
                obj1 = language;
                if (language == null)
                {
                    obj1 = b1.f;
                }
                b1 = k.a(b1.b, language1, ((Language) (obj1)), null);
                b1.putBoolean("update_lang", true);
                Singleton.b().a(Event.LANGID_SHOWN_ON_CHIP_VIEW, null, null);
                return new SuggestCard(context, r.label_translate_from, language1.getLongName(), b1, Event.LANGID_CLICKED_ON_CHIP_VIEW);
            }
        }
        return null;
    }

    public void onClick(View view)
    {
        Singleton.b().a(b, null, null);
        h.a(3, a);
    }
}

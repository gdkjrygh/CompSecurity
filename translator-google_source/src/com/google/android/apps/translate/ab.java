// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate;

import android.app.Activity;
import android.text.TextUtils;
import com.google.android.apps.translate.cards.b;
import com.google.android.apps.translate.widget.aq;
import com.google.android.apps.translate.widget.w;
import com.google.android.libraries.translate.c.c;
import com.google.android.libraries.translate.c.h;
import com.google.android.libraries.translate.core.Entry;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.core.TwsResponseException;
import com.google.android.libraries.translate.core.m;
import com.google.android.libraries.translate.core.n;
import com.google.android.libraries.translate.e.f;
import com.google.android.libraries.translate.e.k;
import com.google.android.libraries.translate.languages.Language;
import com.google.android.libraries.translate.languages.d;
import com.google.android.libraries.translate.languages.e;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.google.android.apps.translate:
//            z

class ab extends k
{

    private final b a;
    private final String b;
    final z c;
    private int d;

    ab(z z1, String s, String s1)
    {
        c = z1;
        super();
        d = -1;
        if (android/app/Activity.isAssignableFrom(z1.c.getClass()))
        {
            z1 = (Activity)z1.c;
        } else
        {
            z1 = null;
        }
        a = new b(z1);
        a.b = s;
        b = s1;
    }

    private transient m a(Language alanguage[])
    {
        a.e = alanguage[0];
        a.f = alanguage[1];
        a.c = a();
_L1:
        Object obj;
        a.a(c.c);
        android.content.Context context;
        Object obj1;
        String s;
        d d1;
        if (isCancelled())
        {
            return null;
        } else
        {
            a.g = com.google.android.apps.translate.e.d.a(a.f.getShortName());
            return a.c;
        }
        alanguage;
        d = alanguage.getErrorCode();
        obj = a.e;
        obj1 = a.f;
        s = a.b;
        context = c.c;
        d1 = e.a().a(context, Locale.getDefault());
        if (!f.a(((Language) (obj))))
        {
            break MISSING_BLOCK_LABEL_393;
        }
        alanguage = com.google.android.libraries.translate.c.b.b().b(context).a(1, s);
        if (alanguage.isEmpty())
        {
            alanguage = null;
        } else
        {
            alanguage = (Entry)alanguage.get(0);
        }
        if (alanguage != null && alanguage.getInputText().equals(s) && alanguage.getToLanguageShortName().equals(obj1))
        {
            alanguage = d1.a(alanguage.getFromLanguageShortName());
        } else
        {
            alanguage = (new c()).b(context).a(1, s);
            if (alanguage.isEmpty())
            {
                alanguage = null;
            } else
            {
                alanguage = (Entry)alanguage.get(0);
            }
            if (alanguage == null || !alanguage.getInputText().equals(s) || !alanguage.getToLanguageShortName().equals(obj1))
            {
                break MISSING_BLOCK_LABEL_393;
            }
            alanguage = d1.a(alanguage.getFromLanguageShortName());
        }
_L2:
        if (!f.a(alanguage))
        {
            obj1 = new Entry(alanguage, ((Language) (obj1)), s, "");
            obj = (new c()).b(context).a(((Entry) (obj1)));
            alanguage = ((Language []) (obj));
            if (obj == null)
            {
                alanguage = com.google.android.libraries.translate.c.b.b().b(context).a(((Entry) (obj1)));
            }
        } else
        {
            alanguage = null;
        }
        if (alanguage != null)
        {
            a.c = new m(alanguage);
        } else
        {
            return null;
        }
          goto _L1
        alanguage = ((Language []) (obj));
          goto _L2
    }

    protected m a()
    {
        m m1 = ((n)Singleton.d.b()).a(a.b, a.e, a.f, b, false);
        Object obj = m1.b;
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            obj = e.a().a(c.c, Locale.getDefault()).a(((String) (obj)));
            if (obj != null)
            {
                a.e = ((Language) (obj));
            }
        }
        (new c()).a(c.c, new Entry(a.e, a.f, a.b.trim(), m1.toString()));
        return m1;
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Language[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        obj = (m)obj;
        c.a.a(false);
        if (obj != null)
        {
            c.b.setResultInformation(a.e, a.c);
        }
        c.a.a(((m) (obj)), a, c.d, d);
        c.e = a;
    }
}

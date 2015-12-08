// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate;

import android.content.Context;
import android.os.Bundle;
import com.google.android.apps.translate.cards.b;
import com.google.android.apps.translate.widget.aq;
import com.google.android.apps.translate.widget.w;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.core.k;
import com.google.android.libraries.translate.core.m;
import com.google.android.libraries.translate.languages.Language;
import com.google.android.libraries.translate.tts.MyTts;

// Referenced classes of package com.google.android.apps.translate:
//            ab, aa

public final class z
{

    final aq a;
    final w b;
    final Context c;
    Bundle d;
    b e;
    private ab f;

    public z(Context context, w w1, aq aq1)
    {
        f = null;
        b = w1;
        a = aq1;
        c = context;
    }

    private static String a(Bundle bundle, Bundle bundle1, String s, String s1)
    {
        bundle = (Language)bundle.getSerializable(s);
        if (!bundle.equals(bundle1.getSerializable(s)))
        {
            bundle1 = String.valueOf(s1);
            bundle = String.valueOf(bundle.getShortName());
            if (bundle.length() != 0)
            {
                return bundle1.concat(bundle);
            } else
            {
                return new String(bundle1);
            }
        } else
        {
            return null;
        }
    }

    public final void a()
    {
        if (f != null)
        {
            f.cancel(true);
        }
    }

    public final void a(Bundle bundle)
    {
        ((MyTts)Singleton.b.b()).b();
        e = null;
        d = bundle;
        String s = bundle.getString("input");
        Language language = (Language)bundle.getSerializable("from");
        Language language1 = (Language)bundle.getSerializable("to");
        a.a(true);
        b.a();
        a();
        if (bundle.containsKey("output"))
        {
            f = new aa(this, s, new m(bundle.getString("output")));
        } else
        {
            bundle = String.valueOf(bundle.getString("log"));
            String s1 = String.valueOf("&otf=1");
            if (s1.length() != 0)
            {
                bundle = bundle.concat(s1);
            } else
            {
                bundle = new String(bundle);
            }
            f = new ab(this, s, bundle);
        }
        f.a(new Language[] {
            language, language1
        });
    }

    public final void b(Bundle bundle)
    {
        String s1;
label0:
        {
            if (d != null)
            {
                s1 = bundle.getString("log");
                String s = s1;
                if (s1 == null)
                {
                    s = a(d, bundle, "from", "psl=");
                }
                s1 = s;
                if (s == null)
                {
                    s1 = a(d, bundle, "to", "ptl=");
                }
                if (s1 != null)
                {
                    break label0;
                }
            }
            return;
        }
        d.putSerializable("from", bundle.getSerializable("from"));
        d.putSerializable("to", bundle.getSerializable("to"));
        d.remove("output");
        d.putString("log", s1);
        a(d);
    }
}

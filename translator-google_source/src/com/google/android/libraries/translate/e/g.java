// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.e;

import android.content.Context;
import com.google.android.libraries.translate.core.b;
import com.google.android.libraries.translate.languages.Language;
import com.google.android.libraries.translate.languages.d;
import com.google.android.libraries.translate.languages.e;
import com.google.android.libraries.translate.languages.f;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReferenceArray;

// Referenced classes of package com.google.android.libraries.translate.e:
//            f, h

final class g extends Thread
{

    final Context a;

    g(Context context)
    {
        a = context;
        super();
    }

    public final void run()
    {
        Context context;
        Locale locale;
        Object obj1;
        context = a;
        locale = Locale.getDefault();
        obj1 = f.c(locale);
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = new StringBuilder();
        Language language1;
        for (Iterator iterator = ((d) (obj1)).a.iterator(); iterator.hasNext(); ((StringBuilder) (obj)).append(f.a("sl", language1.getShortName(), language1.getLongName())).append("\t"))
        {
            language1 = (Language)iterator.next();
        }

        Language language;
        for (obj1 = ((d) (obj1)).b.iterator(); ((Iterator) (obj1)).hasNext(); ((StringBuilder) (obj)).append(f.a("tl", language.getShortName(), language.getLongName())).append("\t"))
        {
            language = (Language)((Iterator) (obj1)).next();
        }

        obj = ((StringBuilder) (obj)).toString();
        if (((String) (obj)).equals(b.a(context, locale))) goto _L2; else goto _L3
_L3:
        boolean flag;
        b.a(context, ((String) (obj)), locale);
        flag = true;
_L5:
        if (flag)
        {
            e e1 = e.a();
            d d1 = f.a(a);
            e1.a.set(0, new f(d1, Locale.getDefault()));
            e1.b();
            h.a(16);
        }
        return;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
    }
}

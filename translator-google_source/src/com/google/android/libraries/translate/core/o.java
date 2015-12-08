// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.core;

import com.google.android.libraries.translate.e.k;
import com.google.android.libraries.translate.languages.Language;

// Referenced classes of package com.google.android.libraries.translate.core:
//            l, n

final class o extends k
{

    final String a;
    final Language b;
    final Language c;
    final String d;
    final n e;

    o(n n, String s, Language language, Language language1, String s1)
    {
        e = n;
        a = s;
        b = language;
        c = language1;
        d = s1;
        super();
    }

    private transient Void a()
    {
        try
        {
            l.a(a, b.getShortName(), c.getShortName(), d);
        }
        catch (Exception exception) { }
        return null;
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a();
    }
}

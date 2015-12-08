// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.sync;

import android.content.Context;
import com.google.android.libraries.translate.core.Entry;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.logging.LogParams;
import com.google.android.libraries.translate.logging.e;

// Referenced classes of package com.google.android.libraries.translate.sync:
//            i, b

final class c extends i
{

    final String a;
    final Entry b;
    final b c;

    c(b b1, Context context, String s, Entry entry)
    {
        c = b1;
        a = s;
        b = entry;
        super(context, null);
    }

    protected final Object a(int j)
    {
        if (j == 413)
        {
            Singleton.b().a(-605, (new LogParams()).addParam("slen", Integer.valueOf(a.length())).addParam("tlen", Integer.valueOf(b.getTranslation().length())), b.getFromLanguageShortName(), b.getToLanguageShortName());
            return "_phrase_too_long_";
        } else
        {
            return (String)super.a(j);
        }
    }

    final Object a(String s)
    {
        com.google.android.libraries.translate.sync.b.a(c, s);
        return com.google.android.libraries.translate.sync.b.a(s);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.e;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.translate.c.a;
import com.google.android.libraries.translate.languages.Language;
import com.google.android.libraries.translate.languages.d;
import com.google.android.libraries.translate.languages.e;

public final class k
{

    public static Bundle a(Context context, CharSequence charsequence, String s, String s1)
    {
        context = e.a(context);
        s = context.b(s);
        context = context.c(s1);
        return a(charsequence.toString(), ((Language) (s)), ((Language) (context)), null);
    }

    public static Bundle a(Intent intent, int i)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("intent", intent);
        bundle.putInt("request", i);
        return bundle;
    }

    public static Bundle a(String s, Language language, Language language1, String s1)
    {
        Bundle bundle = new Bundle();
        bundle.putString("input", s);
        bundle.putSerializable("from", language);
        bundle.putSerializable("to", language1);
        bundle.putString("log", s1);
        return bundle;
    }

    public static a a(Intent intent, Context context)
    {
        intent = intent.getData();
        if (intent == null)
        {
            return null;
        } else
        {
            return a(((Uri) (intent)), e.a(context));
        }
    }

    public static a a(Uri uri, d d1)
    {
        Object obj = uri.getQueryParameter("source");
        uri = uri.getQueryParameter("target");
        if (obj != null && uri != null)
        {
            obj = d1.a(((String) (obj)));
            uri = d1.c(uri);
            if (obj != null && uri != null)
            {
                return new a(((Language) (obj)), uri);
            }
        }
        return null;
    }
}

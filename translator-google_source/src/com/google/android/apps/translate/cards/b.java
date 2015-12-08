// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.cards;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.util.SparseArray;
import com.google.android.libraries.translate.c.h;
import com.google.android.libraries.translate.core.Entry;
import com.google.android.libraries.translate.core.m;
import com.google.android.libraries.translate.languages.Language;

public final class b
{

    public final Activity a;
    public String b;
    public m c;
    public Entry d;
    public Language e;
    public Language f;
    public Typeface g;
    public final SparseArray h = new SparseArray();

    public b(Activity activity)
    {
        a = activity;
    }

    public final void a(Context context)
    {
        d = new Entry(e, f, b, c.toString());
        d.isFavorite = com.google.android.libraries.translate.c.b.b().b(context).d(d);
    }
}

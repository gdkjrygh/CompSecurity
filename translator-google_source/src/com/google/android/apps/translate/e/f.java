// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.e;

import android.graphics.Typeface;
import com.google.android.libraries.a.a;
import com.google.android.libraries.wordlens.util.AndroidFontRenderer;

final class f
    implements a
{

    f()
    {
    }

    public final void setTypeface(Typeface typeface)
    {
        AndroidFontRenderer.setCurrentTypeface(typeface);
    }
}

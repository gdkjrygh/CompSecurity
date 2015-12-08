// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate;

import android.util.SparseArray;
import com.google.android.apps.translate.cards.AbstractCard;
import com.google.android.apps.translate.cards.TranslatedTextCard;
import com.google.android.apps.translate.cards.a;
import com.google.android.apps.translate.cards.b;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.logging.Event;
import com.google.android.libraries.translate.logging.e;

final class v
    implements a
{

    v()
    {
    }

    public final void a(String s, b b1)
    {
        ((TranslatedTextCard)(AbstractCard)b1.h.get(1)).a(s, "source=dict");
        Singleton.b().a(Event.RESULT_DICTIONARY_ENTRY_LOADED, null, null);
    }
}

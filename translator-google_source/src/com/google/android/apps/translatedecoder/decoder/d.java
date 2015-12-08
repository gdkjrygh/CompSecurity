// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translatedecoder.decoder;

import com.google.android.apps.translatedecoder.pt.PhraseTable;
import com.google.android.apps.translatedecoder.rapidresp.a;
import com.google.android.apps.translatedecoder.util.SymbolTable;
import com.google.android.apps.translatedecoder.util.b;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public final class d
{

    private static final Logger f = Logger.getLogger("translate");
    int a;
    final PhraseTable b;
    final a c;
    boolean d;
    final Map e = new HashMap();
    private final SymbolTable g;

    public d(b b1, PhraseTable phrasetable, SymbolTable symboltable, a a1)
    {
        d = false;
        a = b1.D;
        b = phrasetable;
        g = symboltable;
        c = a1;
    }

    static boolean a(int ai[], int ai1[], int i, int j)
    {
        for (; i <= j; i++)
        {
            if (ai[i] != ai1[i])
            {
                return false;
            }
        }

        return true;
    }

}

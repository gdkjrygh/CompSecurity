// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translatedecoder.decoder;

import com.google.android.apps.translatedecoder.lm.a;
import com.google.android.apps.translatedecoder.pt.PhraseTable;
import com.google.android.apps.translatedecoder.util.SymbolTable;
import com.google.android.apps.translatedecoder.util.b;
import java.util.logging.Logger;

// Referenced classes of package com.google.android.apps.translatedecoder.decoder:
//            d, r, f

public final class v
{

    private static final Logger k = Logger.getLogger("translate");
    final PhraseTable a;
    int b[];
    int c[];
    final d d;
    final r e;
    final f f;
    final int g;
    final int h;
    final a i;
    final b j;
    private final com.google.android.apps.translatedecoder.rapidresp.a l;
    private final SymbolTable m;

    public v(PhraseTable phrasetable, com.google.android.apps.translatedecoder.rapidresp.a a1, a a2, b b1, SymbolTable symboltable, int ai[], int ai1[])
    {
        a = phrasetable;
        l = a1;
        i = a2;
        b = ai;
        c = ai1;
        j = b1;
        m = symboltable;
        h = symboltable.addWord("<S>");
        g = symboltable.addWord("</S>");
        d = new d(b1, phrasetable, symboltable, a1);
        e = new r(b1);
        f = new f(a2, e, b1, symboltable);
    }

}

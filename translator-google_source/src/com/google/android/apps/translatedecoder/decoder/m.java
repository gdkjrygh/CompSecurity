// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translatedecoder.decoder;

import com.google.android.apps.translatedecoder.util.SymbolTable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

// Referenced classes of package com.google.android.apps.translatedecoder.decoder:
//            p, n, w

public final class m
{

    private static final Logger b = Logger.getLogger("translate");
    final p a;

    public m(p p1)
    {
        a = p1;
    }

    static void a(p p1, boolean flag, SymbolTable symboltable, StringBuilder stringbuilder)
    {
        ArrayList arraylist = new ArrayList();
        for (; p1.a != null; p1 = p1.a.a)
        {
            arraylist.add(p1);
        }

        for (int i = arraylist.size() - 1; i >= 0; i--)
        {
            if (flag)
            {
                stringbuilder.append("[ ");
            }
            stringbuilder.append(symboltable.getWords(((p)arraylist.get(i)).a.c.tgtWords()));
            stringbuilder.append(" ");
            if (flag)
            {
                stringbuilder.append("] ");
            }
        }

    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translatedecoder.b;

import com.google.android.apps.translatedecoder.pt.PhrasePair;
import com.google.android.apps.translatedecoder.pt.PhraseTable;
import com.google.android.apps.translatedecoder.util.DecoderRuntimeException;
import com.google.android.apps.translatedecoder.util.SymbolTable;
import java.util.List;

// Referenced classes of package com.google.android.apps.translatedecoder.b:
//            a

public final class c
    implements a
{

    private final PhraseTable a;
    private final SymbolTable b;

    public c(String s, String s1)
    {
        if (s1 == null || s1.isEmpty())
        {
            throw new DecoderRuntimeException("Fqtv2InitSFileNull");
        }
        try
        {
            b = SymbolTable.readFromFile(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new DecoderRuntimeException("Fqtv2InitSFileReadFailed", s, s1);
        }
        if (s == null || s.isEmpty())
        {
            throw new DecoderRuntimeException("Fqtv2InitTFileNull");
        }
        try
        {
            a = PhraseTable.readFromFile(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw new DecoderRuntimeException("Fqtv2InitTFileReadFailed", s1, s);
        }
    }

    public final String a(String s)
    {
        s = b.addWords(s);
        s = a.getPhrases(s);
        if (s != null && s.size() > 0)
        {
            return b.getWords(((PhrasePair)s.get(0)).tgtWords());
        } else
        {
            return null;
        }
    }
}

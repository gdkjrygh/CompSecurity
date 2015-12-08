// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.eyesfree.braille.translate;

import android.os.RemoteException;
import android.util.Log;

// Referenced classes of package com.googlecode.eyesfree.braille.translate:
//            BrailleTranslator, TranslatorManager, ITranslatorService

private class mTable
    implements BrailleTranslator
{

    private final String mTable;
    final TranslatorManager this$0;

    public String backTranslate(byte abyte0[])
    {
        ITranslatorService itranslatorservice;
        itranslatorservice = TranslatorManager.access$800(TranslatorManager.this);
        if (itranslatorservice == null)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        abyte0 = itranslatorservice.backTranslate(abyte0, mTable);
        return abyte0;
        abyte0;
        Log.e(TranslatorManager.access$400(), "Error in backTranslate", abyte0);
        return null;
    }

    public byte[] translate(String s)
    {
        ITranslatorService itranslatorservice;
        itranslatorservice = TranslatorManager.access$800(TranslatorManager.this);
        if (itranslatorservice == null)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        s = itranslatorservice.translate(s, mTable);
        return s;
        s;
        Log.e(TranslatorManager.access$400(), "Error in translate", s);
        return null;
    }

    public (String s)
    {
        this$0 = TranslatorManager.this;
        super();
        mTable = s;
    }
}

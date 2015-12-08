// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.text.translate;

import java.io.IOException;
import java.io.Writer;

// Referenced classes of package org.apache.commons.lang3.text.translate:
//            CharSequenceTranslator

public abstract class CodePointTranslator extends CharSequenceTranslator
{

    public CodePointTranslator()
    {
    }

    public final int translate(CharSequence charsequence, int i, Writer writer)
        throws IOException
    {
        return !translate(Character.codePointAt(charsequence, i), writer) ? 0 : 1;
    }

    public abstract boolean translate(int i, Writer writer)
        throws IOException;
}

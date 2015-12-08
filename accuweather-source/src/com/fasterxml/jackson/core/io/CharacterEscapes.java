// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.SerializableString;
import java.io.Serializable;

// Referenced classes of package com.fasterxml.jackson.core.io:
//            CharTypes

public abstract class CharacterEscapes
    implements Serializable
{

    public static final int ESCAPE_CUSTOM = -2;
    public static final int ESCAPE_NONE = 0;
    public static final int ESCAPE_STANDARD = -1;
    private static final long serialVersionUID = 1L;

    public CharacterEscapes()
    {
    }

    public static int[] standardAsciiEscapesForJSON()
    {
        int ai[] = CharTypes.get7BitOutputEscapes();
        int ai1[] = new int[ai.length];
        System.arraycopy(ai, 0, ai1, 0, ai.length);
        return ai1;
    }

    public abstract int[] getEscapeCodesForAscii();

    public abstract SerializableString getEscapeSequence(int i);
}

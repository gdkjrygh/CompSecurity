// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.codec.language.bm;


// Referenced classes of package org.apache.commons.codec.language.bm:
//            PhoneticEngine

static final class val.cache
    implements CharSequence
{

    final CharSequence val$cache[][];
    final CharSequence val$cached;

    public char charAt(int i)
    {
        return val$cached.charAt(i);
    }

    public int length()
    {
        return val$cached.length();
    }

    public CharSequence subSequence(int i, int j)
    {
        Object obj;
        if (i == j)
        {
            obj = "";
        } else
        {
            CharSequence charsequence1 = val$cache[i][j - 1];
            obj = charsequence1;
            if (charsequence1 == null)
            {
                CharSequence charsequence = val$cached.subSequence(i, j);
                val$cache[i][j - 1] = charsequence;
                return charsequence;
            }
        }
        return ((CharSequence) (obj));
    }

    (CharSequence charsequence, CharSequence acharsequence[][])
    {
        val$cached = charsequence;
        val$cache = acharsequence;
        super();
    }
}

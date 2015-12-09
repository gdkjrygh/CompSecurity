// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import com.google.common.base.CharMatcher;
import com.google.common.base.Preconditions;
import com.google.common.math.IntMath;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;

// Referenced classes of package com.google.common.io:
//            BaseEncoding

static final class validPadding extends CharMatcher
{

    final int bitsPerChar;
    final int bytesPerChunk;
    private final char chars[];
    final int charsPerChunk;
    private final byte decodabet[];
    final int mask;
    private final String name;
    private final boolean validPadding[];

    final int decode(char c)
        throws IOException
    {
        if (c > '\177' || decodabet[c] == -1)
        {
            throw new xception((new StringBuilder("Unrecognized character: ")).append(c).toString());
        } else
        {
            return decodabet[c];
        }
    }

    final char encode(int i)
    {
        return chars[i];
    }

    final boolean isValidPaddingStartPosition(int i)
    {
        return validPadding[i % charsPerChunk];
    }

    public final boolean matches(char c)
    {
        return CharMatcher.ASCII.matches(c) && decodabet[c] != -1;
    }

    public final String toString()
    {
        return name;
    }

    xception(String s, char ac[])
    {
        name = (String)Preconditions.checkNotNull(s);
        chars = (char[])Preconditions.checkNotNull(ac);
        int i;
        try
        {
            bitsPerChar = IntMath.log2(ac.length, RoundingMode.UNNECESSARY);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IllegalArgumentException((new StringBuilder("Illegal alphabet length ")).append(ac.length).toString(), s);
        }
        i = Math.min(8, Integer.lowestOneBit(bitsPerChar));
        charsPerChunk = 8 / i;
        bytesPerChunk = bitsPerChar / i;
        mask = ac.length - 1;
        s = new byte[128];
        Arrays.fill(s, (byte)-1);
        i = 0;
        while (i < ac.length) 
        {
            char c = ac[i];
            Preconditions.checkArgument(CharMatcher.ASCII.matches(c), "Non-ASCII character: %s", new Object[] {
                Character.valueOf(c)
            });
            boolean flag;
            if (s[c] == -1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "Duplicate character: %s", new Object[] {
                Character.valueOf(c)
            });
            s[c] = (byte)i;
            i++;
        }
        decodabet = s;
        s = new boolean[charsPerChunk];
        for (int j = 0; j < bytesPerChunk; j++)
        {
            s[IntMath.divide(j << 3, bitsPerChar, RoundingMode.CEILING)] = 1;
        }

        validPadding = s;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.text;

import java.nio.CharBuffer;

// Referenced classes of package android.support.v4.text:
//            TextDirectionHeuristicCompat, TextDirectionHeuristicsCompat

private static abstract class mAlgorithm
    implements TextDirectionHeuristicCompat
{

    private final isRtl mAlgorithm;

    private boolean doCheck(CharSequence charsequence, int i, int j)
    {
        switch (mAlgorithm.kRtl(charsequence, i, j))
        {
        default:
            return defaultIsRtl();

        case 0: // '\0'
            return true;

        case 1: // '\001'
            return false;
        }
    }

    protected abstract boolean defaultIsRtl();

    public boolean isRtl(CharSequence charsequence, int i, int j)
    {
        if (charsequence == null || i < 0 || j < 0 || charsequence.length() - j < i)
        {
            throw new IllegalArgumentException();
        }
        if (mAlgorithm == null)
        {
            return defaultIsRtl();
        } else
        {
            return doCheck(charsequence, i, j);
        }
    }

    public boolean isRtl(char ac[], int i, int j)
    {
        return isRtl(((CharSequence) (CharBuffer.wrap(ac))), i, j);
    }

    public ( )
    {
        mAlgorithm = ;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.search;


// Referenced classes of package com.google.android.play.search:
//            LevenshteinDistance

public static final class mEnd
    implements CharSequence
{

    final char mContainer[];
    public final int mEnd;
    public final int mStart;

    private String subSequence$13d12155(int i)
    {
        return new String(mContainer, mStart + i, length());
    }

    public final char charAt(int i)
    {
        return mContainer[mStart + i];
    }

    public final int length()
    {
        return mEnd - mStart;
    }

    public final volatile CharSequence subSequence(int i, int j)
    {
        return subSequence$13d12155(i);
    }

    public final String toString()
    {
        length();
        return subSequence$13d12155(0);
    }

    public (char ac[], int i, int j)
    {
        mContainer = ac;
        mStart = i;
        mEnd = j;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.search;

import java.lang.reflect.Array;

public final class LevenshteinDistance
{
    public static final class EditOperation
    {

        final int mPosition;
        final int mType;

        public EditOperation(int i, int j)
        {
            mType = i;
            mPosition = j;
        }
    }

    public static final class Token
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

        public Token(char ac[], int i, int j)
        {
            mContainer = ac;
            mStart = i;
            mEnd = j;
        }
    }


    final int mDistanceTable[][];
    final int mEditTypeTable[][];
    final Token mSource[];
    final Token mTarget[];

    public LevenshteinDistance(Token atoken[], Token atoken1[])
    {
        int l = atoken.length;
        int k = atoken1.length;
        int ai[][] = (int[][])Array.newInstance(Integer.TYPE, new int[] {
            l + 1, k + 1
        });
        int ai1[][] = (int[][])Array.newInstance(Integer.TYPE, new int[] {
            l + 1, k + 1
        });
        ai[0][0] = 3;
        ai1[0][0] = 0;
        for (int i = 1; i <= l; i++)
        {
            ai[i][0] = 0;
            ai1[i][0] = i;
        }

        for (int j = 1; j <= k; j++)
        {
            ai[0][j] = 1;
            ai1[0][j] = j;
        }

        mEditTypeTable = ai;
        mDistanceTable = ai1;
        mSource = atoken;
        mTarget = atoken1;
    }
}

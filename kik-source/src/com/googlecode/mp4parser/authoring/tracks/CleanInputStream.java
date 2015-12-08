// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring.tracks;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class CleanInputStream extends FilterInputStream
{

    int prev;
    int prevprev;

    public CleanInputStream(InputStream inputstream)
    {
        super(inputstream);
        prevprev = -1;
        prev = -1;
    }

    public boolean markSupported()
    {
        return false;
    }

    public int read()
    {
        int j = super.read();
        int i = j;
        if (j == 3)
        {
            i = j;
            if (prevprev == 0)
            {
                i = j;
                if (prev == 0)
                {
                    prevprev = -1;
                    prev = -1;
                    i = super.read();
                }
            }
        }
        prevprev = prev;
        prev = i;
        return i;
    }

    public int read(byte abyte0[], int i, int j)
    {
        int k;
        k = -1;
        if (abyte0 == null)
        {
            throw new NullPointerException();
        }
        if (i < 0 || j < 0 || j > abyte0.length - i)
        {
            throw new IndexOutOfBoundsException();
        }
        if (j != 0) goto _L2; else goto _L1
_L1:
        k = 0;
_L4:
        return k;
_L2:
        int l = read();
        if (l == -1) goto _L4; else goto _L3
_L3:
        abyte0[i] = (byte)l;
        k = 1;
_L8:
        if (k < j) goto _L6; else goto _L5
_L5:
        return k;
_L6:
        l = read();
        if (l == -1) goto _L5; else goto _L7
_L7:
        abyte0[i + k] = (byte)l;
        k++;
          goto _L8
        abyte0;
          goto _L5
    }
}

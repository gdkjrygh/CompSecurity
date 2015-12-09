// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.ex.photo.util;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

// Referenced classes of package com.android.ex.photo.util:
//            Trace

public final class InputStreamBuffer
{

    private boolean mAutoAdvance;
    private byte mBuffer[];
    private int mFilled;
    private InputStream mInputStream;
    private int mOffset;

    public InputStreamBuffer(InputStream inputstream, int i, boolean flag)
    {
        mOffset = 0;
        mFilled = 0;
        mInputStream = inputstream;
        if (i <= 0)
        {
            throw new IllegalArgumentException(String.format("Buffer size %d must be positive.", new Object[] {
                Integer.valueOf(i)
            }));
        } else
        {
            mBuffer = new byte[leastPowerOf2(i)];
            mAutoAdvance = flag;
            return;
        }
    }

    private boolean fill(int i)
    {
        int k;
        Trace.beginSection("fill");
        if (i < mOffset)
        {
            Trace.endSection();
            throw new IllegalStateException(String.format("Index %d is before buffer %d", new Object[] {
                Integer.valueOf(i), Integer.valueOf(mOffset)
            }));
        }
        k = i - mOffset;
        if (mInputStream != null) goto _L2; else goto _L1
_L1:
        Trace.endSection();
_L4:
        return false;
_L2:
        int l = k + 1;
        int j = k;
        if (l > mBuffer.length)
        {
            if (mAutoAdvance)
            {
                advanceTo(i);
                j = i - mOffset;
            } else
            {
                i = leastPowerOf2(l);
                Log.w("InputStreamBuffer", String.format("Increasing buffer length from %d to %d. Bad buffer size chosen, or advanceTo() not called.", new Object[] {
                    Integer.valueOf(mBuffer.length), Integer.valueOf(i)
                }));
                mBuffer = Arrays.copyOf(mBuffer, i);
                j = k;
            }
        }
        i = -1;
        k = mInputStream.read(mBuffer, mFilled, mBuffer.length - mFilled);
        i = k;
_L5:
        if (i != -1)
        {
            mFilled = mFilled + i;
        } else
        {
            mInputStream = null;
        }
        if (Log.isLoggable("InputStreamBuffer", 3))
        {
            Log.d("InputStreamBuffer", String.format("fill %d      buffer: %s", new Object[] {
                Integer.valueOf(j), this
            }));
        }
        Trace.endSection();
        if (j < mFilled)
        {
            return true;
        }
        if (true) goto _L4; else goto _L3
_L3:
        IOException ioexception;
        ioexception;
          goto _L5
    }

    private static int leastPowerOf2(int i)
    {
        i--;
        i |= i >> 1;
        i |= i >> 2;
        i |= i >> 4;
        i |= i >> 8;
        return (i | i >> 16) + 1;
    }

    private void shiftToBeginning(int i)
    {
        if (i >= mBuffer.length)
        {
            throw new IndexOutOfBoundsException(String.format("Index %d out of bounds. Length %d", new Object[] {
                Integer.valueOf(i), Integer.valueOf(mBuffer.length)
            }));
        }
        for (int j = 0; j + i < mFilled; j++)
        {
            mBuffer[j] = mBuffer[j + i];
        }

    }

    public final void advanceTo(int i)
        throws IllegalStateException, IndexOutOfBoundsException
    {
        int j1;
        Trace.beginSection("advance to");
        j1 = i - mOffset;
        if (j1 <= 0)
        {
            Trace.endSection();
            return;
        }
        if (j1 >= mFilled) goto _L2; else goto _L1
_L1:
        shiftToBeginning(j1);
        mOffset = i;
        mFilled = mFilled - j1;
_L9:
        if (Log.isLoggable("InputStreamBuffer", 3))
        {
            Log.d("InputStreamBuffer", String.format("advanceTo %d buffer: %s", new Object[] {
                Integer.valueOf(j1), this
            }));
        }
        Trace.endSection();
        return;
_L2:
        if (mInputStream == null) goto _L4; else goto _L3
_L3:
        int j;
        int i1;
        boolean flag;
        j = j1 - mFilled;
        flag = false;
        i1 = 0;
_L6:
        int k;
        int l;
        k = j;
        l = ((flag) ? 1 : 0);
        if (j <= 0)
        {
            break MISSING_BLOCK_LABEL_168;
        }
        long l1 = mInputStream.skip(j);
        if (l1 <= 0L)
        {
            l = i1 + 1;
            k = j;
        } else
        {
            k = (int)((long)j - l1);
            l = i1;
        }
        j = k;
        i1 = l;
        if (l < 5) goto _L6; else goto _L5
_L5:
        l = 1;
_L7:
        if (l != 0)
        {
            mInputStream = null;
        }
        mOffset = i - k;
        mFilled = 0;
        continue; /* Loop/switch isn't completed */
        IOException ioexception;
        ioexception;
        l = 1;
        k = j;
        if (true) goto _L7; else goto _L4
_L4:
        mOffset = i;
        mFilled = 0;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public final byte get(int i)
        throws IllegalStateException, IndexOutOfBoundsException
    {
        Trace.beginSection("get");
        if (has(i))
        {
            int j = mOffset;
            Trace.endSection();
            return mBuffer[i - j];
        } else
        {
            Trace.endSection();
            throw new IndexOutOfBoundsException(String.format("Index %d beyond length.", new Object[] {
                Integer.valueOf(i)
            }));
        }
    }

    public final boolean has(int i)
        throws IllegalStateException, IndexOutOfBoundsException
    {
        Trace.beginSection("has");
        if (i < mOffset)
        {
            Trace.endSection();
            throw new IllegalStateException(String.format("Index %d is before buffer %d", new Object[] {
                Integer.valueOf(i), Integer.valueOf(mOffset)
            }));
        }
        int j = i - mOffset;
        if (j >= mFilled || j >= mBuffer.length)
        {
            Trace.endSection();
            return fill(i);
        } else
        {
            Trace.endSection();
            return true;
        }
    }

    public final String toString()
    {
        return String.format("+%d+%d [%d]", new Object[] {
            Integer.valueOf(mOffset), Integer.valueOf(mBuffer.length), Integer.valueOf(mFilled)
        });
    }
}

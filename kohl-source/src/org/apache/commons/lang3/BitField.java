// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3;


public class BitField
{

    private final int _mask;
    private final int _shift_count;

    public BitField(int i)
    {
        _mask = i;
        int k = 0;
        boolean flag = false;
        int j = i;
        if (j != 0)
        {
            i = ((flag) ? 1 : 0);
            do
            {
                k = i;
                if ((j & 1) != 0)
                {
                    break;
                }
                i++;
                j >>= 1;
            } while (true);
        }
        _shift_count = k;
    }

    public int clear(int i)
    {
        return ~_mask & i;
    }

    public byte clearByte(byte byte0)
    {
        return (byte)clear(byte0);
    }

    public short clearShort(short word0)
    {
        return (short)clear(word0);
    }

    public int getRawValue(int i)
    {
        return _mask & i;
    }

    public short getShortRawValue(short word0)
    {
        return (short)getRawValue(word0);
    }

    public short getShortValue(short word0)
    {
        return (short)getValue(word0);
    }

    public int getValue(int i)
    {
        return getRawValue(i) >> _shift_count;
    }

    public boolean isAllSet(int i)
    {
        return (_mask & i) == _mask;
    }

    public boolean isSet(int i)
    {
        return (_mask & i) != 0;
    }

    public int set(int i)
    {
        return _mask | i;
    }

    public int setBoolean(int i, boolean flag)
    {
        if (flag)
        {
            return set(i);
        } else
        {
            return clear(i);
        }
    }

    public byte setByte(byte byte0)
    {
        return (byte)set(byte0);
    }

    public byte setByteBoolean(byte byte0, boolean flag)
    {
        if (flag)
        {
            return setByte(byte0);
        } else
        {
            return clearByte(byte0);
        }
    }

    public short setShort(short word0)
    {
        return (short)set(word0);
    }

    public short setShortBoolean(short word0, boolean flag)
    {
        if (flag)
        {
            return setShort(word0);
        } else
        {
            return clearShort(word0);
        }
    }

    public short setShortValue(short word0, short word1)
    {
        return (short)setValue(word0, word1);
    }

    public int setValue(int i, int j)
    {
        return ~_mask & i | j << _shift_count & _mask;
    }
}

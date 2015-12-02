// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//            ChildHelper

static class mData
{

    static final int BITS_PER_WORD = 64;
    static final long LAST_BIT = 0x8000000000000000L;
    long mData;
    mData next;

    private void ensureNext()
    {
        if (next == null)
        {
            next = new <init>();
        }
    }

    void clear(int i)
    {
        if (i >= 64)
        {
            if (next != null)
            {
                next.clear(i - 64);
            }
            return;
        } else
        {
            mData = mData & ~(1L << i);
            return;
        }
    }

    int countOnesBefore(int i)
    {
        if (next == null)
        {
            if (i >= 64)
            {
                return Long.bitCount(mData);
            } else
            {
                return Long.bitCount(mData & (1L << i) - 1L);
            }
        }
        if (i < 64)
        {
            return Long.bitCount(mData & (1L << i) - 1L);
        } else
        {
            return next.countOnesBefore(i - 64) + Long.bitCount(mData);
        }
    }

    boolean get(int i)
    {
        if (i >= 64)
        {
            ensureNext();
            return next.get(i - 64);
        }
        return (mData & 1L << i) != 0L;
    }

    void insert(int i, boolean flag)
    {
        if (i >= 64)
        {
            ensureNext();
            next.insert(i - 64, flag);
        } else
        {
            long l;
            long l1;
            boolean flag1;
            if ((mData & 0x8000000000000000L) != 0L)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            l = (1L << i) - 1L;
            l1 = mData;
            mData = (~l & mData) << 1 | l1 & l;
            if (flag)
            {
                set(i);
            } else
            {
                clear(i);
            }
            if (flag1 || next != null)
            {
                ensureNext();
                next.insert(0, flag1);
                return;
            }
        }
    }

    boolean remove(int i)
    {
        boolean flag1;
        if (i >= 64)
        {
            ensureNext();
            flag1 = next.remove(i - 64);
        } else
        {
            long l = 1L << i;
            long l1;
            boolean flag;
            if ((mData & l) != 0L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            mData = mData & ~l;
            l--;
            l1 = mData;
            mData = Long.rotateRight(~l & mData, 1) | l1 & l;
            flag1 = flag;
            if (next != null)
            {
                if (next.get(0))
                {
                    set(63);
                }
                next.remove(0);
                return flag;
            }
        }
        return flag1;
    }

    void reset()
    {
        mData = 0L;
        if (next != null)
        {
            next.reset();
        }
    }

    void set(int i)
    {
        if (i >= 64)
        {
            ensureNext();
            next.set(i - 64);
            return;
        } else
        {
            mData = mData | 1L << i;
            return;
        }
    }

    public String toString()
    {
        if (next == null)
        {
            return Long.toBinaryString(mData);
        } else
        {
            return (new StringBuilder()).append(next.toString()).append("xx").append(Long.toBinaryString(mData)).toString();
        }
    }

    ()
    {
        mData = 0L;
    }
}

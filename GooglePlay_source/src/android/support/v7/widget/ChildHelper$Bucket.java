// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//            ChildHelper

static final class mData
{

    long mData;
    mData next;

    private void clear(int i)
    {
label0:
        {
            mData mdata = this;
            for (; i >= 64; i -= 64)
            {
                if (mdata.next == null)
                {
                    break label0;
                }
                mdata = mdata.next;
            }

            mdata.mData = mdata.mData & ~(1L << i);
        }
    }

    private void ensureNext()
    {
        if (next == null)
        {
            next = new <init>();
        }
    }

    final int countOnesBefore(int i)
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

    final boolean get(int i)
    {
        mData mdata = this;
        for (; i >= 64; i -= 64)
        {
            mdata.ensureNext();
            mdata = mdata.next;
        }

        return (mdata.mData & 1L << i) != 0L;
    }

    final void insert(int i, boolean flag)
    {
        boolean flag1 = flag;
        mData mdata = this;
        do
        {
            for (; i >= 64; i -= 64)
            {
                mdata.ensureNext();
                mdata = mdata.next;
            }

            long l;
            if ((mdata.mData & 0x8000000000000000L) != 0L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            l = (1L << i) - 1L;
            mdata.mData = mdata.mData & l | (mdata.mData & (-1L ^ l)) << 1;
            if (flag1)
            {
                mdata.set(i);
            } else
            {
                mdata.clear(i);
            }
            if (flag || mdata.next != null)
            {
                mdata.ensureNext();
                mdata = mdata.next;
                i = 0;
                flag1 = flag;
            } else
            {
                return;
            }
        } while (true);
    }

    final boolean remove(int i)
    {
        next next1 = this;
        for (; i >= 64; i -= 64)
        {
            next1.ensureNext();
            next1 = next1.next;
        }

        long l = 1L << i;
        boolean flag;
        if ((next1.mData & l) != 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        next1.mData = next1.mData & (-1L ^ l);
        l--;
        next1.mData = next1.mData & l | Long.rotateRight(next1.mData & (-1L ^ l), 1);
        if (next1.next != null)
        {
            if (next1.next.get(0))
            {
                next1.set(63);
            }
            next1.next.remove(0);
        }
        return flag;
    }

    final void set(int i)
    {
        remove remove1 = this;
        for (; i >= 64; i -= 64)
        {
            remove1.ensureNext();
            remove1 = remove1.next;
        }

        remove1.mData = remove1.mData | 1L << i;
    }

    public final String toString()
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

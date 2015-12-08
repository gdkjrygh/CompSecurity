// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package brut.androlib.res.decoder;


// Referenced classes of package brut.androlib.res.decoder:
//            AXmlResourceParser

private static final class m_data
{

    private int m_count;
    private int m_data[];
    private int m_dataLength;
    private int m_depth;

    private void ensureDataCapacity(int i)
    {
        int j = m_data.length - m_dataLength;
        if (j > i)
        {
            return;
        } else
        {
            int ai[] = new int[(j + m_data.length) * 2];
            System.arraycopy(m_data, 0, ai, 0, m_dataLength);
            m_data = ai;
            return;
        }
    }

    private final int find(int i, boolean flag)
    {
        if (m_dataLength != 0)
        {
            int j = m_dataLength - 1;
            int k = m_depth;
            while (k != 0) 
            {
                int l = m_data[j];
                j -= 2;
                for (; l != 0; l--)
                {
                    if (flag)
                    {
                        if (m_data[j] == i)
                        {
                            return m_data[j + 1];
                        }
                    } else
                    if (m_data[j + 1] == i)
                    {
                        return m_data[j];
                    }
                    j -= 2;
                }

                k--;
            }
        }
        return -1;
    }

    private final int get(int i, boolean flag)
    {
        if (m_dataLength != 0 && i >= 0)
        {
            int j = 0;
            int l = m_depth;
            int k = i;
            i = l;
            while (i != 0) 
            {
                int i1 = m_data[j];
                if (k >= i1)
                {
                    k -= i1;
                    j += i1 * 2 + 2;
                    i--;
                } else
                {
                    j = k * 2 + 1 + j;
                    i = j;
                    if (!flag)
                    {
                        i = j + 1;
                    }
                    return m_data[i];
                }
            }
        }
        return -1;
    }

    public final void decreaseDepth()
    {
        if (m_dataLength != 0)
        {
            int i = m_dataLength - 1;
            int j = m_data[i];
            if (i - 1 - j * 2 != 0)
            {
                m_dataLength = m_dataLength - (j * 2 + 2);
                m_count = m_count - j;
                m_depth = m_depth - 1;
                return;
            }
        }
    }

    public final int findPrefix(int i)
    {
        return find(i, false);
    }

    public final int getAccumulatedCount(int i)
    {
        int j;
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = false;
        j = ((flag) ? 1 : 0);
        if (m_dataLength == 0) goto _L2; else goto _L1
_L1:
        if (i >= 0) goto _L4; else goto _L3
_L3:
        j = ((flag) ? 1 : 0);
_L2:
        return j;
_L4:
        j = i;
        if (i > m_depth)
        {
            j = m_depth;
        }
        int k = 0;
        int l = j;
        i = ((flag1) ? 1 : 0);
        do
        {
            j = i;
            if (l == 0)
            {
                continue;
            }
            j = m_data[k];
            l--;
            k = j * 2 + 2 + k;
            i += j;
        } while (true);
        if (true) goto _L2; else goto _L5
_L5:
    }

    public final int getCurrentCount()
    {
        if (m_dataLength == 0)
        {
            return 0;
        } else
        {
            int i = m_dataLength;
            return m_data[i - 1];
        }
    }

    public final int getDepth()
    {
        return m_depth;
    }

    public final int getPrefix(int i)
    {
        return get(i, true);
    }

    public final int getUri(int i)
    {
        return get(i, false);
    }

    public final void increaseDepth()
    {
        ensureDataCapacity(2);
        int i = m_dataLength;
        m_data[i] = 0;
        m_data[i + 1] = 0;
        m_dataLength = m_dataLength + 2;
        m_depth = m_depth + 1;
    }

    public final boolean pop()
    {
        if (m_dataLength != 0)
        {
            int i = m_dataLength - 1;
            int j = m_data[i];
            if (j != 0)
            {
                j--;
                i -= 2;
                m_data[i] = j;
                m_data[i - (j * 2 + 1)] = j;
                m_dataLength = m_dataLength - 2;
                m_count = m_count - 1;
                return true;
            }
        }
        return false;
    }

    public final void push(int i, int j)
    {
        if (m_depth == 0)
        {
            increaseDepth();
        }
        ensureDataCapacity(2);
        int k = m_dataLength - 1;
        int l = m_data[k];
        m_data[k - 1 - l * 2] = l + 1;
        m_data[k] = i;
        m_data[k + 1] = j;
        m_data[k + 2] = l + 1;
        m_dataLength = m_dataLength + 2;
        m_count = m_count + 1;
    }

    public final void reset()
    {
        m_dataLength = 0;
        m_count = 0;
        m_depth = 0;
    }

    public A()
    {
        m_data = new int[32];
    }
}

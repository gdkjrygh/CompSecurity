// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.builder;


public class EqualsBuilder
{

    private static final ThreadLocal REGISTRY = new ThreadLocal();
    private boolean isEquals;

    public EqualsBuilder()
    {
        isEquals = true;
    }

    public EqualsBuilder append(byte byte0, byte byte1)
    {
        if (!isEquals)
        {
            return this;
        }
        boolean flag;
        if (byte0 == byte1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        isEquals = flag;
        return this;
    }

    public EqualsBuilder append(char c, char c1)
    {
        if (!isEquals)
        {
            return this;
        }
        boolean flag;
        if (c == c1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        isEquals = flag;
        return this;
    }

    public EqualsBuilder append(double d, double d1)
    {
        if (!isEquals)
        {
            return this;
        } else
        {
            return append(Double.doubleToLongBits(d), Double.doubleToLongBits(d1));
        }
    }

    public EqualsBuilder append(float f, float f1)
    {
        if (!isEquals)
        {
            return this;
        } else
        {
            return append(Float.floatToIntBits(f), Float.floatToIntBits(f1));
        }
    }

    public EqualsBuilder append(int i, int j)
    {
        if (!isEquals)
        {
            return this;
        }
        boolean flag;
        if (i == j)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        isEquals = flag;
        return this;
    }

    public EqualsBuilder append(long l, long l1)
    {
        if (!isEquals)
        {
            return this;
        }
        boolean flag;
        if (l == l1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        isEquals = flag;
        return this;
    }

    public EqualsBuilder append(Object obj, Object obj1)
    {
        while (!isEquals || obj == obj1) 
        {
            return this;
        }
        if (obj == null || obj1 == null)
        {
            setEquals(false);
            return this;
        }
        if (!obj.getClass().isArray())
        {
            isEquals = obj.equals(obj1);
            return this;
        }
        if (obj.getClass() != obj1.getClass())
        {
            setEquals(false);
            return this;
        }
        if (obj instanceof long[])
        {
            append((long[])obj, (long[])obj1);
            return this;
        }
        if (obj instanceof int[])
        {
            append((int[])obj, (int[])obj1);
            return this;
        }
        if (obj instanceof short[])
        {
            append((short[])obj, (short[])obj1);
            return this;
        }
        if (obj instanceof char[])
        {
            append((char[])obj, (char[])obj1);
            return this;
        }
        if (obj instanceof byte[])
        {
            append((byte[])obj, (byte[])obj1);
            return this;
        }
        if (obj instanceof double[])
        {
            append((double[])obj, (double[])obj1);
            return this;
        }
        if (obj instanceof float[])
        {
            append((float[])obj, (float[])obj1);
            return this;
        }
        if (obj instanceof boolean[])
        {
            append((boolean[])obj, (boolean[])obj1);
            return this;
        } else
        {
            append((Object[])obj, (Object[])obj1);
            return this;
        }
    }

    public EqualsBuilder append(short word0, short word1)
    {
        if (!isEquals)
        {
            return this;
        }
        boolean flag;
        if (word0 == word1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        isEquals = flag;
        return this;
    }

    public EqualsBuilder append(boolean flag, boolean flag1)
    {
        if (!isEquals)
        {
            return this;
        }
        if (flag == flag1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        isEquals = flag;
        return this;
    }

    public EqualsBuilder append(byte abyte0[], byte abyte1[])
    {
        int i;
        i = 0;
        break MISSING_BLOCK_LABEL_2;
        if (isEquals && abyte0 != abyte1)
        {
            if (abyte0 == null || abyte1 == null)
            {
                setEquals(false);
                return this;
            }
            if (abyte0.length != abyte1.length)
            {
                setEquals(false);
                return this;
            }
            while (i < abyte0.length && isEquals) 
            {
                append(abyte0[i], abyte1[i]);
                i++;
            }
        }
        return this;
    }

    public EqualsBuilder append(char ac[], char ac1[])
    {
        int i;
        i = 0;
        break MISSING_BLOCK_LABEL_2;
        if (isEquals && ac != ac1)
        {
            if (ac == null || ac1 == null)
            {
                setEquals(false);
                return this;
            }
            if (ac.length != ac1.length)
            {
                setEquals(false);
                return this;
            }
            while (i < ac.length && isEquals) 
            {
                append(ac[i], ac1[i]);
                i++;
            }
        }
        return this;
    }

    public EqualsBuilder append(double ad[], double ad1[])
    {
        int i;
        i = 0;
        break MISSING_BLOCK_LABEL_2;
        if (isEquals && ad != ad1)
        {
            if (ad == null || ad1 == null)
            {
                setEquals(false);
                return this;
            }
            if (ad.length != ad1.length)
            {
                setEquals(false);
                return this;
            }
            while (i < ad.length && isEquals) 
            {
                append(ad[i], ad1[i]);
                i++;
            }
        }
        return this;
    }

    public EqualsBuilder append(float af[], float af1[])
    {
        int i;
        i = 0;
        break MISSING_BLOCK_LABEL_2;
        if (isEquals && af != af1)
        {
            if (af == null || af1 == null)
            {
                setEquals(false);
                return this;
            }
            if (af.length != af1.length)
            {
                setEquals(false);
                return this;
            }
            while (i < af.length && isEquals) 
            {
                append(af[i], af1[i]);
                i++;
            }
        }
        return this;
    }

    public EqualsBuilder append(int ai[], int ai1[])
    {
        int i;
        i = 0;
        break MISSING_BLOCK_LABEL_2;
        if (isEquals && ai != ai1)
        {
            if (ai == null || ai1 == null)
            {
                setEquals(false);
                return this;
            }
            if (ai.length != ai1.length)
            {
                setEquals(false);
                return this;
            }
            while (i < ai.length && isEquals) 
            {
                append(ai[i], ai1[i]);
                i++;
            }
        }
        return this;
    }

    public EqualsBuilder append(long al[], long al1[])
    {
        int i;
        i = 0;
        break MISSING_BLOCK_LABEL_2;
        if (isEquals && al != al1)
        {
            if (al == null || al1 == null)
            {
                setEquals(false);
                return this;
            }
            if (al.length != al1.length)
            {
                setEquals(false);
                return this;
            }
            while (i < al.length && isEquals) 
            {
                append(al[i], al1[i]);
                i++;
            }
        }
        return this;
    }

    public EqualsBuilder append(Object aobj[], Object aobj1[])
    {
        int i;
        i = 0;
        break MISSING_BLOCK_LABEL_2;
        if (isEquals && aobj != aobj1)
        {
            if (aobj == null || aobj1 == null)
            {
                setEquals(false);
                return this;
            }
            if (aobj.length != aobj1.length)
            {
                setEquals(false);
                return this;
            }
            while (i < aobj.length && isEquals) 
            {
                append(aobj[i], aobj1[i]);
                i++;
            }
        }
        return this;
    }

    public EqualsBuilder append(short aword0[], short aword1[])
    {
        int i;
        i = 0;
        break MISSING_BLOCK_LABEL_2;
        if (isEquals && aword0 != aword1)
        {
            if (aword0 == null || aword1 == null)
            {
                setEquals(false);
                return this;
            }
            if (aword0.length != aword1.length)
            {
                setEquals(false);
                return this;
            }
            while (i < aword0.length && isEquals) 
            {
                append(aword0[i], aword1[i]);
                i++;
            }
        }
        return this;
    }

    public EqualsBuilder append(boolean aflag[], boolean aflag1[])
    {
        int i;
        i = 0;
        break MISSING_BLOCK_LABEL_2;
        if (isEquals && aflag != aflag1)
        {
            if (aflag == null || aflag1 == null)
            {
                setEquals(false);
                return this;
            }
            if (aflag.length != aflag1.length)
            {
                setEquals(false);
                return this;
            }
            while (i < aflag.length && isEquals) 
            {
                append(aflag[i], aflag1[i]);
                i++;
            }
        }
        return this;
    }

    public boolean isEquals()
    {
        return isEquals;
    }

    protected void setEquals(boolean flag)
    {
        isEquals = flag;
    }

}

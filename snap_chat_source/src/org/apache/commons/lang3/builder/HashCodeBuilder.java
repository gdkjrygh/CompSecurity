// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.builder;


public class HashCodeBuilder
{

    private static final ThreadLocal REGISTRY = new ThreadLocal();
    private final int iConstant = 37;
    private int iTotal;

    public HashCodeBuilder()
    {
        iTotal = 0;
        iTotal = 17;
    }

    public HashCodeBuilder append(byte byte0)
    {
        iTotal = iTotal * iConstant + byte0;
        return this;
    }

    public HashCodeBuilder append(char c)
    {
        iTotal = iTotal * iConstant + c;
        return this;
    }

    public HashCodeBuilder append(double d)
    {
        return append(Double.doubleToLongBits(d));
    }

    public HashCodeBuilder append(float f)
    {
        iTotal = iTotal * iConstant + Float.floatToIntBits(f);
        return this;
    }

    public HashCodeBuilder append(int i)
    {
        iTotal = iTotal * iConstant + i;
        return this;
    }

    public HashCodeBuilder append(long l)
    {
        iTotal = iTotal * iConstant + (int)(l >> 32 ^ l);
        return this;
    }

    public HashCodeBuilder append(Object obj)
    {
        if (obj == null)
        {
            iTotal = iTotal * iConstant;
            return this;
        }
        if (obj.getClass().isArray())
        {
            if (obj instanceof long[])
            {
                append((long[])obj);
                return this;
            }
            if (obj instanceof int[])
            {
                append((int[])obj);
                return this;
            }
            if (obj instanceof short[])
            {
                append((short[])obj);
                return this;
            }
            if (obj instanceof char[])
            {
                append((char[])obj);
                return this;
            }
            if (obj instanceof byte[])
            {
                append((byte[])obj);
                return this;
            }
            if (obj instanceof double[])
            {
                append((double[])obj);
                return this;
            }
            if (obj instanceof float[])
            {
                append((float[])obj);
                return this;
            }
            if (obj instanceof boolean[])
            {
                append((boolean[])obj);
                return this;
            } else
            {
                append((Object[])obj);
                return this;
            }
        } else
        {
            iTotal = iTotal * iConstant + obj.hashCode();
            return this;
        }
    }

    public HashCodeBuilder append(short word0)
    {
        iTotal = iTotal * iConstant + word0;
        return this;
    }

    public HashCodeBuilder append(boolean flag)
    {
        int j = iTotal;
        int k = iConstant;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 1;
        }
        iTotal = i + k * j;
        return this;
    }

    public HashCodeBuilder append(byte abyte0[])
    {
        if (abyte0 == null)
        {
            iTotal = iTotal * iConstant;
        } else
        {
            int j = abyte0.length;
            int i = 0;
            while (i < j) 
            {
                append(abyte0[i]);
                i++;
            }
        }
        return this;
    }

    public HashCodeBuilder append(char ac[])
    {
        if (ac == null)
        {
            iTotal = iTotal * iConstant;
        } else
        {
            int j = ac.length;
            int i = 0;
            while (i < j) 
            {
                append(ac[i]);
                i++;
            }
        }
        return this;
    }

    public HashCodeBuilder append(double ad[])
    {
        if (ad == null)
        {
            iTotal = iTotal * iConstant;
        } else
        {
            int j = ad.length;
            int i = 0;
            while (i < j) 
            {
                append(ad[i]);
                i++;
            }
        }
        return this;
    }

    public HashCodeBuilder append(float af[])
    {
        if (af == null)
        {
            iTotal = iTotal * iConstant;
        } else
        {
            int j = af.length;
            int i = 0;
            while (i < j) 
            {
                append(af[i]);
                i++;
            }
        }
        return this;
    }

    public HashCodeBuilder append(int ai[])
    {
        if (ai == null)
        {
            iTotal = iTotal * iConstant;
        } else
        {
            int j = ai.length;
            int i = 0;
            while (i < j) 
            {
                append(ai[i]);
                i++;
            }
        }
        return this;
    }

    public HashCodeBuilder append(long al[])
    {
        if (al == null)
        {
            iTotal = iTotal * iConstant;
        } else
        {
            int j = al.length;
            int i = 0;
            while (i < j) 
            {
                append(al[i]);
                i++;
            }
        }
        return this;
    }

    public HashCodeBuilder append(Object aobj[])
    {
        if (aobj == null)
        {
            iTotal = iTotal * iConstant;
        } else
        {
            int j = aobj.length;
            int i = 0;
            while (i < j) 
            {
                append(aobj[i]);
                i++;
            }
        }
        return this;
    }

    public HashCodeBuilder append(short aword0[])
    {
        if (aword0 == null)
        {
            iTotal = iTotal * iConstant;
        } else
        {
            int j = aword0.length;
            int i = 0;
            while (i < j) 
            {
                append(aword0[i]);
                i++;
            }
        }
        return this;
    }

    public HashCodeBuilder append(boolean aflag[])
    {
        if (aflag == null)
        {
            iTotal = iTotal * iConstant;
        } else
        {
            int j = aflag.length;
            int i = 0;
            while (i < j) 
            {
                append(aflag[i]);
                i++;
            }
        }
        return this;
    }

    public int hashCode()
    {
        return toHashCode();
    }

    public int toHashCode()
    {
        return iTotal;
    }

}

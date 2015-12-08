// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.basictlv;

import com.google.android.apps.wallet.hce.base.NonnullFunction;
import com.google.android.apps.wallet.hce.util.Hex;
import com.google.common.base.Function;
import com.google.common.primitives.Ints;
import java.util.Arrays;

// Referenced classes of package com.google.android.apps.wallet.hce.basictlv:
//            BasicTlvInvalidTagException, BasicTlvRuntimeException, BasicTlvInvalidLengthException

public abstract class BasicTlv
{

    public static final Function AS_TAG = new NonnullFunction() {

        private static Integer applyNonnull(BasicTlv basictlv)
        {
            return Integer.valueOf(basictlv.getTag());
        }

        public final volatile Object applyNonnull(Object obj)
        {
            return applyNonnull((BasicTlv)obj);
        }

    };
    private final int mTag;

    protected BasicTlv(int i)
        throws BasicTlvInvalidTagException
    {
        int j = getTagSize(i);
        if (j == 1)
        {
            if ((i & 0x1f) == 31)
            {
                throw new BasicTlvInvalidTagException(i);
            }
        } else
        if ((i >> (j - 1 << 3) & 0xff & 0x1f) != 31)
        {
            throw new BasicTlvInvalidTagException(i);
        }
        mTag = i;
    }

    private int getLengthSize()
    {
        int i = getLength();
        int j = getLengthSizeImpl(i);
        if (j != -1)
        {
            return j;
        }
        String s = String.valueOf(Integer.toHexString(i));
        if (s.length() != 0)
        {
            s = "Invalid length: ".concat(s);
        } else
        {
            s = new String("Invalid length: ");
        }
        throw new BasicTlvRuntimeException(s);
    }

    private static int getLengthSize(int i)
        throws BasicTlvInvalidLengthException
    {
        int j = getLengthSizeImpl(i);
        if (j != -1)
        {
            return j;
        } else
        {
            throw new BasicTlvInvalidLengthException(i);
        }
    }

    private static int getLengthSizeImpl(int i)
    {
        if (i >= 0)
        {
            if (i <= 127)
            {
                return 1;
            }
            if (i <= 255)
            {
                return 2;
            }
            if (i <= 65535)
            {
                return 3;
            }
        }
        return -1;
    }

    public static final String getTagAsString(int i)
    {
        int j = getTagSize(i);
        j = 4 - j;
_L2:
        return Hex.encode(Arrays.copyOfRange(Ints.toByteArray(i), j, 4)).toUpperCase();
        BasicTlvInvalidTagException basictlvinvalidtagexception;
        basictlvinvalidtagexception;
        j = 0;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private int getTagSize()
    {
        int i = getTagSizeImpl(mTag);
        if (i != -1)
        {
            return i;
        }
        String s = String.valueOf(getTagAsString());
        if (s.length() != 0)
        {
            s = "Invalid tag: ".concat(s);
        } else
        {
            s = new String("Invalid tag: ");
        }
        throw new BasicTlvRuntimeException(s);
    }

    private static int getTagSize(int i)
        throws BasicTlvInvalidTagException
    {
        int j = getTagSizeImpl(i);
        if (j != -1)
        {
            return j;
        } else
        {
            throw new BasicTlvInvalidTagException(i);
        }
    }

    private static int getTagSizeImpl(int i)
    {
        if ((i & 0xffffff00) == 0)
        {
            return 1;
        }
        if ((0xffff0000 & i) == 0)
        {
            return 2;
        }
        return (0xff000000 & i) != 0 ? -1 : 3;
    }

    static boolean tagIsConstructed(int i)
        throws BasicTlvInvalidTagException
    {
        getTagSize(i);
        JVM INSTR tableswitch 1 3: default 32
    //                   1 41
    //                   2 52
    //                   3 62;
           goto _L1 _L2 _L3 _L4
_L1:
        throw new BasicTlvInvalidTagException(i);
_L2:
        if ((i & 0x20) == 0) goto _L6; else goto _L5
_L5:
        return true;
_L6:
        return false;
_L3:
        if ((i & 0x2000) == 0)
        {
            return false;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if ((0x200000 & i) == 0)
        {
            return false;
        }
        if (true) goto _L5; else goto _L7
_L7:
    }

    protected final int encode(byte abyte0[], int i)
        throws BasicTlvInvalidTagException, BasicTlvInvalidLengthException
    {
        for (int j = getTagSize() - 1 << 3; j >= 0;)
        {
            abyte0[i] = (byte)(mTag >> j);
            j -= 8;
            i++;
        }

        int i1 = getLength();
        int k = getLengthSize(i1);
        if (k > 1)
        {
            k--;
            if (k >= 128)
            {
                throw new BasicTlvInvalidLengthException(i1);
            }
            int l = i + 1;
            abyte0[i] = (byte)(k | 0x80);
            i = l;
        }
        for (k = k - 1 << 3; k >= 0;)
        {
            abyte0[i] = (byte)(i1 >> k);
            k -= 8;
            i++;
        }

        return encodeValue(abyte0, i);
    }

    protected abstract int encodeValue(byte abyte0[], int i)
        throws BasicTlvInvalidTagException, BasicTlvInvalidLengthException;

    public abstract int getLength();

    public final int getSize()
    {
        return getTagSize() + getLengthSize() + getLength();
    }

    public final int getTag()
    {
        return mTag;
    }

    public final String getTagAsString()
    {
        return getTagAsString(mTag);
    }

    public final byte[] toByteArray()
        throws BasicTlvInvalidTagException, BasicTlvInvalidLengthException
    {
        int i = getSize();
        byte abyte0[] = new byte[i];
        int j = encode(abyte0, 0);
        if (i == j)
        {
            return abyte0;
        } else
        {
            throw new BasicTlvInvalidLengthException(i, j);
        }
    }

}

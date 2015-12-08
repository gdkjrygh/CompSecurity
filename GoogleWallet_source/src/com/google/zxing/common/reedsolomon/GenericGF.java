// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.common.reedsolomon;


// Referenced classes of package com.google.zxing.common.reedsolomon:
//            GenericGFPoly

public final class GenericGF
{

    public static final GenericGF AZTEC_DATA_10 = new GenericGF(1033, 1024, 1);
    public static final GenericGF AZTEC_DATA_12 = new GenericGF(4201, 4096, 1);
    public static final GenericGF AZTEC_DATA_6;
    public static final GenericGF AZTEC_DATA_8;
    public static final GenericGF AZTEC_PARAM = new GenericGF(19, 16, 1);
    public static final GenericGF DATA_MATRIX_FIELD_256;
    public static final GenericGF MAXICODE_FIELD_64;
    public static final GenericGF QR_CODE_FIELD_256 = new GenericGF(285, 256, 0);
    private int expTable[];
    private final int generatorBase;
    private boolean initialized;
    private int logTable[];
    private GenericGFPoly one;
    private final int primitive;
    private final int size;
    private GenericGFPoly zero;

    private GenericGF(int i, int j, int k)
    {
        initialized = false;
        primitive = i;
        size = j;
        generatorBase = k;
        if (j <= 0)
        {
            initialize();
        }
    }

    static int addOrSubtract(int i, int j)
    {
        return i ^ j;
    }

    private void checkInit()
    {
        if (!initialized)
        {
            initialize();
        }
    }

    private void initialize()
    {
        expTable = new int[size];
        logTable = new int[size];
        int i = 1;
        for (int k = 0; k < size; k++)
        {
            expTable[k] = i;
            int l = i << 1;
            i = l;
            if (l >= size)
            {
                i = (l ^ primitive) & size - 1;
            }
        }

        for (int j = 0; j < size - 1; j++)
        {
            logTable[expTable[j]] = j;
        }

        zero = new GenericGFPoly(this, new int[] {
            0
        });
        one = new GenericGFPoly(this, new int[] {
            1
        });
        initialized = true;
    }

    final GenericGFPoly buildMonomial(int i, int j)
    {
        checkInit();
        if (i < 0)
        {
            throw new IllegalArgumentException();
        }
        if (j == 0)
        {
            return zero;
        } else
        {
            int ai[] = new int[i + 1];
            ai[0] = j;
            return new GenericGFPoly(this, ai);
        }
    }

    final int exp(int i)
    {
        checkInit();
        return expTable[i];
    }

    public final int getGeneratorBase()
    {
        return generatorBase;
    }

    final GenericGFPoly getOne()
    {
        checkInit();
        return one;
    }

    public final int getSize()
    {
        return size;
    }

    final GenericGFPoly getZero()
    {
        checkInit();
        return zero;
    }

    final int inverse(int i)
    {
        checkInit();
        if (i == 0)
        {
            throw new ArithmeticException();
        } else
        {
            return expTable[size - logTable[i] - 1];
        }
    }

    final int log(int i)
    {
        checkInit();
        if (i == 0)
        {
            throw new IllegalArgumentException();
        } else
        {
            return logTable[i];
        }
    }

    final int multiply(int i, int j)
    {
        checkInit();
        if (i == 0 || j == 0)
        {
            return 0;
        } else
        {
            return expTable[(logTable[i] + logTable[j]) % (size - 1)];
        }
    }

    public final String toString()
    {
        return (new StringBuilder("GF(0x")).append(Integer.toHexString(primitive)).append(',').append(size).append(')').toString();
    }

    static 
    {
        AZTEC_DATA_6 = new GenericGF(67, 64, 1);
        GenericGF genericgf = new GenericGF(301, 256, 1);
        DATA_MATRIX_FIELD_256 = genericgf;
        AZTEC_DATA_8 = genericgf;
        MAXICODE_FIELD_64 = AZTEC_DATA_6;
    }
}

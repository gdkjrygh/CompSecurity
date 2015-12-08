// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.hash;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;

// Referenced classes of package com.google.common.hash:
//            BloomFilterStrategies, Funnel

public final class BloomFilter
    implements Predicate, Serializable
{

    private static final Strategy DEFAULT_STRATEGY;
    private final BloomFilterStrategies.BitArray bits;
    private final Funnel funnel;
    private final int numHashFunctions;
    private final Strategy strategy;

    private BloomFilter(BloomFilterStrategies.BitArray bitarray, int i, Funnel funnel1, Strategy strategy1)
    {
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "numHashFunctions (%s) must be > 0", new Object[] {
            Integer.valueOf(i)
        });
        if (i <= 255)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "numHashFunctions (%s) must be <= 255", new Object[] {
            Integer.valueOf(i)
        });
        bits = (BloomFilterStrategies.BitArray)Preconditions.checkNotNull(bitarray);
        numHashFunctions = i;
        funnel = (Funnel)Preconditions.checkNotNull(funnel1);
        strategy = (Strategy)Preconditions.checkNotNull(strategy1);
    }

    BloomFilter(BloomFilterStrategies.BitArray bitarray, int i, Funnel funnel1, Strategy strategy1, _cls1 _pcls1)
    {
        this(bitarray, i, funnel1, strategy1);
    }

    public static BloomFilter create(Funnel funnel1, int i)
    {
        return create(funnel1, i, 0.029999999999999999D);
    }

    public static BloomFilter create(Funnel funnel1, int i, double d)
    {
        return create(funnel1, i, d, DEFAULT_STRATEGY);
    }

    static BloomFilter create(Funnel funnel1, int i, double d, Strategy strategy1)
    {
        boolean flag = true;
        Preconditions.checkNotNull(funnel1);
        long l;
        boolean flag1;
        if (i >= 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        Preconditions.checkArgument(flag1, "Expected insertions (%s) must be >= 0", new Object[] {
            Integer.valueOf(i)
        });
        if (d > 0.0D)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        Preconditions.checkArgument(flag1, "False positive probability (%s) must be > 0.0", new Object[] {
            Double.valueOf(d)
        });
        if (d < 1.0D)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        Preconditions.checkArgument(flag1, "False positive probability (%s) must be < 1.0", new Object[] {
            Double.valueOf(d)
        });
        Preconditions.checkNotNull(strategy1);
        if (i == 0)
        {
            i = ((flag) ? 1 : 0);
        }
        l = optimalNumOfBits(i, d);
        i = optimalNumOfHashFunctions(i, l);
        try
        {
            funnel1 = new BloomFilter(new BloomFilterStrategies.BitArray(l), i, funnel1, strategy1);
        }
        // Misplaced declaration of an exception variable
        catch (Funnel funnel1)
        {
            throw new IllegalArgumentException((new StringBuilder(57)).append("Could not create BloomFilter of ").append(l).append(" bits").toString(), funnel1);
        }
        return funnel1;
    }

    static long optimalNumOfBits(long l, double d)
    {
        double d1 = d;
        if (d == 0.0D)
        {
            d1 = 4.9406564584124654E-324D;
        }
        return (long)(((double)(-l) * Math.log(d1)) / (Math.log(2D) * Math.log(2D)));
    }

    static int optimalNumOfHashFunctions(long l, long l1)
    {
        return Math.max(1, (int)Math.round(((double)l1 / (double)l) * Math.log(2D)));
    }

    public static BloomFilter readFrom(InputStream inputstream, Funnel funnel1)
    {
        int j;
        j = -1;
        Preconditions.checkNotNull(inputstream, "InputStream");
        Preconditions.checkNotNull(funnel1, "Funnel");
        byte byte0;
        inputstream = new DataInputStream(inputstream);
        byte0 = inputstream.readByte();
        int i;
        int k;
        BloomFilterStrategies bloomfilterstrategies;
        long al[];
        int l;
        try
        {
            k = UnsignedBytes.toInt(inputstream.readByte());
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            i = -1;
            continue; /* Loop/switch isn't completed */
        }
        i = j;
        l = inputstream.readInt();
        i = l;
        bloomfilterstrategies = BloomFilterStrategies.values()[byte0];
        i = l;
        al = new long[l];
        j = 0;
_L2:
        if (j >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        i = l;
        al[j] = inputstream.readLong();
        j++;
        if (true) goto _L2; else goto _L1
_L1:
        i = l;
        inputstream = new BloomFilter(new BloomFilterStrategies.BitArray(al), k, funnel1, bloomfilterstrategies);
        return inputstream;
        inputstream;
        i = -1;
        byte0 = -1;
_L4:
        funnel1 = String.valueOf(String.valueOf("Unable to deserialize BloomFilter from InputStream. strategyOrdinal: "));
        funnel1 = new IOException((new StringBuilder(funnel1.length() + 65)).append(funnel1).append(byte0).append(" numHashFunctions: ").append(i).append(" dataLength: ").append(j).toString());
        funnel1.initCause(inputstream);
        throw funnel1;
        inputstream;
        j = i;
        i = k;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private Object writeReplace()
    {
        return new SerialForm();
    }

    public final boolean apply(Object obj)
    {
        return mightContain(obj);
    }

    final long bitSize()
    {
        return bits.bitSize();
    }

    public final BloomFilter copy()
    {
        return new BloomFilter(bits.copy(), numHashFunctions, funnel, strategy);
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj instanceof BloomFilter)
            {
                if (numHashFunctions != ((BloomFilter) (obj = (BloomFilter)obj)).numHashFunctions || !funnel.equals(((BloomFilter) (obj)).funnel) || !bits.equals(((BloomFilter) (obj)).bits) || !strategy.equals(((BloomFilter) (obj)).strategy))
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public final double expectedFpp()
    {
        return Math.pow((double)bits.bitCount() / (double)bitSize(), numHashFunctions);
    }

    public final int hashCode()
    {
        return Objects.hashCode(new Object[] {
            Integer.valueOf(numHashFunctions), funnel, strategy, bits
        });
    }

    public final boolean isCompatible(BloomFilter bloomfilter)
    {
        Preconditions.checkNotNull(bloomfilter);
        return this != bloomfilter && numHashFunctions == bloomfilter.numHashFunctions && bitSize() == bloomfilter.bitSize() && strategy.equals(bloomfilter.strategy) && funnel.equals(bloomfilter.funnel);
    }

    public final boolean mightContain(Object obj)
    {
        return strategy.mightContain(obj, funnel, numHashFunctions, bits);
    }

    public final boolean put(Object obj)
    {
        return strategy.put(obj, funnel, numHashFunctions, bits);
    }

    public final void putAll(BloomFilter bloomfilter)
    {
        Preconditions.checkNotNull(bloomfilter);
        boolean flag;
        if (this != bloomfilter)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Cannot combine a BloomFilter with itself.");
        if (numHashFunctions == bloomfilter.numHashFunctions)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "BloomFilters must have the same number of hash functions (%s != %s)", new Object[] {
            Integer.valueOf(numHashFunctions), Integer.valueOf(bloomfilter.numHashFunctions)
        });
        if (bitSize() == bloomfilter.bitSize())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "BloomFilters must have the same size underlying bit arrays (%s != %s)", new Object[] {
            Long.valueOf(bitSize()), Long.valueOf(bloomfilter.bitSize())
        });
        Preconditions.checkArgument(strategy.equals(bloomfilter.strategy), "BloomFilters must have equal strategies (%s != %s)", new Object[] {
            strategy, bloomfilter.strategy
        });
        Preconditions.checkArgument(funnel.equals(bloomfilter.funnel), "BloomFilters must have equal funnels (%s != %s)", new Object[] {
            funnel, bloomfilter.funnel
        });
        bits.putAll(bloomfilter.bits);
    }

    public final void writeTo(OutputStream outputstream)
    {
        outputstream = new DataOutputStream(outputstream);
        outputstream.writeByte(SignedBytes.checkedCast(strategy.ordinal()));
        outputstream.writeByte(UnsignedBytes.checkedCast(numHashFunctions));
        outputstream.writeInt(bits.data.length);
        long al[] = bits.data;
        int j = al.length;
        for (int i = 0; i < j; i++)
        {
            outputstream.writeLong(al[i]);
        }

    }

    static 
    {
        DEFAULT_STRATEGY = BloomFilterStrategies.MURMUR128_MITZ_64;
    }





    /* member class not found */
    class Strategy {}


    /* member class not found */
    class SerialForm {}

}

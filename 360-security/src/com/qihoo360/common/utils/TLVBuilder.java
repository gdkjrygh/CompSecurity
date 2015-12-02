// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.common.utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

// Referenced classes of package com.qihoo360.common.utils:
//            ByteConvertor, TLVParseHelper

public class TLVBuilder
{
    public static final class DataType extends Enum
    {

        public static final DataType DT_BYTES;
        public static final DataType DT_INT;
        public static final DataType DT_LONG;
        public static final DataType DT_STRING;
        private static final DataType a[];

        public static DataType valueOf(String s)
        {
            return (DataType)Enum.valueOf(com/qihoo360/common/utils/TLVBuilder$DataType, s);
        }

        public static DataType[] values()
        {
            DataType adatatype[] = a;
            int i = adatatype.length;
            DataType adatatype1[] = new DataType[i];
            System.arraycopy(adatatype, 0, adatatype1, 0, i);
            return adatatype1;
        }

        static 
        {
            DT_INT = new DataType("DT_INT", 0);
            DT_LONG = new DataType("DT_LONG", 1);
            DT_STRING = new DataType("DT_STRING", 2);
            DT_BYTES = new DataType("DT_BYTES", 3);
            a = (new DataType[] {
                DT_INT, DT_LONG, DT_STRING, DT_BYTES
            });
        }

        private DataType(String s, int i)
        {
            super(s, i);
        }
    }

    private abstract class a
    {

        protected int a;
        final TLVBuilder b;

        public int a()
        {
            return a;
        }

        public abstract DataType b();

        public abstract byte[] c();

        public abstract int d();

        public String toString()
        {
            return (new StringBuilder("id:")).append(a()).append("[type:").append(b()).append(";len:").append(d()).append(";value(").append(ByteConvertor.toHex(c())).append(")]\n").toString();
        }

        private a()
        {
            b = TLVBuilder.this;
            super();
        }

        a(a a1)
        {
            this();
        }
    }

    private class b extends a
    {

        final TLVBuilder c;
        private byte d[];

        public DataType b()
        {
            return DataType.DT_BYTES;
        }

        public byte[] c()
        {
            if (d == null)
            {
                return null;
            } else
            {
                return d;
            }
        }

        public int d()
        {
            if (d == null)
            {
                return 0;
            } else
            {
                return d.length;
            }
        }

        public byte[] e()
        {
            return d;
        }

        public String toString()
        {
            return (new StringBuilder("TLVItemBytes [mBytes=")).append(d).append(", mId=").append(a).append("]").toString();
        }

        public b(int i, byte abyte0[])
        {
            c = TLVBuilder.this;
            super(null);
            d = null;
            a = i;
            d = abyte0;
        }
    }

    private class c extends a
    {

        final TLVBuilder c;
        private int d;

        public DataType b()
        {
            return DataType.DT_INT;
        }

        public byte[] c()
        {
            return ByteConvertor.toBytes(d);
        }

        public int d()
        {
            return 4;
        }

        public int e()
        {
            return d;
        }

        public String toString()
        {
            return (new StringBuilder("TLVItemInt [mInt=")).append(d).append(", mId=").append(a).append("]").toString();
        }

        public c(int i, int j)
        {
            c = TLVBuilder.this;
            super(null);
            d = 0;
            a = i;
            d = j;
        }

        public c(int i, byte abyte0[])
        {
            c = TLVBuilder.this;
            super(null);
            d = 0;
            a = i;
            d = ByteConvertor.toInt(abyte0);
        }
    }

    private class d extends a
    {

        final TLVBuilder c;
        private long d;

        public DataType b()
        {
            return DataType.DT_LONG;
        }

        public byte[] c()
        {
            return ByteConvertor.toBytes(d);
        }

        public int d()
        {
            return 8;
        }

        public long e()
        {
            return d;
        }

        public String toString()
        {
            return (new StringBuilder("TLVItemLong [mLong=")).append(d).append(", mId=").append(a).append("]").toString();
        }

        public d(int i, long l)
        {
            c = TLVBuilder.this;
            super(null);
            d = 0L;
            a = i;
            d = l;
        }

        public d(int i, byte abyte0[])
        {
            c = TLVBuilder.this;
            super(null);
            d = 0L;
            a = i;
            d = ByteConvertor.toLong(abyte0);
        }
    }

    private class e extends a
    {

        final TLVBuilder c;
        private String d;

        public DataType b()
        {
            return DataType.DT_STRING;
        }

        public byte[] c()
        {
            if (d == null)
            {
                return null;
            } else
            {
                return d.getBytes();
            }
        }

        public int d()
        {
            if (d == null)
            {
                return 0;
            } else
            {
                return d.getBytes().length;
            }
        }

        public String e()
        {
            return d;
        }

        public String toString()
        {
            return (new StringBuilder("TLVItemString [mString=")).append(d).append(", mId=").append(a).append("]").toString();
        }

        public e(int i, String s)
        {
            c = TLVBuilder.this;
            super(null);
            d = null;
            a = i;
            d = s;
        }

        public e(int i, byte abyte0[])
        {
            c = TLVBuilder.this;
            super(null);
            d = null;
            a = i;
            d = new String(abyte0);
        }
    }


    public static final int ERR_INVALID_ID_TYPE = -1000;
    public static final int TLV_BYTES_ID = 4;
    public static final int TLV_INT_ID = 1;
    public static final int TLV_LONG_ID = 2;
    public static final int TLV_STRING_ID = 3;
    private static int a = -1;
    private static int d[];
    private ArrayList b;
    private int c;

    public TLVBuilder()
    {
        b = null;
        c = 0;
        b = new ArrayList();
    }

    public TLVBuilder(TLVBuilder tlvbuilder)
    {
        b = null;
        c = 0;
        b = new ArrayList();
        if (tlvbuilder != null && tlvbuilder.b != null)
        {
            b = (ArrayList)tlvbuilder.b.clone();
        }
        c = tlvbuilder.c;
    }

    public TLVBuilder(byte abyte0[])
    {
        b = null;
        c = 0;
        a(abyte0, b());
    }

    public TLVBuilder(byte abyte0[], TLVParseHelper tlvparsehelper)
    {
        b = null;
        c = 0;
        a(abyte0, tlvparsehelper);
    }

    private void a(int i)
    {
        if (b != null && b.size() != 0)
        {
            int j = b.size() - 1;
            while (j > -1) 
            {
                if (((a)b.get(j)).a == i)
                {
                    b.remove(j);
                }
                j--;
            }
        }
    }

    private void a(byte abyte0[], TLVParseHelper tlvparsehelper)
    {
        if (abyte0 != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i;
        b = new ArrayList();
        i = 0;
_L11:
        if (i + 4 > abyte0.length) goto _L1; else goto _L3
_L3:
        int j = ByteConvertor.toInt(ByteConvertor.subBytes(abyte0, i, 4));
        if (j == a) goto _L1; else goto _L4
_L4:
        int k = ByteConvertor.toInt(ByteConvertor.subBytes(abyte0, i + 4, 4));
        if (k > abyte0.length || k < 0) goto _L1; else goto _L5
_L5:
        Object obj;
        DataType datatype;
        byte abyte1[];
        datatype = tlvparsehelper.getDataTypeFromId(j);
        if (datatype == null)
        {
            b.clear();
            c = -1000;
            return;
        }
        obj = null;
        abyte1 = ByteConvertor.subBytes(abyte0, i + 8, k);
        a()[datatype.ordinal()];
        JVM INSTR tableswitch 1 4: default 156
    //                   1 182
    //                   2 198
    //                   3 214
    //                   4 230;
           goto _L6 _L7 _L8 _L9 _L10
_L6:
        break; /* Loop/switch isn't completed */
_L10:
        break MISSING_BLOCK_LABEL_230;
_L12:
        if (obj != null)
        {
            b.add(obj);
        }
        i += k + 8;
          goto _L11
_L7:
        obj = new c(j, abyte1);
          goto _L12
_L8:
        obj = new d(j, abyte1);
          goto _L12
_L9:
        obj = new e(j, abyte1);
          goto _L12
        obj = new b(j, abyte1);
          goto _L12
    }

    static int[] a()
    {
        int ai[] = d;
        if (ai != null)
        {
            return ai;
        }
        ai = new int[DataType.values().length];
        try
        {
            ai[DataType.DT_BYTES.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            ai[DataType.DT_INT.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            ai[DataType.DT_LONG.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            ai[DataType.DT_STRING.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror) { }
        d = ai;
        return ai;
    }

    private TLVParseHelper b()
    {
        return new TLVParseHelper() {

            final TLVBuilder a;

            public DataType getDataTypeFromId(int i)
            {
                switch (i % 10)
                {
                default:
                    return null;

                case 1: // '\001'
                    return DataType.DT_INT;

                case 2: // '\002'
                    return DataType.DT_LONG;

                case 3: // '\003'
                    return DataType.DT_STRING;

                case 4: // '\004'
                    return DataType.DT_BYTES;
                }
            }

            
            {
                a = TLVBuilder.this;
                super();
            }
        };
    }

    public TLVBuilder Add(int i, int j)
    {
        return add(i, j);
    }

    public TLVBuilder Add(int i, long l)
    {
        return add(i, l);
    }

    public TLVBuilder Add(int i, String s)
    {
        return add(i, s);
    }

    public TLVBuilder Add(int i, byte abyte0[])
    {
        return add(i, abyte0);
    }

    public TLVBuilder add(int i, int j)
    {
        c c1 = new c(i, j);
        b.add(c1);
        return this;
    }

    public TLVBuilder add(int i, long l)
    {
        d d1 = new d(i, l);
        b.add(d1);
        return this;
    }

    public TLVBuilder add(int i, String s)
    {
        s = new e(i, s);
        b.add(s);
        return this;
    }

    public TLVBuilder add(int i, byte abyte0[])
    {
        abyte0 = new b(i, abyte0);
        b.add(abyte0);
        return this;
    }

    public a findItem(int i)
    {
        Iterator iterator = b.iterator();
        a a1;
        do
        {
            if (!iterator.hasNext())
            {
                return null;
            }
            a1 = (a)iterator.next();
        } while (a1.a() != i);
        return a1;
    }

    public byte[] getBytes()
        throws IOException
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        byte abyte0[] = b.iterator();
        do
        {
            a a1;
            int i;
            do
            {
                if (!abyte0.hasNext())
                {
                    bytearrayoutputstream.write(ByteConvertor.toBytes(a));
                    abyte0 = bytearrayoutputstream.toByteArray();
                    bytearrayoutputstream.close();
                    return abyte0;
                }
                a1 = (a)abyte0.next();
                i = a1.d();
            } while (i <= 0);
            bytearrayoutputstream.write(ByteConvertor.toBytes(a1.a()));
            bytearrayoutputstream.write(ByteConvertor.toBytes(i));
            bytearrayoutputstream.write(a1.c());
        } while (true);
    }

    public byte[] getBytes(int i)
    {
        return getBytes(i, null);
    }

    public byte[] getBytes(int i, byte abyte0[])
    {
        a a1 = findItem(i);
        byte abyte1[] = abyte0;
        if (a1 != null)
        {
            abyte1 = abyte0;
            if (a1.b() == DataType.DT_BYTES)
            {
                abyte1 = ((b)a1).e();
            }
        }
        return abyte1;
    }

    public int getErrCode()
    {
        return c;
    }

    public int getInt(int i)
    {
        return getInt(i, 0);
    }

    public int getInt(int i, int j)
    {
        a a1 = findItem(i);
        i = j;
        if (a1 != null)
        {
            i = j;
            if (a1.b() == DataType.DT_INT)
            {
                i = ((c)a1).e();
            }
        }
        return i;
    }

    public long getLong(int i)
    {
        return getLong(i, 0L);
    }

    public long getLong(int i, long l)
    {
        a a1 = findItem(i);
        long l1 = l;
        if (a1 != null)
        {
            l1 = l;
            if (a1.b() == DataType.DT_LONG)
            {
                l1 = ((d)a1).e();
            }
        }
        return l1;
    }

    public String getString(int i)
    {
        return getString(i, null);
    }

    public String getString(int i, String s)
    {
        a a1 = findItem(i);
        String s1 = s;
        if (a1 != null)
        {
            s1 = s;
            if (a1.b() == DataType.DT_STRING)
            {
                s1 = ((e)a1).e();
            }
        }
        return s1;
    }

    public LinkedHashMap getTLVItemValues()
    {
        if (b == null)
        {
            return null;
        }
        LinkedHashMap linkedhashmap = new LinkedHashMap();
        Iterator iterator = b.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return linkedhashmap;
            }
            a a1 = (a)iterator.next();
            linkedhashmap.put(Integer.valueOf(a1.a()), a1.c());
        } while (true);
    }

    public int size()
    {
        if (b != null)
        {
            return b.size();
        } else
        {
            return 0;
        }
    }

    public String toString()
    {
        return b.toString();
    }

    public TLVBuilder update(int i, int j)
    {
        a(i);
        c c1 = new c(i, j);
        b.add(c1);
        return this;
    }

    public TLVBuilder update(int i, long l)
    {
        a(i);
        d d1 = new d(i, l);
        b.add(d1);
        return this;
    }

    public TLVBuilder update(int i, String s)
    {
        a(i);
        s = new e(i, s);
        b.add(s);
        return this;
    }

    public TLVBuilder update(int i, byte abyte0[])
    {
        a(i);
        abyte0 = new b(i, abyte0);
        b.add(abyte0);
        return this;
    }

}

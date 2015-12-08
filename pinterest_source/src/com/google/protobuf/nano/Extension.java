// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.protobuf.nano;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.protobuf.nano:
//            UnknownFieldData, CodedInputByteBufferNano, WireFormatNano, MessageNano, 
//            CodedOutputByteBufferNano

public class Extension
{

    public static final int TYPE_BOOL = 8;
    public static final int TYPE_BYTES = 12;
    public static final int TYPE_DOUBLE = 1;
    public static final int TYPE_ENUM = 14;
    public static final int TYPE_FIXED32 = 7;
    public static final int TYPE_FIXED64 = 6;
    public static final int TYPE_FLOAT = 2;
    public static final int TYPE_GROUP = 10;
    public static final int TYPE_INT32 = 5;
    public static final int TYPE_INT64 = 3;
    public static final int TYPE_MESSAGE = 11;
    public static final int TYPE_SFIXED32 = 15;
    public static final int TYPE_SFIXED64 = 16;
    public static final int TYPE_SINT32 = 17;
    public static final int TYPE_SINT64 = 18;
    public static final int TYPE_STRING = 9;
    public static final int TYPE_UINT32 = 13;
    public static final int TYPE_UINT64 = 4;
    protected final Class clazz;
    protected final boolean repeated;
    public final int tag;
    protected final int type;

    private Extension(int i, Class class1, int j, boolean flag)
    {
        type = i;
        clazz = class1;
        tag = j;
        repeated = flag;
    }

    Extension(int i, Class class1, int j, boolean flag, _cls1 _pcls1)
    {
        this(i, class1, j, flag);
    }

    public static Extension createMessageTyped(int i, Class class1, int j)
    {
        return new Extension(i, class1, j, false);
    }

    public static Extension createMessageTyped(int i, Class class1, long l)
    {
        return new Extension(i, class1, (int)l, false);
    }

    public static Extension createPrimitiveTyped(int i, Class class1, long l)
    {
        return new PrimitiveExtension(i, class1, (int)l, false, 0, 0);
    }

    public static Extension createRepeatedMessageTyped(int i, Class class1, long l)
    {
        return new Extension(i, class1, (int)l, true);
    }

    public static Extension createRepeatedPrimitiveTyped(int i, Class class1, long l, long l1, long l2)
    {
        return new PrimitiveExtension(i, class1, (int)l, true, (int)l1, (int)l2);
    }

    private Object getRepeatedValueFrom(List list)
    {
        ArrayList arraylist;
        boolean flag;
        int k;
        flag = false;
        arraylist = new ArrayList();
        for (int i = 0; i < list.size(); i++)
        {
            UnknownFieldData unknownfielddata = (UnknownFieldData)list.get(i);
            if (unknownfielddata.bytes.length != 0)
            {
                readDataInto(unknownfielddata, arraylist);
            }
        }

        k = arraylist.size();
        if (k != 0) goto _L2; else goto _L1
_L1:
        list = null;
_L4:
        return list;
_L2:
        Object obj = clazz.cast(Array.newInstance(clazz.getComponentType(), k));
        int j = ((flag) ? 1 : 0);
        do
        {
            list = ((List) (obj));
            if (j >= k)
            {
                continue;
            }
            Array.set(obj, j, arraylist.get(j));
            j++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private Object getSingularValueFrom(List list)
    {
        if (list.isEmpty())
        {
            return null;
        } else
        {
            list = (UnknownFieldData)list.get(list.size() - 1);
            return clazz.cast(readData(CodedInputByteBufferNano.newInstance(((UnknownFieldData) (list)).bytes)));
        }
    }

    protected int computeRepeatedSerializedSize(Object obj)
    {
        int j = 0;
        int l = Array.getLength(obj);
        for (int i = 0; i < l;)
        {
            int k = j;
            if (Array.get(obj, i) != null)
            {
                k = j + computeSingularSerializedSize(Array.get(obj, i));
            }
            i++;
            j = k;
        }

        return j;
    }

    int computeSerializedSize(Object obj)
    {
        if (repeated)
        {
            return computeRepeatedSerializedSize(obj);
        } else
        {
            return computeSingularSerializedSize(obj);
        }
    }

    protected int computeSingularSerializedSize(Object obj)
    {
        int i = WireFormatNano.getTagFieldNumber(tag);
        switch (type)
        {
        default:
            i = type;
            throw new IllegalArgumentException((new StringBuilder(24)).append("Unknown type ").append(i).toString());

        case 10: // '\n'
            return CodedOutputByteBufferNano.computeGroupSize(i, (MessageNano)obj);

        case 11: // '\013'
            return CodedOutputByteBufferNano.computeMessageSize(i, (MessageNano)obj);
        }
    }

    final Object getValueFrom(List list)
    {
        if (list == null)
        {
            return null;
        }
        if (repeated)
        {
            return getRepeatedValueFrom(list);
        } else
        {
            return getSingularValueFrom(list);
        }
    }

    protected Object readData(CodedInputByteBufferNano codedinputbytebuffernano)
    {
        Object obj;
        if (repeated)
        {
            obj = clazz.getComponentType();
        } else
        {
            obj = clazz;
        }
        type;
        JVM INSTR tableswitch 10 11: default 221
    //                   10 128
    //                   11 150;
           goto _L1 _L2 _L3
_L1:
        int i = type;
        throw new IllegalArgumentException((new StringBuilder(24)).append("Unknown type ").append(i).toString());
_L2:
        MessageNano messagenano;
        try
        {
            messagenano = (MessageNano)((Class) (obj)).newInstance();
            codedinputbytebuffernano.readGroup(messagenano, WireFormatNano.getTagFieldNumber(tag));
        }
        // Misplaced declaration of an exception variable
        catch (CodedInputByteBufferNano codedinputbytebuffernano)
        {
            obj = String.valueOf(obj);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(obj).length() + 33)).append("Error creating instance of class ").append(((String) (obj))).toString(), codedinputbytebuffernano);
        }
        // Misplaced declaration of an exception variable
        catch (CodedInputByteBufferNano codedinputbytebuffernano)
        {
            obj = String.valueOf(obj);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(obj).length() + 33)).append("Error creating instance of class ").append(((String) (obj))).toString(), codedinputbytebuffernano);
        }
        // Misplaced declaration of an exception variable
        catch (CodedInputByteBufferNano codedinputbytebuffernano)
        {
            throw new IllegalArgumentException("Error reading extension field", codedinputbytebuffernano);
        }
        return messagenano;
_L3:
        messagenano = (MessageNano)((Class) (obj)).newInstance();
        codedinputbytebuffernano.readMessage(messagenano);
        return messagenano;
    }

    protected void readDataInto(UnknownFieldData unknownfielddata, List list)
    {
        list.add(readData(CodedInputByteBufferNano.newInstance(unknownfielddata.bytes)));
    }

    protected void writeRepeatedData(Object obj, CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        int j = Array.getLength(obj);
        for (int i = 0; i < j; i++)
        {
            Object obj1 = Array.get(obj, i);
            if (obj1 != null)
            {
                writeSingularData(obj1, codedoutputbytebuffernano);
            }
        }

    }

    protected void writeSingularData(Object obj, CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        codedoutputbytebuffernano.writeRawVarint32(tag);
        type;
        JVM INSTR tableswitch 10 11: default 114
    //                   10 80
    //                   11 105;
           goto _L1 _L2 _L3
_L1:
        int i = type;
        throw new IllegalArgumentException((new StringBuilder(24)).append("Unknown type ").append(i).toString());
_L2:
        try
        {
            obj = (MessageNano)obj;
            int j = WireFormatNano.getTagFieldNumber(tag);
            codedoutputbytebuffernano.writeGroupNoTag(((MessageNano) (obj)));
            codedoutputbytebuffernano.writeTag(j, 4);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new IllegalStateException(((Throwable) (obj)));
        }
_L3:
        codedoutputbytebuffernano.writeMessageNoTag((MessageNano)obj);
        return;
    }

    void writeTo(Object obj, CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (repeated)
        {
            writeRepeatedData(obj, codedoutputbytebuffernano);
            return;
        } else
        {
            writeSingularData(obj, codedoutputbytebuffernano);
            return;
        }
    }

    /* member class not found */
    class PrimitiveExtension {}

}

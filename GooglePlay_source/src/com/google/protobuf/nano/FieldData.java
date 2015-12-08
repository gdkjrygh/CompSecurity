// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.protobuf.nano;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.protobuf.nano:
//            CodedOutputByteBufferNano, MessageNano, Extension, UnknownFieldData

final class FieldData
    implements Cloneable
{

    private Extension cachedExtension;
    List unknownFieldData;
    private Object value;

    FieldData()
    {
        unknownFieldData = new ArrayList();
    }

    private byte[] toByteArray()
        throws IOException
    {
        byte abyte0[] = new byte[computeSerializedSize()];
        writeTo(CodedOutputByteBufferNano.newInstance(abyte0, 0, abyte0.length));
        return abyte0;
    }

    public final FieldData clone()
    {
        Object obj = new FieldData();
        obj.cachedExtension = cachedExtension;
        if (unknownFieldData != null) goto _L2; else goto _L1
_L1:
        obj.unknownFieldData = null;
_L7:
        if (value == null) goto _L4; else goto _L3
_L3:
        if (!(value instanceof MessageNano)) goto _L6; else goto _L5
_L5:
        obj.value = ((MessageNano)value).clone();
        return ((FieldData) (obj));
_L2:
        try
        {
            ((FieldData) (obj)).unknownFieldData.addAll(unknownFieldData);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new AssertionError(obj);
        }
          goto _L7
_L6:
        if (!(value instanceof byte[]))
        {
            break MISSING_BLOCK_LABEL_114;
        }
        obj.value = ((byte[])value).clone();
        return ((FieldData) (obj));
        if (!(value instanceof byte[][])) goto _L9; else goto _L8
_L8:
        Object obj1;
        Object obj2;
        obj1 = (byte[][])value;
        obj2 = new byte[obj1.length][];
        obj.value = obj2;
        int i = 0;
_L10:
        if (i >= obj1.length)
        {
            break; /* Loop/switch isn't completed */
        }
        obj2[i] = (byte[])obj1[i].clone();
        i++;
        if (true) goto _L10; else goto _L4
_L9:
        if (!(value instanceof boolean[]))
        {
            break MISSING_BLOCK_LABEL_202;
        }
        obj.value = ((boolean[])value).clone();
        return ((FieldData) (obj));
        if (!(value instanceof int[]))
        {
            break MISSING_BLOCK_LABEL_228;
        }
        obj.value = ((int[])value).clone();
        return ((FieldData) (obj));
        if (!(value instanceof long[]))
        {
            break MISSING_BLOCK_LABEL_254;
        }
        obj.value = ((long[])value).clone();
        return ((FieldData) (obj));
        if (!(value instanceof float[]))
        {
            break MISSING_BLOCK_LABEL_280;
        }
        obj.value = ((float[])value).clone();
        return ((FieldData) (obj));
        if (!(value instanceof double[]))
        {
            break MISSING_BLOCK_LABEL_306;
        }
        obj.value = ((double[])value).clone();
        return ((FieldData) (obj));
        if (!(value instanceof MessageNano[])) goto _L4; else goto _L11
_L11:
        obj1 = (MessageNano[])value;
        obj2 = new MessageNano[obj1.length];
        obj.value = obj2;
        i = 0;
_L12:
        if (i >= obj1.length)
        {
            break; /* Loop/switch isn't completed */
        }
        obj2[i] = obj1[i].clone();
        i++;
        if (true) goto _L12; else goto _L4
_L4:
        return ((FieldData) (obj));
    }

    public final volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    final int computeSerializedSize()
    {
        int i = 0;
        if (value == null) goto _L2; else goto _L1
_L1:
        int j = cachedExtension.computeSerializedSize(value);
_L4:
        return j;
_L2:
        Iterator iterator = unknownFieldData.iterator();
        do
        {
            j = i;
            if (!iterator.hasNext())
            {
                continue;
            }
            UnknownFieldData unknownfielddata = (UnknownFieldData)iterator.next();
            i += CodedOutputByteBufferNano.computeRawVarint32Size(unknownfielddata.tag) + 0 + unknownfielddata.bytes.length;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final boolean equals(Object obj)
    {
        boolean flag2 = false;
        boolean flag;
        if (obj == this)
        {
            flag = true;
        } else
        {
            flag = flag2;
            if (obj instanceof FieldData)
            {
                obj = (FieldData)obj;
                if (value != null && ((FieldData) (obj)).value != null)
                {
                    flag = flag2;
                    if (cachedExtension == ((FieldData) (obj)).cachedExtension)
                    {
                        if (!cachedExtension.clazz.isArray())
                        {
                            return value.equals(((FieldData) (obj)).value);
                        }
                        if (value instanceof byte[])
                        {
                            return Arrays.equals((byte[])value, (byte[])((FieldData) (obj)).value);
                        }
                        if (value instanceof int[])
                        {
                            return Arrays.equals((int[])value, (int[])((FieldData) (obj)).value);
                        }
                        if (value instanceof long[])
                        {
                            return Arrays.equals((long[])value, (long[])((FieldData) (obj)).value);
                        }
                        if (value instanceof float[])
                        {
                            return Arrays.equals((float[])value, (float[])((FieldData) (obj)).value);
                        }
                        if (value instanceof double[])
                        {
                            return Arrays.equals((double[])value, (double[])((FieldData) (obj)).value);
                        }
                        if (value instanceof boolean[])
                        {
                            return Arrays.equals((boolean[])value, (boolean[])((FieldData) (obj)).value);
                        } else
                        {
                            return Arrays.deepEquals((Object[])value, (Object[])((FieldData) (obj)).value);
                        }
                    }
                } else
                {
                    if (unknownFieldData != null && ((FieldData) (obj)).unknownFieldData != null)
                    {
                        return unknownFieldData.equals(((FieldData) (obj)).unknownFieldData);
                    }
                    boolean flag1;
                    try
                    {
                        flag1 = Arrays.equals(toByteArray(), ((FieldData) (obj)).toByteArray());
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        throw new IllegalStateException(((Throwable) (obj)));
                    }
                    return flag1;
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        int i;
        try
        {
            i = Arrays.hashCode(toByteArray());
        }
        catch (IOException ioexception)
        {
            throw new IllegalStateException(ioexception);
        }
        return i + 527;
    }

    final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (value != null)
        {
            cachedExtension.writeTo(value, codedoutputbytebuffernano);
        } else
        {
            Iterator iterator = unknownFieldData.iterator();
            while (iterator.hasNext()) 
            {
                UnknownFieldData unknownfielddata = (UnknownFieldData)iterator.next();
                codedoutputbytebuffernano.writeRawVarint32(unknownfielddata.tag);
                codedoutputbytebuffernano.writeRawBytes(unknownfielddata.bytes);
            }
        }
    }
}

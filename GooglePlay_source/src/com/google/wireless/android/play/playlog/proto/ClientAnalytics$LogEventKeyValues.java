// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wireless.android.play.playlog.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.FieldArray;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

// Referenced classes of package com.google.wireless.android.play.playlog.proto:
//            ClientAnalytics

public static final class cachedSize extends ExtendableMessageNano
{

    private static volatile value _emptyArray[];
    public String key;
    public String value;

    public static cachedSize[] emptyArray()
    {
        if (_emptyArray == null)
        {
            synchronized (InternalNano.LAZY_INIT_LOCK)
            {
                if (_emptyArray == null)
                {
                    _emptyArray = new _emptyArray[0];
                }
            }
        }
        return _emptyArray;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (!key.equals(""))
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, key);
        }
        j = i;
        if (!value.equals(""))
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, value);
        }
        return j;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof value))
            {
                return false;
            }
            obj = (value)obj;
            if (key == null)
            {
                if (((key) (obj)).key != null)
                {
                    return false;
                }
            } else
            if (!key.equals(((key) (obj)).key))
            {
                return false;
            }
            if (value == null)
            {
                if (((value) (obj)).value != null)
                {
                    return false;
                }
            } else
            if (!value.equals(((value) (obj)).value))
            {
                return false;
            }
            if (unknownFieldData == null || unknownFieldData.isEmpty())
            {
                if (((unknownFieldData) (obj)).unknownFieldData != null && !((unknownFieldData) (obj)).unknownFieldData.isEmpty())
                {
                    return false;
                }
            } else
            {
                return unknownFieldData.equals(((unknownFieldData) (obj)).unknownFieldData);
            }
        }
        return true;
    }

    public final int hashCode()
    {
        boolean flag = false;
        int l = getClass().getName().hashCode();
        int i;
        int j;
        int k;
        if (key == null)
        {
            i = 0;
        } else
        {
            i = key.hashCode();
        }
        if (value == null)
        {
            j = 0;
        } else
        {
            j = value.hashCode();
        }
        k = ((flag) ? 1 : 0);
        if (unknownFieldData != null)
        {
            if (unknownFieldData.isEmpty())
            {
                k = ((flag) ? 1 : 0);
            } else
            {
                k = unknownFieldData.hashCode();
            }
        }
        return (((l + 527) * 31 + i) * 31 + j) * 31 + k;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
        do
        {
            int i = codedinputbytebuffernano.readTag();
            switch (i)
            {
            default:
                if (storeUnknownField(codedinputbytebuffernano, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                key = codedinputbytebuffernano.readString();
                break;

            case 18: // '\022'
                value = codedinputbytebuffernano.readString();
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (!key.equals(""))
        {
            codedoutputbytebuffernano.writeString(1, key);
        }
        if (!value.equals(""))
        {
            codedoutputbytebuffernano.writeString(2, value);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        key = "";
        value = "";
        unknownFieldData = null;
        cachedSize = -1;
    }
}

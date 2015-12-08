// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto:
//            NanoWalletObjects

public static final class clear extends ExtendableMessageNano
{

    private static volatile  _emptyArray[];
    public Integer categoryId;
    public Long creationTimeMillis;
    public yticsEvent deleteEvent;
    public Boolean deleted;
    public Long expirationTimeMillis;
    public Long holderVersion;
    public String id;
    public String issuerName;
    public long labelOrdinals[];
    public Long lastActivityTimeMillis;
    public Long lastTouchTimeMillis;
    public yticsEvent menuItems[];
    public ionSettings notificationSettings;
    public ionSettings renderOutput;
    public byte serverData[];
    public String sortKey;
    public String title;
    public Long version;

    private clear clear()
    {
        id = null;
        lastTouchTimeMillis = null;
        lastActivityTimeMillis = null;
        renderOutput = null;
        labelOrdinals = WireFormatNano.EMPTY_LONG_ARRAY;
        deleted = null;
        version = null;
        holderVersion = null;
        title = null;
        issuerName = null;
        creationTimeMillis = null;
        expirationTimeMillis = null;
        notificationSettings = null;
        serverData = null;
        sortKey = null;
        categoryId = null;
        menuItems = tyArray();
        deleteEvent = null;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

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

    private _emptyArray mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                id = codedinputbytebuffernano.readString();
                break;

            case 16: // '\020'
                lastTouchTimeMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
                break;

            case 26: // '\032'
                if (renderOutput == null)
                {
                    renderOutput = new nit>();
                }
                codedinputbytebuffernano.readMessage(renderOutput);
                break;

            case 32: // ' '
                int i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 32);
                long al[];
                int j;
                if (labelOrdinals == null)
                {
                    j = 0;
                } else
                {
                    j = labelOrdinals.length;
                }
                al = new long[j + i1];
                i1 = j;
                if (j != 0)
                {
                    System.arraycopy(labelOrdinals, 0, al, 0, j);
                    i1 = j;
                }
                for (; i1 < al.length - 1; i1++)
                {
                    al[i1] = codedinputbytebuffernano.readInt64();
                    codedinputbytebuffernano.readTag();
                }

                al[i1] = codedinputbytebuffernano.readInt64();
                labelOrdinals = al;
                break;

            case 34: // '"'
                int l1 = codedinputbytebuffernano.pushLimit(codedinputbytebuffernano.readRawVarint32());
                int j1 = 0;
                int k = codedinputbytebuffernano.getPosition();
                while (codedinputbytebuffernano.getBytesUntilLimit() > 0) 
                {
                    codedinputbytebuffernano.readInt64();
                    j1++;
                }
                codedinputbytebuffernano.rewindToPosition(k);
                long al1[];
                if (labelOrdinals == null)
                {
                    k = 0;
                } else
                {
                    k = labelOrdinals.length;
                }
                al1 = new long[k + j1];
                j1 = k;
                if (k != 0)
                {
                    System.arraycopy(labelOrdinals, 0, al1, 0, k);
                    j1 = k;
                }
                for (; j1 < al1.length; j1++)
                {
                    al1[j1] = codedinputbytebuffernano.readInt64();
                }

                labelOrdinals = al1;
                codedinputbytebuffernano.popLimit(l1);
                break;

            case 40: // '('
                version = Long.valueOf(codedinputbytebuffernano.readInt64());
                break;

            case 50: // '2'
                title = codedinputbytebuffernano.readString();
                break;

            case 58: // ':'
                issuerName = codedinputbytebuffernano.readString();
                break;

            case 64: // '@'
                holderVersion = Long.valueOf(codedinputbytebuffernano.readInt64());
                break;

            case 72: // 'H'
                deleted = Boolean.valueOf(codedinputbytebuffernano.readBool());
                break;

            case 80: // 'P'
                expirationTimeMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
                break;

            case 90: // 'Z'
                if (notificationSettings == null)
                {
                    notificationSettings = new ionSettings();
                }
                codedinputbytebuffernano.readMessage(notificationSettings);
                break;

            case 96: // '`'
                lastActivityTimeMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
                break;

            case 106: // 'j'
                serverData = codedinputbytebuffernano.readBytes();
                break;

            case 112: // 'p'
                creationTimeMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
                break;

            case 130: 
                sortKey = codedinputbytebuffernano.readString();
                break;

            case 136: 
                categoryId = Integer.valueOf(codedinputbytebuffernano.readInt32());
                break;

            case 146: 
                int k1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 146);
                _emptyArray a_lemptyarray[];
                int l;
                if (menuItems == null)
                {
                    l = 0;
                } else
                {
                    l = menuItems.length;
                }
                a_lemptyarray = new menuItems[l + k1];
                k1 = l;
                if (l != 0)
                {
                    System.arraycopy(menuItems, 0, a_lemptyarray, 0, l);
                    k1 = l;
                }
                for (; k1 < a_lemptyarray.length - 1; k1++)
                {
                    a_lemptyarray[k1] = new it>();
                    codedinputbytebuffernano.readMessage(a_lemptyarray[k1]);
                    codedinputbytebuffernano.readTag();
                }

                a_lemptyarray[k1] = new it>();
                codedinputbytebuffernano.readMessage(a_lemptyarray[k1]);
                menuItems = a_lemptyarray;
                break;

            case 154: 
                if (deleteEvent == null)
                {
                    deleteEvent = new yticsEvent();
                }
                codedinputbytebuffernano.readMessage(deleteEvent);
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (id != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, id);
        }
        j = i;
        if (lastTouchTimeMillis != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt64Size(2, lastTouchTimeMillis.longValue());
        }
        i = j;
        if (renderOutput != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(3, renderOutput);
        }
        j = i;
        if (labelOrdinals != null)
        {
            j = i;
            if (labelOrdinals.length > 0)
            {
                int k = 0;
                for (j = 0; j < labelOrdinals.length; j++)
                {
                    k += CodedOutputByteBufferNano.computeInt64SizeNoTag(labelOrdinals[j]);
                }

                j = i + k + labelOrdinals.length * 1;
            }
        }
        i = j;
        if (version != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt64Size(5, version.longValue());
        }
        j = i;
        if (title != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(6, title);
        }
        i = j;
        if (issuerName != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(7, issuerName);
        }
        j = i;
        if (holderVersion != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt64Size(8, holderVersion.longValue());
        }
        i = j;
        if (deleted != null)
        {
            i = j + CodedOutputByteBufferNano.computeBoolSize(9, deleted.booleanValue());
        }
        j = i;
        if (expirationTimeMillis != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt64Size(10, expirationTimeMillis.longValue());
        }
        i = j;
        if (notificationSettings != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(11, notificationSettings);
        }
        j = i;
        if (lastActivityTimeMillis != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt64Size(12, lastActivityTimeMillis.longValue());
        }
        i = j;
        if (serverData != null)
        {
            i = j + CodedOutputByteBufferNano.computeBytesSize(13, serverData);
        }
        j = i;
        if (creationTimeMillis != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt64Size(14, creationTimeMillis.longValue());
        }
        int l = j;
        if (sortKey != null)
        {
            l = j + CodedOutputByteBufferNano.computeStringSize(16, sortKey);
        }
        i = l;
        if (categoryId != null)
        {
            i = l + CodedOutputByteBufferNano.computeInt32Size(17, categoryId.intValue());
        }
        j = i;
        if (menuItems != null)
        {
            j = i;
            if (menuItems.length > 0)
            {
                int i1 = 0;
                do
                {
                    j = i;
                    if (i1 >= menuItems.length)
                    {
                        break;
                    }
                    deleteEvent deleteevent = menuItems[i1];
                    j = i;
                    if (deleteevent != null)
                    {
                        j = i + CodedOutputByteBufferNano.computeMessageSize(18, deleteevent);
                    }
                    i1++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (deleteEvent != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(19, deleteEvent);
        }
        return i;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
        return mergeFrom(codedinputbytebuffernano);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (id != null)
        {
            codedoutputbytebuffernano.writeString(1, id);
        }
        if (lastTouchTimeMillis != null)
        {
            codedoutputbytebuffernano.writeInt64(2, lastTouchTimeMillis.longValue());
        }
        if (renderOutput != null)
        {
            codedoutputbytebuffernano.writeMessage(3, renderOutput);
        }
        if (labelOrdinals != null && labelOrdinals.length > 0)
        {
            for (int i = 0; i < labelOrdinals.length; i++)
            {
                codedoutputbytebuffernano.writeInt64(4, labelOrdinals[i]);
            }

        }
        if (version != null)
        {
            codedoutputbytebuffernano.writeInt64(5, version.longValue());
        }
        if (title != null)
        {
            codedoutputbytebuffernano.writeString(6, title);
        }
        if (issuerName != null)
        {
            codedoutputbytebuffernano.writeString(7, issuerName);
        }
        if (holderVersion != null)
        {
            codedoutputbytebuffernano.writeInt64(8, holderVersion.longValue());
        }
        if (deleted != null)
        {
            codedoutputbytebuffernano.writeBool(9, deleted.booleanValue());
        }
        if (expirationTimeMillis != null)
        {
            codedoutputbytebuffernano.writeInt64(10, expirationTimeMillis.longValue());
        }
        if (notificationSettings != null)
        {
            codedoutputbytebuffernano.writeMessage(11, notificationSettings);
        }
        if (lastActivityTimeMillis != null)
        {
            codedoutputbytebuffernano.writeInt64(12, lastActivityTimeMillis.longValue());
        }
        if (serverData != null)
        {
            codedoutputbytebuffernano.writeBytes(13, serverData);
        }
        if (creationTimeMillis != null)
        {
            codedoutputbytebuffernano.writeInt64(14, creationTimeMillis.longValue());
        }
        if (sortKey != null)
        {
            codedoutputbytebuffernano.writeString(16, sortKey);
        }
        if (categoryId != null)
        {
            codedoutputbytebuffernano.writeInt32(17, categoryId.intValue());
        }
        if (menuItems != null && menuItems.length > 0)
        {
            for (int j = 0; j < menuItems.length; j++)
            {
                mergeFrom mergefrom = menuItems[j];
                if (mergefrom != null)
                {
                    codedoutputbytebuffernano.writeMessage(18, mergefrom);
                }
            }

        }
        if (deleteEvent != null)
        {
            codedoutputbytebuffernano.writeMessage(19, deleteEvent);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ionSettings()
    {
        clear();
    }
}

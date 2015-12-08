// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.thrift.protocol;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import org.apache.thrift.ShortStack;
import org.apache.thrift.TException;
import org.apache.thrift.transport.TTransport;

// Referenced classes of package org.apache.thrift.protocol:
//            TProtocol, TStruct, TField, TProtocolException, 
//            TList, TMap, TMessage, TSet

public class TCompactProtocol extends TProtocol
{

    private static final TStruct ANONYMOUS_STRUCT = new TStruct("");
    private static final long NO_LENGTH_LIMIT = -1L;
    private static final byte PROTOCOL_ID = -126;
    private static final TField TSTOP = new TField("", (byte)0, (short)0);
    private static final byte TYPE_BITS = 7;
    private static final byte TYPE_MASK = -32;
    private static final int TYPE_SHIFT_AMOUNT = 5;
    private static final byte VERSION = 1;
    private static final byte VERSION_MASK = 31;
    private static final byte ttypeToCompactType[];
    private Boolean boolValue_;
    private TField booleanField_;
    private byte byteDirectBuffer[];
    byte byteRawBuf[];
    private final long containerLengthLimit_;
    byte i32buf[];
    private short lastFieldId_;
    private ShortStack lastField_;
    private final long stringLengthLimit_;
    byte varint64out[];

    public TCompactProtocol(TTransport ttransport)
    {
        this(ttransport, -1L, -1L);
    }

    public TCompactProtocol(TTransport ttransport, long l)
    {
        this(ttransport, l, -1L);
    }

    public TCompactProtocol(TTransport ttransport, long l, long l1)
    {
        super(ttransport);
        lastField_ = new ShortStack(15);
        lastFieldId_ = 0;
        booleanField_ = null;
        boolValue_ = null;
        i32buf = new byte[5];
        varint64out = new byte[10];
        byteDirectBuffer = new byte[1];
        byteRawBuf = new byte[1];
        stringLengthLimit_ = l;
        containerLengthLimit_ = l1;
    }

    private long bytesToLong(byte abyte0[])
    {
        return ((long)abyte0[7] & 255L) << 56 | ((long)abyte0[6] & 255L) << 48 | ((long)abyte0[5] & 255L) << 40 | ((long)abyte0[4] & 255L) << 32 | ((long)abyte0[3] & 255L) << 24 | ((long)abyte0[2] & 255L) << 16 | ((long)abyte0[1] & 255L) << 8 | (long)abyte0[0] & 255L;
    }

    private void checkContainerReadLength(int i)
    {
        if (i < 0)
        {
            throw new TProtocolException(2, (new StringBuilder("Negative length: ")).append(i).toString());
        }
        if (containerLengthLimit_ != -1L && (long)i > containerLengthLimit_)
        {
            throw new TProtocolException(3, (new StringBuilder("Length exceeded max allowed: ")).append(i).toString());
        } else
        {
            return;
        }
    }

    private void checkStringReadLength(int i)
    {
        if (i < 0)
        {
            throw new TProtocolException(2, (new StringBuilder("Negative length: ")).append(i).toString());
        }
        if (stringLengthLimit_ != -1L && (long)i > stringLengthLimit_)
        {
            throw new TProtocolException(3, (new StringBuilder("Length exceeded max allowed: ")).append(i).toString());
        } else
        {
            return;
        }
    }

    private void fixedLongToBytes(long l, byte abyte0[], int i)
    {
        abyte0[i + 0] = (byte)(int)(l & 255L);
        abyte0[i + 1] = (byte)(int)(l >> 8 & 255L);
        abyte0[i + 2] = (byte)(int)(l >> 16 & 255L);
        abyte0[i + 3] = (byte)(int)(l >> 24 & 255L);
        abyte0[i + 4] = (byte)(int)(l >> 32 & 255L);
        abyte0[i + 5] = (byte)(int)(l >> 40 & 255L);
        abyte0[i + 6] = (byte)(int)(l >> 48 & 255L);
        abyte0[i + 7] = (byte)(int)(l >> 56 & 255L);
    }

    private byte getCompactType(byte byte0)
    {
        return ttypeToCompactType[byte0];
    }

    private byte getTType(byte byte0)
    {
        switch ((byte)(byte0 & 0xf))
        {
        default:
            throw new TProtocolException((new StringBuilder("don't know what type: ")).append((byte)(byte0 & 0xf)).toString());

        case 0: // '\0'
            return 0;

        case 1: // '\001'
        case 2: // '\002'
            return 2;

        case 3: // '\003'
            return 3;

        case 4: // '\004'
            return 6;

        case 5: // '\005'
            return 8;

        case 6: // '\006'
            return 10;

        case 7: // '\007'
            return 4;

        case 8: // '\b'
            return 11;

        case 9: // '\t'
            return 15;

        case 10: // '\n'
            return 14;

        case 11: // '\013'
            return 13;

        case 12: // '\f'
            return 12;
        }
    }

    private int intToZigZag(int i)
    {
        return i << 1 ^ i >> 31;
    }

    private boolean isBoolType(byte byte0)
    {
        byte0 &= 0xf;
        return byte0 == 1 || byte0 == 2;
    }

    private long longToZigzag(long l)
    {
        return l << 1 ^ l >> 63;
    }

    private byte[] readBinary(int i)
    {
        if (i == 0)
        {
            return new byte[0];
        } else
        {
            byte abyte0[] = new byte[i];
            trans_.readAll(abyte0, 0, i);
            return abyte0;
        }
    }

    private int readVarint32()
    {
_L2:
        int k;
        do
        {
            l = readByte();
            k |= (l & 0x7f) << i;
            if ((l & 0x80) == 128)
            {
                i += 7;
            } else
            {
                return k;
            }
        } while (true);
        int l = 0;
        int i = 0;
        if (trans_.getBytesRemainingInBuffer() >= 5)
        {
            byte abyte0[] = trans_.getBuffer();
            int i1 = trans_.getBufferPosition();
            int j = 0;
            l = 0;
            do
            {
                byte byte0 = abyte0[i1 + i];
                l |= (byte0 & 0x7f) << j;
                if ((byte0 & 0x80) == 128)
                {
                    j += 7;
                    i++;
                } else
                {
                    trans_.consumeBuffer(i + 1);
                    return l;
                }
            } while (true);
        }
        k = 0;
        i = l;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private long readVarint64()
    {
        int i;
        boolean flag;
        long l;
        long l1;
        i = 0;
        flag = false;
        l = 0L;
        l1 = l;
        if (trans_.getBytesRemainingInBuffer() < 10) goto _L2; else goto _L1
_L1:
        byte abyte0[] = trans_.getBuffer();
        int k = trans_.getBufferPosition();
        int j = 0;
        i = ((flag) ? 1 : 0);
        do
        {
            byte byte1 = abyte0[k + i];
            l |= (long)(byte1 & 0x7f) << j;
            if ((byte1 & 0x80) != 128)
            {
                break;
            }
            j += 7;
            i++;
        } while (true);
        trans_.consumeBuffer(i + 1);
_L4:
        return l;
_L2:
        do
        {
            byte byte0 = readByte();
            l1 |= (long)(byte0 & 0x7f) << i;
            l = l1;
            if ((byte0 & 0x80) != 128)
            {
                continue;
            }
            i += 7;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void writeBinary(byte abyte0[], int i, int j)
    {
        writeVarint32(j);
        trans_.write(abyte0, i, j);
    }

    private void writeByteDirect(byte byte0)
    {
        byteDirectBuffer[0] = byte0;
        trans_.write(byteDirectBuffer);
    }

    private void writeByteDirect(int i)
    {
        writeByteDirect((byte)i);
    }

    private void writeFieldBeginInternal(TField tfield, byte byte0)
    {
        byte byte1 = byte0;
        if (byte0 == -1)
        {
            byte1 = getCompactType(tfield.type);
        }
        if (tfield.id > lastFieldId_ && tfield.id - lastFieldId_ <= 15)
        {
            writeByteDirect(tfield.id - lastFieldId_ << 4 | byte1);
        } else
        {
            writeByteDirect(byte1);
            writeI16(tfield.id);
        }
        lastFieldId_ = tfield.id;
    }

    private void writeVarint32(int i)
    {
        boolean flag = false;
        int j = i;
        i = ((flag) ? 1 : 0);
        do
        {
            if ((j & 0xffffff80) == 0)
            {
                i32buf[i] = (byte)j;
                trans_.write(i32buf, 0, i + 1);
                return;
            }
            i32buf[i] = (byte)(j & 0x7f | 0x80);
            j >>>= 7;
            i++;
        } while (true);
    }

    private void writeVarint64(long l)
    {
        int i = 0;
        do
        {
            if ((-128L & l) == 0L)
            {
                varint64out[i] = (byte)(int)l;
                trans_.write(varint64out, 0, i + 1);
                return;
            }
            varint64out[i] = (byte)(int)(127L & l | 128L);
            l >>>= 7;
            i++;
        } while (true);
    }

    private int zigzagToInt(int i)
    {
        return i >>> 1 ^ -(i & 1);
    }

    private long zigzagToLong(long l)
    {
        return l >>> 1 ^ -(1L & l);
    }

    public ByteBuffer readBinary()
    {
        int i = readVarint32();
        checkStringReadLength(i);
        if (i == 0)
        {
            return ByteBuffer.wrap(new byte[0]);
        }
        if (trans_.getBytesRemainingInBuffer() >= i)
        {
            ByteBuffer bytebuffer = ByteBuffer.wrap(trans_.getBuffer(), trans_.getBufferPosition(), i);
            trans_.consumeBuffer(i);
            return bytebuffer;
        } else
        {
            byte abyte0[] = new byte[i];
            trans_.readAll(abyte0, 0, i);
            return ByteBuffer.wrap(abyte0);
        }
    }

    public boolean readBool()
    {
        boolean flag = true;
        if (boolValue_ != null)
        {
            flag = boolValue_.booleanValue();
            boolValue_ = null;
        } else
        if (readByte() != 1)
        {
            return false;
        }
        return flag;
    }

    public byte readByte()
    {
        if (trans_.getBytesRemainingInBuffer() > 0)
        {
            byte byte0 = trans_.getBuffer()[trans_.getBufferPosition()];
            trans_.consumeBuffer(1);
            return byte0;
        } else
        {
            trans_.readAll(byteRawBuf, 0, 1);
            return byteRawBuf[0];
        }
    }

    public double readDouble()
    {
        byte abyte0[] = new byte[8];
        trans_.readAll(abyte0, 0, 8);
        return Double.longBitsToDouble(bytesToLong(abyte0));
    }

    public TField readFieldBegin()
    {
        byte byte0 = readByte();
        if (byte0 == 0)
        {
            return TSTOP;
        }
        short word1 = (short)((byte0 & 0xf0) >> 4);
        short word0;
        TField tfield;
        if (word1 == 0)
        {
            word0 = readI16();
        } else
        {
            word0 = (short)(word1 + lastFieldId_);
        }
        tfield = new TField("", getTType((byte)(byte0 & 0xf)), word0);
        if (isBoolType(byte0))
        {
            Boolean boolean1;
            if ((byte)(byte0 & 0xf) == 1)
            {
                boolean1 = Boolean.TRUE;
            } else
            {
                boolean1 = Boolean.FALSE;
            }
            boolValue_ = boolean1;
        }
        lastFieldId_ = tfield.id;
        return tfield;
    }

    public void readFieldEnd()
    {
    }

    public short readI16()
    {
        return (short)zigzagToInt(readVarint32());
    }

    public int readI32()
    {
        return zigzagToInt(readVarint32());
    }

    public long readI64()
    {
        return zigzagToLong(readVarint64());
    }

    public TList readListBegin()
    {
        byte byte0 = readByte();
        int j = byte0 >> 4 & 0xf;
        int i = j;
        if (j == 15)
        {
            i = readVarint32();
        }
        checkContainerReadLength(i);
        return new TList(getTType(byte0), i);
    }

    public void readListEnd()
    {
    }

    public TMap readMapBegin()
    {
        int j = readVarint32();
        checkContainerReadLength(j);
        int i;
        if (j == 0)
        {
            i = 0;
        } else
        {
            i = readByte();
        }
        return new TMap(getTType((byte)(i >> 4)), getTType((byte)(i & 0xf)), j);
    }

    public void readMapEnd()
    {
    }

    public TMessage readMessageBegin()
    {
        int i = readByte();
        if (i != -126)
        {
            throw new TProtocolException((new StringBuilder("Expected protocol id ")).append(Integer.toHexString(-126)).append(" but got ").append(Integer.toHexString(i)).toString());
        }
        i = readByte();
        byte byte1 = (byte)(i & 0x1f);
        if (byte1 != 1)
        {
            throw new TProtocolException((new StringBuilder("Expected version 1 but got ")).append(byte1).toString());
        } else
        {
            byte byte0 = (byte)(i >> 5 & 7);
            i = readVarint32();
            return new TMessage(readString(), byte0, i);
        }
    }

    public void readMessageEnd()
    {
    }

    public TSet readSetBegin()
    {
        return new TSet(readListBegin());
    }

    public void readSetEnd()
    {
    }

    public String readString()
    {
        int i;
        i = readVarint32();
        checkStringReadLength(i);
        if (i == 0)
        {
            return "";
        }
        String s;
        if (trans_.getBytesRemainingInBuffer() < i)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        s = new String(trans_.getBuffer(), trans_.getBufferPosition(), i, "UTF-8");
        trans_.consumeBuffer(i);
        UnsupportedEncodingException unsupportedencodingexception;
        return s;
        String s1;
        try
        {
            s1 = new String(readBinary(i), "UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            throw new TException("UTF-8 not supported!");
        }
        return s1;
    }

    public TStruct readStructBegin()
    {
        lastField_.push(lastFieldId_);
        lastFieldId_ = 0;
        return ANONYMOUS_STRUCT;
    }

    public void readStructEnd()
    {
        lastFieldId_ = lastField_.pop();
    }

    public void reset()
    {
        lastField_.clear();
        lastFieldId_ = 0;
    }

    public void writeBinary(ByteBuffer bytebuffer)
    {
        int i = bytebuffer.limit();
        int j = bytebuffer.position();
        writeBinary(bytebuffer.array(), bytebuffer.position() + bytebuffer.arrayOffset(), i - j);
    }

    public void writeBool(boolean flag)
    {
        boolean flag1 = true;
        byte byte0 = 1;
        if (booleanField_ != null)
        {
            TField tfield = booleanField_;
            if (!flag)
            {
                byte0 = 2;
            }
            writeFieldBeginInternal(tfield, byte0);
            booleanField_ = null;
            return;
        }
        if (flag)
        {
            byte0 = flag1;
        } else
        {
            byte0 = 2;
        }
        writeByteDirect(byte0);
    }

    public void writeByte(byte byte0)
    {
        writeByteDirect(byte0);
    }

    protected void writeCollectionBegin(byte byte0, int i)
    {
        if (i <= 14)
        {
            writeByteDirect(i << 4 | getCompactType(byte0));
            return;
        } else
        {
            writeByteDirect(getCompactType(byte0) | 0xf0);
            writeVarint32(i);
            return;
        }
    }

    public void writeDouble(double d)
    {
        byte abyte0[] = new byte[8];
        byte[] _tmp = abyte0;
        abyte0[0] = 0;
        abyte0[1] = 0;
        abyte0[2] = 0;
        abyte0[3] = 0;
        abyte0[4] = 0;
        abyte0[5] = 0;
        abyte0[6] = 0;
        abyte0[7] = 0;
        fixedLongToBytes(Double.doubleToLongBits(d), abyte0, 0);
        trans_.write(abyte0);
    }

    public void writeFieldBegin(TField tfield)
    {
        if (tfield.type == 2)
        {
            booleanField_ = tfield;
            return;
        } else
        {
            writeFieldBeginInternal(tfield, (byte)-1);
            return;
        }
    }

    public void writeFieldEnd()
    {
    }

    public void writeFieldStop()
    {
        writeByteDirect((byte)0);
    }

    public void writeI16(short word0)
    {
        writeVarint32(intToZigZag(word0));
    }

    public void writeI32(int i)
    {
        writeVarint32(intToZigZag(i));
    }

    public void writeI64(long l)
    {
        writeVarint64(longToZigzag(l));
    }

    public void writeListBegin(TList tlist)
    {
        writeCollectionBegin(tlist.elemType, tlist.size);
    }

    public void writeListEnd()
    {
    }

    public void writeMapBegin(TMap tmap)
    {
        if (tmap.size == 0)
        {
            writeByteDirect(0);
            return;
        } else
        {
            writeVarint32(tmap.size);
            writeByteDirect(getCompactType(tmap.keyType) << 4 | getCompactType(tmap.valueType));
            return;
        }
    }

    public void writeMapEnd()
    {
    }

    public void writeMessageBegin(TMessage tmessage)
    {
        writeByteDirect((byte)-126);
        writeByteDirect(tmessage.type << 5 & 0xffffffe0 | 1);
        writeVarint32(tmessage.seqid);
        writeString(tmessage.name);
    }

    public void writeMessageEnd()
    {
    }

    public void writeSetBegin(TSet tset)
    {
        writeCollectionBegin(tset.elemType, tset.size);
    }

    public void writeSetEnd()
    {
    }

    public void writeString(String s)
    {
        try
        {
            s = s.getBytes("UTF-8");
            writeBinary(s, 0, s.length);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new TException("UTF-8 not supported!");
        }
    }

    public void writeStructBegin(TStruct tstruct)
    {
        lastField_.push(lastFieldId_);
        lastFieldId_ = 0;
    }

    public void writeStructEnd()
    {
        lastFieldId_ = lastField_.pop();
    }

    static 
    {
        byte abyte0[] = new byte[16];
        ttypeToCompactType = abyte0;
        abyte0[0] = 0;
        ttypeToCompactType[2] = 1;
        ttypeToCompactType[3] = 3;
        ttypeToCompactType[6] = 4;
        ttypeToCompactType[8] = 5;
        ttypeToCompactType[10] = 6;
        ttypeToCompactType[4] = 7;
        ttypeToCompactType[11] = 8;
        ttypeToCompactType[15] = 9;
        ttypeToCompactType[14] = 10;
        ttypeToCompactType[13] = 11;
        ttypeToCompactType[12] = 12;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package okio;

import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package okio:
//            BufferedSink, BufferedSource, Segment, Util, 
//            ByteString, SegmentPool, Sink, SegmentedByteString, 
//            Timeout, Source

public final class Buffer
    implements Cloneable, BufferedSink, BufferedSource
{

    private static final byte DIGITS[] = {
        48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 
        97, 98, 99, 100, 101, 102
    };
    Segment head;
    long size;

    public Buffer()
    {
    }

    private void readFrom(InputStream inputstream, long l, boolean flag)
    {
        if (inputstream == null)
        {
            throw new IllegalArgumentException("in == null");
        }
          goto _L1
_L3:
        Segment segment;
        int i;
        segment.limit = segment.limit + i;
        size = size + (long)i;
        l -= i;
_L1:
label0:
        {
            if (l <= 0L && !flag)
            {
                break; /* Loop/switch isn't completed */
            }
            segment = writableSegment(1);
            i = (int)Math.min(l, 2048 - segment.limit);
            i = inputstream.read(segment.data, segment.limit, i);
            if (i != -1)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (!flag)
            {
                break label0;
            }
            break; /* Loop/switch isn't completed */
        }
        if (true) goto _L3; else goto _L2
_L2:
        return;
        throw new EOFException();
    }

    public Buffer buffer()
    {
        return this;
    }

    public void clear()
    {
        try
        {
            skip(size);
            return;
        }
        catch (EOFException eofexception)
        {
            throw new AssertionError(eofexception);
        }
    }

    public volatile Object clone()
    {
        return clone();
    }

    public Buffer clone()
    {
        Buffer buffer1 = new Buffer();
        if (size == 0L)
        {
            return buffer1;
        }
        buffer1.head = new Segment(head);
        Segment segment = buffer1.head;
        Segment segment2 = buffer1.head;
        Segment segment3 = buffer1.head;
        segment2.prev = segment3;
        segment.next = segment3;
        for (Segment segment1 = head.next; segment1 != head; segment1 = segment1.next)
        {
            buffer1.head.prev.push(new Segment(segment1));
        }

        buffer1.size = size;
        return buffer1;
    }

    public void close()
    {
    }

    public long completeSegmentByteCount()
    {
        long l1 = size;
        long l;
        if (l1 == 0L)
        {
            l = 0L;
        } else
        {
            Segment segment = head.prev;
            l = l1;
            if (segment.limit < 2048)
            {
                l = l1;
                if (segment.owner)
                {
                    return l1 - (long)(segment.limit - segment.pos);
                }
            }
        }
        return l;
    }

    public Buffer copyTo(OutputStream outputstream)
    {
        return copyTo(outputstream, 0L, size);
    }

    public Buffer copyTo(OutputStream outputstream, long l, long l1)
    {
        if (outputstream == null)
        {
            throw new IllegalArgumentException("out == null");
        }
        Util.checkOffsetAndCount(size, l, l1);
        if (l1 != 0L)
        {
            Segment segment = head;
            Segment segment1;
            long l2;
            long l3;
            do
            {
                segment1 = segment;
                l2 = l;
                l3 = l1;
                if (l < (long)(segment.limit - segment.pos))
                {
                    break;
                }
                l -= segment.limit - segment.pos;
                segment = segment.next;
            } while (true);
            while (l3 > 0L) 
            {
                int i = (int)((long)segment1.pos + l2);
                int j = (int)Math.min(segment1.limit - i, l3);
                outputstream.write(segment1.data, i, j);
                l3 -= j;
                segment1 = segment1.next;
                l2 = 0L;
            }
        }
        return this;
    }

    public Buffer copyTo(Buffer buffer1, long l, long l1)
    {
        if (buffer1 == null)
        {
            throw new IllegalArgumentException("out == null");
        }
        Util.checkOffsetAndCount(size, l, l1);
        if (l1 != 0L)
        {
            buffer1.size = buffer1.size + l1;
            Segment segment = head;
            Segment segment2;
            long l2;
            long l3;
            do
            {
                segment2 = segment;
                l2 = l;
                l3 = l1;
                if (l < (long)(segment.limit - segment.pos))
                {
                    break;
                }
                l -= segment.limit - segment.pos;
                segment = segment.next;
            } while (true);
            while (l3 > 0L) 
            {
                Segment segment1 = new Segment(segment2);
                segment1.pos = (int)((long)segment1.pos + l2);
                segment1.limit = Math.min(segment1.pos + (int)l3, segment1.limit);
                if (buffer1.head == null)
                {
                    segment1.prev = segment1;
                    segment1.next = segment1;
                    buffer1.head = segment1;
                } else
                {
                    buffer1.head.prev.push(segment1);
                }
                l3 -= segment1.limit - segment1.pos;
                segment2 = segment2.next;
                l2 = 0L;
            }
        }
        return this;
    }

    public BufferedSink emit()
    {
        return this;
    }

    public Buffer emitCompleteSegments()
    {
        return this;
    }

    public volatile BufferedSink emitCompleteSegments()
    {
        return emitCompleteSegments();
    }

    public boolean equals(Object obj)
    {
        long l1 = 0L;
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof Buffer))
        {
            return false;
        }
        obj = (Buffer)obj;
        if (size != ((Buffer) (obj)).size)
        {
            return false;
        }
        if (size == 0L)
        {
            return true;
        }
        Object obj1 = head;
        obj = ((Buffer) (obj)).head;
        int j = ((Segment) (obj1)).pos;
        int i = ((Segment) (obj)).pos;
        while (l1 < size) 
        {
            long l2 = Math.min(((Segment) (obj1)).limit - j, ((Segment) (obj)).limit - i);
            for (int k = 0; (long)k < l2;)
            {
                if (((Segment) (obj1)).data[j] != ((Segment) (obj)).data[i])
                {
                    return false;
                }
                k++;
                i++;
                j++;
            }

            int l = j;
            Segment segment = ((Segment) (obj1));
            if (j == ((Segment) (obj1)).limit)
            {
                segment = ((Segment) (obj1)).next;
                l = segment.pos;
            }
            j = i;
            obj1 = obj;
            if (i == ((Segment) (obj)).limit)
            {
                obj1 = ((Segment) (obj)).next;
                j = ((Segment) (obj1)).pos;
            }
            l1 += l2;
            i = j;
            j = l;
            obj = obj1;
            obj1 = segment;
        }
        return true;
    }

    public boolean exhausted()
    {
        return size == 0L;
    }

    public void flush()
    {
    }

    public byte getByte(long l)
    {
        Util.checkOffsetAndCount(size, l, 1L);
        Segment segment = head;
        do
        {
            int i = segment.limit - segment.pos;
            if (l < (long)i)
            {
                return segment.data[segment.pos + (int)l];
            }
            l -= i;
            segment = segment.next;
        } while (true);
    }

    public int hashCode()
    {
        Segment segment = head;
        if (segment == null)
        {
            return 0;
        }
        int j = 1;
        Segment segment1;
        int i;
        do
        {
            int k = segment.pos;
            int l = segment.limit;
            for (i = j; k < l; i = j + i * 31)
            {
                j = segment.data[k];
                k++;
            }

            segment1 = segment.next;
            j = i;
            segment = segment1;
        } while (segment1 != head);
        return i;
    }

    public long indexOf(byte byte0)
    {
        return indexOf(byte0, 0L);
    }

    public long indexOf(byte byte0, long l)
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException("fromIndex < 0");
        }
        Segment segment = head;
        if (segment == null)
        {
            return -1L;
        }
        long l1 = 0L;
        do
        {
            int i = segment.limit - segment.pos;
            Segment segment1;
            if (l >= (long)i)
            {
                l -= i;
            } else
            {
                byte abyte0[] = segment.data;
                l = (long)segment.pos + l;
                for (long l2 = segment.limit; l < l2; l++)
                {
                    if (abyte0[(int)l] == byte0)
                    {
                        return (l1 + l) - (long)segment.pos;
                    }
                }

                l = 0L;
            }
            l1 += i;
            segment1 = segment.next;
            segment = segment1;
        } while (segment1 != head);
        return -1L;
    }

    public long indexOfElement(ByteString bytestring)
    {
        return indexOfElement(bytestring, 0L);
    }

    public long indexOfElement(ByteString bytestring, long l)
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException("fromIndex < 0");
        }
        Segment segment = head;
        if (segment == null)
        {
            return -1L;
        }
        long l1 = 0L;
        byte abyte1[] = bytestring.toByteArray();
        bytestring = segment;
        do
        {
            int j = ((Segment) (bytestring)).limit - ((Segment) (bytestring)).pos;
            Segment segment1;
            if (l >= (long)j)
            {
                l -= j;
            } else
            {
                byte abyte0[] = ((Segment) (bytestring)).data;
                l = (long)((Segment) (bytestring)).pos + l;
                for (long l2 = ((Segment) (bytestring)).limit; l < l2; l++)
                {
                    byte byte0 = abyte0[(int)l];
                    int k = abyte1.length;
                    for (int i = 0; i < k; i++)
                    {
                        if (byte0 == abyte1[i])
                        {
                            return (l1 + l) - (long)((Segment) (bytestring)).pos;
                        }
                    }

                }

                l = 0L;
            }
            l1 += j;
            segment1 = ((Segment) (bytestring)).next;
            bytestring = segment1;
        } while (segment1 != head);
        return -1L;
    }

    public InputStream inputStream()
    {
        return new InputStream() {

            final Buffer this$0;

            public int available()
            {
                return (int)Math.min(size, 0x7fffffffL);
            }

            public void close()
            {
            }

            public int read()
            {
                if (size > 0L)
                {
                    return readByte() & 0xff;
                } else
                {
                    return -1;
                }
            }

            public int read(byte abyte0[], int i, int j)
            {
                return Buffer.this.read(abyte0, i, j);
            }

            public String toString()
            {
                return (new StringBuilder()).append(Buffer.this).append(".inputStream()").toString();
            }

            
            {
                this$0 = Buffer.this;
                super();
            }
        };
    }

    public OutputStream outputStream()
    {
        return new OutputStream() {

            final Buffer this$0;

            public void close()
            {
            }

            public void flush()
            {
            }

            public String toString()
            {
                return (new StringBuilder()).append(this).append(".outputStream()").toString();
            }

            public void write(int i)
            {
                writeByte((byte)i);
            }

            public void write(byte abyte0[], int i, int j)
            {
                Buffer.this.write(abyte0, i, j);
            }

            
            {
                this$0 = Buffer.this;
                super();
            }
        };
    }

    public int read(byte abyte0[])
    {
        return read(abyte0, 0, abyte0.length);
    }

    public int read(byte abyte0[], int i, int j)
    {
        Util.checkOffsetAndCount(abyte0.length, i, j);
        Segment segment = head;
        if (segment == null)
        {
            i = -1;
        } else
        {
            j = Math.min(j, segment.limit - segment.pos);
            System.arraycopy(segment.data, segment.pos, abyte0, i, j);
            segment.pos = segment.pos + j;
            size = size - (long)j;
            i = j;
            if (segment.pos == segment.limit)
            {
                head = segment.pop();
                SegmentPool.recycle(segment);
                return j;
            }
        }
        return i;
    }

    public long read(Buffer buffer1, long l)
    {
        if (buffer1 == null)
        {
            throw new IllegalArgumentException("sink == null");
        }
        if (l < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("byteCount < 0: ").append(l).toString());
        }
        if (size == 0L)
        {
            return -1L;
        }
        long l1 = l;
        if (l > size)
        {
            l1 = size;
        }
        buffer1.write(this, l1);
        return l1;
    }

    public long readAll(Sink sink)
    {
        long l = size;
        if (l > 0L)
        {
            sink.write(this, l);
        }
        return l;
    }

    public byte readByte()
    {
        if (size == 0L)
        {
            throw new IllegalStateException("size == 0");
        }
        Segment segment = head;
        int i = segment.pos;
        int j = segment.limit;
        byte abyte0[] = segment.data;
        int k = i + 1;
        byte byte0 = abyte0[i];
        size = size - 1L;
        if (k == j)
        {
            head = segment.pop();
            SegmentPool.recycle(segment);
            return byte0;
        } else
        {
            segment.pos = k;
            return byte0;
        }
    }

    public byte[] readByteArray()
    {
        byte abyte0[];
        try
        {
            abyte0 = readByteArray(size);
        }
        catch (EOFException eofexception)
        {
            throw new AssertionError(eofexception);
        }
        return abyte0;
    }

    public byte[] readByteArray(long l)
    {
        Util.checkOffsetAndCount(size, 0L, l);
        if (l > 0x7fffffffL)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("byteCount > Integer.MAX_VALUE: ").append(l).toString());
        } else
        {
            byte abyte0[] = new byte[(int)l];
            readFully(abyte0);
            return abyte0;
        }
    }

    public ByteString readByteString()
    {
        return new ByteString(readByteArray());
    }

    public ByteString readByteString(long l)
    {
        return new ByteString(readByteArray(l));
    }

    public long readDecimalLong()
    {
        byte byte0;
        int k;
        int l;
        long l2;
        long l3;
        if (size == 0L)
        {
            throw new IllegalStateException("size == 0");
        }
        l2 = 0L;
        k = 0;
        l = 0;
        byte0 = 0;
        l3 = -7L;
_L6:
        Object obj;
        byte abyte0[];
        int i;
        boolean flag;
        int j;
        int i1;
        long l1;
        obj = head;
        abyte0 = ((Segment) (obj)).data;
        j = ((Segment) (obj)).pos;
        i1 = ((Segment) (obj)).limit;
        l1 = l2;
        i = k;
        flag = l;
        l2 = l3;
_L2:
        k = byte0;
        if (j >= i1)
        {
            break MISSING_BLOCK_LABEL_287;
        }
        k = abyte0[j];
        if (k < 48 || k > 57)
        {
            break; /* Loop/switch isn't completed */
        }
        l = 48 - k;
        if (l1 < 0xf333333333333334L || l1 == 0xf333333333333334L && (long)l < l2)
        {
            obj = (new Buffer()).writeDecimalLong(l1).writeByte(k);
            if (!flag)
            {
                ((Buffer) (obj)).readByte();
            }
            throw new NumberFormatException((new StringBuilder()).append("Number too large: ").append(((Buffer) (obj)).readUtf8()).toString());
        }
        l1 = l1 * 10L + (long)l;
_L3:
        j++;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
label0:
        {
            if (k != 45 || i != 0)
            {
                break label0;
            }
            flag = true;
            l2--;
        }
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
        if (i == 0)
        {
            throw new NumberFormatException((new StringBuilder()).append("Expected leading [0-9] or '-' character but was 0x").append(Integer.toHexString(k)).toString());
        }
        k = 1;
        if (j == i1)
        {
            head = ((Segment) (obj)).pop();
            SegmentPool.recycle(((Segment) (obj)));
        } else
        {
            obj.pos = j;
        }
        if (k != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        l3 = l2;
        byte0 = k;
        l = ((flag) ? 1 : 0);
        k = i;
        l2 = l1;
        if (head != null) goto _L6; else goto _L5
_L5:
        size = size - (long)i;
        if (flag)
        {
            return l1;
        } else
        {
            return -l1;
        }
    }

    public Buffer readFrom(InputStream inputstream)
    {
        readFrom(inputstream, 0x7fffffffffffffffL, true);
        return this;
    }

    public Buffer readFrom(InputStream inputstream, long l)
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("byteCount < 0: ").append(l).toString());
        } else
        {
            readFrom(inputstream, l, false);
            return this;
        }
    }

    public void readFully(Buffer buffer1, long l)
    {
        if (size < l)
        {
            buffer1.write(this, size);
            throw new EOFException();
        } else
        {
            buffer1.write(this, l);
            return;
        }
    }

    public void readFully(byte abyte0[])
    {
        int j;
        for (int i = 0; i < abyte0.length; i += j)
        {
            j = read(abyte0, i, abyte0.length - i);
            if (j == -1)
            {
                throw new EOFException();
            }
        }

    }

    public long readHexadecimalUnsignedLong()
    {
        int i;
        int j;
        long l2;
        if (size == 0L)
        {
            throw new IllegalStateException("size == 0");
        }
        l2 = 0L;
        i = 0;
        j = 0;
_L6:
        Object obj;
        byte abyte0[];
        int k;
        int l;
        int i1;
        long l1;
        obj = head;
        abyte0 = ((Segment) (obj)).data;
        l = ((Segment) (obj)).pos;
        i1 = ((Segment) (obj)).limit;
        l1 = l2;
        k = i;
_L7:
        byte byte0;
        i = j;
        if (l >= i1)
        {
            break MISSING_BLOCK_LABEL_243;
        }
        byte0 = abyte0[l];
        if (byte0 < 48 || byte0 > 57) goto _L2; else goto _L1
_L1:
        i = byte0 - 48;
_L4:
        if ((0xf000000000000000L & l1) != 0L)
        {
            obj = (new Buffer()).writeHexadecimalUnsignedLong(l1).writeByte(byte0);
            throw new NumberFormatException((new StringBuilder()).append("Number too large: ").append(((Buffer) (obj)).readUtf8()).toString());
        }
        break MISSING_BLOCK_LABEL_298;
_L2:
        if (byte0 >= 97 && byte0 <= 102)
        {
            i = (byte0 - 97) + 10;
            continue; /* Loop/switch isn't completed */
        }
        if (byte0 < 65 || byte0 > 70)
        {
            break; /* Loop/switch isn't completed */
        }
        i = (byte0 - 65) + 10;
        if (true) goto _L4; else goto _L3
_L3:
        if (k == 0)
        {
            throw new NumberFormatException((new StringBuilder()).append("Expected leading [0-9a-fA-F] character but was 0x").append(Integer.toHexString(byte0)).toString());
        }
        i = 1;
        if (l == i1)
        {
            head = ((Segment) (obj)).pop();
            SegmentPool.recycle(((Segment) (obj)));
        } else
        {
            obj.pos = l;
        }
        if (i != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        j = i;
        i = k;
        l2 = l1;
        if (head != null) goto _L6; else goto _L5
_L5:
        size = size - (long)k;
        return l1;
        l2 = i;
        k++;
        l++;
        l1 = l2 | l1 << 4;
          goto _L7
    }

    public int readInt()
    {
        if (size < 4L)
        {
            throw new IllegalStateException((new StringBuilder()).append("size < 4: ").append(size).toString());
        }
        Segment segment = head;
        int j = segment.pos;
        int i = segment.limit;
        if (i - j < 4)
        {
            return (readByte() & 0xff) << 24 | (readByte() & 0xff) << 16 | (readByte() & 0xff) << 8 | readByte() & 0xff;
        }
        byte abyte0[] = segment.data;
        int k = j + 1;
        j = abyte0[j];
        int i1 = k + 1;
        k = abyte0[k];
        int l = i1 + 1;
        byte byte0 = abyte0[i1];
        i1 = l + 1;
        j = (j & 0xff) << 24 | (k & 0xff) << 16 | (byte0 & 0xff) << 8 | abyte0[l] & 0xff;
        size = size - 4L;
        if (i1 == i)
        {
            head = segment.pop();
            SegmentPool.recycle(segment);
            return j;
        } else
        {
            segment.pos = i1;
            return j;
        }
    }

    public int readIntLe()
    {
        return Util.reverseBytesInt(readInt());
    }

    public long readLong()
    {
        if (size < 8L)
        {
            throw new IllegalStateException((new StringBuilder()).append("size < 8: ").append(size).toString());
        }
        Segment segment = head;
        int k = segment.pos;
        int i = segment.limit;
        if (i - k < 8)
        {
            return ((long)readInt() & 0xffffffffL) << 32 | (long)readInt() & 0xffffffffL;
        }
        byte abyte0[] = segment.data;
        int j = k + 1;
        long l = abyte0[k];
        k = j + 1;
        long l1 = abyte0[j];
        j = k + 1;
        long l2 = abyte0[k];
        k = j + 1;
        long l3 = abyte0[j];
        j = k + 1;
        long l4 = abyte0[k];
        k = j + 1;
        long l5 = abyte0[j];
        j = k + 1;
        long l6 = abyte0[k];
        k = j + 1;
        l = (long)abyte0[j] & 255L | ((l1 & 255L) << 48 | (l & 255L) << 56 | (l2 & 255L) << 40 | (l3 & 255L) << 32 | (l4 & 255L) << 24 | (l5 & 255L) << 16 | (l6 & 255L) << 8);
        size = size - 8L;
        if (k == i)
        {
            head = segment.pop();
            SegmentPool.recycle(segment);
            return l;
        } else
        {
            segment.pos = k;
            return l;
        }
    }

    public long readLongLe()
    {
        return Util.reverseBytesLong(readLong());
    }

    public short readShort()
    {
        if (size < 2L)
        {
            throw new IllegalStateException((new StringBuilder()).append("size < 2: ").append(size).toString());
        }
        Segment segment = head;
        int k = segment.pos;
        int i = segment.limit;
        if (i - k < 2)
        {
            return (short)((readByte() & 0xff) << 8 | readByte() & 0xff);
        }
        byte abyte0[] = segment.data;
        int j = k + 1;
        k = abyte0[k];
        int l = j + 1;
        j = abyte0[j];
        size = size - 2L;
        if (l == i)
        {
            head = segment.pop();
            SegmentPool.recycle(segment);
        } else
        {
            segment.pos = l;
        }
        return (short)((k & 0xff) << 8 | j & 0xff);
    }

    public short readShortLe()
    {
        return Util.reverseBytesShort(readShort());
    }

    public String readString(long l, Charset charset)
    {
        Util.checkOffsetAndCount(size, 0L, l);
        if (charset == null)
        {
            throw new IllegalArgumentException("charset == null");
        }
        if (l > 0x7fffffffL)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("byteCount > Integer.MAX_VALUE: ").append(l).toString());
        }
        if (l == 0L)
        {
            charset = "";
        } else
        {
            Segment segment = head;
            if ((long)segment.pos + l > (long)segment.limit)
            {
                return new String(readByteArray(l), charset);
            }
            String s = new String(segment.data, segment.pos, (int)l, charset);
            segment.pos = (int)((long)segment.pos + l);
            size = size - l;
            charset = s;
            if (segment.pos == segment.limit)
            {
                head = segment.pop();
                SegmentPool.recycle(segment);
                return s;
            }
        }
        return charset;
    }

    public String readString(Charset charset)
    {
        try
        {
            charset = readString(size, charset);
        }
        // Misplaced declaration of an exception variable
        catch (Charset charset)
        {
            throw new AssertionError(charset);
        }
        return charset;
    }

    public String readUtf8()
    {
        String s;
        try
        {
            s = readString(size, Util.UTF_8);
        }
        catch (EOFException eofexception)
        {
            throw new AssertionError(eofexception);
        }
        return s;
    }

    public String readUtf8(long l)
    {
        return readString(l, Util.UTF_8);
    }

    public String readUtf8Line()
    {
        long l = indexOf((byte)10);
        if (l == -1L)
        {
            if (size != 0L)
            {
                return readUtf8(size);
            } else
            {
                return null;
            }
        } else
        {
            return readUtf8Line(l);
        }
    }

    String readUtf8Line(long l)
    {
        if (l > 0L && getByte(l - 1L) == 13)
        {
            String s = readUtf8(l - 1L);
            skip(2L);
            return s;
        } else
        {
            String s1 = readUtf8(l);
            skip(1L);
            return s1;
        }
    }

    public String readUtf8LineStrict()
    {
        long l = indexOf((byte)10);
        if (l == -1L)
        {
            Buffer buffer1 = new Buffer();
            copyTo(buffer1, 0L, Math.min(32L, size));
            throw new EOFException((new StringBuilder()).append("\\n not found: size=").append(size()).append(" content=").append(buffer1.readByteString().hex()).append("...").toString());
        } else
        {
            return readUtf8Line(l);
        }
    }

    public boolean request(long l)
    {
        return size >= l;
    }

    public void require(long l)
    {
        if (size < l)
        {
            throw new EOFException();
        } else
        {
            return;
        }
    }

    List segmentSizes()
    {
        if (head == null)
        {
            return Collections.emptyList();
        }
        ArrayList arraylist = new ArrayList();
        arraylist.add(Integer.valueOf(head.limit - head.pos));
        for (Segment segment = head.next; segment != head; segment = segment.next)
        {
            arraylist.add(Integer.valueOf(segment.limit - segment.pos));
        }

        return arraylist;
    }

    public long size()
    {
        return size;
    }

    public void skip(long l)
    {
        do
        {
            if (l <= 0L)
            {
                break;
            }
            if (head == null)
            {
                throw new EOFException();
            }
            int i = (int)Math.min(l, head.limit - head.pos);
            size = size - (long)i;
            long l1 = l - (long)i;
            Segment segment = head;
            segment.pos = i + segment.pos;
            l = l1;
            if (head.pos == head.limit)
            {
                Segment segment1 = head;
                head = segment1.pop();
                SegmentPool.recycle(segment1);
                l = l1;
            }
        } while (true);
    }

    public ByteString snapshot()
    {
        if (size > 0x7fffffffL)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("size > Integer.MAX_VALUE: ").append(size).toString());
        } else
        {
            return snapshot((int)size);
        }
    }

    public ByteString snapshot(int i)
    {
        if (i == 0)
        {
            return ByteString.EMPTY;
        } else
        {
            return new SegmentedByteString(this, i);
        }
    }

    public Timeout timeout()
    {
        return Timeout.NONE;
    }

    public String toString()
    {
        if (size == 0L)
        {
            return "Buffer[size=0]";
        }
        if (size <= 16L)
        {
            ByteString bytestring = clone().readByteString();
            return String.format("Buffer[size=%s data=%s]", new Object[] {
                Long.valueOf(size), bytestring.hex()
            });
        }
        String s;
        MessageDigest messagedigest;
        try
        {
            messagedigest = MessageDigest.getInstance("MD5");
            messagedigest.update(head.data, head.pos, head.limit - head.pos);
            for (Segment segment = head.next; segment != head; segment = segment.next)
            {
                messagedigest.update(segment.data, segment.pos, segment.limit - segment.pos);
            }

        }
        catch (NoSuchAlgorithmException nosuchalgorithmexception)
        {
            throw new AssertionError();
        }
        s = String.format("Buffer[size=%s md5=%s]", new Object[] {
            Long.valueOf(size), ByteString.of(messagedigest.digest()).hex()
        });
        return s;
    }

    Segment writableSegment(int i)
    {
        if (i < 1 || i > 2048)
        {
            throw new IllegalArgumentException();
        }
        if (head != null) goto _L2; else goto _L1
_L1:
        Segment segment;
        head = SegmentPool.take();
        Segment segment1 = head;
        Segment segment3 = head;
        segment = head;
        segment3.prev = segment;
        segment1.next = segment;
_L4:
        return segment;
_L2:
        Segment segment2;
        segment2 = head.prev;
        if (segment2.limit + i > 2048)
        {
            break; /* Loop/switch isn't completed */
        }
        segment = segment2;
        if (segment2.owner) goto _L4; else goto _L3
_L3:
        return segment2.push(SegmentPool.take());
    }

    public Buffer write(ByteString bytestring)
    {
        if (bytestring == null)
        {
            throw new IllegalArgumentException("byteString == null");
        } else
        {
            bytestring.write(this);
            return this;
        }
    }

    public Buffer write(byte abyte0[])
    {
        if (abyte0 == null)
        {
            throw new IllegalArgumentException("source == null");
        } else
        {
            return write(abyte0, 0, abyte0.length);
        }
    }

    public Buffer write(byte abyte0[], int i, int j)
    {
        if (abyte0 == null)
        {
            throw new IllegalArgumentException("source == null");
        }
        Util.checkOffsetAndCount(abyte0.length, i, j);
        for (int k = i + j; i < k;)
        {
            Segment segment = writableSegment(1);
            int l = Math.min(k - i, 2048 - segment.limit);
            System.arraycopy(abyte0, i, segment.data, segment.limit, l);
            i += l;
            segment.limit = l + segment.limit;
        }

        size = size + (long)j;
        return this;
    }

    public volatile BufferedSink write(ByteString bytestring)
    {
        return write(bytestring);
    }

    public BufferedSink write(Source source, long l)
    {
        long l1;
        for (; l > 0L; l -= l1)
        {
            l1 = source.read(this, l);
            if (l1 == -1L)
            {
                throw new EOFException();
            }
        }

        return this;
    }

    public volatile BufferedSink write(byte abyte0[])
    {
        return write(abyte0);
    }

    public volatile BufferedSink write(byte abyte0[], int i, int j)
    {
        return write(abyte0, i, j);
    }

    public void write(Buffer buffer1, long l)
    {
        if (buffer1 == null)
        {
            throw new IllegalArgumentException("source == null");
        }
        if (buffer1 == this)
        {
            throw new IllegalArgumentException("source == this");
        }
        Util.checkOffsetAndCount(buffer1.size, 0L, l);
        do
        {
label0:
            {
label1:
                {
                    if (l > 0L)
                    {
                        if (l >= (long)(buffer1.head.limit - buffer1.head.pos))
                        {
                            break label0;
                        }
                        Segment segment;
                        int i;
                        long l1;
                        if (head != null)
                        {
                            segment = head.prev;
                        } else
                        {
                            segment = null;
                        }
                        if (segment == null || !segment.owner)
                        {
                            break label1;
                        }
                        l1 = segment.limit;
                        if (segment.shared)
                        {
                            i = 0;
                        } else
                        {
                            i = segment.pos;
                        }
                        if ((l1 + l) - (long)i > 2048L)
                        {
                            break label1;
                        }
                        buffer1.head.writeTo(segment, (int)l);
                        buffer1.size = buffer1.size - l;
                        size = size + l;
                    }
                    return;
                }
                buffer1.head = buffer1.head.split((int)l);
            }
            Segment segment1 = buffer1.head;
            long l2 = segment1.limit - segment1.pos;
            buffer1.head = segment1.pop();
            if (head == null)
            {
                head = segment1;
                segment1 = head;
                Segment segment2 = head;
                Segment segment3 = head;
                segment2.prev = segment3;
                segment1.next = segment3;
            } else
            {
                head.prev.push(segment1).compact();
            }
            buffer1.size = buffer1.size - l2;
            size = size + l2;
            l -= l2;
        } while (true);
    }

    public long writeAll(Source source)
    {
        if (source == null)
        {
            throw new IllegalArgumentException("source == null");
        }
        long l = 0L;
        do
        {
            long l1 = source.read(this, 2048L);
            if (l1 != -1L)
            {
                l += l1;
            } else
            {
                return l;
            }
        } while (true);
    }

    public Buffer writeByte(int i)
    {
        Segment segment = writableSegment(1);
        byte abyte0[] = segment.data;
        int j = segment.limit;
        segment.limit = j + 1;
        abyte0[j] = (byte)i;
        size = size + 1L;
        return this;
    }

    public volatile BufferedSink writeByte(int i)
    {
        return writeByte(i);
    }

    public Buffer writeDecimalLong(long l)
    {
        if (l == 0L)
        {
            return writeByte(48);
        }
        Segment segment;
        byte abyte0[];
        int i;
        boolean flag;
        int j;
        if (l < 0L)
        {
            l = -l;
            if (l < 0L)
            {
                return writeUtf8("-9223372036854775808");
            }
            flag = true;
        } else
        {
            flag = false;
        }
        if (l < 0x5f5e100L)
        {
            if (l < 10000L)
            {
                if (l < 100L)
                {
                    if (l < 10L)
                    {
                        i = 1;
                    } else
                    {
                        i = 2;
                    }
                } else
                if (l < 1000L)
                {
                    i = 3;
                } else
                {
                    i = 4;
                }
            } else
            if (l < 0xf4240L)
            {
                if (l < 0x186a0L)
                {
                    i = 5;
                } else
                {
                    i = 6;
                }
            } else
            if (l < 0x989680L)
            {
                i = 7;
            } else
            {
                i = 8;
            }
        } else
        if (l < 0xe8d4a51000L)
        {
            if (l < 0x2540be400L)
            {
                if (l < 0x3b9aca00L)
                {
                    i = 9;
                } else
                {
                    i = 10;
                }
            } else
            if (l < 0x174876e800L)
            {
                i = 11;
            } else
            {
                i = 12;
            }
        } else
        if (l < 0x38d7ea4c68000L)
        {
            if (l < 0x9184e72a000L)
            {
                i = 13;
            } else
            if (l < 0x5af3107a4000L)
            {
                i = 14;
            } else
            {
                i = 15;
            }
        } else
        if (l < 0x16345785d8a0000L)
        {
            if (l < 0x2386f26fc10000L)
            {
                i = 16;
            } else
            {
                i = 17;
            }
        } else
        if (l < 0xde0b6b3a7640000L)
        {
            i = 18;
        } else
        {
            i = 19;
        }
        j = i;
        if (flag)
        {
            j = i + 1;
        }
        segment = writableSegment(j);
        abyte0 = segment.data;
        i = segment.limit + j;
        for (; l != 0L; l /= 10L)
        {
            int k = (int)(l % 10L);
            i--;
            abyte0[i] = DIGITS[k];
        }

        if (flag)
        {
            abyte0[i - 1] = 45;
        }
        segment.limit = segment.limit + j;
        l = size;
        size = (long)j + l;
        return this;
    }

    public volatile BufferedSink writeDecimalLong(long l)
    {
        return writeDecimalLong(l);
    }

    public Buffer writeHexadecimalUnsignedLong(long l)
    {
        if (l == 0L)
        {
            return writeByte(48);
        }
        int j = Long.numberOfTrailingZeros(Long.highestOneBit(l)) / 4 + 1;
        Segment segment = writableSegment(j);
        byte abyte0[] = segment.data;
        int i = (segment.limit + j) - 1;
        for (int k = segment.limit; i >= k; i--)
        {
            abyte0[i] = DIGITS[(int)(15L & l)];
            l >>>= 4;
        }

        segment.limit = segment.limit + j;
        l = size;
        size = (long)j + l;
        return this;
    }

    public volatile BufferedSink writeHexadecimalUnsignedLong(long l)
    {
        return writeHexadecimalUnsignedLong(l);
    }

    public Buffer writeInt(int i)
    {
        Segment segment = writableSegment(4);
        byte abyte0[] = segment.data;
        int k = segment.limit;
        int j = k + 1;
        abyte0[k] = (byte)(i >>> 24 & 0xff);
        k = j + 1;
        abyte0[j] = (byte)(i >>> 16 & 0xff);
        j = k + 1;
        abyte0[k] = (byte)(i >>> 8 & 0xff);
        abyte0[j] = (byte)(i & 0xff);
        segment.limit = j + 1;
        size = size + 4L;
        return this;
    }

    public volatile BufferedSink writeInt(int i)
    {
        return writeInt(i);
    }

    public Buffer writeIntLe(int i)
    {
        return writeInt(Util.reverseBytesInt(i));
    }

    public volatile BufferedSink writeIntLe(int i)
    {
        return writeIntLe(i);
    }

    public Buffer writeLong(long l)
    {
        Segment segment = writableSegment(8);
        byte abyte0[] = segment.data;
        int j = segment.limit;
        int i = j + 1;
        abyte0[j] = (byte)(int)(l >>> 56 & 255L);
        j = i + 1;
        abyte0[i] = (byte)(int)(l >>> 48 & 255L);
        i = j + 1;
        abyte0[j] = (byte)(int)(l >>> 40 & 255L);
        j = i + 1;
        abyte0[i] = (byte)(int)(l >>> 32 & 255L);
        i = j + 1;
        abyte0[j] = (byte)(int)(l >>> 24 & 255L);
        j = i + 1;
        abyte0[i] = (byte)(int)(l >>> 16 & 255L);
        i = j + 1;
        abyte0[j] = (byte)(int)(l >>> 8 & 255L);
        abyte0[i] = (byte)(int)(l & 255L);
        segment.limit = i + 1;
        size = size + 8L;
        return this;
    }

    public volatile BufferedSink writeLong(long l)
    {
        return writeLong(l);
    }

    public Buffer writeLongLe(long l)
    {
        return writeLong(Util.reverseBytesLong(l));
    }

    public volatile BufferedSink writeLongLe(long l)
    {
        return writeLongLe(l);
    }

    public Buffer writeShort(int i)
    {
        Segment segment = writableSegment(2);
        byte abyte0[] = segment.data;
        int j = segment.limit;
        int k = j + 1;
        abyte0[j] = (byte)(i >>> 8 & 0xff);
        abyte0[k] = (byte)(i & 0xff);
        segment.limit = k + 1;
        size = size + 2L;
        return this;
    }

    public volatile BufferedSink writeShort(int i)
    {
        return writeShort(i);
    }

    public Buffer writeShortLe(int i)
    {
        return writeShort(Util.reverseBytesShort((short)i));
    }

    public volatile BufferedSink writeShortLe(int i)
    {
        return writeShortLe(i);
    }

    public Buffer writeString(String s, Charset charset)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("string == null");
        }
        if (charset == null)
        {
            throw new IllegalArgumentException("charset == null");
        }
        if (charset.equals(Util.UTF_8))
        {
            return writeUtf8(s);
        } else
        {
            s = s.getBytes(charset);
            return write(s, 0, s.length);
        }
    }

    public volatile BufferedSink writeString(String s, Charset charset)
    {
        return writeString(s, charset);
    }

    public Buffer writeTo(OutputStream outputstream)
    {
        return writeTo(outputstream, size);
    }

    public Buffer writeTo(OutputStream outputstream, long l)
    {
        if (outputstream == null)
        {
            throw new IllegalArgumentException("out == null");
        }
        Util.checkOffsetAndCount(size, 0L, l);
        Segment segment = head;
        do
        {
            if (l <= 0L)
            {
                break;
            }
            int i = (int)Math.min(l, segment.limit - segment.pos);
            outputstream.write(segment.data, segment.pos, i);
            segment.pos = segment.pos + i;
            size = size - (long)i;
            l -= i;
            if (segment.pos == segment.limit)
            {
                Segment segment1 = segment.pop();
                head = segment1;
                SegmentPool.recycle(segment);
                segment = segment1;
            }
        } while (true);
        return this;
    }

    public Buffer writeUtf8(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("string == null");
        }
        int i1 = s.length();
        int i = 0;
label0:
        do
        {
            if (i >= i1)
            {
                break;
            }
            char c = s.charAt(i);
            if (c < '\200')
            {
                Segment segment = writableSegment(1);
                byte abyte0[] = segment.data;
                int j1 = segment.limit - i;
                int k1 = Math.min(i1, 2048 - j1);
                int j = i + 1;
                abyte0[i + j1] = (byte)c;
                i = j;
                do
                {
                    int k;
label1:
                    {
                        if (i < k1)
                        {
                            k = s.charAt(i);
                            if (k < 128)
                            {
                                break label1;
                            }
                        }
                        k = (i + j1) - segment.limit;
                        segment.limit = segment.limit + k;
                        size = size + (long)k;
                        continue label0;
                    }
                    abyte0[i + j1] = (byte)k;
                    i++;
                } while (true);
            }
            if (c < '\u0800')
            {
                writeByte(c >> 6 | 0xc0);
                writeByte(c & 0x3f | 0x80);
                i++;
            } else
            if (c < '\uD800' || c > '\uDFFF')
            {
                writeByte(c >> 12 | 0xe0);
                writeByte(c >> 6 & 0x3f | 0x80);
                writeByte(c & 0x3f | 0x80);
                i++;
            } else
            {
                int l;
                if (i + 1 < i1)
                {
                    l = s.charAt(i + 1);
                } else
                {
                    l = 0;
                }
                if (c > '\uDBFF' || l < '\uDC00' || l > '\uDFFF')
                {
                    writeByte(63);
                    i++;
                } else
                {
                    l = (l & 0xffff23ff | (c & 0xffff27ff) << 10) + 0x10000;
                    writeByte(l >> 18 | 0xf0);
                    writeByte(l >> 12 & 0x3f | 0x80);
                    writeByte(l >> 6 & 0x3f | 0x80);
                    writeByte(l & 0x3f | 0x80);
                    i += 2;
                }
            }
        } while (true);
        return this;
    }

    public volatile BufferedSink writeUtf8(String s)
    {
        return writeUtf8(s);
    }

}

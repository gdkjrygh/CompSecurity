// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package okio;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

// Referenced classes of package okio:
//            BufferedSink, BufferedSource, Util, Segment, 
//            SegmentPool, ByteString, Timeout, Source

public final class Buffer
    implements Cloneable, BufferedSink, BufferedSource
{

    Segment head;
    long size;

    public Buffer()
    {
    }

    private Buffer emitCompleteSegments()
    {
        return this;
    }

    private void readFully(byte abyte0[])
        throws EOFException
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

    private String readString(long l, Charset charset)
        throws EOFException
    {
        Util.checkOffsetAndCount(size, 0L, l);
        if (charset == null)
        {
            throw new IllegalArgumentException("charset == null");
        }
        if (l > 0x7fffffffL)
        {
            throw new IllegalArgumentException((new StringBuilder("byteCount > Integer.MAX_VALUE: ")).append(l).toString());
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
                SegmentPool.INSTANCE.recycle(segment);
                return s;
            }
        }
        return charset;
    }

    private String readUtf8(long l)
        throws EOFException
    {
        return readString(l, Util.UTF_8);
    }

    public final Buffer buffer()
    {
        return this;
    }

    public final void clear()
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

    public final volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public final Buffer clone()
    {
        Buffer buffer1 = new Buffer();
        if (size != 0L)
        {
            buffer1.write(head.data, head.pos, head.limit - head.pos);
            Segment segment = head.next;
            while (segment != head) 
            {
                buffer1.write(segment.data, segment.pos, segment.limit - segment.pos);
                segment = segment.next;
            }
        }
        return buffer1;
    }

    public final void close()
    {
    }

    public final long completeSegmentByteCount()
    {
        long l1 = size;
        if (l1 == 0L)
        {
            return 0L;
        }
        Segment segment = head.prev;
        long l = l1;
        if (segment.limit < 2048)
        {
            l = l1 - (long)(segment.limit - segment.pos);
        }
        return l;
    }

    public final Buffer copyTo(Buffer buffer1, long l, long l1)
    {
        if (buffer1 == null)
        {
            throw new IllegalArgumentException("out == null");
        }
        Util.checkOffsetAndCount(size, l, l1);
        if (l1 != 0L)
        {
            Segment segment = head;
            Segment segment1 = buffer1.writableSegment(1);
            buffer1.size = buffer1.size + l1;
            buffer1 = segment1;
            while (l1 > 0L) 
            {
                for (; l >= (long)(segment.limit - segment.pos); segment = segment.next)
                {
                    l -= segment.limit - segment.pos;
                }

                Object obj = buffer1;
                if (((Segment) (buffer1)).limit == 2048)
                {
                    obj = buffer1.push(SegmentPool.INSTANCE.take());
                }
                int i = (int)Math.min(Math.min((long)segment.limit - ((long)segment.pos + l), l1), 2048 - ((Segment) (obj)).limit);
                System.arraycopy(segment.data, segment.pos + (int)l, ((Segment) (obj)).data, ((Segment) (obj)).limit, i);
                l += i;
                obj.limit = ((Segment) (obj)).limit + i;
                l1 -= i;
                buffer1 = ((Buffer) (obj));
            }
        }
        return this;
    }

    public final BufferedSink emit()
        throws IOException
    {
        return this;
    }

    public final volatile BufferedSink emitCompleteSegments()
        throws IOException
    {
        return emitCompleteSegments();
    }

    public final boolean equals(Object obj)
    {
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
        Segment segment = head;
        obj = ((Buffer) (obj)).head;
        int i = segment.pos;
        int j = ((Segment) (obj)).pos;
        long l = 0L;
        while (l < size) 
        {
            long l1 = Math.min(segment.limit - i, ((Segment) (obj)).limit - j);
            boolean flag = false;
            int k = i;
            i = j;
            j = k;
            for (k = ((flag) ? 1 : 0); (long)k < l1;)
            {
                if (segment.data[j] != ((Segment) (obj)).data[i])
                {
                    return false;
                }
                k++;
                i++;
                j++;
            }

            if (j == segment.limit)
            {
                segment = segment.next;
                j = segment.pos;
            }
            if (i == ((Segment) (obj)).limit)
            {
                obj = ((Segment) (obj)).next;
                k = ((Segment) (obj)).pos;
            } else
            {
                k = i;
            }
            l += l1;
            i = j;
            j = k;
        }
        return true;
    }

    public final boolean exhausted()
    {
        return size == 0L;
    }

    public final void flush()
    {
    }

    public final byte getByte(long l)
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

    public final int hashCode()
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
            i = j;
            for (j = k; j < l; j++)
            {
                i = i * 31 + segment.data[j];
            }

            segment1 = segment.next;
            j = i;
            segment = segment1;
        } while (segment1 != head);
        return i;
    }

    public final long indexOf(byte byte0)
    {
        return indexOf(byte0, 0L);
    }

    public final long indexOf(byte byte0, long l)
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

    public final InputStream inputStream()
    {
        return new InputStream() {

            final Buffer this$0;

            public final int available()
            {
                return (int)Math.min(size, 0x7fffffffL);
            }

            public final void close()
            {
            }

            public final int read()
            {
                if (size > 0L)
                {
                    return readByte() & 0xff;
                } else
                {
                    return -1;
                }
            }

            public final int read(byte abyte0[], int i, int j)
            {
                return Buffer.this.read(abyte0, i, j);
            }

            public final String toString()
            {
                return (new StringBuilder()).append(Buffer.this).append(".inputStream()").toString();
            }

            
            {
                this$0 = Buffer.this;
                super();
            }
        };
    }

    public final OutputStream outputStream()
    {
        return new OutputStream() {

            final Buffer this$0;

            public final void close()
            {
            }

            public final void flush()
            {
            }

            public final String toString()
            {
                return (new StringBuilder()).append(this).append(".outputStream()").toString();
            }

            public final void write(int i)
            {
                writeByte((byte)i);
            }

            public final void write(byte abyte0[], int i, int j)
            {
                Buffer.this.write(abyte0, i, j);
            }

            
            {
                this$0 = Buffer.this;
                super();
            }
        };
    }

    public final int read(byte abyte0[], int i, int j)
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
                SegmentPool.INSTANCE.recycle(segment);
                return j;
            }
        }
        return i;
    }

    public final long read(Buffer buffer1, long l)
    {
        if (buffer1 == null)
        {
            throw new IllegalArgumentException("sink == null");
        }
        if (l < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder("byteCount < 0: ")).append(l).toString());
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

    public final byte readByte()
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
            SegmentPool.INSTANCE.recycle(segment);
            return byte0;
        } else
        {
            segment.pos = k;
            return byte0;
        }
    }

    public final byte[] readByteArray()
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

    public final byte[] readByteArray(long l)
        throws EOFException
    {
        Util.checkOffsetAndCount(size, 0L, l);
        if (l > 0x7fffffffL)
        {
            throw new IllegalArgumentException((new StringBuilder("byteCount > Integer.MAX_VALUE: ")).append(l).toString());
        } else
        {
            byte abyte0[] = new byte[(int)l];
            readFully(abyte0);
            return abyte0;
        }
    }

    public final ByteString readByteString()
    {
        return new ByteString(readByteArray());
    }

    public final ByteString readByteString(long l)
        throws EOFException
    {
        return new ByteString(readByteArray(l));
    }

    public final int readInt()
    {
        if (size < 4L)
        {
            throw new IllegalStateException((new StringBuilder("size < 4: ")).append(size).toString());
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
            SegmentPool.INSTANCE.recycle(segment);
            return j;
        } else
        {
            segment.pos = i1;
            return j;
        }
    }

    public final int readIntLe()
    {
        return Util.reverseBytesInt(readInt());
    }

    public final short readShort()
    {
        if (size < 2L)
        {
            throw new IllegalStateException((new StringBuilder("size < 2: ")).append(size).toString());
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
            SegmentPool.INSTANCE.recycle(segment);
        } else
        {
            segment.pos = l;
        }
        return (short)((k & 0xff) << 8 | j & 0xff);
    }

    public final short readShortLe()
    {
        return Util.reverseBytesShort(readShort());
    }

    final String readUtf8Line(long l)
        throws EOFException
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

    public final String readUtf8LineStrict()
        throws EOFException
    {
        long l = indexOf((byte)10);
        if (l == -1L)
        {
            Buffer buffer1 = new Buffer();
            copyTo(buffer1, 0L, Math.min(32L, size));
            throw new EOFException((new StringBuilder("\\n not found: size=")).append(size()).append(" content=").append(buffer1.readByteString().hex()).append("...").toString());
        } else
        {
            return readUtf8Line(l);
        }
    }

    public final void require(long l)
        throws EOFException
    {
        if (size < l)
        {
            throw new EOFException();
        } else
        {
            return;
        }
    }

    public final long size()
    {
        return size;
    }

    public final void skip(long l)
        throws EOFException
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
            segment.pos = segment.pos + i;
            l = l1;
            if (head.pos == head.limit)
            {
                Segment segment1 = head;
                head = segment1.pop();
                SegmentPool.INSTANCE.recycle(segment1);
                l = l1;
            }
        } while (true);
    }

    public final Timeout timeout()
    {
        return Timeout.NONE;
    }

    public final String toString()
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

    final Segment writableSegment(int i)
    {
        if (i <= 0 || i > 2048)
        {
            throw new IllegalArgumentException();
        }
        Segment segment;
        if (head == null)
        {
            head = SegmentPool.INSTANCE.take();
            Segment segment1 = head;
            Segment segment3 = head;
            segment = head;
            segment3.prev = segment;
            segment1.next = segment;
        } else
        {
            Segment segment2 = head.prev;
            segment = segment2;
            if (segment2.limit + i > 2048)
            {
                return segment2.push(SegmentPool.INSTANCE.take());
            }
        }
        return segment;
    }

    public final Buffer write(ByteString bytestring)
    {
        if (bytestring == null)
        {
            throw new IllegalArgumentException("byteString == null");
        } else
        {
            return write(bytestring.data, 0, bytestring.data.length);
        }
    }

    public final Buffer write(byte abyte0[])
    {
        if (abyte0 == null)
        {
            throw new IllegalArgumentException("source == null");
        } else
        {
            return write(abyte0, 0, abyte0.length);
        }
    }

    public final Buffer write(byte abyte0[], int i, int j)
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
            segment.limit = segment.limit + l;
        }

        size = size + (long)j;
        return this;
    }

    public final volatile BufferedSink write(ByteString bytestring)
        throws IOException
    {
        return write(bytestring);
    }

    public final volatile BufferedSink write(byte abyte0[])
        throws IOException
    {
        return write(abyte0);
    }

    public final volatile BufferedSink write(byte abyte0[], int i, int j)
        throws IOException
    {
        return write(abyte0, i, j);
    }

    public final void write(Buffer buffer1, long l)
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
_L5:
        if (l <= 0L)
        {
            break MISSING_BLOCK_LABEL_263;
        }
        if (l >= (long)(buffer1.head.limit - buffer1.head.pos)) goto _L2; else goto _L1
_L1:
        Segment segment;
        if (head != null)
        {
            segment = head.prev;
        } else
        {
            segment = null;
        }
        if (segment != null && (long)(segment.limit - segment.pos) + l <= 2048L) goto _L4; else goto _L3
_L3:
        buffer1.head = buffer1.head.split((int)l);
_L2:
        segment = buffer1.head;
        long l1 = segment.limit - segment.pos;
        buffer1.head = segment.pop();
        if (head == null)
        {
            head = segment;
            segment = head;
            Segment segment1 = head;
            Segment segment2 = head;
            segment1.prev = segment2;
            segment.next = segment2;
        } else
        {
            head.prev.push(segment).compact();
        }
        buffer1.size = buffer1.size - l1;
        size = size + l1;
        l -= l1;
        if (true) goto _L5; else goto _L4
_L4:
        buffer1.head.writeTo(segment, (int)l);
        buffer1.size = buffer1.size - l;
        size = size + l;
    }

    public final long writeAll(Source source)
        throws IOException
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

    public final Buffer writeByte(int i)
    {
        Segment segment = writableSegment(1);
        byte abyte0[] = segment.data;
        int j = segment.limit;
        segment.limit = j + 1;
        abyte0[j] = (byte)i;
        size = size + 1L;
        return this;
    }

    public final volatile BufferedSink writeByte(int i)
        throws IOException
    {
        return writeByte(i);
    }

    public final Buffer writeInt(int i)
    {
        Segment segment = writableSegment(4);
        byte abyte0[] = segment.data;
        int k = segment.limit;
        int j = k + 1;
        abyte0[k] = (byte)(i >>> 24);
        k = j + 1;
        abyte0[j] = (byte)(i >>> 16);
        j = k + 1;
        abyte0[k] = (byte)(i >>> 8);
        abyte0[j] = (byte)i;
        segment.limit = j + 1;
        size = size + 4L;
        return this;
    }

    public final volatile BufferedSink writeInt(int i)
        throws IOException
    {
        return writeInt(i);
    }

    public final Buffer writeShort(int i)
    {
        Segment segment = writableSegment(2);
        byte abyte0[] = segment.data;
        int j = segment.limit;
        int k = j + 1;
        abyte0[j] = (byte)(i >>> 8);
        abyte0[k] = (byte)i;
        segment.limit = k + 1;
        size = size + 2L;
        return this;
    }

    public final volatile BufferedSink writeShort(int i)
        throws IOException
    {
        return writeShort(i);
    }

    public final Buffer writeUtf8(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("string == null");
        }
        int l = s.length();
        for (int i = 0; i < l;)
        {
            char c = s.charAt(i);
            if (c < '\200')
            {
                Segment segment = writableSegment(1);
                byte abyte0[] = segment.data;
                int j = segment.limit - i;
                int i1 = Math.min(l, 2048 - j);
                abyte0[j + i] = (byte)c;
                i++;
                do
                {
                    if (i >= i1)
                    {
                        break;
                    }
                    c = s.charAt(i);
                    if (c >= '\200')
                    {
                        break;
                    }
                    abyte0[j + i] = (byte)c;
                    i++;
                } while (true);
                j = (i + j) - segment.limit;
                segment.limit = segment.limit + j;
                size = size + (long)j;
            } else
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
                int k;
                if (i + 1 < l)
                {
                    k = s.charAt(i + 1);
                } else
                {
                    k = 0;
                }
                if (c > '\uDBFF' || k < '\uDC00' || k > '\uDFFF')
                {
                    writeByte(63);
                    i++;
                } else
                {
                    k = 0x10000 + ((0xffff27ff & c) << 10 | 0xffff23ff & k);
                    writeByte(k >> 18 | 0xf0);
                    writeByte(k >> 12 & 0x3f | 0x80);
                    writeByte(k >> 6 & 0x3f | 0x80);
                    writeByte(k & 0x3f | 0x80);
                    i += 2;
                }
            }
        }

        return this;
    }

    public final volatile BufferedSink writeUtf8(String s)
        throws IOException
    {
        return writeUtf8(s);
    }
}

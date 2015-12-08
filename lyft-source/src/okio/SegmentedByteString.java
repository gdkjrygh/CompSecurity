// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package okio;

import java.io.OutputStream;
import java.util.Arrays;

// Referenced classes of package okio:
//            ByteString, Buffer, Util, Segment

final class SegmentedByteString extends ByteString
{

    final transient int directory[];
    final transient byte segments[][];

    SegmentedByteString(Buffer buffer, int i)
    {
        boolean flag = false;
        super(null);
        Util.checkOffsetAndCount(buffer.size, 0L, i);
        Segment segment1 = buffer.head;
        int j = 0;
        for (int k = 0; k < i;)
        {
            if (segment1.limit == segment1.pos)
            {
                throw new AssertionError("s.limit == s.pos");
            }
            k += segment1.limit - segment1.pos;
            j++;
            segment1 = segment1.next;
        }

        segments = new byte[j][];
        directory = new int[j * 2];
        buffer = buffer.head;
        j = 0;
        for (int l = ((flag) ? 1 : 0); l < i;)
        {
            segments[j] = ((Segment) (buffer)).data;
            l += ((Segment) (buffer)).limit - ((Segment) (buffer)).pos;
            directory[j] = l;
            directory[segments.length + j] = ((Segment) (buffer)).pos;
            buffer.shared = true;
            j++;
            buffer = ((Segment) (buffer)).next;
        }

    }

    private int segment(int i)
    {
        i = Arrays.binarySearch(directory, 0, segments.length, i + 1);
        if (i >= 0)
        {
            return i;
        } else
        {
            return ~i;
        }
    }

    private ByteString toByteString()
    {
        return new ByteString(toByteArray());
    }

    private Object writeReplace()
    {
        return toByteString();
    }

    public String base64()
    {
        return toByteString().base64();
    }

    public String base64Url()
    {
        return toByteString().base64Url();
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        boolean flag;
        if ((obj instanceof ByteString) && ((ByteString)obj).size() == size() && rangeEquals(0, (ByteString)obj, 0, size()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag;
    }

    public byte getByte(int i)
    {
        Util.checkOffsetAndCount(directory[segments.length - 1], i, 1L);
        int k = segment(i);
        int j;
        int l;
        if (k == 0)
        {
            j = 0;
        } else
        {
            j = directory[k - 1];
        }
        l = directory[segments.length + k];
        return segments[k][(i - j) + l];
    }

    public int hashCode()
    {
        int i = hashCode;
        if (i != 0)
        {
            return i;
        }
        i = 1;
        int k1 = segments.length;
        int j = 0;
        int i1;
        for (int k = 0; j < k1; k = i1)
        {
            byte abyte0[] = segments[j];
            int j1 = directory[k1 + j];
            i1 = directory[j];
            for (int l = j1; l < (i1 - k) + j1; l++)
            {
                i = i * 31 + abyte0[l];
            }

            j++;
        }

        hashCode = i;
        return i;
    }

    public String hex()
    {
        return toByteString().hex();
    }

    public ByteString md5()
    {
        return toByteString().md5();
    }

    public boolean rangeEquals(int i, ByteString bytestring, int j, int k)
    {
        if (i <= size() - k) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int i1 = segment(i);
        int l = i;
        i = i1;
        do
        {
label0:
            {
                if (k <= 0)
                {
                    break label0;
                }
                int j1;
                int k1;
                int l1;
                if (i == 0)
                {
                    j1 = 0;
                } else
                {
                    j1 = directory[i - 1];
                }
                k1 = Math.min(k, ((directory[i] - j1) + j1) - l);
                l1 = directory[segments.length + i];
                if (!bytestring.rangeEquals(j, segments[i], (l - j1) + l1, k1))
                {
                    continue; /* Loop/switch isn't completed */
                }
                l += k1;
                j += k1;
                k -= k1;
                i++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    public boolean rangeEquals(int i, byte abyte0[], int j, int k)
    {
        if (i <= size() - k && j <= abyte0.length - k) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int i1 = segment(i);
        int l = i;
        i = i1;
        do
        {
label0:
            {
                if (k <= 0)
                {
                    break label0;
                }
                int j1;
                int k1;
                int l1;
                if (i == 0)
                {
                    j1 = 0;
                } else
                {
                    j1 = directory[i - 1];
                }
                k1 = Math.min(k, ((directory[i] - j1) + j1) - l);
                l1 = directory[segments.length + i];
                if (!Util.arrayRangeEquals(segments[i], (l - j1) + l1, abyte0, j, k1))
                {
                    continue; /* Loop/switch isn't completed */
                }
                l += k1;
                j += k1;
                k -= k1;
                i++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    public ByteString sha256()
    {
        return toByteString().sha256();
    }

    public int size()
    {
        return directory[segments.length - 1];
    }

    public ByteString substring(int i)
    {
        return toByteString().substring(i);
    }

    public ByteString substring(int i, int j)
    {
        return toByteString().substring(i, j);
    }

    public ByteString toAsciiLowercase()
    {
        return toByteString().toAsciiLowercase();
    }

    public ByteString toAsciiUppercase()
    {
        return toByteString().toAsciiUppercase();
    }

    public byte[] toByteArray()
    {
        int i = 0;
        byte abyte0[] = new byte[directory[segments.length - 1]];
        int l = segments.length;
        int k;
        for (int j = 0; i < l; j = k)
        {
            int i1 = directory[l + i];
            k = directory[i];
            System.arraycopy(segments[i], i1, abyte0, j, k - j);
            i++;
        }

        return abyte0;
    }

    public String toString()
    {
        return toByteString().toString();
    }

    public String utf8()
    {
        return toByteString().utf8();
    }

    public void write(OutputStream outputstream)
    {
        int i = 0;
        if (outputstream == null)
        {
            throw new IllegalArgumentException("out == null");
        }
        int l = segments.length;
        int k;
        for (int j = 0; i < l; j = k)
        {
            int i1 = directory[l + i];
            k = directory[i];
            outputstream.write(segments[i], i1, k - j);
            i++;
        }

    }

    void write(Buffer buffer)
    {
        int i = 0;
        int l = segments.length;
        int j = 0;
        while (i < l) 
        {
            int i1 = directory[l + i];
            int k = directory[i];
            Segment segment1 = new Segment(segments[i], i1, (i1 + k) - j);
            if (buffer.head == null)
            {
                segment1.prev = segment1;
                segment1.next = segment1;
                buffer.head = segment1;
            } else
            {
                buffer.head.prev.push(segment1);
            }
            i++;
            j = k;
        }
        long l1 = buffer.size;
        buffer.size = (long)j + l1;
    }
}

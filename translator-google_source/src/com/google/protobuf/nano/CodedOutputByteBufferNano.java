// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.protobuf.nano;

import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

// Referenced classes of package com.google.protobuf.nano:
//            j, g

public final class CodedOutputByteBufferNano
{

    final ByteBuffer a;

    private CodedOutputByteBufferNano(ByteBuffer bytebuffer)
    {
        a = bytebuffer;
        a.order(ByteOrder.LITTLE_ENDIAN);
    }

    private CodedOutputByteBufferNano(byte abyte0[], int i, int k)
    {
        this(ByteBuffer.wrap(abyte0, i, k));
    }

    public static int a(int i)
    {
        if (i >= 0)
        {
            return d(i);
        } else
        {
            return 10;
        }
    }

    public static int a(long l)
    {
        if ((-128L & l) == 0L)
        {
            return 1;
        }
        if ((-16384L & l) == 0L)
        {
            return 2;
        }
        if ((0xffffffffffe00000L & l) == 0L)
        {
            return 3;
        }
        if ((0xfffffffff0000000L & l) == 0L)
        {
            return 4;
        }
        if ((0xfffffff800000000L & l) == 0L)
        {
            return 5;
        }
        if ((0xfffffc0000000000L & l) == 0L)
        {
            return 6;
        }
        if ((0xfffe000000000000L & l) == 0L)
        {
            return 7;
        }
        if ((0xff00000000000000L & l) == 0L)
        {
            return 8;
        }
        return (0x8000000000000000L & l) != 0L ? 10 : 9;
    }

    private static int a(CharSequence charsequence)
    {
_L2:
        int i;
        if (k < j1)
        {
            char c1 = charsequence.charAt(k);
            if (c1 < '\u0800')
            {
                i += 127 - c1 >>> 31;
                k++;
                continue; /* Loop/switch isn't completed */
            }
            int l1 = charsequence.length();
            while (k < l1) 
            {
                char c2 = charsequence.charAt(k);
                int i1;
                if (c2 < '\u0800')
                {
                    l += 127 - c2 >>> 31;
                    i1 = k;
                } else
                {
                    int k1 = l + 2;
                    l = k1;
                    i1 = k;
                    if ('\uD800' <= c2)
                    {
                        l = k1;
                        i1 = k;
                        if (c2 <= '\uDFFF')
                        {
                            if (Character.codePointAt(charsequence, k) < 0x10000)
                            {
                                throw new IllegalArgumentException((new StringBuilder(39)).append("Unpaired surrogate at index ").append(k).toString());
                            }
                            i1 = k + 1;
                            l = k1;
                        }
                    }
                }
                k = i1 + 1;
            }
            i = l + i;
        }
        if (i < j1)
        {
            long l2 = i;
            throw new IllegalArgumentException((new StringBuilder(54)).append("UTF-8 length does not fit in int: ").append(l2 + 0x100000000L).toString());
        } else
        {
            return i;
        }
        int l = 0;
        int j1 = charsequence.length();
        int k;
        for (k = 0; k < j1 && charsequence.charAt(k) < '\200'; k++) { }
        i = j1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static int a(CharSequence charsequence, byte abyte0[], int i, int k)
    {
        int i2;
        int j2;
        i2 = charsequence.length();
        boolean flag = false;
        j2 = i + k;
        k = ((flag) ? 1 : 0);
        do
        {
            if (k >= i2 || k + i >= j2)
            {
                break;
            }
            char c3 = charsequence.charAt(k);
            if (c3 >= '\200')
            {
                break;
            }
            abyte0[i + k] = (byte)c3;
            k++;
        } while (true);
        if (k == i2)
        {
            return i + i2;
        }
        i += k;
_L2:
        char c1;
        if (k >= i2)
        {
            break MISSING_BLOCK_LABEL_483;
        }
        c1 = charsequence.charAt(k);
        if (c1 >= '\200' || i >= j2)
        {
            break; /* Loop/switch isn't completed */
        }
        int l = i + 1;
        abyte0[i] = (byte)c1;
        i = l;
_L3:
        k++;
        if (true) goto _L2; else goto _L1
_L1:
        if (c1 < '\u0800' && i <= j2 - 2)
        {
            int i1 = i + 1;
            abyte0[i] = (byte)(c1 >>> 6 | 0x3c0);
            i = i1 + 1;
            abyte0[i1] = (byte)(c1 & 0x3f | 0x80);
        } else
        if ((c1 < '\uD800' || '\uDFFF' < c1) && i <= j2 - 3)
        {
            int j1 = i + 1;
            abyte0[i] = (byte)(c1 >>> 12 | 0x1e0);
            int k2 = j1 + 1;
            abyte0[j1] = (byte)(c1 >>> 6 & 0x3f | 0x80);
            i = k2 + 1;
            abyte0[k2] = (byte)(c1 & 0x3f | 0x80);
        } else
        {
label0:
            {
                char c2;
label1:
                {
                    if (i > j2 - 4)
                    {
                        break label0;
                    }
                    int k1 = k;
                    if (k + 1 != charsequence.length())
                    {
                        k++;
                        c2 = charsequence.charAt(k);
                        if (Character.isSurrogatePair(c1, c2))
                        {
                            break label1;
                        }
                        k1 = k;
                    }
                    throw new IllegalArgumentException((new StringBuilder(39)).append("Unpaired surrogate at index ").append(k1 - 1).toString());
                }
                int l1 = Character.toCodePoint(c1, c2);
                int l2 = i + 1;
                abyte0[i] = (byte)(l1 >>> 18 | 0xf0);
                i = l2 + 1;
                abyte0[l2] = (byte)(l1 >>> 12 & 0x3f | 0x80);
                l2 = i + 1;
                abyte0[i] = (byte)(l1 >>> 6 & 0x3f | 0x80);
                i = l2 + 1;
                abyte0[l2] = (byte)(l1 & 0x3f | 0x80);
            }
        }
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
        throw new ArrayIndexOutOfBoundsException((new StringBuilder(37)).append("Failed writing ").append(c1).append(" at index ").append(i).toString());
        return i;
    }

    public static int a(String s)
    {
        int i = a(((CharSequence) (s)));
        return i + d(i);
    }

    public static int a(byte abyte0[])
    {
        return d(abyte0.length) + abyte0.length;
    }

    public static CodedOutputByteBufferNano a(byte abyte0[], int i, int k)
    {
        return new CodedOutputByteBufferNano(abyte0, i, k);
    }

    private static void a(CharSequence charsequence, ByteBuffer bytebuffer)
    {
        if (bytebuffer.isReadOnly())
        {
            throw new ReadOnlyBufferException();
        }
        if (bytebuffer.hasArray())
        {
            try
            {
                bytebuffer.position(a(charsequence, bytebuffer.array(), bytebuffer.arrayOffset() + bytebuffer.position(), bytebuffer.remaining()) - bytebuffer.arrayOffset());
                return;
            }
            // Misplaced declaration of an exception variable
            catch (CharSequence charsequence)
            {
                bytebuffer = new BufferOverflowException();
            }
            bytebuffer.initCause(charsequence);
            throw bytebuffer;
        } else
        {
            b(charsequence, bytebuffer);
            return;
        }
    }

    public static int b(int i)
    {
        return d(j.a(i, 0));
    }

    public static int b(int i, g g1)
    {
        return (b(i) << 1) + g1.getSerializedSize();
    }

    public static int b(int i, String s)
    {
        return b(i) + a(s);
    }

    public static int b(int i, byte abyte0[])
    {
        return b(i) + a(abyte0);
    }

    private void b(long l)
    {
        do
        {
            if ((-128L & l) == 0L)
            {
                e((int)l);
                return;
            }
            e((int)l & 0x7f | 0x80);
            l >>>= 7;
        } while (true);
    }

    private static void b(CharSequence charsequence, ByteBuffer bytebuffer)
    {
        int i;
        int i1;
        i1 = charsequence.length();
        i = 0;
_L2:
        char c1;
        if (i >= i1)
        {
            break MISSING_BLOCK_LABEL_300;
        }
        c1 = charsequence.charAt(i);
        if (c1 >= '\200')
        {
            break; /* Loop/switch isn't completed */
        }
        bytebuffer.put((byte)c1);
_L3:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        if (c1 < '\u0800')
        {
            bytebuffer.put((byte)(c1 >>> 6 | 0x3c0));
            bytebuffer.put((byte)(c1 & 0x3f | 0x80));
        } else
        if (c1 < '\uD800' || '\uDFFF' < c1)
        {
            bytebuffer.put((byte)(c1 >>> 12 | 0x1e0));
            bytebuffer.put((byte)(c1 >>> 6 & 0x3f | 0x80));
            bytebuffer.put((byte)(c1 & 0x3f | 0x80));
        } else
        {
            char c2;
label0:
            {
                int k = i;
                if (i + 1 != charsequence.length())
                {
                    i++;
                    c2 = charsequence.charAt(i);
                    if (Character.isSurrogatePair(c1, c2))
                    {
                        break label0;
                    }
                    k = i;
                }
                throw new IllegalArgumentException((new StringBuilder(39)).append("Unpaired surrogate at index ").append(k - 1).toString());
            }
            int l = Character.toCodePoint(c1, c2);
            bytebuffer.put((byte)(l >>> 18 | 0xf0));
            bytebuffer.put((byte)(l >>> 12 & 0x3f | 0x80));
            bytebuffer.put((byte)(l >>> 6 & 0x3f | 0x80));
            bytebuffer.put((byte)(l & 0x3f | 0x80));
        }
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }

    public static int c(int i, long l)
    {
        return b(i) + a(l);
    }

    public static int c(int i, g g1)
    {
        i = b(i);
        int k = g1.getSerializedSize();
        return i + (k + d(k));
    }

    public static int d(int i)
    {
        if ((i & 0xffffff80) == 0)
        {
            return 1;
        }
        if ((i & 0xffffc000) == 0)
        {
            return 2;
        }
        if ((0xffe00000 & i) == 0)
        {
            return 3;
        }
        return (0xf0000000 & i) != 0 ? 5 : 4;
    }

    public static int d(int i, int k)
    {
        return b(i) + a(k);
    }

    public static int d(int i, long l)
    {
        return b(i) + a(l);
    }

    public static int e(int i, int k)
    {
        return b(i) + d(k);
    }

    private void e(int i)
    {
        byte byte0 = (byte)i;
        if (!a.hasRemaining())
        {
            throw new OutOfSpaceException(a.position(), a.limit());
        } else
        {
            a.put(byte0);
            return;
        }
    }

    private void f(int i)
    {
        if (a.remaining() < 4)
        {
            throw new OutOfSpaceException(a.position(), a.limit());
        } else
        {
            a.putInt(i);
            return;
        }
    }

    public final void a(int i, double d1)
    {
        f(i, 1);
        long l = Double.doubleToLongBits(d1);
        if (a.remaining() < 8)
        {
            throw new OutOfSpaceException(a.position(), a.limit());
        } else
        {
            a.putLong(l);
            return;
        }
    }

    public final void a(int i, float f1)
    {
        f(i, 5);
        f(Float.floatToIntBits(f1));
    }

    public final void a(int i, int k)
    {
        f(i, 0);
        if (k >= 0)
        {
            c(k);
            return;
        } else
        {
            b(k);
            return;
        }
    }

    public final void a(int i, long l)
    {
        f(i, 0);
        b(l);
    }

    public final void a(int i, g g1)
    {
        f(i, 2);
        a(g1);
    }

    public final void a(int i, String s)
    {
        f(i, 2);
        OutOfSpaceException outofspaceexception;
        int k;
        i = d(s.length());
        if (i != d(s.length() * 3))
        {
            break MISSING_BLOCK_LABEL_158;
        }
        k = a.position();
        if (a.remaining() < i)
        {
            throw new OutOfSpaceException(i + k, a.limit());
        }
        try
        {
            a.position(k + i);
            a(((CharSequence) (s)), a);
            int l = a.position();
            a.position(k);
            c(l - k - i);
            a.position(l);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            outofspaceexception = new OutOfSpaceException(a.position(), a.limit());
            outofspaceexception.initCause(s);
            throw outofspaceexception;
        }
        c(a(((CharSequence) (s))));
        a(((CharSequence) (s)), a);
        return;
    }

    public final void a(int i, boolean flag)
    {
        boolean flag1 = false;
        f(i, 0);
        i = ((flag1) ? 1 : 0);
        if (flag)
        {
            i = 1;
        }
        e(i);
    }

    public final void a(int i, byte abyte0[])
    {
        f(i, 2);
        c(abyte0.length);
        b(abyte0);
    }

    public final void a(g g1)
    {
        c(g1.getCachedSize());
        g1.writeTo(this);
    }

    public final void b(int i, int k)
    {
        f(i, 5);
        f(k);
    }

    public final void b(int i, long l)
    {
        f(i, 0);
        b(l);
    }

    public final void b(byte abyte0[])
    {
        int i = abyte0.length;
        if (a.remaining() >= i)
        {
            a.put(abyte0, 0, i);
            return;
        } else
        {
            throw new OutOfSpaceException(a.position(), a.limit());
        }
    }

    public final void c(int i)
    {
        do
        {
            if ((i & 0xffffff80) == 0)
            {
                e(i);
                return;
            }
            e(i & 0x7f | 0x80);
            i >>>= 7;
        } while (true);
    }

    public final void c(int i, int k)
    {
        f(i, 0);
        c(k);
    }

    public final void f(int i, int k)
    {
        c(j.a(i, k));
    }

    private class OutOfSpaceException extends IOException
    {

        private static final long serialVersionUID = 0x9f95917c52ce6e25L;

        OutOfSpaceException(int i, int k)
        {
            String s = String.valueOf("CodedOutputStream was writing to a flat byte array and ran out of space (pos ");
            super((new StringBuilder(String.valueOf(s).length() + 31)).append(s).append(i).append(" limit ").append(k).append(").").toString());
        }
    }

}

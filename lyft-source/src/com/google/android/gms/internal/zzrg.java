// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ReadOnlyBufferException;

// Referenced classes of package com.google.android.gms.internal:
//            zzrn, zzrq

public final class zzrg
{

    private final ByteBuffer a;

    private zzrg(ByteBuffer bytebuffer)
    {
        a = bytebuffer;
    }

    private zzrg(byte abyte0[], int k, int l)
    {
        this(ByteBuffer.wrap(abyte0, k, l));
    }

    private static int a(CharSequence charsequence)
    {
_L2:
        int l;
        int i1 = k;
        if (l < j1)
        {
            i1 = charsequence.charAt(l);
            if (i1 < 2048)
            {
                l++;
                k = (127 - i1 >>> 31) + k;
                continue; /* Loop/switch isn't completed */
            }
            i1 = k + a(charsequence, l);
        }
        if (i1 < j1)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("UTF-8 length does not fit in int: ").append((long)i1 + 0x100000000L).toString());
        } else
        {
            return i1;
        }
        int j1 = charsequence.length();
        int k;
        for (k = 0; k < j1 && charsequence.charAt(k) < '\200'; k++) { }
        l = k;
        k = j1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static int a(CharSequence charsequence, int k)
    {
        int k1 = charsequence.length();
        int l = 0;
        while (k < k1) 
        {
            char c1 = charsequence.charAt(k);
            int i1;
            if (c1 < '\u0800')
            {
                l += 127 - c1 >>> 31;
                i1 = k;
            } else
            {
                int j1 = l + 2;
                i1 = k;
                l = j1;
                if ('\uD800' <= c1)
                {
                    i1 = k;
                    l = j1;
                    if (c1 <= '\uDFFF')
                    {
                        if (Character.codePointAt(charsequence, k) < 0x10000)
                        {
                            throw new IllegalArgumentException((new StringBuilder()).append("Unpaired surrogate at index ").append(k).toString());
                        }
                        i1 = k + 1;
                        l = j1;
                    }
                }
            }
            k = i1 + 1;
        }
        return l;
    }

    private static int a(CharSequence charsequence, byte abyte0[], int k, int l)
    {
        int j2;
        int k2;
        j2 = charsequence.length();
        boolean flag = false;
        k2 = k + l;
        l = ((flag) ? 1 : 0);
        do
        {
            if (l >= j2 || l + k >= k2)
            {
                break;
            }
            char c3 = charsequence.charAt(l);
            if (c3 >= '\200')
            {
                break;
            }
            abyte0[k + l] = (byte)c3;
            l++;
        } while (true);
        if (l == j2)
        {
            return k + j2;
        }
        k += l;
_L2:
        char c1;
        if (l >= j2)
        {
            break MISSING_BLOCK_LABEL_479;
        }
        c1 = charsequence.charAt(l);
        if (c1 >= '\200' || k >= k2)
        {
            break; /* Loop/switch isn't completed */
        }
        int i1 = k + 1;
        abyte0[k] = (byte)c1;
        k = i1;
_L3:
        l++;
        if (true) goto _L2; else goto _L1
_L1:
        if (c1 < '\u0800' && k <= k2 - 2)
        {
            int j1 = k + 1;
            abyte0[k] = (byte)(c1 >>> 6 | 0x3c0);
            k = j1 + 1;
            abyte0[j1] = (byte)(c1 & 0x3f | 0x80);
        } else
        if ((c1 < '\uD800' || '\uDFFF' < c1) && k <= k2 - 3)
        {
            int k1 = k + 1;
            abyte0[k] = (byte)(c1 >>> 12 | 0x1e0);
            int l2 = k1 + 1;
            abyte0[k1] = (byte)(c1 >>> 6 & 0x3f | 0x80);
            k = l2 + 1;
            abyte0[l2] = (byte)(c1 & 0x3f | 0x80);
        } else
        {
label0:
            {
                char c2;
label1:
                {
                    if (k > k2 - 4)
                    {
                        break label0;
                    }
                    int l1 = l;
                    if (l + 1 != charsequence.length())
                    {
                        l++;
                        c2 = charsequence.charAt(l);
                        if (Character.isSurrogatePair(c1, c2))
                        {
                            break label1;
                        }
                        l1 = l;
                    }
                    throw new IllegalArgumentException((new StringBuilder()).append("Unpaired surrogate at index ").append(l1 - 1).toString());
                }
                int i2 = Character.toCodePoint(c1, c2);
                int i3 = k + 1;
                abyte0[k] = (byte)(i2 >>> 18 | 0xf0);
                k = i3 + 1;
                abyte0[i3] = (byte)(i2 >>> 12 & 0x3f | 0x80);
                i3 = k + 1;
                abyte0[k] = (byte)(i2 >>> 6 & 0x3f | 0x80);
                k = i3 + 1;
                abyte0[i3] = (byte)(i2 & 0x3f | 0x80);
            }
        }
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
        throw new ArrayIndexOutOfBoundsException((new StringBuilder()).append("Failed writing ").append(c1).append(" at index ").append(k).toString());
        return k;
    }

    public static zzrg a(byte abyte0[])
    {
        return a(abyte0, 0, abyte0.length);
    }

    public static zzrg a(byte abyte0[], int k, int l)
    {
        return new zzrg(abyte0, k, l);
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

    public static int b(double d1)
    {
        return 8;
    }

    public static int b(float f1)
    {
        return 4;
    }

    public static int b(int k, double d1)
    {
        return f(k) + b(d1);
    }

    public static int b(int k, float f1)
    {
        return f(k) + b(f1);
    }

    public static int b(int k, long l)
    {
        return f(k) + b(l);
    }

    public static int b(int k, zzrn zzrn1)
    {
        return f(k) * 2 + c(zzrn1);
    }

    public static int b(int k, String s)
    {
        return f(k) + b(s);
    }

    public static int b(int k, boolean flag)
    {
        return f(k) + b(flag);
    }

    public static int b(int k, byte abyte0[])
    {
        return f(k) + c(abyte0);
    }

    public static int b(long l)
    {
        return d(l);
    }

    public static int b(String s)
    {
        int k = a(s);
        return k + h(k);
    }

    public static int b(boolean flag)
    {
        return 1;
    }

    private static void b(CharSequence charsequence, ByteBuffer bytebuffer)
    {
        int k;
        int j1;
        j1 = charsequence.length();
        k = 0;
_L2:
        char c1;
        if (k >= j1)
        {
            break MISSING_BLOCK_LABEL_298;
        }
        c1 = charsequence.charAt(k);
        if (c1 >= '\200')
        {
            break; /* Loop/switch isn't completed */
        }
        bytebuffer.put((byte)c1);
_L3:
        k++;
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
                int l = k;
                if (k + 1 != charsequence.length())
                {
                    k++;
                    c2 = charsequence.charAt(k);
                    if (Character.isSurrogatePair(c1, c2))
                    {
                        break label0;
                    }
                    l = k;
                }
                throw new IllegalArgumentException((new StringBuilder()).append("Unpaired surrogate at index ").append(l - 1).toString());
            }
            int i1 = Character.toCodePoint(c1, c2);
            bytebuffer.put((byte)(i1 >>> 18 | 0xf0));
            bytebuffer.put((byte)(i1 >>> 12 & 0x3f | 0x80));
            bytebuffer.put((byte)(i1 >>> 6 & 0x3f | 0x80));
            bytebuffer.put((byte)(i1 & 0x3f | 0x80));
        }
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }

    public static int c(int k)
    {
        if (k >= 0)
        {
            return h(k);
        } else
        {
            return 10;
        }
    }

    public static int c(int k, int l)
    {
        return f(k) + c(l);
    }

    public static int c(int k, zzrn zzrn1)
    {
        return f(k) + d(zzrn1);
    }

    public static int c(zzrn zzrn1)
    {
        return zzrn1.h();
    }

    public static int c(byte abyte0[])
    {
        return h(abyte0.length) + abyte0.length;
    }

    public static int d(int k)
    {
        return h(j(k));
    }

    public static int d(int k, int l)
    {
        return f(k) + d(l);
    }

    public static int d(long l)
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

    public static int d(zzrn zzrn1)
    {
        int k = zzrn1.h();
        return k + h(k);
    }

    public static int f(int k)
    {
        return h(zzrq.a(k, 0));
    }

    public static int h(int k)
    {
        if ((k & 0xffffff80) == 0)
        {
            return 1;
        }
        if ((k & 0xffffc000) == 0)
        {
            return 2;
        }
        if ((0xffe00000 & k) == 0)
        {
            return 3;
        }
        return (0xf0000000 & k) != 0 ? 5 : 4;
    }

    public static int j(int k)
    {
        return k << 1 ^ k >> 31;
    }

    public void a(byte byte0)
    {
        if (!a.hasRemaining())
        {
            throw new zza(a.position(), a.limit());
        } else
        {
            a.put(byte0);
            return;
        }
    }

    public void a(double d1)
    {
        e(Double.doubleToLongBits(d1));
    }

    public void a(float f1)
    {
        i(Float.floatToIntBits(f1));
    }

    public void a(int k)
    {
        if (k >= 0)
        {
            g(k);
            return;
        } else
        {
            c(k);
            return;
        }
    }

    public void a(int k, double d1)
    {
        e(k, 1);
        a(d1);
    }

    public void a(int k, float f1)
    {
        e(k, 5);
        a(f1);
    }

    public void a(int k, int l)
    {
        e(k, 0);
        a(l);
    }

    public void a(int k, long l)
    {
        e(k, 0);
        a(l);
    }

    public void a(int k, zzrn zzrn1)
    {
        e(k, 2);
        b(zzrn1);
    }

    public void a(int k, String s)
    {
        e(k, 2);
        a(s);
    }

    public void a(int k, boolean flag)
    {
        e(k, 0);
        a(flag);
    }

    public void a(int k, byte abyte0[])
    {
        e(k, 2);
        b(abyte0);
    }

    public void a(long l)
    {
        c(l);
    }

    public void a(zzrn zzrn1)
    {
        zzrn1.a(this);
    }

    public void a(String s)
    {
        try
        {
            int k = h(s.length());
            if (k == h(s.length() * 3))
            {
                int l = a.position();
                a.position(l + k);
                a(((CharSequence) (s)), a);
                int i1 = a.position();
                a.position(l);
                g(i1 - l - k);
                a.position(i1);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new zza(a.position(), a.limit());
        }
        g(a(((CharSequence) (s))));
        a(((CharSequence) (s)), a);
        return;
    }

    public void a(boolean flag)
    {
        int k;
        if (flag)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        e(k);
    }

    public void b(int k)
    {
        g(j(k));
    }

    public void b(int k, int l)
    {
        e(k, 0);
        b(l);
    }

    public void b(zzrn zzrn1)
    {
        g(zzrn1.g());
        zzrn1.a(this);
    }

    public void b(byte abyte0[])
    {
        g(abyte0.length);
        d(abyte0);
    }

    public void b(byte abyte0[], int k, int l)
    {
        if (a.remaining() >= l)
        {
            a.put(abyte0, k, l);
            return;
        } else
        {
            throw new zza(a.position(), a.limit());
        }
    }

    public void c(long l)
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

    public void d(byte abyte0[])
    {
        b(abyte0, 0, abyte0.length);
    }

    public void e(int k)
    {
        a((byte)k);
    }

    public void e(int k, int l)
    {
        g(zzrq.a(k, l));
    }

    public void e(long l)
    {
        e((int)l & 0xff);
        e((int)(l >> 8) & 0xff);
        e((int)(l >> 16) & 0xff);
        e((int)(l >> 24) & 0xff);
        e((int)(l >> 32) & 0xff);
        e((int)(l >> 40) & 0xff);
        e((int)(l >> 48) & 0xff);
        e((int)(l >> 56) & 0xff);
    }

    public void g(int k)
    {
        do
        {
            if ((k & 0xffffff80) == 0)
            {
                e(k);
                return;
            }
            e(k & 0x7f | 0x80);
            k >>>= 7;
        } while (true);
    }

    public void i(int k)
    {
        e(k & 0xff);
        e(k >> 8 & 0xff);
        e(k >> 16 & 0xff);
        e(k >> 24 & 0xff);
    }

    private class zza extends IOException
    {

        zza(int k, int l)
        {
            super((new StringBuilder()).append("CodedOutputStream was writing to a flat byte array and ran out of space (pos ").append(k).append(" limit ").append(l).append(").").toString());
        }
    }

}

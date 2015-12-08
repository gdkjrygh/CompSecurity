// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ReadOnlyBufferException;

// Referenced classes of package com.google.android.gms.internal:
//            zzrn, zzrq

public final class zzrg
{
    public static class zza extends IOException
    {

        zza(int i, int j)
        {
            super((new StringBuilder()).append("CodedOutputStream was writing to a flat byte array and ran out of space (pos ").append(i).append(" limit ").append(j).append(").").toString());
        }
    }


    private final ByteBuffer zzaVT;

    private zzrg(ByteBuffer bytebuffer)
    {
        zzaVT = bytebuffer;
    }

    private zzrg(byte abyte0[], int i, int j)
    {
        this(ByteBuffer.wrap(abyte0, i, j));
    }

    public static int zzA(int i, int j)
    {
        return zzkM(i) + zzkJ(j);
    }

    public static zzrg zzA(byte abyte0[])
    {
        return zzb(abyte0, 0, abyte0.length);
    }

    public static int zzY(long l)
    {
        return zzab(l);
    }

    private static int zza(CharSequence charsequence)
    {
_L2:
        int j;
        int k = i;
        if (j < l)
        {
            k = charsequence.charAt(j);
            if (k < 2048)
            {
                j++;
                i = (127 - k >>> 31) + i;
                continue; /* Loop/switch isn't completed */
            }
            k = i + zza(charsequence, j);
        }
        if (k < l)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("UTF-8 length does not fit in int: ").append((long)k + 0x100000000L).toString());
        } else
        {
            return k;
        }
        int l = charsequence.length();
        int i;
        for (i = 0; i < l && charsequence.charAt(i) < '\200'; i++) { }
        j = i;
        i = l;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static int zza(CharSequence charsequence, int i)
    {
        int i1 = charsequence.length();
        int j = 0;
        while (i < i1) 
        {
            char c = charsequence.charAt(i);
            int k;
            if (c < '\u0800')
            {
                j += 127 - c >>> 31;
                k = i;
            } else
            {
                int l = j + 2;
                k = i;
                j = l;
                if ('\uD800' <= c)
                {
                    k = i;
                    j = l;
                    if (c <= '\uDFFF')
                    {
                        if (Character.codePointAt(charsequence, i) < 0x10000)
                        {
                            throw new IllegalArgumentException((new StringBuilder()).append("Unpaired surrogate at index ").append(i).toString());
                        }
                        k = i + 1;
                        j = l;
                    }
                }
            }
            i = k + 1;
        }
        return j;
    }

    private static int zza(CharSequence charsequence, byte abyte0[], int i, int j)
    {
        int l1;
        int i2;
        l1 = charsequence.length();
        boolean flag = false;
        i2 = i + j;
        j = ((flag) ? 1 : 0);
        do
        {
            if (j >= l1 || j + i >= i2)
            {
                break;
            }
            char c2 = charsequence.charAt(j);
            if (c2 >= '\200')
            {
                break;
            }
            abyte0[i + j] = (byte)c2;
            j++;
        } while (true);
        if (j == l1)
        {
            return i + l1;
        }
        i += j;
_L2:
        char c;
        if (j >= l1)
        {
            break MISSING_BLOCK_LABEL_479;
        }
        c = charsequence.charAt(j);
        if (c >= '\200' || i >= i2)
        {
            break; /* Loop/switch isn't completed */
        }
        int k = i + 1;
        abyte0[i] = (byte)c;
        i = k;
_L3:
        j++;
        if (true) goto _L2; else goto _L1
_L1:
        if (c < '\u0800' && i <= i2 - 2)
        {
            int l = i + 1;
            abyte0[i] = (byte)(c >>> 6 | 0x3c0);
            i = l + 1;
            abyte0[l] = (byte)(c & 0x3f | 0x80);
        } else
        if ((c < '\uD800' || '\uDFFF' < c) && i <= i2 - 3)
        {
            int i1 = i + 1;
            abyte0[i] = (byte)(c >>> 12 | 0x1e0);
            int j2 = i1 + 1;
            abyte0[i1] = (byte)(c >>> 6 & 0x3f | 0x80);
            i = j2 + 1;
            abyte0[j2] = (byte)(c & 0x3f | 0x80);
        } else
        {
label0:
            {
                char c1;
label1:
                {
                    if (i > i2 - 4)
                    {
                        break label0;
                    }
                    int j1 = j;
                    if (j + 1 != charsequence.length())
                    {
                        j++;
                        c1 = charsequence.charAt(j);
                        if (Character.isSurrogatePair(c, c1))
                        {
                            break label1;
                        }
                        j1 = j;
                    }
                    throw new IllegalArgumentException((new StringBuilder()).append("Unpaired surrogate at index ").append(j1 - 1).toString());
                }
                int k1 = Character.toCodePoint(c, c1);
                int k2 = i + 1;
                abyte0[i] = (byte)(k1 >>> 18 | 0xf0);
                i = k2 + 1;
                abyte0[k2] = (byte)(k1 >>> 12 & 0x3f | 0x80);
                k2 = i + 1;
                abyte0[i] = (byte)(k1 >>> 6 & 0x3f | 0x80);
                i = k2 + 1;
                abyte0[k2] = (byte)(k1 & 0x3f | 0x80);
            }
        }
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
        throw new ArrayIndexOutOfBoundsException((new StringBuilder()).append("Failed writing ").append(c).append(" at index ").append(i).toString());
        return i;
    }

    private static void zza(CharSequence charsequence, ByteBuffer bytebuffer)
    {
        if (bytebuffer.isReadOnly())
        {
            throw new ReadOnlyBufferException();
        }
        if (bytebuffer.hasArray())
        {
            try
            {
                bytebuffer.position(zza(charsequence, bytebuffer.array(), bytebuffer.arrayOffset() + bytebuffer.position(), bytebuffer.remaining()) - bytebuffer.arrayOffset());
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
            zzb(charsequence, bytebuffer);
            return;
        }
    }

    public static int zzab(long l)
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

    public static int zzas(boolean flag)
    {
        return 1;
    }

    public static int zzb(int i, zzrn zzrn1)
    {
        return zzkM(i) * 2 + zzd(zzrn1);
    }

    public static zzrg zzb(byte abyte0[], int i, int j)
    {
        return new zzrg(abyte0, i, j);
    }

    private static void zzb(CharSequence charsequence, ByteBuffer bytebuffer)
    {
        int i;
        int l;
        l = charsequence.length();
        i = 0;
_L2:
        char c;
        if (i >= l)
        {
            break MISSING_BLOCK_LABEL_298;
        }
        c = charsequence.charAt(i);
        if (c >= '\200')
        {
            break; /* Loop/switch isn't completed */
        }
        bytebuffer.put((byte)c);
_L3:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        if (c < '\u0800')
        {
            bytebuffer.put((byte)(c >>> 6 | 0x3c0));
            bytebuffer.put((byte)(c & 0x3f | 0x80));
        } else
        if (c < '\uD800' || '\uDFFF' < c)
        {
            bytebuffer.put((byte)(c >>> 12 | 0x1e0));
            bytebuffer.put((byte)(c >>> 6 & 0x3f | 0x80));
            bytebuffer.put((byte)(c & 0x3f | 0x80));
        } else
        {
            char c1;
label0:
            {
                int j = i;
                if (i + 1 != charsequence.length())
                {
                    i++;
                    c1 = charsequence.charAt(i);
                    if (Character.isSurrogatePair(c, c1))
                    {
                        break label0;
                    }
                    j = i;
                }
                throw new IllegalArgumentException((new StringBuilder()).append("Unpaired surrogate at index ").append(j - 1).toString());
            }
            int k = Character.toCodePoint(c, c1);
            bytebuffer.put((byte)(k >>> 18 | 0xf0));
            bytebuffer.put((byte)(k >>> 12 & 0x3f | 0x80));
            bytebuffer.put((byte)(k >>> 6 & 0x3f | 0x80));
            bytebuffer.put((byte)(k & 0x3f | 0x80));
        }
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }

    public static int zzc(int i, float f)
    {
        return zzkM(i) + zzj(f);
    }

    public static int zzc(int i, zzrn zzrn1)
    {
        return zzkM(i) + zze(zzrn1);
    }

    public static int zzc(int i, boolean flag)
    {
        return zzkM(i) + zzas(flag);
    }

    public static int zzd(int i, long l)
    {
        return zzkM(i) + zzY(l);
    }

    public static int zzd(zzrn zzrn1)
    {
        return zzrn1.zzBV();
    }

    public static int zze(zzrn zzrn1)
    {
        int i = zzrn1.zzBV();
        return i + zzkO(i);
    }

    public static int zzfj(String s)
    {
        int i = zza(s);
        return i + zzkO(i);
    }

    public static int zzj(float f)
    {
        return 4;
    }

    public static int zzk(int i, String s)
    {
        return zzkM(i) + zzfj(s);
    }

    public static int zzkJ(int i)
    {
        if (i >= 0)
        {
            return zzkO(i);
        } else
        {
            return 10;
        }
    }

    public static int zzkM(int i)
    {
        return zzkO(zzrq.zzD(i, 0));
    }

    public static int zzkO(int i)
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

    public int zzBG()
    {
        return zzaVT.remaining();
    }

    public void zzC(int i, int j)
        throws IOException
    {
        zzkN(zzrq.zzD(i, j));
    }

    public void zzD(byte abyte0[])
        throws IOException
    {
        zzc(abyte0, 0, abyte0.length);
    }

    public void zzW(long l)
        throws IOException
    {
        zzaa(l);
    }

    public void zza(int i, zzrn zzrn1)
        throws IOException
    {
        zzC(i, 2);
        zzc(zzrn1);
    }

    public void zzaa(long l)
        throws IOException
    {
        do
        {
            if ((-128L & l) == 0L)
            {
                zzkL((int)l);
                return;
            }
            zzkL((int)l & 0x7f | 0x80);
            l >>>= 7;
        } while (true);
    }

    public void zzar(boolean flag)
        throws IOException
    {
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        zzkL(i);
    }

    public void zzb(byte byte0)
        throws IOException
    {
        if (!zzaVT.hasRemaining())
        {
            throw new zza(zzaVT.position(), zzaVT.limit());
        } else
        {
            zzaVT.put(byte0);
            return;
        }
    }

    public void zzb(int i, float f)
        throws IOException
    {
        zzC(i, 5);
        zzi(f);
    }

    public void zzb(int i, long l)
        throws IOException
    {
        zzC(i, 0);
        zzW(l);
    }

    public void zzb(int i, String s)
        throws IOException
    {
        zzC(i, 2);
        zzfi(s);
    }

    public void zzb(int i, boolean flag)
        throws IOException
    {
        zzC(i, 0);
        zzar(flag);
    }

    public void zzb(zzrn zzrn1)
        throws IOException
    {
        zzrn1.zza(this);
    }

    public void zzc(zzrn zzrn1)
        throws IOException
    {
        zzkN(zzrn1.zzBU());
        zzrn1.zza(this);
    }

    public void zzc(byte abyte0[], int i, int j)
        throws IOException
    {
        if (zzaVT.remaining() >= j)
        {
            zzaVT.put(abyte0, i, j);
            return;
        } else
        {
            throw new zza(zzaVT.position(), zzaVT.limit());
        }
    }

    public void zzfi(String s)
        throws IOException
    {
        try
        {
            int i = zzkO(s.length());
            if (i == zzkO(s.length() * 3))
            {
                int j = zzaVT.position();
                zzaVT.position(j + i);
                zza(s, zzaVT);
                int k = zzaVT.position();
                zzaVT.position(j);
                zzkN(k - j - i);
                zzaVT.position(k);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new zza(zzaVT.position(), zzaVT.limit());
        }
        zzkN(zza(s));
        zza(s, zzaVT);
        return;
    }

    public void zzi(float f)
        throws IOException
    {
        zzkP(Float.floatToIntBits(f));
    }

    public void zzkH(int i)
        throws IOException
    {
        if (i >= 0)
        {
            zzkN(i);
            return;
        } else
        {
            zzaa(i);
            return;
        }
    }

    public void zzkL(int i)
        throws IOException
    {
        zzb((byte)i);
    }

    public void zzkN(int i)
        throws IOException
    {
        do
        {
            if ((i & 0xffffff80) == 0)
            {
                zzkL(i);
                return;
            }
            zzkL(i & 0x7f | 0x80);
            i >>>= 7;
        } while (true);
    }

    public void zzkP(int i)
        throws IOException
    {
        zzkL(i & 0xff);
        zzkL(i >> 8 & 0xff);
        zzkL(i >> 16 & 0xff);
        zzkL(i >> 24 & 0xff);
    }

    public void zzy(int i, int j)
        throws IOException
    {
        zzC(i, 0);
        zzkH(j);
    }
}

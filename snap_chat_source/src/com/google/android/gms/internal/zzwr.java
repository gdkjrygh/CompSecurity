// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ReadOnlyBufferException;

// Referenced classes of package com.google.android.gms.internal:
//            zzwy, zzxb

public final class zzwr
{
    public static class zza extends IOException
    {

        zza(int i, int j)
        {
            super((new StringBuilder("CodedOutputStream was writing to a flat byte array and ran out of space (pos ")).append(i).append(" limit ").append(j).append(").").toString());
        }
    }


    private final ByteBuffer zzaHA;

    private zzwr(ByteBuffer bytebuffer)
    {
        zzaHA = bytebuffer;
    }

    private zzwr(byte abyte0[], int i, int j)
    {
        this(ByteBuffer.wrap(abyte0, i, j));
    }

    public static int zzA(int i, int j)
    {
        return zziz(i) + zziw(j);
    }

    public static int zzN(long l)
    {
        return zzQ(l);
    }

    public static int zzQ(long l)
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
            throw new IllegalArgumentException((new StringBuilder("UTF-8 length does not fit in int: ")).append((long)k + 0x100000000L).toString());
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
                j = l;
                k = i;
                if ('\uD800' <= c)
                {
                    j = l;
                    k = i;
                    if (c <= '\uDFFF')
                    {
                        if (Character.codePointAt(charsequence, i) < 0x10000)
                        {
                            throw new IllegalArgumentException((new StringBuilder("Unpaired surrogate at index ")).append(i).toString());
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
            break MISSING_BLOCK_LABEL_473;
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
                    throw new IllegalArgumentException((new StringBuilder("Unpaired surrogate at index ")).append(j1 - 1).toString());
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
        throw new ArrayIndexOutOfBoundsException((new StringBuilder("Failed writing ")).append(c).append(" at index ").append(i).toString());
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

    public static int zzai(boolean flag)
    {
        return 1;
    }

    public static int zzb(int i, zzwy zzwy1)
    {
        return (zziz(i) << 1) + zzd(zzwy1);
    }

    public static zzwr zzb(byte abyte0[], int i, int j)
    {
        return new zzwr(abyte0, i, j);
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
            break MISSING_BLOCK_LABEL_295;
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
                throw new IllegalArgumentException((new StringBuilder("Unpaired surrogate at index ")).append(j - 1).toString());
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
        return zziz(i) + zzg(f);
    }

    public static int zzc(int i, zzwy zzwy1)
    {
        return zziz(i) + zze(zzwy1);
    }

    public static int zzc(int i, boolean flag)
    {
        return zziz(i) + zzai(flag);
    }

    public static int zzd(int i, long l)
    {
        return zziz(i) + zzN(l);
    }

    public static int zzd(zzwy zzwy1)
    {
        return zzwy1.zzvY();
    }

    public static int zzdM(String s)
    {
        int i = zza(s);
        return i + zziB(i);
    }

    public static int zze(zzwy zzwy1)
    {
        int i = zzwy1.zzvY();
        return i + zziB(i);
    }

    public static int zzg(float f)
    {
        return 4;
    }

    public static int zziB(int i)
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

    public static int zziw(int i)
    {
        if (i >= 0)
        {
            return zziB(i);
        } else
        {
            return 10;
        }
    }

    public static int zziz(int i)
    {
        return zziB(zzxb.zzD(i, 0));
    }

    public static int zzj(int i, String s)
    {
        return zziz(i) + zzdM(s);
    }

    public static zzwr zzu(byte abyte0[])
    {
        return zzb(abyte0, 0, abyte0.length);
    }

    public final void zzC(int i, int j)
    {
        zziA(zzxb.zzD(i, j));
    }

    public final void zzL(long l)
    {
        zzP(l);
    }

    public final void zzP(long l)
    {
        do
        {
            if ((-128L & l) == 0L)
            {
                zziy((int)l);
                return;
            }
            zziy((int)l & 0x7f | 0x80);
            l >>>= 7;
        } while (true);
    }

    public final void zza(int i, zzwy zzwy1)
    {
        zzC(i, 2);
        zzc(zzwy1);
    }

    public final void zzah(boolean flag)
    {
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        zziy(i);
    }

    public final void zzb(byte byte0)
    {
        if (!zzaHA.hasRemaining())
        {
            throw new zza(zzaHA.position(), zzaHA.limit());
        } else
        {
            zzaHA.put(byte0);
            return;
        }
    }

    public final void zzb(int i, float f)
    {
        zzC(i, 5);
        zzf(f);
    }

    public final void zzb(int i, long l)
    {
        zzC(i, 0);
        zzL(l);
    }

    public final void zzb(int i, String s)
    {
        zzC(i, 2);
        zzdL(s);
    }

    public final void zzb(int i, boolean flag)
    {
        zzC(i, 0);
        zzah(flag);
    }

    public final void zzb(zzwy zzwy1)
    {
        zzwy1.zza(this);
    }

    public final void zzc(zzwy zzwy1)
    {
        zziA(zzwy1.zzvX());
        zzwy1.zza(this);
    }

    public final void zzc(byte abyte0[], int i, int j)
    {
        if (zzaHA.remaining() >= j)
        {
            zzaHA.put(abyte0, i, j);
            return;
        } else
        {
            throw new zza(zzaHA.position(), zzaHA.limit());
        }
    }

    public final void zzdL(String s)
    {
        try
        {
            int i = zziB(s.length());
            if (i == zziB(s.length() * 3))
            {
                int j = zzaHA.position();
                zzaHA.position(j + i);
                zza(s, zzaHA);
                int k = zzaHA.position();
                zzaHA.position(j);
                zziA(k - j - i);
                zzaHA.position(k);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new zza(zzaHA.position(), zzaHA.limit());
        }
        zziA(zza(s));
        zza(s, zzaHA);
        return;
    }

    public final void zzf(float f)
    {
        zziC(Float.floatToIntBits(f));
    }

    public final void zziA(int i)
    {
        do
        {
            if ((i & 0xffffff80) == 0)
            {
                zziy(i);
                return;
            }
            zziy(i & 0x7f | 0x80);
            i >>>= 7;
        } while (true);
    }

    public final void zziC(int i)
    {
        zziy(i & 0xff);
        zziy(i >> 8 & 0xff);
        zziy(i >> 16 & 0xff);
        zziy(i >>> 24);
    }

    public final void zziu(int i)
    {
        if (i >= 0)
        {
            zziA(i);
            return;
        } else
        {
            zzP(i);
            return;
        }
    }

    public final void zziy(int i)
    {
        zzb((byte)i);
    }

    public final int zzvJ()
    {
        return zzaHA.remaining();
    }

    public final void zzx(byte abyte0[])
    {
        zzc(abyte0, 0, abyte0.length);
    }

    public final void zzy(int i, int j)
    {
        zzC(i, 0);
        zziu(j);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.internal.zzrx;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;

final class bzp
    implements bzo
{

    private zzrx a;
    private byte b[];

    public bzp()
    {
        a();
    }

    public final void a()
    {
        b = new byte[239];
        byte abyte0[] = b;
        a = new zzrx(abyte0, abyte0.length);
    }

    public final void a(int i, long l)
    {
        zzrx zzrx1 = a;
        zzrx1.a(i, 0);
        do
        {
            if ((-128L & l) == 0L)
            {
                zzrx1.a((int)l);
                return;
            }
            zzrx1.a((int)l & 0x7f | 0x80);
            l >>>= 7;
        } while (true);
    }

    public final void a(int i, String s)
    {
        Object obj;
        int k;
        k = 0;
        obj = a;
        ((zzrx) (obj)).a(i, 2);
        int j;
        i = zzrx.c(s.length());
        if (i != zzrx.c(s.length() * 3))
        {
            break MISSING_BLOCK_LABEL_166;
        }
        j = ((zzrx) (obj)).a.position();
        if (((zzrx) (obj)).a.remaining() < i)
        {
            throw new com.google.android.gms.internal.zzrx.zza(j + i, ((zzrx) (obj)).a.limit());
        }
        try
        {
            ((zzrx) (obj)).a.position(j + i);
            zzrx.a(s, ((zzrx) (obj)).a);
            k = ((zzrx) (obj)).a.position();
            ((zzrx) (obj)).a.position(j);
            ((zzrx) (obj)).b(k - j - i);
            ((zzrx) (obj)).a.position(k);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            obj = new com.google.android.gms.internal.zzrx.zza(((zzrx) (obj)).a.position(), ((zzrx) (obj)).a.limit());
            ((com.google.android.gms.internal.zzrx.zza) (obj)).initCause(s);
            throw obj;
        }
        int i1 = s.length();
        j = 0;
_L2:
        if (j >= i1)
        {
            break; /* Loop/switch isn't completed */
        }
        if (s.charAt(j) >= '\200')
        {
            break; /* Loop/switch isn't completed */
        }
        j++;
        if (true) goto _L2; else goto _L1
_L5:
        if (j >= i1) goto _L4; else goto _L3
_L3:
        int l = s.charAt(j);
label0:
        {
            if (l >= '\u0800')
            {
                break label0;
            }
            i += 127 - l >>> 31;
            j++;
        }
          goto _L5
        int k1 = s.length();
_L6:
        if (j >= k1)
        {
            break MISSING_BLOCK_LABEL_457;
        }
        char c = s.charAt(j);
        int j1;
        if (c < '\u0800')
        {
            k += 127 - c >>> 31;
            l = j;
            break MISSING_BLOCK_LABEL_435;
        }
        j1 = k + 2;
        k = j1;
        l = j;
        if ('\uD800' > c)
        {
            break MISSING_BLOCK_LABEL_435;
        }
        k = j1;
        l = j;
        if (c > '\uDFFF')
        {
            break MISSING_BLOCK_LABEL_435;
        }
        if (Character.codePointAt(s, j) < 0x10000)
        {
            throw new IllegalArgumentException((new StringBuilder("Unpaired surrogate at index ")).append(j).toString());
        }
        break MISSING_BLOCK_LABEL_444;
_L4:
        for (; i >= i1; i = k + i)
        {
            break MISSING_BLOCK_LABEL_412;
        }

        throw new IllegalArgumentException((new StringBuilder("UTF-8 length does not fit in int: ")).append((long)i + 0x100000000L).toString());
        ((zzrx) (obj)).b(i);
        zzrx.a(s, ((zzrx) (obj)).a);
        return;
_L1:
        i = i1;
          goto _L5
_L7:
        j = l + 1;
          goto _L6
        l = j + 1;
        k = j1;
          goto _L7
    }

    public final byte[] b()
    {
        int i = a.a.remaining();
        if (i < 0)
        {
            throw new IOException();
        }
        if (i == 0)
        {
            return b;
        } else
        {
            byte abyte0[] = new byte[b.length - i];
            System.arraycopy(b, 0, abyte0, 0, abyte0.length);
            return abyte0;
        }
    }
}

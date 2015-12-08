// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.engines;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.params.KeyParameter;

// Referenced classes of package org.spongycastle.crypto.engines:
//            DESEngine

public class DESedeEngine extends DESEngine
{

    private int a[];
    private int b[];
    private int c[];
    private boolean d;

    public DESedeEngine()
    {
        a = null;
        b = null;
        c = null;
    }

    public final int a(byte abyte0[], int i, byte abyte1[], int j)
    {
        if (a == null)
        {
            throw new IllegalStateException("DESede engine not initialised");
        }
        if (i + 8 > abyte0.length)
        {
            throw new DataLengthException("input buffer too short");
        }
        if (j + 8 > abyte1.length)
        {
            throw new DataLengthException("output buffer too short");
        }
        byte abyte2[] = new byte[8];
        if (d)
        {
            a(a, abyte0, i, abyte2, 0);
            a(b, abyte2, 0, abyte2, 0);
            a(c, abyte2, 0, abyte1, j);
            return 8;
        } else
        {
            a(c, abyte0, i, abyte2, 0);
            a(b, abyte2, 0, abyte2, 0);
            a(a, abyte2, 0, abyte1, j);
            return 8;
        }
    }

    public final String a()
    {
        return "DESede";
    }

    public final void a(boolean flag, CipherParameters cipherparameters)
    {
        if (!(cipherparameters instanceof KeyParameter))
        {
            throw new IllegalArgumentException((new StringBuilder("invalid parameter passed to DESede init - ")).append(cipherparameters.getClass().getName()).toString());
        }
        cipherparameters = ((KeyParameter)cipherparameters).a();
        if (cipherparameters.length != 24 && cipherparameters.length != 16)
        {
            throw new IllegalArgumentException("key size must be 16 or 24 bytes.");
        }
        d = flag;
        byte abyte0[] = new byte[8];
        System.arraycopy(cipherparameters, 0, abyte0, 0, 8);
        a = a(flag, abyte0);
        abyte0 = new byte[8];
        System.arraycopy(cipherparameters, 8, abyte0, 0, 8);
        boolean flag1;
        if (!flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        b = a(flag1, abyte0);
        if (cipherparameters.length == 24)
        {
            byte abyte1[] = new byte[8];
            System.arraycopy(cipherparameters, 16, abyte1, 0, 8);
            c = a(flag, abyte1);
            return;
        } else
        {
            c = a;
            return;
        }
    }

    public final int b()
    {
        return 8;
    }

    public final void c()
    {
    }
}

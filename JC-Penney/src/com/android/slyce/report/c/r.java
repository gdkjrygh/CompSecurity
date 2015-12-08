// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.c;

import com.android.slyce.report.a.c.f;
import com.android.slyce.report.a.c.g;
import com.android.slyce.report.a.d.e;
import java.io.OutputStream;
import java.nio.ByteBuffer;

// Referenced classes of package com.android.slyce.report.c:
//            m, p, q, n

class r extends OutputStream
{

    final m a;

    private r(m m1)
    {
        a = m1;
        super();
    }

    r(m m1, n n)
    {
        this(m1);
    }

    public void close()
    {
        try
        {
            m.c(a).a(e.b, m.c(), true);
            return;
        }
        catch (g g1)
        {
            throw new q(a, g1);
        }
        catch (f f1)
        {
            throw new q(a, f1);
        }
    }

    public void write(int i)
    {
        write(new byte[] {
            (byte)i
        }, 0, 1);
    }

    public void write(byte abyte0[])
    {
        write(abyte0, 0, abyte0.length);
    }

    public void write(byte abyte0[], int i, int j)
    {
        abyte0 = ByteBuffer.wrap(abyte0, i, j);
        try
        {
            m.c(a).a(e.b, abyte0, false);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new q(a, abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new q(a, abyte0);
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.ByteArrayOutputStream;

public final class krp extends ByteArrayOutputStream
{

    private final lfa a;

    public krp(lfa lfa1, int i)
    {
        a = lfa1;
        buf = a.a(Math.max(i, 256));
    }

    private void a(int i)
    {
        if (count + i <= buf.length)
        {
            return;
        } else
        {
            byte abyte0[] = a.a(count + i << 1);
            System.arraycopy(buf, 0, abyte0, 0, count);
            a.a(buf);
            buf = abyte0;
            return;
        }
    }

    public final void close()
    {
        a.a(buf);
        buf = null;
        super.close();
    }

    public final void finalize()
    {
        a.a(buf);
    }

    public final void write(int i)
    {
        this;
        JVM INSTR monitorenter ;
        a(1);
        super.write(i);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void write(byte abyte0[], int i, int j)
    {
        this;
        JVM INSTR monitorenter ;
        a(j);
        super.write(abyte0, i, j);
        this;
        JVM INSTR monitorexit ;
        return;
        abyte0;
        throw abyte0;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package crittercism.android:
//            e, c, dx

public final class t extends InputStream
{

    private final InputStream a;
    private final e b;
    private final c c;

    public t(InputStream inputstream, e e1, c c1)
    {
        if (inputstream == null)
        {
            throw new NullPointerException("delegate was null");
        }
        if (e1 == null)
        {
            throw new NullPointerException("dispatch was null");
        }
        if (c1 == null)
        {
            throw new NullPointerException("stats were null");
        } else
        {
            a = inputstream;
            b = e1;
            c = c1;
            return;
        }
    }

    private void a(int i, int j)
    {
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        if (i == -1)
        {
            try
            {
                b.a(c);
                return;
            }
            catch (ThreadDeath threaddeath)
            {
                throw threaddeath;
            }
            catch (Throwable throwable)
            {
                dx.a(throwable);
            }
            break MISSING_BLOCK_LABEL_42;
        }
        c.a(j);
        return;
    }

    private void a(Exception exception)
    {
        try
        {
            c.a(exception);
            b.a(c);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            throw exception;
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            dx.a(exception);
        }
    }

    public final int available()
    {
        return a.available();
    }

    public final void close()
    {
        a.close();
    }

    public final void mark(int i)
    {
        a.mark(i);
    }

    public final boolean markSupported()
    {
        return a.markSupported();
    }

    public final int read()
    {
        int i;
        try
        {
            i = a.read();
        }
        catch (IOException ioexception)
        {
            a(ioexception);
            throw ioexception;
        }
        a(i, 1);
        return i;
    }

    public final int read(byte abyte0[])
    {
        int i;
        try
        {
            i = a.read(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            a(abyte0);
            throw abyte0;
        }
        a(i, i);
        return i;
    }

    public final int read(byte abyte0[], int i, int j)
    {
        try
        {
            i = a.read(abyte0, i, j);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            a(abyte0);
            throw abyte0;
        }
        a(i, i);
        return i;
    }

    public final void reset()
    {
        this;
        JVM INSTR monitorenter ;
        a.reset();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final long skip(long l)
    {
        l = a.skip(l);
        try
        {
            if (c != null)
            {
                c.a(l);
            }
        }
        catch (ThreadDeath threaddeath)
        {
            throw threaddeath;
        }
        catch (Throwable throwable)
        {
            dx.a(throwable);
            return l;
        }
        return l;
    }
}

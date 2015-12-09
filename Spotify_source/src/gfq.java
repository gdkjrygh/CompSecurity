// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.StatFs;
import java.io.IOException;

public final class gfq
{

    public StatFs a;

    public gfq()
    {
    }

    public gfq(String s)
    {
        try
        {
            a = new StatFs(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IOException(s.getMessage());
        }
    }

    public final long a()
    {
        if (gcl.h)
        {
            return a.getBlockSizeLong();
        } else
        {
            return (long)a.getBlockSize();
        }
    }

    public final void a(String s)
    {
        try
        {
            if (a == null)
            {
                a = new StatFs(s);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IOException(s.getMessage());
        }
        a.restat(s);
        return;
    }

    public final long b()
    {
        long l;
        if (gcl.h)
        {
            l = a.getAvailableBlocksLong();
        } else
        {
            l = a.getAvailableBlocks();
        }
        return l * a();
    }
}

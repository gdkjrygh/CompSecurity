// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import android.os.Environment;
import android.os.StatFs;
import java.io.File;
import java.math.BigInteger;

// Referenced classes of package b.a:
//            bj

public final class bv
    implements bj
{

    private String a;

    public bv()
    {
        a = null;
        try
        {
            BigInteger.valueOf(-1L);
            StatFs statfs = new StatFs(Environment.getDataDirectory().getPath());
            a = BigInteger.valueOf(statfs.getBlockCount()).multiply(BigInteger.valueOf(statfs.getBlockSize())).toString();
            return;
        }
        catch (ThreadDeath threaddeath)
        {
            throw threaddeath;
        }
        catch (Throwable throwable)
        {
            a = null;
        }
    }

    public final String a()
    {
        return "disk_space_total";
    }

    public final volatile Object b()
    {
        return a;
    }
}

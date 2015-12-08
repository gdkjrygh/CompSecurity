// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.io.File;

// Referenced classes of package bo.app:
//            ia, ig, ku, if

public final class id extends ia
{

    public id(File file)
    {
        this(file, ((if) (new ig())), 0x200000);
    }

    public id(File file, if if1, int i)
    {
        super(file, if1, i);
        if (i < 0x200000)
        {
            ku.c("You set too small disc cache size (less than %1$d Mb)", new Object[] {
                Integer.valueOf(2)
            });
        }
    }

    protected final int b(File file)
    {
        return (int)file.length();
    }
}

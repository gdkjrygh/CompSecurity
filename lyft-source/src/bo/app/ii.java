// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.io.File;

// Referenced classes of package bo.app:
//            if, il, kz, ik

public final class ii extends if
{

    public ii(File file)
    {
        this(file, ((ik) (new il())), 0x200000);
    }

    public ii(File file, ik ik, int i)
    {
        super(file, ik, i);
        if (i < 0x200000)
        {
            kz.c("You set too small disc cache size (less than %1$d Mb)", new Object[] {
                Integer.valueOf(2)
            });
        }
    }

    protected final int b(File file)
    {
        return (int)file.length();
    }
}

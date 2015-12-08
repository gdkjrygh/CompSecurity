// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.io.File;

// Referenced classes of package bo.app:
//            hz, if, kt, ie

public final class ic extends hz
{

    public ic(File file)
    {
        this(file, ((ie) (new if())), 0x200000);
    }

    public ic(File file, ie ie, int i)
    {
        super(file, ie, i);
        if (i < 0x200000)
        {
            kt.c("You set too small disc cache size (less than %1$d Mb)", new Object[] {
                Integer.valueOf(2)
            });
        }
    }

    protected final int b(File file)
    {
        return (int)file.length();
    }
}

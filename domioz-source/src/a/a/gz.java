// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import java.io.File;

// Referenced classes of package a.a:
//            gw, hd, js, hc

public final class gz extends gw
{

    public gz(File file)
    {
        this(file, ((hc) (new hd())), 0x200000);
    }

    public gz(File file, hc hc, int i)
    {
        super(file, hc, i);
        if (i < 0x200000)
        {
            js.c("You set too small disc cache size (less than %1$d Mb)", new Object[] {
                Integer.valueOf(2)
            });
        }
    }

    protected final int b(File file)
    {
        return (int)file.length();
    }
}

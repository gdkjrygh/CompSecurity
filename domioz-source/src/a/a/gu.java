// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import java.io.File;

// Referenced classes of package a.a:
//            gv, hc

public abstract class gu
    implements gv
{

    protected File a;
    private hc b;

    public gu(File file, hc hc1)
    {
        if (file == null)
        {
            throw new IllegalArgumentException(String.format("\"%s\" argument must be not null", new Object[] {
                "cacheDir"
            }));
        }
        if (hc1 == null)
        {
            throw new IllegalArgumentException(String.format("\"%s\" argument must be not null", new Object[] {
                "fileNameGenerator"
            }));
        } else
        {
            a = file;
            b = hc1;
            return;
        }
    }

    public File a(String s)
    {
        s = b.a(s);
        return new File(a, s);
    }
}

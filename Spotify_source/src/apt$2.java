// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.File;

final class ang.Object
    implements Runnable
{

    private File a[];

    public final void run()
    {
        File afile[] = a;
        int j = afile.length;
        for (int i = 0; i < j; i++)
        {
            afile[i].delete();
        }

    }

    (File afile[])
    {
        a = afile;
        super();
    }
}

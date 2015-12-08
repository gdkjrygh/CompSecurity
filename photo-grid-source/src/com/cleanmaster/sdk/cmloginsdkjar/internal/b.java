// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.sdk.cmloginsdkjar.internal;

import java.io.File;

// Referenced classes of package com.cleanmaster.sdk.cmloginsdkjar.internal:
//            FileLruCache

final class b
    implements Runnable
{

    final File a[];
    final FileLruCache b;

    b(FileLruCache filelrucache, File afile[])
    {
        b = filelrucache;
        a = afile;
        super();
    }

    public final void run()
    {
        File afile[] = a;
        int j = afile.length;
        for (int i = 0; i < j; i++)
        {
            afile[i].delete();
        }

    }
}

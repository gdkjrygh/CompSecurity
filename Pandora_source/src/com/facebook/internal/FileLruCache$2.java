// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import java.io.File;

// Referenced classes of package com.facebook.internal:
//            FileLruCache

class val.filesToDelete
    implements Runnable
{

    final FileLruCache this$0;
    final File val$filesToDelete[];

    public void run()
    {
        File afile[] = val$filesToDelete;
        int j = afile.length;
        for (int i = 0; i < j; i++)
        {
            afile[i].delete();
        }

    }

    ()
    {
        this$0 = final_filelrucache;
        val$filesToDelete = _5B_Ljava.io.File_3B_.this;
        super();
    }
}

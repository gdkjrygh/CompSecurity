// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.moodstocks.android.advanced;

import com.moodstocks.android.Result;
import com.moodstocks.android.Scanner;
import com.moodstocks.android.core.Loader;

// Referenced classes of package com.moodstocks.android.advanced:
//            Image

public class ApiSearcher
{

    private long ptr;
    private int status;

    public ApiSearcher(Scanner scanner)
    {
        ptr = 0L;
        status = 0;
        init_native(scanner);
    }

    private native void cancel_native();

    private native void destroy();

    private static native void init();

    private native void init_native(Scanner scanner);

    private native Result search_native(Image image);

    public void cancel()
    {
        switch (status)
        {
        default:
            return;

        case 0: // '\0'
            destroy();
            status = 2;
            return;

        case 1: // '\001'
            cancel_native();
            break;
        }
    }

    public int getStatus()
    {
        return status;
    }

    public Result search(Image image)
    {
        if (status != 0)
        {
            return null;
        } else
        {
            status = 1;
            image = search_native(image);
            status = 2;
            return image;
        }
    }

    static 
    {
        Loader.load();
        if (Scanner.isCompatible())
        {
            init();
        }
    }
}

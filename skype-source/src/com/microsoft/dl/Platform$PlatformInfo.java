// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.dl;

import android.content.Context;
import android.os.Environment;
import java.io.File;

// Referenced classes of package com.microsoft.dl:
//            Platform

public static class a
{

    private final File a;
    private final File b = Environment.getExternalStorageDirectory();

    public final File getCacheDir()
    {
        return a;
    }

    public final File getStorageDir()
    {
        return b;
    }

    public final String toString()
    {
        return (new StringBuilder()).append(getClass().getSimpleName()).append(" [cacheDir=").append(a).append(", storageDir=").append(b).append("]").toString();
    }

    public (Context context)
    {
        if (context != null)
        {
            context = context.getCacheDir();
        } else
        {
            context = Platform.a();
        }
        a = context;
    }
}

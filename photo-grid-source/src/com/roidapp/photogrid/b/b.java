// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.b;

import android.content.Context;
import java.io.File;

final class b
{

    public static File a(Context context)
    {
        File file;
        File file1;
        file1 = null;
        file = null;
        if (context != null) goto _L2; else goto _L1
_L1:
        return file;
_L2:
        int i;
        i = 0;
        file = file1;
_L5:
        if (i >= 3) goto _L1; else goto _L3
_L3:
        file1 = context.getFilesDir();
        file = file1;
        if (file1 != null) goto _L1; else goto _L4
_L4:
        try
        {
            Thread.sleep(166L);
        }
        catch (InterruptedException interruptedexception) { }
        i++;
        file = file1;
          goto _L5
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import java.io.File;

// Referenced classes of package com.facebook.internal:
//            y

final class aa
    implements Runnable
{

    final File a[];
    final y b;

    aa(y y, File afile[])
    {
        b = y;
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

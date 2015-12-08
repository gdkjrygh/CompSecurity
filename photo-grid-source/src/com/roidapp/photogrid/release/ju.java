// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import java.io.File;
import java.util.Comparator;

// Referenced classes of package com.roidapp.photogrid.release:
//            ImageSelector

final class ju
    implements Comparator
{

    final ImageSelector a;

    ju(ImageSelector imageselector)
    {
        a = imageselector;
        super();
    }

    public final int compare(Object obj, Object obj1)
    {
        long l = ((File)obj).lastModified();
        long l1 = ((File)obj1).lastModified();
        if (l == l1)
        {
            return 0;
        }
        return l <= l1 ? 1 : -1;
    }
}

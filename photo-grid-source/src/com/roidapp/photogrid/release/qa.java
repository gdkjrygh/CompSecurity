// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import java.io.File;
import java.util.Comparator;

// Referenced classes of package com.roidapp.photogrid.release:
//            PickFolder

final class qa
    implements Comparator
{

    final PickFolder a;

    qa(PickFolder pickfolder)
    {
        a = pickfolder;
        super();
    }

    public final int compare(Object obj, Object obj1)
    {
        long l = ((File)obj).lastModified();
        long l1 = ((File)obj1).lastModified();
        if (l > l1)
        {
            return -1;
        }
        return l != l1 ? 1 : 0;
    }
}

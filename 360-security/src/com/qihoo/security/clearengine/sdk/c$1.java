// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.clearengine.sdk;

import com.qihoo360.mobilesafe.opti.i.trashclear.TrashInfo;
import java.util.Comparator;

// Referenced classes of package com.qihoo.security.clearengine.sdk:
//            c

class ar.TrashInfo
    implements Comparator
{

    public int a(TrashInfo trashinfo, TrashInfo trashinfo1)
    {
        if (trashinfo != null && trashinfo1 != null)
        {
            if (trashinfo.size > trashinfo1.size)
            {
                return -1;
            }
            if (trashinfo.size < trashinfo1.size)
            {
                return 1;
            }
        }
        return 0;
    }

    public int compare(Object obj, Object obj1)
    {
        return a((TrashInfo)obj, (TrashInfo)obj1);
    }

    ar.TrashInfo()
    {
    }
}

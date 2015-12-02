// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.filemanager;

import java.util.Comparator;

// Referenced classes of package com.qihoo.security.opti.trashclear.filemanager:
//            FileBrowseActivity, d

private abstract class <init>
    implements Comparator
{

    private boolean a;
    final FileBrowseActivity b;

    protected abstract int a(d d1, d d2);

    public int b(d d1, d d2)
    {
        int i = 1;
        byte byte1 = -1;
        if (d1.d == d2.d)
        {
            i = a(d1, d2);
        } else
        if (a)
        {
            if (!d1.d)
            {
                return -1;
            }
        } else
        {
            byte byte0;
            if (d1.d)
            {
                byte0 = byte1;
            } else
            {
                byte0 = 1;
            }
            return byte0;
        }
        return i;
    }

    public int compare(Object obj, Object obj1)
    {
        return b((d)obj, (d)obj1);
    }

    private I(FileBrowseActivity filebrowseactivity)
    {
        b = filebrowseactivity;
        super();
    }

    b(FileBrowseActivity filebrowseactivity, b b1)
    {
        this(filebrowseactivity);
    }
}

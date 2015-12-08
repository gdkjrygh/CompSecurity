// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create;

import java.io.File;
import java.util.Comparator;

class this._cls1
    implements Comparator
{

    final compare this$1;

    public int compare(File file, File file1)
    {
        if (file1.lastModified() > file.lastModified())
        {
            return 1;
        }
        return file1.lastModified() >= file.lastModified() ? 0 : -1;
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((File)obj, (File)obj1);
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}

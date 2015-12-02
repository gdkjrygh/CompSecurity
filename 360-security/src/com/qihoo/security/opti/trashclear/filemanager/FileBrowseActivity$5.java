// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.filemanager;

import android.os.Handler;
import com.qihoo360.mobilesafe.opti.i.trashclear.TrashInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.qihoo.security.opti.trashclear.filemanager:
//            FileBrowseActivity, d, e

class a
    implements Runnable
{

    final ArrayList a;
    final FileBrowseActivity b;

    public void run()
    {
        Iterator iterator;
        long l;
        iterator = a.iterator();
        l = 0L;
_L5:
        Object obj;
        long l1;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (d)iterator.next();
        l1 = l;
        if (!((d) (obj)).g)
        {
            break MISSING_BLOCK_LABEL_115;
        }
        if (!((d) (obj)).d) goto _L2; else goto _L1
_L1:
        l1 = e.b(new File(((d) (obj)).b));
        l += l1;
_L3:
        e.b(((d) (obj)).b);
        continue; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        exception.printStackTrace();
        if (true) goto _L3; else goto _L2
_L2:
        obj = new File(((d) (obj)).b);
        l1 = l + ((File) (obj)).length();
        ((File) (obj)).delete();
        l = l1;
        if (true) goto _L5; else goto _L4
_L4:
        if (FileBrowseActivity.y != null)
        {
            FileBrowseActivity.y.size = FileBrowseActivity.y.size - l;
        }
        FileBrowseActivity.j(b).sendEmptyMessage(3);
        return;
    }

    I(FileBrowseActivity filebrowseactivity, ArrayList arraylist)
    {
        b = filebrowseactivity;
        a = arraylist;
        super();
    }
}

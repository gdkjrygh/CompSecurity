// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.filemanager;

import android.os.Handler;
import android.os.Message;
import java.io.File;
import java.util.ArrayList;

// Referenced classes of package com.qihoo.security.opti.trashclear.filemanager:
//            FileBrowseActivity, a, e, d

class a
    implements Runnable
{

    final String a;
    final FileBrowseActivity b;

    public void run()
    {
        ArrayList arraylist;
        Object obj;
        File afile[];
        int i;
        int j;
        File file = new File(a);
        if (!file.exists() || !file.isDirectory())
        {
            FileBrowseActivity.j(b).obtainMessage(1).sendToTarget();
            return;
        }
        arraylist = new ArrayList();
        arraylist.clear();
        obj = file.getAbsolutePath();
        afile = file.listFiles();
        if (afile == null)
        {
            obj = FileBrowseActivity.j(b).obtainMessage(1);
            obj.obj = arraylist;
            ((Message) (obj)).sendToTarget();
            return;
        }
        j = afile.length;
        i = 0;
_L3:
        File file1;
        String s;
        String s1;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        file1 = afile[i];
        s = (new StringBuilder()).append(((String) (obj))).append(File.separator).append(file1.getName()).toString();
        s1 = s.toLowerCase();
          goto _L1
_L5:
        i++;
        if (true) goto _L3; else goto _L2
_L1:
        if (!file1.isFile() && (FileBrowseActivity.h(b).e(s1) || !FileBrowseActivity.h(b).f(s1))) goto _L5; else goto _L4
_L4:
        if (!FileBrowseActivity.k(b) || !file1.isFile()) goto _L7; else goto _L6
_L6:
        boolean flag;
        if (Math.abs(FileBrowseActivity.l(b) - file1.lastModified()) > FileBrowseActivity.m(b))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (FileBrowseActivity.n(b) && flag || !FileBrowseActivity.n(b) && !flag) goto _L5; else goto _L7
_L7:
        Object obj1 = new File(s);
        if (e.a(((File) (obj1))))
        {
            obj1 = e.a(((File) (obj1)), e.a);
            if (file1.isDirectory())
            {
                String as[] = (new File(s)).list();
                if (as != null)
                {
                    obj1.e = as.length;
                } else
                {
                    obj1.e = 0;
                }
            }
            if (obj1 != null)
            {
                arraylist.add(obj1);
            }
        }
          goto _L5
_L2:
        Message message = FileBrowseActivity.j(b).obtainMessage(1);
        message.obj = arraylist;
        message.sendToTarget();
        return;
    }

    I(FileBrowseActivity filebrowseactivity, String s)
    {
        b = filebrowseactivity;
        a = s;
        super();
    }
}

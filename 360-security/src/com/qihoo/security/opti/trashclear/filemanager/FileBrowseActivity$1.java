// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.filemanager;

import android.os.Handler;
import android.os.Message;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.qihoo.security.dialog.g;
import java.util.ArrayList;

// Referenced classes of package com.qihoo.security.opti.trashclear.filemanager:
//            FileBrowseActivity, a, d

class a extends Handler
{

    final FileBrowseActivity a;

    public void handleMessage(Message message)
    {
        if (!a.isFinishing()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        FileBrowseActivity.a(a).setVisibility(8);
        message.what;
        JVM INSTR tableswitch 0 4: default 60
    //                   0 95
    //                   1 105
    //                   2 60
    //                   3 204
    //                   4 227;
           goto _L3 _L4 _L5 _L3 _L6 _L7
_L3:
        break; /* Loop/switch isn't completed */
_L4:
        break; /* Loop/switch isn't completed */
_L9:
        if (FileBrowseActivity.i(a) && FileBrowseActivity.c(a).size() > 0)
        {
            FileBrowseActivity.a(a).setVisibility(0);
            return;
        }
        if (true) goto _L1; else goto _L8
_L8:
        FileBrowseActivity.b(a);
          goto _L9
_L5:
        message = (ArrayList)message.obj;
        if (message != null)
        {
            FileBrowseActivity.c(a).clear();
            FileBrowseActivity.c(a).addAll(message);
            a.a(FileBrowseActivity.d(a));
            FileBrowseActivity filebrowseactivity = a;
            boolean flag;
            if (message.size() == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            FileBrowseActivity.a(filebrowseactivity, flag);
            FileBrowseActivity.e(a).notifyDataSetChanged();
        }
        FileBrowseActivity.f(a).setEnabled(true);
          goto _L9
_L6:
        com.qihoo.security.opti.trashclear.filemanager.FileBrowseActivity.g(a).dismiss();
        FileBrowseActivity.h(a).c();
          goto _L9
_L7:
        message = FileBrowseActivity.h(a).d();
        if (message == null) goto _L11; else goto _L10
_L10:
        int i = 0;
_L13:
        d d1;
        if (i >= FileBrowseActivity.c(a).size())
        {
            break; /* Loop/switch isn't completed */
        }
        d1 = (d)FileBrowseActivity.c(a).get(i);
          goto _L12
_L15:
        i++;
        if (true) goto _L13; else goto _L11
_L12:
        if (d1.d || !d1.b.equals(message)) goto _L15; else goto _L14
_L14:
        FileBrowseActivity.f(a).setSelection(i);
_L11:
        FileBrowseActivity.e(a).notifyDataSetChanged();
          goto _L9
    }

    I(FileBrowseActivity filebrowseactivity)
    {
        a = filebrowseactivity;
        super();
    }
}

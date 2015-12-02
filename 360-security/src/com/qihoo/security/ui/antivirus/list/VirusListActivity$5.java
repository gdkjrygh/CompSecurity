// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.antivirus.list;

import android.content.DialogInterface;
import android.view.KeyEvent;
import com.qihoo.security.dialog.i;
import com.qihoo360.mobilesafe.b.d;

// Referenced classes of package com.qihoo.security.ui.antivirus.list:
//            VirusListActivity

class a
    implements android.content.yListener
{

    final i a;
    final VirusListActivity b;

    public boolean onKey(DialogInterface dialoginterface, int i, KeyEvent keyevent)
    {
        boolean flag = false;
        if (i == 4)
        {
            VirusListActivity.b(b, false);
            d.b(a);
            flag = true;
        }
        return flag;
    }

    (VirusListActivity viruslistactivity, i i)
    {
        b = viruslistactivity;
        a = i;
        super();
    }
}

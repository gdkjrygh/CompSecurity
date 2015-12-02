// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.antivirus.list;

import android.content.DialogInterface;
import android.view.KeyEvent;
import com.qihoo.security.ui.antivirus.a;
import com.qihoo360.mobilesafe.b.d;

// Referenced classes of package com.qihoo.security.ui.antivirus.list:
//            VirusListActivity

class a
    implements android.content.Listener
{

    final a a;
    final VirusListActivity b;

    public boolean onKey(DialogInterface dialoginterface, int i, KeyEvent keyevent)
    {
        if (i == 4)
        {
            d.b(a);
            return true;
        } else
        {
            return false;
        }
    }

    (VirusListActivity viruslistactivity, a a1)
    {
        b = viruslistactivity;
        a = a1;
        super();
    }
}

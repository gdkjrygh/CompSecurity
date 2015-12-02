// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.antivirus.list;

import android.view.View;
import com.qihoo.security.dialog.i;
import com.qihoo360.mobilesafe.b.d;

// Referenced classes of package com.qihoo.security.ui.antivirus.list:
//            VirusListActivity

class a
    implements android.view.
{

    final i a;
    final VirusListActivity b;

    public void onClick(View view)
    {
        com.qihoo.security.ui.antivirus.list.VirusListActivity.i(b);
        d.b(a);
    }

    (VirusListActivity viruslistactivity, i i)
    {
        b = viruslistactivity;
        a = i;
        super();
    }
}

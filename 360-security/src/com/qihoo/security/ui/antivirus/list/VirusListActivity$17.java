// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.antivirus.list;

import android.view.View;
import com.qihoo.security.opti.trashclear.ui.i;
import com.qihoo.security.support.b;
import com.qihoo.security.ui.antivirus.a;
import com.qihoo360.mobilesafe.b.d;
import com.qihoo360.mobilesafe.share.SharedPref;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.qihoo.security.ui.antivirus.list:
//            VirusListActivity, c

class b
    implements android.view.st.VirusListActivity._cls17
{

    final a a;
    final i b;
    final VirusListActivity c;

    public void onClick(View view)
    {
        if (!SharedPref.b(c.p, "setting_auto_start", true))
        {
            SharedPref.a(c.p, "setting_auto_start", true);
        }
        d.b(a);
        i j;
        for (view = VirusListActivity.h(c).h(b.a()).iterator(); view.hasNext(); com.qihoo.security.ui.antivirus.list.VirusListActivity.b(c, j))
        {
            j = (i)view.next();
        }

        com.qihoo.security.support.b.c(14019);
    }

    (VirusListActivity viruslistactivity, a a1, i j)
    {
        c = viruslistactivity;
        a = a1;
        b = j;
        super();
    }
}

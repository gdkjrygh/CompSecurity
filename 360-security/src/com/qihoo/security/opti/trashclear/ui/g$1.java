// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.ui;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import com.qihoo.security.dialog.j;
import com.qihoo360.mobilesafe.b.s;
import com.qihoo360.mobilesafe.opti.i.trashclear.TrashInfo;

// Referenced classes of package com.qihoo.security.opti.trashclear.ui:
//            g

static final class f
    implements android.widget.terView.OnItemClickListener
{

    final Context a;
    final String b;
    final String c;
    final TrashInfo d;
    final String e;
    final j f;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        i;
        JVM INSTR tableswitch 0 1: default 24
    //                   0 32
    //                   1 54;
           goto _L1 _L2 _L3
_L1:
        s.a(f);
        return;
_L2:
        g.a(a, b, c, d);
        continue; /* Loop/switch isn't completed */
_L3:
        g.a(a, e, c, d);
        if (true) goto _L1; else goto _L4
_L4:
    }

    TrashInfo(Context context, String s1, String s2, TrashInfo trashinfo, String s3, j j)
    {
        a = context;
        b = s1;
        c = s2;
        d = trashinfo;
        e = s3;
        f = j;
        super();
    }
}

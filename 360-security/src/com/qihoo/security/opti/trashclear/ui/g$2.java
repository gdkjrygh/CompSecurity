// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.ui;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import com.qihoo.security.dialog.j;
import com.qihoo360.mobilesafe.opti.i.trashclear.TrashInfo;
import java.util.List;

// Referenced classes of package com.qihoo.security.opti.trashclear.ui:
//            g

static final class e
    implements android.widget.terView.OnItemClickListener
{

    final Context a;
    final List b;
    final String c;
    final TrashInfo d;
    final j e;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        g.a(a, (String)b.get(i), c, d);
        if (e.isShowing())
        {
            e.dismiss();
        }
    }

    TrashInfo(Context context, List list, String s, TrashInfo trashinfo, j j1)
    {
        a = context;
        b = list;
        c = s;
        d = trashinfo;
        e = j1;
        super();
    }
}

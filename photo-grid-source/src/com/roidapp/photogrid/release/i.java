// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.view.View;
import android.widget.AdapterView;
import com.roidapp.baselib.view.FixedDrawerLayout;
import java.util.List;

// Referenced classes of package com.roidapp.photogrid.release:
//            c, StickerInfo

final class i
    implements android.widget.AdapterView.OnItemClickListener
{

    final c a;

    i(c c1)
    {
        a = c1;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int j, long l)
    {
        c.a(a, j);
        c.b(a, ((StickerInfo)c.h(a).get(j)).b);
        c.c(a).f(c.b(a));
    }
}

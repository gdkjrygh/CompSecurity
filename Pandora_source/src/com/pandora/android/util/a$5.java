// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.content.DialogInterface;
import android.widget.ListView;
import java.util.List;
import p.dj.a;

// Referenced classes of package com.pandora.android.util:
//            a

static final class b
    implements android.content.ogInterface.OnShowListener
{

    final List a;
    final ListView b;

    public void onShow(DialogInterface dialoginterface)
    {
        for (int i = 0; i < a.size(); i++)
        {
            b.setItemChecked(i, ((a)a.get(i)).f());
        }

    }

    ce(List list, ListView listview)
    {
        a = list;
        b = listview;
        super();
    }
}

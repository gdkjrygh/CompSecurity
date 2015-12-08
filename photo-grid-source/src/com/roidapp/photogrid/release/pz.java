// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

// Referenced classes of package com.roidapp.photogrid.release:
//            PickFolder

final class pz
    implements android.widget.AdapterView.OnItemClickListener
{

    final PickFolder a;

    pz(PickFolder pickfolder)
    {
        a = pickfolder;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (PickFolder.b(a).equals("/"))
        {
            PickFolder.a(a, (String)PickFolder.d(a).getItem(i));
        } else
        {
            PickFolder.a(a, (new StringBuilder("/")).append((String)PickFolder.d(a).getItem(i)).toString());
        }
        PickFolder.b(a, PickFolder.b(a));
    }
}

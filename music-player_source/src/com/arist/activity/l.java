// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.activity;

import android.view.ContextMenu;
import android.view.View;
import com.arist.a.e;
import com.arist.b.c;

// Referenced classes of package com.arist.activity:
//            MainActivity

final class l
    implements android.view.View.OnCreateContextMenuListener
{

    final MainActivity a;

    l(MainActivity mainactivity)
    {
        a = mainactivity;
        super();
    }

    public final void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        if (a.b == 3)
        {
            if (MainActivity.a(a).b(((android.widget.AdapterView.AdapterContextMenuInfo) (view = (android.widget.AdapterView.AdapterContextMenuInfo)contextmenuinfo)).position).d() != 1)
            {
                contextmenu.setHeaderTitle(0x7f090097);
                contextmenu.add(1, 0, 0, 0x7f0900c8);
                contextmenu.add(1, 1, 0, 0x7f0900c9);
                return;
            }
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex;

import android.support.v4.app.Fragment;
import android.support.v4.app.bb;
import android.view.ContextMenu;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package com.facebook.reflex:
//            j

class l extends bb
{

    final j a;

    l(j j1, ViewGroup viewgroup)
    {
        a = j1;
        super(viewgroup);
    }

    public void a(Fragment fragment)
    {
        a.a(fragment);
    }

    public void a(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        a.onCreateContextMenu(contextmenu, view, contextmenuinfo);
    }
}

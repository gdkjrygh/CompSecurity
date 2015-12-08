// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.database.Cursor;
import android.view.ContextMenu;
import android.view.View;
import android.widget.ListView;
import kik.android.util.af;

// Referenced classes of package kik.android.chat.fragment:
//            KikDefaultContactsListFragment

final class la
    implements android.view.View.OnCreateContextMenuListener
{

    final KikDefaultContactsListFragment a;

    la(KikDefaultContactsListFragment kikdefaultcontactslistfragment)
    {
        a = kikdefaultcontactslistfragment;
        super();
    }

    public final void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        view = (android.widget.AdapterView.AdapterContextMenuInfo)contextmenuinfo;
        for (view = ((View) (a.c.getItemAtPosition(((android.widget.AdapterView.AdapterContextMenuInfo) (view)).position))); (view instanceof af) || !(view instanceof Cursor);)
        {
            return;
        }

        view = (Cursor)view;
        contextmenu.setHeaderTitle(view.getString(view.getColumnIndex("suggest_text_1")));
        contextmenu.add(19582, 19583, 0, a.f());
    }
}

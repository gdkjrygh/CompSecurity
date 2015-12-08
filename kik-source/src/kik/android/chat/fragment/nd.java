// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.database.Cursor;
import android.view.ContextMenu;
import android.view.View;
import android.widget.ListView;
import kik.a.d.k;
import kik.android.util.af;

// Referenced classes of package kik.android.chat.fragment:
//            KikMultiselectContactsListFragment

final class nd
    implements android.view.View.OnCreateContextMenuListener
{

    final KikMultiselectContactsListFragment a;

    nd(KikMultiselectContactsListFragment kikmultiselectcontactslistfragment)
    {
        a = kikmultiselectcontactslistfragment;
        super();
    }

    public final void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        view = (android.widget.AdapterView.AdapterContextMenuInfo)contextmenuinfo;
        view = ((View) (a.c.getItemAtPosition(((android.widget.AdapterView.AdapterContextMenuInfo) (view)).position)));
        if (!(view instanceof af))
        {
            if (view instanceof Cursor)
            {
                view = (Cursor)view;
                contextmenu.setHeaderTitle(view.getString(view.getColumnIndex("suggest_text_1")));
                contextmenu.add(0, 0, 0, a.aa());
                return;
            }
            if (view instanceof k)
            {
                view = (k)view;
                if (view != null)
                {
                    contextmenu.setHeaderTitle(view.c());
                    contextmenu.add(0, 0, 0, a.aa());
                    return;
                }
            }
        }
    }
}

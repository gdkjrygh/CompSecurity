// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListAdapter;
import com.kik.l.ab;
import kik.a.d.a.a;
import kik.a.d.a.g;
import kik.a.d.d;
import kik.a.d.s;
import kik.a.e.v;
import kik.a.h.e;
import kik.android.f.a.f;
import kik.android.util.cq;
import kik.android.util.cv;
import kik.android.widget.ResizeEventList;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment

final class cu
    implements android.view.View.OnCreateContextMenuListener
{

    final KikChatFragment a;

    cu(KikChatFragment kikchatfragment)
    {
        a = kikchatfragment;
        super();
    }

    public final void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        boolean flag = true;
        contextmenuinfo = (android.widget.AdapterView.AdapterContextMenuInfo)contextmenuinfo;
        contextmenuinfo = (s)KikChatFragment.m(a).getAdapter().getItem(((android.widget.AdapterView.AdapterContextMenuInfo) (contextmenuinfo)).position);
        if (contextmenuinfo != null)
        {
            kik.android.chat.fragment.KikChatFragment.a(a, kik.android.chat.fragment.KikChatFragment.e(a));
            contextmenu.setHeaderTitle(cq.a(contextmenuinfo.e(), false).a);
            contextmenuinfo = (a)g.a(contextmenuinfo, kik/a/d/a/a);
            if (contextmenuinfo != null)
            {
                int i = contextmenuinfo.v();
                if ((i == kik.a.d.a.a.a.e || i == kik.a.d.a.a.a.a) && contextmenuinfo.g("allow-forward").equals("true"))
                {
                    contextmenu.add(0, 2, 1, 0x7f0902be);
                }
                if (!contextmenuinfo.x())
                {
                    if (f.d(contextmenuinfo))
                    {
                        java.io.File file = a.n.f(contextmenuinfo.o());
                        if ((file == null || !a.d.c(file)) && !kik.android.util.a.a(a.d, contextmenuinfo))
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        contextmenu.add(0, 4, 2, 0x7f090203).setEnabled(flag);
                    } else
                    if (f.c(contextmenuinfo))
                    {
                        d d1 = new d(null);
                        d1.a(contextmenuinfo.o());
                        if (kik.android.util.a.a().a(contextmenuinfo.o()) || e.a().a(d1) || kik.android.util.a.a(a.d, contextmenuinfo))
                        {
                            flag = false;
                        }
                        contextmenu.add(0, 4, 2, 0x7f090203).setEnabled(flag);
                    }
                }
            } else
            {
                contextmenu.add(0, 1, 0, 0x7f0902a6);
            }
            contextmenu.add(0, 3, 3, 0x7f0902a9);
            if (contextmenu.size() > 0)
            {
                cv.a(view);
                return;
            }
        }
    }
}

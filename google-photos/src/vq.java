// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Map;

class vq extends vr
{

    final Context a;
    Map b;
    Map c;

    vq(Context context, Object obj)
    {
        super(obj);
        a = context;
    }

    final MenuItem a(MenuItem menuitem)
    {
        if (menuitem instanceof fr)
        {
            fr fr1 = (fr)menuitem;
            if (b == null)
            {
                b = new jk();
            }
            MenuItem menuitem1 = (MenuItem)b.get(menuitem);
            menuitem = menuitem1;
            if (menuitem1 == null)
            {
                menuitem = b.a(a, fr1);
                b.put(fr1, menuitem);
            }
            return menuitem;
        } else
        {
            return menuitem;
        }
    }

    final SubMenu a(SubMenu submenu)
    {
label0:
        {
label1:
            {
                if (!(submenu instanceof fs))
                {
                    break label0;
                }
                fs fs1 = (fs)submenu;
                if (c == null)
                {
                    c = new jk();
                }
                SubMenu submenu1 = (SubMenu)c.get(fs1);
                submenu = submenu1;
                if (submenu1 == null)
                {
                    submenu = a;
                    if (android.os.Build.VERSION.SDK_INT < 14)
                    {
                        break label1;
                    }
                    submenu = new wp(submenu, fs1);
                    c.put(fs1, submenu);
                }
                return submenu;
            }
            throw new UnsupportedOperationException();
        }
        return submenu;
    }
}

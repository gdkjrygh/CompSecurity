// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ci;

import android.view.MenuItem;
import com.pandora.android.provider.b;
import com.pandora.radio.data.w;
import p.cm.j;

// Referenced classes of package p.ci:
//            d

class .Object
    implements com.android.widget.popupmenu.
{

    final int a;
    final d b;

    public boolean onMenuItemClick(MenuItem menuitem)
    {
        w w1 = (w)b.getItem(a);
        if (w1 == null)
        {
            return true;
        }
        j j1 = new j();
        p.cw.c c = b.a.b();
        String s = w1.b();
        if (w1.i() == com.pandora.radio.data.a)
        {
            menuitem = w1.f();
        } else
        {
            menuitem = w1.g();
        }
        j1.execute(new Object[] {
            c, s, menuitem, w1.a()
        });
        return true;
    }

    tem(d d1, int i)
    {
        b = d1;
        a = i;
        super();
    }
}

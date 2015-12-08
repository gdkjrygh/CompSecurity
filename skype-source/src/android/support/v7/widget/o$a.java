// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.Intent;
import android.support.v7.internal.widget.d;
import android.view.MenuItem;

// Referenced classes of package android.support.v7.widget:
//            o

private final class <init>
    implements android.view.Item.OnMenuItemClickListener
{

    final o a;

    public final boolean onMenuItemClick(MenuItem menuitem)
    {
        menuitem = d.a(o.a(a), o.b(a)).b(menuitem.getItemId());
        if (menuitem != null)
        {
            String s = menuitem.getAction();
            if ("android.intent.action.SEND".equals(s) || "android.intent.action.SEND_MULTIPLE".equals(s))
            {
                o.b(menuitem);
            }
            o.a(a).startActivity(menuitem);
        }
        return true;
    }

    private dget.d(o o1)
    {
        a = o1;
        super();
    }

    a(o o1, byte byte0)
    {
        this(o1);
    }
}

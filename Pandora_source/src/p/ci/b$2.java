// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ci;

import android.view.MenuItem;

// Referenced classes of package p.ci:
//            b

class .Object
    implements com.android.widget.popupmenu.
{

    final int a;
    final b b;

    public boolean onMenuItemClick(MenuItem menuitem)
    {
        menuitem.getItemId();
        JVM INSTR tableswitch 2131755800 2131755800: default 24
    //                   2131755800 26;
           goto _L1 _L2
_L1:
        return true;
_L2:
        p.ci.b.a(b, a);
        if (true) goto _L1; else goto _L3
_L3:
    }

    tem(b b1, int i)
    {
        b = b1;
        a = i;
        super();
    }
}

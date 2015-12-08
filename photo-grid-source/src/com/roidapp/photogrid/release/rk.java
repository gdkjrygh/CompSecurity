// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.DialogInterface;
import android.view.KeyEvent;

// Referenced classes of package com.roidapp.photogrid.release:
//            ri

final class rk
    implements android.content.DialogInterface.OnKeyListener
{

    final ri a;

    rk(ri ri1)
    {
        a = ri1;
        super();
    }

    public final boolean onKey(DialogInterface dialoginterface, int i, KeyEvent keyevent)
    {
        if (i == 4)
        {
            ri.b(a);
            return true;
        } else
        {
            return false;
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.widget.Button;

// Referenced classes of package com.roidapp.photogrid.release:
//            hx

final class hz
    implements android.content.DialogInterface.OnKeyListener
{

    final Button a;
    final hx b;

    hz(hx hx1, Button button)
    {
        b = hx1;
        a = button;
        super();
    }

    public final boolean onKey(DialogInterface dialoginterface, int i, KeyEvent keyevent)
    {
        if (i == 4)
        {
            b.b = true;
            a.setEnabled(false);
            return true;
        } else
        {
            return false;
        }
    }
}

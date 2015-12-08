// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.view.KeyEvent;
import android.view.View;

// Referenced classes of package com.roidapp.photogrid.release:
//            ld

final class lg
    implements android.view.View.OnKeyListener
{

    final ld a;

    lg(ld ld1)
    {
        a = ld1;
        super();
    }

    public final boolean onKey(View view, int i, KeyEvent keyevent)
    {
        if (i == 82 && keyevent.getAction() == 0)
        {
            a.b();
            return true;
        }
        if (i == 4 && keyevent.getAction() == 0)
        {
            a.b();
            return true;
        } else
        {
            return false;
        }
    }
}

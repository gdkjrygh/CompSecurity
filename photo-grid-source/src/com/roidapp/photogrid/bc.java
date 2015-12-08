// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid;

import android.view.KeyEvent;
import android.view.View;

// Referenced classes of package com.roidapp.photogrid:
//            ba

final class bc
    implements android.view.View.OnKeyListener
{

    final ba a;

    bc(ba ba1)
    {
        a = ba1;
        super();
    }

    public final boolean onKey(View view, int i, KeyEvent keyevent)
    {
        if (i == 4)
        {
            a.a();
            return true;
        } else
        {
            return false;
        }
    }
}

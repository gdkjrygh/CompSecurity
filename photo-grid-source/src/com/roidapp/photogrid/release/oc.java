// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.view.KeyEvent;
import android.view.View;

// Referenced classes of package com.roidapp.photogrid.release:
//            oa

final class oc
    implements android.view.View.OnKeyListener
{

    final oa a;

    oc(oa oa1)
    {
        a = oa1;
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

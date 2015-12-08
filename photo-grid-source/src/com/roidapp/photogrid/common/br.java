// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.common;

import android.content.DialogInterface;
import android.view.KeyEvent;

// Referenced classes of package com.roidapp.photogrid.common:
//            bq

final class br
    implements android.content.DialogInterface.OnKeyListener
{

    final bq a;

    br(bq bq1)
    {
        a = bq1;
        super();
    }

    public final boolean onKey(DialogInterface dialoginterface, int i, KeyEvent keyevent)
    {
        if (i == 4)
        {
            a.f();
        }
        return false;
    }
}

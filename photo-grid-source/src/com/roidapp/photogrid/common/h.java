// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.common;

import android.content.DialogInterface;
import android.view.KeyEvent;

// Referenced classes of package com.roidapp.photogrid.common:
//            e, b

final class h
    implements android.content.DialogInterface.OnKeyListener
{

    final String a;
    final e b;

    h(e e1, String s)
    {
        b = e1;
        a = s;
        super();
    }

    public final boolean onKey(DialogInterface dialoginterface, int i, KeyEvent keyevent)
    {
        if (i == 4)
        {
            com.roidapp.photogrid.common.b.a((new StringBuilder()).append(e.a(b)).append(a).append("/com.cleanmaster.mguard/Click/Description/Dialog/Cancel").toString());
            return false;
        } else
        {
            return true;
        }
    }
}

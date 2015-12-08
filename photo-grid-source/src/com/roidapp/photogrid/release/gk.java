// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.DialogInterface;
import android.view.KeyEvent;

// Referenced classes of package com.roidapp.photogrid.release:
//            ge

final class gk
    implements android.content.DialogInterface.OnKeyListener
{

    final ge a;

    gk(ge ge)
    {
        a = ge;
        super();
    }

    public final boolean onKey(DialogInterface dialoginterface, int i, KeyEvent keyevent)
    {
        return i == 3;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.DialogInterface;
import android.view.KeyEvent;

// Referenced classes of package com.roidapp.photogrid.release:
//            PhotoGridActivity

final class mi
    implements android.content.DialogInterface.OnKeyListener
{

    final PhotoGridActivity a;

    mi(PhotoGridActivity photogridactivity)
    {
        a = photogridactivity;
        super();
    }

    public final boolean onKey(DialogInterface dialoginterface, int i, KeyEvent keyevent)
    {
        return i == 3;
    }
}

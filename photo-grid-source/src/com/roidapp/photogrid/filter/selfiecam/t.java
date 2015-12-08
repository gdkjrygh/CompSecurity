// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.filter.selfiecam;

import android.view.KeyEvent;
import android.view.View;
import android.widget.PopupWindow;

// Referenced classes of package com.roidapp.photogrid.filter.selfiecam:
//            o

final class t
    implements android.view.View.OnKeyListener
{

    final PopupWindow a;
    final o b;

    t(o o, PopupWindow popupwindow)
    {
        b = o;
        a = popupwindow;
        super();
    }

    public final boolean onKey(View view, int i, KeyEvent keyevent)
    {
        if (i == 4)
        {
            a.dismiss();
            return true;
        } else
        {
            return false;
        }
    }
}

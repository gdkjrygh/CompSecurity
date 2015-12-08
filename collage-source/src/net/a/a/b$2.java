// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.a.a;

import android.view.KeyEvent;
import android.widget.PopupWindow;

// Referenced classes of package net.a.a:
//            b

class ject
    implements com.cardinalblue.android.piccollage.view.omRelativeLayout.a
{

    final b a;

    public void a(KeyEvent keyevent)
    {
        if (keyevent.getKeyCode() == 4 && keyevent.getRepeatCount() == 0 && a.b.isShowing())
        {
            a.c();
        }
    }

    .KeyEvent(b b1)
    {
        a = b1;
        super();
    }
}

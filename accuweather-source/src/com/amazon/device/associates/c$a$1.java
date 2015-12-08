// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;

// Referenced classes of package com.amazon.device.associates:
//            c, bq

class a
    implements android.view.nTouchListener
{

    final a a;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (motionevent.getAction() == 0)
        {
            a(a).loadUrl("javascript:(function() {hideMessageBox();})();");
            if (a(a))
            {
                bq.d(bq.a());
                a.a();
            }
        }
        return false;
    }

    ( )
    {
        a = ;
        super();
    }
}

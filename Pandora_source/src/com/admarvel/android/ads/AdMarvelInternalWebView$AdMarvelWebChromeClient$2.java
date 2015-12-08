// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.view.KeyEvent;
import android.view.View;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelInternalWebView

class this._cls1
    implements android.view.omeClient._cls2
{

    final ndlebackkey this$1;

    public boolean onKey(View view, int i, KeyEvent keyevent)
    {
        if (keyevent.getAction() == 0 && i == 4)
        {
            if (cess._mth0(this._cls1.this) == null)
            {
                return view.onKeyDown(i, keyevent);
            } else
            {
                ndlebackkey();
                return true;
            }
        } else
        {
            return false;
        }
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}

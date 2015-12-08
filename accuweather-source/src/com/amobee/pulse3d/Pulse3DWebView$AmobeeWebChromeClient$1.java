// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.view.KeyEvent;
import android.view.View;

// Referenced classes of package com.amobee.pulse3d:
//            Pulse3DWebView

class this._cls1
    implements android.view.ent._cls1
{

    final oseVideo this$1;

    public boolean onKey(View view, int i, KeyEvent keyevent)
    {
        if (i == 4)
        {
            oseVideo();
            return true;
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

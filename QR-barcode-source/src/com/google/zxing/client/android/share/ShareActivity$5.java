// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.share;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;

// Referenced classes of package com.google.zxing.client.android.share:
//            ShareActivity

class this._cls0
    implements android.view.er
{

    final ShareActivity this$0;

    public boolean onKey(View view, int i, KeyEvent keyevent)
    {
        if (i == 66 && keyevent.getAction() == 0)
        {
            view = ((TextView)view).getText().toString();
            if (view != null && view.length() > 0)
            {
                ShareActivity.access$0(ShareActivity.this, view);
            }
            return true;
        } else
        {
            return false;
        }
    }

    ()
    {
        this$0 = ShareActivity.this;
        super();
    }
}

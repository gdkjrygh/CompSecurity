// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.wobs;

import java.util.List;
import java.util.TimerTask;

// Referenced classes of package com.google.android.libraries.commerce.ocr.wobs:
//            WobsOcrFragment

final class this._cls1
    implements Runnable
{

    final this._cls1 this$1;

    public final void run()
    {
        if (WobsOcrFragment.access$400(_fld0))
        {
            WobsOcrFragment.access$600(_fld0).add(cess._mth500(this._cls1.this));
            return;
        } else
        {
            cess._mth500(this._cls1.this).run();
            return;
        }
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}

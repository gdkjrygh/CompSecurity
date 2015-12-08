// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.os.Handler;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelVideoActivity

class this._cls1
    implements Runnable
{

    final this._cls1 this$1;

    public void run()
    {
        if (!cess._mth0(this._cls1.this))
        {
            return;
        }
        cess._mth1(this._cls1.this).post(cess._mth2(this._cls1.this));
        if (cess._mth3(this._cls1.this))
        {
            cess._mth4(this._cls1.this, false);
            return;
        } else
        {
            cess._mth1(this._cls1.this).postDelayed(cess._mth5(this._cls1.this), cess._mth6(this._cls1.this));
            return;
        }
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}

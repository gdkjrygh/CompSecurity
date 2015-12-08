// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.animation;

import android.view.View;

class this._cls0
    implements Runnable
{

    final this._cls0 this$0;

    public void run()
    {
        float f = ((float)(cess._mth000(this._cls0.this) - cess._mth100(this._cls0.this)) * 1.0F) / (float)cess._mth200(this._cls0.this);
        if (f > 1.0F || arget.getParent() == null)
        {
            f = 1.0F;
        }
        cess._mth302(this._cls0.this, f);
        cess._mth400(this._cls0.this);
        if (cess._mth300(this._cls0.this) >= 1.0F)
        {
            cess._mth500(this._cls0.this);
            return;
        } else
        {
            arget.postDelayed(cess._mth600(this._cls0.this), 16L);
            return;
        }
    }

    ()
    {
        this$0 = this._cls0.this;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.util.async;


// Referenced classes of package com.google.android.apps.wallet.util.async:
//            AsyncCallback, ActionRequests

final class val.index
    implements AsyncCallback
{

    final onComplete this$0;
    final int val$index;

    private void onComplete()
    {
        int _tmp = cess._mth408(this._cls0.this);
        if (cess._mth400(this._cls0.this) == cess._mth500(this._cls0.this).length)
        {
            mplete(((Object) (cess._mth200(this._cls0.this))), cess._mth300(this._cls0.this));
        }
    }

    public final void onFailure(Exception exception)
    {
        if (cess._mth300(this._cls0.this) == null)
        {
            cess._mth302(this._cls0.this, exception);
        }
        onComplete();
    }

    public final void onSuccess(Object obj)
    {
        cess._mth200(this._cls0.this)[val$index] = obj;
        onComplete();
    }

    Q()
    {
        this$0 = final_q;
        val$index = I.this;
        super();
    }
}

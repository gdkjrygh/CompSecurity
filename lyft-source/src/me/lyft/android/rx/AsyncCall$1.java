// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.rx;

import rx.functions.Action0;

// Referenced classes of package me.lyft.android.rx:
//            AsyncCall

class this._cls0
    implements Action0
{

    final AsyncCall this$0;

    public void call()
    {
        onUnsubscribe();
    }

    ()
    {
        this$0 = AsyncCall.this;
        super();
    }
}

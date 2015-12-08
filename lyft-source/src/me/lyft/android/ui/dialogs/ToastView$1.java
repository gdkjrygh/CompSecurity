// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.dialogs;

import me.lyft.android.common.DialogFlow;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.dialogs:
//            ToastView, Toast

class this._cls0
    implements Action1
{

    final ToastView this$0;

    public void call(Long long1)
    {
        dialogFlow.dismiss(me/lyft/android/ui/dialogs/Toast);
    }

    public volatile void call(Object obj)
    {
        call((Long)obj);
    }

    ()
    {
        this$0 = ToastView.this;
        super();
    }
}

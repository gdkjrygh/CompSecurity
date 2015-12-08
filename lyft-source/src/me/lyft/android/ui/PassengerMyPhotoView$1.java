// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import me.lyft.android.common.Unit;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui:
//            PassengerMyPhotoView

class this._cls0
    implements Action1
{

    final PassengerMyPhotoView this$0;

    public volatile void call(Object obj)
    {
        call((Unit)obj);
    }

    public void call(Unit unit)
    {
        unit = PassengerMyPhotoView.access$000(PassengerMyPhotoView.this);
        PassengerMyPhotoView.access$100(PassengerMyPhotoView.this, unit);
    }

    ()
    {
        this$0 = PassengerMyPhotoView.this;
        super();
    }
}

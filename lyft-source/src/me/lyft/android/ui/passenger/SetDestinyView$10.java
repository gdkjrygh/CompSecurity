// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.content.res.Resources;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.infrastructure.lyft.constants.Constants;
import me.lyft.android.ui.dialogs.Toast;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.passenger:
//            SetDestinyView

class this._cls0
    implements Action1
{

    final SetDestinyView this$0;

    public volatile void call(Object obj)
    {
        call((Unit)obj);
    }

    public void call(Unit unit)
    {
        unit = constantsProvider.getConstants().getDestinyStartedModalText(getResources().getString(0x7f07010d));
        dialogFlow.show(new Toast(unit));
    }

    onstants()
    {
        this$0 = SetDestinyView.this;
        super();
    }
}

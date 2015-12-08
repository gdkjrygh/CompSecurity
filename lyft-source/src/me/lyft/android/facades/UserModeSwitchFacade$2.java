// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.facades;

import me.lyft.android.ui.IProgressController;
import rx.functions.Action0;

// Referenced classes of package me.lyft.android.facades:
//            UserModeSwitchFacade

class this._cls0
    implements Action0
{

    final UserModeSwitchFacade this$0;

    public void call()
    {
        UserModeSwitchFacade.access$100(UserModeSwitchFacade.this).hideProgress();
    }

    ()
    {
        this$0 = UserModeSwitchFacade.this;
        super();
    }
}

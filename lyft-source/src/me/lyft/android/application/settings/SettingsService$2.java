// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.settings;

import me.lyft.android.common.Unit;
import me.lyft.android.infrastructure.lyft.AppStateDTO;
import rx.Observable;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.application.settings:
//            SettingsService

class this._cls0
    implements Func1
{

    final SettingsService this$0;

    public volatile Object call(Object obj)
    {
        return call((AppStateDTO)obj);
    }

    public Observable call(AppStateDTO appstatedto)
    {
        return Unit.just();
    }

    ()
    {
        this$0 = SettingsService.this;
        super();
    }
}

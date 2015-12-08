// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.services;

import me.lyft.android.common.Objects;
import me.lyft.android.infrastructure.lyft.AppStateDTO;
import me.lyft.android.infrastructure.lyft.profile.NullUserDTO;
import me.lyft.android.infrastructure.lyft.profile.UserDTO;
import me.lyft.android.rx.ReactiveProperty;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.services:
//            LyftDriverToggleService

class this._cls0
    implements Action1
{

    final LyftDriverToggleService this$0;

    public volatile void call(Object obj)
    {
        call((AppStateDTO)obj);
    }

    public void call(AppStateDTO appstatedto)
    {
        LyftDriverToggleService.access$000(LyftDriverToggleService.this).onNext(((UserDTO)Objects.firstNonNull(appstatedto.getUser(), NullUserDTO.getInstance())).getMode());
    }

    ()
    {
        this$0 = LyftDriverToggleService.this;
        super();
    }
}

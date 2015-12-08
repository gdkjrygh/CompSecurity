// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.tve;

import com.adobe.adobepass.accessenabler.models.Mvpd;
import rx.Subscriber;

// Referenced classes of package com.nbcsports.liveextra.library.tve:
//            AuthDelegate, AnvatoService

class it> extends AuthDelegate
{

    final AnvatoService this$0;

    public void selectedProvider(Mvpd mvpd)
    {
        super.selectedProvider(mvpd);
        if (mvpd == null)
        {
            AnvatoService.access$000(AnvatoService.this).onError(new Error("Selected MVPD was null"));
            return;
        } else
        {
            AnvatoService.access$702(AnvatoService.this, mvpd);
            AnvatoService.access$900(AnvatoService.this);
            return;
        }
    }

    _cls9()
    {
        this$0 = AnvatoService.this;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.tve;

import android.content.Context;
import com.adobe.adobepass.accessenabler.models.MetadataKey;
import com.adobe.adobepass.accessenabler.models.MetadataStatus;
import com.adobe.adobepass.accessenabler.models.Mvpd;
import rx.Subscriber;

// Referenced classes of package com.nbcsports.liveextra.library.tve:
//            AuthDelegate, AnvatoService, AuthService

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
            AnvatoService.access$200(AnvatoService.this).getUserMetadata();
            return;
        }
    }

    public void setMetadataStatus(MetadataKey metadatakey, MetadataStatus metadatastatus)
    {
        super.setMetadataStatus(metadatakey, metadatastatus);
        metadatakey = AnvatoService.access$200(AnvatoService.this).getZipData();
        if (metadatakey != null)
        {
            retry = 0;
            AnvatoService.access$800(AnvatoService.this, metadatakey);
            AnvatoService.access$200(AnvatoService.this).unregister(AnvatoService.access$100(AnvatoService.this));
            return;
        } else
        {
            AnvatoService.access$000(AnvatoService.this).onError(new Exception(getBaseContext().getString(0x7f0700d8)));
            return;
        }
    }

    tus()
    {
        this$0 = AnvatoService.this;
        super();
    }
}

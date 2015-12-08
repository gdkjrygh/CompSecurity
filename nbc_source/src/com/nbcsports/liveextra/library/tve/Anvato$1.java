// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.tve;

import retrofit.RequestInterceptor;

// Referenced classes of package com.nbcsports.liveextra.library.tve:
//            Anvato

class this._cls0
    implements RequestInterceptor
{

    final Anvato this$0;

    public void intercept(retrofit.terceptor.RequestFacade requestfacade)
    {
        requestfacade.addQueryParam("anvack", "nbcu_nbcsn_nbcsn_android_prod_b109b4f6825d04ea71bb272a16cd2c773aeb57df");
        requestfacade.addQueryParam("returnDebugInfo", "1");
    }

    ()
    {
        this$0 = Anvato.this;
        super();
    }
}

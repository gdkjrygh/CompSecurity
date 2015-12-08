// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.experiment;

import com.pinterest.api.ApiResponseHandler;
import com.pinterest.network.json.PinterestJsonObject;
import java.util.HashSet;

// Referenced classes of package com.pinterest.experiment:
//            Experiments

final class nit> extends ApiResponseHandler
{

    final String a;

    public final void onSuccess(PinterestJsonObject pinterestjsonobject)
    {
        super.onSuccess(pinterestjsonobject);
        Experiments.ae().add(a);
    }

    nObject(String s)
    {
        a = s;
        super();
    }
}

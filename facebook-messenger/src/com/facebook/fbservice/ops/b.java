// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.fbservice.ops;

import com.facebook.fbservice.service.OperationResult;

// Referenced classes of package com.facebook.fbservice.ops:
//            i, BlueServiceFragment

class b extends i
{

    final BlueServiceFragment a;

    b(BlueServiceFragment blueservicefragment)
    {
        a = blueservicefragment;
        super();
    }

    public void a(OperationResult operationresult)
    {
        if (BlueServiceFragment.b(a) != null)
        {
            BlueServiceFragment.b(a).a(operationresult);
        }
    }
}

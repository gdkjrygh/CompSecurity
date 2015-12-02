// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.compose;

import android.location.Location;
import com.facebook.fbservice.service.OperationResult;
import com.google.common.d.a.h;

// Referenced classes of package com.facebook.orca.compose:
//            ComposeFragment

class v
    implements h
{

    final ComposeFragment a;

    v(ComposeFragment composefragment)
    {
        a = composefragment;
        super();
    }

    public void a(OperationResult operationresult)
    {
        ComposeFragment.a(a, null);
        operationresult = (Location)operationresult.i();
        ComposeFragment.b(a, operationresult);
    }

    public volatile void a(Object obj)
    {
        a((OperationResult)obj);
    }

    public void a(Throwable throwable)
    {
        ComposeFragment.a(a, null);
        ComposeFragment.a(a, throwable);
    }
}

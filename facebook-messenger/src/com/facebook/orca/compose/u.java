// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.compose;

import android.location.Location;
import com.facebook.fbservice.ops.l;
import com.facebook.fbservice.service.OperationResult;

// Referenced classes of package com.facebook.orca.compose:
//            ComposeFragment

class u extends l
{

    final ComposeFragment a;

    u(ComposeFragment composefragment)
    {
        a = composefragment;
        super();
    }

    public void a(OperationResult operationresult)
    {
        operationresult = (Location)operationresult.i();
        ComposeFragment.a(a, operationresult);
    }
}

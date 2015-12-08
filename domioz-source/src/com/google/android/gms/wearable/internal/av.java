// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.l;
import com.google.android.gms.common.api.s;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.android.gms.wearable.a;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            aw

public final class av
    implements a
{

    public av()
    {
    }

    public final s a(l l1, PutDataRequest putdatarequest)
    {
        return l1.a(new aw(this, l1, putdatarequest));
    }
}

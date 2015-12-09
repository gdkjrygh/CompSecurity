// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Bundle;

// Referenced classes of package com.google.android.gms.common.api:
//            aq, aa

final class ac extends aq
{

    final aa a;

    ac(aa aa1)
    {
        a = aa1;
        super(aa1, (byte)0);
    }

    public final void onConnected(Bundle bundle)
    {
        aa.p(a);
    }
}

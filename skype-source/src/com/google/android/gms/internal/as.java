// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            at

public final class as
    implements at
{

    public as()
    {
    }

    public final List a(AdRequestInfoParcel adrequestinfoparcel)
    {
        if (adrequestinfoparcel.A == null)
        {
            return Collections.emptyList();
        } else
        {
            return adrequestinfoparcel.A;
        }
    }
}

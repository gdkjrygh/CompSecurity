// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            sh

final class Fe
    implements com.google.android.gms.people.LoadImageResult
{

    final Status Fe;
    final s aFC;

    public final int getHeight()
    {
        return 0;
    }

    public final ParcelFileDescriptor getParcelFileDescriptor()
    {
        return null;
    }

    public final Status getStatus()
    {
        return Fe;
    }

    public final int getWidth()
    {
        return 0;
    }

    public final void release()
    {
    }

    s(s s, Status status)
    {
        aFC = s;
        Fe = status;
        super();
    }
}

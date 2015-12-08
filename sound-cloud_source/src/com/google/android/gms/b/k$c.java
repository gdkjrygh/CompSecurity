// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.b;

import android.view.Display;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.b:
//            k

private static final class a
    implements com.google.android.gms.cast.i.Status
{

    private final Status a;
    private final Display b = null;

    public final Status getStatus()
    {
        return a;
    }

    public .api.Status(Status status)
    {
        a = status;
    }
}

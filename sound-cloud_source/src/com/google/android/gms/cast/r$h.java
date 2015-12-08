// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.common.api.Status;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast:
//            r

private static final class b
    implements b
{

    private final Status a;
    private final JSONObject b;

    public final Status getStatus()
    {
        return a;
    }

    i.Status(Status status, JSONObject jsonobject)
    {
        a = status;
        b = jsonobject;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import android.net.Uri;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.f;

// Referenced classes of package com.google.android.gms.wearable:
//            PutDataRequest, f

public interface d
{
    public static interface a
        extends f
    {
    }

    public static interface b
    {

        public abstract void onDataChanged(com.google.android.gms.wearable.f f);
    }

    public static interface c
        extends f
    {
    }


    public abstract com.google.android.gms.common.api.d a(com.google.android.gms.common.api.c c1, Uri uri);

    public abstract com.google.android.gms.common.api.d a(com.google.android.gms.common.api.c c1, PutDataRequest putdatarequest);

    public abstract com.google.android.gms.common.api.d a(com.google.android.gms.common.api.c c1, b b1);

    public abstract com.google.android.gms.common.api.d b(com.google.android.gms.common.api.c c1, b b1);
}

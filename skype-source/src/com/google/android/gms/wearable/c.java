// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import android.net.Uri;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.g;
import java.io.InputStream;

// Referenced classes of package com.google.android.gms.wearable:
//            Asset, PutDataRequest, f, e

public interface com.google.android.gms.wearable.c
{
    public static interface a
        extends g
    {

        public abstract com.google.android.gms.wearable.f a();
    }

    public static interface b
    {

        public abstract void onDataChanged(com.google.android.gms.wearable.e e);
    }

    public static interface c
        extends g
    {
    }

    public static interface d
        extends f, g
    {

        public abstract InputStream b();
    }


    public abstract e a(com.google.android.gms.common.api.c c1, Uri uri);

    public abstract e a(com.google.android.gms.common.api.c c1, Asset asset);

    public abstract e a(com.google.android.gms.common.api.c c1, PutDataRequest putdatarequest);

    public abstract e b(com.google.android.gms.common.api.c c1, Uri uri);
}

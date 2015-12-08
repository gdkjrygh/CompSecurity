// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.net.Uri;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.DataApi;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzf, zzbk

public final class zzu
    implements DataApi
{

    public zzu()
    {
    }

    public PendingResult a(GoogleApiClient googleapiclient, Uri uri)
    {
        return a(googleapiclient, uri, 0);
    }

    public PendingResult a(GoogleApiClient googleapiclient, Uri uri, int i)
    {
        return googleapiclient.a(new zzf(googleapiclient, uri, i) {

            final Uri b;
            final int c;
            final zzu d;

            protected void a(zzbk zzbk1)
            {
                zzbk1.a(this, b, c);
            }

            protected Result b(Status status)
            {
                return d(status);
            }

            protected void b(com.google.android.gms.common.api.Api.Client client)
            {
                a((zzbk)client);
            }

            protected com.google.android.gms.wearable.DataApi.DeleteDataItemsResult d(Status status)
            {
                return new zzc(status, 0);
            }

            
            {
                d = zzu.this;
                b = uri;
                c = i;
                super(googleapiclient);
            }

            private class zzc
                implements com.google.android.gms.wearable.DataApi.DeleteDataItemsResult
            {

                private final Status a;
                private final int b;

                public Status a()
                {
                    return a;
                }

                public zzc(Status status, int i)
                {
                    a = status;
                    b = i;
                }
            }

        });
    }
}

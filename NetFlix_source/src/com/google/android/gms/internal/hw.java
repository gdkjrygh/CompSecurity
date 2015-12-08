// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Intent;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.panorama.Panorama;
import com.google.android.gms.panorama.PanoramaApi;

// Referenced classes of package com.google.android.gms.internal:
//            hx

public class hw
    implements PanoramaApi
{
    private static abstract class a extends com.google.android.gms.common.api.a.b
    {

        public com.google.android.gms.panorama.PanoramaApi.PanoramaResult X(Status status)
        {
            return new com.google.android.gms.panorama.PanoramaApi.PanoramaResult(this, status) {

                final a TB;
                final Status wz;

                public Status getStatus()
                {
                    return wz;
                }

                public Intent getViewerIntent()
                {
                    return null;
                }

            
            {
                TB = a1;
                wz = status;
                super();
            }
            };
        }

        public Result d(Status status)
        {
            return X(status);
        }

        public a()
        {
            super(Panorama.wx);
        }
    }


    public hw()
    {
    }

    public PendingResult loadPanoramaInfo(GoogleApiClient googleapiclient, Uri uri)
    {
        return googleapiclient.a(new a(uri) {

            final hw TA;
            final Uri Tz;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((hx)a1);
            }

            protected void a(hx hx1)
            {
                hx1.a(this, Tz, false);
            }

            
            {
                TA = hw.this;
                Tz = uri;
                super();
            }
        });
    }

    public PendingResult loadPanoramaInfoAndGrantAccess(GoogleApiClient googleapiclient, Uri uri)
    {
        return googleapiclient.a(new a(uri) {

            final hw TA;
            final Uri Tz;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((hx)a1);
            }

            protected void a(hx hx1)
            {
                hx1.a(this, Tz, true);
            }

            
            {
                TA = hw.this;
                Tz = uri;
                super();
            }
        });
    }
}

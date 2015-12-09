// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            sh

static abstract class gleApiClient extends com.google.android.gms.people.e.a
{

    private com.google.android.gms.people.s.LoadImageResult bn(Status status)
    {
        return new com.google.android.gms.people.Images.LoadImageResult(status) {

            final Status Fe;
            final sh.a aFC;

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

            
            {
                aFC = sh.a.this;
                Fe = status;
                super();
            }
        };
    }

    public final Result b(Status status)
    {
        return bn(status);
    }

    private gleApiClient(GoogleApiClient googleapiclient)
    {
        super(googleapiclient);
    }

    gleApiClient(GoogleApiClient googleapiclient, gleApiClient gleapiclient)
    {
        this(googleapiclient);
    }
}

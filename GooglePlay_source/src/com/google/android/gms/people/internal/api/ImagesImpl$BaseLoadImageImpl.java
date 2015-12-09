// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.internal.api;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.people.internal.api:
//            ImagesImpl

private static abstract class <init> extends com.google.android.gms.people.l
{

    public final volatile Result createFailedResult(final Status status)
    {
        return new com.google.android.gms.people.Images.LoadImageResult() {

            final ImagesImpl.BaseLoadImageImpl this$0;
            final Status val$status;

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
                return status;
            }

            public final int getWidth()
            {
                return 0;
            }

            public final void release()
            {
            }

            
            {
                this$0 = ImagesImpl.BaseLoadImageImpl.this;
                status = status1;
                super();
            }
        };
    }

    private _cls1.val.status(GoogleApiClient googleapiclient)
    {
        super(googleapiclient);
    }

    _cls1.val.status(GoogleApiClient googleapiclient, byte byte0)
    {
        this(googleapiclient);
    }
}

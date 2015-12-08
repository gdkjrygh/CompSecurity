// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.internal.api;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.people.Images;
import com.google.android.gms.people.internal.PeopleCallLog;
import com.google.android.gms.people.internal.PeopleClientImpl;

public final class ImagesImpl
    implements Images
{
    private static abstract class BaseLoadImageImpl extends com.google.android.gms.people.People.BasePeopleApiMethodImpl
    {

        public final volatile Result createFailedResult(Status status)
        {
            return status. new com.google.android.gms.people.Images.LoadImageResult() {

                final BaseLoadImageImpl this$0;
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
                this$0 = final_baseloadimageimpl;
                status = Status.this;
                super();
            }
            };
        }

        private BaseLoadImageImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

        BaseLoadImageImpl(GoogleApiClient googleapiclient, byte byte0)
        {
            this(googleapiclient);
        }
    }


    public ImagesImpl()
    {
    }

    public final PendingResult loadOwnerAvatar$568d1e31(final GoogleApiClient final_googleapiclient, final String account, final String pageId, final int avatarSize)
    {
        if (Log.isLoggable("PeopleClientCall", 3))
        {
            PeopleCallLog.log("loadOwnerAvatar", new Object[] {
                account, pageId, Integer.valueOf(avatarSize), Integer.valueOf(1)
            });
        }
        return final_googleapiclient.enqueue(new BaseLoadImageImpl(1) {

            final ImagesImpl this$0;
            final String val$account;
            final int val$avatarOptions = 1;
            final int val$avatarSize;
            final String val$pageId;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                setCancelToken(((PeopleClientImpl)client).loadOwnerAvatar(this, account, pageId, avatarSize, avatarOptions));
            }

            
            {
                this$0 = ImagesImpl.this;
                account = s;
                pageId = s1;
                avatarSize = i;
                super(final_googleapiclient, (byte)0);
            }
        });
    }

    public final PendingResult loadOwnerCoverPhoto$52832eb4(final GoogleApiClient final_googleapiclient, final String account, String s)
    {
        if (Log.isLoggable("PeopleClientCall", 3))
        {
            PeopleCallLog.log("loadOwnerCoverPhoto", new Object[] {
                account, s
            });
        }
        return final_googleapiclient.enqueue(new BaseLoadImageImpl(s) {

            final ImagesImpl this$0;
            final String val$account;
            final String val$pageId;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                setCancelToken(((PeopleClientImpl)client).loadOwnerCoverPhoto$740bf995(this, account, pageId));
            }

            
            {
                this$0 = ImagesImpl.this;
                account = s;
                pageId = s1;
                super(final_googleapiclient, (byte)0);
            }
        });
    }
}

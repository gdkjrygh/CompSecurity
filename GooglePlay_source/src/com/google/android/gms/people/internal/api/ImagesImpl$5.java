// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.internal.api;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.people.internal.PeopleClientImpl;

// Referenced classes of package com.google.android.gms.people.internal.api:
//            ImagesImpl

final class seLoadImageImpl extends seLoadImageImpl
{

    final ImagesImpl this$0;
    final String val$account;
    final int val$avatarOptions = 1;
    final int val$avatarSize;
    final String val$pageId;

    protected final volatile void doExecute(com.google.android.gms.common.api.esImpl._cls5 _pcls5)
        throws RemoteException
    {
        setCancelToken(((PeopleClientImpl)_pcls5).loadOwnerAvatar(this, val$account, val$pageId, val$avatarSize, val$avatarOptions));
    }

    seLoadImageImpl(int j)
    {
        this$0 = final_imagesimpl;
        val$account = s;
        val$pageId = s1;
        val$avatarSize = I.this;
        super(final_googleapiclient, (byte)0);
    }
}

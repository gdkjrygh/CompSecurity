// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import android.content.Context;
import android.os.Bundle;
import com.facebook.internal.PlatformServiceClient;

final class LikeStatusClient extends PlatformServiceClient
{

    private String objectId;

    LikeStatusClient(Context context, String s, String s1)
    {
        super(context, 0x10006, 0x10007, 0x13353c9, s);
        objectId = s1;
    }

    protected void populateRequestBundle(Bundle bundle)
    {
        bundle.putString("com.facebook.platform.extra.OBJECT_ID", objectId);
    }
}

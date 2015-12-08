// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.app.Activity;
import android.os.Bundle;
import java.util.EnumSet;

class objectId extends com.facebook.widget.r
{

    private String objectId;

    public com.facebook.widget.r getAppCall()
    {
        return appCall;
    }

    public String getApplicationId()
    {
        return applicationId;
    }

    protected EnumSet getDialogFeatures()
    {
        return EnumSet.of(LIKE_DIALOG);
    }

    protected Bundle getMethodArguments()
    {
        Bundle bundle = new Bundle();
        bundle.putString("object_id", objectId);
        return bundle;
    }

    public String getWebFallbackUrl()
    {
        return getWebFallbackUrlInternal();
    }

    public (Activity activity, String s)
    {
        super(activity);
        objectId = s;
    }
}

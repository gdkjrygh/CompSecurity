// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.localpoint.sdk.core.util;

import android.content.Context;
import android.content.Intent;
import com.digby.localpoint.sdk.core.impl.LPError;

public class AttributeEventBroadcaster
{

    public static final String ATTRIBUTES_EXTRA = "attributesInUpdateRequest";
    public static final String ATTRIBUTES_UPDATE_FAILURE_INTENT = "com.digby.localpoint.AttributesUpdateFailure";
    public static final String ATTRIBUTES_UPDATE_SUCCESS_INTENT = "com.digby.localpoint.AttributesUpdateSuccess";
    public static final String ERROR_CODE_EXTRA = "errorCode";
    public static final String ERROR_MESSAGE_EXTRA = "errorMessage";
    private static AttributeEventBroadcaster INSTANCE;
    private final Context mContext;

    private AttributeEventBroadcaster(Context context)
    {
        mContext = context;
    }

    public static AttributeEventBroadcaster getInstance(Context context)
    {
        if (INSTANCE == null)
        {
            INSTANCE = new AttributeEventBroadcaster(context);
        }
        return INSTANCE;
    }

    public void broadcastAttributesUpdateFailure(String s, LPError lperror)
    {
        Intent intent = new Intent("com.digby.localpoint.AttributesUpdateFailure");
        intent.putExtra("attributesInUpdateRequest", s);
        intent.putExtra("errorCode", lperror.getErrorCode());
        intent.putExtra("errorMessage", lperror.getErrorMessage());
        mContext.sendBroadcast(intent);
    }

    public void broadcastAttributesUpdateSuccess(String s)
    {
        Intent intent = new Intent("com.digby.localpoint.AttributesUpdateSuccess");
        intent.putExtra("attributesInUpdateRequest", s);
        mContext.sendBroadcast(intent);
    }
}

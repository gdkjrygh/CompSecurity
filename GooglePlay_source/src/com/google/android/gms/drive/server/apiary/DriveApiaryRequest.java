// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.server.apiary;

import android.os.SystemClock;
import com.android.volley.NetworkResponse;
import com.android.volley.Response;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.server.ApiaryRequest;
import com.google.android.gms.drive.server.NextPageTokenListener;
import com.google.android.gms.drive.utils.Log;
import java.util.HashMap;

public final class DriveApiaryRequest extends ApiaryRequest
{

    private final NextPageTokenListener mNextPageTokenListener = null;
    private final com.android.volley.Request.Priority mPriority;

    DriveApiaryRequest(int i, String s, Object obj, Class class1, Object obj1, com.android.volley.Response.Listener listener, com.android.volley.Response.ErrorListener errorlistener, 
            String s1, String s2, boolean flag, HashMap hashmap, com.android.volley.Request.Priority priority, int j, int k)
    {
        super(i, s, obj, class1, obj1, listener, errorlistener, s1, s2, flag, hashmap, j, k);
        mPriority = (com.android.volley.Request.Priority)Preconditions.checkNotNull(priority);
    }

    public final com.android.volley.Request.Priority getPriority()
    {
        return mPriority;
    }

    protected final Response parseNetworkResponse(NetworkResponse networkresponse)
    {
        long l = SystemClock.elapsedRealtime();
        networkresponse = super.parseNetworkResponse(networkresponse);
        Log.dfmt("DriveApiaryRequest", "Completed parsing response after %d", new Object[] {
            Long.valueOf(SystemClock.elapsedRealtime() - l)
        });
        return networkresponse;
    }
}

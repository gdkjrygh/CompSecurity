// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.server.apiary;

import android.content.Context;
import com.android.volley.Request;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.server.ApiaryRequest;
import com.google.android.gms.common.server.BaseApiaryServer;
import com.google.android.gms.common.server.UserAgent;
import com.google.android.gms.common.server.response.FieldMappingDictionary;
import com.google.android.gms.common.util.AndroidUtils;
import com.google.android.gms.drive.G;
import com.google.android.gms.drive.utils.Log;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.drive.server.apiary:
//            DriveApiaryRequest

public final class DriveApiaryServer extends BaseApiaryServer
{

    private static final com.android.volley.Request.Priority DEFAULT_DRIVE_PRIORITY;
    private static final com.android.volley.Request.Priority MULTIPAGE_FIRST_PAGE;
    private static final com.android.volley.Request.Priority MULTIPAGE_NEXT_PAGES;

    public DriveApiaryServer(Context context, String s, String s1, boolean flag, boolean flag1)
    {
        super(context, s, s1, flag, flag1, null, null);
        setNetworkClientTag(2816);
        Log.dfmt("DriveApiaryServer", "Server URL: %s", new Object[] {
            s
        });
    }

    protected final ApiaryRequest buildRequest(ClientContext clientcontext, int i, String s, Object obj, Class class1, FieldMappingDictionary fieldmappingdictionary, String s1, 
            String s2, com.android.volley.Response.Listener listener, com.android.volley.Response.ErrorListener errorlistener, HashMap hashmap)
    {
        return new DriveApiaryRequest(i, s, obj, class1, fieldmappingdictionary, listener, errorlistener, s1, s2, mEnableCache, hashmap, DEFAULT_DRIVE_PRIORITY, getNetworkClientTag(), getUid());
    }

    protected final HashMap createHeaders(Context context, ClientContext clientcontext, String s)
    {
        clientcontext = super.createHeaders(context, clientcontext, s);
        clientcontext.put("X-Device-ID", Long.toHexString(AndroidUtils.getAndroidId$faab219()));
        clientcontext.put("User-Agent", UserAgent.get(context, "Drive Android SDK/1.0"));
        return clientcontext;
    }

    protected final void setRetryPolicy(Request request, String s)
    {
        request.setRetryPolicy(new com.google.android.gms.common.server.AbstractApiaryServer.DefaultApiaryRetryPolicy(mContext, s, ((Integer)G.serverDefaultTimeoutMs.get()).intValue(), 5, 2.0F));
    }

    static 
    {
        DEFAULT_DRIVE_PRIORITY = com.android.volley.Request.Priority.HIGH;
        MULTIPAGE_FIRST_PAGE = com.android.volley.Request.Priority.NORMAL;
        MULTIPAGE_NEXT_PAGES = com.android.volley.Request.Priority.LOW;
    }
}

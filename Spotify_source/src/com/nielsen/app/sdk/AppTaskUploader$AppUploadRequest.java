// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nielsen.app.sdk;

import android.util.Log;
import java.util.Map;

// Referenced classes of package com.nielsen.app.sdk:
//            AppTaskUploader, h, AppSdk, c

public class a extends er
{

    public static final int BUFFER_SIZE = 0x3e800;
    public static final String REQUEST_NAME = "AppTaskUploader";
    public static final int TIMEOUT_CONNECTION = 60000;
    public static final int TIMEOUT_DATA = 60000;
    String a;
    c b;
    String c;
    final AppTaskUploader e;

    public void onError(String s, long l, Exception exception)
    {
        if (AppSdk.a())
        {
            exception = new StringBuilder("Nielsen AppSDK: Failed sending data ping - ");
            if (c != null && !c.isEmpty())
            {
                s = c;
            } else
            {
                s = "EMPTY";
            }
            Log.d("AppSdk", exception.append(s).toString());
        }
        if (AppTaskUploader.a(e).containsKey(a))
        {
            AppTaskUploader.a(e).remove(a);
        }
    }

    public void onFinish(String s, long l, String s1)
    {
        com.nielsen.app.sdk.c.a('I', "UPLOAD ended successfully", new Object[0]);
        if (AppSdk.a())
        {
            s1 = new StringBuilder("Nielsen AppSDK: Sent data ping successfully - ");
            if (c != null && !c.isEmpty())
            {
                s = c;
            } else
            {
                s = "EMPTY";
            }
            Log.d("AppSdk", s1.append(s).toString());
        }
        if (AppTaskUploader.a(e).containsKey(a))
        {
            AppTaskUploader.a(e).remove(a);
        }
    }

    public void onIdle(String s, long l)
    {
    }

    public void onStart(String s, long l)
    {
    }

    public void onUpdate(String s, long l, long l1, long l2, 
            String s1)
    {
    }

    public void startRequest()
    {
        com.nielsen.app.sdk.c.a('I', "Sending Message: %s", new Object[] {
            c
        });
        b.b(e.c, c);
    }

    public er(AppTaskUploader apptaskuploader, String s)
    {
        e = apptaskuploader;
        AppRequestManager apprequestmanager = apptaskuploader.d;
        apprequestmanager.getClass();
        super(apprequestmanager, "AppTaskUploader");
        a = "";
        b = null;
        c = null;
        apprequestmanager = apptaskuploader.d;
        apprequestmanager.getClass();
        b = new t>(apprequestmanager, "AppTaskUploader", this, 60000, 60000, 0x3e800);
        c = s;
        a = (new StringBuilder("AppTaskUploader_")).append(String.valueOf(h.s())).toString();
        AppTaskUploader.a(apptaskuploader).put(a, this);
    }
}

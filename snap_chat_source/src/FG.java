// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.Timber;
import com.snapchat.android.api2.framework.HttpMethod;
import org.json.JSONArray;
import org.json.JSONObject;

public final class FG extends oV
{
    public static interface a
    {

        public abstract void a(String s);
    }


    private String a;
    private a b;

    public FG(String s, a a1)
    {
        a = s;
        b = a1;
    }

    private String a(String s)
    {
        s = (new JSONObject(s)).getJSONArray("routes").getJSONObject(0).getJSONArray("legs").getJSONObject(0).getJSONObject("duration").getString("text");
        b.a(s);
        return s;
        Exception exception;
        exception;
        s = "";
_L2:
        Timber.c("DistanceDownloadTask", "[DistanceDownloadTask] Fail to download duration: %s %s", new Object[] {
            a, exception
        });
        return s;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final HttpMethod getMethod()
    {
        return HttpMethod.GET;
    }

    public final pn getRequestPayload()
    {
        return null;
    }

    public final String getUrl()
    {
        return a;
    }

    public final void onResult(pi pi1)
    {
        super.onResult(pi1);
        a(pi1.d());
    }
}

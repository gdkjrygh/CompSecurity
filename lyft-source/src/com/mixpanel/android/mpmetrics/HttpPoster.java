// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.util.Log;
import com.google.gson.Gson;
import com.mixpanel.android.util.Base64Coder;
import com.mixpanel.android.util.StringUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            AnalyticsResponse

class HttpPoster
{

    private final String a;
    private final String b;
    private Gson c;

    public HttpPoster(String s, String s1)
    {
        a = s;
        b = s1;
        c = new Gson();
    }

    private PostResult a(String s, List list)
    {
        PostResult postresult = PostResult.c;
        DefaultHttpClient defaulthttpclient = new DefaultHttpClient();
        s = new HttpPost(s);
        try
        {
            s.setEntity(new UrlEncodedFormEntity(list));
            list = defaulthttpclient.execute(s).getEntity();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.i("MixpanelAPI", "Cannot post message to Mixpanel Servers (May Retry)", s);
            return PostResult.b;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("MixpanelAPI", "Cannot post message to Mixpanel Servers, will not retry.", s);
            return PostResult.c;
        }
        s = postresult;
        if (list == null)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        s = StringUtils.a(list.getContent());
        list = (AnalyticsResponse)c.a(s, com/mixpanel/android/mpmetrics/AnalyticsResponse);
        s = postresult;
        if (list.a().intValue() > 0)
        {
            s = PostResult.a;
            Log.d("MixpanelAPI", (new StringBuilder()).append("Successfully submitted events: ").append(list.a()).toString());
        }
        return s;
    }

    public PostResult a(String s, String s1)
    {
        s = Base64Coder.a(s);
        ArrayList arraylist = new ArrayList(1);
        arraylist.add(new BasicNameValuePair("data", s));
        PostResult postresult = a((new StringBuilder()).append(a).append(s1).toString(), ((List) (arraylist)));
        s = postresult;
        if (postresult == PostResult.b)
        {
            s = postresult;
            if (b != null)
            {
                s = a((new StringBuilder()).append(b).append(s1).toString(), ((List) (arraylist)));
            }
        }
        return s;
    }

    private class PostResult extends Enum
    {

        public static final PostResult a;
        public static final PostResult b;
        public static final PostResult c;
        private static final PostResult d[];

        public static PostResult valueOf(String s)
        {
            return (PostResult)Enum.valueOf(com/mixpanel/android/mpmetrics/HttpPoster$PostResult, s);
        }

        public static PostResult[] values()
        {
            return (PostResult[])d.clone();
        }

        static 
        {
            a = new PostResult("SUCCEEDED", 0);
            b = new PostResult("FAILED_RECOVERABLE", 1);
            c = new PostResult("FAILED_UNRECOVERABLE", 2);
            d = (new PostResult[] {
                a, b, c
            });
        }

        private PostResult(String s, int i)
        {
            super(s, i);
        }
    }

}

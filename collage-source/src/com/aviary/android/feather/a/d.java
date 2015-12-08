// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.a;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.HandlerThread;
import android.util.Log;
import com.aviary.android.feather.common.a.a;
import com.aviary.android.feather.common.utils.f;
import java.io.IOException;
import java.util.Locale;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

class d
{

    private static Locale a;

    d()
    {
    }

    static int a(int i, int j, int k)
    {
        return Math.min(k, Math.max(i, j));
    }

    public static int a(Context context)
    {
        context = f.b(context);
        if (context != null)
        {
            return ((PackageInfo) (context)).versionCode;
        } else
        {
            return 0;
        }
    }

    public static int a(String s, String s1)
        throws IOException
    {
        if (a.a)
        {
            Log.i("ReceiptsUtils", String.format("upload: %s", new Object[] {
                s
            }));
            Log.i("ReceiptsUtils", String.format("data=%s", new Object[] {
                s1
            }));
        }
        Object obj = new DefaultHttpClient();
        s = new HttpPost(s);
        s1 = new StringEntity(s1);
        s.setHeader("Accept", "application/json");
        s.setHeader("Content-Type", "application/json");
        s.setEntity(s1);
        int i;
        try
        {
            s1 = ((HttpClient) (obj)).execute(s);
            i = s1.getStatusLine().getStatusCode();
            obj = s1.getStatusLine().getReasonPhrase();
            Log.d("ReceiptsUtils", (new StringBuilder()).append("code: ").append(i).toString());
            Log.d("ReceiptsUtils", (new StringBuilder()).append("reason: ").append(((String) (obj))).toString());
            Log.d("ReceiptsUtils", (new StringBuilder()).append("response: ").append(EntityUtils.toString(s1.getEntity())).toString());
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            s1.printStackTrace();
            s.abort();
            throw s1;
        }
        return i;
    }

    static HandlerThread a(String s)
    {
        s = new HandlerThread(s, 19);
        s.start();
        return s;
    }

    public static String a()
    {
        return c().getCountry();
    }

    public static String b()
    {
        return c().getLanguage();
    }

    public static String b(Context context)
    {
        return it.sephiroth.android.library.a.a.a(context).a();
    }

    private static Locale c()
    {
        if (a == null)
        {
            a = Locale.getDefault();
        }
        return a;
    }
}

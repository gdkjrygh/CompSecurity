// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.serverinteraction;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

// Referenced classes of package com.fitbit.serverinteraction:
//            d

public class g
{
    static class a
        implements c
    {

        public b a(Context context)
        {
            Log.i("DefaultHttpClientFactoryImpl", "Getting the http client");
            return new d(context);
        }

        a()
        {
        }
    }

    static abstract class b
    {

        public HttpURLConnection a(String s)
            throws MalformedURLException, IOException
        {
            return a(new URL(s));
        }

        public abstract HttpURLConnection a(URL url)
            throws IOException;

        b()
        {
        }
    }

    static interface c
    {

        public abstract b a(Context context);
    }


    private static c a = new a();

    public g()
    {
    }

    public static b a(Context context)
    {
        return a.a(context);
    }

    static void a(c c1)
    {
        a = c1;
    }

}

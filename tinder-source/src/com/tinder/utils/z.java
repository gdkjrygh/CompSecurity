// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.utils;

import android.content.Context;
import android.os.AsyncTask;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

// Referenced classes of package com.tinder.utils:
//            p, v

public final class z
{
    public static final class a extends AsyncTask
    {

        private Context a;

        private transient Void a(Object aobj[])
        {
            byte abyte0[] = null;
            if (aobj.length == 2) goto _L2; else goto _L1
_L1:
            return null;
_L2:
            Runnable runnable;
            String s;
            s = (String)aobj[0];
            runnable = (Runnable)aobj[1];
            aobj = z.a(a, s);
            if (aobj != null && ((File) (aobj)).exists() && !((File) (aobj)).delete())
            {
                v.b((new StringBuilder("Failed to remove liverail precache file: ")).append(((Object) (aobj))).toString());
            }
            aobj = (HttpURLConnection)(new URL(s)).openConnection();
            Object obj;
            ((HttpURLConnection) (aobj)).connect();
            if (((HttpURLConnection) (aobj)).getResponseCode() != 200)
            {
                v.b((new StringBuilder("Server returned HTTP ")).append(((HttpURLConnection) (aobj)).getResponseCode()).append(' ').append(((HttpURLConnection) (aobj)).getResponseMessage()).toString());
            }
            obj = ((HttpURLConnection) (aobj)).getInputStream();
            Object obj1 = new FileOutputStream(z.b(a, s));
            Object obj2;
            Object obj3;
            Object obj4;
            obj3 = ((Object) (aobj));
            obj4 = obj1;
            obj2 = obj;
            abyte0 = new byte[4096];
_L4:
            obj3 = ((Object) (aobj));
            obj4 = obj1;
            obj2 = obj;
            int i = ((InputStream) (obj)).read(abyte0);
            if (i == -1)
            {
                break; /* Loop/switch isn't completed */
            }
            obj3 = ((Object) (aobj));
            obj4 = obj1;
            obj2 = obj;
            ((OutputStream) (obj1)).write(abyte0, 0, i);
            if (true) goto _L4; else goto _L3
            abyte0;
_L11:
            Object aobj1[];
            aobj1 = aobj;
            obj3 = obj1;
            obj2 = obj;
            v.a((new StringBuilder("Failed to format URL for live rail advertising cache request. ")).append(s).toString(), abyte0);
            if (obj1 == null)
            {
                break MISSING_BLOCK_LABEL_261;
            }
            ((OutputStream) (obj1)).close();
            if (obj != null)
            {
                try
                {
                    ((InputStream) (obj)).close();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    v.a("Failed to close output stream for ad cache", ((Throwable) (obj)));
                }
            }
            if (aobj != null)
            {
                ((HttpURLConnection) (aobj)).disconnect();
            }
_L6:
            if (runnable == null) goto _L1; else goto _L5
_L5:
            runnable.run();
            return null;
_L3:
            ((OutputStream) (obj1)).close();
            if (obj != null)
            {
                try
                {
                    ((InputStream) (obj)).close();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    v.a("Failed to close output stream for ad cache", ((Throwable) (obj)));
                }
            }
            if (aobj != null)
            {
                ((HttpURLConnection) (aobj)).disconnect();
            }
              goto _L6
            abyte0;
            aobj = null;
            obj1 = null;
            obj = null;
_L10:
            aobj1 = aobj;
            obj3 = obj1;
            obj2 = obj;
            v.a((new StringBuilder("Failed to open cache file for video ad, file does not exist? ")).append(z.b(a, s)).toString(), abyte0);
            if (obj1 == null)
            {
                break MISSING_BLOCK_LABEL_388;
            }
            ((OutputStream) (obj1)).close();
            if (obj != null)
            {
                try
                {
                    ((InputStream) (obj)).close();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    v.a("Failed to close output stream for ad cache", ((Throwable) (obj)));
                }
            }
            if (aobj != null)
            {
                ((HttpURLConnection) (aobj)).disconnect();
            }
              goto _L6
            abyte0;
            aobj1 = null;
            aobj = null;
            obj = null;
_L9:
            obj3 = ((Object) (aobj1));
            obj4 = ((Object) (aobj));
            obj2 = obj;
            v.a("Failed to read from response stream or cache file for video ad.", abyte0);
            if (aobj == null)
            {
                break MISSING_BLOCK_LABEL_451;
            }
            ((OutputStream) (aobj)).close();
            if (obj != null)
            {
                try
                {
                    ((InputStream) (obj)).close();
                }
                // Misplaced declaration of an exception variable
                catch (Object aobj[])
                {
                    v.a("Failed to close output stream for ad cache", ((Throwable) (aobj)));
                }
            }
            if (aobj1 != null)
            {
                ((HttpURLConnection) (aobj1)).disconnect();
            }
              goto _L6
            obj1;
            aobj = null;
            obj = null;
_L8:
            if (abyte0 == null)
            {
                break MISSING_BLOCK_LABEL_497;
            }
            abyte0.close();
            if (obj != null)
            {
                try
                {
                    ((InputStream) (obj)).close();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    v.a("Failed to close output stream for ad cache", ((Throwable) (obj)));
                }
            }
            if (aobj != null)
            {
                ((HttpURLConnection) (aobj)).disconnect();
            }
            throw obj1;
            obj1;
            obj = null;
            continue; /* Loop/switch isn't completed */
            obj1;
            continue; /* Loop/switch isn't completed */
            obj1;
            abyte0 = ((byte []) (obj4));
            aobj = ((Object []) (obj3));
            obj = obj2;
            continue; /* Loop/switch isn't completed */
            obj1;
            aobj = aobj1;
            abyte0 = ((byte []) (obj3));
            obj = obj2;
            if (true) goto _L8; else goto _L7
_L7:
            abyte0;
            obj1 = null;
            obj = null;
            aobj1 = aobj;
            aobj = ((Object []) (obj1));
              goto _L9
            abyte0;
            obj1 = null;
            aobj1 = aobj;
            aobj = ((Object []) (obj1));
              goto _L9
            abyte0;
            aobj1 = aobj;
            aobj = ((Object []) (obj1));
              goto _L9
            abyte0;
            obj1 = null;
            obj = null;
              goto _L10
            abyte0;
            obj1 = null;
              goto _L10
            abyte0;
              goto _L10
            abyte0;
            aobj = null;
            obj1 = null;
            obj = null;
              goto _L11
            abyte0;
            obj1 = null;
            obj = null;
              goto _L11
            abyte0;
            obj1 = null;
              goto _L11
        }

        protected final Object doInBackground(Object aobj[])
        {
            return a(aobj);
        }

        public a(Context context)
        {
            a = context;
        }
    }


    public static File a(Context context, String s)
    {
        File file = new File(b(context, s));
        String s1;
        if (file.exists())
        {
            context = "hit";
        } else
        {
            context = "miss";
        }
        if (file.exists())
        {
            s1 = (new StringBuilder("(")).append(file.getAbsolutePath()).append(')').toString();
        } else
        {
            s1 = "";
        }
        String.format("Trying to load URL from cache for LiveRailWebView: %s for URL %s %s", new Object[] {
            context, s, s1
        });
        if (file.exists())
        {
            return file;
        } else
        {
            return null;
        }
    }

    static String b(Context context, String s)
    {
        String s1 = p.a(s);
        s = s.split("/");
        s = s[s.length - 1].split("\\.");
        s = String.format("%s.%s", new Object[] {
            s1, s[s.length - 1]
        });
        if (context.getExternalCacheDir() != null)
        {
            return (new StringBuilder()).append(context.getExternalCacheDir().getAbsolutePath()).append('/').append(s).toString();
        } else
        {
            return (new StringBuilder()).append(context.getCacheDir().getAbsolutePath()).append('/').append(s).toString();
        }
    }
}

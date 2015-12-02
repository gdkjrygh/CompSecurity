// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appsflyer.cache;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.appsflyer.cache:
//            RequestCacheData

public class CacheManager
{

    public static final String AF_CACHE_DIR = "AFRequestCache";
    public static final int CACHE_MAX_SIZE = 20;
    private static CacheManager ourInstance = new CacheManager();

    private CacheManager()
    {
    }

    private File getCacheDir(Context context)
    {
        return new File(context.getFilesDir(), "AFRequestCache");
    }

    public static CacheManager getInstance()
    {
        return ourInstance;
    }

    private RequestCacheData loadRequestData(File file)
    {
        RequestCacheData requestcachedata;
        try
        {
            FileReader filereader = new FileReader(file);
            char ac[] = new char[(int)file.length()];
            filereader.read(ac);
            requestcachedata = new RequestCacheData(ac);
            requestcachedata.setCacheKey(file.getName());
            filereader.close();
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            return null;
        }
        return requestcachedata;
    }

    public void cacheRequest(RequestCacheData requestcachedata, Context context)
    {
        File file;
        try
        {
            file = getCacheDir(context);
            if (!file.exists())
            {
                file.mkdir();
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (RequestCacheData requestcachedata)
        {
            Log.i("AppsFlyer_1.5.3", "Could not cache request");
            return;
        }
        if (file.listFiles().length > 20)
        {
            Log.i("AppsFlyer_1.5.3", "reached cache limit, not caching request");
            return;
        }
        Log.i("AppsFlyer_1.5.3", "caching request...");
        context = new File(getCacheDir(context), Long.toString(System.currentTimeMillis()));
        context.createNewFile();
        context = new OutputStreamWriter(new FileOutputStream(context.getPath(), true));
        context.write("version=");
        context.write(requestcachedata.getVersion());
        context.write(10);
        context.write("url=");
        context.write(requestcachedata.getRequestURL());
        context.write(10);
        context.write("data=");
        context.write(requestcachedata.getPostData());
        context.write(10);
        context.flush();
        context.close();
        return;
    }

    public void deleteRequest(String s, Context context)
    {
        context = new File(getCacheDir(context), s);
        Log.i("AppsFlyer_1.5.3", (new StringBuilder()).append("Deleting ").append(s).append(" from cache").toString());
        if (!context.exists())
        {
            break MISSING_BLOCK_LABEL_56;
        }
        context.delete();
        return;
        context;
        Log.i("AppsFlyer_1.5.3", (new StringBuilder()).append("Could not delete ").append(s).append(" from cache").toString(), context);
        return;
    }

    public List getCachedRequests(Context context)
    {
        ArrayList arraylist = new ArrayList();
        context = getCacheDir(context);
        if (context.exists())
        {
            break MISSING_BLOCK_LABEL_28;
        }
        context.mkdir();
        return arraylist;
        int j;
        context = context.listFiles();
        j = context.length;
        int i = 0;
_L2:
        File file;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        file = context[i];
        Log.i("AppsFlyer_1.5.3", (new StringBuilder()).append("Found cached request").append(file.getName()).toString());
        arraylist.add(loadRequestData(file));
        i++;
        if (true) goto _L2; else goto _L1
        context;
        Log.i("AppsFlyer_1.5.3", "Could not cache request");
_L1:
        return arraylist;
    }

    public void init(Context context)
    {
        try
        {
            if (!getCacheDir(context).exists())
            {
                getCacheDir(context).mkdir();
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.i("AppsFlyer_1.5.3", "Could not create cache directory");
        }
    }

}

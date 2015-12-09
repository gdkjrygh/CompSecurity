// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Looper;
import android.os.Process;
import android.os.StatFs;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.ThreadFactory;

// Referenced classes of package com.squareup.picasso:
//            UrlConnectionDownloader, Request, Transformation, BitmapHunter, 
//            Action, Downloader, OkHttpDownloader

final class Utils
{
    static final class ActivityManagerHoneycomb
    {

        static int getLargeMemoryClass(ActivityManager activitymanager)
        {
            return activitymanager.getLargeMemoryClass();
        }
    }

    static final class BitmapHoneycombMR1
    {

        static int getByteCount(Bitmap bitmap)
        {
            return bitmap.getByteCount();
        }
    }

    static final class OkHttpLoaderCreator
    {

        static Downloader create(Context context)
        {
            return new OkHttpDownloader(context);
        }
    }

    static final class PicassoThread extends Thread
    {

        public final void run()
        {
            Process.setThreadPriority(10);
            super.run();
        }

        public PicassoThread(Runnable runnable)
        {
            super(runnable);
        }
    }

    static final class PicassoThreadFactory
        implements ThreadFactory
    {

        public final Thread newThread(Runnable runnable)
        {
            return new PicassoThread(runnable);
        }

        PicassoThreadFactory()
        {
        }
    }


    static final StringBuilder MAIN_THREAD_KEY_BUILDER = new StringBuilder();

    static long calculateDiskCacheSize(File file)
    {
        long l = 0x500000L;
        long l1;
        file = new StatFs(file.getAbsolutePath());
        l1 = ((long)file.getBlockCount() * (long)file.getBlockSize()) / 50L;
        l = l1;
_L2:
        return Math.max(Math.min(l, 0x3200000L), 0x500000L);
        file;
        if (true) goto _L2; else goto _L1
_L1:
    }

    static int calculateMemoryCacheSize(Context context)
    {
        ActivityManager activitymanager = (ActivityManager)getService(context, "activity");
        boolean flag;
        int i;
        int j;
        if ((context.getApplicationInfo().flags & 0x100000) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j = activitymanager.getMemoryClass();
        i = j;
        if (flag)
        {
            i = j;
            if (android.os.Build.VERSION.SDK_INT >= 11)
            {
                i = ActivityManagerHoneycomb.getLargeMemoryClass(activitymanager);
            }
        }
        return (i * 0x100000) / 7;
    }

    static void checkMain()
    {
        if (!isMain())
        {
            throw new IllegalStateException("Method call should happen from the main thread.");
        } else
        {
            return;
        }
    }

    static void checkNotMain()
    {
        if (isMain())
        {
            throw new IllegalStateException("Method call should not happen from the main thread.");
        } else
        {
            return;
        }
    }

    static void closeQuietly(InputStream inputstream)
    {
        if (inputstream == null)
        {
            return;
        }
        try
        {
            inputstream.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            return;
        }
    }

    static File createDefaultCacheDir(Context context)
    {
        context = new File(context.getApplicationContext().getCacheDir(), "picasso-cache");
        if (!context.exists())
        {
            context.mkdirs();
        }
        return context;
    }

    static Downloader createDefaultDownloader(Context context)
    {
        boolean flag = false;
        Class.forName("com.squareup.okhttp.OkUrlFactory");
        flag = true;
_L4:
        boolean flag1 = false;
        Class.forName("com.squareup.okhttp.OkHttpClient");
        flag1 = true;
_L2:
        if (flag1 != flag)
        {
            throw new RuntimeException("Picasso detected an unsupported OkHttp on the classpath.\nTo use OkHttp with this version of Picasso, you'll need:\n1. com.squareup.okhttp:okhttp:1.6.0 (or newer)\n2. com.squareup.okhttp:okhttp-urlconnection:1.6.0 (or newer)\nNote that OkHttp 2.0.0+ is supported!");
        }
        if (flag1)
        {
            return OkHttpLoaderCreator.create(context);
        } else
        {
            return new UrlConnectionDownloader(context);
        }
        ClassNotFoundException classnotfoundexception;
        classnotfoundexception;
        if (true) goto _L2; else goto _L1
_L1:
        classnotfoundexception;
        if (true) goto _L4; else goto _L3
_L3:
    }

    static String createKey(Request request)
    {
        request = createKey(request, MAIN_THREAD_KEY_BUILDER);
        MAIN_THREAD_KEY_BUILDER.setLength(0);
        return request;
    }

    static String createKey(Request request, StringBuilder stringbuilder)
    {
        int i;
        int j;
        if (request.stableKey != null)
        {
            stringbuilder.ensureCapacity(request.stableKey.length() + 50);
            stringbuilder.append(request.stableKey);
        } else
        if (request.uri != null)
        {
            String s = request.uri.toString();
            stringbuilder.ensureCapacity(s.length() + 50);
            stringbuilder.append(s);
        } else
        {
            stringbuilder.ensureCapacity(50);
            stringbuilder.append(request.resourceId);
        }
        stringbuilder.append('\n');
        if (request.rotationDegrees != 0.0F)
        {
            stringbuilder.append("rotation:").append(request.rotationDegrees);
            if (request.hasRotationPivot)
            {
                stringbuilder.append('@').append(request.rotationPivotX).append('x').append(request.rotationPivotY);
            }
            stringbuilder.append('\n');
        }
        if (request.hasSize())
        {
            stringbuilder.append("resize:").append(request.targetWidth).append('x').append(request.targetHeight);
            stringbuilder.append('\n');
        }
        if (!request.centerCrop) goto _L2; else goto _L1
_L1:
        stringbuilder.append("centerCrop\n");
_L4:
        if (request.transformations != null)
        {
            i = 0;
            for (j = request.transformations.size(); i < j; i++)
            {
                stringbuilder.append(((Transformation)request.transformations.get(i)).key());
                stringbuilder.append('\n');
            }

        }
        break; /* Loop/switch isn't completed */
_L2:
        if (request.centerInside)
        {
            stringbuilder.append("centerInside\n");
        }
        if (true) goto _L4; else goto _L3
_L3:
        return stringbuilder.toString();
    }

    static int getBitmapBytes(Bitmap bitmap)
    {
        int i;
        if (android.os.Build.VERSION.SDK_INT >= 12)
        {
            i = BitmapHoneycombMR1.getByteCount(bitmap);
        } else
        {
            i = bitmap.getRowBytes() * bitmap.getHeight();
        }
        if (i < 0)
        {
            throw new IllegalStateException((new StringBuilder("Negative size: ")).append(bitmap).toString());
        } else
        {
            return i;
        }
    }

    static String getLogIdsForHunter(BitmapHunter bitmaphunter)
    {
        return getLogIdsForHunter(bitmaphunter, "");
    }

    static String getLogIdsForHunter(BitmapHunter bitmaphunter, String s)
    {
        s = new StringBuilder(s);
        Action action = bitmaphunter.getAction();
        if (action != null)
        {
            s.append(action.request.logId());
        }
        bitmaphunter = bitmaphunter.getActions();
        if (bitmaphunter != null)
        {
            int i = 0;
            for (int j = bitmaphunter.size(); i < j; i++)
            {
                if (i > 0 || action != null)
                {
                    s.append(", ");
                }
                s.append(((Action)bitmaphunter.get(i)).request.logId());
            }

        }
        return s.toString();
    }

    static int getResourceId(Resources resources, Request request)
        throws FileNotFoundException
    {
        if (request.resourceId != 0 || request.uri == null)
        {
            return request.resourceId;
        }
        String s = request.uri.getAuthority();
        if (s == null)
        {
            throw new FileNotFoundException((new StringBuilder("No package provided: ")).append(request.uri).toString());
        }
        List list = request.uri.getPathSegments();
        if (list == null || list.isEmpty())
        {
            throw new FileNotFoundException((new StringBuilder("No path segments: ")).append(request.uri).toString());
        }
        if (list.size() == 1)
        {
            int i;
            try
            {
                i = Integer.parseInt((String)list.get(0));
            }
            // Misplaced declaration of an exception variable
            catch (Resources resources)
            {
                throw new FileNotFoundException((new StringBuilder("Last path segment is not a resource ID: ")).append(request.uri).toString());
            }
            return i;
        }
        if (list.size() == 2)
        {
            request = (String)list.get(0);
            return resources.getIdentifier((String)list.get(1), request, s);
        } else
        {
            throw new FileNotFoundException((new StringBuilder("More than two path segments: ")).append(request.uri).toString());
        }
    }

    static Resources getResources(Context context, Request request)
        throws FileNotFoundException
    {
        if (request.resourceId != 0 || request.uri == null)
        {
            return context.getResources();
        }
        String s = request.uri.getAuthority();
        if (s == null)
        {
            throw new FileNotFoundException((new StringBuilder("No package provided: ")).append(request.uri).toString());
        }
        try
        {
            context = context.getPackageManager().getResourcesForApplication(s);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new FileNotFoundException((new StringBuilder("Unable to obtain resources for package: ")).append(request.uri).toString());
        }
        return context;
    }

    static Object getService(Context context, String s)
    {
        return context.getSystemService(s);
    }

    static boolean hasPermission(Context context, String s)
    {
        return context.checkCallingOrSelfPermission(s) == 0;
    }

    static boolean isAirplaneModeOn(Context context)
    {
        boolean flag = false;
        if (android.provider.Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0)
        {
            flag = true;
        }
        return flag;
    }

    static boolean isMain()
    {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    static boolean isWebPFile(InputStream inputstream)
        throws IOException
    {
label0:
        {
            byte abyte0[] = new byte[12];
            boolean flag = false;
            if (inputstream.read(abyte0, 0, 12) == 12)
            {
                if (!"RIFF".equals(new String(abyte0, 0, 4, "US-ASCII")) || !"WEBP".equals(new String(abyte0, 8, 4, "US-ASCII")))
                {
                    break label0;
                }
                flag = true;
            }
            return flag;
        }
        return false;
    }

    static void log(String s, String s1, String s2)
    {
        log(s, s1, s2, "");
    }

    static void log(String s, String s1, String s2, String s3)
    {
        Log.d("Picasso", String.format("%1$-11s %2$-12s %3$s %4$s", new Object[] {
            s, s1, s2, s3
        }));
    }

    static boolean parseResponseSourceHeader(String s)
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        s = s.split(" ", 2);
        if ("CACHE".equals(s[0]))
        {
            return true;
        }
        if (s.length == 1) goto _L1; else goto _L3
_L3:
        if (!"CONDITIONAL_CACHE".equals(s[0])) goto _L1; else goto _L4
_L4:
        int i = Integer.parseInt(s[1]);
        if (i == 304)
        {
            return true;
        }
          goto _L1
        s;
        return false;
    }

    static void sneakyRethrow(Throwable throwable)
    {
        sneakyThrow2(throwable);
    }

    private static void sneakyThrow2(Throwable throwable)
        throws Throwable
    {
        throw throwable;
    }

    static byte[] toByteArray(InputStream inputstream)
        throws IOException
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        byte abyte0[] = new byte[4096];
        do
        {
            int i = inputstream.read(abyte0);
            if (-1 != i)
            {
                bytearrayoutputstream.write(abyte0, 0, i);
            } else
            {
                return bytearrayoutputstream.toByteArray();
            }
        } while (true);
    }

}

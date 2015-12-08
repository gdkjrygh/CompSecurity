// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.chromium.base.PathUtils;

class MediaResourceGetter
{
    static class MediaMetadata
    {

        private final int mDurationInMilliseconds;
        private final int mHeight;
        private final boolean mSuccess;
        private final int mWidth;

        public boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj == null)
                {
                    return false;
                }
                if (getClass() != obj.getClass())
                {
                    return false;
                }
                obj = (MediaMetadata)obj;
                if (mDurationInMilliseconds != ((MediaMetadata) (obj)).mDurationInMilliseconds)
                {
                    return false;
                }
                if (mHeight != ((MediaMetadata) (obj)).mHeight)
                {
                    return false;
                }
                if (mSuccess != ((MediaMetadata) (obj)).mSuccess)
                {
                    return false;
                }
                if (mWidth != ((MediaMetadata) (obj)).mWidth)
                {
                    return false;
                }
            }
            return true;
        }

        int getDurationInMilliseconds()
        {
            return mDurationInMilliseconds;
        }

        int getHeight()
        {
            return mHeight;
        }

        int getWidth()
        {
            return mWidth;
        }

        public int hashCode()
        {
            int i = mDurationInMilliseconds;
            int j = mHeight;
            char c;
            if (mSuccess)
            {
                c = '\u04CF';
            } else
            {
                c = '\u04D5';
            }
            return (((i + 31) * 31 + j) * 31 + c) * 31 + mWidth;
        }

        boolean isSuccess()
        {
            return mSuccess;
        }

        public String toString()
        {
            return (new StringBuilder()).append("MediaMetadata[durationInMilliseconds=").append(mDurationInMilliseconds).append(", width=").append(mWidth).append(", height=").append(mHeight).append(", success=").append(mSuccess).append("]").toString();
        }

        MediaMetadata(int i, int j, int k, boolean flag)
        {
            mDurationInMilliseconds = i;
            mWidth = j;
            mHeight = k;
            mSuccess = flag;
        }
    }


    private static final MediaMetadata EMPTY_METADATA = new MediaMetadata(0, 0, 0, false);
    private static final String TAG = "MediaResourceGetter";
    private final MediaMetadataRetriever mRetriever = new MediaMetadataRetriever();

    MediaResourceGetter()
    {
    }

    static boolean androidDeviceOk(String s, int i)
    {
        return !"GT-I9100".contentEquals(s) || i >= 16;
    }

    private List canonicalize(List list)
    {
        ArrayList arraylist = new ArrayList(list.size());
        try
        {
            for (list = list.iterator(); list.hasNext(); arraylist.add((new File((String)list.next())).getCanonicalPath())) { }
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            Log.w("MediaResourceGetter", "canonicalization of file path failed");
        }
        return arraylist;
    }

    private MediaMetadata doExtractMetadata()
    {
        Object obj = extractMetadata(9);
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        Log.w("MediaResourceGetter", "missing duration metadata");
        obj = EMPTY_METADATA;
        return ((MediaMetadata) (obj));
        int k = Integer.parseInt(((String) (obj)));
        int i;
        int j;
        i = 0;
        j = 0;
        boolean flag = "yes".equals(extractMetadata(17));
        if (flag)
        {
            obj = "resource has video";
        } else
        {
            obj = "resource doesn't have video";
        }
        Log.d("MediaResourceGetter", ((String) (obj)));
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_194;
        }
        obj = extractMetadata(18);
        if (obj == null)
        {
            NumberFormatException numberformatexception;
            try
            {
                Log.w("MediaResourceGetter", "missing video width metadata");
                return EMPTY_METADATA;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.e("MediaResourceGetter", "Unable to extract medata", ((Throwable) (obj)));
            }
            break MISSING_BLOCK_LABEL_248;
        }
        break MISSING_BLOCK_LABEL_128;
        numberformatexception;
        Log.w("MediaResourceGetter", (new StringBuilder()).append("non-numeric duration: ").append(((String) (obj))).toString());
        return EMPTY_METADATA;
        i = Integer.parseInt(((String) (obj)));
        obj = extractMetadata(19);
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_188;
        }
        Log.w("MediaResourceGetter", "missing video height metadata");
        return EMPTY_METADATA;
        numberformatexception;
        Log.w("MediaResourceGetter", (new StringBuilder()).append("non-numeric width: ").append(((String) (obj))).toString());
        obj = EMPTY_METADATA;
        return ((MediaMetadata) (obj));
        j = Integer.parseInt(((String) (obj)));
        obj = new MediaMetadata(k, i, j, true);
        Log.d("MediaResourceGetter", (new StringBuilder()).append("extracted valid metadata: ").append(((MediaMetadata) (obj)).toString()).toString());
        return ((MediaMetadata) (obj));
        return EMPTY_METADATA;
        NumberFormatException numberformatexception1;
        numberformatexception1;
        Log.w("MediaResourceGetter", (new StringBuilder()).append("non-numeric height: ").append(((String) (obj))).toString());
        obj = EMPTY_METADATA;
        return ((MediaMetadata) (obj));
    }

    private static MediaMetadata extractMediaMetadata(Context context, String s, String s1, String s2)
    {
        return (new MediaResourceGetter()).extract(context, s, s1, s2);
    }

    private static MediaMetadata extractMediaMetadataFromFd(int i, long l, long l1)
    {
        return (new MediaResourceGetter()).extract(i, l, l1);
    }

    private List getRawAcceptableDirectories(Context context)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add("/mnt/sdcard/");
        arraylist.add("/sdcard/");
        arraylist.add((new StringBuilder()).append("/data/data/").append(context.getPackageName()).append("/cache/").toString());
        return arraylist;
    }

    private boolean isLoopbackAddress(String s)
    {
        return s != null && (s.equalsIgnoreCase("localhost") || s.equals("127.0.0.1") || s.equals("[::1]"));
    }

    void configure(int i, long l, long l1)
    {
        ParcelFileDescriptor parcelfiledescriptor = ParcelFileDescriptor.adoptFd(i);
        mRetriever.setDataSource(parcelfiledescriptor.getFileDescriptor(), l, l1);
        try
        {
            parcelfiledescriptor.close();
            return;
        }
        catch (IOException ioexception)
        {
            Log.e("MediaResourceGetter", (new StringBuilder()).append("Failed to close file descriptor: ").append(ioexception).toString());
        }
        return;
        Exception exception;
        exception;
        try
        {
            parcelfiledescriptor.close();
        }
        catch (IOException ioexception1)
        {
            Log.e("MediaResourceGetter", (new StringBuilder()).append("Failed to close file descriptor: ").append(ioexception1).toString());
        }
        throw exception;
    }

    void configure(String s)
    {
        mRetriever.setDataSource(s);
    }

    void configure(String s, Map map)
    {
        mRetriever.setDataSource(s, map);
    }

    boolean configure(Context context, String s, String s1, String s2)
    {
        URI uri;
        String s3;
        try
        {
            uri = URI.create(s);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("MediaResourceGetter", "Cannot parse uri.", context);
            return false;
        }
        s3 = uri.getScheme();
        if (s3 == null || s3.equals("file") || s3.equals("app"))
        {
            s = uriToFile(uri.getPath());
            if (!s.exists())
            {
                Log.e("MediaResourceGetter", "File does not exist.");
                return false;
            }
            if (!filePathAcceptable(s, context))
            {
                Log.e("MediaResourceGetter", "Refusing to read from unsafe file location.");
                return false;
            }
            try
            {
                configure(s.getAbsolutePath());
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Log.e("MediaResourceGetter", "Error configuring data source", context);
                return false;
            }
            return true;
        }
        if (!isLoopbackAddress(uri.getHost()) && !isNetworkReliable(context))
        {
            Log.w("MediaResourceGetter", "non-file URI can't be read due to unsuitable network conditions");
            return false;
        }
        context = new HashMap();
        if (!TextUtils.isEmpty(s1))
        {
            context.put("Cookie", s1);
        }
        if (!TextUtils.isEmpty(s2))
        {
            context.put("User-Agent", s2);
        }
        try
        {
            configure(s, ((Map) (context)));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("MediaResourceGetter", "Error configuring data source", context);
            return false;
        }
        return true;
    }

    MediaMetadata extract(int i, long l, long l1)
    {
        if (!androidDeviceOk(Build.MODEL, android.os.Build.VERSION.SDK_INT))
        {
            return EMPTY_METADATA;
        } else
        {
            configure(i, l, l1);
            return doExtractMetadata();
        }
    }

    MediaMetadata extract(Context context, String s, String s1, String s2)
    {
        if (!androidDeviceOk(Build.MODEL, android.os.Build.VERSION.SDK_INT))
        {
            return EMPTY_METADATA;
        }
        if (!configure(context, s, s1, s2))
        {
            Log.e("MediaResourceGetter", "Unable to configure metadata extractor");
            return EMPTY_METADATA;
        } else
        {
            return doExtractMetadata();
        }
    }

    String extractMetadata(int i)
    {
        return mRetriever.extractMetadata(i);
    }

    boolean filePathAcceptable(File file, Context context)
    {
        boolean flag1 = false;
        boolean flag;
        try
        {
            file = file.getCanonicalPath();
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            Log.w("MediaResourceGetter", "canonicalization of file path failed");
            return false;
        }
        context = canonicalize(getRawAcceptableDirectories(context));
        context.add(getExternalStorageDirectory());
        Log.d("MediaResourceGetter", (new StringBuilder()).append("canonicalized file path: ").append(file).toString());
        context = context.iterator();
        do
        {
            flag = flag1;
            if (!context.hasNext())
            {
                break;
            }
            if (!file.startsWith((String)context.next()))
            {
                continue;
            }
            flag = true;
            break;
        } while (true);
        return flag;
    }

    String getExternalStorageDirectory()
    {
        return PathUtils.getExternalStorageDirectory();
    }

    Integer getNetworkType(Context context)
    {
        context = (ConnectivityManager)context.getSystemService("connectivity");
        if (context == null)
        {
            Log.w("MediaResourceGetter", "no connectivity manager available");
            return null;
        }
        context = context.getActiveNetworkInfo();
        if (context == null)
        {
            Log.d("MediaResourceGetter", "no active network");
            return null;
        } else
        {
            return Integer.valueOf(context.getType());
        }
    }

    boolean isNetworkReliable(Context context)
    {
        if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0)
        {
            Log.w("MediaResourceGetter", "permission denied to access network state");
        } else
        {
            context = getNetworkType(context);
            if (context != null)
            {
                switch (context.intValue())
                {
                default:
                    Log.d("MediaResourceGetter", "no ethernet/wifi connection detected");
                    return false;

                case 1: // '\001'
                case 9: // '\t'
                    Log.d("MediaResourceGetter", "ethernet/wifi connection detected");
                    break;
                }
                return true;
            }
        }
        return false;
    }

    File uriToFile(String s)
    {
        return new File(s);
    }

}

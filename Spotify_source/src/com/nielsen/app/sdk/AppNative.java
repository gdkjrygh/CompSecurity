// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nielsen.app.sdk;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

// Referenced classes of package com.nielsen.app.sdk:
//            a, h

class AppNative
{

    public static final int a = 512;
    public static final String b = "AppSdk";
    public static final String c = "libAppSdk.so";
    private static AppNative d = null;
    private h e;

    private AppNative(Context context)
    {
        e = null;
        try
        {
            e = com.nielsen.app.sdk.a.m();
            System.loadLibrary("AppSdk");
            return;
        }
        catch (UnsatisfiedLinkError unsatisfiedlinkerror)
        {
            Log.e("AppSdk", "Nielsen AppSDK: could not load the shared libary - Possible Cause - UnsatisfiedLinkError. Manually loading the shared library !");
            if (!b(context))
            {
                Log.e("AppSdk", "Nielsen AppSDK: could not load the shared libary - Possible Cause - Manual loading of shared library Failed !");
                throw new UnsatisfiedLinkError(unsatisfiedlinkerror.getMessage());
            } else
            {
                Log.i("AppSdk", "Nielsen AppSDK: Manual loading of shared library Succeeded !");
                return;
            }
        }
    }

    public static AppNative a(Context context)
    {
        if (d == null)
        {
            d = new AppNative(context);
        }
        return d;
    }

    private boolean a(String s, String s1, String s2)
    {
        Object obj1;
        boolean flag;
        obj1 = null;
        flag = false;
        s = new ZipInputStream(new FileInputStream(s));
        Object obj = s.getNextEntry();
_L6:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_268;
        }
        if (((ZipEntry) (obj)).isDirectory() || !s1.equals(((ZipEntry) (obj)).getName())) goto _L2; else goto _L1
_L1:
        int i;
        obj = ((ZipEntry) (obj)).getName();
        i = ((String) (obj)).lastIndexOf(File.separator);
        s1 = ((String) (obj));
        if (i < 0)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        s1 = ((String) (obj)).substring(i + 1, ((String) (obj)).length());
        s1 = new BufferedOutputStream(new FileOutputStream((new StringBuilder()).append(s2).append(File.separator).append(s1).toString()));
        s2 = new byte[4096];
_L5:
        i = s.read(s2);
        if (i == -1) goto _L4; else goto _L3
_L3:
        s1.write(s2, 0, i);
          goto _L5
        obj;
        s2 = s1;
        s1 = s;
        s = ((String) (obj));
_L7:
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_179;
        }
        s2.close();
        if (s1 != null)
        {
            try
            {
                s1.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                Log.e("AppSdk", "Nielsen AppSDK: An IO Exception occured while closing the I/O streams.");
            }
        }
        throw s;
_L4:
        flag = true;
_L8:
        if (s1 != null)
        {
            try
            {
                s1.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Log.e("AppSdk", "Nielsen AppSDK: An IO Exception occured while closing the I/O streams.");
                return flag;
            }
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_208;
        }
        s.close();
        return flag;
_L2:
        s.closeEntry();
        obj = s.getNextEntry();
          goto _L6
        s;
        s1 = null;
        s2 = obj1;
          goto _L7
        s2;
        s1 = s;
        s = s2;
        s2 = obj1;
          goto _L7
        s1 = null;
          goto _L8
    }

    private boolean b(Context context)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        ApplicationInfo applicationinfo = context.getApplicationInfo();
        context = context.getFilesDir().toString();
        String s = (new StringBuilder()).append(context).append(File.separator).append("libAppSdk.so").toString();
        try
        {
            (new File(s)).delete();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("AppSdk", "Nielsen AppSDK: An exception occured while loading the shared libary manually.");
            return false;
        }
        flag = flag1;
        if (!a(applicationinfo.sourceDir, (new StringBuilder("lib")).append(File.separator).append(Build.CPU_ABI).append(File.separator).append("libAppSdk.so").toString(), context))
        {
            break MISSING_BLOCK_LABEL_120;
        }
        System.load(s);
        flag = true;
        return flag;
    }

    public long a()
    {
        long l = urlParserCreate();
        if (l == 0L)
        {
            throw new Exception("Failed instantiating the URL parser object on the native library");
        } else
        {
            return l;
        }
    }

    public long a(int i, int j, int k, String s, String s1, int l, int i1, 
            int j1, int k1, String s2, int l1, int i2)
    {
        long l2 = id3TagCreateParam(i, j, k, s, s1, l, i1, j1, k1, s2, l1, i2);
        if (l2 == 0L)
        {
            throw new Exception("Failed instantiating the id3Tag object on the native library");
        } else
        {
            return l2;
        }
    }

    public String a(long l, String s)
    {
        while (l == 0L || s == null || s.isEmpty()) 
        {
            return null;
        }
        return (String)urlParserGetDictionary(l).get(s);
    }

    public String a(long l, String s, boolean aflag[], String as[])
    {
        for (aflag[0] = false; l == 0L || s == null || s.isEmpty();)
        {
            return "";
        }

        return urlParserExecute(l, s, aflag, as);
    }

    public void a(long l)
    {
        if (l != 0L && !id3TagDelete(l))
        {
            throw new Exception("Failed deleting the ID3 tag object on the native library");
        } else
        {
            return;
        }
    }

    public boolean a(long l, String s, String s1)
    {
        while (l == 0L || s == null || s.isEmpty()) 
        {
            return false;
        }
        HashMap hashmap = new HashMap();
        hashmap.put(s, s1);
        return urlParserSetDictionary(l, hashmap);
    }

    public boolean a(long l, HashMap hashmap)
    {
        while (l == 0L || hashmap == null || hashmap.isEmpty()) 
        {
            return false;
        }
        return urlParserSetDictionary(l, hashmap);
    }

    public void b(long l)
    {
        if (l != 0L && !urlParserDelete(l))
        {
            throw new Exception("Failed deleting the URL parser object on the native library");
        } else
        {
            return;
        }
    }

    public HashMap c(long l)
    {
        if (l == 0L)
        {
            return null;
        } else
        {
            return urlParserGetDictionary(l);
        }
    }

    public native String getVersion();

    public native boolean id3TagAddOffset(long l, long l1, long l2);

    public native long id3TagCreate();

    public native long id3TagCreateParam(int i, int j, int k, String s, String s1, int l, int i1, 
            int j1, int k1, String s2, int l1, int i2);

    public native boolean id3TagDelete(long l);

    public native String id3TagGetFdCidAES128(long l);

    public native long id3TagGetFdCidAES128Size(long l);

    public native long id3TagGetFdSid(long l);

    public native String id3TagGetFdTimeOffset(long l);

    public native long id3TagGetFdTimestamp(long l);

    public native String id3TagGetFull(long l);

    public native String id3TagGetNewFdCid(long l);

    public native String id3TagGetNewPcCid(long l);

    public native String id3TagGetPcCidAES128(long l);

    public native long id3TagGetPcCidAES128Size(long l);

    public native long id3TagGetPcSid(long l);

    public native String id3TagGetPcTimeOffset(long l);

    public native long id3TagGetPcTimestamp(long l);

    public native String id3TagGetSessionFdCid(long l);

    public native String id3TagGetSessionPcCid(long l);

    public native String id3TagGetStreamType(long l);

    public native int id3TagGetTimerPing(long l, String s, String as[], String as1[], String as2[], String as3[], 
            String as4[], int ai[], int ai1[], int ai2[], int ai3[], char c1, boolean flag, 
            boolean flag1);

    public native String id3TagGetUrl(long l);

    public native String id3TagGetWatermarkTag(long l);

    public native String id3TagGetZeroCid(long l);

    public native boolean id3TagIsInfoTag(long l);

    public native boolean id3TagIsSessionCidChanged(long l);

    public native boolean id3TagIsSessionFdCidChanged(long l);

    public native boolean id3TagIsSessionPcCidChanged(long l);

    public native boolean id3TagIsTimerCidChanged(long l, String s);

    public native boolean id3TagLoad(long l, String s, boolean flag);

    public native void id3TagSetBreakoutParseParam(long l, int i);

    public native boolean id3TagSetFdCid(long l, String s);

    public native void id3TagSetFdCidParseParam(long l, int i);

    public native void id3TagSetFdOffsetParseParam(long l, int i);

    public native void id3TagSetMaxDaypartEntry(long l, int i);

    public native boolean id3TagSetPcCid(long l, String s);

    public native void id3TagSetPcCidParseParam(long l, int i);

    public native void id3TagSetPcOffsetParseParam(long l, int i);

    public native void id3TagSetPduParseParam(long l, int i);

    public native boolean id3TagSetStationId(long l, String s);

    public native void id3TagSetTagIdParseParam(long l, int i);

    public native long urlParserCalculatePosition(long l, long l1, long l2, long l3, String s);

    public native boolean urlParserCalculateVariable(long l, long l1, long l2, long l3, String s);

    public native long urlParserCreate();

    public native boolean urlParserDelete(long l);

    public native String urlParserExecute(long l, String s, boolean aflag[], String as[]);

    public native HashMap urlParserGetDictionary(long l);

    public native String urlParserProcessIagData(long l);

    public native boolean urlParserReset(long l);

    public native boolean urlParserSetDictionary(long l, HashMap hashmap);

}

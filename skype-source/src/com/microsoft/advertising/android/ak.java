// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

// Referenced classes of package com.microsoft.advertising.android:
//            av

final class ak
{
    public static final class a
        implements FilenameFilter
    {

        private String a;

        public final boolean accept(File file, String s)
        {
            while (!ak.b().equals(file.getAbsolutePath()) || !s.matches((new StringBuilder("^[0-9]+\\.")).append(a).append("$").toString())) 
            {
                return false;
            }
            return true;
        }

        public a(String s)
        {
            a = s;
        }
    }


    protected static final String a = System.getProperty("line.separator");
    private static String b = null;
    private static ak c;

    private ak()
    {
    }

    public static ak a()
    {
        if (c == null)
        {
            c = new ak();
        }
        return c;
    }

    private static al.a a(File file, String s)
    {
        long l1;
        long l = System.currentTimeMillis();
        String as[] = file.getName().split("\\.");
        if (as == null || as.length != 2)
        {
            av.d("HttpCache", (new StringBuilder("Unexpected cache filename format: ")).append(file.getName()).append(" - file is invalid").toString());
            file.delete();
            return null;
        }
        l1 = Long.parseLong(as[0]);
        if (l1 <= l)
        {
            (new StringBuilder("Cache file ")).append(file.getName()).append(" is expired");
            av.a("HttpCache");
            file.delete();
            return null;
        }
        Object obj;
        BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        obj = bufferedreader.readLine();
        bufferedreader.close();
        if (((String) (obj)).equals(s))
        {
            break MISSING_BLOCK_LABEL_198;
        }
        (new StringBuilder("Found cache file collision in file ")).append(file.getName()).append("- will evict cache file for url ").append(((String) (obj))).append(" in favor of url ").append(s);
        av.a("HttpCache");
        file.delete();
        return null;
        try
        {
            (new StringBuilder("Cache hit for url ")).append(s).append(" (file ").append(file.getName()).append(")");
            av.a("HttpCache");
            s = new FileInputStream(file);
            s.skip(((String) (obj)).length() + a.length());
            obj = new al.a();
            obj.b = s;
            obj.d = l1;
            obj.c = 200;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            av.b("HttpCache", (new StringBuilder("Failed to read cache file ")).append(file.getAbsolutePath()).toString(), s);
            return null;
        }
        return ((al.a) (obj));
    }

    protected static void a(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            b = (new StringBuilder(String.valueOf(s))).append(File.separator).append("MSAdsSDK").toString();
            s = new File(b);
            if (!s.exists())
            {
                s.mkdirs();
            }
        }
    }

    protected static void a(String s, al.a a1)
    {
        Object obj = null;
        String as[];
        long l1;
        as = (new File(b)).list(new a("[0-9]+"));
        l1 = System.currentTimeMillis();
        long l = 0L;
        if (as == null) goto _L2; else goto _L1
_L1:
        int j;
        Arrays.sort(as, Collections.reverseOrder());
        j = as.length;
        int i;
        i = 0;
        l = 0L;
          goto _L3
_L2:
        if (a1.d < System.currentTimeMillis())
        {
            (new StringBuilder("Not caching response for url ")).append(s).append(", expiration time (").append(a1.d).append(") is in the past");
            av.a("HttpCache");
            return;
        }
          goto _L4
_L18:
        Object obj2 = as[i];
        File file;
        long l2;
        l2 = Long.parseLong(((String) (obj2)).split("\\.")[0]);
        file = new File(b, ((String) (obj2)));
        if (l2 <= l1) goto _L6; else goto _L5
_L5:
        if (file.length() + l < 0xa00000L) goto _L8; else goto _L7
_L7:
        (new StringBuilder("Delecting unexpired cache file ")).append(((String) (obj2))).append(" as it would exceed the max cache size");
        av.a("HttpCache");
        file.delete();
          goto _L9
_L8:
        l += file.length();
          goto _L9
_L6:
        av.a("HttpCache");
        file.delete();
          goto _L9
        a1;
        s = ((String) (obj));
_L14:
        s.delete();
        av.b("HttpCache", "Exception caught adding to cache: ", a1);
        return;
_L4:
        String s1;
        s1 = (new StringBuilder(String.valueOf(a1.d))).append(".").append(c(s)).toString();
        obj2 = new File(b, s1);
        if (((File) (obj2)).exists())
        {
            av.d("HttpCache", (new StringBuilder("Attempting to cache file ")).append(s1).append(" for url ").append(s).append(", but it already exists.  Skipping cache add.").toString());
            return;
        }
        obj = null;
        file = null;
        InputStream inputstream = a1.b();
        a1 = ((al.a) (obj));
        ((File) (obj2)).createNewFile();
        a1 = ((al.a) (obj));
        obj = new FileOutputStream(((File) (obj2)));
        ((FileOutputStream) (obj)).write(s.getBytes());
        ((FileOutputStream) (obj)).write(a.getBytes());
        a1 = new byte[1024];
        j = 0;
        i = inputstream.read(a1);
_L12:
        if (i > 0)
        {
            break MISSING_BLOCK_LABEL_454;
        }
        ((FileOutputStream) (obj)).close();
        (new StringBuilder("Cached response for url ")).append(s).append(" in file ").append(s1).append(", total ").append(j).append(" bytes");
        av.a("HttpCache");
        ((FileOutputStream) (obj)).close();
        return;
        j += i;
        if ((long)j + l <= 0xa00000L) goto _L11; else goto _L10
_L10:
        a1 = (new StringBuilder("Cache size limit exceeded; will not cache result for url ")).append(s).toString();
        av.a("HttpCache");
        throw new Exception(a1);
        Object obj1;
        obj1;
_L17:
        a1 = ((al.a) (obj));
        av.a("HttpCache", (new StringBuilder("Failed to add new cache file at ")).append(((File) (obj2)).getAbsolutePath()).append("for url ").append(s).append(", deleting partial file.").toString(), ((Throwable) (obj1)));
        a1 = ((al.a) (obj));
        ((FileOutputStream) (obj)).close();
        a1 = ((al.a) (obj));
        ((File) (obj2)).delete();
_L13:
        ((FileOutputStream) (obj)).close();
        return;
_L11:
        ((FileOutputStream) (obj)).write(a1, 0, i);
        i = inputstream.read(a1);
          goto _L12
        obj1;
        a1 = ((al.a) (obj));
        av.a("HttpCache", (new StringBuilder("Failed to close and delete failed cache file at ")).append(((File) (obj2)).getAbsolutePath()).toString(), ((Throwable) (obj1)));
          goto _L13
        obj;
_L16:
        a1.close();
_L15:
        throw obj;
        a1;
        try
        {
            av.a("HttpCache", (new StringBuilder("Failed to reset input stream after caching for url ")).append(s).toString(), a1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (al.a a1)
        {
            s = ((String) (obj2));
        }
          goto _L14
        a1;
        av.a("HttpCache", (new StringBuilder("Failed to reset input stream after caching for url ")).append(s).toString(), a1);
          goto _L15
        a1;
        av.a("HttpCache", (new StringBuilder("Failed to reset input stream after caching for url ")).append(s).toString(), a1);
        return;
        obj1;
        a1 = ((al.a) (obj));
        obj = obj1;
          goto _L16
        obj1;
        obj = file;
          goto _L17
_L3:
        if (i < j) goto _L18; else goto _L2
_L9:
        i++;
          goto _L3
    }

    protected static al.a b(String s)
    {
        int i = 0;
        if (!TextUtils.isEmpty(s) && !TextUtils.isEmpty(b)) goto _L2; else goto _L1
_L2:
        Object obj;
        String as[];
        StringBuilder stringbuilder;
        try
        {
            File file = new File(b);
            obj = c(s);
            as = file.list(new a(((String) (obj))));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            av.b("HttpCache", "Exception caught retrieving from cache: ", s);
            return null;
        }
        if (as == null) goto _L4; else goto _L3
_L3:
        if (as.length != 0) goto _L5; else goto _L4
_L4:
        av.a("HttpCache");
        obj = null;
          goto _L6
_L5:
        if (as.length <= 1) goto _L8; else goto _L7
_L7:
        stringbuilder = new StringBuilder((new StringBuilder("Found multiple (")).append(as.length).append(") matches for url hash ").append(((String) (obj))).append("\n").toString());
        Arrays.sort(as);
        obj = as[as.length - 1];
        stringbuilder.append((new StringBuilder("Keeping cache file ")).append(((String) (obj))).append(" - Evicting: \n").toString());
_L15:
        if (i < as.length - 1) goto _L10; else goto _L9
_L9:
        av.d("HttpCache", stringbuilder.toString());
_L11:
        obj = new File(b, ((String) (obj)));
          goto _L6
_L10:
        (new File(b, as[i])).delete();
        stringbuilder.append((new StringBuilder(String.valueOf(as[i]))).append("\n").toString());
        i++;
        continue; /* Loop/switch isn't completed */
_L8:
        obj = as[0];
        av.a("HttpCache");
          goto _L11
_L13:
        s = a(((File) (obj)), s);
        return s;
_L1:
        obj = null;
_L6:
        if (obj != null) goto _L13; else goto _L12
_L12:
        return null;
        if (true) goto _L15; else goto _L14
_L14:
    }

    static String b()
    {
        return b;
    }

    private static String c(String s)
    {
        return Integer.toString(Math.abs(s.hashCode()));
    }

}

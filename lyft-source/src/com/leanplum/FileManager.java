// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

// Referenced classes of package com.leanplum:
//            aU, Leanplum, T, h, 
//            i, k, j, Util, 
//            Var, l

final class FileManager
{

    static Var a = null;
    public static final Object b = new Object();
    private static l c;
    private static boolean d = false;
    private static boolean e = false;

    public static int a(String s)
    {
        return (int)(new File(s)).length();
    }

    public static DownloadFileResult a(boolean flag, String s, String s1, Runnable runnable)
    {
        if (s == null || s.equals(s1) || flag && aU.c(s) != 0)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        if (Leanplum.a().getResources().getAssets().open(s) == null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        s1 = DownloadFileResult.EXISTS_IN_ASSETS;
        return s1;
        s1;
        if (!d(b(s)) && !d(c(s)))
        {
            s1 = T.a("downloadFile", null);
            s1.a(new h(runnable));
            s1.a(new i(runnable));
            s1.d(s);
            return DownloadFileResult.DOWNLOADING;
        }
        return DownloadFileResult.NONE;
    }

    public static k a(InputStream inputstream)
    {
        Object obj;
        int i1;
        int k1;
        int j1 = 0;
        Object obj1;
        try
        {
            obj1 = MessageDigest.getInstance("MD5");
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            inputstream.printStackTrace();
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            inputstream.printStackTrace();
            return null;
        }
        obj = new DigestInputStream(inputstream, ((MessageDigest) (obj1)));
        inputstream = new byte[8192];
        i1 = 0;
_L6:
        k1 = ((InputStream) (obj)).read(inputstream);
        if (k1 != -1) goto _L2; else goto _L1
_L1:
        ((InputStream) (obj)).close();
        inputstream = ((MessageDigest) (obj1)).digest();
        obj = new StringBuffer();
_L4:
        if (j1 >= inputstream.length)
        {
            return new k(((StringBuffer) (obj)).toString(), i1);
        }
          goto _L3
_L5:
        inputstream.close();
        throw obj;
_L3:
        obj1 = Integer.toHexString(inputstream[j1] & 0xff);
        if (((String) (obj1)).length() == 1)
        {
            ((StringBuffer) (obj)).append('0');
        }
        ((StringBuffer) (obj)).append(((String) (obj1)));
        j1++;
          goto _L4
        Exception exception;
        exception;
        inputstream = ((InputStream) (obj));
        obj = exception;
          goto _L5
_L2:
        i1 += k1;
          goto _L6
        obj;
          goto _L5
    }

    static InputStream a(boolean flag, Boolean boolean1, Boolean boolean2, String s, String s1, byte abyte0[])
    {
        if (s == null || s.equals(""))
        {
            return null;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        if (!s.equals(s1))
        {
            break MISSING_BLOCK_LABEL_52;
        }
        boolean1 = new ByteArrayInputStream(abyte0);
        return boolean1;
        try
        {
            abyte0 = Leanplum.a();
        }
        // Misplaced declaration of an exception variable
        catch (Boolean boolean1)
        {
            Log.e("Leanplum", "Error loading stream", boolean1);
            return null;
        }
        if (boolean2 != null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        boolean1 = abyte0.getAssets().open(s);
        return boolean1;
        if (boolean2.booleanValue() || boolean1.booleanValue() && s.equals(s1))
        {
            return abyte0.getAssets().open(s);
        }
_L2:
        boolean1 = new FileInputStream(new File(s));
        return boolean1;
        boolean1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static String a(String s, String s1)
    {
        return (new StringBuilder(String.valueOf(s))).append("/").append(s1).toString();
    }

    public static String a(String s, String s1, Boolean boolean1)
    {
        if (s.equals(s1))
        {
            String s2 = b(s1.toString());
            if (d(s2))
            {
                return s2;
            }
        }
        if (boolean1 != null) goto _L2; else goto _L1
_L1:
        Leanplum.a().getAssets().open(s);
        return s;
        boolean1;
_L4:
        String s3 = e(s);
        boolean1 = s3;
        if (!d(s3))
        {
            String s4 = c(s);
            boolean1 = s4;
            if (!d(s4))
            {
                s = b(s);
                boolean1 = s;
                if (!d(s))
                {
                    s = e(s1.toString());
                    boolean1 = s;
                    if (!d(s))
                    {
                        s = b(s1.toString());
                        boolean1 = s;
                        if (!d(s))
                        {
                            return s1.toString();
                        }
                    }
                }
            }
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (boolean1.booleanValue())
        {
            return s;
        }
        if (true) goto _L4; else goto _L3
_L3:
        return boolean1;
    }

    public static void a(l l1)
    {
        c = l1;
    }

    static void a(List list, List list1)
    {
        b(list, list1);
    }

    public static void a(List list, List list1, boolean flag)
    {
        e = true;
        if (d)
        {
            return;
        }
        if (flag)
        {
            Util.a(new j(list, list1), new Void[0]);
            return;
        } else
        {
            b(list, list1);
            return;
        }
    }

    public static boolean a()
    {
        return e;
    }

    public static boolean a(Map map, Map map1)
    {
        if (map1 == null)
        {
            return true;
        }
        String s = (String)map.get("hash");
        String s1 = (String)map1.get("hash");
        map = (Integer)map.get("size");
        map1 = (Integer)map1.get("size");
        if (map1 == null || !map.equals(map1))
        {
            return true;
        }
        return s != null && (s1 == null || !s.equals(s1));
    }

    public static String b(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return a("", s);
        }
    }

    private static void b(List list, List list1)
    {
        Object obj;
        a = Var.define("__Android Resources", new HashMap());
        obj = Leanplum.a();
        ZipInputStream zipinputstream = new ZipInputStream(new FileInputStream(((Context) (obj)).getPackageResourcePath()));
_L2:
        obj = zipinputstream;
        Object obj1 = zipinputstream.getNextEntry();
        int i1;
label0:
        {
            {
                if (obj1 != null)
                {
                    break label0;
                }
                String s;
                String s1;
                Object obj2;
                byte abyte0[];
                int j1;
                try
                {
                    zipinputstream.close();
                }
                // Misplaced declaration of an exception variable
                catch (List list)
                {
                    Log.e("tag", "Error", list);
                }
            }
            d = true;
            synchronized (b)
            {
                e = false;
                if (c != null)
                {
                    c.a();
                }
            }
            return;
        }
        obj = zipinputstream;
        s = ((ZipEntry) (obj1)).getName();
        obj = zipinputstream;
        if (s.startsWith("res/drawable"))
        {
            break; /* Loop/switch isn't completed */
        }
        obj = zipinputstream;
        if (!s.startsWith("res/layout")) goto _L2; else goto _L1
_L1:
        obj = zipinputstream;
        s1 = s.substring(4);
        if (list == null) goto _L4; else goto _L3
_L3:
        obj = zipinputstream;
        if (list.size() <= 0) goto _L4; else goto _L5
_L5:
        obj = zipinputstream;
        obj2 = list.iterator();
_L17:
        obj = zipinputstream;
        if (((Iterator) (obj2)).hasNext()) goto _L7; else goto _L6
_L6:
        i1 = 0;
          goto _L8
_L4:
        if (list1 == null) goto _L10; else goto _L9
_L9:
        obj = zipinputstream;
        obj2 = list1.iterator();
_L19:
        obj = zipinputstream;
        if (((Iterator) (obj2)).hasNext()) goto _L12; else goto _L11
_L11:
        i1 = 0;
          goto _L13
_L10:
        obj = zipinputstream;
        obj2 = new ByteArrayOutputStream();
        obj = zipinputstream;
        abyte0 = new byte[8192];
        i1 = 0;
_L20:
        obj = zipinputstream;
        j1 = zipinputstream.read(abyte0);
        if (j1 != -1) goto _L15; else goto _L14
_L14:
        obj = zipinputstream;
        zipinputstream.closeEntry();
        obj = zipinputstream;
        obj1 = (new StringBuilder()).append(((ZipEntry) (obj1)).getTime()).append(i1).toString();
        obj = zipinputstream;
        try
        {
            Var.a((new StringBuilder("__Android Resources.")).append(s1.replace(".", "\\.").replace('/', '.')).toString(), s, i1, ((String) (obj1)), ((ByteArrayOutputStream) (obj2)).toByteArray());
            break; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (List list1)
        {
            list = zipinputstream;
        }
        finally { }
_L21:
        obj = list;
        Log.e("tag", "Error", list1);
        if (list != null)
        {
            try
            {
                list.close();
            }
            // Misplaced declaration of an exception variable
            catch (List list)
            {
                Log.e("tag", "Error", list);
            }
        }
        break MISSING_BLOCK_LABEL_56;
_L7:
        obj = zipinputstream;
        if (!s1.matches((String)((Iterator) (obj2)).next())) goto _L17; else goto _L16
_L16:
        i1 = 1;
        continue; /* Loop/switch isn't completed */
_L12:
        obj = zipinputstream;
        if (!s1.matches((String)((Iterator) (obj2)).next())) goto _L19; else goto _L18
_L18:
        i1 = 1;
        continue; /* Loop/switch isn't completed */
_L15:
        obj = zipinputstream;
        ((ByteArrayOutputStream) (obj2)).write(abyte0, 0, j1);
        i1 += j1;
          goto _L20
        list;
        obj = null;
        if (obj != null)
        {
            try
            {
                ((ZipInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (List list1)
            {
                Log.e("tag", "Error", list1);
            }
        }
        throw list;
        list1;
        list = null;
          goto _L21
_L8:
        if (i1 == 0) goto _L22; else goto _L4
_L22:
        break; /* Loop/switch isn't completed */
_L13:
        if (i1 != 0) goto _L2; else goto _L10
    }

    public static String c(String s)
    {
        return a(Leanplum.a().getDir("Leanplum_Documents", 0).getAbsolutePath(), s);
    }

    private static boolean d(String s)
    {
        return (new File(s)).exists();
    }

    private static String e(String s)
    {
        return a(Leanplum.a().getDir("Leanplum_Bundle", 0).getAbsolutePath(), s);
    }


    private class DownloadFileResult extends Enum
    {

        public static final DownloadFileResult DOWNLOADING;
        public static final DownloadFileResult EXISTS_IN_ASSETS;
        public static final DownloadFileResult NONE;
        private static final DownloadFileResult a[];

        public static DownloadFileResult valueOf(String s)
        {
            return (DownloadFileResult)Enum.valueOf(com/leanplum/FileManager$DownloadFileResult, s);
        }

        public static DownloadFileResult[] values()
        {
            DownloadFileResult adownloadfileresult[] = a;
            int i1 = adownloadfileresult.length;
            DownloadFileResult adownloadfileresult1[] = new DownloadFileResult[i1];
            System.arraycopy(adownloadfileresult, 0, adownloadfileresult1, 0, i1);
            return adownloadfileresult1;
        }

        static 
        {
            NONE = new DownloadFileResult("NONE", 0);
            EXISTS_IN_ASSETS = new DownloadFileResult("EXISTS_IN_ASSETS", 1);
            DOWNLOADING = new DownloadFileResult("DOWNLOADING", 2);
            a = (new DownloadFileResult[] {
                NONE, EXISTS_IN_ASSETS, DOWNLOADING
            });
        }

        private DownloadFileResult(String s, int i1)
        {
            super(s, i1);
        }
    }

}

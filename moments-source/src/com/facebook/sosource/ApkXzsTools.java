// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.sosource;

import android.content.Context;
import android.content.res.AssetManager;
import com.facebook.androidcompat.AndroidCompat;
import com.facebook.soloader.FileLocker;
import com.facebook.soloader.SysUtil;
import com.facebook.xzdecoder.XzInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ApkXzsTools
{

    private ApkXzsTools()
    {
    }

    private static SoInfo a(String s, String as[])
    {
        String as1[] = s.split(" ");
        if (as1.length != 3)
        {
            throw new RuntimeException("Corrupt metadata");
        } else
        {
            int i = as1[0].indexOf('/');
            s = as1[0].substring(0, i);
            String s1 = as1[0].substring(i + 1);
            i = Integer.parseInt(as1[1]);
            String s2 = as1[2];
            return new SoInfo(s1, i, s, SysUtil.a(as, s), s2);
        }
    }

    public static void a(Context context, File file, List list, Map map, FileLocker filelocker)
    {
        Object obj;
        Object obj1;
        Object obj2;
        ArrayList arraylist;
        byte abyte0[];
        arraylist = new ArrayList();
        obj2 = null;
        obj = null;
        abyte0 = new byte[8192];
        obj1 = obj2;
        boolean flag = map.isEmpty();
        if (!flag) goto _L2; else goto _L1
_L1:
        SysUtil.a();
        if (filelocker != null)
        {
            filelocker.close();
        }
_L9:
        return;
_L2:
        obj1 = obj2;
        Object obj3 = new File(file, "metadata.txt");
        obj1 = obj2;
        if (!((File) (obj3)).exists())
        {
            break MISSING_BLOCK_LABEL_524;
        }
        obj1 = obj2;
        SysUtil.a(((File) (obj3)));
        break MISSING_BLOCK_LABEL_524;
_L5:
        obj2 = obj;
        obj1 = obj;
        int i;
        if (i >= list.size())
        {
            break MISSING_BLOCK_LABEL_465;
        }
        obj1 = obj;
        obj3 = (SoInfo)list.get(i);
        obj1 = obj;
        obj2 = (new StringBuilder()).append(((SoInfo) (obj3)).d).append('/').append(((SoInfo) (obj3)).c).toString();
        obj1 = obj;
        if (!((SoInfo) (obj3)).equals((SoInfo)map.get(((SoInfo) (obj3)).c))) goto _L4; else goto _L3
_L3:
        obj1 = obj;
        arraylist.add(obj3);
        obj1 = obj;
        obj2 = context.getAssets().open((new StringBuilder("lib/")).append(((String) (obj2))).toString());
        obj1 = obj;
        SysUtil.a(((InputStream) (obj2)), new File(file, ((SoInfo) (obj3)).c), ((SoInfo) (obj3)).a);
        obj1 = obj;
        ((InputStream) (obj2)).close();
_L6:
        obj1 = obj;
        if (map.size() == 1)
        {
            break MISSING_BLOCK_LABEL_461;
        }
        obj1 = obj;
        map.remove(((SoInfo) (obj3)).c);
_L7:
        i++;
          goto _L5
        obj1;
        obj2 = obj;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_345;
        }
        obj1 = obj;
        obj2 = new XzInputStream(context.getAssets().open("lib/libs.xzs"));
        obj1 = obj2;
        SysUtil.a(((InputStream) (obj2)), new File(file, ((SoInfo) (obj3)).c), ((SoInfo) (obj3)).a);
        obj = obj2;
          goto _L6
_L4:
        obj1 = obj;
        context.getAssets().open((new StringBuilder("lib/")).append(((String) (obj2))).toString()).close();
          goto _L7
        obj1;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_442;
        }
        obj1 = obj;
        obj = new XzInputStream(context.getAssets().open("lib/libs.xzs"));
        obj1 = obj;
        a(((InputStream) (obj)), ((SoInfo) (obj3)).a, abyte0);
          goto _L7
        obj2 = obj;
        obj1 = obj2;
        a(((List) (arraylist)), file, filelocker);
        SysUtil.a();
        if (obj2 == null) goto _L9; else goto _L8
_L8:
        ((InputStream) (obj2)).close();
        return;
        context;
_L11:
        SysUtil.a();
        if (filelocker != null)
        {
            filelocker.close();
        }
        if (obj1 != null)
        {
            ((InputStream) (obj1)).close();
        }
        throw context;
        context;
        if (true) goto _L11; else goto _L10
_L10:
        i = 0;
          goto _L5
    }

    public static void a(Context context, List list, Map map)
    {
        Object obj;
        InputStream inputstream;
        InputStreamReader inputstreamreader;
        BufferedReader bufferedreader;
        obj = null;
        String as[];
        SoInfo soinfo;
        try
        {
            inputstream = context.getAssets().open("lib/metadata.txt");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
        inputstreamreader = new InputStreamReader(inputstream);
        bufferedreader = new BufferedReader(inputstreamreader);
        as = SysUtil.b();
        context = bufferedreader.readLine();
_L1:
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        context = a(((String) (context)), as);
        if (((SoInfo) (context)).b < 0)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        soinfo = (SoInfo)map.get(((SoInfo) (context)).c);
        if (soinfo == null)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        if (((SoInfo) (context)).b >= soinfo.b)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        map.put(((SoInfo) (context)).c, context);
        list.add(context);
        context = bufferedreader.readLine();
          goto _L1
        bufferedreader.close();
        inputstreamreader.close();
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_145;
        }
        inputstream.close();
        return;
        list;
        throw list;
        context;
_L12:
        if (list == null) goto _L3; else goto _L2
_L2:
        bufferedreader.close();
_L10:
        try
        {
            throw context;
        }
        // Misplaced declaration of an exception variable
        catch (List list) { }
        throw list;
        context;
_L13:
        if (list == null) goto _L5; else goto _L4
_L4:
        inputstreamreader.close();
_L11:
        try
        {
            throw context;
        }
        // Misplaced declaration of an exception variable
        catch (List list) { }
        throw list;
        context;
_L14:
        if (inputstream == null) goto _L7; else goto _L6
_L6:
        if (list == null) goto _L9; else goto _L8
_L8:
        inputstream.close();
_L7:
        throw context;
        map;
        AndroidCompat.a(list, map);
          goto _L10
_L3:
        bufferedreader.close();
          goto _L10
        map;
        AndroidCompat.a(list, map);
          goto _L11
_L5:
        inputstreamreader.close();
          goto _L11
        map;
        AndroidCompat.a(list, map);
          goto _L7
_L9:
        inputstream.close();
          goto _L7
        context;
        list = null;
          goto _L12
        context;
        list = null;
          goto _L13
        context;
        list = obj;
          goto _L14
    }

    public static void a(File file, Map map)
    {
        Throwable throwable;
        FileInputStream fileinputstream;
        Object obj;
        Object obj1;
        throwable = null;
        String as[];
        try
        {
            fileinputstream = new FileInputStream(new File(file, "metadata.txt"));
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            return;
        }
        obj = new InputStreamReader(fileinputstream);
        obj1 = new BufferedReader(((java.io.Reader) (obj)));
        as = SysUtil.b();
        file = ((BufferedReader) (obj1)).readLine();
_L1:
        if (file == null)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        file = a(((String) (file)), as);
        map.put(((SoInfo) (file)).c, file);
        file = ((BufferedReader) (obj1)).readLine();
          goto _L1
        ((BufferedReader) (obj1)).close();
        ((InputStreamReader) (obj)).close();
        fileinputstream.close();
        return;
        map;
        throw map;
        file;
_L11:
        if (map == null) goto _L3; else goto _L2
_L2:
        ((BufferedReader) (obj1)).close();
_L8:
        try
        {
            throw file;
        }
        // Misplaced declaration of an exception variable
        catch (Map map) { }
        throw map;
        file;
_L12:
        if (map == null) goto _L5; else goto _L4
_L4:
        ((InputStreamReader) (obj)).close();
_L9:
        try
        {
            throw file;
        }
        // Misplaced declaration of an exception variable
        catch (Map map) { }
        throw map;
        file;
_L13:
        if (map == null) goto _L7; else goto _L6
_L6:
        fileinputstream.close();
_L10:
        throw file;
        obj1;
        AndroidCompat.a(map, ((Throwable) (obj1)));
          goto _L8
_L3:
        ((BufferedReader) (obj1)).close();
          goto _L8
        obj;
        AndroidCompat.a(map, ((Throwable) (obj)));
          goto _L9
_L5:
        ((InputStreamReader) (obj)).close();
          goto _L9
        throwable;
        AndroidCompat.a(map, throwable);
          goto _L10
_L7:
        fileinputstream.close();
          goto _L10
        file;
        map = null;
          goto _L11
        file;
        map = null;
          goto _L12
        file;
        map = throwable;
          goto _L13
    }

    public static void a(File file, Map map, Map map1)
    {
        file = file.listFiles();
        int i = 0;
        while (i < file.length) 
        {
            File file1 = file[i];
            String s = file1.getName();
            if (s.equals("metadata.txt"))
            {
                continue;
            }
            SoInfo soinfo = (SoInfo)map.get(s);
            SoInfo soinfo1 = (SoInfo)map1.get(s);
            boolean flag;
            boolean flag1;
            if (soinfo1 == null || soinfo == null || !soinfo.e.equals(soinfo1.e))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (soinfo != null && !flag)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag)
            {
                SysUtil.a(file1);
            }
            if (flag1)
            {
                map.remove(s);
            }
            i++;
        }
    }

    private static void a(InputStream inputstream, int i, byte abyte0[])
    {
        int j;
        for (; i > 0; i -= j)
        {
            j = inputstream.read(abyte0, 0, Math.min(i, 8192));
            if (j == -1)
            {
                throw new RuntimeException((new StringBuilder("Reached EOF with ")).append(i).append(" bytes left to read").toString());
            }
        }

    }

    private static void a(List list, File file, FileLocker filelocker)
    {
        (new _cls1(file, list, filelocker)).start();
    }

    private class SoInfo
    {

        public final int a;
        public final int b;
        public final String c;
        public final String d;
        public final String e;

        public final boolean equals(Object obj)
        {
            if (obj instanceof SoInfo)
            {
                if (a == ((SoInfo) (obj = (SoInfo)obj)).a && c.equals(((SoInfo) (obj)).c) && d.equals(((SoInfo) (obj)).d) && e.equals(((SoInfo) (obj)).e))
                {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode()
        {
            return b + a + c.hashCode() + d.hashCode() + e.hashCode();
        }

        SoInfo(String s, int i, String s1, int j, String s2)
        {
            c = s;
            a = i;
            d = s1;
            b = j;
            e = s2;
        }
    }


    private class _cls1 extends Thread
    {

        final File a;
        final List b;
        final FileLocker c;

        public final void run()
        {
            Object obj1;
            Object obj2;
            Throwable throwable;
            boolean flag;
            flag = false;
            throwable = null;
            obj1 = null;
            obj2 = null;
            Object obj;
            FileWriter filewriter;
            obj = new File(a, "metadata.tmp");
            filewriter = new FileWriter(((File) (obj)));
            BufferedWriter bufferedwriter = new BufferedWriter(filewriter);
            PrintWriter printwriter = new PrintWriter(bufferedwriter);
            int i = 0;
_L2:
            if (i >= b.size())
            {
                break; /* Loop/switch isn't completed */
            }
            SoInfo soinfo = (SoInfo)b.get(i);
            printwriter.println((new StringBuilder()).append(soinfo.d).append('/').append(soinfo.c).append(' ').append(soinfo.a).append(' ').append(soinfo.e).toString());
            i++;
            if (true) goto _L2; else goto _L1
_L1:
            printwriter.close();
            bufferedwriter.close();
            filewriter.close();
            i = ((flag) ? 1 : 0);
_L4:
            if (i >= b.size())
            {
                break; /* Loop/switch isn't completed */
            }
            obj2 = (SoInfo)b.get(i);
            obj2 = new FileOutputStream(new File(a, ((SoInfo) (obj2)).c), true);
            ((FileOutputStream) (obj2)).getFD().sync();
            ((FileOutputStream) (obj2)).close();
            i++;
            if (true) goto _L4; else goto _L3
            obj1;
            throw obj1;
            obj;
_L20:
            if (obj1 == null) goto _L6; else goto _L5
_L5:
            printwriter.close();
_L11:
            try
            {
                throw obj;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
            throw obj1;
            obj;
_L21:
            if (obj1 == null) goto _L8; else goto _L7
_L7:
            bufferedwriter.close();
_L12:
            try
            {
                throw obj;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
            throw obj1;
            obj;
_L22:
            if (obj1 == null) goto _L10; else goto _L9
_L9:
            filewriter.close();
_L13:
            throw obj;
            obj;
            throw new RuntimeException(((Throwable) (obj)));
            obj;
            try
            {
                c.close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new RuntimeException(((Throwable) (obj)));
            }
            throw obj;
            throwable;
            AndroidCompat.a(((Throwable) (obj1)), throwable);
              goto _L11
_L6:
            printwriter.close();
              goto _L11
            throwable;
            AndroidCompat.a(((Throwable) (obj1)), throwable);
              goto _L12
_L8:
            bufferedwriter.close();
              goto _L12
            obj2;
            AndroidCompat.a(((Throwable) (obj1)), ((Throwable) (obj2)));
              goto _L13
_L10:
            filewriter.close();
              goto _L13
            obj1;
            throw obj1;
            obj;
_L19:
            if (obj1 == null)
            {
                break MISSING_BLOCK_LABEL_395;
            }
            ((FileOutputStream) (obj2)).close();
_L14:
            throw obj;
            obj2;
            AndroidCompat.a(((Throwable) (obj1)), ((Throwable) (obj2)));
              goto _L14
            ((FileOutputStream) (obj2)).close();
              goto _L14
_L3:
            obj2 = new File(a, "metadata.txt");
            ((File) (obj)).renameTo(((File) (obj2)));
            obj2 = new FileOutputStream(((File) (obj2)), true);
            ((FileOutputStream) (obj2)).getFD().sync();
            ((FileOutputStream) (obj2)).close();
            try
            {
                c.close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new RuntimeException(((Throwable) (obj)));
            }
            obj1;
            throw obj1;
            obj;
_L17:
            if (obj1 == null)
            {
                break MISSING_BLOCK_LABEL_474;
            }
            ((FileOutputStream) (obj2)).close();
_L15:
            throw obj;
            obj2;
            AndroidCompat.a(((Throwable) (obj1)), ((Throwable) (obj2)));
              goto _L15
            ((FileOutputStream) (obj2)).close();
              goto _L15
            obj;
            if (true) goto _L17; else goto _L16
_L16:
            obj;
            obj1 = throwable;
            if (true) goto _L19; else goto _L18
_L18:
            obj;
            obj1 = null;
              goto _L20
            obj;
            obj1 = null;
              goto _L21
            obj;
            obj1 = obj2;
              goto _L22
        }

        _cls1(File file, List list, FileLocker filelocker)
        {
            a = file;
            b = list;
            c = filelocker;
            super();
        }
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translatedecoder.b;

import com.google.android.apps.translatedecoder.util.StringMap;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

// Referenced classes of package com.google.android.apps.translatedecoder.b:
//            a

public final class b
    implements a
{

    private static final Logger a = Logger.getLogger("translate");
    private static final int b;
    private static int c = 0;
    private static List d;
    private static int e[];
    private static List f;
    private StringMap g;
    private Map h;
    private String i;

    private b(StringMap stringmap)
    {
        g = null;
        h = null;
        g = stringmap;
    }

    private b(String s)
    {
        g = null;
        h = null;
        i = s;
    }

    private static void a(Map map, String s)
    {
        Object obj;
        Object obj1;
        obj1 = null;
        obj = null;
        s = new BufferedReader(new InputStreamReader(new DataInputStream(new FileInputStream(s))));
_L4:
        obj = s.readLine();
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = ((String) (obj)).split("\\t");
        if (obj == null) goto _L4; else goto _L3
_L3:
        if (obj.length < 2) goto _L4; else goto _L5
_L5:
        map.put(obj[0], obj[1]);
          goto _L4
        map;
_L13:
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        s.close();
_L11:
        return;
_L2:
        try
        {
            s.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            return;
        }
        map;
        map = ((Map) (obj));
_L9:
        if (map != null)
        {
            try
            {
                map.close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Map map)
            {
                return;
            }
        }
        break; /* Loop/switch isn't completed */
        map;
        s = obj1;
_L7:
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
        throw map;
        map;
        return;
        map;
        if (true) goto _L7; else goto _L6
_L6:
        map;
        map = s;
        if (true) goto _L9; else goto _L8
_L8:
        if (true) goto _L11; else goto _L10
_L10:
        map;
        s = null;
        if (true) goto _L13; else goto _L12
_L12:
    }

    public static b b(String s)
    {
        if (s.endsWith(".txt"))
        {
            return new b(s);
        }
        s = new RandomAccessFile(s, "r");
        Object obj;
        obj = s.getChannel();
        obj = new b(StringMap.readFromByteBuffer(((FileChannel) (obj)).map(java.nio.channels.FileChannel.MapMode.READ_ONLY, 0L, (int)((FileChannel) (obj)).size())));
        try
        {
            s.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return ((b) (obj));
        }
        return ((b) (obj));
        s;
        s = null;
_L6:
        Object obj1;
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
        return null;
        s;
        s = null;
_L4:
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
        return null;
        obj1;
        s = null;
_L2:
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
        throw obj1;
        obj1;
        if (true) goto _L2; else goto _L1
_L1:
        obj1;
        if (true) goto _L4; else goto _L3
_L3:
        obj1;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final String a(String s)
    {
        if (g != null)
        {
            return g.get(s);
        }
        if (i != null && i.length() != 0) goto _L2; else goto _L1
_L2:
        List list = f;
        list;
        JVM INSTR monitorenter ;
        int k = c;
        int j = 0;
_L4:
        String s1;
        if (j >= b)
        {
            break MISSING_BLOCK_LABEL_157;
        }
        s1 = (String)d.get(j);
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_139;
        }
        if (!s1.equals(i))
        {
            break MISSING_BLOCK_LABEL_139;
        }
        c++;
        e[j] = c;
        s = (String)((Map)f.get(j)).get(s);
        list;
        JVM INSTR monitorexit ;
        return s;
        s;
        list;
        JVM INSTR monitorexit ;
        try
        {
            throw s;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        HashMap hashmap;
        if (e[j] < k)
        {
            k = j;
        }
        j++;
        continue; /* Loop/switch isn't completed */
        hashmap = new HashMap();
        hashmap.clear();
        a(((Map) (hashmap)), i);
        c++;
        e[k] = c;
        d.set(k, i);
        f.set(k, hashmap);
        s = (String)hashmap.get(s);
        list;
        JVM INSTR monitorexit ;
        return s;
_L1:
        return null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    static 
    {
        b = 2;
        e = new int[2];
        d = new ArrayList(b);
        f = new ArrayList(b);
        for (int j = 0; j < b; j++)
        {
            d.add(null);
            e[j] = 0;
            f.add(new HashMap());
        }

    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.j;

import com.kik.g.p;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package kik.a.j:
//            a

final class g
    implements Runnable
{

    final String a;
    final p b;
    final a c;

    g(a a1, String s, p p1)
    {
        c = a1;
        a = s;
        b = p1;
        super();
    }

    public final void run()
    {
        HashMap hashmap;
        Object obj;
        hashmap = new HashMap();
        obj = new File(kik.a.j.a.a(c), a);
        if (!((File) (obj)).isDirectory()) goto _L2; else goto _L1
_L1:
        int j;
        obj = ((File) (obj)).listFiles();
        j = obj.length;
        int i = 0;
_L8:
        if (i >= j) goto _L4; else goto _L3
_L3:
        Object obj1 = obj[i];
        String s;
        s = ((File) (obj1)).getName();
        obj1 = kik.a.j.a.a(a, s, ((File) (obj1)));
        if (obj1 == null) goto _L6; else goto _L5
_L5:
        hashmap.put(s, obj1);
          goto _L6
_L2:
        if (!((File) (obj)).exists())
        {
            break MISSING_BLOCK_LABEL_154;
        }
        obj = kik.a.j.a.a(a, null, ((File) (obj)));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_135;
        }
        hashmap.put("", obj);
        b.a(hashmap);
        return;
_L4:
        try
        {
            b.a(hashmap);
            return;
        }
        catch (IOException ioexception)
        {
            b.a(ioexception);
        }
        return;
        throw new IOException("No cached files found");
_L6:
        i++;
        if (true) goto _L8; else goto _L7
_L7:
    }
}

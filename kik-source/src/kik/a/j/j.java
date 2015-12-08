// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.j;

import com.kik.g.p;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kik.a.d.ab;

// Referenced classes of package kik.a.j:
//            a

final class j
    implements Runnable
{

    final p a;
    final a b;

    j(a a1, p p1)
    {
        b = a1;
        a = p1;
        super();
    }

    public final void run()
    {
        Object obj;
        String s;
        Object obj1;
        ArrayList arraylist;
        File afile[];
        int i;
        int k;
        int l;
        try
        {
            arraylist = new ArrayList();
            afile = kik.a.j.a.b(b).listFiles();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            a.a(((Throwable) (obj)));
            return;
        }
        if (afile == null) goto _L2; else goto _L1
_L1:
        k = afile.length;
        i = 0;
_L11:
        if (i >= k) goto _L2; else goto _L3
_L3:
        s = afile[i].getName();
        obj = s;
        if (s.indexOf('_') == 0)
        {
            obj = s.substring(1);
        }
        l = ((String) (obj)).indexOf('.');
        obj1 = null;
        if (l < 0) goto _L5; else goto _L4
_L4:
        s = ((String) (obj)).substring(0, l);
        obj = ((String) (obj)).substring(l + 1);
_L9:
        obj1 = new String[2];
        obj1[0] = s;
        obj1[1] = ((String) (obj));
        obj = obj1[0];
        s = obj1[1];
        obj1 = kik.a.j.a.a(b, ((String) (obj)), s);
        if (obj1 == null) goto _L7; else goto _L6
_L6:
        arraylist.add(obj1);
          goto _L8
_L7:
        throw new FileNotFoundException();
        obj1;
        arraylist.add(new ab(((String) (obj)), s));
          goto _L8
_L2:
        a.a(arraylist);
        return;
_L5:
        s = ((String) (obj));
        obj = obj1;
          goto _L9
_L8:
        i++;
        if (true) goto _L11; else goto _L10
_L10:
    }
}

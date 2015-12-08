// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.j;

import com.kik.g.p;
import java.io.File;
import java.io.IOException;

// Referenced classes of package kik.a.j:
//            a

final class k
    implements Runnable
{

    final String a;
    final String b;
    final byte c[];
    final p d;
    final a e;

    k(a a1, String s, String s1, byte abyte0[], p p1)
    {
        e = a1;
        a = s;
        b = s1;
        c = abyte0;
        d = p1;
        super();
    }

    public final void run()
    {
        Object obj;
        Object obj1;
        try
        {
            obj1 = kik.a.j.a.b(a, b);
            if ((new File(kik.a.j.a.b(e), (new StringBuilder("_")).append(((String) (obj1))).toString())).exists())
            {
                break MISSING_BLOCK_LABEL_68;
            }
        }
        catch (IOException ioexception)
        {
            d.a(ioexception);
            return;
        }
        obj = obj1;
        if (kik.a.j.a.b(e, a, b))
        {
            break MISSING_BLOCK_LABEL_85;
        }
        obj = (new StringBuilder("_")).append(((String) (obj1))).toString();
        obj = new File(kik.a.j.a.b(e), ((String) (obj)));
        obj1 = kik.a.j.a.a(e, a, b, c);
        if (!((File) (obj)).exists())
        {
            ((File) (obj)).createNewFile();
        }
        d.a(obj1);
        return;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.j;

import com.kik.g.p;
import com.kik.g.r;
import com.kik.g.s;
import java.util.Iterator;
import java.util.List;
import kik.a.e.x;

// Referenced classes of package kik.a.j:
//            r, o

final class q extends r
{

    final x a;
    final byte b[];
    final byte c[];
    final o d;

    q(o o, x x1, byte abyte0[], byte abyte1[])
    {
        d = o;
        a = x1;
        b = abyte0;
        c = abyte1;
        super();
    }

    public final void a(Object obj)
    {
        Object obj1 = (List)obj;
        obj = s.a(null);
        obj1 = ((List) (obj1)).iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            Object obj2 = (String)((Iterator) (obj1)).next();
            if (((String) (obj2)).startsWith("enc_"))
            {
                obj2 = a.a(((String) (obj2)));
                ((p) (obj2)).a(new kik.a.j.r(this));
                obj = s.a(((p) (obj)), ((p) (obj2)));
            }
        } while (true);
    }
}

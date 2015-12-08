// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.b;

import com.b.a.b;
import com.kik.g.as;
import com.kik.n.a.b.a;
import com.kik.n.a.b.c;

// Referenced classes of package kik.android.b:
//            s

final class v
    implements as
{

    final String a;
    final byte b[];
    final byte c[];
    final s d;

    v(s s, String s1, byte abyte0[], byte abyte1[])
    {
        d = s;
        a = s1;
        b = abyte0;
        c = abyte1;
        super();
    }

    public final Object a(Object obj)
    {
        Object obj1 = (c)obj;
        obj = obj1;
        if (obj1 == null)
        {
            obj = (new c()).a(a);
        }
        obj1 = new a();
        ((a) (obj1)).b(com.b.a.b.b(b));
        ((a) (obj1)).a(com.b.a.b.b(c));
        ((c) (obj)).a(((a) (obj1)));
        return obj;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.a.c;

import com.google.android.apps.gsa.a.b.b;
import com.google.android.apps.gsa.shared.speech.exception.NetworkRecognizeException;
import com.google.f.e.c;
import com.google.f.e.e;
import com.google.f.e.g;
import com.google.f.e.k;
import com.google.f.e.l;
import com.google.f.e.n;
import com.google.f.e.o;
import java.io.IOException;
import java.util.concurrent.Future;

// Referenced classes of package com.google.android.apps.gsa.a.c:
//            c, e

public class a extends com.google.android.apps.gsa.a.c.c
{

    public final com.google.android.apps.gsa.a.c.e a = new com.google.android.apps.gsa.a.c.e();
    private final Future b = null;
    private final Future c;
    private final Future d = null;
    private final c e;
    private final c f = null;
    private final e g = null;
    private final String h;
    private final String i;

    public a(Future future, c c1, String s, String s1)
    {
        c = future;
        e = c1;
        h = s;
        i = s1;
    }

    private static void a(l l1, com.google.protobuf.nano.c c1, Object obj)
    {
        if (obj != null)
        {
            l1.setExtension(c1, obj);
        }
    }

    private void a(l l1, com.google.protobuf.nano.c c1, Future future, int j)
    {
        if (future == null)
        {
            return;
        }
        try
        {
            l1.setExtension(c1, a.a(future));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (l l1)
        {
            throw new NetworkRecognizeException(l1, j);
        }
    }

    private boolean b(l l1, com.google.protobuf.nano.c c1, Future future, int j)
    {
        try
        {
            a(l1, c1, future, j);
        }
        // Misplaced declaration of an exception variable
        catch (l l1)
        {
            return false;
        }
        return true;
    }

    public l a()
    {
        l l1 = com.google.android.apps.gsa.a.b.b.a().a(i);
        b(l1, g.a, b, 0x20003);
        a(l1, c.a, e);
        a(l1, c.b, f);
        a(l1, e.a, g);
        b(l1, o.a, d, 0x20004);
        a(l1, n.a, (new n()).a(h));
        a(l1, k.a, c, 0x20005);
        return l1;
    }
}

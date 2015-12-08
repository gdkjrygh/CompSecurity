// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.android.stickers;

import android.content.Context;
import android.net.Uri;
import com.kik.g.f;
import com.kik.g.i;
import com.kik.g.p;
import com.kik.m.e;
import com.kik.m.k;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kik.a.d.w;
import kik.a.d.x;
import kik.a.e.u;
import kik.a.j.n;
import kik.android.f.a.ae;
import org.c.b;

// Referenced classes of package com.kik.android.stickers:
//            d, f, e

public final class c
    implements u
{

    private static final b a = org.c.c.a("StickerManager");
    private final kik.a.e.f b;
    private final f c;
    private final i d;
    private LinkedHashMap e;
    private n f;

    public c(Context context, kik.a.e.f f1)
    {
        c = new f();
        d = new d(this);
        e = new LinkedHashMap();
        b = f1;
        if (b != null)
        {
            c.a(b.b(), d);
        }
        f1 = new File(context.getCacheDir(), "stickers");
        context = context.getDir("stickers", 0);
        if (f1.exists())
        {
            try
            {
                ae.b(f1);
            }
            // Misplaced declaration of an exception variable
            catch (kik.a.e.f f1) { }
        }
        if (context == null || !context.exists())
        {
            break MISSING_BLOCK_LABEL_119;
        }
        ae.b(context);
        return;
        context;
    }

    static LinkedHashMap a(c c1)
    {
        return c1.e;
    }

    static List a(List list)
    {
        return b(list);
    }

    private static List b(List list)
    {
        ArrayList arraylist = new ArrayList();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            x x1 = (x)list.next();
            if (x1 != null && b(x1.c()))
            {
                Iterator iterator = (new ArrayList(x1.b())).iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    w w1 = (w)iterator.next();
                    if (w1 == null || !b(w1.c()) || !b(w1.b()) || !b(w1.a()))
                    {
                        x1.a(w1);
                    }
                } while (true);
                arraylist.add(x1);
            }
        } while (true);
        return arraylist;
    }

    static void b(x x1)
    {
        w w1;
        for (x1 = x1.b().iterator(); x1.hasNext(); k.a(w1.c()))
        {
            w1 = (w)x1.next();
            k.a(w1.b());
        }

    }

    private static boolean b(String s)
    {
        return s != null && Uri.parse(s) != null && Uri.parse(s).getHost() != null;
    }

    private static String c(x x1)
    {
        x1 = com.kik.m.e.b(MessageDigest.getInstance("SHA-256").digest(x1.d().getBytes()));
        return x1;
        x1;
        a.b("Error generating key for stickerPack", x1);
_L2:
        return null;
        x1;
        a.b("Error generating key for stickerPack", x1);
        if (true) goto _L2; else goto _L1
_L1:
    }

    static b c()
    {
        return a;
    }

    public final List a()
    {
        return new ArrayList(e.values());
    }

    public final void a(String s)
    {
        k.a(s);
    }

    public final void a(x x1)
    {
        ArrayList arraylist = new ArrayList();
        if (x1 != null)
        {
            arraylist.add(x1);
        }
        x1 = b(arraylist).iterator();
        do
        {
            if (!x1.hasNext())
            {
                break;
            }
            x x2 = (x)x1.next();
            if (x2 != null)
            {
                e.put(x2.a(), x2);
                f.b("sticker_pack", c(x2), x2.e()).a(new com.kik.android.stickers.f(this, x2));
            }
        } while (true);
    }

    public final void a(n n1)
    {
        f = n1;
    }

    public final p b()
    {
        p p1 = new p();
        f.c("sticker_pack", com/kik/n/a/f/c).a(new com.kik.android.stickers.e(this, p1));
        return p1;
    }

}

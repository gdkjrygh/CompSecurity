// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.os.Process;
import com.spotify.mobile.android.util.logging.Logger;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;

public final class glu
    implements Callable
{

    private final glt a;
    private bde b;

    public glu(glt glt1, bde bde1)
    {
        a = glt1;
        b = bde1;
    }

    private Long a()
    {
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        long l;
        l = 0L;
        obj3 = null;
        obj = null;
        obj1 = null;
        obj4 = null;
        Thread.currentThread().getId();
        Process.setThreadPriority(10);
        if (a.a(b))
        {
            obj = b;
            return Long.valueOf(0L);
        }
        obj2 = new gro();
        obj5 = (new grr()).a(b.a.toString()).b();
        obj5 = ((gro) (obj2)).a(((grq) (obj5))).a();
        obj2 = gqq.a(((grt) (obj5)).d());
        dmz.a(ggb);
        ggb.a();
        long l1 = gcf.a();
        long l2 = ((gqq) (obj2)).a();
        obj2 = a.a(b, l2 * 1000L + l1);
        obj3 = obj4;
        obj1 = obj2;
        obj4 = ((grt) (obj5)).e().d();
        obj3 = obj4;
        obj = obj4;
        obj1 = obj2;
        byte abyte0[] = new byte[4096];
_L2:
        obj3 = obj4;
        obj = obj4;
        obj1 = obj2;
        int i = ((InputStream) (obj4)).read(abyte0);
        if (i == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        l += i;
        obj3 = obj4;
        obj = obj4;
        obj1 = obj2;
        ((OutputStream) (obj2)).write(abyte0, 0, i);
        if (true) goto _L2; else goto _L1
        obj4;
_L6:
        obj = obj3;
        obj1 = obj2;
        Logger.c("Aborting segment cache for %s", new Object[] {
            b
        });
        obj = obj3;
        obj1 = obj2;
        a.c(b);
        obj = obj3;
        obj1 = obj2;
        throw obj4;
        obj3;
        obj2 = obj1;
        obj1 = obj;
        obj = obj3;
_L4:
        a(((Closeable) (obj2)));
        a(((Closeable) (obj1)));
        throw obj;
_L1:
        obj3 = obj4;
        obj = obj4;
        obj1 = obj2;
        a.b(b);
        obj3 = obj4;
        obj = obj4;
        obj1 = obj2;
        abyte0 = b;
        a(((Closeable) (obj2)));
        a(((Closeable) (obj4)));
        return Long.valueOf(l);
        obj;
        obj2 = null;
        if (true) goto _L4; else goto _L3
_L3:
        obj4;
        obj2 = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private static void a(Closeable closeable)
    {
        if (closeable == null)
        {
            break MISSING_BLOCK_LABEL_10;
        }
        closeable.close();
        return;
        closeable;
    }

    public final Object call()
    {
        return a();
    }
}

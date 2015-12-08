// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.i;

import android.graphics.Point;
import android.media.MediaMetadataRetriever;
import android.util.Pair;
import com.kik.android.a;
import com.kik.g.p;
import com.kik.g.s;
import com.kik.l.ab;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import kik.android.util.ct;

// Referenced classes of package kik.android.i:
//            h, j

public final class i
{

    private static i c;
    protected ab a;
    protected a b;
    private ExecutorService d;
    private Map e;

    private i()
    {
        d = Executors.newSingleThreadExecutor();
        e = new HashMap();
    }

    static Map a(i k)
    {
        return k.e;
    }

    public static i a()
    {
        if (c == null)
        {
            c = new i();
        }
        return c;
    }

    public final p a(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        if (!e.containsKey(s1)) goto _L2; else goto _L1
_L1:
        s1 = (p)((Pair)e.get(s1)).first;
_L4:
        this;
        JVM INSTR monitorexit ;
        return s1;
_L2:
        s1 = null;
        if (true) goto _L4; else goto _L3
_L3:
        s1;
        throw s1;
    }

    public final p a(String s1, int k, String s2)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = a(s1);
        if (obj == null) goto _L2; else goto _L1
_L1:
        s1 = ((String) (obj));
_L4:
        this;
        JVM INSTR monitorexit ;
        return s1;
_L2:
        obj = new MediaMetadataRetriever();
        ((MediaMetadataRetriever) (obj)).setDataSource(s1);
        int l = ct.a(((MediaMetadataRetriever) (obj)), 20);
        int i1 = ct.a(((MediaMetadataRetriever) (obj)), 18);
        int j1 = ct.a(((MediaMetadataRetriever) (obj)), 19);
        int k1 = ct.a(((MediaMetadataRetriever) (obj)), 24);
        long l1 = ct.b(((MediaMetadataRetriever) (obj)), 9);
        ((MediaMetadataRetriever) (obj)).release();
        String s3 = a.b(UUID.randomUUID().toString());
        Object obj1 = new h(s1, s3, new Point(i1, j1), k1, k);
        obj = ((h) (obj1)).a();
        obj1 = d.submit(((Runnable) (obj1)));
        e.put(s1, new Pair(obj, obj1));
        ((p) (obj)).a(new j(this, s3, s1, System.currentTimeMillis(), s2, i1, j1, l, l1));
        s1 = ((String) (obj));
        continue; /* Loop/switch isn't completed */
        s1;
        s1 = s.a(s1);
        if (true) goto _L4; else goto _L3
_L3:
        s1;
        throw s1;
    }

    public final void b(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        s1 = (Pair)e.get(s1);
        if (s1 != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Future future = (Future)((Pair) (s1)).second;
        if (future == null)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        future.cancel(true);
        s1 = (p)((Pair) (s1)).first;
        if (s1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        s1.e();
        if (true) goto _L1; else goto _L3
_L3:
        s1;
        throw s1;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.i;

import android.media.MediaMetadataRetriever;
import com.kik.android.a;
import com.kik.g.r;
import com.kik.l.ab;
import java.io.File;
import java.util.Map;
import kik.android.util.ct;

// Referenced classes of package kik.android.i:
//            i

final class j extends r
{

    final String a;
    final String b;
    final long c;
    final String d;
    final int e;
    final int f;
    final int g;
    final long h;
    final i i;

    j(i k, String s, String s1, long l, String s2, int i1, 
            int j1, int k1, long l1)
    {
        i = k;
        a = s;
        b = s1;
        c = l;
        d = s2;
        e = i1;
        f = j1;
        g = k1;
        h = l1;
        super();
    }

    public final void a()
    {
        kik.android.i.i.a(i).remove(b);
    }

    public final void a(Object obj)
    {
        File file;
        long l1;
        long l2;
        file = (File)obj;
        if (i.a.e(b))
        {
            (new File(b)).delete();
        }
        l1 = System.currentTimeMillis();
        l2 = c;
        i.a.a(d, file.getPath());
        obj = new MediaMetadataRetriever();
        ((MediaMetadataRetriever) (obj)).setDataSource(file.getPath());
        int k = ct.a(((MediaMetadataRetriever) (obj)), 20);
        int l = ct.a(((MediaMetadataRetriever) (obj)), 9);
        int i1 = ct.a(((MediaMetadataRetriever) (obj)), 18);
        int j1 = ct.a(((MediaMetadataRetriever) (obj)), 19);
        i.b.b("Video Re-encoded").a("Original Width", e).a("Original Height", f).a("Original Bitrate", g).a("Original Video Length", h).a("Original Video Size", (new File(b)).length()).a("Width", i1).a("Height", j1).a("Bitrate", k).a("Video Length", l).a("Size", file.length()).a("Encode Duration", l1 - l2).b();
        ((MediaMetadataRetriever) (obj)).release();
        return;
        Exception exception;
        exception;
        ((MediaMetadataRetriever) (obj)).release();
        throw exception;
    }

    public final void a(Throwable throwable)
    {
        (new File(a)).delete();
    }

    public final void b(Throwable throwable)
    {
        if (throwable == null)
        {
            throwable = "unknown";
        } else
        {
            throwable = throwable.toString();
        }
        i.b.b("Video Re-encoding Failed").a("Reason", throwable).b();
    }
}

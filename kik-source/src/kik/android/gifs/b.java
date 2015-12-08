// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.gifs;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.kik.g.p;
import com.kik.g.s;
import com.kik.l.ab;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kik.android.gifs.view.GifView;
import kik.android.gifs.view.a;
import kik.android.util.bx;

// Referenced classes of package kik.android.gifs:
//            e, f, c, d

public final class b
{
    private static final class a
    {

        private String a;
        private String b;

        public final boolean equals(Object obj)
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (obj != null)
            {
                flag = flag1;
                if (obj instanceof a)
                {
                    obj = (a)obj;
                    flag = flag1;
                    if (a != null)
                    {
                        flag = flag1;
                        if (b != null)
                        {
                            flag = flag1;
                            if (((a) (obj)).a != null)
                            {
                                flag = flag1;
                                if (((a) (obj)).b != null)
                                {
                                    flag = flag1;
                                    if (a.equals(((a) (obj)).a))
                                    {
                                        flag = flag1;
                                        if (b.equals(((a) (obj)).b))
                                        {
                                            flag = true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return flag;
        }

        public final int hashCode()
        {
            return (new StringBuilder()).append(a).append(b).toString().hashCode();
        }

        private a(String s1, String s2)
        {
            a = s1;
            b = s2;
        }

        a(String s1, String s2, byte byte0)
        {
            this(s1, s2);
        }
    }


    private static b a;
    private Context b;
    private ab c;
    private com.kik.android.a d;
    private Handler e;
    private ConcurrentMap f;
    private ConcurrentMap g;

    private b(Context context, ab ab1, com.kik.android.a a1)
    {
        f = new ConcurrentHashMap();
        g = new ConcurrentHashMap();
        b = context;
        c = ab1;
        d = a1;
        e = new Handler(Looper.getMainLooper());
    }

    static ConcurrentMap a(b b1)
    {
        return b1.g;
    }

    public static b a()
    {
        if (a == null)
        {
            bx.d(new IllegalArgumentException("Must be initiated by first calling setup. Unfortunate consequence of our injection system."));
        }
        return a;
    }

    public static b a(Context context, ab ab1, com.kik.android.a a1)
    {
        if (a == null)
        {
            a = new b(context, ab1, a1);
        }
        return a;
    }

    static void a(b b1, String s1, File file, int i, kik.android.gifs.a.f.a a1, p p1, GifView gifview)
    {
        gifview = new a(gifview.a(), file.getPath(), (byte)0);
        if (b1.f.containsKey(gifview))
        {
            ((p)b1.f.get(gifview)).a(new e(b1, p1));
            return;
        } else
        {
            s1 = kik.android.gifs.view.a.a(s1, file, i, a1, b1.b.getResources());
            b1.f.put(gifview, s1);
            s1.a(new f(b1, gifview, p1));
            return;
        }
    }

    static ConcurrentMap b(b b1)
    {
        return b1.f;
    }

    public final p a(String s1, kik.android.gifs.a.f.a a1, GifView gifview)
    {
        if (s1 == null)
        {
            return s.a(new Throwable("URL is null when trying to fetch GIF"));
        }
        if (gifview == null)
        {
            return s.a(new Throwable("GifView is null when trying to fetch GIF"));
        }
        p p1 = new p();
        if (g.containsKey(s1))
        {
            ((p)g.get(s1)).a(new c(this, s1, a1, p1, gifview));
            return p1;
        } else
        {
            p p2 = c.a(s1, null, d);
            g.put(s1, p2);
            p2.a(new d(this, s1, a1, p1, gifview));
            return p1;
        }
    }

    public final void a(Runnable runnable)
    {
        e.post(runnable);
    }
}

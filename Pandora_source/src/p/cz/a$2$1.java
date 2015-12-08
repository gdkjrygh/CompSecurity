// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cz;

import android.content.Context;
import android.os.Handler;
import com.pandora.radio.data.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p.cx.c;

// Referenced classes of package p.cz:
//            a

class bject
    implements Runnable
{

    final a a;

    public void run()
    {
        p.cz.a.a(a.a);
    }

    tring(tring tring)
    {
        a = tring;
        super();
    }

    // Unreferenced inner class p/cz/a$2

/* anonymous class */
    class a._cls2 extends Thread
    {

        final int a;
        final int b;
        final int c;
        final a d;

        public void run()
        {
            p.cz.a.a("loadGenreData thread");
            Object obj = d.a.f();
            p.cz.a.a((new StringBuilder()).append("genreList size:").append(((List) (obj)).size()).toString());
            if (a > ((List) (obj)).size())
            {
                p.cz.a.a((new StringBuilder()).append("loadGenreData categoryIndex out of range ").append(a).toString());
                p.cz.a.a();
                return;
            }
            obj = ((j)((List) (obj)).get(a)).d();
            p.cz.a.a((new StringBuilder()).append("category stations size=").append(((ArrayList) (obj)).size()).toString());
            if (b >= ((ArrayList) (obj)).size())
            {
                p.cz.a.a((new StringBuilder()).append("loadGenreData stationIndex out of range ").append(b).toString());
                p.cz.a.a();
                return;
            }
            int k = Math.min(((ArrayList) (obj)).size() - b, c);
            p.cz.a.a((new StringBuilder()).append("returning count=").append(k).toString());
            p.cz.a.a("populate requestList");
            int l = b;
            for (int i = b; i < k + l; i++)
            {
                com.pandora.radio.data.j.a a1 = (com.pandora.radio.data.j.a)((ArrayList) (obj)).get(i);
                String s = a1.d();
                d.g.put(a1.c(), new a.a(a, i, 0, s, null));
            }

            (new Handler(d.b.s().getMainLooper())).post(new a._cls2._cls1(this));
        }

            
            {
                d = a1;
                a = i;
                b = k;
                c = l;
                super(s);
            }
    }

}

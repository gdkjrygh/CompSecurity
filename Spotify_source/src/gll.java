// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Point;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Display;
import android.view.WindowManager;
import com.spotify.mobile.android.core.internal.ConnectivityListener;
import com.spotify.mobile.android.ui.page.DebugFlag;
import com.spotify.mobile.android.video.exo.DashManifestLoader;
import com.spotify.mobile.android.video.exo.NoSuitableRepresentationException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class gll
{

    final Handler a;
    final gkw b;
    public final DashManifestLoader c;
    final Looper d;
    final gkv e;
    final gkq f;
    private final gka g;
    private final ConnectivityListener h;
    private Context i;
    private final glt j;

    public gll(Context context, Looper looper, gkw gkw, glt glt, Looper looper1, gkq gkq, gkv gkv, 
            gka gka1)
    {
        i = context;
        b = gkw;
        a = new Handler(looper);
        dmz.a(gky);
        c = gky.a(looper);
        j = glt;
        d = looper1;
        e = gkv;
        f = gkq;
        g = gka1;
        c.a(gka1.a);
        h = new ConnectivityListener(null, context);
    }

    final gln a(bat bat1, gkr gkr, String s, HashMap hashmap)
    {
        ayo ayo1;
        bdg bdg1;
        int k;
        if (bat1.e.isEmpty())
        {
            throw new NoSuitableRepresentationException(0);
        }
        baw baw1 = (baw)bat1.e.get(0);
        int l = baw1.a(0);
        if (l == -1)
        {
            throw new NoSuitableRepresentationException(1);
        }
        ayo1 = new ayo(new bdf());
        bdg1 = new bdg();
        Object obj1 = (baq)baw1.a.get(l);
        ArrayList arraylist = new ArrayList();
        bay bay1;
        for (obj1 = ((baq) (obj1)).b.iterator(); ((Iterator) (obj1)).hasNext(); hashmap.put(bay1.a.a, bay1.a))
        {
            bay1 = (bay)((Iterator) (obj1)).next();
            arraylist.add(bay1.a);
        }

        hashmap = ((WindowManager)i.getSystemService("window")).getDefaultDisplay();
        obj1 = new Point();
        if (gcl.g)
        {
            hashmap.getRealSize(((Point) (obj1)));
        } else
        if (gcl.f)
        {
            hashmap.getSize(((Point) (obj1)));
        } else
        {
            obj1.x = hashmap.getWidth();
            obj1.y = hashmap.getHeight();
        }
        hashmap = glq.a(arraylist, ((Point) (obj1)).x, ((Point) (obj1)).y);
        if (hashmap.length == 0)
        {
            throw new NoSuitableRepresentationException(3);
        }
        obj1 = new glk("ExoPlayer (Android)", bdg1);
        bds.a("X-pid");
        bds.a(s);
        synchronized (((glk) (obj1)).a)
        {
            ((glk) (obj1)).a.put("X-pid", s);
        }
        s = new bdi(i, bdg1, ((bdo) (obj1)));
        if (j != null)
        {
            s = new glr(j, s, b);
        }
        if ("1".equals(g.d))
        {
            if (h.getConnectionType() == 5 || h.getConnectionType() == 6)
            {
                k = 0xc3500;
            } else
            {
                k = 0;
            }
        } else
        {
            k = 0;
        }
        s = new azz(new bam(bat1, l, hashmap, s, new bag(bdg1, k)), ayo1, 0xc80000, a, b, 1);
        dmz.a(glj);
        hashmap = a;
        obj = b;
        if (glj.a())
        {
            s = new glb(s, gkr, hashmap, new gld(((azh) (obj)), hashmap));
        } else
        {
            s = new azg(s, gkr, hashmap, ((azh) (obj)));
        }
        k = baw1.a(1);
        if (k == -1)
        {
            throw new NoSuitableRepresentationException(2);
        }
        break MISSING_BLOCK_LABEL_572;
        bat1;
        obj;
        JVM INSTR monitorexit ;
        throw bat1;
        hashmap = new bdi(i, bdg1, "ExoPlayer (Android)");
        if (j != null)
        {
            hashmap = new glr(j, hashmap, b);
        }
        bai bai1 = new bai();
        bat1 = new ayz(new azz(new bam(bat1, k, new int[] {
            0
        }, hashmap, bai1), ayo1, 0x3c0000, a, b, 0), gkr);
        gkr = new gln();
        ((gln) (gkr)).a[0] = s;
        ((gln) (gkr)).a[1] = bat1;
        return gkr;
    }

    // Unreferenced inner class gll$1

/* anonymous class */
    public final class _cls1
        implements gkx
    {

        private glm a;
        private String b;
        private gll c;

        public final void a(String s, bat bat1)
        {
            a.l();
            HashMap hashmap;
            Object obj1;
            hashmap = new HashMap();
            obj1 = c;
            if (((gll) (obj1)).f == null) goto _L2; else goto _L1
_L1:
            Object obj;
            Object obj2;
            Looper looper;
            gkv gkv;
            obj2 = ((gll) (obj1)).f;
            looper = ((gll) (obj1)).d;
            gkv = ((gll) (obj1)).e;
            obj = ((gll) (obj1)).a;
            obj1 = ((gll) (obj1)).b;
            if (!((gkq) (obj2)).b.containsKey(s)) goto _L4; else goto _L3
_L3:
            s = (Pair)((gkq) (obj2)).b.remove(s);
            obj2 = (gkp)((Pair) (s)).second;
            obj2.a = ((Handler) (obj));
            obj2.b = ((gks) (obj1));
            s = (gkr)((Pair) (s)).first;
              goto _L5
_L4:
            s = gkt.a(bat1, looper, ((Handler) (obj)), ((gks) (obj1)), gkv);
              goto _L5
_L7:
            s = ((gkr) (obj)).e;
            continue; /* Loop/switch isn't completed */
_L9:
            try
            {
                bat1 = c.a(bat1, ((gkr) (obj)), b, hashmap);
                obj = DebugFlag.g;
                obj = a;
                obj1 = b;
                bat1.a();
                ((glm) (obj)).a(((String) (obj1)), ((gln) (bat1)).a, hashmap, s);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                a.a(b, s);
            }
            return;
_L2:
            obj = null;
            continue; /* Loop/switch isn't completed */
_L5:
            obj = s;
            if (obj != null) goto _L7; else goto _L6
_L6:
            s = null;
            if (true) goto _L9; else goto _L8
_L8:
        }

        public final void a(String s, Exception exception)
        {
            a.a(b, exception);
        }

            public 
            {
                c = gll.this;
                a = glm1;
                b = s;
                super();
            }
    }

}

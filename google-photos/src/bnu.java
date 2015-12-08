// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class bnu extends mtf
{

    public static final String a = bnu.getSimpleName();
    private static final cql b = new cql(0L, 0, 1280, 720, false, 0L);
    private final Context c;
    private final bww j;
    private final noj k;
    private final cjs l;
    private final bnz m;
    private final deo n;
    private final ExecutorService o;
    private final brz p;
    private final int q;

    bnu(String s, Context context, bww bww1, noj noj1, cjs cjs1, ExecutorService executorservice, brz brz1, 
            bnz bnz1)
    {
        String s1 = a;
        super((new StringBuilder(String.valueOf(s1).length() + 1 + String.valueOf(s).length())).append(s1).append("|").append(s).toString());
        c = (Context)b.a(context, "context", null);
        j = (bww)b.a(bww1, "appState", null);
        k = (noj)b.a(noj1, "plusDataProvider", null);
        l = (cjs)b.a(cjs1, "mediaExtractorFactory", null);
        m = (bnz)b.a(bnz1, "listener", null);
        o = (ExecutorService)b.a(executorservice, "metadataLoadingExecutor", null);
        p = (brz)b.a(brz1, "predownloadStatusProvider", null);
        n = new deo(a);
        q = k.c(c);
    }

    public static bny a(Context context, bww bww1, noj noj1, cjs cjs1, ExecutorService executorservice)
    {
        return new bnv(context, bww1, noj1, cjs1, executorservice);
    }

    static bnz a(bnu bnu1)
    {
        return bnu1.m;
    }

    private cop a(Uri uri, String s)
    {
        uri = l.a(q, uri, s);
        s = (cop)uri.i();
        dee.a(uri);
        return s;
        s;
        dee.a(uri);
        throw s;
    }

    private Map a(pxo apxo[], Map map, Set set)
    {
        java.util.HashMap hashmap;
        ArrayList arraylist;
        int i;
        int j1;
        int k1;
        hashmap = b.l(apxo.length);
        arraylist = new ArrayList();
        i = 0;
        k1 = apxo.length;
        j1 = 0;
_L12:
        if (j1 >= k1) goto _L2; else goto _L1
_L1:
        pxo pxo1 = apxo[j1];
        if (pxo1.a != 3 && pxo1.a != 1) goto _L4; else goto _L3
_L3:
        nnt nnt1 = nnt.a(pxo1.b);
        if (set.contains(nnt1)) goto _L6; else goto _L5
_L5:
        nob nob1;
        nob1 = (nob)map.get(nnt1);
        if (nob1 == null)
        {
            apxo = String.valueOf(nnt1);
            throw c.a((new StringBuilder(String.valueOf(apxo).length() + 16)).append("Missing URI for ").append(apxo).toString());
        }
        if (hashmap.containsKey(nnt1)) goto _L8; else goto _L7
_L7:
        nny nny1 = nny.a(pxo1.b, nob1.a, pxo1.a);
        if (pxo1.a != 3) goto _L10; else goto _L9
_L9:
        try
        {
            hashmap.put(nnt1, a(nob1.a, nnt1.a));
        }
        // Misplaced declaration of an exception variable
        catch (pxo apxo[])
        {
            Log.e(a, "Failed to load metadata for cloud photo.", apxo);
            throw apxo;
        }
_L8:
        a(30, 60, i, apxo.length);
        i++;
_L6:
        j1++;
        continue; /* Loop/switch isn't completed */
_L10:
        if (pxo1.a == 1)
        {
            if (super.g)
            {
                throw new InterruptedException();
            }
            arraylist.add(Pair.create(nnt1, o.submit(new bnx(l, nny1, q))));
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (pxo1.a == 7)
        {
            hashmap.put(nnt.a(pxo1.b), b);
        }
        if (true) goto _L8; else goto _L2
_L2:
        a(60);
        apxo = arraylist.iterator();
        int i1 = 0;
        do
        {
            if (!apxo.hasNext())
            {
                break;
            }
            set = (Pair)apxo.next();
            map = (nnt)((Pair) (set)).first;
            set = (Future)((Pair) (set)).second;
            try
            {
                hashmap.put(map, (cql)set.get());
            }
            // Misplaced declaration of an exception variable
            catch (pxo apxo[])
            {
                Log.e(a, "Unable to load video metadata.", apxo);
                map = apxo.getCause();
                if (map instanceof IOException)
                {
                    throw new IOException(apxo);
                }
                if (map instanceof cri)
                {
                    throw c.a("Unexpected local media exception for cloud media.", apxo);
                } else
                {
                    throw c.a("Unexpected exception", apxo);
                }
            }
            // Misplaced declaration of an exception variable
            catch (Map map)
            {
                Thread.currentThread().interrupt();
            }
            a(60, 80, i1, arraylist.size());
            i1++;
        } while (true);
        return Collections.unmodifiableMap(hashmap);
        if (true) goto _L12; else goto _L11
_L11:
    }

    private static mue a(Map map, Map map1, int i)
    {
        for (Iterator iterator = map.entrySet().iterator(); iterator.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            b.a(entry.getKey(), "cloudMediaId", null);
            if (entry.getValue() == null)
            {
                map = String.valueOf(entry.getKey());
                throw b.a((new StringBuilder(String.valueOf(map).length() + 22)).append("mediaUri for ").append(map).append(" was null").toString());
            }
        }

        for (Iterator iterator1 = map1.entrySet().iterator(); iterator1.hasNext();)
        {
            java.util.Map.Entry entry1 = (java.util.Map.Entry)iterator1.next();
            b.a(entry1.getKey(), "cloudMediaId", null);
            if (entry1.getValue() == null)
            {
                map = String.valueOf(entry1.getKey());
                throw b.a((new StringBuilder(String.valueOf(map).length() + 22)).append("metadata for ").append(map).append(" was null").toString());
            }
        }

        mue mue1 = new mue(true);
        mue1.a().putParcelable("media", new ddv(map));
        mue1.a().putParcelable("metadata", new ddv(map1));
        mue1.a().putInt("num_found_media", i);
        return mue1;
    }

    private void a(int i)
    {
        (new Handler(Looper.getMainLooper())).post(new bnw(this, i));
    }

    private void a(int i, int i1, int j1, int k1)
    {
        a(((i1 - i) * j1) / k1 + i);
    }

    protected final mue a(Context context)
    {
        Map map;
        Set set;
        n.a("doInBackground()");
        context = j.b.m;
        c.a(context, "storyboardResult", null);
        a(0);
        n.b("load storyboard");
        map = j.y();
        set = j.A();
        n.b("get media URIs");
        Iterator iterator;
        nnt nnt1;
        Object obj2;
        nod nod1;
        int i;
        try
        {
            iterator = map.entrySet().iterator();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            n.a(true);
            return new mue(0, new dey(context), null);
        }
        i = 0;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj2 = (java.util.Map.Entry)iterator.next();
        nnt1 = (nnt)((java.util.Map.Entry) (obj2)).getKey();
        obj2 = ((nob)((java.util.Map.Entry) (obj2)).getValue()).b;
        nod1 = nod.a;
        Map map1;
        Object obj1;
        pxo pxo1;
        nob nob1;
        int i1;
        int k1;
        int k2;
        int i3;
        int j3;
        long l3;
        long l4;
        if (obj2 == nod1)
        {
            try
            {
                (new cln(c, k, q, nnt1.a)).b();
            }
            catch (IOException ioexception) { }
        }
        a(0, 30, i, map.size());
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_87;
_L1:
        a(30);
        n.b("download photos");
        map1 = a(((nom) (context)).b.b, map, set);
        a(80);
        n.b("get input metadata");
        int j1;
        int l1;
        int j2;
        boolean flag;
        try
        {
            flag = p.a();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            flag = false;
            Thread.currentThread().interrupt();
        }
        if (!flag) goto _L4; else goto _L3
_L3:
        obj1 = ((nom) (context)).b.b;
        i1 = 0;
        l1 = obj1.length;
        j1 = 0;
_L6:
        if (j1 >= l1)
        {
            break; /* Loop/switch isn't completed */
        }
        j2 = obj1[j1].a;
        if (j2 == 1)
        {
            i1++;
        }
        j1++;
        if (true) goto _L6; else goto _L5
        context;
_L21:
        n.a(true);
        return new mue(0, new dey(context), null);
_L5:
        k1 = 0;
        l3 = 0L;
        l4 = SystemClock.elapsedRealtime();
        i3 = obj1.length;
        k2 = 0;
_L17:
        if (k2 >= i3) goto _L8; else goto _L7
_L7:
        pxo1 = obj1[k2];
        if (pxo1.a != 1) goto _L10; else goto _L9
_L9:
        context = nnt.a(pxo1.b);
        if (set.contains(context)) goto _L10; else goto _L11
_L11:
        nob1 = (nob)map.get(context);
        if (nob1 == null)
        {
            try
            {
                context = String.valueOf(context);
                throw c.a((new StringBuilder(String.valueOf(context).length() + 16)).append("Missing URI for ").append(context).toString());
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                n.a(true);
            }
            return new mue(0, new dey(context), null);
        }
        context = nny.a(pxo1.b, nob1.a, pxo1.a);
        context = l.b(context, q);
        j3 = context.f();
        int l2 = -1;
        Object obj;
        for (int i2 = 0; i2 >= j3; i2++)
        {
            break MISSING_BLOCK_LABEL_606;
        }

        if (c.b(context.a(i2)))
        {
            l2 = i2;
        }
        break MISSING_BLOCK_LABEL_837;
        if (l2 == -1) goto _L13; else goto _L12
_L12:
        context.b(l2);
        b.a(context, pxo1.c.a.longValue());
        context.a(pxo1.c.b.longValue());
        dee.a(context);
        l3 = (pxo1.c.b.longValue() - pxo1.c.a.longValue()) + l3;
        if (l3 < 0x989680L) goto _L15; else goto _L14
_L14:
        if ((float)((SystemClock.elapsedRealtime() - l4) * 1000L) / (float)l3 > 0.5F) goto _L15; else goto _L16
_L16:
        a(100);
_L8:
        n.b("pre-download videos");
_L4:
        n.a(true);
        return a(map, map1, map.size());
_L13:
        throw new IOException("No video track found in available tracks");
        obj;
_L19:
        throw c.a("Unexpected local media exception for cloud media.", ((Throwable) (obj)));
        obj;
_L18:
        dee.a(context);
        throw obj;
_L15:
        k1++;
        a(80, 100, k1, i1);
_L10:
        k2++;
          goto _L17
        obj;
        context = null;
          goto _L18
        obj;
          goto _L18
        obj;
        context = null;
          goto _L19
        context;
        if (true) goto _L21; else goto _L20
_L20:
    }

}

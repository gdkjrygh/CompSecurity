// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.service.feature;

import an;
import android.app.Service;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.text.TextUtils;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.Resolver;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.mobile.android.devtools.MethodTraceScope;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.logging.Logger;
import cty;
import ctz;
import cu;
import da;
import dmz;
import dtk;
import dtv;
import dwu;
import dwv;
import dww;
import dwx;
import dwy;
import dwz;
import dxa;
import dxb;
import dxe;
import dxf;
import dxg;
import dzs;
import eda;
import edb;
import fop;
import fym;
import fys;
import fyt;
import fyu;
import fzf;
import geh;
import ggi;
import gip;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.spotify.mobile.android.service.feature:
//            AbbaModel, LoadedFlags

public class FeatureService extends Service
    implements dxe
{

    private static final Set a = Collections.unmodifiableSet(EnumSet.allOf(com/spotify/mobile/android/service/feature/FeatureService$LoaderSource));
    private static final gip b = gip.a("feature-service-overrides");
    private static AtomicReference n = new AtomicReference();
    private dzs c;
    private edb d;
    private boolean e;
    private dxf f;
    private final IBinder g = new dwy(this);
    private Flags h;
    private final List i = new CopyOnWriteArrayList();
    private final Map j = new HashMap();
    private final Map k = new IdentityHashMap();
    private final Collection l = EnumSet.noneOf(com/spotify/mobile/android/service/feature/FeatureService$LoaderSource);
    private dwu m;
    private dxa o;
    private eda p;
    private final an q = new an() {

        private final String a[] = {
            "key", "value"
        };
        private FeatureService b;

        public final da a(Bundle bundle)
        {
            return new cu(b, dtv.a, a, null, null);
        }

        public final void a()
        {
        }

        public final void a(Object obj)
        {
            Object obj1 = (Cursor)obj;
            if (((Cursor) (obj1)).moveToFirst())
            {
                HashSet hashset = new HashSet();
                for (obj = FeatureService.h(b).b().iterator(); ((Iterator) (obj)).hasNext(); hashset.add(((fzf)((fyu)((Iterator) (obj)).next()).c).a)) { }
                obj = new HashMap(((Cursor) (obj1)).getCount());
                do
                {
                    if (!((Cursor) (obj1)).moveToNext())
                    {
                        break;
                    }
                    String s1 = ((Cursor) (obj1)).getString(0);
                    if (hashset.contains(s1))
                    {
                        ((Map) (obj)).put(s1, ((Cursor) (obj1)).getString(1));
                    }
                } while (true);
                obj1 = FeatureService.h(b).b().iterator();
                boolean flag = false;
                do
                {
                    if (!((Iterator) (obj1)).hasNext())
                    {
                        break;
                    }
                    fyu fyu1 = (fyu)((Iterator) (obj1)).next();
                    String s2 = (String)((Map) (obj)).get(((fzf)fyu1.c).a);
                    if (s2 != null)
                    {
                        boolean flag1;
                        try
                        {
                            Serializable serializable = FeatureService.a(fyu1, s2);
                            flag1 = b.a(fyu1, serializable);
                        }
                        catch (NumberFormatException numberformatexception)
                        {
                            flag |= FeatureService.a(b, fyu1);
                            Assertion.b((new StringBuilder("Use of non-integer product state ")).append(((fzf)fyu1.c).a).append("=").append(s2).toString());
                            continue;
                        }
                        flag = flag1 | flag;
                        continue;
                    }
                    flag = FeatureService.a(b, fyu1) | flag;
                } while (true);
                boolean flag2 = FeatureService.d(b).add(LoaderSource.b);
                if (FeatureService.e(b) && flag2 | flag)
                {
                    FeatureService.f(b);
                    FeatureService.g(b);
                    MethodTraceScope.g.b();
                }
            }
        }

            
            {
                b = FeatureService.this;
                super();
            }
    };
    private final an r = new an() {

        private final String a[];
        private FeatureService b;

        public final da a(Bundle bundle)
        {
            return new cu(b, dtk.a, a, null, null);
        }

        public final void a()
        {
        }

        public final void a(Object obj)
        {
            Iterator iterator;
            boolean flag;
            obj = (Cursor)obj;
            if (!((Cursor) (obj)).moveToFirst())
            {
                break MISSING_BLOCK_LABEL_238;
            }
            iterator = FeatureService.h(b).a().iterator();
            flag = false;
_L2:
            fyu fyu1;
            String s1;
            if (!iterator.hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
            fyu1 = (fyu)iterator.next();
            s1 = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndexOrThrow(((fyt)fyu1.c).a));
            boolean flag1;
            Serializable serializable = FeatureService.a(fyu1, s1);
            flag1 = b.a(fyu1, serializable);
            flag = flag1 | flag;
            continue; /* Loop/switch isn't completed */
            NumberFormatException numberformatexception;
            numberformatexception;
            if ((new Random()).nextInt(5) == 0)
            {
                Assertion.b((new StringBuilder("Use of non-integer feature ")).append(((fyt)fyu1.c).a).append("=").append(s1).append(" (note: only 20% of occurrences reported!)").toString());
            }
            flag = FeatureService.a(b, fyu1) | flag;
            if (true) goto _L2; else goto _L1
_L1:
            boolean flag2 = FeatureService.d(b).add(LoaderSource.a);
            if (FeatureService.e(b) && flag2 | flag)
            {
                FeatureService.f(b);
                FeatureService.g(b);
                MethodTraceScope.g.b();
            }
        }

            
            {
                b = FeatureService.this;
                super();
                a = new String[FeatureService.h(b).a().size()];
                for (int i1 = 0; i1 < FeatureService.h(b).a().size(); i1++)
                {
                    a[i1] = ((fyt)((fyu)FeatureService.h(b).a().get(i1)).c).a;
                }

            }
    };
    private an s;

    public FeatureService()
    {
        f = new fys();
        m = new dwu(this);
        o = new dxa() {

            private Map a;
            private FeatureService b;

            public final void a(fyu fyu1, Serializable serializable)
            {
                while (serializable == null || (serializable instanceof String) && TextUtils.isEmpty((String)serializable) || serializable.equals(a.get(((fym)fyu1.c).a))) 
                {
                    return;
                }
                dmz.a(fop);
                fop.a(b, ((fym)fyu1.c).a, serializable);
                a.put(((fym)fyu1.c).a, serializable);
            }

            
            {
                b = FeatureService.this;
                super();
                a = new HashMap();
            }
        };
        p = new eda() {

            private FeatureService a;

            public final void a(SessionState sessionstate)
            {
                geh.b();
                boolean flag = FeatureService.a(a);
                FeatureService.a(a, sessionstate.e);
                if (flag && !FeatureService.a(a))
                {
                    FeatureService.b(a);
                } else
                if (!flag && FeatureService.a(a))
                {
                    FeatureService.c(a);
                    return;
                }
            }

            
            {
                a = FeatureService.this;
                super();
            }
        };
        s = new an() {

            private FeatureService a;

            public final da a(Bundle bundle)
            {
                return new dwz(a);
            }

            public final void a()
            {
            }

            public final void a(Object obj)
            {
                FeatureService.d(a).add(LoaderSource.d);
                if (FeatureService.e(a))
                {
                    FeatureService.f(a);
                    FeatureService.g(a);
                    MethodTraceScope.g.b();
                }
            }

            
            {
                a = FeatureService.this;
                super();
            }

            private class LoaderSource extends Enum
            {

                public static final LoaderSource a;
                public static final LoaderSource b;
                public static final LoaderSource c;
                public static final LoaderSource d;
                private static final LoaderSource e[];

                public static LoaderSource valueOf(String s1)
                {
                    return (LoaderSource)Enum.valueOf(com/spotify/mobile/android/service/feature/FeatureService$LoaderSource, s1);
                }

                public static LoaderSource[] values()
                {
                    return (LoaderSource[])e.clone();
                }

                static 
                {
                    a = new LoaderSource("FeatureFlag", 0);
                    b = new LoaderSource("ProductStateFlag", 1);
                    c = new LoaderSource("AbbaFlag", 2);
                    d = new LoaderSource("Overrides", 3);
                    e = (new LoaderSource[] {
                        a, b, c, d
                    });
                }

                private LoaderSource(String s1, int i1)
                {
                    super(s1, i1);
                }
            }

        };
        d = new edb(this);
    }

    public static Flags a()
    {
        return (Flags)n.get();
    }

    static Serializable a(fyu fyu1, String s1)
    {
        return fyu1.b_(s1);
    }

    static boolean a(FeatureService featureservice)
    {
        return featureservice.e;
    }

    static boolean a(FeatureService featureservice, fyu fyu1)
    {
        Serializable serializable = fyu1.a();
        return !cty.a((Serializable)featureservice.j.put(fyu1.b, serializable), serializable);
    }

    static boolean a(FeatureService featureservice, boolean flag)
    {
        featureservice.e = flag;
        return flag;
    }

    public static gip b()
    {
        return b;
    }

    static void b(FeatureService featureservice)
    {
        featureservice.d();
        featureservice.l.clear();
    }

    static void c(FeatureService featureservice)
    {
        MethodTraceScope.g.a();
        featureservice.d();
        dwu dwu1 = featureservice.m;
        List list = featureservice.f.c();
        dwv dwv = featureservice. new dwv() {

            private FeatureService a;

            public final boolean a(fyu fyu1, Serializable serializable)
            {
                return a.a(fyu1, serializable);
            }

            
            {
                a = FeatureService.this;
                super();
            }
        };
        dww dww = featureservice. new dww() {

            private FeatureService a;

            public final void a(boolean flag)
            {
                boolean flag1 = FeatureService.d(a).add(LoaderSource.c);
                if (FeatureService.e(a) && flag1 | flag)
                {
                    FeatureService.f(a);
                    FeatureService.g(a);
                    MethodTraceScope.g.b();
                }
            }

            
            {
                a = FeatureService.this;
                super();
            }
        };
        com.spotify.cosmos.router.Request request = RequestBuilder.get("hm://abba-service/v1/resolve?format=json").build();
        if (dwu1.b == null)
        {
            dwu1.b = Cosmos.getResolver(dwu1.a);
            dwu1.b.connect();
        }
        dwu1.b.resolve(request, new dwu._cls1(dwu1, new Handler(), com/spotify/mobile/android/service/feature/AbbaModel, list, dwv, dww));
        dwu1.a(list, dwv, dww);
        featureservice.c = new dzs();
        featureservice.c.a(featureservice.q);
        featureservice.c.a(featureservice.r);
        featureservice.c.a(featureservice.s);
    }

    private boolean c()
    {
        return l.containsAll(a);
    }

    static Collection d(FeatureService featureservice)
    {
        return featureservice.l;
    }

    private void d()
    {
        if (c != null)
        {
            c.b(q);
            c.b(r);
            c.b(s);
        }
    }

    static boolean e(FeatureService featureservice)
    {
        return featureservice.c();
    }

    static void f(FeatureService featureservice)
    {
        dxg dxg1 = new dxg();
        fyu fyu1;
        for (Iterator iterator = featureservice.f.a().iterator(); iterator.hasNext(); dxg1.a(fyu1, (Serializable)featureservice.j.get(fyu1.b)))
        {
            fyu1 = (fyu)iterator.next();
        }

        fyu fyu2;
        for (Iterator iterator1 = featureservice.f.b().iterator(); iterator1.hasNext(); dxg1.a(fyu2, (Serializable)featureservice.j.get(fyu2.b)))
        {
            fyu2 = (fyu)iterator1.next();
        }

        fyu fyu3;
        for (Iterator iterator2 = featureservice.f.c().iterator(); iterator2.hasNext(); dxg1.a(fyu3, (Serializable)featureservice.j.get(fyu3.b)))
        {
            fyu3 = (fyu)iterator2.next();
        }

        fyu fyu4;
        Object obj;
        for (Iterator iterator3 = featureservice.k.entrySet().iterator(); iterator3.hasNext(); dxg1.b.put(fyu4.b, obj))
        {
            obj = (java.util.Map.Entry)iterator3.next();
            fyu4 = (fyu)((java.util.Map.Entry) (obj)).getKey();
            obj = (Serializable)((java.util.Map.Entry) (obj)).getValue();
        }

        dxg1.c = new WeakReference(featureservice.o);
        LoadedFlags loadedflags = new LoadedFlags(dxg1.a, dxg1.b, dxg1.c, (byte)0);
        dxg1.a = null;
        dxg1.b = null;
        featureservice.h = loadedflags;
        n.set(featureservice.h);
    }

    static void g(FeatureService featureservice)
    {
        for (Iterator iterator = featureservice.i.iterator(); iterator.hasNext(); ((dwx)iterator.next()).a(featureservice.h)) { }
    }

    static dxf h(FeatureService featureservice)
    {
        return featureservice.f;
    }

    public final void a(Object obj)
    {
        obj = (dwx)obj;
        ctz.a(obj);
        dxb dxb1 = new dxb(((dwx) (obj)));
        if (!i.contains(dxb1))
        {
            i.add(dxb1);
        }
        if (c())
        {
            ((dwx) (obj)).a(h);
        }
    }

    final boolean a(fyu fyu1, Serializable serializable)
    {
        Assertion.a(ggi.a(fyu1.d, serializable.getClass()), (new StringBuilder("Have you forgotten to map the value with ")).append(fyu1.getClass().getSimpleName()).append("::mapValue? for flag with identifier: ").append(fyu1.b).toString());
        return !cty.a((Serializable)j.put(fyu1.b, serializable), serializable);
    }

    public final void b(Object obj)
    {
        obj = (dwx)obj;
        ctz.a(obj);
        dxb dxb1 = new dxb(((dwx) (obj)));
        if (!i.contains(dxb1))
        {
            Logger.b("FeatureService does not contain this listener: %s", new Object[] {
                obj.toString()
            });
            return;
        } else
        {
            i.remove(dxb1);
            return;
        }
    }

    public IBinder onBind(Intent intent)
    {
        return g;
    }

    public void onCreate()
    {
        super.onCreate();
        d.a(p);
        d.a();
    }

    public void onDestroy()
    {
        d.b(p);
        d.b();
        d();
        dwu dwu1 = m;
        if (dwu1.b != null)
        {
            dwu1.b.destroy();
            dwu1.b = null;
        }
        super.onDestroy();
    }

}

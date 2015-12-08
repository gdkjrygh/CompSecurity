// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class bww
{

    public static final String a = bww.getSimpleName();
    private static final String f = bww.getSimpleName();
    public final bxb b;
    public final bxi c;
    public final blp d = new bwx(this);
    final Map e = C();
    private final Context g;

    public bww(Context context, Bundle bundle)
    {
        g = context.getApplicationContext();
        boolean flag;
        if (bundle != null && bundle.containsKey(a))
        {
            b = (bxb)bundle.getParcelable(a);
            c = new bxi();
            n();
        } else
        {
            b = new bxb();
            c = new bxi();
        }
        context = c;
        if (!b.v.b())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        context.m = flag;
    }

    private static Map C()
    {
        EnumMap enummap = new EnumMap(bxg);
        bxg abxg[] = bxg.values();
        int j1 = abxg.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            enummap.put(abxg[i1], new ArrayList());
        }

        return Collections.unmodifiableMap(enummap);
    }

    static bxb a(bww bww1)
    {
        return bww1.b;
    }

    private void a(ArrayList arraylist)
    {
        b.g = arraylist;
        b.h.clear();
        Uri uri;
        for (arraylist = arraylist.iterator(); arraylist.hasNext(); b.h.add(bwz.a(uri)))
        {
            uri = (Uri)arraylist.next();
        }

        n();
        c.g = -1L;
        g();
        a(new bxg[] {
            bxg.i, bxg.k
        });
    }

    public static void a(bwz abwz[])
    {
        HashSet hashset = new HashSet();
        int j1 = abwz.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            bwz bwz1 = abwz[i1];
            if (hashset.contains(bwz1.a))
            {
                abwz = String.valueOf(Arrays.toString(abwz));
                if (abwz.length() != 0)
                {
                    abwz = "Duplicate input URI found: ".concat(abwz);
                } else
                {
                    abwz = new String("Duplicate input URI found: ");
                }
                throw new IllegalArgumentException(abwz);
            }
            hashset.add(bwz1.a);
        }

    }

    private static List c(Intent intent)
    {
        Object obj;
        if (!"android.intent.action.SEND_MULTIPLE".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.STREAM"))
        {
            break MISSING_BLOCK_LABEL_110;
        }
        obj = intent.getExtras().get("android.intent.extra.STREAM");
        if (!(obj instanceof ArrayList)) goto _L2; else goto _L1
_L1:
        intent = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
_L4:
        return intent;
_L2:
        if (!(obj instanceof String))
        {
            break MISSING_BLOCK_LABEL_110;
        }
        String as[] = intent.getStringExtra("android.intent.extra.STREAM").split(",");
        int j1 = as.length;
        obj = new ArrayList(j1);
        int i1 = 0;
        do
        {
            intent = ((Intent) (obj));
            if (i1 >= j1)
            {
                break;
            }
            ((List) (obj)).add(Uri.parse(as[i1]));
            i1++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return Collections.emptyList();
    }

    private bwz d(int i1)
    {
        return (bwz)b.h.get(b.a(i1, "index", b.h));
    }

    private void d(String s1)
    {
        b.T = s1;
    }

    public final Set A()
    {
        return Collections.unmodifiableSet(b.k);
    }

    public final boolean B()
    {
        return b.ad != null && !Uri.EMPTY.equals(b.ad);
    }

    public int a(Uri uri)
    {
        b.a(uri, "uri", null);
        int i1 = 0;
        for (int j1 = b.h.size(); i1 < j1; i1++)
        {
            if (uri.equals(((bwz)b.h.get(i1)).a))
            {
                return i1;
            }
        }

        return -1;
    }

    public final List a()
    {
        if (c.c > 0)
        {
            return Collections.emptyList();
        }
        ArrayList arraylist = new ArrayList();
        int i1 = 0;
        while (i1 < b.h.size()) 
        {
            if (b(i1).e == coj.a)
            {
                coi coi1 = b(i1);
                c.a(coi1.e, "metadata.type", coj.a);
                bwz bwz1 = d(i1);
                nny nny1;
                if (x() == bxd.b)
                {
                    nny1 = nny.a((nnt)b.l.get(bwz1.a), bwz1.a, noa.b);
                } else
                {
                    nny1 = nny.a(bwz1.a, noa.b);
                }
                arraylist.add(new cqk(nny1, coi1.a(), ((Long)c.b.get(b.a(i1, "index", c.b))).longValue(), bwz1.b));
            }
            i1++;
        }
        return arraylist;
    }

    public final void a(int i1)
    {
        b.b = i1;
    }

    public final void a(long l1)
    {
        b.Y = l1;
    }

    public final void a(Intent intent)
    {
        b.f = true;
        ArrayList arraylist = new ArrayList();
        if (intent.hasExtra("aam_preview_uri"))
        {
            b.ad = (Uri)intent.getParcelableExtra("aam_preview_uri");
        }
        if (intent.hasExtra("source_id"))
        {
            b.d = intent.getIntExtra("source_id", 0);
            b.e = intent.getStringExtra("source_name");
        } else
        {
            arraylist.add("source_id");
        }
        if (intent.hasExtra("aam_media_collection"))
        {
            b.U = intent.getParcelableExtra("aam_media_collection");
            b.V = true;
            b.W = true;
        }
        if ("android.intent.action.MAIN".equals(intent.getAction())) goto _L2; else goto _L1
_L1:
        if (!"android.intent.action.SEND".equals(intent.getAction())) goto _L4; else goto _L3
_L3:
        b.X = intent.getStringExtra("aam_media_key");
        if (intent.getBooleanExtra("extra_generate_bytes", false))
        {
            if (intent.getBooleanExtra("extra_bytes_quality_full", false))
            {
                b.af = true;
            } else
            if (intent.getBooleanExtra("extra_bytes_quality_preview", false))
            {
                b.ae = true;
            } else
            {
                Log.w(f, "EXTRA_GENERATE_BYTES missing QUALITY extra");
            }
        }
        a(bxd.c);
        b.c = true;
        b.g.clear();
        b.h.clear();
        n();
        c.g = -1L;
        g();
        a(new bxg[] {
            bxg.i, bxg.k
        });
        d(((String) (null)));
        String.format("Started moviemaker with media key %s.", new Object[] {
            b.X
        });
_L2:
        if (!arraylist.isEmpty())
        {
            intent = String.valueOf(arraylist);
            (new StringBuilder(String.valueOf(intent).length() + 36)).append("Started with missing intent extras: ").append(intent);
        }
        return;
_L4:
        a(bxd.c);
        Object obj;
        String s1;
        boolean flag;
        if (bpe.b(g))
        {
            List list = ((noj)olm.a(g, noj)).a(intent);
            obj = list;
            if (list == null)
            {
                obj = Collections.emptyList();
            }
        } else
        {
            obj = c(intent);
        }
        intent = intent.getStringExtra("session_id");
        s1 = b.T;
        d(intent);
        b.X = null;
        obj = new ArrayList(new LinkedHashSet(((java.util.Collection) (obj))));
        if (b.g.equals(obj) && TextUtils.equals(s1, intent))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!((ArrayList) (obj)).isEmpty() && !flag)
        {
            b.c = true;
            a(((ArrayList) (obj)));
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public final void a(bvb bvb)
    {
        boolean flag;
        if (!b.G.e)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c.a(flag, "mPersistentState.isVideoRendering()");
        b.F = bvb;
    }

    public final void a(bxd bxd1)
    {
        bxb bxb1;
        if (x() == bxd1)
        {
            return;
        }
        bxb1 = b;
        bxe.a[bxd1.ordinal()];
        JVM INSTR tableswitch 1 3: default 48
    //                   1 56
    //                   2 80
    //                   3 87;
           goto _L1 _L2 _L3 _L4
_L1:
        throw new IllegalStateException();
_L2:
        bxd1 = bxf.a;
_L6:
        bxb1.a = bxd1;
        a(new bxg[] {
            bxg.o
        });
        return;
_L3:
        bxd1 = bxf.b;
        continue; /* Loop/switch isn't completed */
_L4:
        bxd1 = bxf.e;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void a(bxf bxf1)
    {
        c.a(x(), "runningMode", bxf1.j, "Mode state can only be changed to another state in the same mode");
        b.a = bxf1;
        if (bxf1 == bxf.d || bxf1 == bxf.c)
        {
            a(new bxg[] {
                bxg.t
            });
        } else
        if (bxf1 == bxf.g || bxf1 == bxf.h || bxf1 == bxf.i)
        {
            a(new bxg[] {
                bxg.u
            });
            return;
        }
    }

    public final void a(caf caf1)
    {
        b.a(caf1);
        a(new bxg[] {
            bxg.m
        });
        a(new bxg[] {
            bxg.n
        });
    }

    public final void a(cnx cnx1)
    {
        b.a(cnx1.a.e, "track id", b.v);
        if (c.l != cnx1)
        {
            c.l = cnx1;
            o();
            a(new bxg[] {
                bxg.e
            });
        }
    }

    public final void a(cqa cqa1)
    {
        Object obj;
        boolean flag;
        boolean flag1;
        if (cqa1 == null)
        {
            obj = cqc.a;
        } else
        {
            obj = cqa1.e;
        }
        if (!((cqc) (obj)).equals(b.v))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b.v = ((cqc) (obj));
        c.k = cqa1;
        c.l = null;
        obj = c;
        if (cqa1 == null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        obj.m = flag1;
        obj = c;
        if (cqa1 == null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        obj.n = flag1;
        c.o = false;
        g();
        o();
        if (flag || c.l == null)
        {
            a(new bxg[] {
                bxg.d
            });
        }
        a(new bxg[] {
            bxg.e
        });
    }

    public final void a(crd crd)
    {
        b.A.add(crd);
        g();
        a(new bxg[] {
            bxg.b
        });
    }

    public final void a(cst cst1)
    {
        c.r = cst1;
        o();
        a(new bxg[] {
            bxg.f
        });
    }

    public final void a(cyy cyy1)
    {
        if (cyy1 != b.t)
        {
            b.t = (cyy)b.a(cyy1, "selectedTheme", null);
            g();
            a(new bxg[] {
                bxg.j
            });
        }
    }

    public final void a(String s1)
    {
        b.a(s1, "movieTitle", null);
        if (!TextUtils.equals(b.x, s1))
        {
            String s2 = s1;
            if (s1.trim().isEmpty())
            {
                s2 = "";
            }
            b.x = s2;
            g();
            a(new bxg[] {
                bxg.g
            });
        }
    }

    public final void a(String s1, byte abyte0[])
    {
        b.o = abyte0;
        b.p = s1;
        a(new bxg[] {
            bxg.s
        });
    }

    public final void a(Map map)
    {
        b.i.clear();
        b.l.clear();
        b.i.putAll(map);
        map = map.entrySet().iterator();
        do
        {
            if (!map.hasNext())
            {
                break;
            }
            Object obj = (java.util.Map.Entry)map.next();
            nnt nnt1 = (nnt)b.l.put(((nob)((java.util.Map.Entry) (obj)).getValue()).a, ((java.util.Map.Entry) (obj)).getKey());
            obj = String.valueOf(((nob)((java.util.Map.Entry) (obj)).getValue()).a);
            obj = (new StringBuilder(String.valueOf(obj).length() + 38)).append(((String) (obj))).append(" is referred to by two cloud media IDs").toString();
            if (nnt1 != null)
            {
                b.a((new StringBuilder()).append(((CharSequence) (obj))).append(" must be null"), null);
            }
        } while (true);
    }

    public final void a(pye pye)
    {
        c.p = pye;
        a(new bxg[] {
            bxg.p
        });
        a(new bxg[] {
            bxg.s
        });
    }

    public final void a(boolean flag)
    {
        c.q = flag;
    }

    public transient void a(bxg abxg[])
    {
        for (abxg = Arrays.asList(abxg).iterator(); abxg.hasNext();)
        {
            Object obj = (bxg)abxg.next();
            obj = ((List)e.get(obj)).iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                ((bxh)((Iterator) (obj)).next()).b();
            }
        }

    }

    public final coi b(int i1)
    {
        return (coi)c.a.get(b.a(i1, "index", c.a));
    }

    public final List b()
    {
        if (c.c > 0)
        {
            return Collections.emptyList();
        }
        ArrayList arraylist = new ArrayList();
        int i1 = 0;
        while (i1 < b.h.size()) 
        {
            if (b(i1).e == coj.b)
            {
                coi coi1 = b(i1);
                c.a(coi1.e, "metadata.type", coj.b);
                bwz bwz1 = d(i1);
                nny nny1;
                if (x() == bxd.b)
                {
                    nny1 = nny.a((nnt)b.l.get(bwz1.a), bwz1.a, noa.a);
                } else
                {
                    nny1 = nny.a(bwz1.a, noa.a);
                }
                arraylist.add(new coo(nny1, (cop)coi1, bwz1.b));
            }
            i1++;
        }
        return arraylist;
    }

    public final void b(long l1)
    {
        c.u = b.b(l1, "startTimeUs");
    }

    public final void b(Intent intent)
    {
        b.aa = intent;
    }

    public final void b(String s1)
    {
        c.a(b.G.e, "mPersistentState.isVideoRendering()");
        if (b.G == caf.c)
        {
            b.L = s1;
            return;
        } else
        {
            b.M = s1;
            return;
        }
    }

    public final void b(boolean flag)
    {
        b.a(true, "Can't set soundtrack not ready if there is no soundtrack");
        if (!c.m)
        {
            c.m = true;
            o();
            a(new bxg[] {
                bxg.e
            });
        }
    }

    public final cyt c(int i1)
    {
        if (c.f == null)
        {
            c.f = new cyt(new cyp(new cyh(), cyq.a), d, new czp(d), i1);
        }
        return c.f;
    }

    public final void c(long l1)
    {
        c.v = b.b(l1, "endTimeUs");
    }

    public final void c(String s1)
    {
        b.q = s1;
    }

    public final void c(boolean flag)
    {
        b.a(true, "Can't set soundtrack not ready if there is no soundtrack");
        if (!c.n)
        {
            c.n = true;
            o();
            a(new bxg[] {
                bxg.e
            });
        }
    }

    public final boolean c()
    {
        return c.c == 0;
    }

    public final void d(boolean flag)
    {
        c.o = flag;
        a(new bxg[] {
            bxg.e
        });
    }

    public final boolean d()
    {
        return b.v.b();
    }

    public final cqa e()
    {
        return c.r.a(b.w);
    }

    public final void e(boolean flag)
    {
        c.i = flag;
    }

    public final void f(boolean flag)
    {
        if (b.Q != flag)
        {
            b.Q = flag;
            g();
            a(new bxg[] {
                bxg.h
            });
        }
    }

    public final boolean f()
    {
        return c.e != null;
    }

    public void g()
    {
        if (c.d)
        {
            c.d = false;
            a(new bxg[] {
                bxg.c
            });
        }
    }

    public final void g(boolean flag)
    {
        c.t = flag;
    }

    public final void h(boolean flag)
    {
        c.a(b.G.e, "mPersistentState.isVideoRendering()");
        b.H = true;
    }

    public final boolean h()
    {
        bxf bxf1 = b.a;
        return bxf1 == bxf.h || bxf1 == bxf.g || bxf1 == bxf.i;
    }

    public final List i()
    {
        return new ArrayList(b.A);
    }

    public final void i(boolean flag)
    {
        c.a(b.G.e, "mPersistentState.isVideoRendering()");
        b.I = flag;
    }

    public final void j(boolean flag)
    {
        c.a(b.G.e, "mPersistentState.isVideoRendering()");
        b.J = true;
    }

    public final boolean j()
    {
        return c.x != null;
    }

    public final void k()
    {
        c.a(j(), "canUndo");
        c.x = null;
        c.y = -1;
    }

    public final void k(boolean flag)
    {
        b.P = flag;
    }

    public final void l()
    {
        b.B = b.A.size();
    }

    public final void l(boolean flag)
    {
        b.W = flag;
    }

    public final long m()
    {
        if (h() && c.h != -1L)
        {
            return c.h;
        }
        cqf cqf1 = c.e;
        if (cqf1 != null)
        {
            return cqf1.h;
        } else
        {
            return b.z.d;
        }
    }

    public final void m(boolean flag)
    {
        b.Z = flag;
    }

    public void n()
    {
        int j1 = b.h.size();
        c.a.clear();
        c.b.clear();
        for (int i1 = 0; i1 < j1; i1++)
        {
            c.a.add(null);
            c.b.add(null);
        }

        c.c = j1;
    }

    public final void n(boolean flag)
    {
        if (!c.z)
        {
            c.z = true;
            a(new bxg[] {
                bxg.q
            });
        }
    }

    public void o()
    {
        boolean flag1 = true;
        if (!b.v.b())
        {
            c.b(c.k, "soundtrack", null);
            c.a(c.m, "soundtrackReadyForStoryboard");
            c.a(c.n, "soundtrackReadyForPreview");
        }
        if (c.r == null)
        {
            c.b(c.k, "musicLibrary must be set before soundtrack", null);
        }
        if (c.k != null)
        {
            c.a(b.v, "soundtrackId", c.k.e);
        } else
        {
            c.b(c.l, "detailedSoundtrack", null);
        }
        if (c.l != null)
        {
            c.a(c.k, "soundtrack", c.l.a);
        } else
        if (b.v.b())
        {
            if (!c.m)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            c.a(flag, "!soundtrackReady");
        }
        if (c.l == null && b.v.b())
        {
            boolean flag;
            if (!c.d)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            c.a(flag, "!storyboardReady");
        }
        if (c.m)
        {
            c.a(c.n, "soundtrack ready for preview");
        }
    }

    public final void o(boolean flag)
    {
        if (c.A != flag)
        {
            c.A = flag;
            a(new bxg[] {
                bxg.q
            });
        }
    }

    public final void p(boolean flag)
    {
        b.ac = flag;
    }

    public final boolean p()
    {
        return b.G.e;
    }

    public final boolean q()
    {
        c.a(b.G.e, "mPersistentState.isVideoRendering()");
        return b.H;
    }

    public final boolean r()
    {
        c.a(b.G.e, "mPersistentState.isVideoRendering()");
        return b.J;
    }

    public final String s()
    {
        if (b.G == caf.c)
        {
            return b.L;
        } else
        {
            return b.M;
        }
    }

    public final String t()
    {
        c.a(b.G.e, "mPersistentState.isVideoRendering()");
        return b.N;
    }

    public final String u()
    {
        c.a(b.G.e, "mPersistentState.isVideoRendering()");
        return b.O;
    }

    public final boolean v()
    {
        return !p() || b.I;
    }

    public final void w()
    {
        b.ab = true;
    }

    public final bxd x()
    {
        return b.a.j;
    }

    public final Map y()
    {
        return Collections.unmodifiableMap(b.i);
    }

    public final Map z()
    {
        return Collections.unmodifiableMap(b.j);
    }

}

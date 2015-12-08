// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

class boa extends bsr
{

    private static final String a = boa.getSimpleName();
    private final bnz b = new bob(this);
    private final bww c;
    private final blw d;
    private final bny e;
    private final bqa f;
    private final brv g;
    private final noq h;

    boa(bww bww1, Context context, blw blw1, bny bny1, bqa bqa1, brv brv1)
    {
        super("LoadMedia");
        c = (bww)b.a(bww1, "state", null);
        d = (blw)b.a(blw1, "display", null);
        e = (bny)b.a(bny1, "loadCloudMediaTaskFactory", null);
        f = (bqa)b.a(bqa1, "playerController", null);
        g = (brv)b.a(brv1, "storageController", null);
        h = (noq)olm.a(context, noq);
    }

    static bqa a(boa boa1)
    {
        return boa1.f;
    }

    private void a()
    {
        Map map = c.y();
        c.a(map, "cloudMediaIdToUriMap", null);
        Set set = c.A();
        nom nom1 = c.b.m;
        c.a(nom1, "getStoryboardResult", null);
        c.a(nom1.b, "getStoryboardResult.storyboard", null);
        pxo apxo[] = nom1.b.b;
        int j = apxo.length;
        int i = 0;
        while (i < j) 
        {
            Object obj = apxo[i];
            if (((pxo) (obj)).b == null)
            {
                continue;
            }
            Object obj1 = nnt.a(((pxo) (obj)).b);
            if (set.contains(obj1))
            {
                continue;
            }
            Object obj2 = (nob)map.get(obj1);
            if (obj2 == null)
            {
                obj = String.valueOf(obj1);
                throw c.a((new StringBuilder(String.valueOf(obj).length() + 11)).append("No URI for ").append(((String) (obj))).toString());
            }
            obj1 = ((nob) (obj2)).a;
            int k;
            if (((pxo) (obj)).a == 1 && ((pxo) (obj)).d != null)
            {
                obj = ((pxo) (obj)).d.b;
            } else
            {
                obj = Long.valueOf(0L);
            }
            obj2 = c;
            k = b.a(((bww) (obj2)).a(((android.net.Uri) (obj1))), "index", ((bww) (obj2)).c.a);
            if ((Long)((bww) (obj2)).c.b.get(k) == null)
            {
                bxi bxi1 = ((bww) (obj2)).c;
                bxi1.c = bxi1.c - 1;
            }
            if (obj == null)
            {
                bxi bxi2 = ((bww) (obj2)).c;
                bxi2.c = bxi2.c + 1;
            }
            ((bww) (obj2)).c.b.set(k, obj);
            ((bww) (obj2)).a(new bxg[] {
                bxg.i
            });
            i++;
        }
    }

    private void a(mue mue1)
    {
        h.b(20);
        mue1 = (dey)mue1.c;
        f.n();
        if (mue1 != null)
        {
            if (mue1.getCause() instanceof oko)
            {
                c.o(true);
                return;
            } else
            {
                f.g();
                return;
            }
        } else
        {
            d.j();
            return;
        }
    }

    private void b()
    {
        Set set = c.A();
        ArrayList arraylist = new ArrayList();
        c.a(c.y(), "cloudMediaIdToUriMap", null);
        nom nom1 = c.b.m;
        c.a(nom1, "getStoryboardResult", null);
        c.a(nom1.b, "getStoryboardResult.storyboard", null);
        for (int i = 0; i < nom1.b.b.length; i++)
        {
            pxo pxo1 = nom1.b.b[i];
            if (pxo1.b != null && set.contains(nnt.a(pxo1.b)))
            {
                arraylist.add(Integer.valueOf(i));
            }
        }

        for (int j = arraylist.size() - 1; j >= 0; j--)
        {
            c.a(new cqz(((Integer)arraylist.get(j)).intValue()));
        }

        c.l();
    }

    public final mtf a(String s)
    {
        f.j();
        if (c.x() != bxd.b)
        {
            return null;
        }
        if (!c.b.ae && !c.b.af)
        {
            bqa bqa1 = f;
            bqa1.f = true;
            ((bqr)bqa1.b.b).a(c.aE, 0);
        }
        return e.a(s, g.b(), b);
    }

    public final boolean a(String s, mue mue1)
    {
        if (s.indexOf(bnu.a) >= 0)
        {
            ((bqr)f.b.b).a();
            if (mue1.c())
            {
                a(mue1);
                return false;
            }
            if (c.b.m.a != noo.a)
            {
                a(mue1);
                return false;
            }
            f.n();
            Object obj = ((ddv)mue1.a().getParcelable("media")).a;
            s = ((ddv)mue1.a().getParcelable("metadata")).a;
            mue1 = new bwz[((Map) (obj)).size()];
            Object obj2 = ((Map) (obj)).values().iterator();
            for (int i = 0; ((Iterator) (obj2)).hasNext(); i++)
            {
                mue1[i] = bwz.a(((nob)((Iterator) (obj2)).next()).a);
            }

            obj2 = c;
            bww.a(mue1);
            ((bww) (obj2)).b.g.clear();
            ((bww) (obj2)).b.h.clear();
            int l = mue1.length;
            int j = 0;
            while (j < l) 
            {
                Object obj3 = mue1[j];
                boolean flag;
                if (obj3 != null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                b.a(flag, "uris should not contain null values");
                ((bww) (obj2)).b.g.add(((bwz) (obj3)).a);
                ((bww) (obj2)).b.h.add(obj3);
                j++;
            }
            ((bww) (obj2)).n();
            ((bww) (obj2)).g();
            ((bww) (obj2)).c.g = -1L;
            ((bww) (obj2)).a(new bxg[] {
                bxg.i, bxg.k
            });
            c.a(((Map) (obj)));
            mue1 = c.y();
            c.a(mue1, "cloudMediaIdToUriMap", null);
            obj = c.A();
            obj2 = c.b.m;
            c.a(obj2, "getStoryboardResult", null);
            c.a(((nom) (obj2)).b, "getStoryboardResult.storyboard", null);
            pxo apxo[] = ((nom) (obj2)).b.b;
            l = apxo.length;
            j = 0;
            while (j < l) 
            {
                Object obj4 = apxo[j];
                if (((pxo) (obj4)).b == null)
                {
                    continue;
                }
                Object obj5 = nnt.a(((pxo) (obj4)).b);
                if (((Set) (obj)).contains(obj5))
                {
                    continue;
                }
                obj4 = (coi)s.get(obj5);
                if (obj4 == null)
                {
                    s = String.valueOf(obj5);
                    throw c.a((new StringBuilder(String.valueOf(s).length() + 16)).append("No metadata for ").append(s).toString());
                }
                Object obj6 = (nob)mue1.get(obj5);
                if (obj6 == null)
                {
                    s = String.valueOf(obj5);
                    throw c.a((new StringBuilder(String.valueOf(s).length() + 11)).append("No URI for ").append(s).toString());
                }
                obj5 = ((nob) (obj6)).a;
                obj6 = c;
                int i1 = ((bww) (obj6)).a(((android.net.Uri) (obj5)));
                boolean flag1;
                if (i1 != -1)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                b.a(flag1, "uri not found");
                b.a(obj4, "metadata", null);
                b.a(i1, "index", ((bww) (obj6)).b.h);
                b.a(i1, "index", ((bww) (obj6)).c.a);
                if (((coi) (obj4)).e == coj.a)
                {
                    b.a(obj4 instanceof cql, "metadata instanceof VideoMetadata");
                }
                ((bww) (obj6)).c.a.set(i1, obj4);
                j++;
            }
            a();
            b();
            s = c.b.m;
            mue1 = ((nom) (s)).b;
            if (((pye) (mue1)).h.c == null || ((pye) (mue1)).h.c.a == null && ((pye) (mue1)).h.c.b == null)
            {
                c.a(null);
            } else
            {
                mue1 = cqc.a(((pye) (mue1)).h.c);
                Object obj1 = String.valueOf(mue1.a());
                (new StringBuilder(String.valueOf(obj1).length() + 42)).append("Applying soundtrack ").append(((String) (obj1))).append(" from cloud storyboard");
                obj1 = c.c.r;
                if (obj1 != null)
                {
                    obj1 = ((cst) (obj1)).a(mue1);
                    if (obj1 == null)
                    {
                        String s2 = a;
                        mue1 = String.valueOf(mue1);
                        Log.e(s2, (new StringBuilder(String.valueOf(mue1).length() + 43)).append("Cloud soundtrack id ").append(mue1).append(" is unknown to the app.").toString());
                    }
                    c.a(((cqa) (obj1)));
                } else
                {
                    bww bww1 = c;
                    c.b(bww1.c.r, "musicLibrary", null);
                    bww1.b.v = mue1;
                    bww1.c.k = null;
                    bww1.c.l = null;
                    bxi bxi1 = bww1.c;
                    boolean flag2;
                    if (!mue1.b())
                    {
                        flag2 = true;
                    } else
                    {
                        flag2 = false;
                    }
                    bxi1.m = flag2;
                    bww1.c.o = false;
                    bww1.o();
                    bww1.a(new bxg[] {
                        bxg.d, bxg.e
                    });
                }
            }
            mue1 = ((nom) (s)).b;
            obj = cyy.a(((pye) (mue1)).h.a);
            if (obj != null)
            {
                c.a(((cyy) (obj)));
            } else
            {
                String s1 = a;
                int k = ((pye) (mue1)).h.a;
                Log.e(s1, (new StringBuilder(40)).append("Unrecognized cloud theme id: ").append(k).toString());
                c.a(cyy.a);
            }
            mue1 = ((nom) (s)).b;
            if (((pye) (mue1)).h.e != null)
            {
                c.f(((pye) (mue1)).h.e.booleanValue());
            } else
            {
                c.f(false);
            }
            c.b.y = true;
            if (c.b.ac)
            {
                c.a(((nom) (s)).b);
            }
            return true;
        } else
        {
            Log.e(a, "received task tag that is not created by this handler.");
            return false;
        }
    }

}

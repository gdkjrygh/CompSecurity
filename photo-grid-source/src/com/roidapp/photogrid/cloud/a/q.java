// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud.a;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.preference.PreferenceManager;
import android.widget.ListView;
import com.roidapp.baselib.c.n;
import com.roidapp.baselib.c.x;
import com.roidapp.cloudlib.a.a;
import com.roidapp.cloudlib.sns.af;
import com.roidapp.imagelib.retouch.l;
import com.roidapp.photogrid.a.m;
import com.roidapp.photogrid.b.f;
import com.roidapp.photogrid.release.ParentActivity;
import com.roidapp.photogrid.release.ig;
import com.roidapp.photogrid.release.ih;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.roidapp.photogrid.cloud.a:
//            x, s, n, o, 
//            p, y, u, l, 
//            a, m, k, r, 
//            t

public final class q
{

    public int a;
    public boolean b;
    public boolean c;
    protected ParentActivity d;
    protected boolean e;
    protected String f;
    private t g;
    private List h;
    private List i;
    private u j;
    private y k;
    private com.roidapp.photogrid.cloud.a.x l;
    private com.roidapp.photogrid.cloud.a.n m;
    private s n;
    private r o;

    public q(ParentActivity parentactivity, boolean flag, boolean flag1, boolean flag2, com.roidapp.photogrid.cloud.a.l al[], ListView listview, String s1, 
            t t)
    {
        b = false;
        c = false;
        d = parentactivity;
        g = t;
        e = flag;
        f = s1;
        a(flag1, flag2, al, listview);
    }

    static List a(q q1)
    {
        return q1.h;
    }

    private void a(boolean flag, boolean flag1, com.roidapp.photogrid.cloud.a.l al[], ListView listview)
    {
        if (listview != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        ig aig[];
        b = false;
        c = false;
        aig = ih.C().M();
        if (aig == null) goto _L4; else goto _L3
_L3:
        int i1 = 0;
_L10:
        if (i1 >= aig.length) goto _L6; else goto _L5
_L5:
        if (aig[i1].b == null) goto _L8; else goto _L7
_L7:
        b = true;
_L6:
        c = com.roidapp.imagelib.retouch.l.f().b();
_L4:
        int j1;
        int j2;
        if (flag)
        {
            j2 = 40007;
        } else
        {
            j2 = 40006;
        }
        if (d == null) goto _L1; else goto _L9
_L8:
        i1++;
          goto _L10
_L9:
        Object obj;
        int ai1[];
        int l2;
        {
            int l3 = com.roidapp.cloudlib.a.a.a(d).a("ad", "nativePos1", 0);
            int j4 = com.roidapp.cloudlib.a.a.a(d).a("ad", "nativePos2", 3);
            i1 = PreferenceManager.getDefaultSharedPreferences(d).getInt("lastClickCardID", -1);
            int ai[] = new int[3];
            ai;
            ai[0] = 1;
            ai[1] = 2;
            ai[2] = 3;
            if (i1 != -1)
            {
                Object obj1 = new ArrayList(3);
                j1 = 0;
                do
                {
                    if (j1 >= 3)
                    {
                        break;
                    }
                    int k2 = ai[j1];
                    if (k2 != i1)
                    {
                        ((ArrayList) (obj1)).add(Integer.valueOf(k2));
                    } else
                    if (k2 == 1)
                    {
                        boolean flag3;
                        if (!b)
                        {
                            flag3 = true;
                        } else
                        {
                            flag3 = false;
                        }
                        if (flag3 != PreferenceManager.getDefaultSharedPreferences(d).getBoolean("weiduoneIsFilter", false))
                        {
                            ((ArrayList) (obj1)).add(Integer.valueOf(k2));
                        }
                    }
                    j1++;
                } while (true);
                boolean flag2;
                if (((ArrayList) (obj1)).size() != 3)
                {
                    ai = new int[((ArrayList) (obj1)).size()];
                    obj1 = ((ArrayList) (obj1)).iterator();
                    for (j1 = 0; ((Iterator) (obj1)).hasNext(); j1++)
                    {
                        ai[j1] = ((Integer)((Iterator) (obj1)).next()).intValue();
                    }

                } else
                {
                    i1 = -1;
                }
            }
            ai1 = com.roidapp.baselib.c.n.a(ai);
            l2 = ai1.length;
            if (i1 == -1)
            {
                j1 = 3;
            } else
            {
                j1 = 4;
            }
            obj = new int[j1 + l2];
            l2 = 0;
            flag2 = false;
            j1 = i1;
            i1 = ((flag2) ? 1 : 0);
        }
_L16:
        if (l2 >= obj.length)
        {
            break MISSING_BLOCK_LABEL_537;
        }
        if (l2 != l3 && l2 != j4)
        {
            break; /* Loop/switch isn't completed */
        }
        obj[l2] = 0;
_L14:
        l2++;
        if (true) goto _L12; else goto _L11
_L12:
        break MISSING_BLOCK_LABEL_392;
_L11:
        if (j1 != -1 && l2 == obj.length - 1)
        {
            obj[l2] = j1;
            j1 = -1;
        } else
        if (l2 == obj.length - 2)
        {
            if (af.a(d))
            {
                obj[l2] = 6;
            } else
            {
                obj[l2] = 8;
            }
        } else
        {
            if (i1 >= ai1.length)
            {
                break MISSING_BLOCK_LABEL_537;
            }
            obj[l2] = ai1[i1];
            i1++;
        }
        if (true) goto _L14; else goto _L13
_L13:
        if (true) goto _L16; else goto _L15
_L15:
        int k3;
        boolean flag4;
        if (j1 != -1 || i1 != ai1.length - 1)
        {
            ArrayList arraylist = new ArrayList(3);
            int i3 = i1;
            if (j1 != -1)
            {
                arraylist.add(Integer.valueOf(j1));
                i3 = i1;
            }
            for (; i3 < ai1.length; i3++)
            {
                arraylist.add(Integer.valueOf(ai1[i3]));
            }

            ai1 = new int[arraylist.size() + obj.length];
            System.arraycopy(obj, 0, ai1, 0, obj.length);
            i1 = obj.length;
            for (obj = arraylist.iterator(); ((Iterator) (obj)).hasNext();)
            {
                ai1[i1] = ((Integer)((Iterator) (obj)).next()).intValue();
                i1++;
            }

            obj = ai1;
        }
        a a1 = com.roidapp.cloudlib.a.a.a(d);
        Object obj2;
        if (flag)
        {
            obj2 = "firstAheadShare";
        } else
        {
            obj2 = "firstAhead";
        }
        flag4 = a1.a("ad", ((String) (obj2)), true);
        l = new com.roidapp.photogrid.cloud.a.x(d, g, f);
        if (!l.f)
        {
            int k1 = obj.length;
            if (al == null)
            {
                i1 = 0;
            } else
            {
                i1 = al.length;
            }
            h = new ArrayList(i1 + k1 + 1);
        } else
        {
            int l1 = obj.length;
            if (al == null)
            {
                i1 = 0;
            } else
            {
                i1 = al.length;
            }
            h = new ArrayList(i1 + l1);
        }
        if (al != null)
        {
            k1 = al.length;
            for (i1 = 0; i1 < k1; i1++)
            {
                obj2 = al[i1];
                h.add(obj2);
            }

        }
        n = new s(this);
        if (!l.f)
        {
            h.add(l);
        }
        int j3;
        int i4;
        if (af.a(d))
        {
            m = new com.roidapp.photogrid.cloud.a.n(d, g, f);
            if (m != null)
            {
                h.add(m);
            }
        } else
        {
            al = new o(d, g);
            h.add(al);
        }
        i4 = obj.length;
        k3 = 0;
        j3 = 0;
        i1 = 0;
        if (j3 >= i4)
        {
            break MISSING_BLOCK_LABEL_1648;
        }
        switch (obj[j3])
        {
        case 4: // '\004'
        case 5: // '\005'
        case 7: // '\007'
        default:
            break;

        case 1: // '\001'
            break; /* Loop/switch isn't completed */

        case 2: // '\002'
            k = new y(d, f, g);
            if (!k.f)
            {
                k.a(n);
                if (flag4)
                {
                    h.add(h.size() - 1, k);
                } else
                {
                    h.add(k);
                }
            } else
            {
                k = null;
            }
            continue; /* Loop/switch isn't completed */

        case 3: // '\003'
            if (!flag1)
            {
                j = new u(d, g, e);
                a = j.b();
                if (!j.f)
                {
                    if (flag4)
                    {
                        h.add(h.size() - 1, j);
                    } else
                    {
                        h.add(j);
                    }
                }
            }
            continue; /* Loop/switch isn't completed */

        case 6: // '\006'
        case 8: // '\b'
            if (af.a(d))
            {
                al = new o(d, g);
            } else
            {
                al = new com.roidapp.photogrid.cloud.a.n(d, g, f);
            }
            if (!((com.roidapp.photogrid.cloud.a.l) (al)).f)
            {
                if (flag4)
                {
                    h.add(h.size() - 1, al);
                } else
                {
                    h.add(al);
                }
            }
            continue; /* Loop/switch isn't completed */

        case 0: // '\0'
            break;
        }
        break MISSING_BLOCK_LABEL_1475;
_L20:
        k3++;
        j3++;
        flag4 = false;
        if (true) goto _L18; else goto _L17
_L18:
        break MISSING_BLOCK_LABEL_990;
_L17:
        if (!flag1)
        {
            al = new p(d, g, b, c);
            if (!((p) (al)).f)
            {
                if (flag4)
                {
                    h.add(h.size() - 1, al);
                } else
                {
                    h.add(al);
                }
            }
        }
        continue; /* Loop/switch isn't completed */
        if (com.roidapp.photogrid.a.m.a(d) != 1 && !com.roidapp.photogrid.common.a.a().b)
        {
            al = new com.roidapp.photogrid.cloud.a.a(d, j2, i1, g);
            if (!((com.roidapp.photogrid.cloud.a.a) (al)).f)
            {
                al.a(n);
                if (i == null)
                {
                    i = new ArrayList(2);
                }
                int i2;
                if (flag4 && k3 == 0)
                {
                    i2 = 1;
                } else
                if (flag4 && k3 != 0)
                {
                    i2 = h.size() - 1;
                } else
                {
                    i2 = h.size() + i.size();
                }
                i.add(new x(al, Integer.valueOf(i2)));
                al.c();
            }
        }
        i1++;
        if (true) goto _L20; else goto _L19
_L19:
        al = new com.roidapp.photogrid.cloud.a.m(d, g);
        if (!((com.roidapp.photogrid.cloud.a.l) (al)).f)
        {
            h.add(al);
        }
        al = new k(d, g);
        if (!((com.roidapp.photogrid.cloud.a.l) (al)).f)
        {
            h.add(al);
        }
        listview.setAdapter(n);
        al = new r(this, flag, (byte)0);
        o = al;
        listview.setOnScrollListener(al);
        return;
          goto _L10
    }

    static List b(q q1)
    {
        return q1.i;
    }

    public final void a()
    {
        boolean flag1 = false;
        int i1 = d.getSharedPreferences(d.getPackageName(), 0).getInt("REGISTER_COUNT", -3);
        boolean flag = flag1;
        if (i1 >= 5)
        {
            flag = flag1;
            if (i1 >= 5)
            {
                flag = true;
            }
        }
        if (flag && l != null && !l.f)
        {
            l.f = true;
            if (h != null && h.contains(l) && n != null)
            {
                h.remove(l);
                n.notifyDataSetChanged();
            }
        }
    }

    public final void a(Bitmap bitmap)
    {
        if (j != null)
        {
            j.a(bitmap);
        }
        if (n != null)
        {
            n.notifyDataSetChanged();
        }
    }

    public final void a(String s1)
    {
        a(s1, 0);
    }

    public final void a(String s1, int i1)
    {
        if (o != null && com.roidapp.photogrid.cloud.a.r.a(o) != null)
        {
            com.roidapp.photogrid.b.f.a((new StringBuilder()).append(com.roidapp.photogrid.cloud.a.r.a(o)).append(s1).toString(), 4, i1);
        }
    }

    public final void b()
    {
        o = null;
        n = null;
        if (i != null)
        {
            Iterator iterator = h.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                com.roidapp.photogrid.cloud.a.l l1 = (com.roidapp.photogrid.cloud.a.l)iterator.next();
                if (l1 != null)
                {
                    l1.a();
                }
            } while (true);
            i.clear();
            i = null;
        }
        if (h != null)
        {
            Iterator iterator1 = h.iterator();
            do
            {
                if (!iterator1.hasNext())
                {
                    break;
                }
                com.roidapp.photogrid.cloud.a.l l2 = (com.roidapp.photogrid.cloud.a.l)iterator1.next();
                if (l2 != null)
                {
                    l2.a();
                }
            } while (true);
            h.clear();
            h = null;
        }
        j = null;
        k = null;
        d = null;
    }
}

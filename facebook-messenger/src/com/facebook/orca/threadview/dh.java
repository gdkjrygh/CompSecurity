// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import a.a;
import a.b;
import a.c;
import a.d;
import a.g;
import a.i;
import com.facebook.common.e.h;
import com.facebook.common.w.n;
import com.facebook.messages.model.threads.Message;
import com.facebook.messages.model.threads.ParticipantInfo;
import com.facebook.widget.animatablelistview.k;
import com.facebook.widget.animatablelistview.o;
import com.google.common.a.hq;
import com.google.common.a.ik;
import com.google.common.a.kl;
import com.google.common.base.Objects;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.facebook.orca.threadview:
//            dj, ac, ae, dk, 
//            ad, aj, ai, af

public class dh
{

    private static final Class a = com/facebook/orca/threadview/dh;
    private final com.facebook.widget.animatablelistview.d b;
    private final h c;

    public dh(com.facebook.widget.animatablelistview.d d1, h h1)
    {
        b = d1;
        c = h1;
    }

    private void a(int j, int l, int i1, dj dj1, d d1, List list, List list1)
    {
        StringBuilder stringbuilder = new StringBuilder(100);
        stringbuilder.append("Cannot replace item. Exceeds final items.\n");
        stringbuilder.append("Position: ").append(j).append('\n');
        stringbuilder.append("OriginalIndex: ").append(l).append('\n');
        stringbuilder.append("AdjustedIndex: ").append(i1).append('\n');
        stringbuilder.append("ItemDeletionTracker: ").append(dj1).append('\n');
        stringbuilder.append("Delta: ").append(d1).append("\n===\n");
        stringbuilder.append("Final orig items: ").append('\n');
        j = list.size();
        stringbuilder.append("currentItems: ").append(j).append('\n');
        a(5, list, stringbuilder);
        a(5, list1, stringbuilder);
        c.a("adapter_cannot_replace_item_error", stringbuilder.toString());
    }

    private void a(int j, List list, StringBuilder stringbuilder)
    {
        int i1 = list.size();
        stringbuilder.append("items size: ").append(i1).append('\n');
        for (int l = i1 - 1; j + 1 + l > i1 && l >= 0; l--)
        {
            stringbuilder.append(l).append(": ").append(list.get(l)).append('\n');
        }

        stringbuilder.append("===\n");
    }

    private void a(k k1, int j, int l, dj dj1)
    {
        if (k1.a() - 10 < j)
        {
            k1.c(j);
            dj1.b(j);
            return;
        } else
        {
            k1.a(j);
            dj1.a(l);
            return;
        }
    }

    private void a(k k1, int j, ac ac1)
    {
        if (k1.a() - 10 < j)
        {
            k1.b(j, ac1);
            return;
        } else
        {
            k1.a(j, ac1);
            return;
        }
    }

    private void a(StringBuilder stringbuilder, List list, int j)
    {
        if (list == null || list.isEmpty())
        {
            stringbuilder.append("    none\n");
        } else
        {
            int l = 0;
            while (l < j && l < list.size()) 
            {
                stringbuilder.append("   ").append(((ac)list.get(l)).toString()).append("\n");
                l++;
            }
        }
    }

    private void a(List list, List list1)
    {
        if (c == null)
        {
            return;
        } else
        {
            int j = list.size();
            int l = list1.size();
            StringBuilder stringbuilder = new StringBuilder(100);
            stringbuilder.append("CurrentItems: ").append(j).append('\n');
            stringbuilder.append("FinalItems: ").append(l).append('\n');
            stringbuilder.append("Last five items of each set:\n");
            a(5, list, stringbuilder);
            a(5, list1, stringbuilder);
            c.a("adapter_items_size_changed_error", stringbuilder.toString());
            return;
        }
    }

    private void a(List list, List list1, Set set, Map map)
    {
        list1 = kl.a(list1);
        list = list.iterator();
label0:
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            Object obj = list.next();
            Iterator iterator = list1.iterator();
            ac ac1;
label1:
            do
            {
                do
                {
                    do
                    {
                        do
                        {
                            if (!iterator.hasNext())
                            {
                                continue label0;
                            }
                            ac1 = (ac)iterator.next();
                            if (!(obj instanceof ae) || !(ac1 instanceof ae))
                            {
                                break;
                            }
                            if (d((ae)obj, (ae)ac1))
                            {
                                set.add((ac)obj);
                                map.put(ac1, dk.NONE);
                                iterator.remove();
                                continue label0;
                            }
                        } while (true);
                        if (!(obj instanceof ad) || !(ac1 instanceof ad))
                        {
                            break;
                        }
                        ad ad1 = (ad)obj;
                        ad ad2 = (ad)ac1;
                        if (a(ad1, ad2))
                        {
                            set.add((ac)obj);
                            if (c(ad1, ad2))
                            {
                                map.put(ac1, dk.HIDE);
                            } else
                            if (b(ad1, ad2))
                            {
                                map.put(ac1, dk.REVEAL);
                            } else
                            {
                                map.put(ac1, dk.NONE);
                            }
                            iterator.remove();
                            continue label0;
                        }
                    } while (true);
                    if (!(obj instanceof aj) || !(ac1 instanceof aj))
                    {
                        continue label1;
                    }
                } while (!a(((ac) ((aj)obj)), ((ac) ((aj)ac1))));
                set.add((ac)obj);
                map.put(ac1, dk.NONE);
                iterator.remove();
                continue label0;
            } while (!(obj instanceof ai) || !(ac1 instanceof ad));
            set.add((ac)obj);
            map.put(ac1, dk.REVEAL);
            iterator.remove();
        } while (true);
    }

    private boolean a(ac ac1, ac ac2)
    {
        return ac1.a() == 2 && ac2.a() == 3 || ac1.a() == 3 && ac2.a() == 2;
    }

    private boolean a(k k1, i j, List list)
    {
        dj dj1 = new dj(this, null);
        boolean flag = true;
label0:
        do
        {
            d d1;
label1:
            do
            {
                for (j = j.a().iterator(); j.hasNext();)
                {
                    d1 = (d)j.next();
                    if (d1 instanceof a.h)
                    {
                        List list1 = d1.b().b();
                        int l = 0;
                        while (l < list1.size()) 
                        {
                            ac ac1 = (ac)list1.get(l);
                            int i2 = d1.b().a() + l;
                            if (flag)
                            {
                                a(k1, dj1.d(i2) + i2, ac1);
                                flag = false;
                                l++;
                            } else
                            {
                                return true;
                            }
                        }
                    } else
                    {
                        if (!(d1 instanceof c))
                        {
                            continue label1;
                        }
                        List list2 = d1.a().b();
                        int i1 = 0;
                        while (i1 < list2.size()) 
                        {
                            int j2 = d1.a().a() + i1;
                            a(k1, j2 - dj1.c(j2), j2, dj1);
                            i1++;
                        }
                    }
                }

                break label0;
            } while (!(d1 instanceof a));
            List list4 = d1.a().b();
            List list3 = d1.b().b();
            java.util.HashSet hashset = kl.a();
            java.util.HashMap hashmap = ik.a();
            a(list4, list3, ((Set) (hashset)), ((Map) (hashmap)));
            for (int j1 = 0; j1 < list4.size(); j1++)
            {
                if (!hashset.contains(list4.get(j1)))
                {
                    int k2 = d1.a().a() + j1;
                    a(k1, k2 - dj1.c(k2), k2, dj1);
                }
            }

            int l1 = 0;
            while (l1 < list3.size()) 
            {
                ac ac2 = (ac)list3.get(l1);
                int l2 = d1.b().a() + l1;
                l2 += dj1.d(l2);
                if (hashmap.containsKey(ac2))
                {
                    dk dk1 = (dk)hashmap.get(ac2);
                    if (dk1 == dk.HIDE)
                    {
                        k1.d(l2, ac2);
                        k1.a(l2, com.facebook.i.row_receipt_animating_item_view, o.HIDE_WITH_ANIMATION_DOWN);
                    } else
                    if (dk1 == dk.REVEAL)
                    {
                        if (!k1.d(l2) && c != null)
                        {
                            int i3 = d1.b().a();
                            int j3 = i3 + l1;
                            a(i3, j3, dj1.c(j3), dj1, d1, list, k1.c());
                        }
                        k1.c(l2, ac2);
                        k1.a(l2, com.facebook.i.row_receipt_animating_item_view, o.REVEAL_WITH_ANIMATION_UP);
                    } else
                    {
                        k1.c(l2, ac2);
                    }
                } else
                if (flag)
                {
                    a(k1, l2, ac2);
                    flag = false;
                } else
                {
                    return true;
                }
                l1++;
            }
        } while (true);
        return false;
    }

    private int[] a(i j)
    {
        int ai1[] = new int[2];
        j = j.a().iterator();
        do
        {
            if (!j.hasNext())
            {
                break;
            }
            d d1 = (d)j.next();
            if (d1 instanceof c)
            {
                int l = ai1[1];
                ai1[1] = d1.a().c() + l;
            } else
            if (d1 instanceof a.h)
            {
                int i1 = ai1[0];
                ai1[0] = d1.b().c() + i1;
            } else
            if (d1 instanceof a)
            {
                if (d1.a().c() > d1.b().c())
                {
                    int j1 = ai1[1];
                    ai1[1] = d1.a().c() + j1;
                } else
                if (d1.b().c() > d1.a().c())
                {
                    ai1[0] = ai1[0] + (d1.b().c() - d1.a().c());
                    int k1 = ai1[1];
                    ai1[1] = d1.a().c() + k1;
                }
            }
        } while (true);
        return ai1;
    }

    private void b(List list, List list1)
    {
        if (!com.facebook.debug.log.b.b(2))
        {
            return;
        } else
        {
            StringBuilder stringbuilder = new StringBuilder(100);
            stringbuilder.append("Current messages:\n");
            a(stringbuilder, hq.a(list), 6);
            stringbuilder.append("  New Message:\n");
            a(stringbuilder, hq.a(list1), 6);
            stringbuilder.append("\n");
            com.facebook.debug.log.b.a(a, stringbuilder.toString());
            return;
        }
    }

    private boolean b(ad ad1, ad ad2)
    {
        return ad1.d() == null && ad2.d() != null;
    }

    private boolean c(ad ad1, ad ad2)
    {
        return ad1.d() != null && ad2.d() == null;
    }

    private boolean d(ae ae1, ae ae2)
    {
        return a(ae1, ae2) || c(ae1, ae2) || b(ae1, ae2);
    }

    public void a(List list)
    {
        com.google.common.a.es es1 = b.d();
        if (!es1.isEmpty()) goto _L2; else goto _L1
_L1:
        k k1 = b.a();
        k1.a(list);
        k1.b();
_L4:
        return;
_L2:
        Object obj = g.a(es1, list);
        if (((i) (obj)).a().isEmpty()) goto _L4; else goto _L3
_L3:
        com.google.common.a.es es;
label0:
        {
            int ai1[] = a(((i) (obj)));
            if (ai1[0] <= 3)
            {
                int j = ai1[0];
                if (ai1[1] + j <= 8)
                {
                    break label0;
                }
            }
            b.b();
            obj = b.a();
            ((k) (obj)).a(list);
            ((k) (obj)).b();
            return;
        }
        b(es1, list);
        com.google.common.a.es es2 = b.d();
        es = es1;
        if (es1.size() == es2.size())
        {
            break; /* Loop/switch isn't completed */
        }
        a(((List) (es1)), ((List) (es2)));
        es = b.d();
        obj = g.a(es, list);
        if (((i) (obj)).a().isEmpty()) goto _L4; else goto _L5
_L5:
        k k2;
        for (k2 = b.a(); a(k2, ((i) (obj)), ((List) (es))); obj = g.a(es, list))
        {
            k2.b();
            k2 = b.a();
            es = b.d();
        }

        k2.b();
        return;
    }

    public void a(boolean flag, List list, ParticipantInfo participantinfo)
    {
        list = b.d();
        k k1 = b.a();
        if (flag)
        {
            k1.a(new ai(participantinfo));
        } else
        {
            k1.b(list.size() - 1);
        }
        k1.b();
    }

    public boolean a(ad ad1, ad ad2)
    {
        boolean flag1 = false;
        ad1 = ad1.b();
        ad2 = ad2.b();
        boolean flag;
        if (!n.a(ad1.d()) && !n.a(ad2.d()) && Objects.equal(ad1.d(), ad2.d()))
        {
            flag = true;
        } else
        {
            flag = flag1;
            if (!n.a(ad1.w()))
            {
                flag = flag1;
                if (!n.a(ad2.w()))
                {
                    return Objects.equal(ad1.w(), ad2.w());
                }
            }
        }
        return flag;
    }

    public boolean a(ae ae1, ae ae2)
    {
        return ae1.b() == af.READ && ae2.b() == af.DELIVERED || ae1.b() == af.DELIVERED && ae2.b() == af.READ;
    }

    public boolean b(ae ae1, ae ae2)
    {
        return ae1.b().equals(af.READ) && ae2.b() == af.SENT_FROM_RECEIPT;
    }

    public boolean c(ae ae1, ae ae2)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (ae1.c() != null)
        {
            flag = flag1;
            if (ae2.c() != null)
            {
                flag = flag1;
                if (ae1.b() == af.READ)
                {
                    flag = flag1;
                    if (ae2.b() == af.READ)
                    {
                        flag = flag1;
                        if (!ae1.a(ae2))
                        {
                            flag = true;
                        }
                    }
                }
            }
        }
        return flag;
    }

}

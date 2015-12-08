// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.mobile.android.service.media.MediaService;
import com.spotify.mobile.android.service.media.browser.MediaBrowserItem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

public final class efz
{

    final efy a;
    public final Map b = new HashMap();
    final String c;
    String d;
    String e;
    final String f;
    private final egq g;
    private final ebf h;
    private egc i;

    public efz(efy efy1, MediaService mediaservice, egq egq1, eay eay)
    {
        i = new egc() {

            public final void a(boolean flag)
            {
            }

        };
        a = efy1;
        g = egq1;
        h = mediaservice.a;
        c = ebp.a(mediaservice, eay).a;
        d = ebs.a(mediaservice, eay).a;
        e = ebr.a(mediaservice, eay).a;
        f = ebn.a(mediaservice, eay).a;
    }

    static egk a(efz efz1, List list, String s, String s1)
    {
        Object obj1 = a(list);
        Object obj = new HashSet();
        list = new ArrayList();
        obj1 = ((List) (obj1)).iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            MediaBrowserItem mediabrowseritem = (MediaBrowserItem)((Iterator) (obj1)).next();
            String s2 = efz1.a(mediabrowseritem.c);
            if (!((Set) (obj)).contains(s2.toLowerCase(Locale.getDefault())))
            {
                list.add(mediabrowseritem);
                ((Set) (obj)).add(s2.toLowerCase(Locale.getDefault()));
            }
        } while (true);
        obj = new egk();
        obj.a = s;
        obj.b = s1;
        for (list = list.iterator(); list.hasNext(); ((egk) (obj)).d.add(s1))
        {
            s = (MediaBrowserItem)list.next();
            s1 = efz1.a(((MediaBrowserItem) (s)).c);
            s1 = new egm(s1, new Vector(Arrays.asList(new String[] {
                s1
            })));
            s1.e = ((MediaBrowserItem) (s)).a;
            s1.f = ((MediaBrowserItem) (s)).b;
        }

        return ((egk) (obj));
    }

    private String a(String s)
    {
        s = a.a(s);
        return s.substring(0, Math.min(60, s.length()));
    }

    static List a(List list)
    {
        List list1 = list;
        if (list.size() > 100)
        {
            list1 = list.subList(0, 99);
        }
        return list1;
    }

    final void a(egk egk1, boolean flag)
    {
        boolean flag1;
        if (!egk1.d.isEmpty())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            a.a(egk1, flag);
            return;
        } else
        {
            egk1 = g.a.getString(0x7f0800a0);
            a.b(egk1, i);
            a.a(egk1, i);
            return;
        }
    }

    public final void a(String s, String s1, String s2)
    {
        if (b.containsKey(s) || b.keySet().size() > 100)
        {
            return;
        } else
        {
            b.put(s, null);
            h.a(s, new ebg(s1, s2, s) {

                final String a;
                final efz b;
                private String c;
                private String d;

                public final void a(Throwable throwable)
                {
                }

                public final void a(List list)
                {
                    list = efz.a(list);
                    list = efz.a(b, list, c, d);
                    b.a.a(list, new egc(this, list) {

                        private egk a;
                        private _cls3 b;

                        public final void a(boolean flag)
                        {
                            if (flag)
                            {
                                b.b.b.put(b.a, a);
                                return;
                            } else
                            {
                                b.b.b.remove(b.a);
                                return;
                            }
                        }

            
            {
                b = _pcls3;
                a = egk1;
                super();
            }
                    });
                }

            
            {
                b = efz.this;
                c = s;
                d = s1;
                a = s2;
                super();
            }
            });
            return;
        }
    }

    public final void a(String s, boolean flag, String s1, String s2)
    {
        egk egk1 = (egk)b.get(s);
        if (egk1 != null)
        {
            a(egk1, flag);
            return;
        } else
        {
            h.a(s, new ebg(s1, s2, s, flag) {

                private String a;
                private String b;
                private String c;
                private boolean d;
                private efz e;

                public final void a(Throwable throwable)
                {
                }

                public final void a(List list)
                {
                    list = efz.a(e, list, a, b);
                    efz efz1 = e;
                    String s3 = c;
                    boolean flag1 = d;
                    efz1.a.a(list, efz1. new egc(s3, list, flag1) {

                        private String a;
                        private egk b;
                        private boolean c;
                        private efz d;

                        public final void a(boolean flag)
                        {
                            if (flag)
                            {
                                d.b.put(a, b);
                                d.a(b, c);
                            }
                        }

            
            {
                d = efz.this;
                a = s;
                b = egk1;
                c = flag;
                super();
            }
                    });
                }

            
            {
                e = efz.this;
                a = s;
                b = s1;
                c = s2;
                d = flag;
                super();
            }
            });
            return;
        }
    }
}

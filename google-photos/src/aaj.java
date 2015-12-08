// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.media.MediaRouter;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

class aaj extends aai
    implements zl, zp
{

    private static final ArrayList o;
    private static final ArrayList p;
    public final Object i;
    public final Object j = c();
    public int k;
    public boolean l;
    public boolean m;
    public final ArrayList n = new ArrayList();
    private final aas q;
    private Object r;
    private Object s;
    private ArrayList t;
    private zo u;
    private zn v;

    public aaj(Context context, aas aas1)
    {
        super(context);
        t = new ArrayList();
        q = aas1;
        i = context.getSystemService("media_router");
        r = b.a(this);
        context = context.getResources();
        s = b.a(i, context.getString(b.cg), false);
        e();
    }

    private void a(aal aal1)
    {
        yq yq1 = new yq(aal1.b, j(aal1.a));
        a(aal1, yq1);
        aal1.c = yq1.a();
    }

    private int b(String s1)
    {
        int j1 = n.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            if (((aal)n.get(i1)).b.equals(s1))
            {
                return i1;
            }
        }

        return -1;
    }

    private int e(zk zk1)
    {
        int j1 = t.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            if (((aam)t.get(i1)).a == zk1)
            {
                return i1;
            }
        }

        return -1;
    }

    private void e()
    {
        Object obj = (MediaRouter)i;
        int j1 = ((MediaRouter) (obj)).getRouteCount();
        ArrayList arraylist = new ArrayList(j1);
        for (int i1 = 0; i1 < j1; i1++)
        {
            arraylist.add(((MediaRouter) (obj)).getRouteAt(i1));
        }

        obj = arraylist.iterator();
        boolean flag;
        for (flag = false; ((Iterator) (obj)).hasNext(); flag |= f(((Iterator) (obj)).next())) { }
        if (flag)
        {
            a();
        }
    }

    private boolean f(Object obj)
    {
        if (i(obj) != null || g(obj) >= 0) goto _L2; else goto _L1
_L1:
        String s1;
        boolean flag;
        if (d() == obj)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            s1 = "DEFAULT_ROUTE";
        } else
        {
            s1 = String.format(Locale.US, "ROUTE_%08x", new Object[] {
                Integer.valueOf(j(obj).hashCode())
            });
        }
        if (b(s1) >= 0) goto _L4; else goto _L3
_L3:
        obj = new aal(obj, s1);
        a(((aal) (obj)));
        n.add(obj);
        return true;
_L4:
        int i1 = 2;
        do
        {
            String s2 = String.format(Locale.US, "%s_%d", new Object[] {
                s1, Integer.valueOf(i1)
            });
            if (b(s2) < 0)
            {
                s1 = s2;
                continue; /* Loop/switch isn't completed */
            }
            i1++;
        } while (true);
_L2:
        return false;
        if (true) goto _L3; else goto _L5
_L5:
    }

    private static aam i(Object obj)
    {
        obj = ((android.media.MediaRouter.RouteInfo)obj).getTag();
        if (obj instanceof aam)
        {
            return (aam)obj;
        } else
        {
            return null;
        }
    }

    private String j(Object obj)
    {
        Context context = super.a;
        obj = ((android.media.MediaRouter.RouteInfo)obj).getName(context);
        if (obj != null)
        {
            return ((CharSequence) (obj)).toString();
        } else
        {
            return "";
        }
    }

    public final yw a(String s1)
    {
        int i1 = b(s1);
        if (i1 >= 0)
        {
            return new aak(this, ((aal)n.get(i1)).a);
        } else
        {
            return null;
        }
    }

    protected final void a()
    {
        yy yy1 = new yy();
        int j1 = n.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            yy1.a(((aal)n.get(i1)).c);
        }

        a(yy1.a());
    }

    protected void a(aal aal1, yq yq1)
    {
        int i1 = ((android.media.MediaRouter.RouteInfo)aal1.a).getSupportedTypes();
        if ((i1 & 1) != 0)
        {
            yq1.a(o);
        }
        if ((i1 & 2) != 0)
        {
            yq1.a(p);
        }
        yq1.a(((android.media.MediaRouter.RouteInfo)aal1.a).getPlaybackType());
        yq1.b(((android.media.MediaRouter.RouteInfo)aal1.a).getPlaybackStream());
        yq1.c(((android.media.MediaRouter.RouteInfo)aal1.a).getVolume());
        yq1.d(((android.media.MediaRouter.RouteInfo)aal1.a).getVolumeMax());
        yq1.e(((android.media.MediaRouter.RouteInfo)aal1.a).getVolumeHandling());
    }

    protected void a(aam aam1)
    {
        Object obj = aam1.b;
        String s1 = aam1.a.d;
        ((android.media.MediaRouter.UserRouteInfo)obj).setName(s1);
        b.c(aam1.b, aam1.a.i);
        b.d(aam1.b, aam1.a.j);
        b.e(aam1.b, aam1.a.l);
        b.f(aam1.b, aam1.a.m);
        b.g(aam1.b, aam1.a.k);
    }

    public final void a(Object obj)
    {
        if (obj == b.b(i, 0x800003))
        {
            aam aam1 = i(obj);
            if (aam1 != null)
            {
                aam1.a.c();
                return;
            }
            int i1 = g(obj);
            if (i1 >= 0)
            {
                obj = (aal)n.get(i1);
                obj = q.a(((aal) (obj)).b);
                if (obj != null)
                {
                    ((zk) (obj)).c();
                    return;
                }
            }
        }
    }

    public final void a(Object obj, int i1)
    {
        obj = i(obj);
        if (obj != null)
        {
            ((aam) (obj)).a.a(i1);
        }
    }

    public final void a(zk zk1)
    {
        if (zk1.d() != this)
        {
            Object obj = b.b(i, s);
            zk1 = new aam(zk1, obj);
            b.c(obj, zk1);
            b.d(obj, r);
            a(((aam) (zk1)));
            t.add(zk1);
            ((MediaRouter)i).addUserRoute((android.media.MediaRouter.UserRouteInfo)obj);
        } else
        {
            int i1 = g(b.b(i, 0x800003));
            if (i1 >= 0 && ((aal)n.get(i1)).b.equals(zk1.b))
            {
                zk1.c();
                return;
            }
        }
    }

    protected void b()
    {
        if (m)
        {
            m = false;
            b.a(i, j);
        }
        if (k != 0)
        {
            m = true;
            Object obj = i;
            int i1 = k;
            Object obj1 = j;
            ((MediaRouter)obj).addCallback(i1, (android.media.MediaRouter.Callback)obj1);
        }
    }

    public final void b(Object obj)
    {
        if (f(obj))
        {
            a();
        }
    }

    public final void b(Object obj, int i1)
    {
        obj = i(obj);
        if (obj != null)
        {
            ((aam) (obj)).a.b(i1);
        }
    }

    public final void b(yr yr1)
    {
        boolean flag = false;
        int i1;
        if (yr1 != null)
        {
            List list = yr1.a().a();
            int k1 = list.size();
            int j1 = 0;
            i1 = 0;
            while (j1 < k1) 
            {
                String s1 = (String)list.get(j1);
                if (s1.equals("android.media.intent.category.LIVE_AUDIO"))
                {
                    i1 |= 1;
                } else
                if (s1.equals("android.media.intent.category.LIVE_VIDEO"))
                {
                    i1 |= 2;
                } else
                {
                    i1 = 0x800000 | i1;
                }
                j1++;
            }
            flag = yr1.b();
        } else
        {
            i1 = 0;
        }
        if (k != i1 || l != flag)
        {
            k = i1;
            l = flag;
            b();
            e();
        }
    }

    public final void b(zk zk1)
    {
        if (zk1.d() != this)
        {
            int i1 = e(zk1);
            if (i1 >= 0)
            {
                Object obj = (aam)t.remove(i1);
                b.c(((aam) (obj)).b, null);
                b.d(((aam) (obj)).b, null);
                zk1 = ((zk) (i));
                obj = ((aam) (obj)).b;
                ((MediaRouter)zk1).removeUserRoute((android.media.MediaRouter.UserRouteInfo)obj);
            }
        }
    }

    protected Object c()
    {
        return new zm(this);
    }

    public final void c(Object obj)
    {
        if (i(obj) == null)
        {
            int i1 = g(obj);
            if (i1 >= 0)
            {
                n.remove(i1);
                a();
            }
        }
    }

    public final void c(zk zk1)
    {
        if (zk1.d() != this)
        {
            int i1 = e(zk1);
            if (i1 >= 0)
            {
                a((aam)t.get(i1));
            }
        }
    }

    protected Object d()
    {
        if (v == null)
        {
            v = new zn();
        }
        return v.a(i);
    }

    public final void d(Object obj)
    {
        if (i(obj) == null)
        {
            int i1 = g(obj);
            if (i1 >= 0)
            {
                a((aal)n.get(i1));
                a();
            }
        }
    }

    public final void d(zk zk1)
    {
        if (zk1.a()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i1;
        if (zk1.d() == this)
        {
            break; /* Loop/switch isn't completed */
        }
        if ((i1 = e(zk1)) >= 0)
        {
            h(((aam)t.get(i1)).b);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        int j1 = b(zk1.b);
        if (j1 >= 0)
        {
            h(((aal)n.get(j1)).a);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public final void e(Object obj)
    {
        if (i(obj) == null)
        {
            int i1 = g(obj);
            if (i1 >= 0)
            {
                aal aal1 = (aal)n.get(i1);
                i1 = ((android.media.MediaRouter.RouteInfo)obj).getVolume();
                if (i1 != aal1.c.l())
                {
                    aal1.c = (new yq(aal1.c)).c(i1).a();
                    a();
                }
            }
        }
    }

    protected final int g(Object obj)
    {
        int j1 = n.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            if (((aal)n.get(i1)).a == obj)
            {
                return i1;
            }
        }

        return -1;
    }

    protected void h(Object obj)
    {
        if (u == null)
        {
            u = new zo();
        }
        zo zo1 = u;
        MediaRouter mediarouter = (MediaRouter)i;
        obj = (android.media.MediaRouter.RouteInfo)obj;
        if ((((android.media.MediaRouter.RouteInfo) (obj)).getSupportedTypes() & 0x800000) == 0)
        {
            if (zo1.a != null)
            {
                try
                {
                    zo1.a.invoke(mediarouter, new Object[] {
                        Integer.valueOf(0x800003), obj
                    });
                    return;
                }
                catch (IllegalAccessException illegalaccessexception)
                {
                    Log.w("MediaRouterJellybean", "Cannot programmatically select non-user route.  Media routing may not work.", illegalaccessexception);
                }
                catch (InvocationTargetException invocationtargetexception)
                {
                    Log.w("MediaRouterJellybean", "Cannot programmatically select non-user route.  Media routing may not work.", invocationtargetexception);
                }
            } else
            {
                Log.w("MediaRouterJellybean", "Cannot programmatically select non-user route because the platform is missing the selectRouteInt() method.  Media routing may not work.");
            }
        }
        mediarouter.selectRoute(0x800003, ((android.media.MediaRouter.RouteInfo) (obj)));
    }

    static 
    {
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addCategory("android.media.intent.category.LIVE_AUDIO");
        ArrayList arraylist = new ArrayList();
        o = arraylist;
        arraylist.add(intentfilter);
        intentfilter = new IntentFilter();
        intentfilter.addCategory("android.media.intent.category.LIVE_VIDEO");
        arraylist = new ArrayList();
        p = arraylist;
        arraylist.add(intentfilter);
    }
}

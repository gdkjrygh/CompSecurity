// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class gqb extends md
{

    public gqe b;
    private final jp c = new jp(10);
    private final ay d;
    private final gqc e;
    private final Map f = new HashMap();
    private final SparseArray g = new SparseArray();
    private am h;
    private bp i;

    public gqb(ay ay1, gqc gqc1)
    {
        d = ay1;
        e = gqc1;
    }

    private static void a(am am1, boolean flag)
    {
        if (am1 == null)
        {
            return;
        } else
        {
            am1.e(flag);
            am1.g_(flag);
            return;
        }
    }

    private bp d()
    {
        if (i == null)
        {
            i = d.a();
        }
        return i;
    }

    public final int a(Object obj)
    {
        obj = (gqd)obj;
        int j;
        byte byte0;
        if (((gqd) (obj)).a == null)
        {
            j = -1;
        } else
        {
            j = e.a(((gqd) (obj)).a);
        }
        byte0 = j;
        if (j == -1)
        {
            byte0 = -2;
        }
        return byte0;
    }

    public final ekp a(int j)
    {
        return e.a(j);
    }

    public final Object a(ViewGroup viewgroup, int j)
    {
        ekp ekp1 = e.a(j);
        Object obj;
        if (ekp1 != null)
        {
            obj = (am)f.remove(ekp1);
        } else
        {
            obj = (am)g.get(j);
            g.remove(j);
        }
        if (obj != null)
        {
            d().e(((am) (obj)));
        } else
        {
            ekp ekp2 = e.a(j);
            if (ekp2 != null)
            {
                obj = gwu.a(ekp2, j);
                ((am) (obj)).q.putParcelable("com.google.android.apps.photos.pager.adapter.MediaPagerAdapter.media", ekp2);
            } else
            {
                obj = gqa.r();
                ((am) (obj)).q.putInt("com.google.android.apps.photos.pager.adapter.MediaPagerAdapter.blank_media", j);
            }
            if (ekp1 != null)
            {
                ap ap1 = (ap)c.a(ekp1);
                if (ap1 != null)
                {
                    ((am) (obj)).a(ap1);
                }
            }
            d().a(viewgroup.getId(), ((am) (obj)));
        }
        return new gqd(ekp1, ((am) (obj)));
    }

    public final void a(Parcelable parcelable, ClassLoader classloader)
    {
        if (parcelable != null)
        {
            Bundle bundle = (Bundle)parcelable;
            bundle.setClassLoader(classloader);
            parcelable = bundle.getParcelableArray("com.google.android.apps.photos.pager.adapter.MediaPagerAdapter.media");
            classloader = bundle.getParcelableArray("com.google.android.apps.photos.pager.adapter.MediaPagerAdapter.saved_state");
            if (parcelable != null && classloader != null)
            {
                if (parcelable.length != classloader.length)
                {
                    int j = parcelable.length;
                    int i1 = classloader.length;
                    throw new IllegalStateException((new StringBuilder(64)).append("Unequal media and state lengths, media: ").append(j).append(", ").append(i1).toString());
                }
                for (int k = 0; k < parcelable.length; k++)
                {
                    ekp ekp1 = (ekp)parcelable[k];
                    ap ap1 = (ap)classloader[k];
                    c.a(ekp1, ap1);
                }

                f.clear();
                g.clear();
                parcelable = d.f();
                if (parcelable != null)
                {
                    parcelable = parcelable.iterator();
                    while (parcelable.hasNext()) 
                    {
                        classloader = (am)parcelable.next();
                        if (classloader != null && ((am) (classloader)).q != null)
                        {
                            ekp ekp2 = (ekp)((am) (classloader)).q.getParcelable("com.google.android.apps.photos.pager.adapter.MediaPagerAdapter.media");
                            if (ekp2 != null)
                            {
                                f.put(ekp2, classloader);
                            } else
                            {
                                int l = ((am) (classloader)).q.getInt("com.google.android.apps.photos.pager.adapter.MediaPagerAdapter.blank_media");
                                g.put(l, classloader);
                            }
                        }
                    }
                }
            }
        }
    }

    public final void a(ViewGroup viewgroup)
    {
        if (i == null)
        {
            return;
        } else
        {
            i.c();
            i = null;
            d.b();
            return;
        }
    }

    public final void a(ViewGroup viewgroup, int j, Object obj)
    {
        viewgroup = (gqd)obj;
        if (((gqd) (viewgroup)).a != null)
        {
            c.a(((gqd) (viewgroup)).a, d.a(((gqd) (viewgroup)).b));
        }
        d().a(((gqd) (viewgroup)).b);
    }

    public final boolean a(View view, Object obj)
    {
        return ((gqd)obj).b.R == view;
    }

    public final Parcelable af_()
    {
        Bundle bundle = new Bundle();
        Set set = c.g().entrySet();
        java.util.Map.Entry aentry[] = (java.util.Map.Entry[])set.toArray(new java.util.Map.Entry[set.size()]);
        ekp aekp[] = new ekp[aentry.length];
        ap aap[] = new ap[aentry.length];
        for (int j = 0; j < aentry.length; j++)
        {
            java.util.Map.Entry entry = aentry[j];
            aekp[j] = (ekp)entry.getKey();
            aap[j] = (ap)entry.getValue();
        }

        bundle.putParcelableArray("com.google.android.apps.photos.pager.adapter.MediaPagerAdapter.media", aekp);
        bundle.putParcelableArray("com.google.android.apps.photos.pager.adapter.MediaPagerAdapter.saved_state", aap);
        return bundle;
    }

    public final int b()
    {
        return e.a();
    }

    public final void b(ViewGroup viewgroup, int j, Object obj)
    {
        obj = (gqd)obj;
        if (obj != null)
        {
            obj = ((gqd) (obj)).b;
        } else
        {
            obj = null;
        }
        if (obj != h)
        {
            a(h, false);
            a(((am) (obj)), true);
            h = ((am) (obj));
            if (b != null)
            {
                if (obj != null && !((am) (obj)).i())
                {
                    a(viewgroup);
                }
                b.a(((am) (obj)));
            }
        }
    }
}

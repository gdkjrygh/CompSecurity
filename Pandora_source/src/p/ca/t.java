// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.n;
import android.support.v4.content.i;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.pandora.android.provider.b;
import com.pandora.radio.data.j;
import com.pandora.radio.provider.d;
import java.util.List;
import p.cw.c;
import p.cx.x;
import p.df.a;

// Referenced classes of package p.ca:
//            m, v, y

public class t extends m
    implements android.support.v4.app.n.a
{
    private static class a extends android.support.v4.content.a
    {

        public Object c()
        {
            return e();
        }

        public List e()
        {
            List list = com.pandora.android.provider.b.a.b().w().c().b();
            if ((list == null || list.size() == 0) && Boolean.valueOf(true).booleanValue())
            {
                try
                {
                    com.pandora.android.provider.b.a.b().e().n();
                }
                catch (Exception exception)
                {
                    p.df.a.b("GenreCategoriesFragment", "getGenreStations error", exception);
                    return list;
                }
            }
            return list;
        }

        public a(Context context, Bundle bundle)
        {
            super(context);
        }
    }

    private class b
    {

        final t a;

        public void a()
        {
            com.pandora.android.provider.b.a.b().c(this);
        }

        public void onGenreStationDataChanged(p.dd.t t1)
        {
            p.ca.t.a(a, false);
        }

        public b()
        {
            a = t.this;
            super();
            com.pandora.android.provider.b.a.b().b(this);
        }
    }


    public List j;
    protected com.pandora.radio.util.j k;
    private b l;

    public t()
    {
    }

    public static t a(com.pandora.radio.util.j j1)
    {
        t t1 = new t();
        if (j1 != null)
        {
            Bundle bundle = new Bundle(1);
            bundle.putSerializable("intent_search_result_consumer", j1);
            t1.setArguments(bundle);
        }
        return t1;
    }

    static void a(t t1, boolean flag)
    {
        t1.c(flag);
    }

    private void c(boolean flag)
    {
        Bundle bundle = new Bundle();
        bundle.putBoolean("retryIfNoResults", flag);
        getLoaderManager().a(0, bundle, this).forceLoad();
    }

    protected void a(Bundle bundle)
    {
    }

    public void a(i i1, List list)
    {
        if (list != null)
        {
            j = list;
            a(((android.widget.ListAdapter) (new ArrayAdapter(getActivity(), 0x7f04005a, 0x7f100186, list))));
            return;
        } else
        {
            p.df.a.c("GenreCategoriesFragment", "Genre data is NULL");
            return;
        }
    }

    public void a(ListView listview, View view, int i1, long l1)
    {
        super.a(listview, view, i1, l1);
        if (j != null && j.size() > 0 && i1 >= 0 && i1 < j.size())
        {
            a((j)j.get(i1));
        }
    }

    protected void a(j j1)
    {
        j1 = p.ca.v.a(j1, k);
        i.a(j1);
    }

    public boolean a()
    {
        return false;
    }

    public boolean c()
    {
        return false;
    }

    public CharSequence d()
    {
        return com.pandora.android.provider.b.a.h().getString(0x7f0801a2);
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        if (bundle == null)
        {
            bundle = getArguments();
            if (bundle != null)
            {
                k = (com.pandora.radio.util.j)bundle.getSerializable("intent_search_result_consumer");
            }
        } else
        {
            a(bundle);
        }
        c(true);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
    }

    public i onCreateLoader(int i1, Bundle bundle)
    {
        return new a(getActivity(), bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f040045, viewgroup, false);
        l = new b();
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        l.a();
        l = null;
    }

    public void onLoadFinished(i i1, Object obj)
    {
        a(i1, (List)obj);
    }

    public void onLoaderReset(i i1)
    {
    }

    public com.pandora.android.util.af.c v()
    {
        return com.pandora.android.util.af.c.P;
    }
}

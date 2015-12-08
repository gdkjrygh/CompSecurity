// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.media.f;
import android.support.v7.media.g;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.util.Comparator;
import java.util.List;

// Referenced classes of package android.support.v7.app:
//            s

public class n extends Dialog
{
    private final class a extends android.support.v7.media.g.a
    {

        final n a;

        public void a(g g1, android.support.v7.media.g.f f1)
        {
            a.a();
        }

        public void b(g g1, android.support.v7.media.g.f f1)
        {
            a.a();
        }

        public void c(g g1, android.support.v7.media.g.f f1)
        {
            a.a();
        }

        public void d(g g1, android.support.v7.media.g.f f1)
        {
            a.dismiss();
        }

        private a()
        {
            a = n.this;
            super();
        }

    }

    private final class b extends ArrayAdapter
        implements android.widget.AdapterView.OnItemClickListener
    {

        final n a;
        private final LayoutInflater b;

        public void a()
        {
            clear();
            List list = n.a(a).a();
            int j = list.size();
            for (int i = 0; i < j; i++)
            {
                android.support.v7.media.g.f f1 = (android.support.v7.media.g.f)list.get(i);
                if (a.a(f1))
                {
                    add(f1);
                }
            }

            sort(c.a);
            notifyDataSetChanged();
        }

        public boolean areAllItemsEnabled()
        {
            return false;
        }

        public View getView(int i, View view, ViewGroup viewgroup)
        {
            View view1 = view;
            if (view == null)
            {
                view1 = b.inflate(android.support.v7.mediarouter.R.layout.mr_media_route_list_item, viewgroup, false);
            }
            view = (android.support.v7.media.g.f)getItem(i);
            Object obj = (TextView)view1.findViewById(0x1020014);
            viewgroup = (TextView)view1.findViewById(0x1020015);
            ((TextView) (obj)).setText(view.b());
            obj = view.c();
            if (TextUtils.isEmpty(((CharSequence) (obj))))
            {
                viewgroup.setVisibility(8);
                viewgroup.setText("");
            } else
            {
                viewgroup.setVisibility(0);
                viewgroup.setText(((CharSequence) (obj)));
            }
            view1.setEnabled(view.d());
            return view1;
        }

        public boolean isEnabled(int i)
        {
            return ((android.support.v7.media.g.f)getItem(i)).d();
        }

        public void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            adapterview = (android.support.v7.media.g.f)getItem(i);
            if (adapterview.d())
            {
                adapterview.n();
                a.dismiss();
            }
        }

        public b(Context context)
        {
            a = n.this;
            super(context, 0);
            b = LayoutInflater.from(context);
        }
    }

    private static final class c
        implements Comparator
    {

        public static final c a = new c();

        public int a(android.support.v7.media.g.f f1, android.support.v7.media.g.f f2)
        {
            return f1.b().compareTo(f2.b());
        }

        public int compare(Object obj, Object obj1)
        {
            return a((android.support.v7.media.g.f)obj, (android.support.v7.media.g.f)obj1);
        }


        private c()
        {
        }
    }


    private final g a;
    private final a b;
    private f c;
    private b d;
    private ListView e;
    private boolean f;

    public n(Context context)
    {
        this(context, 0);
    }

    public n(Context context, int i)
    {
        super(s.a(context, true), i);
        c = f.a;
        a = g.a(getContext());
        b = new a();
    }

    static g a(n n1)
    {
        return n1.a;
    }

    public void a()
    {
        if (f)
        {
            d.a();
        }
    }

    public void a(f f1)
    {
        if (f1 == null)
        {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (!c.equals(f1))
        {
            c = f1;
            if (f)
            {
                a.a(b);
                a.a(f1, b, 1);
            }
            a();
        }
    }

    public boolean a(android.support.v7.media.g.f f1)
    {
        return !f1.g() && f1.d() && f1.a(c);
    }

    public void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        f = true;
        a.a(c, b, 1);
        a();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getWindow().requestFeature(3);
        setContentView(android.support.v7.mediarouter.R.layout.mr_media_route_chooser_dialog);
        setTitle(android.support.v7.mediarouter.R.string.mr_media_route_chooser_title);
        getWindow().setFeatureDrawableResource(3, s.a(getContext(), android.support.v7.mediarouter.R.attr.mediaRouteOffDrawable));
        d = new b(getContext());
        e = (ListView)findViewById(android.support.v7.mediarouter.R.id.media_route_list);
        e.setAdapter(d);
        e.setOnItemClickListener(d);
        e.setEmptyView(findViewById(0x1020004));
    }

    public void onDetachedFromWindow()
    {
        f = false;
        a.a(b);
        super.onDetachedFromWindow();
    }
}

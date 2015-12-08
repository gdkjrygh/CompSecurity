// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.kik.e.a;
import com.kik.g.f;
import com.kik.view.adapters.bb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kik.a.a.b;
import kik.a.a.c;
import kik.android.util.cq;

// Referenced classes of package kik.android.chat.fragment:
//            KikScopedDialogFragment, c, a

public class AbTestsFragment extends KikScopedDialogFragment
{
    private final class a extends BaseAdapter
    {

        final AbTestsFragment a;
        private final LayoutInflater b;

        public final int getCount()
        {
            return 1;
        }

        public final Object getItem(int j)
        {
            return null;
        }

        public final long getItemId(int j)
        {
            return 0L;
        }

        public final View getView(int j, View view, ViewGroup viewgroup)
        {
            View view1;
            if (view == null)
            {
                view1 = b.inflate(0x7f030088, viewgroup, false);
                view = a. new d((byte)0);
                view.a = (TextView)view1.findViewById(0x1020016);
                view.b = (TextView)view1.findViewById(0x1020010);
                viewgroup = view;
            } else
            {
                viewgroup = (d)view.getTag();
                view1 = view;
            }
            ((d) (viewgroup)).a.setText("Force refetch");
            ((d) (viewgroup)).b.setText(cq.a(a.a.a(), false).a);
            view1.setTag(viewgroup);
            return view1;
        }

        public a(Context context)
        {
            a = AbTestsFragment.this;
            super();
            b = LayoutInflater.from(context);
        }
    }

    private final class b extends BaseAdapter
    {

        final AbTestsFragment a;
        private final LayoutInflater b;

        private kik.a.a.a a(int j)
        {
            ArrayList arraylist = kik.android.chat.fragment.AbTestsFragment.c(a);
            if (j >= 0 && j < arraylist.size())
            {
                return (kik.a.a.a)arraylist.get(j);
            } else
            {
                return null;
            }
        }

        public final int getCount()
        {
            return kik.android.chat.fragment.AbTestsFragment.c(a).size();
        }

        public final Object getItem(int j)
        {
            return a(j);
        }

        public final long getItemId(int j)
        {
            return 0L;
        }

        public final View getView(int j, View view, ViewGroup viewgroup)
        {
            kik.a.a.a a1;
            if (view == null)
            {
                view = b.inflate(0x7f030088, viewgroup, false);
                viewgroup = a. new d((byte)0);
                viewgroup.a = (TextView)view.findViewById(0x1020016);
                viewgroup.b = (TextView)view.findViewById(0x1020010);
            } else
            {
                viewgroup = (d)view.getTag();
            }
            a1 = a(j);
            ((d) (viewgroup)).a.setText(a1.a());
            ((d) (viewgroup)).b.setText(a1.b());
            view.setTag(viewgroup);
            return view;
        }

        public b(Context context)
        {
            a = AbTestsFragment.this;
            super();
            b = LayoutInflater.from(context);
        }
    }

    private final class c extends BaseAdapter
    {

        final AbTestsFragment a;
        private final LayoutInflater b;

        private kik.a.a.b a(int j)
        {
            ArrayList arraylist = AbTestsFragment.e(a);
            if (j >= 0 && j < arraylist.size())
            {
                return (kik.a.a.b)arraylist.get(j);
            } else
            {
                return null;
            }
        }

        public final int getCount()
        {
            return AbTestsFragment.e(a).size();
        }

        public final Object getItem(int j)
        {
            return a(j);
        }

        public final long getItemId(int j)
        {
            return 0L;
        }

        public final View getView(int j, View view, ViewGroup viewgroup)
        {
            kik.a.a.b b1;
            if (view == null)
            {
                view = b.inflate(0x7f030088, viewgroup, false);
                viewgroup = a. new d((byte)0);
                viewgroup.a = (TextView)view.findViewById(0x1020016);
                viewgroup.b = (TextView)view.findViewById(0x1020010);
            } else
            {
                viewgroup = (d)view.getTag();
            }
            b1 = a(j);
            ((d) (viewgroup)).a.setText(b1.a());
            ((d) (viewgroup)).b.setText(String.format("%s variants", new Object[] {
                Integer.valueOf(b1.b().length)
            }));
            view.setTag(viewgroup);
            return view;
        }

        public c(Context context)
        {
            a = AbTestsFragment.this;
            super();
            b = LayoutInflater.from(context);
        }
    }

    private final class d
    {

        public TextView a;
        public TextView b;
        final AbTestsFragment c;

        private d()
        {
            c = AbTestsFragment.this;
            super();
        }

        d(byte byte0)
        {
            this();
        }
    }

    private final class e extends BaseAdapter
    {

        final AbTestsFragment a;
        private final LayoutInflater b;

        private kik.a.a.a a(int j)
        {
            ArrayList arraylist = AbTestsFragment.d(a);
            if (j >= 0 && j < arraylist.size())
            {
                return (kik.a.a.a)arraylist.get(j);
            } else
            {
                return null;
            }
        }

        public final int getCount()
        {
            return AbTestsFragment.d(a).size();
        }

        public final Object getItem(int j)
        {
            return a(j);
        }

        public final long getItemId(int j)
        {
            return 0L;
        }

        public final View getView(int j, View view, ViewGroup viewgroup)
        {
            kik.a.a.a a1;
            if (view == null)
            {
                view = b.inflate(0x7f030088, viewgroup, false);
                viewgroup = a. new d((byte)0);
                viewgroup.a = (TextView)view.findViewById(0x1020016);
                viewgroup.b = (TextView)view.findViewById(0x1020010);
            } else
            {
                viewgroup = (d)view.getTag();
            }
            a1 = a(j);
            ((d) (viewgroup)).a.setText(a1.a());
            ((d) (viewgroup)).b.setText(a1.b());
            view.setTag(viewgroup);
            return view;
        }

        public e(Context context)
        {
            a = AbTestsFragment.this;
            super();
            b = LayoutInflater.from(context);
        }
    }

    public static final class f extends com.kik.ui.fragment.FragmentBase.a
    {

        public f()
        {
        }
    }


    protected ListView _testsList;
    protected TextView _title;
    protected kik.a.a.c a;
    private b b;
    private e c;
    private c d;
    private a e;
    private bb f;
    private ArrayList g;
    private ArrayList h;
    private ArrayList i;

    public AbTestsFragment()
    {
    }

    static bb a(AbTestsFragment abtestsfragment)
    {
        return abtestsfragment.f;
    }

    private void a()
    {
        g = new ArrayList(a.c());
        h = new ArrayList(a.e());
        i = new ArrayList(a.b().size());
        Iterator iterator = a.b().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            kik.a.a.b b1 = (kik.a.a.b)iterator.next();
            if (!a.b(b1.a()))
            {
                i.add(b1);
            }
        } while (true);
    }

    static void b(AbTestsFragment abtestsfragment)
    {
        abtestsfragment.a();
    }

    static ArrayList c(AbTestsFragment abtestsfragment)
    {
        return abtestsfragment.g;
    }

    static ArrayList d(AbTestsFragment abtestsfragment)
    {
        return abtestsfragment.h;
    }

    static ArrayList e(AbTestsFragment abtestsfragment)
    {
        return abtestsfragment.i;
    }

    protected final void a(com.kik.g.f f1)
    {
        super.a(f1);
        f1.a(a.f(), new kik.android.chat.fragment.c(this));
    }

    public void onCreate(Bundle bundle)
    {
        V().a(this);
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.onCreateView(layoutinflater, viewgroup, bundle);
        layoutinflater = layoutinflater.inflate(0x7f030000, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        a();
        f = new bb(getActivity());
        b = new b(getActivity());
        c = new e(getActivity());
        d = new c(getActivity());
        e = new a(getActivity());
        f.c("Assigned Experiments", b);
        f.c("Overridden Experiments", c);
        f.c("Available Experiments", d);
        f.c("Misc", e);
        _testsList.setAdapter(f);
        _testsList.setOnItemClickListener(new kik.android.chat.fragment.a(this));
        _title.setText("A/B Tests");
        return layoutinflater;
    }
}

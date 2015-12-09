// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.n;
import android.support.v4.content.i;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckedTextView;
import android.widget.ListView;
import com.pandora.android.provider.b;
import com.pandora.android.util.ShuffleListItem;
import com.pandora.android.util.s;
import com.pandora.radio.data.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import p.cd.a;
import p.cm.ak;

// Referenced classes of package p.ca:
//            m

public class am extends m
    implements android.support.v4.app.n.a
{
    private static class a extends BaseAdapter
    {

        private final LayoutInflater a;
        private final ArrayList b;
        private final String c;

        public int getCount()
        {
            return b.size();
        }

        public Object getItem(int i1)
        {
            return b.get(i1);
        }

        public long getItemId(int i1)
        {
            return (long)i1;
        }

        public View getView(int i1, View view, ViewGroup viewgroup)
        {
            viewgroup = view;
            if (view == null)
            {
                viewgroup = a.inflate(0x7f040094, null);
            }
            CheckedTextView checkedtextview = (CheckedTextView)viewgroup.findViewById(0x7f10026f);
            ShuffleListItem shufflelistitem = (ShuffleListItem)b.get(i1);
            checkedtextview.setChecked(shufflelistitem.a());
            view = shufflelistitem.c();
            if (shufflelistitem.d())
            {
                view = c;
            }
            checkedtextview.setText(view);
            float f1;
            boolean flag;
            if (!shufflelistitem.e())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            checkedtextview.setEnabled(flag);
            view = com.pandora.android.provider.b.a.h().getResources();
            if (shufflelistitem.e())
            {
                i1 = 0x7f0b009b;
            } else
            {
                i1 = 0x7f0b009c;
            }
            checkedtextview.setTextColor(view.getColor(i1));
            view = (android.view.ViewGroup.MarginLayoutParams)checkedtextview.getLayoutParams();
            if (shufflelistitem.d())
            {
                f1 = 16F;
            } else
            {
                f1 = 38F;
            }
            view.setMargins(s.a(f1), ((android.view.ViewGroup.MarginLayoutParams) (view)).topMargin, ((android.view.ViewGroup.MarginLayoutParams) (view)).rightMargin, ((android.view.ViewGroup.MarginLayoutParams) (view)).bottomMargin);
            checkedtextview.setLayoutParams(view);
            return viewgroup;
        }

        public a(Context context, ArrayList arraylist)
        {
            a = LayoutInflater.from(context);
            b = arraylist;
            c = context.getString(0x7f08022b);
        }
    }

    private static class b
    {

        public ArrayList a;
        public boolean b;

        b(ArrayList arraylist, boolean flag)
        {
            a = arraylist;
            b = flag;
        }
    }

    private class c
    {

        final am a;
        private ArrayList b;
        private boolean c;
        private boolean d;

        static ArrayList a(c c1)
        {
            return c1.b;
        }

        static boolean b(c c1)
        {
            return c1.c;
        }

        static boolean c(c c1)
        {
            return c1.d;
        }

        private boolean d()
        {
            return c == d;
        }

        public void a(ShuffleListItem shufflelistitem)
        {
            if (shufflelistitem.d())
            {
                return;
            }
            String s1 = shufflelistitem.b();
            for (Iterator iterator = b.iterator(); iterator.hasNext();)
            {
                ShuffleListItem shufflelistitem1 = (ShuffleListItem)iterator.next();
                if (s1.equals(shufflelistitem1.b()))
                {
                    b.remove(shufflelistitem1);
                    return;
                }
            }

            b.add(shufflelistitem);
        }

        public boolean a()
        {
            while (d() && b.size() == 0 || b.size() <= 0) 
            {
                return false;
            }
            return true;
        }

        public void b()
        {
            b.clear();
        }

        public void c()
        {
            boolean flag;
            Iterator iterator;
            ShuffleListItem shufflelistitem;
            String s1;
            Iterator iterator1;
            ShuffleListItem shufflelistitem1;
            boolean flag1;
            if (!d)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            d = flag1;
            iterator = p.ca.am.a(a).iterator();
            if (!iterator.hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
            shufflelistitem = (ShuffleListItem)iterator.next();
            s1 = shufflelistitem.b();
            iterator1 = b.iterator();
            do
            {
                if (!iterator1.hasNext())
                {
                    break MISSING_BLOCK_LABEL_131;
                }
                shufflelistitem1 = (ShuffleListItem)iterator1.next();
            } while (!s1.equals(shufflelistitem1.b()));
            b.remove(shufflelistitem1);
            flag = true;
_L4:
            if (!flag)
            {
                b.add(shufflelistitem);
            }
            if (true) goto _L2; else goto _L1
_L2:
            break MISSING_BLOCK_LABEL_27;
_L1:
            return;
            flag = false;
            if (true) goto _L4; else goto _L3
_L3:
        }

        public c(ArrayList arraylist, boolean flag, boolean flag1)
        {
            a = am.this;
            super();
            b = arraylist;
            c = flag;
            d = flag1;
        }

        public c(boolean flag)
        {
            a = am.this;
            super();
            b = new ArrayList();
            d = flag;
            c = flag;
        }
    }


    private String j;
    private a k;
    private c l;
    private ArrayList m;
    private String n;

    public am()
    {
    }

    static ArrayList a(am am1)
    {
        return am1.m;
    }

    public static am a(String s1, String s2)
    {
        am am1 = new am();
        a(s1, s2, am1);
        return am1;
    }

    protected static void a(String s1, String s2, am am1)
    {
        Bundle bundle = new Bundle();
        bundle.putString("intent_title", s1);
        bundle.putString("intent_station_list_sort_order", s2);
        am1.setArguments(bundle);
    }

    private void a(List list)
    {
        a(b(list), ((c) (null)));
    }

    private void a(b b1, c c1)
    {
        m = b1.a;
        boolean flag = b1.b;
        if (m.size() > 0)
        {
            ((ShuffleListItem)m.get(0)).a(flag);
        }
        if (c1 != null)
        {
            l = c1;
        } else
        {
            l = new c(flag);
        }
        k = new a(getActivity(), m);
        a(((android.widget.ListAdapter) (k)));
        a(true);
    }

    private boolean a(String s1, String as[])
    {
        boolean flag1 = false;
        if (as != null)
        {
            int j1 = as.length;
            int i1 = 0;
            do
            {
label0:
                {
                    boolean flag = flag1;
                    if (i1 < j1)
                    {
                        if (!as[i1].equals(s1))
                        {
                            break label0;
                        }
                        flag = true;
                    }
                    return flag;
                }
                i1++;
            } while (true);
        } else
        {
            throw new IllegalArgumentException("station token parameter cannot be null");
        }
    }

    private b b(List list)
    {
        Object obj;
        ArrayList arraylist;
        boolean flag2;
        flag2 = true;
        arraylist = new ArrayList();
        obj = list.iterator();
_L4:
        if (!((Iterator) (obj)).hasNext()) goto _L2; else goto _L1
_L1:
        y y1 = (y)((Iterator) (obj)).next();
        if (!y1.s()) goto _L4; else goto _L3
_L3:
        obj = y1.p();
_L6:
        boolean flag1 = flag2;
        if (obj != null)
        {
            flag1 = flag2;
            if (!s.a(((String) (obj))))
            {
                obj = ((String) (obj)).split("[, ]");
                list = list.iterator();
                flag1 = true;
                do
                {
                    if (!list.hasNext())
                    {
                        break;
                    }
                    y y2 = (y)list.next();
                    String s1 = y2.c();
                    boolean flag3 = a(s1, ((String []) (obj)));
                    boolean flag;
                    if (y2.k() && y2.j())
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    if (!flag)
                    {
                        arraylist.add(new ShuffleListItem(s1, y2.d(), flag3, y2.j(), y2.A()));
                        if (!flag3 && !y2.j() && !y2.A())
                        {
                            flag1 = false;
                        }
                    }
                } while (true);
            }
        }
        return new b(arraylist, flag1);
_L2:
        obj = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void c(boolean flag)
    {
        Iterator iterator = m.iterator();
        while (iterator.hasNext()) 
        {
            ShuffleListItem shufflelistitem = (ShuffleListItem)iterator.next();
            boolean flag1;
            if (flag && !shufflelistitem.e())
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            shufflelistitem.a(flag1);
        }
    }

    private void d(boolean flag)
    {
        int j1 = k.getCount();
        int i1 = 0;
        do
        {
label0:
            {
                if (i1 < j1)
                {
                    ShuffleListItem shufflelistitem = (ShuffleListItem)k.getItem(i1);
                    if (!shufflelistitem.d())
                    {
                        break label0;
                    }
                    if (shufflelistitem.a() != flag)
                    {
                        l.c();
                    }
                    shufflelistitem.a(flag);
                }
                return;
            }
            i1++;
        } while (true);
    }

    private boolean f()
    {
        if (m == null)
        {
            return false;
        }
        for (Iterator iterator = m.iterator(); iterator.hasNext();)
        {
            ShuffleListItem shufflelistitem = (ShuffleListItem)iterator.next();
            if (!shufflelistitem.d() && !shufflelistitem.e() && !shufflelistitem.a())
            {
                return false;
            }
        }

        return true;
    }

    private boolean g()
    {
        if (m == null)
        {
            return false;
        }
        for (Iterator iterator = m.iterator(); iterator.hasNext();)
        {
            ShuffleListItem shufflelistitem = (ShuffleListItem)iterator.next();
            if (!shufflelistitem.d() && shufflelistitem.a())
            {
                return true;
            }
        }

        return false;
    }

    private void h()
    {
        if (l.a())
        {
            JSONArray jsonarray = new JSONArray();
            Iterator iterator = m.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                ShuffleListItem shufflelistitem = (ShuffleListItem)iterator.next();
                if (shufflelistitem.a())
                {
                    jsonarray.put(shufflelistitem.b());
                }
            } while (true);
            (new ak()).execute(new Object[] {
                getActivity(), ((ShuffleListItem)m.get(0)).b(), j, jsonarray
            });
            l.b();
        }
    }

    public void a(i i1, List list)
    {
        a(list);
    }

    public void a(ListView listview, View view, int i1, long l1)
    {
        listview = (CheckedTextView)view.findViewById(0x7f10026f);
        listview.toggle();
        boolean flag1 = listview.isChecked();
        listview = (ShuffleListItem)k.getItem(i1);
        boolean flag;
        if (flag1 && !listview.e())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        listview.a(flag);
        if (listview.d())
        {
            c(flag1);
            l.c();
        } else
        {
            l.a(listview);
            d(f());
        }
        k.notifyDataSetChanged();
    }

    public boolean a()
    {
        return false;
    }

    public boolean c()
    {
        if (!g())
        {
            s.a(getActivity(), getString(0x7f080178), false);
            return true;
        } else
        {
            h();
            return e();
        }
    }

    public CharSequence d()
    {
        return n;
    }

    protected boolean e()
    {
        return false;
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        a(getString(0x7f080177));
        setHasOptionsMenu(true);
        if (bundle != null && bundle.containsKey("ALL_SHUFFLE_STATIONS"))
        {
            ArrayList arraylist = bundle.getParcelableArrayList("ALL_SHUFFLE_STATIONS");
            ArrayList arraylist1 = bundle.getParcelableArrayList("SELECTED_STATIONS");
            boolean flag = bundle.getBoolean("SELECT_ALL_ORIGINAL_STATE");
            boolean flag1 = bundle.getBoolean("SELECT_ALL_CURRENT_STATE");
            a(new b(arraylist, flag1), new c(arraylist1, flag, flag1));
            return;
        } else
        {
            getLoaderManager().a(0, new Bundle(), this).startLoading();
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        n = getArguments().getString("intent_title");
        j = getArguments().getString("intent_station_list_sort_order");
    }

    public i onCreateLoader(int i1, Bundle bundle)
    {
        return new p.cd.a(getActivity(), com.pandora.android.provider.b.a.b(), j);
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        if (g() && !s.u())
        {
            h();
        }
    }

    public void onLoadFinished(i i1, Object obj)
    {
        a(i1, (List)obj);
    }

    public void onLoaderReset(i i1)
    {
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putParcelableArrayList("ALL_SHUFFLE_STATIONS", m);
        bundle.putParcelableArrayList("SELECTED_STATIONS", p.ca.c.a(l));
        bundle.putBoolean("SELECT_ALL_ORIGINAL_STATE", p.ca.c.b(l));
        bundle.putBoolean("SELECT_ALL_CURRENT_STATE", c.c(l));
    }

    public com.pandora.android.util.af.c v()
    {
        return com.pandora.android.util.af.c.W;
    }
}

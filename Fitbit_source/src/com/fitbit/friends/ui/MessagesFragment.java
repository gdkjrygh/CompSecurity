// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.friends.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.fitbit.data.bl.ah;
import com.fitbit.data.bl.cw;
import com.fitbit.data.bl.dl;
import com.fitbit.data.bl.s;
import com.fitbit.data.domain.Entity;
import com.fitbit.data.domain.Notification;
import com.fitbit.data.domain.RankedUser;
import com.fitbit.e.a;
import com.fitbit.home.ui.i;
import com.fitbit.mixpanel.MixPanelTrackingHelper;
import com.fitbit.savedstate.LoadSavedState;
import com.fitbit.settings.ui.ProfileActivity;
import com.fitbit.settings.ui.UserInformationFragment;
import com.fitbit.ui.fragments.FitbitFragment;
import com.fitbit.ui.loadable.LoadablePicassoImageView;
import com.fitbit.util.az;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import se.emilsjolander.stickylistheaders.StickyListHeadersListView;
import se.emilsjolander.stickylistheaders.h;

// Referenced classes of package com.fitbit.friends.ui:
//            ConversationActivity, b

public class MessagesFragment extends FitbitFragment
    implements android.support.v4.app.LoaderManager.LoaderCallbacks, android.widget.AdapterView.OnItemClickListener
{
    private static class a
    {

        private final LoadablePicassoImageView a;
        private final TextView b;
        private final TextView c;
        private final TextView d;
        private final TextView e;

        static LoadablePicassoImageView a(a a1)
        {
            return a1.a;
        }

        static TextView b(a a1)
        {
            return a1.e;
        }

        static TextView c(a a1)
        {
            return a1.b;
        }

        static TextView d(a a1)
        {
            return a1.c;
        }

        static TextView e(a a1)
        {
            return a1.d;
        }

        private a(View view)
        {
            a = (LoadablePicassoImageView)view.findViewById(0x7f1100be);
            b = (TextView)view.findViewById(0x7f11011f);
            c = (TextView)view.findViewById(0x7f1100c1);
            d = (TextView)view.findViewById(0x7f1102b5);
            e = (TextView)view.findViewById(0x7f110370);
        }

    }

    private static class b extends BaseAdapter
        implements h
    {

        private List a;
        private List b;
        private i c;
        private Context d;
        private boolean e;

        static Context a(b b1)
        {
            return b1.d;
        }

        public long a(int i1)
        {
            return i1 >= b.size() ? 0x7f08031fL : 0x7f0802faL;
        }

        public View a(int i1, View view, ViewGroup viewgroup)
        {
            View view1 = view;
            if (view == null)
            {
                view1 = View.inflate(viewgroup.getContext(), 0x7f04018e, null);
            }
            if (e)
            {
                return View.inflate(viewgroup.getContext(), 0x7f0401d3, null);
            } else
            {
                ((TextView)view1.findViewById(0x7f1103b4)).setText((int)a(i1));
                return view1;
            }
        }

        public void a(List list, List list1)
        {
            a = list;
            b = list1;
            notifyDataSetChanged();
        }

        public void a(boolean flag)
        {
            e = flag;
        }

        public Entity b(int i1)
        {
            if (i1 < b.size())
            {
                return (Entity)b.get(i1);
            } else
            {
                return (Entity)a.get(i1 - b.size());
            }
        }

        public int getCount()
        {
            return b.size() + a.size();
        }

        public Object getItem(int i1)
        {
            return b(i1);
        }

        public long getItemId(int i1)
        {
            return b(i1).getServerId();
        }

        public View getView(int i1, View view, ViewGroup viewgroup)
        {
            Object obj;
            viewgroup = view;
            if (view == null)
            {
                viewgroup = View.inflate(d, 0x7f040102, null);
                viewgroup.setTag(0x7f11001e, new a(viewgroup));
            }
            view = (a)viewgroup.getTag(0x7f11001e);
            obj = b(i1);
            if (!(obj instanceof Notification)) goto _L2; else goto _L1
_L1:
            obj = (Notification)obj;
            try
            {
                com.fitbit.friends.ui.a.a(view).a(((Notification) (obj)).e());
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                com.fitbit.friends.ui.a.a(view).a(null);
            }
            a.b(view).setVisibility(8);
            if (((Notification) (obj)).b() != com.fitbit.data.domain.Notification.NotificationType.MESSAGE) goto _L4; else goto _L3
_L3:
            a.c(view).setText(d.getString(0x7f0803cf, new Object[] {
                ((Notification) (obj)).f()
            }));
            a.d(view).setText(((Notification) (obj)).d());
            a.d(view).setVisibility(0);
_L8:
            com.fitbit.friends.ui.a.a(view).setOnClickListener(new android.view.View.OnClickListener(this, ((Notification) (obj))) {

                final Notification a;
                final b b;

                public void onClick(View view)
                {
                    com.fitbit.friends.ui.b.a(b).startActivity(ProfileActivity.a(com.fitbit.friends.ui.b.a(b), a.g()));
                }

            
            {
                b = b1;
                a = notification;
                super();
            }
            });
            a.e(view).setText(c.a(((Notification) (obj)).getTimeCreated(), d));
_L6:
            return viewgroup;
_L4:
            if (((Notification) (obj)).b() == com.fitbit.data.domain.Notification.NotificationType.CORPORATE)
            {
                a.c(view).setText(((Notification) (obj)).f());
                a.d(view).setText(((Notification) (obj)).d());
                a.d(view).setVisibility(0);
                if (!TextUtils.isEmpty(((Notification) (obj)).i()))
                {
                    a.b(view).setText(((Notification) (obj)).i());
                    a.b(view).setVisibility(0);
                }
            } else
            {
                a.c(view).setText(((Notification) (obj)).d());
                a.d(view).setVisibility(8);
            }
            continue; /* Loop/switch isn't completed */
_L2:
            if (!(obj instanceof RankedUser)) goto _L6; else goto _L5
_L5:
            obj = (RankedUser)obj;
            try
            {
                com.fitbit.friends.ui.a.a(view).a(((RankedUser) (obj)).G());
            }
            catch (IllegalArgumentException illegalargumentexception1)
            {
                com.fitbit.friends.ui.a.a(view).a(null);
            }
            a.c(view).setText(((RankedUser) (obj)).P());
            a.d(view).setVisibility(8);
            a.e(view).setText(UserInformationFragment.a(((com.fitbit.data.domain.User) (obj))));
            com.fitbit.friends.ui.a.a(view).setOnClickListener(null);
            com.fitbit.friends.ui.a.a(view).setClickable(false);
            return viewgroup;
            if (true) goto _L8; else goto _L7
_L7:
        }

        public b(Context context)
        {
            c = new i();
            e = false;
            d = context;
            a = Collections.emptyList();
            b = Collections.emptyList();
        }
    }

    private static class c extends az
    {

        protected boolean a(String s1)
        {
            return s1.equals(s.a(getContext()).a());
        }

        protected Intent[] a()
        {
            return (new Intent[] {
                dl.a(getContext(), true, true), cw.a(getContext(), true)
            });
        }

        protected void b()
        {
            s.a(getContext()).a(this);
        }

        protected void d()
        {
            s.a(getContext()).b(this);
        }

        public d e()
        {
            d d1 = new d();
            com.fitbit.friends.ui.d.a(d1, ah.a().b());
            d.b(d1, s.a(getContext()).d());
            com.fitbit.friends.ui.d.a(d1, ah.a().d());
            return d1;
        }

        public Object f_()
        {
            return e();
        }

        public c(Context context)
        {
            super(context, dl.d());
        }
    }

    static class d
    {

        private List a;
        private List b;
        private boolean c;

        static List a(d d1)
        {
            return d1.b;
        }

        static List a(d d1, List list)
        {
            d1.a = list;
            return list;
        }

        static boolean a(d d1, boolean flag)
        {
            d1.c = flag;
            return flag;
        }

        static List b(d d1, List list)
        {
            d1.b = list;
            return list;
        }

        static boolean b(d d1)
        {
            return d1.c;
        }

        static List c(d d1)
        {
            return d1.a;
        }

        d()
        {
            a = new ArrayList();
            b = new ArrayList();
        }
    }


    private static final String a = "MessagesFragment";
    private static final String b = "Notifications";
    private static final int c = 301;
    private static final int d = 302;
    private static final int e = 303;
    private static final int f = 304;
    private StickyListHeadersListView g;
    private View h;
    private View i;
    private View j;
    private View k;
    private View l;
    private View m;
    private String n;
    private boolean o;

    public MessagesFragment()
    {
    }

    static MessagesFragment a()
    {
        MessagesFragment messagesfragment = new MessagesFragment();
        messagesfragment.setArguments(new Bundle());
        return messagesfragment;
    }

    private void a(View view)
    {
        if (g.b().isEmpty())
        {
            Notification notification = new Notification();
            view = s.a(view.getContext()).b(n);
            notification.d(n);
            notification.c(view.P());
            notification.b(view.G());
            notification.setEntityId(Long.valueOf(1L));
            view = notification;
        } else
        {
            view = (Notification)g.l(0);
        }
        a(((Notification) (view)));
    }

    private void a(Notification notification)
    {
        com.fitbit.friends.ui.ConversationActivity.a(getActivity(), notification.g(), notification.f(), notification.e(), "Notifications");
    }

    static void a(MessagesFragment messagesfragment)
    {
        messagesfragment.d();
    }

    static void a(MessagesFragment messagesfragment, View view)
    {
        messagesfragment.a(view);
    }

    private void a(String s1, com.fitbit.data.domain.Message.MessageType messagetype, String s2, String s3)
    {
        (new com.fitbit.friends.ui.b(getActivity(), s3, s2, messagetype, s1, "Notifications")).e();
    }

    private void c()
    {
        g.a(new b(getActivity()));
        registerForContextMenu(g);
        g.a(this);
        getLoaderManager().restartLoader(144, null, this);
    }

    private void d()
    {
        l.setVisibility(0);
        m.setVisibility(8);
        getLoaderManager().restartLoader(0, null, this);
    }

    public void a(Loader loader, d d1)
    {
        int j1 = 1;
        com.fitbit.e.a.a("MessagesFragment", String.valueOf(com.fitbit.friends.ui.d.a(d1)), new Object[0]);
        int i1;
        if (o != d.b(d1))
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        o = d.b(d1);
        if (i1 != 0)
        {
            getActivity().supportInvalidateOptionsMenu();
        }
        i1 = g.getScrollY();
        loader = g.onSaveInstanceState();
        ((b)g.b()).a(d.c(d1), com.fitbit.friends.ui.d.a(d1));
        g.onRestoreInstanceState(loader);
        g.scrollTo(g.getScrollX(), i1);
        loader = LoadSavedState.a(com.fitbit.savedstate.LoadSavedState.DataType.b);
        if (com.fitbit.friends.ui.d.a(d1).size() == 0 && d.c(d1).size() == 0)
        {
            i1 = j1;
        } else
        {
            i1 = 0;
        }
        d1 = i;
        if (loader == com.fitbit.savedstate.LoadSavedState.Status.a)
        {
            j1 = 0;
        } else
        {
            j1 = 8;
        }
        d1.setVisibility(j1);
        d1 = j;
        if (loader == com.fitbit.savedstate.LoadSavedState.Status.b && i1 != 0)
        {
            j1 = 0;
        } else
        {
            j1 = 8;
        }
        d1.setVisibility(j1);
        d1 = g;
        if (loader == com.fitbit.savedstate.LoadSavedState.Status.b && i1 == 0)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        d1.setVisibility(i1);
        d1 = k;
        if (loader == com.fitbit.savedstate.LoadSavedState.Status.c)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        d1.setVisibility(i1);
        l.setVisibility(8);
        m.setVisibility(0);
    }

    protected void a(Entity entity, View view)
    {
        if (!(entity instanceof RankedUser)) goto _L2; else goto _L1
_L1:
        entity = (RankedUser)entity;
        startActivity(ProfileActivity.a(getActivity(), entity));
        MixPanelTrackingHelper.a();
_L4:
        return;
_L2:
        if (!(entity instanceof Notification)) goto _L4; else goto _L3
_L3:
        entity = (Notification)entity;
        static class _cls3
        {

            static final int a[];

            static 
            {
                a = new int[com.fitbit.data.domain.Notification.NotificationType.values().length];
                try
                {
                    a[com.fitbit.data.domain.Notification.NotificationType.CHEER.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.fitbit.data.domain.Notification.NotificationType.TAUNT.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.fitbit.data.domain.Notification.NotificationType.CORPORATE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        com.fitbit.friends.ui._cls3.a[entity.b().ordinal()];
        JVM INSTR tableswitch 1 3: default 76
    //                   1 89
    //                   2 89
    //                   3 27;
           goto _L5 _L6 _L6 _L7
_L7:
        break; /* Loop/switch isn't completed */
_L5:
        a(((Notification) (entity)));
          goto _L8
        if (true) goto _L4; else goto _L6
_L8:
        MixPanelTrackingHelper.a("show", entity);
        return;
_L6:
        g.j().showContextMenuForChild(view);
        if (true) goto _L8; else goto _L9
_L9:
    }

    public void a(d d1)
    {
        if (n != null)
        {
            if (g.n() == 0)
            {
                g.d(LayoutInflater.from(getActivity()).inflate(0x7f04014b, null));
            }
            ((b)g.b()).a(true);
            com.fitbit.friends.ui.d.a(d1).clear();
            h.setVisibility(0);
            d1 = d.c(d1).iterator();
            do
            {
                if (!d1.hasNext())
                {
                    break;
                }
                if (!((Notification)d1.next()).g().equals(n))
                {
                    d1.remove();
                }
            } while (true);
            g.x();
        }
    }

    public void a(String s1)
    {
        n = s1;
    }

    public boolean onContextItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() > 304 || menuitem.getItemId() < 301)
        {
            return false;
        }
        Object obj = (android.widget.AdapterView.AdapterContextMenuInfo)menuitem.getMenuInfo();
        String s1;
        RankedUser rankeduser;
        if (((android.widget.AdapterView.AdapterContextMenuInfo) (obj)).position >= 0 && ((android.widget.AdapterView.AdapterContextMenuInfo) (obj)).position < g.w())
        {
            obj = g.l(((android.widget.AdapterView.AdapterContextMenuInfo) (obj)).position);
        } else
        {
            obj = null;
        }
        if (obj != null && (obj instanceof Notification))
        {
            obj = (Notification)obj;
        } else
        {
            obj = null;
        }
        if (obj == null) goto _L2; else goto _L1
_L1:
        s1 = ((Notification) (obj)).g();
        rankeduser = s.a(getActivity()).b(s1);
        if (s1 != null)
        {
            if (rankeduser == null)
            {
                s1 = ((Notification) (obj)).f();
            } else
            {
                s1 = rankeduser.P();
            }
            if ((rankeduser == null || rankeduser.c() != com.fitbit.data.domain.RankedUser.Relation.FRIEND) && menuitem.getItemId() != 304)
            {
                com.fitbit.ui.s.a(getActivity(), getString(0x7f080563, new Object[] {
                    s1
                }), 0).i();
                return super.onContextItemSelected(menuitem);
            }
        } else
        {
            return super.onContextItemSelected(menuitem);
        }
        menuitem.getItemId();
        JVM INSTR tableswitch 301 304: default 232
    //                   301 238
    //                   302 256
    //                   303 274
    //                   304 281;
           goto _L2 _L3 _L4 _L5 _L6
_L2:
        return super.onContextItemSelected(menuitem);
_L3:
        a(null, com.fitbit.data.domain.Message.MessageType.CHEER, ((Notification) (obj)).f(), ((Notification) (obj)).g());
        return true;
_L4:
        a(null, com.fitbit.data.domain.Message.MessageType.TAUNT, ((Notification) (obj)).f(), ((Notification) (obj)).g());
        return true;
_L5:
        a(((Notification) (obj)));
        return true;
_L6:
        startActivity(ProfileActivity.b(getActivity(), rankeduser));
        return true;
    }

    public void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        if (view.equals(g.j()))
        {
            view = (android.widget.AdapterView.AdapterContextMenuInfo)contextmenuinfo;
            view = ((View) (g.l(((android.widget.AdapterView.AdapterContextMenuInfo) (view)).position)));
            if (view instanceof Notification)
            {
                view = (Notification)view;
                if (view.b() != com.fitbit.data.domain.Notification.NotificationType.CORPORATE)
                {
                    contextmenu.setHeaderTitle(view.f());
                    contextmenu.add(0, 301, 301, 0x7f0802cd);
                    contextmenu.add(0, 302, 302, 0x7f08035e);
                    contextmenu.add(0, 303, 303, 0x7f0805a4);
                    contextmenu.add(0, 304, 304, 0x7f080578);
                    MixPanelTrackingHelper.a("longPress", view);
                }
            }
        }
    }

    public Loader onCreateLoader(int i1, Bundle bundle)
    {
        return new c(getActivity());
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0400b7, viewgroup, false);
        g = (StickyListHeadersListView)layoutinflater.findViewById(0x7f110086);
        h = layoutinflater.findViewById(0x7f1102d7);
        i = layoutinflater.findViewById(0x7f11006b);
        j = layoutinflater.findViewById(0x7f1100ea);
        k = layoutinflater.findViewById(0x7f1100a4);
        l = layoutinflater.findViewById(0x7f11009b);
        m = layoutinflater.findViewById(0x7f1103d5);
        h.setOnClickListener(new android.view.View.OnClickListener() {

            final MessagesFragment a;

            public void onClick(View view)
            {
                com.fitbit.friends.ui.MessagesFragment.a(a, view);
            }

            
            {
                a = MessagesFragment.this;
                super();
            }
        });
        m.setOnClickListener(new android.view.View.OnClickListener() {

            final MessagesFragment a;

            public void onClick(View view)
            {
                com.fitbit.friends.ui.MessagesFragment.a(a);
            }

            
            {
                a = MessagesFragment.this;
                super();
            }
        });
        c();
        return layoutinflater;
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        adapterview = (Entity)g.l(i1);
        if (adapterview != null)
        {
            a(adapterview, view);
        }
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (d)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }
}

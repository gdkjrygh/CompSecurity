// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.kik.android.a;
import com.kik.g.o;
import com.kik.g.p;
import com.kik.l.ab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kik.a.d.f;
import kik.a.d.j;
import kik.a.d.k;
import kik.a.d.n;
import kik.a.e.i;
import kik.a.e.l;
import kik.a.e.r;
import kik.a.e.v;
import kik.a.z;
import kik.android.chat.KikApplication;
import kik.android.util.cq;
import kik.android.widget.cp;

// Referenced classes of package kik.android.chat.fragment:
//            KikIqFragmentBase, ae, aj, ak, 
//            al, am, an, ao, 
//            ap, af, ai, ah, 
//            aq, ProgressDialogFragment

public abstract class ConversationsBaseFragment extends KikIqFragmentBase
{

    private com.kik.g.i A;
    private com.kik.g.i B;
    private com.kik.g.i C;
    private com.kik.g.i D;
    protected i a;
    protected r b;
    protected v c;
    protected l d;
    protected kik.a.e.n e;
    protected a f;
    protected ab g;
    protected ProgressDialogFragment h;
    protected boolean i;
    protected ListView j;
    protected View k;
    private final int l = 2;
    private final int m = 3;
    private final int n = 4;
    private final int o = 5;
    private final Handler p = new ae(this);
    private f q;
    private ContextMenu r;
    private int s;
    private boolean t;
    private com.kik.g.i x;
    private com.kik.g.i y;
    private com.kik.g.i z;

    public ConversationsBaseFragment()
    {
        i = false;
        q = null;
        r = null;
        s = 0;
        t = false;
        x = new aj(this);
        y = new ak(this);
        z = new al(this);
        A = new am(this);
        B = new an(this);
        C = new ao(this);
        D = new ap(this);
    }

    static int a(ConversationsBaseFragment conversationsbasefragment, int i1)
    {
        conversationsbasefragment.s = i1;
        return i1;
    }

    static boolean a(ConversationsBaseFragment conversationsbasefragment)
    {
        return conversationsbasefragment.t;
    }

    static boolean b(ConversationsBaseFragment conversationsbasefragment)
    {
        conversationsbasefragment.t = true;
        return true;
    }

    static int c(ConversationsBaseFragment conversationsbasefragment)
    {
        return conversationsbasefragment.s;
    }

    static Handler d(ConversationsBaseFragment conversationsbasefragment)
    {
        return conversationsbasefragment.p;
    }

    public abstract int a();

    public final void a(int i1)
    {
        if (j != null)
        {
            int j1 = j.getFirstVisiblePosition();
            int k1 = j.getLastVisiblePosition();
            if (j1 > i1 || k1 < i1)
            {
                j1 = i1 - (k1 - j1) / 2;
                ListView listview = j;
                i1 = j1;
                if (j1 < 0)
                {
                    i1 = 0;
                }
                listview.setSelection(i1);
                return;
            }
        }
    }

    protected final void a(ContextMenu contextmenu, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        byte byte0 = 2;
        r = contextmenu;
        contextmenuinfo = (android.widget.AdapterView.AdapterContextMenuInfo)contextmenuinfo;
        q = (f)j.getAdapter().getItem(((android.widget.AdapterView.AdapterContextMenuInfo) (contextmenuinfo)).position);
        if (q == null)
        {
            return;
        }
        boolean flag = q.n();
        k k1 = b.a(q.b(), true);
        if ((k1 instanceof n) && k1.c() == null)
        {
            contextmenu.setHeaderTitle(cq.a((n)k1, b));
        } else
        {
            if (k1.c() == null)
            {
                contextmenuinfo = getString(0x7f090202);
            } else
            {
                contextmenuinfo = k1.c();
            }
            contextmenu.setHeaderTitle(contextmenuinfo);
        }
        if (k1 instanceof n)
        {
            contextmenu.add(0, 6, 0, 0x7f090018);
            if (a.a(q) == 2)
            {
                contextmenu.add(0, 0, 0, 0x7f0900f6);
                contextmenu.add(0, 4, 0, 0x7f0902a5);
                return;
            }
            int i1;
            if (!flag)
            {
                byte0 = 1;
            }
            if (flag)
            {
                i1 = 0x7f09001d;
            } else
            {
                i1 = 0x7f090019;
            }
            contextmenu.add(0, byte0, 0, i1);
            contextmenu.add(0, 4, 0, 0x7f0902a5);
            return;
        }
        contextmenu.add(0, 5, 0, 0x7f090017);
        if (k1.l())
        {
            byte byte1;
            int j1;
            if (flag)
            {
                byte1 = 2;
            } else
            {
                byte1 = 1;
            }
            if (flag)
            {
                j1 = 0x7f09001d;
            } else
            {
                j1 = 0x7f090019;
            }
            contextmenu.add(0, byte1, 0, j1);
            contextmenu.add(0, 4, 0, 0x7f0902a5);
            return;
        }
        if (!k1.a().a(kik.a.z.b(c).a()))
        {
            contextmenu.add(0, 3, 0, "Block and Report");
        }
        contextmenu.add(0, 0, 0, 0x7f0900f6);
        contextmenu.add(0, 4, 0, 0x7f0902a5);
    }

    protected void a(AbsListView abslistview, int i1, int j1, int k1)
    {
    }

    protected final void a(com.kik.g.f f1)
    {
        super.a(f1);
        f1.a(a.e(), z);
        f1.a(a.f(), z);
        f1.a(a.b(), D, new o());
        f1.a(a.c(), A);
        f1.a(a.d(), B);
        f1.a(a.i(), D, new o());
        f1.a(a.k(), D, new o());
        f1.a(c.c(), C, new o());
    }

    protected void a(f f1)
    {
        a(f1, false);
    }

    protected final void a(f f1, boolean flag)
    {
        if (f1 != null)
        {
            kik.android.chat.activity.k.a((new KikChatFragment.a()).a(f1, d).c(flag), getActivity()).f().a(new af(this, f1));
        }
    }

    protected final void b(com.kik.g.f f1)
    {
        super.b(f1);
        f1.a(b.c(), C, new o());
        f1.a(d.e(), C, new o());
        f1.a(a.b(), D, new o());
        f1.a(a.e(), y);
        f1.a(a.f(), y);
        f1.a(a.o(), x);
        f1.a(a.g(), C, new o());
        f1.a(a.h(), D, new o());
        f1.a(com.kik.android.c.f.c(), C, new o());
    }

    public abstract void b(f f1);

    public abstract void b(boolean flag);

    public boolean onContextItemSelected(MenuItem menuitem)
    {
        Object obj;
        Object obj1;
        obj = q;
        q = null;
        if (obj == null)
        {
            obj = (android.widget.AdapterView.AdapterContextMenuInfo)menuitem.getMenuInfo();
            if (j.getAdapter().getCount() <= ((android.widget.AdapterView.AdapterContextMenuInfo) (obj)).position)
            {
                return false;
            }
            obj = (f)j.getItemAtPosition(((android.widget.AdapterView.AdapterContextMenuInfo) (obj)).position);
        }
        obj1 = b.a(((f) (obj)).b(), true);
        menuitem.getItemId();
        JVM INSTR tableswitch 0 6: default 124
    //                   0 535
    //                   1 183
    //                   2 345
    //                   3 486
    //                   4 637
    //                   5 126
    //                   6 162;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        return true;
_L7:
        ((k) (obj1)).h(false);
        b.a(((k) (obj1)));
        a.b(((f) (obj)).b());
        b(false);
        continue; /* Loop/switch isn't completed */
_L8:
        a.c(((f) (obj)).b());
        b(false);
        continue; /* Loop/switch isn't completed */
_L3:
        if (!((f) (obj)).n())
        {
            KikDialogFragment.a a1 = new KikDialogFragment.a(k.getResources());
            String s1 = KikApplication.f(0x7f09016a);
            if (obj1 instanceof n)
            {
                menuitem = getString(0x7f09012c);
            } else
            {
                menuitem = cq.a(((k) (obj1)));
            }
            a1.a(String.format(s1, new Object[] {
                menuitem
            }));
            menuitem = new ArrayList();
            menuitem.add(KikApplication.f(0x7f090167));
            menuitem.add(KikApplication.f(0x7f090165));
            menuitem.add(KikApplication.f(0x7f090166));
            a1.a((CharSequence[])menuitem.toArray(new CharSequence[menuitem.size()]), new ai(this, ((k) (obj1)), ((f) (obj))));
            a(a1.a, KikScopedDialogFragment.a.b, "dialog");
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (((f) (obj)).n())
        {
            com.kik.android.a.f f1 = f.b("Unmuted").a("Is Verified", ((k) (obj1)).i()).a("Source", "Chat List");
            long l1;
            if (((f) (obj)).p() == -1L)
            {
                menuitem = "Forever";
            } else
            {
                menuitem = "Limited Time Duration";
            }
            menuitem = f1.a("Duration", menuitem).a("Is Group", obj1 instanceof n);
            if (obj1 instanceof n)
            {
                l1 = ((n)obj1).w().size();
            } else
            {
                l1 = 1L;
            }
            menuitem.a("Participants Count", l1).b();
            a.d(((f) (obj)).b());
            b(false);
        }
        continue; /* Loop/switch isn't completed */
_L5:
        a(((KikDialogFragment.a) (new cp(((k) (obj1)), ((f) (obj)).c(), k.getContext().getApplicationContext(), "Conversation List Screen", f, a))).a, KikScopedDialogFragment.a.b, "dialog");
        continue; /* Loop/switch isn't completed */
_L2:
        if (obj1 instanceof n)
        {
            menuitem = ((n)obj1).w().iterator();
            do
            {
                if (!menuitem.hasNext())
                {
                    break;
                }
                obj1 = (String)menuitem.next();
                obj1 = b.a(((String) (obj1)), true);
                if (!((k) (obj1)).l())
                {
                    b.a(((k) (obj1)).a());
                }
            } while (true);
        } else
        {
            b.a(((k) (obj1)).a());
        }
        w();
        a(((f) (obj)), true);
        continue; /* Loop/switch isn't completed */
_L6:
        menuitem = new KikChatInfoFragment.a();
        z z1 = kik.a.z.b(c);
        if (z1 != null && z1.a() != null && z1.a().a().equals(((k) (obj1)).b()))
        {
            menuitem.b();
        }
        menuitem.a(i);
        menuitem.d(((k) (obj1)).b());
        a(menuitem).a(new ah(this));
        if (true) goto _L1; else goto _L9
_L9:
    }

    public void onCreate(Bundle bundle)
    {
        V().a(this);
        super.onCreate(bundle);
    }

    public void onDestroy()
    {
        super.onDestroy();
    }

    public void onPause()
    {
        super.onPause();
        if (r != null)
        {
            r.close();
            r = null;
        }
        t = false;
    }

    public void onResume()
    {
        super.onResume();
        p.sendEmptyMessage(5);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        if (j == null)
        {
            throw new IllegalArgumentException("A conversation screen must have set the _conversationList during view creation");
        } else
        {
            j.setOnScrollListener(new aq(this));
            super.onViewCreated(view, bundle);
            return;
        }
    }

    public void onViewStateRestored(Bundle bundle)
    {
        super.onViewStateRestored(bundle);
        if (t)
        {
            if (j != null)
            {
                j.setSelection(0);
                j.requestFocus();
            }
            t = false;
        }
    }
}

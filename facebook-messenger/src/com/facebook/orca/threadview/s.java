// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.common.w.n;
import com.facebook.k;
import com.facebook.messages.model.threads.Message;
import com.facebook.widget.animatablelistview.q;

// Referenced classes of package com.facebook.orca.threadview:
//            aj, t, ReceiptItemView, ae, 
//            l, ad, ai, dp, 
//            d, ac, u, r

public class s
    implements q
{

    public static final ac a = new aj(1);
    public static final ac b = new aj(2);
    public static final ac c = new aj(3);
    private final Context d;
    private final LayoutInflater e;
    private u f;
    private final r g = new t(this);
    private boolean h;

    public s(Context context, LayoutInflater layoutinflater)
    {
        h = true;
        d = context;
        e = layoutinflater;
    }

    private View a(View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = e.inflate(k.orca_load_more_placeholder_footer, viewgroup, false);
        }
        return view1;
    }

    private View a(ac ac1, View view)
    {
        ReceiptItemView receiptitemview = (ReceiptItemView)view;
        view = receiptitemview;
        if (receiptitemview == null)
        {
            view = new ReceiptItemView(d);
        }
        view.setRowReceiptItem((ae)ac1);
        return view;
    }

    private View a(ac ac1, View view, boolean flag)
    {
        l l1 = (l)view;
        view = l1;
        if (l1 == null)
        {
            view = new l(d, flag);
            view.setCanOpenMessagePermalink(h);
        }
        view.setListener(g);
        view.setRowMessageItem((ad)ac1);
        return view;
    }

    static u a(s s1)
    {
        return s1.f;
    }

    private View b(View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = e.inflate(k.orca_load_more_footer, viewgroup, false);
        }
        return view1;
    }

    private View b(ac ac1, View view)
    {
        ai ai1 = (ai)ac1;
        view = (dp)view;
        ac1 = view;
        if (view == null)
        {
            ac1 = new dp(d);
        }
        ac1.setTypingItem(ai1);
        return ac1;
    }

    private View c(View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = e.inflate(k.orca_loading_footer, viewgroup, false);
        }
        return view1;
    }

    private View c(ac ac1, View view)
    {
        d d1 = (d)view;
        view = d1;
        if (d1 == null)
        {
            view = new d(d);
        }
        view.setMessage(((ad)ac1).b());
        return view;
    }

    public int a()
    {
        return 24;
    }

    public View a(ac ac1, View view, ViewGroup viewgroup)
    {
        if (ac1 == null)
        {
            throw new IllegalArgumentException("Null item");
        }
        switch (ac1.a())
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown object type ").append(ac1.getClass()).toString());

        case 1: // '\001'
            return a(view, viewgroup);

        case 2: // '\002'
            return b(view, viewgroup);

        case 3: // '\003'
            return c(view, viewgroup);

        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
        case 13: // '\r'
        case 14: // '\016'
            return a(ac1, view, false);

        case 15: // '\017'
        case 16: // '\020'
        case 17: // '\021'
        case 18: // '\022'
        case 19: // '\023'
        case 20: // '\024'
        case 21: // '\025'
        case 22: // '\026'
        case 23: // '\027'
            return a(ac1, view, true);

        case 0: // '\0'
            return c(ac1, view);

        case 4: // '\004'
            return a(ac1, view);

        case 5: // '\005'
            return b(ac1, view);
        }
    }

    public volatile View a(Object obj, View view, ViewGroup viewgroup)
    {
        return a((ac)obj, view, viewgroup);
    }

    public void a(u u)
    {
        f = u;
    }

    public void a(boolean flag)
    {
        h = flag;
    }

    public boolean a(ac ac1)
    {
        if (!(ac1 instanceof ad)) goto _L2; else goto _L1
_L1:
        if (((ad)ac1).b().t()) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (ac1 != b)
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public volatile boolean a(Object obj)
    {
        return a((ac)obj);
    }

    public long b(ac ac1)
    {
        if (ac1 == a)
        {
            return 1L;
        }
        if (ac1 == b)
        {
            return 2L;
        }
        if (ac1 == c)
        {
            return 3L;
        }
        if (ac1 instanceof ad)
        {
            return n.d(((ad)ac1).b().d());
        } else
        {
            return 0x8000000000000000L;
        }
    }

    public volatile long b(Object obj)
    {
        return b((ac)obj);
    }

    public boolean b()
    {
        return true;
    }

    public int c(ac ac1)
    {
        return ac1.a();
    }

    public volatile int c(Object obj)
    {
        return c((ac)obj);
    }

}

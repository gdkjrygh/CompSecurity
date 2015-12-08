// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import com.kik.cache.ad;
import com.kik.e.a;
import com.kik.m.n;
import com.kik.sdkutils.ab;
import com.kik.sdkutils.y;
import com.kik.view.adapters.ah;
import com.kik.view.adapters.t;
import java.util.List;
import kik.a.d.f;
import kik.a.e.i;

// Referenced classes of package kik.android.chat.fragment:
//            ConversationsBaseFragment, qj, qe, qf, 
//            qg

public class MissedConversationsFragment extends ConversationsBaseFragment
{
    public static final class a extends com.kik.ui.fragment.FragmentBase.a
    {

        public a()
        {
        }
    }


    ad l;
    private t m;
    private t n;
    private ah o;
    private LayoutInflater p;
    private View q;
    private long r;

    public MissedConversationsFragment()
    {
    }

    static void a(MissedConversationsFragment missedconversationsfragment)
    {
        missedconversationsfragment.b("Clearing...", false);
        (new qj(missedconversationsfragment)).a(new Void[0]);
    }

    static View b(MissedConversationsFragment missedconversationsfragment)
    {
        return missedconversationsfragment.q;
    }

    protected final int K()
    {
        return 0x7f090170;
    }

    public final int a()
    {
        return 10;
    }

    protected final void a(f f)
    {
        if (f != null)
        {
            a(((kik.android.util.an) ((new KikChatFragment.a()).a(f, d).a())));
        }
    }

    public final void b(f f)
    {
        a(a.B().indexOf(f));
    }

    public final void b(boolean flag)
    {
        Object obj = a.B();
        List list = a.C();
        boolean flag1;
        if (obj != null && (((List) (obj)).size() > 0 || list.size() > 0))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        q.setEnabled(flag1);
        if (j.getAdapter() == null)
        {
            o = new ah(getActivity());
            m = new t(getActivity(), ((List) (obj)), l, b, d, e, f);
            n = new t(getActivity(), list, l, b, d, e, f);
            m.a();
            n.a();
            o.a(m);
            o.b(n);
            obj = p.inflate(0x7f03007b, j, false);
            ((TextView)((View) (obj)).findViewById(0x7f0e0190)).setText(0x7f090173);
            j.addFooterView(((View) (obj)), null, false);
            j.setFooterDividersEnabled(false);
            j.setAdapter(o);
            com.kik.m.n.a(j);
        } else
        {
            m.a(((List) (obj)));
            n.a(list);
            m.notifyDataSetChanged();
            n.notifyDataSetChanged();
            o.notifyDataSetChanged();
        }
        if (flag || ab.a() - r < 200L)
        {
            r = ab.a();
            j.setSelection(0);
        }
    }

    public void onCreate(Bundle bundle)
    {
        V().a(this);
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        p = layoutinflater;
        k = p.inflate(0x7f030046, viewgroup, false);
        i = true;
        j = (ListView)k.findViewById(0x7f0e004b);
        if (!y.b(9))
        {
            j.setOverscrollFooter(null);
        }
        j.setEmptyView(k.findViewById(0x7f0e003e));
        j.setOnCreateContextMenuListener(new qe(this));
        j.setOnItemClickListener(new qf(this));
        q = k.findViewById(0x7f0e0102);
        q.setOnClickListener(new qg(this));
        b(false);
        return k;
    }

    public void onPause()
    {
        super.onPause();
        a.b(a.L());
    }
}

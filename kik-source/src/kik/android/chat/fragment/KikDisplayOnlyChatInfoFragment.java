// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.kik.cache.SoftwareContactImageView;
import com.kik.cache.av;
import com.kik.e.a;
import com.kik.g.p;
import com.kik.m.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kik.a.d.m;
import kik.a.e.l;
import kik.a.e.r;
import kik.android.chat.KikApplication;
import kik.android.util.KikDisplayOnlyGroupParcelable;
import kik.android.util.aj;
import kik.android.util.cp;
import kik.android.util.cq;
import kik.android.util.cv;

// Referenced classes of package kik.android.chat.fragment:
//            BaseChatInfoFragment, ProgressDialogFragment, ld, lc

public class KikDisplayOnlyChatInfoFragment extends BaseChatInfoFragment
{
    public static final class a extends com.kik.ui.fragment.FragmentBase.a
    {

        public final m a()
        {
            KikDisplayOnlyGroupParcelable kikdisplayonlygroupparcelable = (KikDisplayOnlyGroupParcelable)l("kik.android.chat.fragment.KikDisplayOnlyChatInfoFragment.chatInfoDisplayOnlyGroup");
            if (kikdisplayonlygroupparcelable != null)
            {
                return kikdisplayonlygroupparcelable.a();
            } else
            {
                return null;
            }
        }

        public a()
        {
        }
    }


    protected r q;
    private aj r;
    private m s;
    private a t;

    public KikDisplayOnlyChatInfoFragment()
    {
        t = new a();
    }

    static void a(KikDisplayOnlyChatInfoFragment kikdisplayonlychatinfofragment)
    {
        Object obj = new ProgressDialogFragment(KikApplication.f(0x7f090148), true);
        ((ProgressDialogFragment) (obj)).setCancelable(false);
        ((ProgressDialogFragment) (obj)).e();
        kikdisplayonlychatinfofragment.b(KikApplication.f(0x7f09036a), false);
        obj = kikdisplayonlychatinfofragment.s.b();
        kikdisplayonlychatinfofragment.n.a(((String) (obj)), kikdisplayonlychatinfofragment.s.f(), kikdisplayonlychatinfofragment.s.a()).a(new ld(kikdisplayonlychatinfofragment, ((String) (obj))));
    }

    protected final android.view.View.OnClickListener a()
    {
        return null;
    }

    protected final void b()
    {
        e.removeAllViews();
        Object obj = c.a(0x7f0202d2, 0x7f0202d4);
        lc lc1 = new lc(this);
        obj = a(KikApplication.f(0x7f090143), ((android.graphics.drawable.Drawable) (obj)), lc1);
        d.a(((View) (obj)), "CHAT_INFO_START_CHATTING");
        c(((View) (obj)));
        b(false);
    }

    protected final void b(boolean flag)
    {
        r.a(flag, s, f);
    }

    protected final void c()
    {
        int i;
        if (s.a() != null)
        {
            kik.a.d.k k = q.a(s.a(), false);
            d.a(k, p, false, q, o);
        } else
        {
            obj = av.a(s.e(), d.getMeasuredWidth(), d.getMeasuredHeight());
            d.a(((com.kik.cache.z) (obj)), p);
        }
        i = s.d().size();
        if (i == 1)
        {
            this.k.setText(KikApplication.a(0x7f090194, new Object[] {
                Integer.valueOf(50)
            }));
        } else
        {
            this.k.setText(KikApplication.a(0x7f09011e, new Object[] {
                Integer.valueOf(i), Integer.valueOf(50)
            }));
        }
        cv.b(new View[] {
            this.k
        });
        j.setText(s.b());
        if (cq.c(s.c()))
        {
            if (cq.c(s.b()))
            {
                Object obj = new ArrayList();
                for (Iterator iterator = s.d().iterator(); iterator.hasNext(); ((ArrayList) (obj)).add(((kik.a.d.l)iterator.next()).a())) { }
                this.i.setText(cq.a(((List) (obj))));
            } else
            {
                this.i.setText(s.b());
            }
        } else
        {
            this.i.setText(s.c());
        }
        this.i.setPadding(this.i.getPaddingLeft(), KikApplication.a(8), this.i.getPaddingLeft(), 0);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        V().a(this);
        o.b("Chat Info Shown").b();
        t.a(getArguments());
        s = t.a();
        if (s == null)
        {
            throw new IllegalArgumentException("Ensure a backingGroup is provided to this fragment");
        } else
        {
            r = new aj(getActivity(), p);
            o.b("Opened Public Group Profile").b();
            return;
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.onCreateView(layoutinflater, viewgroup, bundle);
        cv.e(new View[] {
            m
        });
        return b;
    }
}

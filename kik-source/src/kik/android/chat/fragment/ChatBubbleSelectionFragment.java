// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.kik.d.f;
import com.kik.e.a;
import com.kik.view.adapters.bb;
import java.util.List;
import kik.a.h.j;
import kik.android.a.b;
import kik.android.chat.KikApplication;
import kik.android.chat.b.d;

// Referenced classes of package kik.android.chat.fragment:
//            KikScopedDialogFragment, ab

public class ChatBubbleSelectionFragment extends KikScopedDialogFragment
{
    private static final class a extends BaseAdapter
    {

        private List a;
        private final LayoutInflater b;
        private kik.android.chat.b.b c;

        private kik.android.chat.b.b a(int i)
        {
            if (i >= 0 && i < a.size())
            {
                return (kik.android.chat.b.b)a.get(i);
            } else
            {
                return null;
            }
        }

        static void a(a a1, kik.android.chat.b.b b1)
        {
            a1.c = b1;
            a1.notifyDataSetChanged();
        }

        public final int getCount()
        {
            return a.size();
        }

        public final Object getItem(int i)
        {
            return a(i);
        }

        public final long getItemId(int i)
        {
            return 0L;
        }

        public final View getView(int i, View view, ViewGroup viewgroup)
        {
            kik.android.chat.b.b b1;
            if (view == null)
            {
                view = b.inflate(0x7f030064, viewgroup, false);
                viewgroup = new a((byte)0);
                viewgroup.a = (TextView)view.findViewById(0x7f0e0150);
                viewgroup.b = (ImageView)view.findViewById(0x7f0e013b);
            } else
            {
                viewgroup = (a)view.getTag();
            }
            b1 = a(i);
            if (b1 != null)
            {
                ((a) (viewgroup)).a.setText(b1.a());
                ImageView imageview = ((a) (viewgroup)).b;
                i = b1.c();
                GradientDrawable gradientdrawable = new GradientDrawable();
                gradientdrawable.setShape(1);
                gradientdrawable.setColor(i);
                imageview.setBackgroundDrawable(gradientdrawable);
                if (b1.b() == 0xff000000)
                {
                    ((a) (viewgroup)).b.setImageResource(0x7f020071);
                } else
                {
                    ((a) (viewgroup)).b.setImageResource(0x7f020072);
                }
                if (c == b1)
                {
                    if (b1.b() == 0xff000000)
                    {
                        ((a) (viewgroup)).b.setImageResource(0x7f020074);
                    } else
                    {
                        ((a) (viewgroup)).b.setImageResource(0x7f020076);
                    }
                }
            }
            view.setTag(viewgroup);
            return view;
        }

        public a(Context context, List list)
        {
            a = list;
            b = LayoutInflater.from(context);
        }
    }

    private static final class a.a
    {

        public TextView a;
        public ImageView b;

        private a.a()
        {
        }

        a.a(byte byte0)
        {
            this();
        }
    }

    public static final class b extends com.kik.ui.fragment.FragmentBase.a
    {

        public b()
        {
        }
    }


    ListView _bubbleList;
    TextView _title;
    d a;
    com.kik.android.a b;
    private a c;
    private a d;
    private bb e;
    private kik.android.a.b f;

    public ChatBubbleSelectionFragment()
    {
    }

    private void a(kik.android.chat.b.b b1)
    {
        if (c != null && d != null)
        {
            kik.android.chat.fragment.a.a(c, b1);
            kik.android.chat.fragment.a.a(d, b1);
            e.notifyDataSetChanged();
        }
    }

    static void a(ChatBubbleSelectionFragment chatbubbleselectionfragment, kik.android.chat.b.b b1)
    {
        chatbubbleselectionfragment.a(b1);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.onCreateView(layoutinflater, viewgroup, bundle);
        f = KikApplication.i();
        if (f != null)
        {
            f.c().a(com.kik.d.b.a.k.S, j.b());
        }
        layoutinflater = layoutinflater.inflate(0x7f030002, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        V().a(this);
        e = new bb(getActivity());
        c = new a(getActivity(), a.a(kik.android.chat.b.b.a.b));
        d = new a(getActivity(), a.a(kik.android.chat.b.b.a.a));
        e.c(KikApplication.f(0x7f090081), c);
        e.c(KikApplication.f(0x7f090082), d);
        _bubbleList.setAdapter(e);
        _bubbleList.setOnItemClickListener(new ab(this));
        a(a.c());
        _title.setText(KikApplication.f(0x7f090231));
        return layoutinflater;
    }

    public void onDestroy()
    {
        Object obj;
label0:
        {
            super.onDestroy();
            if (a.a())
            {
                obj = a.c().e();
                b.b("Chat Bubble Colour Changed").a("Name", obj).b();
                b.a("Bubble Colour", obj);
                if (f != null)
                {
                    obj = a.c().d();
                    if (obj != null)
                    {
                        break label0;
                    }
                }
            }
            return;
        }
        int i = ((com.kik.n.a.k.a.a) (obj)).w;
        long l = j.b();
        f.c().a(com.kik.d.b.a.k.T, "s", i, Long.valueOf(l).longValue());
    }
}

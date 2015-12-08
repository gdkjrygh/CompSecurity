// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.kik.cache.ContactImageView;
import com.kik.cache.ad;
import com.kik.cache.av;
import com.kik.cards.web.bf;
import com.kik.e.a;
import kik.a.d.aa;
import kik.a.e.w;
import kik.android.util.an;
import kik.android.widget.SquareNetworkedImageView;

// Referenced classes of package kik.android.chat.fragment:
//            KikScopedDialogFragment, nf, ng, nh

public class KikPermissionsFragment extends KikScopedDialogFragment
{
    public static final class a extends an
    {

        static String a(a a1)
        {
            return a1.g("kik.permissionFragment.extra.imageUrl");
        }

        static String b(a a1)
        {
            return a1.g("kik.permissionFragment.extra.name");
        }

        static String c(a a1)
        {
            return a1.g("kik.permissionFragment.extra.url");
        }

        static String d(a a1)
        {
            return a1.g("kik.permissionFragment.extra.tosUrl");
        }

        static String e(a a1)
        {
            return a1.g("kik.permissionFragment.extra.privacyUrl");
        }

        public final a a(String s)
        {
            a("kik.permissionFragment.extra.imageUrl", s);
            return this;
        }

        public final a b(String s)
        {
            a("kik.permissionFragment.extra.name", s);
            return this;
        }

        public final a c(String s)
        {
            a("kik.permissionFragment.extra.url", s);
            return this;
        }

        public final a d(String s)
        {
            a("kik.permissionFragment.extra.tosUrl", s);
            return this;
        }

        public final a e(String s)
        {
            a("kik.permissionFragment.extra.privacyUrl", s);
            return this;
        }

        public a()
        {
        }
    }


    w a;
    protected ad b;
    protected ad c;
    protected com.kik.android.a d;
    private a e;

    public KikPermissionsFragment()
    {
        e = new a();
    }

    public void onCreate(Bundle bundle)
    {
        V().a(this);
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030047, viewgroup, false);
        e.a(getArguments());
        bundle = (ContactImageView)layoutinflater.findViewById(0x7f0e0030);
        Object obj = (ImageView)layoutinflater.findViewById(0x7f0e0031);
        viewgroup = a.d();
        bundle.a(viewgroup, b);
        String s;
        String s1;
        int i;
        if (((aa) (viewgroup)).i.booleanValue())
        {
            i = 0;
        } else
        {
            i = 8;
        }
        ((ImageView) (obj)).setVisibility(i);
        ((TextView)layoutinflater.findViewById(0x7f0e0109)).setText((new StringBuilder()).append(((aa) (viewgroup)).d).append(" ").append(((aa) (viewgroup)).e).toString());
        ((TextView)layoutinflater.findViewById(0x7f0e010a)).setText(((aa) (viewgroup)).c);
        bundle = (SquareNetworkedImageView)layoutinflater.findViewById(0x7f0e0104);
        bundle.a(av.a(kik.android.chat.fragment.a.a(e), bundle.getMeasuredWidth(), bundle.getMeasuredHeight()), c);
        bundle = a.b(e);
        ((TextView)layoutinflater.findViewById(0x7f0e0105)).setText(a.b(e));
        ((TextView)layoutinflater.findViewById(0x7f0e0107)).setText(a.c(e));
        ((TextView)layoutinflater.findViewById(0x7f0e0108)).setText(getString(0x7f090371, new Object[] {
            bundle
        }));
        obj = (TextView)layoutinflater.findViewById(0x7f0e0068);
        s = a.d(e);
        s1 = a.e(e);
        if (s != null || s1 != null)
        {
            ((TextView) (obj)).setVisibility(0);
            ((TextView) (obj)).setMovementMethod(LinkMovementMethod.getInstance());
            if (s != null && s1 != null)
            {
                ((TextView) (obj)).setText(Html.fromHtml((new StringBuilder()).append(getActivity().getString(0x7f090334)).append(" ").append(bundle).append("'s <a href=\"").append(s).append("\">").append(getActivity().getString(0x7f090335)).append("</a> ").append(getActivity().getString(0x7f090331)).append(" <a href=\"").append(s1).append("\">").append(getActivity().getString(0x7f090333)).append("</a>").toString()));
            } else
            if (s != null && s1 == null)
            {
                ((TextView) (obj)).setText(Html.fromHtml((new StringBuilder()).append(getActivity().getString(0x7f090334)).append(" ").append(bundle).append("'s <a href=\"").append(s).append("\">").append(getActivity().getString(0x7f090335)).append("</a>").toString()));
            } else
            {
                ((TextView) (obj)).setText(Html.fromHtml((new StringBuilder()).append(getActivity().getString(0x7f090334)).append(" ").append(bundle).append("'s <a href=\"").append(s1).append("\">").append(getActivity().getString(0x7f0902f1)).append("</a>").toString()));
            }
        }
        if (!bf.a(a.c(e)))
        {
            layoutinflater.findViewById(0x7f0e0106).setVisibility(8);
        }
        layoutinflater.findViewById(0x7f0e0013).setOnClickListener(new nf(this));
        layoutinflater.findViewById(0x7f0e005a).setOnClickListener(new ng(this, viewgroup));
        viewgroup = layoutinflater.findViewById(0x7f0e001d);
        if (viewgroup != null)
        {
            viewgroup.setOnClickListener(new nh(this));
        }
        viewgroup = (TextView)layoutinflater.findViewById(0x7f0e0078);
        if (viewgroup != null)
        {
            viewgroup.setText(0x7f0902d1);
        }
        return layoutinflater;
    }
}

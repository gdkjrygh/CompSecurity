// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.kik.android.a;
import com.kik.d.f;
import com.kik.g.p;
import java.util.ArrayList;
import kik.a.d.k;
import kik.a.e.r;
import kik.a.f.f.g;
import kik.a.f.f.z;
import kik.a.h.j;
import kik.android.a.b;
import kik.android.chat.KikApplication;

// Referenced classes of package kik.android.chat.fragment:
//            KikIqFragmentBase, bc, bb, ax, 
//            ay, az, ba

public class KikAddContactFragment extends KikIqFragmentBase
{
    public static final class a extends Enum
    {

        public static final int a;
        public static final int b;
        public static final int c;
        public static final int d;
        public static final int e;
        private static final int f[];

        public static int[] a()
        {
            return (int[])f.clone();
        }

        static 
        {
            a = 1;
            b = 2;
            c = 3;
            d = 4;
            e = 5;
            f = (new int[] {
                a, b, c, d, e
            });
        }
    }

    public static final class b extends com.kik.ui.fragment.FragmentBase.a
    {

        static String a(b b1)
        {
            return b1.g("NameSuggestion");
        }

        static ArrayList b(b b1)
        {
            return (ArrayList)b1.k("FilteredNames");
        }

        static int c(b b1)
        {
            return b1.b("ActionType", 1);
        }

        static boolean d(b b1)
        {
            return b1.f("showKeyboard").booleanValue();
        }

        public final b a()
        {
            a("showKeyboard", true);
            return this;
        }

        public final b a(String s)
        {
            a("NameSuggestion", s);
            return this;
        }

        public final b a(ArrayList arraylist)
        {
            a("FilteredNames", ((java.io.Serializable) (arraylist)));
            return this;
        }

        public final b b(int i1)
        {
            a("ActionType", i1);
            return this;
        }

        public b()
        {
        }
    }


    protected com.kik.android.a a;
    protected r b;
    private EditText c;
    private TextView d;
    private int e;
    private Context f;
    private boolean g;
    private final b h = new b();
    private final ArrayList i = new ArrayList();
    private Button j;
    private Button k;
    private TextWatcher l;

    public KikAddContactFragment()
    {
        e = 1;
        g = false;
        l = new bc(this);
    }

    static EditText a(KikAddContactFragment kikaddcontactfragment)
    {
        return kikaddcontactfragment.c;
    }

    private void a(k k1)
    {
        a.b("User Search Complete").a("Was Inline", false).b();
        KikChatInfoFragment.a a1;
        boolean flag;
        if (e == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a1 = (KikChatInfoFragment.a)(new KikChatInfoFragment.a()).a("explicit-username-search").b(e).b(flag).a(h.h());
        if (flag || e == 5)
        {
            if (i.size() > 0 && i.contains(k1.e().toLowerCase()))
            {
                a1.c();
            }
            h.b(e);
            a1.a(h.h());
        } else
        {
            a1.a(k1).c(g);
        }
        a(((kik.android.util.an) (a1))).a(new bb(this));
    }

    static void a(KikAddContactFragment kikaddcontactfragment, String s)
    {
        if (s.length() != 0) goto _L2; else goto _L1
_L1:
        kikaddcontactfragment.d.setVisibility(8);
_L4:
        kikaddcontactfragment.k.setEnabled(false);
        return;
_L2:
        if (s.matches(kikaddcontactfragment.getString(0x7f0901ee)))
        {
            kikaddcontactfragment.d.setVisibility(8);
            kikaddcontactfragment.k.setEnabled(true);
            return;
        }
        if (!s.matches(kikaddcontactfragment.getString(0x7f0901ed)))
        {
            kikaddcontactfragment.a(a.e, null);
        } else
        if (s.length() < 2)
        {
            kikaddcontactfragment.a(a.d, null);
        } else
        if (s.length() > 20)
        {
            kikaddcontactfragment.a(a.c, null);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static void b(KikAddContactFragment kikaddcontactfragment)
    {
        KikApplication.i().c().a(com.kik.d.b.a.k.x, "s", 1L, kik.a.h.j.b());
        String s = kikaddcontactfragment.c.getText().toString();
        k k1 = kikaddcontactfragment.b.b(s);
        if (k1 != null)
        {
            kikaddcontactfragment.a(k1);
            return;
        } else
        {
            kikaddcontactfragment.a(kik.a.f.f.g.a(kikaddcontactfragment, s), kikaddcontactfragment.getString(0x7f0900ff), true);
            return;
        }
    }

    static Context c(KikAddContactFragment kikaddcontactfragment)
    {
        return kikaddcontactfragment.f;
    }

    protected final int C()
    {
        return 16;
    }

    protected final int K()
    {
        return 0x7f090306;
    }

    protected final void a(int i1, String s)
    {
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[kik.android.chat.fragment.a.a().length];
                try
                {
                    a[kik.android.chat.fragment.a.a - 1] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[kik.android.chat.fragment.a.b - 1] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[a.d - 1] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[a.c - 1] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[a.e - 1] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        kik.android.chat.fragment._cls1.a[i1 - 1];
        JVM INSTR tableswitch 1 5: default 40
    //                   1 71
    //                   2 93
    //                   3 106
    //                   4 120
    //                   5 134;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        s = getResources().getString(0x7f090383);
_L8:
        d.setText(s);
        d.setVisibility(0);
        w();
        return;
_L2:
        s = getResources().getString(0x7f090353, new Object[] {
            s
        });
        continue; /* Loop/switch isn't completed */
_L3:
        s = getResources().getString(0x7f090383);
        continue; /* Loop/switch isn't completed */
_L4:
        s = getResources().getString(0x7f090356);
        continue; /* Loop/switch isn't completed */
_L5:
        s = getResources().getString(0x7f090355);
        continue; /* Loop/switch isn't completed */
_L6:
        s = getResources().getString(0x7f090351);
        if (true) goto _L8; else goto _L7
_L7:
    }

    protected final void a(z z1)
    {
        super.a(z1);
        z1 = ((g)z1).d();
        if (z1 != null)
        {
            k k1 = b.a(z1.b(), false);
            if (k1 != null)
            {
                z1.b(k1);
            }
            b.a(z1);
            a(((k) (z1)));
        }
    }

    protected final boolean b(z z1)
    {
        boolean flag;
        if (c.getText().toString().trim().indexOf(' ') >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (z1.l() != 201 || c == null) goto _L2; else goto _L1
_L1:
        a.b("User Search Error").a("Was Inline", false).a("Network Error", false).a("Contains Spaces", flag).b();
        R = kik.android.chat.fragment.a.a;
_L4:
        return super.b(z1);
_L2:
        if (c != null)
        {
            a.b("User Search Error").a("Was Inline", false).a("Network Error", true).a("Contains Spaces", flag).b();
            R = kik.android.chat.fragment.a.b;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onActivityResult(int i1, int j1, Intent intent)
    {
        if (i1 == 1560 && j1 == -1 && intent.hasExtra("SimpleFragmentWrapperActivity.EXTRA_FRAGMENT_RESULT"))
        {
            intent = intent.getBundleExtra("SimpleFragmentWrapperActivity.EXTRA_FRAGMENT_RESULT");
            (new Bundle()).putString("KikSelectUserFragment.RESULT_JID", intent.getString("chatContactJID"));
            a(intent);
            J();
        }
    }

    public void onCreate(Bundle bundle)
    {
        V().a(this);
        super.onCreate(bundle);
        a.b("Explicit Username Search Opened").b();
        getActivity().setResult(-1);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        D();
        layoutinflater = layoutinflater.inflate(0x7f030001, viewgroup, false);
        f = getActivity();
        c = (EditText)layoutinflater.findViewById(0x7f0e0011);
        d = (TextView)layoutinflater.findViewById(0x7f0e0012);
        j = (Button)layoutinflater.findViewById(0x7f0e0013);
        k = (Button)layoutinflater.findViewById(0x7f0e0014);
        S.o();
        c.setOnEditorActionListener(new ax(this));
        h.a(getArguments());
        viewgroup = kik.android.chat.fragment.b.a(h);
        c.addTextChangedListener(l);
        i.clear();
        if (kik.android.chat.fragment.b.b(h) != null)
        {
            i.addAll(kik.android.chat.fragment.b.b(h));
        }
        if (viewgroup != null)
        {
            layoutinflater.post(new ay(this, viewgroup, viewgroup.trim()));
        }
        e = b.c(h);
        g = b.d(h);
        g = getArguments().getBoolean("showKeyBoard", false);
        j.setOnClickListener(new az(this));
        k.setOnClickListener(new ba(this));
        k.setEnabled(false);
        a(c, 1);
        return layoutinflater;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import butterknife.ButterKnife;
import com.kik.e.a;
import com.kik.g.p;
import com.kik.m.d;
import kik.a.d.n;
import kik.a.e.l;
import kik.a.e.r;
import kik.android.util.an;

// Referenced classes of package kik.android.chat.fragment:
//            KikIqFragmentBase, bt, bu, br, 
//            bs

public class KikChangeGroupNameFragment extends KikIqFragmentBase
{
    public static final class a extends an
    {

        public final String a()
        {
            return g("kik.android.chat.fragment.KikChangeGroupNameFragment.GroupJid");
        }

        public final a a(String s)
        {
            a("kik.android.chat.fragment.KikChangeGroupNameFragment.GroupJid", s);
            return this;
        }

        public a()
        {
        }
    }


    View _confirmNameButton;
    EditText _groupNameField;
    protected com.kik.android.a a;
    protected r b;
    protected l c;
    private n d;
    private a e;

    public KikChangeGroupNameFragment()
    {
        e = new a();
    }

    static void a(KikChangeGroupNameFragment kikchangegroupnamefragment)
    {
        String s2 = kikchangegroupnamefragment._groupNameField.getText().toString().trim();
        String s1 = kikchangegroupnamefragment.d.c();
        String s = s1;
        if (s1 == null)
        {
            s = "";
        }
        if (s2.equals(s))
        {
            kikchangegroupnamefragment.J();
            return;
        } else
        {
            kikchangegroupnamefragment.a(((java.util.concurrent.Callable) (new bt(kikchangegroupnamefragment, s2))), kikchangegroupnamefragment.getString(0x7f090207)).a(new bu(kikchangegroupnamefragment));
            return;
        }
    }

    static n b(KikChangeGroupNameFragment kikchangegroupnamefragment)
    {
        return kikchangegroupnamefragment.d;
    }

    protected final int C()
    {
        return 16;
    }

    protected final int K()
    {
        return 0x7f0902c0;
    }

    public void onCreate(Bundle bundle)
    {
        V().a(this);
        super.onCreate(bundle);
        getActivity().setResult(-1);
        e.a(getArguments());
        bundle = e.a();
        if (bundle != null)
        {
            bundle = b.a(bundle, false);
            if (bundle instanceof n)
            {
                d = (n)bundle;
            }
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030004, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        com.kik.m.d.a(_groupNameField, "AUTOMATION_GROUP_NAME_FIELD");
        com.kik.m.d.a(_confirmNameButton, "AUTOMATION_CONFIRM_NAME_BUTTON");
        _groupNameField.setOnEditorActionListener(new br(this));
        _confirmNameButton.setOnClickListener(new bs(this));
        a(_groupNameField, 1);
        if (d.c() != null)
        {
            _groupNameField.setText(d.c());
            _groupNameField.setSelection(_groupNameField.length());
        }
        return layoutinflater;
    }
}

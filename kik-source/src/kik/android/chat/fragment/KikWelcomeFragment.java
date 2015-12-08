// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.kik.e.a;
import com.kik.g.f;
import com.kik.g.i;
import com.kik.g.p;
import kik.a.e.w;
import kik.android.util.ar;

// Referenced classes of package kik.android.chat.fragment:
//            KikIqFragmentBase, pz, qa, qb, 
//            qc, KikRegistrationFragment

public class KikWelcomeFragment extends KikIqFragmentBase
{

    protected com.kik.android.a a;
    protected w b;
    protected ar c;
    private f d;
    private i e;

    public KikWelcomeFragment()
    {
        e = new pz(this);
    }

    static void a(KikWelcomeFragment kikwelcomefragment)
    {
        kikwelcomefragment.J();
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        if (i == 1 && j == -1)
        {
            J();
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        V().a(this);
        d = new f();
        a.b("Intro Shown").g().b();
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030017, viewgroup, false);
        viewgroup = layoutinflater.findViewById(0x7f0e0067);
        bundle = layoutinflater.findViewById(0x7f0e0085);
        bundle.setContentDescription("AUTOMATION_TITLE_REGISTER");
        d.a(b.b(), e);
        b.h().a(new qa(this));
        bundle.setOnClickListener(new qb(this));
        viewgroup.setOnClickListener(new qc(this));
        return layoutinflater;
    }

    public void onDestroy()
    {
        super.onDestroy();
        d.a();
        kik.android.chat.fragment.KikRegistrationFragment.a(c);
    }
}

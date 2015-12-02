// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.picker;

import android.content.res.Resources;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ag;
import android.support.v4.app.q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.facebook.analytics.av;
import com.facebook.analytics.cb;
import com.facebook.base.fragment.FbFragment;
import com.facebook.contacts.picker.ad;
import com.facebook.contacts.picker.ae;
import com.facebook.contacts.picker.ah;
import com.facebook.contacts.picker.c;
import com.facebook.contacts.picker.v;
import com.facebook.debug.log.b;
import com.facebook.i;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.o;
import com.facebook.orca.annotations.ForContactMultiPicker;
import com.facebook.orca.annotations.IsSuggestionsEnabled;
import com.facebook.orca.annotations.ShowPresenceInfoInContactPicker;
import com.facebook.orca.contacts.divebar.an;
import com.facebook.orca.contacts.divebar.ao;
import com.facebook.orca.creation.CreateThreadActivity;
import com.facebook.user.User;
import com.facebook.user.UserFbidIdentifier;
import com.facebook.user.UserWithIdentifier;
import com.facebook.widget.listview.BetterListView;
import com.google.common.a.es;
import com.google.common.a.et;
import com.google.common.a.fi;
import java.util.List;
import javax.inject.a;

// Referenced classes of package com.facebook.orca.contacts.picker:
//            e, f, g, ae, 
//            h, ContactPickerFragment, MultipickerCustomLayout, x, 
//            az, a, b, c, 
//            d, z, aa

public class ContactMultipickerFragment extends FbFragment
{

    private static final Class a = com/facebook/orca/contacts/picker/ContactMultipickerFragment;
    private ContactPickerFragment Z;
    private MultipickerCustomLayout aa;
    private View ab;
    private View ac;
    private BetterListView ad;
    private ae ae;
    private v af;
    private z ag;
    private aa ah;
    private boolean ai;
    private an aj;
    private boolean ak;
    private boolean al;
    private a b;
    private a c;
    private av d;
    private c e;
    private ao f;
    private az g;
    private String h;
    private int i;

    public ContactMultipickerFragment()
    {
        al = true;
    }

    static Class R()
    {
        return a;
    }

    private void T()
    {
        ab.setOnClickListener(new e(this));
    }

    private boolean U()
    {
        if (!al)
        {
            return false;
        } else
        {
            return ((Boolean)c.b()).booleanValue();
        }
    }

    private void V()
    {
        ad.setDividerHeight(0);
        ad.setBroadcastInteractionChanges(true);
        ad.setOnScrollListener(new f(this));
        ad.setOnItemClickListener(new g(this));
        ad.setAdapter(new com.facebook.orca.contacts.picker.ae(e));
    }

    private void W()
    {
        y().a(1000, null, new h(this));
    }

    private es a(es es1, fi fi1)
    {
        if (es1 == null)
        {
            es1 = es.d();
        } else
        {
            et et1 = es.e();
            et1.b(ae);
            for (int j = 0; j < 20 && j < es1.size(); j++)
            {
                User user = (User)es1.get(j);
                et1.b(a(new UserWithIdentifier(user, user.i()), fi1.contains(user.i().c())));
            }

            fi1 = et1.b();
            es1 = fi1;
            if (fi1.size() <= 1)
            {
                return es.d();
            }
        }
        return es1;
    }

    static a a(ContactMultipickerFragment contactmultipickerfragment)
    {
        return contactmultipickerfragment.b;
    }

    private void a(View view, View view1)
    {
        com.facebook.debug.log.b.a(a, "onContactPickerFocusChanged");
        if (view1 != null)
        {
            view = view1.getParent();
        } else
        {
            view = null;
        }
        do
        {
label0:
            {
                if (view != null)
                {
                    if (view != Z.z())
                    {
                        break label0;
                    }
                    b();
                }
                return;
            }
            if (view == ad)
            {
                b();
                return;
            }
            view = view.getParent();
        } while (true);
    }

    private void a(an an1)
    {
        if (com.facebook.debug.log.b.b(3))
        {
            Class class1 = a;
            String s;
            if (an1 != null)
            {
                s = an1.toString();
            } else
            {
                s = "null";
            }
            com.facebook.debug.log.b.b(class1, "onNewContactSuggestionsResult: %s", new Object[] {
                s
            });
        }
        aj = an1;
        P();
    }

    static void a(ContactMultipickerFragment contactmultipickerfragment, int j)
    {
        contactmultipickerfragment.f(j);
    }

    static void a(ContactMultipickerFragment contactmultipickerfragment, View view, View view1)
    {
        contactmultipickerfragment.a(view, view1);
    }

    static void a(ContactMultipickerFragment contactmultipickerfragment, an an1)
    {
        contactmultipickerfragment.a(an1);
    }

    static az b(ContactMultipickerFragment contactmultipickerfragment)
    {
        return contactmultipickerfragment.g;
    }

    private void b(boolean flag)
    {
        cb cb1 = (new cb("click")).f("multipicker_list_item").g("contact_multipicker_item").a("is_picked", flag);
        if (h != null)
        {
            cb1.e(h);
        }
        d.a(cb1);
    }

    static ContactPickerFragment c(ContactMultipickerFragment contactmultipickerfragment)
    {
        return contactmultipickerfragment.Z;
    }

    static ao d(ContactMultipickerFragment contactmultipickerfragment)
    {
        return contactmultipickerfragment.f;
    }

    private void f(int j)
    {
        Object obj;
        if (e != null)
        {
            if ((obj = e.getItem(j)) instanceof com.facebook.contacts.picker.ag)
            {
                obj = (com.facebook.contacts.picker.ag)obj;
                UserWithIdentifier userwithidentifier = ((com.facebook.contacts.picker.ag) (obj)).a();
                boolean flag;
                if (!((com.facebook.contacts.picker.ag) (obj)).k())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    Z.b(userwithidentifier);
                } else
                {
                    Z.c(userwithidentifier);
                }
                ak = true;
                b(flag);
                return;
            }
        }
    }

    public void O()
    {
        ac.setVisibility(8);
    }

    public void P()
    {
        if (aj == null)
        {
            return;
        } else
        {
            Object obj = fi.a(Z.b());
            obj = a(aj.b(), ((fi) (obj)));
            e.a(((es) (obj)));
            e.notifyDataSetChanged();
            return;
        }
    }

    public boolean Q()
    {
        return ak;
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.a(layoutinflater, viewgroup, bundle);
        layoutinflater = layoutinflater.inflate(k.orca_contact_multipicker, viewgroup, false);
        aa = (MultipickerCustomLayout)a(((View) (layoutinflater)), i.multipicker_custom_layout);
        aa.setMinBottomSizePx(i);
        ad = (BetterListView)a(((View) (layoutinflater)), i.suggestions_contacts_list);
        ab = a(((View) (layoutinflater)), i.multipicker_cover);
        ac = a(((View) (layoutinflater)), i.suggestions_container);
        Z = (ContactPickerFragment)q().a(i.multipicker_contact_picker);
        Z.a(x.FACEBOOK_LIST);
        return layoutinflater;
    }

    public ad a(UserWithIdentifier userwithidentifier, boolean flag)
    {
        if (((Boolean)b.b()).booleanValue())
        {
            return g.a(userwithidentifier, ah.SUGGESTIONS, flag);
        } else
        {
            return g.b(userwithidentifier, ah.SUGGESTIONS, flag);
        }
    }

    public ContactPickerFragment a()
    {
        return Z;
    }

    public void a(Bundle bundle)
    {
        super.a(bundle);
        bundle = S();
        g = (az)bundle.a(com/facebook/orca/contacts/picker/az);
        b = bundle.b(java/lang/Boolean, com/facebook/orca/annotations/ShowPresenceInfoInContactPicker);
        c = bundle.b(java/lang/Boolean, com/facebook/orca/annotations/IsSuggestionsEnabled);
        Resources resources = (Resources)bundle.a(android/content/res/Resources);
        d = (av)bundle.a(com/facebook/analytics/av);
        e = (c)bundle.a(com/facebook/contacts/picker/c, com/facebook/orca/annotations/ForContactMultiPicker);
        f = (ao)bundle.a(com/facebook/orca/contacts/divebar/ao);
        ae = new ae(resources.getString(o.contact_multipicker_suggestions_header));
        af = new com.facebook.orca.contacts.picker.a(this);
        ag = new com.facebook.orca.contacts.picker.b(this);
        ah = new com.facebook.orca.contacts.picker.c(this);
        if (!(l() instanceof CreateThreadActivity) || ((Boolean)c.b()).booleanValue())
        {
            W();
        }
    }

    public void a(Fragment fragment)
    {
        super.a(fragment);
        if (fragment instanceof ContactPickerFragment)
        {
            fragment = (ContactPickerFragment)fragment;
            fragment.a(af);
            fragment.a(ag);
            fragment.a(ah);
        }
    }

    public void a(String s)
    {
        h = s;
    }

    public void a(List list)
    {
        Z.a(list);
        P();
    }

    public void a(boolean flag)
    {
        al = flag;
    }

    public void b()
    {
        if (!ai)
        {
            ((TransitionDrawable)ab.getBackground()).startTransition(300);
            T();
            ai = true;
        }
    }

    public void c()
    {
        if (ai)
        {
            ((TransitionDrawable)ab.getBackground()).reverseTransition(300);
            ab.setOnClickListener(null);
            ab.setClickable(false);
            ai = false;
            Z.Q();
            ad.requestFocus();
        }
    }

    public void d()
    {
        if (U())
        {
            ac.setVisibility(0);
        }
    }

    public void d(Bundle bundle)
    {
        super.d(bundle);
        V();
        if (bundle != null && bundle.getBoolean("multipickerCoverShown"))
        {
            b();
        }
        z().getViewTreeObserver().addOnGlobalFocusChangeListener(new d(this));
    }

    public void e(int j)
    {
        i = j;
        if (aa != null)
        {
            aa.setMinBottomSizePx(i);
            aa.invalidate();
        }
    }

    public void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putBoolean("multipickerCoverShown", ai);
    }

}

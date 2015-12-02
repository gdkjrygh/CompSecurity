// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.picker;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.facebook.base.fragment.FbFragment;
import com.facebook.contacts.database.AddressBookPeriodicRunner;
import com.facebook.contacts.picker.ag;
import com.facebook.contacts.picker.c;
import com.facebook.contacts.picker.u;
import com.facebook.contacts.picker.v;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.messages.a.a.a;
import com.facebook.o;
import com.facebook.orca.annotations.ForAddressBook;
import com.facebook.orca.annotations.ForFacebookList;
import com.facebook.orca.annotations.ForMergedComposer;
import com.facebook.user.Name;
import com.facebook.user.User;
import com.facebook.user.UserFbidIdentifier;
import com.facebook.user.UserIdentifier;
import com.facebook.user.UserWithIdentifier;
import com.facebook.user.i;
import com.facebook.user.j;
import com.facebook.user.n;
import com.facebook.user.s;
import com.google.common.a.es;
import com.google.common.a.et;
import com.google.common.base.Objects;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook.orca.contacts.picker:
//            ContactAutoCompleteTextView, ce, ab, p, 
//            aa, z, j, ae, 
//            w, x, y, u, 
//            v

public class ContactPickerFragment extends FbFragment
{

    private static final Class a = com/facebook/orca/contacts/picker/ContactPickerFragment;
    private i Z;
    private AddressBookPeriodicRunner aa;
    private a ab;
    private s ac;
    private z ad;
    private aa ae;
    private p af;
    private InputMethodManager ag;
    private javax.inject.a ah;
    private javax.inject.a ai;
    private javax.inject.a aj;
    private boolean ak;
    private int al;
    private int am;
    private int an;
    private c b;
    private ab c;
    private v d;
    private View e;
    private TextView f;
    private ContactAutoCompleteTextView g;
    private TextView h;
    private es i;

    public ContactPickerFragment()
    {
        ac = null;
        ak = true;
        al = 0x7fffffff;
        am = o.too_many_user_warning_title;
        an = o.too_many_user_warning_message;
    }

    private boolean R()
    {
        return b != null;
    }

    private boolean T()
    {
        Optional optional = ab.b();
        if (optional.isPresent())
        {
            f.setText((CharSequence)optional.get());
            return true;
        } else
        {
            return false;
        }
    }

    private ce[] U()
    {
        Editable editable = g.getEditableText();
        return (ce[])editable.getSpans(0, editable.length(), com/facebook/orca/contacts/picker/ce);
    }

    private boolean V()
    {
        if (a().size() < al)
        {
            return false;
        } else
        {
            com.facebook.ui.d.a.a(n()).a(am).b(o().getString(an, new Object[] {
                Integer.valueOf(al)
            })).a();
            return true;
        }
    }

    static ContactAutoCompleteTextView a(ContactPickerFragment contactpickerfragment)
    {
        return contactpickerfragment.g;
    }

    static void a(ContactPickerFragment contactpickerfragment, int l)
    {
        contactpickerfragment.h(l);
    }

    private void a(s s)
    {
        if (!Objects.equal(s, ac) && c != null)
        {
            ac = s;
            c.a(s);
        }
    }

    static p b(ContactPickerFragment contactpickerfragment)
    {
        return contactpickerfragment.af;
    }

    static z c(ContactPickerFragment contactpickerfragment)
    {
        return contactpickerfragment.ad;
    }

    private void h(int l)
    {
        if (V())
        {
            af.b(g.getText());
            if (ae != null)
            {
                ae.a();
            }
        } else
        {
            Object obj = b.getItem(l);
            if (obj instanceof ag)
            {
                obj = ((ag)obj).a();
                g.a(((UserWithIdentifier) (obj)));
            } else
            if (obj instanceof com.facebook.orca.contacts.picker.j)
            {
                obj = ((com.facebook.orca.contacts.picker.j)obj).a();
                obj = Z.a(((String) (obj)));
                com.facebook.user.UserPhoneNumber userphonenumber = ((j) (obj)).a(0);
                obj = new UserWithIdentifier((new com.facebook.user.o()).a(n.PHONE_NUMBER, ((j) (obj)).b()).a(new Name(null, null, ((j) (obj)).c())).x(), userphonenumber);
                g.a(((UserWithIdentifier) (obj)));
            }
            if (ad != null)
            {
                ad.a(false);
                return;
            }
        }
    }

    public void A()
    {
        super.A();
        if (ak && R())
        {
            P();
        }
    }

    public void B()
    {
        super.B();
        ak = g.isPopupShowing();
    }

    void O()
    {
        es es1;
        if (i != null && !i.isEmpty())
        {
            et et1 = es.e();
            et1.b(b());
            et1.b(i);
            b.a().a(et1.b());
        } else
        {
            b.a().a(b());
        }
        es1 = a();
        if (es1.size() > 0)
        {
            a(((UserWithIdentifier)es1.get(0)).c().e());
            return;
        } else
        {
            a(((s) (null)));
            return;
        }
    }

    public void P()
    {
        b.a(es.d());
        g.setAdapter(new ae(b));
        g.setTextKeepState(g.getText());
        b.a().a(b());
    }

    public void Q()
    {
        ag.hideSoftInputFromWindow(g.getWindowToken(), 0);
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.a(layoutinflater, viewgroup, bundle);
        e = layoutinflater.inflate(k.orca_contact_picker, viewgroup, false);
        f = (TextView)a(e, com.facebook.i.contact_picker_heading);
        g = (ContactAutoCompleteTextView)a(e, com.facebook.i.contact_picker_autocomplete_input);
        h = (TextView)a(e, com.facebook.i.contact_picker_warning);
        return e;
    }

    public es a()
    {
        ce ace[] = U();
        et et1 = es.e();
        int i1 = ace.length;
        for (int l = 0; l < i1; l++)
        {
            et1.b(ace[l].a());
        }

        return et1.b();
    }

    public void a(Bundle bundle)
    {
        super.a(bundle);
        t t1 = S();
        Z = (i)t1.a(com/facebook/user/i);
        aa = (AddressBookPeriodicRunner)t1.a(com/facebook/contacts/database/AddressBookPeriodicRunner);
        af = (p)t1.a(com/facebook/orca/contacts/picker/p);
        ah = t1.b(com/facebook/contacts/picker/c, com/facebook/orca/annotations/ForMergedComposer);
        ai = t1.b(com/facebook/contacts/picker/c, com/facebook/orca/annotations/ForAddressBook);
        aj = t1.b(com/facebook/contacts/picker/c, com/facebook/orca/annotations/ForFacebookList);
        aa.a();
        if (bundle != null)
        {
            ak = bundle.getBoolean("selectionOnResume", true);
        }
        ab = (a)t1.a(com/facebook/messages/a/a/a);
        ag = (InputMethodManager)t1.a(android/view/inputmethod/InputMethodManager);
    }

    public void a(v v1)
    {
        d = v1;
    }

    public void a(aa aa1)
    {
        ae = aa1;
    }

    public void a(ab ab1)
    {
        c = ab1;
    }

    public void a(x x1)
    {
        Preconditions.checkNotNull(d, "must set row creator before setting list type");
        com.facebook.orca.contacts.picker.w.a[x1.ordinal()];
        JVM INSTR tableswitch 1 3: default 44
    //                   1 61
    //                   2 80
    //                   3 99;
           goto _L1 _L2 _L3 _L4
_L1:
        b.a().a(d);
        return;
_L2:
        b = (c)aj.b();
        continue; /* Loop/switch isn't completed */
_L3:
        b = (c)ai.b();
        continue; /* Loop/switch isn't completed */
_L4:
        b = (c)ah.b();
        if (true) goto _L1; else goto _L5
_L5:
    }

    public void a(y y1)
    {
        if (y1 == y.CREATE_THREAD)
        {
            if (!T())
            {
                f.setText(o.contact_picker_to_heading);
            }
            h.setVisibility(8);
            return;
        } else
        {
            f.setText(o.contact_picker_add_heading);
            h.setVisibility(0);
            return;
        }
    }

    public void a(z z1)
    {
        ad = z1;
    }

    public void a(UserWithIdentifier userwithidentifier)
    {
        g.a(userwithidentifier);
    }

    public void a(es es1)
    {
        i = es1;
    }

    public void a(String s)
    {
        g.setHint(s);
    }

    public void a(List list)
    {
        g.getEditableText().clear();
        Object obj;
        for (list = list.iterator(); list.hasNext(); g.a(((UserWithIdentifier) (obj))))
        {
            obj = (User)list.next();
            obj = new UserWithIdentifier(((User) (obj)), new UserFbidIdentifier(((User) (obj)).b()));
        }

    }

    public es b()
    {
        ce ace[] = U();
        et et1 = es.e();
        int i1 = ace.length;
        for (int l = 0; l < i1; l++)
        {
            et1.b(ace[l].a().c().c());
        }

        return et1.b();
    }

    public void b(UserWithIdentifier userwithidentifier)
    {
        if (V())
        {
            return;
        } else
        {
            g.a(userwithidentifier);
            return;
        }
    }

    public s c()
    {
        return ac;
    }

    public void c(UserWithIdentifier userwithidentifier)
    {
        g.b(userwithidentifier);
    }

    public void d()
    {
        g.setEnabled(false);
    }

    public void d(Bundle bundle)
    {
        super.d(bundle);
        g.setOnItemClickListener(new com.facebook.orca.contacts.picker.u(this));
        g.addTextChangedListener(new com.facebook.orca.contacts.picker.v(this));
        T();
    }

    public void e(int l)
    {
        al = l;
    }

    public void e(Bundle bundle)
    {
        if (bundle != null)
        {
            bundle.putBoolean("selectionOnResume", ak);
        }
    }

    public void f(int l)
    {
        am = l;
    }

    public void g(int l)
    {
        an = l;
    }

}

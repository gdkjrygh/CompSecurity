// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.divebar;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup;
import com.facebook.analytics.av;
import com.facebook.analytics.i.c;
import com.facebook.contacts.picker.ContactPickerColorScheme;
import com.facebook.contacts.picker.ag;
import com.facebook.contacts.picker.ah;
import com.facebook.contacts.picker.ap;
import com.facebook.contacts.picker.as;
import com.facebook.contacts.picker.ba;
import com.facebook.contacts.picker.p;
import com.facebook.contacts.picker.r;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.o;
import com.facebook.orca.contacts.picker.ad;
import com.facebook.orca.contacts.picker.bg;
import com.facebook.orca.contacts.picker.j;
import com.facebook.user.Name;
import com.facebook.user.UserWithIdentifier;
import com.facebook.user.i;
import com.facebook.user.n;
import com.facebook.widget.f;
import com.google.common.a.es;

// Referenced classes of package com.facebook.orca.contacts.divebar:
//            DivebarChatAvailabilityWarning, bf, bg, bh, 
//            h, bi, aa, bl, 
//            bj

public class be extends f
{

    private final as a;
    private final bg b;
    private final i c;
    private ViewGroup d;
    private r e;
    private final DivebarChatAvailabilityWarning f;
    private bl g;

    public be(Context context, com.facebook.contacts.picker.c c1, ContactPickerColorScheme contactpickercolorscheme)
    {
        super(context);
        contactpickercolorscheme = t.a(context);
        c = (i)contactpickercolorscheme.a(com/facebook/user/i);
        a = new as(context, c1, k.orca_contact_picker_view_for_divebar);
        a.setSearchHint(context.getString(o.name_search_hint));
        addView(a);
        f = (DivebarChatAvailabilityWarning)getView(com.facebook.i.divebar_availability_warning);
        a.setOnRowClickedListener(new bf(this));
        a.setSearchStartedListener(new com.facebook.orca.contacts.divebar.bg(this));
        a.setSearchPerformedListener(new bh(this));
        d = (ViewGroup)getView(com.facebook.i.divebar_header_view_container);
        e = new r(d);
        e.a((p)contactpickercolorscheme.a(com/facebook/orca/contacts/divebar/h));
        b = (bg)contactpickercolorscheme.a(com/facebook/orca/contacts/picker/bg);
        a.setOnSearchBoxFocusChangeListener(new bi(this));
        e.a((p)contactpickercolorscheme.a(com/facebook/orca/contacts/divebar/aa));
        setBackgroundDrawable(new ColorDrawable(getResources().getColor(com.facebook.f.divebar_contact_background)));
    }

    static bl a(be be1)
    {
        return be1.g;
    }

    private void a(com.facebook.contacts.picker.ad ad1, int l)
    {
        if (g != null)
        {
            if (ad1 instanceof ag)
            {
                ag ag1 = (ag)ad1;
                setLastNavigationTapPoint(ad1);
                g.a(ag1.a(), a.c(), ad1, "divebar", l);
            } else
            {
                if (ad1 instanceof ad)
                {
                    ad ad2 = (ad)ad1;
                    g.a(ad2.a(), a.c(), ad1, "divebar");
                    return;
                }
                if (ad1 instanceof j)
                {
                    Object obj = ((j)ad1).a();
                    obj = c.a(((String) (obj)));
                    com.facebook.user.UserPhoneNumber userphonenumber = ((com.facebook.user.j) (obj)).a(0);
                    obj = new UserWithIdentifier((new com.facebook.user.o()).a(n.PHONE_NUMBER, ((com.facebook.user.j) (obj)).b()).a(new Name(null, null, ((com.facebook.user.j) (obj)).c())).x(), userphonenumber);
                    g.a(((UserWithIdentifier) (obj)), a.c(), ad1, "divebar", l);
                    return;
                }
            }
        }
    }

    static void a(be be1, com.facebook.contacts.picker.ad ad1, int l)
    {
        be1.a(ad1, l);
    }

    static ViewGroup b(be be1)
    {
        return be1.d;
    }

    static DivebarChatAvailabilityWarning c(be be1)
    {
        return be1.f;
    }

    private void setLastNavigationTapPoint(com.facebook.contacts.picker.ad ad1)
    {
        ah ah1;
        ah1 = ((ag)ad1).j();
        ad1 = null;
        bj.a[ah1.ordinal()];
        JVM INSTR tableswitch 1 8: default 64
    //                   1 82
    //                   2 89
    //                   3 96
    //                   4 103
    //                   5 110
    //                   6 117
    //                   7 124
    //                   8 131;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        if (ad1 != null)
        {
            com.facebook.analytics.i.c.a(getContext()).a(ad1);
        }
        return;
_L2:
        ad1 = "via_chat_bar_active_chats_section";
        continue; /* Loop/switch isn't completed */
_L3:
        ad1 = "via_chat_bar_auto_complete_section";
        continue; /* Loop/switch isn't completed */
_L4:
        ad1 = "via_chat_bar_favorite_friends_section";
        continue; /* Loop/switch isn't completed */
_L5:
        ad1 = "via_chat_bar_nearby_friends_section";
        continue; /* Loop/switch isn't completed */
_L6:
        ad1 = "via_chat_bar_search_result_section";
        continue; /* Loop/switch isn't completed */
_L7:
        ad1 = "via_chat_bar_suggestions_section";
        continue; /* Loop/switch isn't completed */
_L8:
        ad1 = "via_chat_bar_top_friends_section";
        continue; /* Loop/switch isn't completed */
_L9:
        ad1 = "via_chat_bar_unknown_section";
        if (true) goto _L1; else goto _L10
_L10:
    }

    public void a()
    {
        a.a();
    }

    public void a(android.view.View.OnClickListener onclicklistener, android.view.View.OnClickListener onclicklistener1, int l)
    {
        b.a(onclicklistener, onclicklistener1, l);
        e.a(b);
    }

    public void a(es es)
    {
        a.a(es);
        f.a();
    }

    public void b()
    {
        b.b();
    }

    public void c()
    {
        b.c();
    }

    public void d()
    {
        a.b();
    }

    public r getContactPickerHeaderViewManager()
    {
        return e;
    }

    public String getSearchBoxText()
    {
        return a.getSearchBoxText();
    }

    public void setContactPickerViewListener(bl bl1)
    {
        g = bl1;
    }

    public void setOnContactListScrollListener(ap ap)
    {
        a.setOnContactListScrollListener(ap);
    }

    public void setOnFilterStateChangedListener(ba ba)
    {
        a.setOnFilterStateChangedListener(ba);
    }

    public void setSearchBoxText(String s)
    {
        if (s.length() == 0)
        {
            a.e();
            return;
        } else
        {
            a.setSearchBoxText(s);
            return;
        }
    }

    public void setSearchHint(String s)
    {
        a.setSearchHint(s);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.picker;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.facebook.analytics.av;
import com.facebook.analytics.cb;
import com.facebook.c.s;
import com.facebook.contacts.picker.ContactPickerColorScheme;
import com.facebook.contacts.picker.ad;
import com.facebook.h;
import com.facebook.i;
import com.facebook.inject.t;
import com.facebook.o;
import com.facebook.orca.activity.AddContactsActivity;
import com.facebook.widget.f;

// Referenced classes of package com.facebook.orca.contacts.picker:
//            j, l

public class k extends f
{

    private static final StyleSpan a = new StyleSpan(1);
    private final View b;
    private final TextView c;
    private final View d;
    private final com.facebook.user.i e;
    private final av f;
    private final s g;
    private ad h;

    public k(Context context)
    {
        this(context, null);
    }

    public k(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public k(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        setContentView(com.facebook.k.orca_contact_picker_additional_list_item);
        b = findViewById(i.contact_container);
        c = (TextView)findViewById(i.additional_text_field);
        d = getView(i.contact_divider);
        context = t.a(context);
        e = (com.facebook.user.i)context.a(com/facebook/user/i);
        f = (av)context.a(com/facebook/analytics/av);
        g = (s)context.a(com/facebook/c/s);
    }

    private SpannableString a(int i1, String s1)
    {
        SpannableString spannablestring = new SpannableString(getResources().getString(i1, new Object[] {
            s1
        }));
        spannablestring.setSpan(a, spannablestring.length() - s1.length(), spannablestring.length(), 17);
        return spannablestring;
    }

    private void a()
    {
        if (h instanceof com.facebook.contacts.picker.t)
        {
            c();
            return;
        }
        if (h instanceof j)
        {
            b();
            return;
        } else
        {
            throw new IllegalStateException("Row is either null or row type is not supported.");
        }
    }

    static void a(k k1, String s1)
    {
        k1.a(s1);
    }

    private void a(String s1)
    {
        f.a((new cb("click")).f("view").g("contact_picker_invite_person_by_phone"));
        Intent intent = new Intent(getContext(), com/facebook/orca/activity/AddContactsActivity);
        intent.putExtra("phone_number", s1);
        g.a(intent, getContext());
    }

    private void b()
    {
        Object obj = (j)h;
        int i1;
        if (((j) (obj)).b() == com.facebook.user.s.EMAIL)
        {
            i1 = o.add_person_by_email_auto_complete_text;
            obj = ((j) (obj)).a();
        } else
        {
            i1 = o.add_person_by_phone_auto_complete_text;
            obj = e.c(((j) (obj)).a());
        }
        c.setText(a(i1, ((String) (obj))));
    }

    private void c()
    {
        String s1 = ((com.facebook.contacts.picker.t)h).a();
        String s2 = e.c(s1);
        c.setText(a(o.invite_person_by_phone_auto_complete_text, s2));
        setOnClickListener(new l(this, s1));
    }

    public void setColorScheme(ContactPickerColorScheme contactpickercolorscheme)
    {
        Resources resources = getResources();
        if (contactpickercolorscheme == ContactPickerColorScheme.DEFAULT_SCHEME)
        {
            b.setBackgroundDrawable(null);
            if (c != null)
            {
                c.setTextColor(resources.getColor(com.facebook.f.default_contacts_section_text));
            }
            d.setBackgroundDrawable(new ColorDrawable(h.default_separator_color));
        } else
        if (contactpickercolorscheme == ContactPickerColorScheme.DIVEBAR_SCHEME)
        {
            b.setBackgroundDrawable(resources.getDrawable(h.divebar_contact_bg));
            if (c != null)
            {
                c.setTextColor(resources.getColor(com.facebook.f.divebar_contact_name_text));
            }
            d.setBackgroundDrawable(new ColorDrawable(resources.getColor(com.facebook.f.divebar_contact_divider)));
            return;
        }
    }

    public void setContactRow(ad ad)
    {
        h = ad;
        a();
    }

}

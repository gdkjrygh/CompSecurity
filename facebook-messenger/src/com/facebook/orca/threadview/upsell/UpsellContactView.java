// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview.upsell;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.TextView;
import com.facebook.common.w.m;
import com.facebook.contacts.models.Contact;
import com.facebook.contacts.models.e;
import com.facebook.i;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.o;
import com.facebook.orca.photos.a.a;
import com.facebook.user.Name;
import com.facebook.user.tiles.UserTileView;
import com.facebook.widget.f;

// Referenced classes of package com.facebook.orca.threadview.upsell:
//            j, k

public class UpsellContactView extends f
{

    private final e a;
    private final UserTileView b;
    private final TextView c;
    private final ImageButton d;
    private com.facebook.orca.threadview.upsell.k e;

    public UpsellContactView(Context context)
    {
        this(context, null);
    }

    public UpsellContactView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public UpsellContactView(Context context, AttributeSet attributeset, int l)
    {
        super(context, attributeset, l);
        a = (e)getInjector().a(com/facebook/contacts/models/e);
        setContentView(k.orca_merged_threads_upsell_contact);
        b = (UserTileView)getView(i.upsell_contact_image);
        c = (TextView)getView(i.upsell_contact_message);
        d = (ImageButton)getView(i.upsell_learn_more_arrow_button);
        d.setOnClickListener(new j(this));
    }

    static com.facebook.orca.threadview.upsell.k a(UpsellContactView upsellcontactview)
    {
        return upsellcontactview.e;
    }

    public void setContact(Contact contact)
    {
        b.setParams(com.facebook.orca.photos.a.a.a(contact, a));
        contact = m.b(getResources().getString(o.merged_thread_upsell_intro_blurb), new Object[] {
            contact.getName().f()
        });
        c.setText(contact);
    }

    public void setListener(com.facebook.orca.threadview.upsell.k k1)
    {
        e = k1;
    }
}

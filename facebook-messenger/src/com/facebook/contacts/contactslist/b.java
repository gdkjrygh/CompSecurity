// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.contactslist;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.contacts.models.Contact;
import com.facebook.contacts.models.e;
import com.facebook.i;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.orca.photos.a.a;
import com.facebook.user.Name;
import com.facebook.user.tiles.UserTileView;
import com.facebook.widget.f;

public class b extends f
{

    private final TextView a;
    private final TextView b;
    private final UserTileView c;
    private final ImageView d;
    private e e;
    private Contact f;

    public b(Context context)
    {
        this(context, null);
    }

    public b(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public b(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        setContentView(k.contacts_list_row);
        a = (TextView)getView(i.contact_name);
        b = (TextView)getView(i.contact_status);
        c = (UserTileView)getView(i.contact_user_tile_image);
        d = (ImageView)getView(i.contact_indicator);
        e = (e)getInjector().a(com/facebook/contacts/models/e);
    }

    public void setContact(Contact contact)
    {
        f = contact;
        a.setText(contact.getName().getDisplayName());
        c.setParams(com.facebook.orca.photos.a.a.a(f, e));
        b.setVisibility(8);
    }
}

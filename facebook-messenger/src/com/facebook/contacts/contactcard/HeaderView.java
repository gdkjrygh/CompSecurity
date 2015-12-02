// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.contactcard;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.facebook.contacts.models.Contact;
import com.facebook.contacts.models.e;
import com.facebook.i;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.l.x;
import com.facebook.orca.p.b;
import com.facebook.orca.photos.a.a;
import com.facebook.orca.threadview.v;
import com.facebook.user.Name;
import com.facebook.user.tiles.UserTileView;
import com.facebook.widget.f;

// Referenced classes of package com.facebook.contacts.contactcard:
//            an

public class HeaderView extends f
{

    private final b a;
    private final e b;
    private final UserTileView c;
    private final TextView d;
    private final TextView e;
    private Contact f;
    private v g;
    private x h;

    public HeaderView(Context context)
    {
        this(context, null);
    }

    public HeaderView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public HeaderView(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        h = x.a;
        context = getInjector();
        a = (b)context.a(com/facebook/orca/p/b);
        b = (e)context.a(com/facebook/contacts/models/e);
        setContentView(k.contacts_header_view);
        c = (UserTileView)getView(i.contact_user_tile_image);
        d = (TextView)getView(i.contact_name);
        e = (TextView)getView(i.last_active);
        context = new an(this);
        a.a(context);
    }

    static void a(HeaderView headerview, x x1)
    {
        headerview.a(x1);
    }

    private void a(x x1)
    {
        if (h == x1)
        {
            return;
        } else
        {
            b(x1);
            return;
        }
    }

    private void b()
    {
        if (g != null)
        {
            String s = a.d();
            if (s != null)
            {
                e.setText(s);
            }
        }
    }

    private void b(x x1)
    {
        h = x1;
        b();
    }

    public void a()
    {
        c.setParams(null);
        d.setText("");
        e.setText("");
        a.a(false);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        a.a(true);
        b(a.c());
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        a.a(false);
    }

    public void setContact(Contact contact)
    {
        f = contact;
        if (c.getParams() == null)
        {
            c.setParams(com.facebook.orca.photos.a.a.a(contact, b));
        }
        d.setText(contact.getName().f());
        e.setText("");
        b();
    }

    public void setPlaceholderName(String s)
    {
        d.setText(s);
    }

    public void setThreadNameViewData(v v)
    {
        g = v;
        a.a(v);
        b(a.c());
    }
}

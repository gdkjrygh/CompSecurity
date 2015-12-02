// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.picker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.facebook.contacts.picker.ContactPickerColorScheme;
import com.facebook.contacts.picker.ag;
import com.facebook.contacts.picker.ai;
import com.facebook.h;
import com.facebook.i;
import com.facebook.k;
import com.facebook.o;
import com.facebook.orca.presence.PresenceIndicatorView;
import com.facebook.user.ChatContext;
import com.facebook.user.User;
import com.facebook.user.UserIdentifier;
import com.facebook.user.UserWithIdentifier;
import com.facebook.user.n;
import com.facebook.user.tiles.UserTileView;
import com.facebook.user.tiles.e;
import com.facebook.widget.f;

public class ao extends f
{

    private static final Class a = com/facebook/orca/contacts/picker/ao;
    private TextView b;
    private TextView c;
    private UserTileView d;
    private PresenceIndicatorView e;
    private View f;
    private ToggleButton g;
    private ag h;

    public ao(Context context)
    {
        super(context);
        a(context);
    }

    private void a()
    {
        User user = h.b();
        b.setText(user.g());
        d.setParams(com.facebook.user.tiles.e.a(user));
        b();
        c();
        d();
        h();
    }

    private void a(Context context)
    {
        setContentView(k.orca_contact_picker_list_item);
        b = (TextView)getView(i.contact_name);
        c = (TextView)getView(i.contact_status);
        d = (UserTileView)getView(i.contact_user_tile_image);
        e = (PresenceIndicatorView)getView(i.contact_presence_indicator);
        f = getView(i.contact_divider);
        g = (ToggleButton)getView(i.is_picked_checkbox);
    }

    private void b()
    {
        if (l())
        {
            return;
        }
        User user = h.b();
        e.setShowIcon(h.i());
        if (user.a() == n.FACEBOOK)
        {
            if (m())
            {
                e.setStatus(com.facebook.orca.presence.i.NEARBY);
                return;
            }
            if (h.d())
            {
                e.setStatus(com.facebook.orca.presence.i.ONLINE);
                return;
            }
            if (h.e())
            {
                if (i() || k())
                {
                    e.a(com.facebook.orca.presence.i.PUSHABLE, h.f(), h.g());
                    return;
                } else
                {
                    e.setStatus(com.facebook.orca.presence.i.PUSHABLE);
                    return;
                }
            } else
            {
                e.setStatus(com.facebook.orca.presence.i.NONE);
                return;
            }
        } else
        {
            e.setStatus(com.facebook.orca.presence.i.NONE);
            return;
        }
    }

    private void c()
    {
        boolean flag1 = false;
        User user = h.b();
        int i1;
        boolean flag;
        if (j() || l() || i())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (user.a() == n.FACEBOOK)
        {
            if (h.h() != null)
            {
                i1 = 1;
            } else
            {
                i1 = ((flag) ? 1 : 0);
                if (!h.d())
                {
                    i1 = ((flag) ? 1 : 0);
                    if (!h.e())
                    {
                        i1 = ((flag) ? 1 : 0);
                        if (user.B() == null)
                        {
                            i1 = ((flag) ? 1 : 0);
                            if (user.A() == null)
                            {
                                i1 = 0;
                            }
                        }
                    }
                }
            }
        } else
        {
            i1 = ((flag) ? 1 : 0);
            if (user.a() != n.ADDRESS_BOOK)
            {
                i1 = 0;
            }
        }
        if (i1 != 0)
        {
            i1 = ((flag1) ? 1 : 0);
        } else
        {
            i1 = 8;
        }
        c.setVisibility(i1);
    }

    private void d()
    {
        User user = h.b();
        if (user.a() != n.FACEBOOK) goto _L2; else goto _L1
_L1:
        if (h.h() == null) goto _L4; else goto _L3
_L3:
        c.setText(h.h().getSubtext());
_L6:
        return;
_L4:
        if (l() || i())
        {
            e();
            return;
        }
        if (j())
        {
            f();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (user.a() == n.ADDRESS_BOOK && (l() || i() || j()))
        {
            UserIdentifier useridentifier = h.a().c();
            c.setText(useridentifier.a(getResources()));
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void e()
    {
        if (h.d())
        {
            c.setText(o.rich_presence_active);
            return;
        }
        if (h.e())
        {
            c.setText(o.rich_presence_notification_on);
            return;
        } else
        {
            g();
            return;
        }
    }

    private void f()
    {
        if (h.d())
        {
            c.setText(o.presence_active_now);
            return;
        }
        if (h.e())
        {
            if (!com.facebook.common.w.n.a(h.f()))
            {
                c.setText(h.f());
                return;
            } else
            {
                c.setText(o.presence_mobile);
                return;
            }
        } else
        {
            g();
            return;
        }
    }

    private void g()
    {
        User user = h.b();
        if (user.B() != null)
        {
            c.setText(user.B());
        } else
        if (user.A() != null)
        {
            c.setText(user.A());
            return;
        }
    }

    private void h()
    {
        if (h.l())
        {
            g.setVisibility(0);
            g.setChecked(h.k());
            return;
        } else
        {
            g.setVisibility(8);
            return;
        }
    }

    private boolean i()
    {
        return h.c() == ai.TWO_LINE_RICH_PRESENCE;
    }

    private boolean j()
    {
        return h.c() == ai.TWO_LINE;
    }

    private boolean k()
    {
        return h.c() == ai.ONE_LINE;
    }

    private boolean l()
    {
        return h.c() == ai.TEXT_ONLY;
    }

    private boolean m()
    {
        ChatContext chatcontext = h.h();
        if (chatcontext == null)
        {
            return false;
        } else
        {
            return chatcontext.a();
        }
    }

    public ag getContactRow()
    {
        return h;
    }

    public void setColorScheme(ContactPickerColorScheme contactpickercolorscheme)
    {
        Resources resources = getResources();
        if (contactpickercolorscheme == ContactPickerColorScheme.DEFAULT_SCHEME)
        {
            setBackgroundDrawable(new ColorDrawable(resources.getColor(com.facebook.f.default_contacts_contact_background)));
            f.setBackgroundDrawable(new ColorDrawable(resources.getColor(com.facebook.f.default_separator_color)));
            b.setTextColor(resources.getColor(com.facebook.f.default_contacts_contact_name_text));
            c.setTextColor(resources.getColor(com.facebook.f.default_contacts_contact_status_text));
            e.setTextColor(resources.getColor(com.facebook.f.default_contacts_contact_status_text));
        } else
        if (contactpickercolorscheme == ContactPickerColorScheme.DIVEBAR_SCHEME)
        {
            setBackgroundDrawable(resources.getDrawable(h.divebar_contact_bg));
            f.setBackgroundDrawable(new ColorDrawable(resources.getColor(com.facebook.f.divebar_contact_divider)));
            b.setTextColor(resources.getColor(com.facebook.f.divebar_contact_name_text));
            c.setTextColor(resources.getColor(com.facebook.f.divebar_contact_status_text));
            e.setTextColor(resources.getColor(com.facebook.f.divebar_contact_status_text));
            return;
        }
    }

    public void setContactRow(ag ag1)
    {
        h = ag1;
        a();
    }

}

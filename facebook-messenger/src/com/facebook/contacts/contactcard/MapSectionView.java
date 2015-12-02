// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.contactcard;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.contacts.contactcard.entry.LabelValueRowView;
import com.facebook.i;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.location.Coordinates;
import com.facebook.maps.MapImage;
import com.facebook.messages.model.threads.Message;
import com.facebook.messages.model.threads.ParticipantInfo;
import com.facebook.orca.threads.MessagesCollection;
import com.facebook.orca.threads.n;
import com.facebook.user.UserKey;
import com.facebook.widget.e;
import com.facebook.zero.a.c;
import com.facebook.zero.ui.o;
import com.google.common.a.es;
import com.google.common.a.ik;
import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.facebook.contacts.contactcard:
//            ar, as, x

public class MapSectionView extends e
{

    private final n a;
    private final View b;
    private final View c;
    private final TextView d;
    private final MapImage e;
    private final ViewGroup f;
    private final LabelValueRowView g;
    private x h;
    private o i;
    private String j;

    public MapSectionView(Context context)
    {
        this(context, null);
    }

    public MapSectionView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = getInjector();
        a = (n)context.a(com/facebook/orca/threads/n);
        i = (o)context.a(com/facebook/zero/ui/o);
        setOrientation(1);
        setContentView(k.contacts_map_section_view);
        b = a(i.contacts_map_label_wrapper);
        c = a(i.contacts_map_image_wrapper);
        d = (TextView)a(i.contacts_map_last_shared);
        f = (ViewGroup)a(i.show_map_section);
        g = (LabelValueRowView)a(i.show_map_row);
        g.setLabelText(com.facebook.o.zero_show_map_button_title);
        g.setOnClickListener(new ar(this));
        e = (MapImage)a(i.contacts_map_image);
        e.setOnClickListener(new as(this));
        if (i.a(c.h))
        {
            j = "behind_button";
        } else
        {
            j = "visible";
        }
        if (j == "visible")
        {
            e.setZoom(-1);
            return;
        } else
        {
            setMapVisibility(false);
            f.setVisibility(0);
            return;
        }
    }

    static x a(MapSectionView mapsectionview)
    {
        return mapsectionview.h;
    }

    private void a(Message message)
    {
        long l = message.f();
        message = a.a(l);
        message = getResources().getString(com.facebook.o.contact_card_map_last_shared, new Object[] {
            message
        });
        d.setText(message);
    }

    private void setMapVisibility(boolean flag)
    {
        boolean flag1 = false;
        Object obj = f;
        int l;
        if (flag)
        {
            l = 0;
        } else
        {
            l = 8;
        }
        ((ViewGroup) (obj)).setVisibility(l);
        obj = b;
        if (flag)
        {
            l = 0;
        } else
        {
            l = 8;
        }
        ((View) (obj)).setVisibility(l);
        obj = c;
        if (flag)
        {
            l = ((flag1) ? 1 : 0);
        } else
        {
            l = 8;
        }
        ((View) (obj)).setVisibility(l);
    }

    public void a()
    {
        setMapVisibility(false);
    }

    public void a(MessagesCollection messagescollection, UserKey userkey)
    {
        Iterator iterator;
        if (j == "behind_button")
        {
            return;
        }
        Preconditions.checkNotNull(messagescollection);
        iterator = messagescollection.b().iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        messagescollection = (Message)iterator.next();
        if (!userkey.equals(messagescollection.i().e()) || messagescollection.n() == null) goto _L4; else goto _L3
_L3:
        if (messagescollection != null)
        {
            setMapVisibility(true);
            e.setKeepMarkerAtCenter(true);
            e.a();
            userkey = messagescollection.n().a();
            e.setCenter(userkey);
            a(((Message) (messagescollection)));
            return;
        } else
        {
            setMapVisibility(false);
            return;
        }
_L2:
        messagescollection = null;
        if (true) goto _L3; else goto _L5
_L5:
    }

    public void setContactCardListener(x x)
    {
        h = x;
    }

    public void setGroupMessages(MessagesCollection messagescollection)
    {
        if (j == "behind_button")
        {
            return;
        }
        Preconditions.checkNotNull(messagescollection);
        java.util.HashMap hashmap = ik.a();
        messagescollection = messagescollection.b().iterator();
        do
        {
            if (!messagescollection.hasNext())
            {
                break;
            }
            Message message = (Message)messagescollection.next();
            UserKey userkey = message.i().e();
            if (!hashmap.containsKey(userkey) && message.n() != null)
            {
                hashmap.put(userkey, message);
            }
        } while (true);
        if (!hashmap.isEmpty())
        {
            setMapVisibility(true);
            e.a();
            e.setKeepMarkerAtCenter(false);
            messagescollection = null;
            Iterator iterator = hashmap.values().iterator();
            while (iterator.hasNext()) 
            {
                Message message1 = (Message)iterator.next();
                Object obj = message1.n();
                if (obj != null)
                {
                    e.a(((Coordinates) (obj)).a());
                }
                obj = message1;
                if (messagescollection != null)
                {
                    if (message1.f() > messagescollection.f())
                    {
                        obj = message1;
                    } else
                    {
                        obj = messagescollection;
                    }
                }
                messagescollection = ((MessagesCollection) (obj));
            }
            a(messagescollection);
            return;
        } else
        {
            setMapVisibility(false);
            return;
        }
    }

    public void setVisibilityMode(String s)
    {
        j = s;
        if (j == "visible")
        {
            setMapVisibility(true);
            e.setZoom(-1);
            f.setVisibility(8);
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.contactcard;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.support.v4.app.i;
import android.support.v4.app.q;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.analytics.av;
import com.facebook.analytics.cb;
import com.facebook.common.w.n;
import com.facebook.h;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.orca.f.z;
import com.facebook.orca.images.ThreadIconPickerActivity;
import com.facebook.orca.server.an;
import com.facebook.orca.threads.ThreadSummary;
import com.facebook.orca.threadview.ThreadViewFragment;
import com.facebook.orca.threadview.as;
import com.facebook.user.tiles.a;
import com.facebook.widget.d;
import com.facebook.widget.images.UrlImage;
import com.google.common.base.Objects;
import java.util.Locale;

// Referenced classes of package com.facebook.contacts.contactcard:
//            at, au, av

public class NameConversationView extends d
{

    private final z a;
    private final RelativeLayout b;
    private final TextView c;
    private final UrlImage d;
    private ThreadSummary e;
    private String f;
    private ThreadViewFragment g;
    private av h;

    public NameConversationView(Context context)
    {
        this(context, null);
    }

    public NameConversationView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public NameConversationView(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        g = (ThreadViewFragment)((i)context).f().a("threadViewFragment");
        context = getInjector();
        a = (z)context.a(com/facebook/orca/f/z);
        h = (av)context.a(com/facebook/analytics/av);
        setContentView(k.contacts_name_conversation_view);
        b = (RelativeLayout)c(com.facebook.i.contact_card_thread_name_and_tile);
        d = (UrlImage)c(com.facebook.i.thread_view_details_item_thread_tile);
        c = (TextView)c(com.facebook.i.thread_view_details_item_value);
        b.setClickable(true);
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            b.setBackgroundResource(h.orca_item_background_holo_light);
        } else
        {
            b.setBackgroundResource(0x1080062);
        }
        if (Objects.equal(Locale.getDefault().getLanguage(), "es"))
        {
            c.setTextSize(15F);
        }
        d.setFocusable(true);
        d.setClickable(true);
        d.setOnClickListener(new at(this));
        b.setOnClickListener(new au(this));
    }

    static String a(NameConversationView nameconversationview, String s)
    {
        nameconversationview.f = s;
        return s;
    }

    private String a(String s)
    {
        String s1 = s;
        if (n.a(s))
        {
            s1 = "";
        }
        return s1;
    }

    private void a()
    {
        if (e == null || !e.v())
        {
            return;
        } else
        {
            a((new cb("click")).f("button").g("thread_image"));
            Intent intent = new Intent(getContext(), com/facebook/orca/images/ThreadIconPickerActivity);
            intent.putExtra("threadId", e.a());
            intent.putExtra("hasPictureHash", e.r());
            getContext().startActivity(intent);
            return;
        }
    }

    private void a(cb cb1)
    {
        cb1.e("NameConversationView");
        if (e != null)
        {
            cb1.b("thread_id", e.a());
        }
        h.a(cb1);
    }

    static void a(NameConversationView nameconversationview)
    {
        nameconversationview.a();
    }

    private void b()
    {
        if (!e.v())
        {
            return;
        } else
        {
            a((new cb("click")).f("button").g("name_conversation"));
            as as1 = new as(getContext(), f);
            as1.a(new com.facebook.contacts.contactcard.av(this));
            as1.show();
            return;
        }
    }

    static void b(NameConversationView nameconversationview)
    {
        nameconversationview.b();
    }

    private void c()
    {
        c.setText(f);
        if (n.a(f, e.g()))
        {
            return;
        } else
        {
            Object obj = new an();
            ((an) (obj)).a(e.a());
            ((an) (obj)).a(true);
            ((an) (obj)).b(a(f));
            obj = ((an) (obj)).h();
            g.a(((com.facebook.orca.server.ModifyThreadParams) (obj)));
            a((new cb("set")).f("thread_name"));
            return;
        }
    }

    static void c(NameConversationView nameconversationview)
    {
        nameconversationview.c();
    }

    public void a(String s, ThreadSummary threadsummary)
    {
        e = threadsummary;
        f = threadsummary.g();
        c.setText(s);
        s = new LayerDrawable(new Drawable[] {
            new ColorDrawable(a.a), getResources().getDrawable(h.orca_default_camera_tile)
        });
        d.setPlaceHolderDrawable(s);
        if (threadsummary != null)
        {
            d.setImageParams(a.a(threadsummary, false));
            return;
        } else
        {
            d.setImageParams(UrlImage.a);
            return;
        }
    }
}

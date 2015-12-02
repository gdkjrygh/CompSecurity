// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.divebar;

import android.content.Context;
import android.widget.Button;
import android.widget.ImageButton;
import com.facebook.analytics.av;
import com.facebook.i;
import com.facebook.k;
import com.facebook.widget.e;

// Referenced classes of package com.facebook.orca.contacts.divebar:
//            n, o, p, q

public class m extends e
{

    private final q a;
    private final av b;

    public m(Context context, av av, q q)
    {
        super(context);
        b = av;
        a = q;
        setContentView(k.orca_divebar_contacts_uploader);
        ((Button)a(i.divebar_contacts_uploader_enable_button)).setOnClickListener(new n(this));
        ((Button)a(i.divebar_contacts_uploader_learn_more_button)).setOnClickListener(new o(this));
        ((ImageButton)a(i.divebar_contacts_uploader_dismiss_button)).setOnClickListener(new p(this));
    }

    static av a(m m1)
    {
        return m1.b;
    }

    static q b(m m1)
    {
        return m1.a;
    }
}

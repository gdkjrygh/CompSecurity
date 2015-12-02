// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadlist;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.TextView;
import com.facebook.appconfig.m;
import com.facebook.i;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.orca.c.a;
import com.facebook.orca.prefs.o;
import com.facebook.widget.d;
import com.google.common.base.Objects;

// Referenced classes of package com.facebook.orca.threadlist:
//            bp

public class VersionUpgradePromoView extends d
{

    private final a a;
    private final com.facebook.prefs.shared.d b;
    private final com.facebook.config.a.a c;
    private final m d;
    private TextView e;
    private Button f;
    private long g;

    public VersionUpgradePromoView(Context context)
    {
        this(context, null, 0);
    }

    public VersionUpgradePromoView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public VersionUpgradePromoView(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        context = getInjector();
        a = (a)context.a(com/facebook/orca/c/a);
        b = (com.facebook.prefs.shared.d)context.a(com/facebook/prefs/shared/d);
        c = (com.facebook.config.a.a)context.a(com/facebook/config/a/a);
        d = (m)context.a(com/facebook/appconfig/m);
        setContentView(k.orca_version_upgrade_promo);
        e = (TextView)c(i.version_text);
        f = (Button)c(i.version_get_it_button);
        f.setOnClickListener(new bp(this));
        setVisibility(8);
    }

    static void a(VersionUpgradePromoView versionupgradepromoview)
    {
        versionupgradepromoview.c();
    }

    private void b()
    {
        if (d.b() == null || c.i() != com.facebook.config.a.d.MESSENGER)
        {
            setVisibility(8);
        } else
        if (!Objects.equal(b.a(o.B, null), d.b()))
        {
            if (a.b())
            {
                setVisibility(0);
                return;
            } else
            {
                setVisibility(8);
                return;
            }
        }
    }

    private void c()
    {
        Object obj;
        if (d.e() != null)
        {
            obj = Uri.parse(d.e());
        } else
        {
            obj = Uri.parse(c.g());
        }
        obj = new Intent("android.intent.action.VIEW", ((Uri) (obj)));
        getContext().startActivity(((Intent) (obj)));
    }

    public void a()
    {
        long l = d.f();
        if (l != g)
        {
            g = l;
            b();
        }
    }
}

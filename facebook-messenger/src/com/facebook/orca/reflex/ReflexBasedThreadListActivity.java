// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.reflex;

import android.os.Bundle;
import com.facebook.orca.activity.k;
import com.facebook.orca.common.ui.overlay.SwipableOverlayLayout;
import com.facebook.orca.common.ui.titlebar.a;
import com.facebook.orca.threadlist.ThreadListView;
import com.facebook.orca.threadlist.s;
import com.facebook.orca.threadlist.t;
import com.facebook.reflex.e;
import com.facebook.reflex.view.b.g;
import java.util.EnumSet;
import java.util.HashMap;

// Referenced classes of package com.facebook.orca.reflex:
//            i, k

public class ReflexBasedThreadListActivity extends e
    implements k, s
{

    private static final HashMap d;
    private final t c;

    public ReflexBasedThreadListActivity()
    {
        this(new t());
    }

    private ReflexBasedThreadListActivity(t t1)
    {
        super(t1);
        c = t1;
    }

    public t a()
    {
        return c;
    }

    protected String a(String s1)
    {
        String s2 = (String)d.get(s1);
        if (s2 != null)
        {
            return s2;
        } else
        {
            return super.a(s1);
        }
    }

    protected void a(Bundle bundle)
    {
        super.a(bundle);
        a(EnumSet.of(g.HorizontalPans, g.Taps));
    }

    public a c()
    {
        return c.c();
    }

    public boolean c_()
    {
        return false;
    }

    static 
    {
        d = new HashMap();
        d.put(com/facebook/orca/common/ui/overlay/SwipableOverlayLayout.getName(), com/facebook/orca/reflex/i.getName());
        d.put(com/facebook/orca/threadlist/ThreadListView.getName(), com/facebook/orca/reflex/k.getName());
    }
}

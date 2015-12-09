// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cb;

import android.os.Bundle;
import android.support.v4.content.j;
import android.view.View;
import com.pandora.android.activity.HomeTabsActivity;
import com.pandora.android.provider.b;
import com.pandora.android.tablet.TabletHome;
import com.pandora.android.util.p;
import com.pandora.android.util.s;
import p.ca.l;

public abstract class c extends l
{

    public c()
    {
    }

    public boolean a()
    {
        return false;
    }

    public boolean c()
    {
        if (s.u())
        {
            android.content.Intent intent = TabletHome.a(p.r, null);
            b.a.C().a(intent);
            return true;
        } else
        {
            return false;
        }
    }

    public int l_()
    {
        return HomeTabsActivity.r();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        if (s.u())
        {
            view = (new p.bz.i.a()).a(com.pandora.android.view.HeaderLayout.d.c).a(com.pandora.android.view.HeaderLayout.a.b).a(com.pandora.android.view.HeaderLayout.b.c).b(com.pandora.android.view.HeaderLayout.a.e).a(d().toString()).a();
            b.a.e().a(view);
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.os.Bundle;
import android.support.v4.content.j;
import android.view.View;
import com.pandora.android.provider.b;
import com.pandora.android.tablet.TabletHome;

// Referenced classes of package p.ca:
//            am

public class an extends am
{

    public an()
    {
    }

    public static an b(String s, String s1)
    {
        an an1 = new an();
        a(s, s1, an1);
        return an1;
    }

    protected boolean e()
    {
        b.a.C().a(TabletHome.ak());
        return true;
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        view = (new p.bz.i.a()).a(com.pandora.android.view.HeaderLayout.d.a).a(com.pandora.android.view.HeaderLayout.a.b).a(com.pandora.android.view.HeaderLayout.b.c).b(com.pandora.android.view.HeaderLayout.a.a).a(d().toString()).a();
        b.a.e().a(view);
    }
}

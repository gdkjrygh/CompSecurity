// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.content.j;
import com.pandora.android.provider.b;
import com.pandora.android.tablet.TabletHome;
import com.pandora.android.util.s;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package p.ca:
//            v

public class w extends v
{

    private Bundle m;
    private List n;

    public w()
    {
    }

    public static w a(String s1, String s2, String s3, String s4, ArrayList arraylist, com.pandora.radio.util.j j1, Bundle bundle)
    {
        w w1 = new w();
        s1 = b(s1, s2, s3, s4, arraylist, j1);
        if (bundle != null)
        {
            s1.putAll(bundle);
            s1.putBundle("intent_extra_key", bundle);
        }
        w1.setArguments(s1);
        return w1;
    }

    protected void a(Bundle bundle)
    {
        s.a(getActivity(), getResources().getString(0x7f08015f), com/pandora/android/tablet/TabletHome, 0x24000000, bundle);
    }

    public boolean c()
    {
        j j1 = b.a.C();
        if (n == null || n.isEmpty())
        {
            j1.a(TabletHome.a(l, m));
            return true;
        }
        ArrayList arraylist = new ArrayList(n);
        if ((com.pandora.android.tablet.TabletHome.c)arraylist.remove(arraylist.size() - 1) == com.pandora.android.tablet.TabletHome.c.b)
        {
            Bundle bundle = (Bundle)m.clone();
            bundle.putString("intent_station_pane_stack", com.pandora.android.tablet.TabletHome.c.a(arraylist));
            j1.a(TabletHome.a(l, bundle));
            return true;
        } else
        {
            return false;
        }
    }

    protected void e()
    {
        p.bz.i i = (new p.bz.i.a()).a(com.pandora.android.view.HeaderLayout.d.a).a(com.pandora.android.view.HeaderLayout.a.b).a(com.pandora.android.view.HeaderLayout.b.c).b(com.pandora.android.view.HeaderLayout.a.e).a(d().toString()).a();
        b.a.e().a(i);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        m = getArguments().getBundle("intent_extra_key");
        if (m != null)
        {
            n = com.pandora.android.tablet.TabletHome.c.a(m.getString("intent_station_pane_stack"));
        }
    }
}

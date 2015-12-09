// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.connect.ConnectManager;
import com.spotify.mobile.android.spotlets.connect.Tech;
import java.util.List;

final class g.Object
    implements etf
{

    private com.spotify.mobile.android.connect.anager.ConnectState a;
    private List b;
    private l.List c;

    public final void a()
    {
        c.c.d.a(a, ((ConnectManager)c.c.b.f()).d(), ((ConnectManager)c.c.b.f()).e(), Tech.a(b));
    }

    l.List(l.List list, com.spotify.mobile.android.connect.anager.ConnectState connectstate, List list1)
    {
        c = list;
        a = connectstate;
        b = list1;
        super();
    }

    // Unreferenced inner class etd$1

/* anonymous class */
    final class etd._cls1
        implements dkz
    {

        final etd a;

        public final void a()
        {
            a.d.a();
        }

        public final void a(List list, com.spotify.mobile.android.connect.ConnectManager.ConnectState connectstate)
        {
            a.a.add(new etd._cls1._cls1(this, connectstate, list));
            if (a.b.c())
            {
                a.c();
            }
        }

            
            {
                a = etd1;
                super();
            }
    }

}

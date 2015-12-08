// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import java.util.ArrayList;
import java.util.List;

public final class git
{

    public List a;

    public git()
    {
        a = new ArrayList();
        fnt.a();
        List list = a;
        giw giw1 = new giw();
        giw1.a = "connectArsenal-2015-03-16";
        giw1.b = 0x7f0801ec;
        giw1.c = 0x7f0801eb;
        giw1.d = 0x7f020215;
        giw1.f = 0x7f02018d;
        giw1.g = new giv() {

            public final boolean a(Flags flags)
            {
                return ((Boolean)flags.a(fys.o)).booleanValue();
            }

        };
        giw1.a();
        giw1 = new giw();
        giw1.a = "connectCast-2015-09-01";
        giw1.b = 0x7f0801ea;
        giw1.e = SpotifyIcon.bv;
        giw1.c = 0x7f0801e9;
        giw1.f = 0x7f02026a;
        giw1.g = new giv() {

            public final boolean a(Flags flags)
            {
                return "Enabled".equals(flags.a(fys.aD));
            }

        };
        list.add(giw1.a());
        giw1 = new giw();
        giw1.a = "momentsNow-2015-06-26";
        giw1.b = 0x7f080356;
        giw1.c = 0x7f080355;
        giw1.f = 0x7f02026b;
        giw1.g = new giv() {

            public final boolean a(Flags flags)
            {
                return ((Integer)flags.a(fys.ax)).intValue() == 2 || ((Integer)flags.a(fys.ax)).intValue() == 1;
            }

        };
        list.add(giw1.a());
        giw1 = new giw();
        giw1.a = "momentsShow-2015-06-26";
        giw1.b = 0x7f080358;
        giw1.c = 0x7f080357;
        giw1.f = 0x7f02026d;
        giw1.g = new giv() {

            public final boolean a(Flags flags)
            {
                return ((Boolean)flags.a(fys.N)).booleanValue();
            }

        };
        list.add(giw1.a());
        giw1 = new giw();
        giw1.a = "running-2015-06-26";
        giw1.b = 0x7f080654;
        giw1.c = 0x7f080461;
        giw1.f = 0x7f02026c;
        giw1.g = new giv() {

            public final boolean a(Flags flags)
            {
                return ((Boolean)flags.a(fys.au)).booleanValue();
            }

        };
        list.add(giw1.a());
    }
}

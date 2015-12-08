// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.service.ConnectDevice;
import com.spotify.mobile.android.spotlets.connect.view.ConnectButtonPresenter;
import java.util.EnumSet;

final class ang.Object
    implements ete
{

    private etn a;

    public final void a()
    {
        if (etn.a(a) == null)
        {
            return;
        }
        if (etn.b(a).a())
        {
            etn.c(a).a(etn.a(a));
            return;
        } else
        {
            etn.a(a, true);
            return;
        }
    }

    public final void a(com.spotify.mobile.android.connect.tManager.ConnectState connectstate, ConnectDevice connectdevice, ConnectDevice connectdevice1, EnumSet enumset)
    {
        if (etn.d(a) == null)
        {
            return;
        }
        ett ett1 = etn.b(a);
        boolean flag1 = etn.a(connectstate);
        boolean flag;
        if (etn.a(a) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ett1.a(flag1, flag);
        etn.e(a).a(connectstate, connectdevice, connectdevice1, enumset);
        a.a(etn.f(a));
        a.a();
    }

    (etn etn1)
    {
        a = etn1;
        super();
    }
}

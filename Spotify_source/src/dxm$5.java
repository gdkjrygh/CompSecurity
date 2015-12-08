// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.os.Bundle;
import android.util.SparseArray;
import com.spotify.mobile.android.provider.PaymentState;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.music.spotlets.tracking.InstallReferrerReceiver;
import com.spotify.music.spotlets.tracking.Tracking;

final class ang.Object
    implements an
{

    private final String a[] = {
        "logged_in", "logging_in", "payment_state", "suppress_welcome_screen", "current_account_type", "logging_out"
    };
    private boolean b;
    private dxm c;

    public final da a(Bundle bundle)
    {
        return new cu(c.k(), dtw.a, a, null, null);
    }

    public final void a()
    {
    }

    public final void a(Object obj)
    {
        obj = (Cursor)obj;
        if (((Cursor) (obj)).moveToFirst())
        {
            boolean flag1 = gcw.a(((Cursor) (obj)), 0);
            boolean flag2 = gcw.a(((Cursor) (obj)), 1);
            boolean flag3 = gcw.a(((Cursor) (obj)), 5);
            boolean flag = gcw.a(((Cursor) (obj)), 3);
            PaymentState paymentstate = new PaymentState(((Cursor) (obj)).getString(2));
            int i = ((Cursor) (obj)).getInt(4);
            int j = paymentstate.d();
            if (j <= 0)
            {
                flag = true;
            }
            obj = (dxx)c.F();
            if (obj != null)
            {
                ((dxx) (obj)).a(new dxy(flag1, flag2, flag3, flag, j));
            }
            if (flag1)
            {
                if (!b && !dxm.c(c))
                {
                    Object obj1 = dxm.b(c);
                    Object obj2 = geu.a();
                    if (((geu) (obj2)).d())
                    {
                        obj2 = ((geu) (obj2)).c();
                        geh.a(((CharSequence) (obj2)), "referralCode must be set");
                        ((dxl) (obj1)).a(((String) (obj2)), null);
                    }
                    InstallReferrerReceiver.a(((dxl) (obj1)).b);
                    if (((dxl) (obj1)).c != null)
                    {
                        ClientEvent clientevent = new ClientEvent(com.spotify.mobile.android.util.Event.Event.Y, com.spotify.mobile.android.util.Event.SubEvent.aL);
                        dxl.a(clientevent, i);
                        ((dxl) (obj1)).a.a(((dxl) (obj1)).b, ((dxl) (obj1)).c, clientevent);
                    }
                    obj1 = (com.spotify.music.spotlets.tracking.ng.SourceType)((dxl) (obj1)).d.get(i);
                    if (obj1 != null)
                    {
                        ((Tracking)dmz.a(com/spotify/music/spotlets/tracking/Tracking)).b(((com.spotify.music.spotlets.tracking.ng.SourceType) (obj1)));
                    }
                }
                if (obj != null && ((dxx) (obj)).J() && !flag3)
                {
                    c.G();
                }
            } else
            {
                dxm.d(c);
                c.k().setVisible(true);
            }
            b = flag1;
        }
    }

    (dxm dxm1)
    {
        c = dxm1;
        super();
    }
}

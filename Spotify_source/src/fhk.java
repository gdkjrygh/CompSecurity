// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.facebook.Session;
import com.spotify.mobile.android.spotlets.share.ConnectFacebookActivity;
import java.util.Arrays;
import java.util.List;

public final class fhk extends fhi
{

    private gfl Z;
    private boolean aa;
    private boolean ab;
    private gfm ac;

    public fhk()
    {
    }

    public static void G()
    {
        Session session = Session.g();
        if (session != null)
        {
            session.f();
        }
    }

    public static boolean H()
    {
        Session session = Session.g();
        return session != null && session.a();
    }

    public static boolean I()
    {
        return gdh.a(gdh.a);
    }

    private gfl J()
    {
        if (Z == null)
        {
            Z = new gfl(k());
        }
        return Z;
    }

    static boolean a(fhk fhk1)
    {
        return fhk1.aa;
    }

    static boolean b(fhk fhk1)
    {
        return fhk1.ab;
    }

    static boolean c(fhk fhk1)
    {
        fhk1.ab = true;
        return true;
    }

    public final void A()
    {
        super.A();
        gfl gfl1 = J();
        gfl1.b(ac);
        gfl1.e.b();
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        aa = false;
        if (bundle != null)
        {
            bundle.setClassLoader(k().getClassLoader());
            ab = bundle.getBoolean("spotify:share:connect:facebook:connection_attempted");
        }
        ac = new gfm() {

            private fhk a;

            private void a()
            {
                a.F().a(com.spotify.mobile.android.spotlets.share.model.Network.Type.a, com.spotify.mobile.android.spotlets.share.model.Network.State.a);
                a.dismiss();
            }

            private static boolean b(gfl gfl1)
            {
                boolean flag;
label0:
                {
                    boolean flag1 = false;
                    String as[] = gfl1.b;
                    if (as != null && as.length != 3)
                    {
                        flag = flag1;
                        if (Arrays.asList(as).contains(gdh.a.get(0)))
                        {
                            break label0;
                        }
                    }
                    flag = flag1;
                    if (gfl1.c)
                    {
                        flag = true;
                    }
                }
                return flag;
            }

            public final void a(gfl gfl1)
            {
label0:
                {
                    if (!fhk.a(a))
                    {
                        if (fhk.b(a) || !b(gfl1))
                        {
                            break label0;
                        }
                        a();
                    }
                    return;
                }
                if (!fhk.b(a))
                {
                    fhk.c(a);
                    fhk.G();
                    gfl1 = a;
                    gfl1.k().startActivity(new Intent(gfl1.k(), com/spotify/mobile/android/spotlets/share/ConnectFacebookActivity));
                    return;
                }
                if (fhk.H() && fhk.I() && b(gfl1))
                {
                    a();
                    return;
                } else
                {
                    a.dismiss();
                    return;
                }
            }

            
            {
                a = fhk.this;
                super();
            }
        };
    }

    public final Dialog c(Bundle bundle)
    {
        super.c(bundle);
        bundle = k().getLayoutInflater().inflate(0x7f030091, null);
        return (new dfj(k(), 0x7f0b017f)).a(0x7f0804c6).a(bundle).b();
    }

    public final void e(Bundle bundle)
    {
        bundle.putBoolean("spotify:share:connect:facebook:connection_attempted", ab);
        super.e(bundle);
    }

    public final void onDismiss(DialogInterface dialoginterface)
    {
        gfl gfl1 = J();
        gfl1.b(ac);
        gfl1.e.b();
        Z = null;
        aa = true;
        ab = false;
        super.onDismiss(dialoginterface);
    }

    public final void z()
    {
        super.z();
        gfl gfl1 = J();
        gfl1.a(ac);
        gfl1.a();
    }
}

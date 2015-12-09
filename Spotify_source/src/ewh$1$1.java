// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import com.spotify.mobile.android.ui.view.DownloadHeaderView;
import com.spotify.mobile.android.util.viewuri.Verified;
import java.lang.ref.WeakReference;

final class g.Object
    implements fjt
{

    private a a;

    public final void a()
    {
        a.a.c.b();
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class ewh$1

/* anonymous class */
    final class ewh._cls1
        implements Runnable
    {

        final ewh a;

        public final void run()
        {
            boolean flag1 = false;
            Activity activity = (Activity)a.a.get();
            Object obj = (ewi)a.b.get();
            if (activity != null && obj != null)
            {
                boolean flag;
                if (((ewi) (obj)).c().a == com.spotify.mobile.android.ui.view.DownloadHeaderView.State.b)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!a.e || !a.f)
                {
                    flag1 = true;
                }
                if (!flag && !flag1)
                {
                    fju fju1 = new fju();
                    fju1.a(new ewh._cls1._cls1(this));
                    dmz.a(fjm);
                    fjn fjn1 = fjm.a(activity);
                    fjn1.b = ((ewi) (obj)).a();
                    fjn1.c = ((ewi) (obj)).b();
                    fjn1.a = com.spotify.mobile.android.spotlets.tinkerbell.Onboarding.Type.g;
                    fjn1.d = fju1;
                    fjn1.a(((ewi) (obj)).c().b);
                    obj = new dnk("tinkerbell-tooltip", a.d.toString());
                    dmz.a(fop);
                    fop.a(activity, ((dnj) (obj)));
                    return;
                }
            }
        }

            
            {
                a = ewh1;
                super();
            }
    }

}

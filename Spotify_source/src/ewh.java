// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import com.spotify.mobile.android.spotlets.offline.flags.OfflineSyncSwitchVisibility;
import com.spotify.mobile.android.spotlets.onboarding.premium.offline.OfflineSyncFeatureOnboarding;
import com.spotify.mobile.android.spotlets.tinkerbell.TooltipContainer;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.ui.view.DownloadHeaderView;
import com.spotify.mobile.android.util.viewuri.Verified;
import java.lang.ref.WeakReference;

public final class ewh
    implements ewj
{

    final WeakReference a;
    final WeakReference b;
    final ewf c;
    final Verified d;
    boolean e;
    boolean f;
    private final Runnable g = new Runnable() {

        final ewh a;

        public final void run()
        {
            boolean flag2 = false;
            Activity activity1 = (Activity)a.a.get();
            Object obj = (ewi)a.b.get();
            if (activity1 != null && obj != null)
            {
                boolean flag1;
                if (((ewi) (obj)).c().a == com.spotify.mobile.android.ui.view.DownloadHeaderView.State.b)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                if (!a.e || !a.f)
                {
                    flag2 = true;
                }
                if (!flag1 && !flag2)
                {
                    fju fju1 = new fju();
                    fju1.a(new fjt(this) {

                        private _cls1 a;

                        public final void a()
                        {
                            a.a.c.b();
                        }

            
            {
                a = _pcls1;
                super();
            }
                    });
                    dmz.a(fjm);
                    fjn fjn1 = fjm.a(activity1);
                    fjn1.b = ((ewi) (obj)).a();
                    fjn1.c = ((ewi) (obj)).b();
                    fjn1.a = com.spotify.mobile.android.spotlets.tinkerbell.Onboarding.Type.g;
                    fjn1.d = fju1;
                    fjn1.a(((ewi) (obj)).c().b);
                    obj = new dnk("tinkerbell-tooltip", a.d.toString());
                    dmz.a(fop);
                    fop.a(activity1, ((dnj) (obj)));
                    return;
                }
            }
        }

            
            {
                a = ewh.this;
                super();
            }
    };

    public ewh(Activity activity, ewi ewi1, gin gin, Verified verified, Flags flags)
    {
        a = new WeakReference(activity);
        b = new WeakReference(ewi1);
        OfflineSyncFeatureOnboarding offlinesyncfeatureonboarding = (OfflineSyncFeatureOnboarding)flags.a(fys.aO);
        ewi1 = (OfflineSyncSwitchVisibility)flags.a(fys.aP);
        flags = (Boolean)flags.a(fys.ab);
        if (offlinesyncfeatureonboarding == OfflineSyncFeatureOnboarding.a || ewi1 == OfflineSyncSwitchVisibility.a || !flags.booleanValue())
        {
            ewi1 = new ewk();
        } else
        {
            boolean flag;
            if (offlinesyncfeatureonboarding == OfflineSyncFeatureOnboarding.b)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ewi1 = new ewl(verified, gin, this, flag);
        }
        if (offlinesyncfeatureonboarding == OfflineSyncFeatureOnboarding.b)
        {
            ewi1.a(activity);
        }
        c = ewi1;
        d = verified;
    }

    private void c(boolean flag)
    {
        Object obj;
label0:
        {
            obj = (Activity)a.get();
            if (obj != null)
            {
                obj = TooltipContainer.a(((Activity) (obj)));
                if (((TooltipContainer) (obj)).c())
                {
                    boolean flag1;
                    if (com.spotify.mobile.android.spotlets.tinkerbell.Onboarding.Type.g == ((TooltipContainer) (obj)).d)
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                    if (flag1)
                    {
                        if (!flag)
                        {
                            break label0;
                        }
                        ((TooltipContainer) (obj)).a();
                    }
                }
            }
            return;
        }
        ((TooltipContainer) (obj)).dismiss();
    }

    private void f()
    {
        DownloadHeaderView downloadheaderview = g();
        if (downloadheaderview == null)
        {
            return;
        } else
        {
            downloadheaderview.postDelayed(g, 500L);
            return;
        }
    }

    private DownloadHeaderView g()
    {
        Object obj = (ewi)b.get();
        if (obj == null)
        {
            return null;
        }
        obj = ((ewi) (obj)).c();
        if (obj == null)
        {
            return null;
        } else
        {
            ((DownloadHeaderView) (obj)).removeCallbacks(g);
            return ((DownloadHeaderView) (obj));
        }
    }

    public final void a()
    {
        Context context = (Context)a.get();
        if (context != null)
        {
            c.b(context);
        }
        g();
    }

    public final void a(boolean flag)
    {
        c.b(flag);
    }

    public final void b()
    {
        c.a();
    }

    public final void b(boolean flag)
    {
        f = flag;
        if (f)
        {
            f();
            return;
        } else
        {
            c(true);
            return;
        }
    }

    public final void c()
    {
        e = true;
        f();
    }

    public final void d()
    {
        e = false;
        g();
        c(false);
    }

    public final boolean e()
    {
        Activity activity = (Activity)a.get();
        if (activity != null)
        {
            return TooltipContainer.a(activity).c();
        } else
        {
            return false;
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui.setup.choose;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.fitbit.data.bl.an;
import com.fitbit.data.domain.device.TrackerType;
import com.fitbit.device.ui.setup.AbstractChooseTrackerActivity;
import com.fitbit.device.ui.setup.replace.ConfirmReplaceDeviceActivity;
import com.fitbit.mixpanel.MixPanelTrackingHelper;
import com.fitbit.multipledevice.b;
import com.fitbit.onboarding.login.LoginActivity;
import com.fitbit.pedometer.c;
import com.fitbit.pedometer.e;
import com.fitbit.pedometer.k;
import com.fitbit.pedometer.service.a;
import com.fitbit.util.p;
import java.util.List;

// Referenced classes of package com.fitbit.device.ui.setup.choose:
//            ChooseTrackerActivity_, TrackerListAdapter, ConfirmDeviceActivity

public class ChooseTrackerActivity extends AbstractChooseTrackerActivity
{

    public static final String f = "com.fitbit.onboarding.setup.ChooseTrackerActivity.EXTRA_PENDING_MESSAGE";
    public static final int g = 4904;
    private static final int l = 2010;
    protected View h;
    protected TextView i;
    protected ImageView j;
    protected View k;
    private Handler m;
    private boolean n;

    public ChooseTrackerActivity()
    {
        m = new Handler();
        n = false;
    }

    static Handler a(ChooseTrackerActivity choosetrackeractivity)
    {
        return choosetrackeractivity.m;
    }

    public static void a(Activity activity, int i1)
    {
        com.fitbit.device.ui.setup.choose.ChooseTrackerActivity_.a(activity).b(i1);
    }

    public static void a(Activity activity, com.fitbit.galileo.ui.sync.b b1, int i1)
    {
        a(activity, b1);
        a(activity, i1);
    }

    public static void a(Fragment fragment, int i1)
    {
        com.fitbit.device.ui.setup.choose.ChooseTrackerActivity_.a(fragment).b(i1);
    }

    public static void a(Fragment fragment, com.fitbit.galileo.ui.sync.b b1, int i1)
    {
        a(((Activity) (fragment.getActivity())), b1);
        a(fragment, i1);
    }

    static void a(ChooseTrackerActivity choosetrackeractivity, boolean flag)
    {
        choosetrackeractivity.a(flag);
    }

    private void a(boolean flag)
    {
        if (flag)
        {
            android.widget.RelativeLayout.LayoutParams layoutparams;
            int i1;
            if (com.fitbit.pedometer.k.a())
            {
                i1 = 0x7f0202b4;
            } else
            {
                i1 = 0x7f0202b5;
            }
            j.setImageResource(i1);
            if (p.a().isEmpty())
            {
                i.setText(0x7f0800fb);
            } else
            {
                i.setText(0x7f080323);
            }
            h.setVisibility(0);
            k.setVisibility(0);
            layoutparams = (android.widget.RelativeLayout.LayoutParams)c.getLayoutParams();
            layoutparams.addRule(2, 0x7f1100b1);
            c.setLayoutParams(layoutparams);
            return;
        } else
        {
            h.setVisibility(8);
            k.setVisibility(8);
            android.widget.RelativeLayout.LayoutParams layoutparams1 = (android.widget.RelativeLayout.LayoutParams)c.getLayoutParams();
            layoutparams1.addRule(2, 0);
            c.setLayoutParams(layoutparams1);
            return;
        }
    }

    protected ListAdapter a(List list)
    {
        return new TrackerListAdapter(this, list, e());
    }

    protected void a(int i1, Intent intent)
    {
        if (i1 == -1)
        {
            setResult(-1, intent);
            finish();
        }
    }

    protected void c()
    {
        super.c();
        n = b.a();
        boolean flag = p.l();
        boolean flag1 = com.fitbit.pedometer.e.h();
        boolean flag2 = U().c();
        if ((flag1 || flag2) && !flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(flag);
        if (!flag1)
        {
            e e1 = com.fitbit.pedometer.e.g();
            if (com.fitbit.pedometer.PedometerAdapterHelper.PedometerManufacturer.a == e1.a())
            {
                com.fitbit.pedometer.e.a(new com.fitbit.pedometer.e.b() {

                    final ChooseTrackerActivity a;

                    public void a(e e2)
                    {
                        if (com.fitbit.pedometer.PedometerAdapterHelper.PedometerManufacturer.b == e2.a())
                        {
                            com.fitbit.device.ui.setup.choose.ChooseTrackerActivity.a(a).post(new Runnable(this) {

                                final _cls1 a;

                                public void run()
                                {
                                    boolean flag = p.l();
                                    if (flag)
                                    {
                                        com.fitbit.pedometer.service.a.b();
                                        com.fitbit.multipledevice.a.a().b();
                                    }
                                    boolean flag1 = com.fitbit.pedometer.e.h();
                                    ChooseTrackerActivity choosetrackeractivity = a.a;
                                    if (flag1 && !flag)
                                    {
                                        flag = true;
                                    } else
                                    {
                                        flag = false;
                                    }
                                    com.fitbit.device.ui.setup.choose.ChooseTrackerActivity.a(choosetrackeractivity, flag);
                                }

            
            {
                a = _pcls1;
                super();
            }
                            });
                        }
                    }

                    public volatile void a(Object obj)
                    {
                        a((e)obj);
                    }

            
            {
                a = ChooseTrackerActivity.this;
                super();
            }
                }, true);
            }
        }
    }

    protected void d()
    {
        if (com.fitbit.pedometer.e.h())
        {
            com.fitbit.device.ui.setup.choose.ConfirmDeviceActivity.a(this, 2011);
        } else
        {
            U().d();
        }
        MixPanelTrackingHelper.c();
    }

    public boolean e()
    {
        return !com.fitbit.pedometer.e.h() && !U().c() && !an.a().g();
    }

    protected void f_(int i1)
    {
        finish();
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        if (P())
        {
            if (i1 == adapterview.getCount() - 1 && e())
            {
                LoginActivity.a(this, 2010);
            } else
            {
                adapterview = (TrackerType)adapterview.getItemAtPosition(i1);
                if (adapterview.d() != null)
                {
                    MixPanelTrackingHelper.a(adapterview.a());
                    if (n && p.e(adapterview.a()))
                    {
                        ConfirmReplaceDeviceActivity.a(this, 2011, adapterview);
                        return;
                    } else
                    {
                        com.fitbit.device.ui.setup.choose.ConfirmDeviceActivity.a(this, 2011, adapterview);
                        return;
                    }
                }
            }
        }
    }
}

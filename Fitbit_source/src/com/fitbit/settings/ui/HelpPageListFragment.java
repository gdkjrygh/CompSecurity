// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.settings.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import com.fitbit.FitBitApplication;
import com.fitbit.FitbitMobile.ServerSettingsActivity;
import com.fitbit.analytics.google.ga.AnalyticsContainer;
import com.fitbit.analytics.google.ga.d;
import com.fitbit.bluetooth.g;
import com.fitbit.config.BuildType;
import com.fitbit.config.a;
import com.fitbit.config.b;
import com.fitbit.data.domain.device.Device;
import com.fitbit.data.domain.device.DeviceType;
import com.fitbit.data.domain.device.DeviceVersion;
import com.fitbit.debug.ProxySettings;
import com.fitbit.device.ui.GuideActivity;
import com.fitbit.galileo.service.GalileoServicesStateListener;
import com.fitbit.galileo.ui.GalileoScanActivity;
import com.fitbit.galileo.ui.GalileoServiceSettingsActivity;
import com.fitbit.savedstate.ChinaStoreUtilsSavedState;
import com.fitbit.savedstate.h;
import com.fitbit.savedstate.q;
import com.fitbit.ui.WebViewActivity;
import com.fitbit.ui.fragments.FitbitListFragment;
import com.fitbit.ui.s;
import com.fitbit.util.al;
import com.fitbit.util.bh;
import com.fitbit.util.bq;
import com.fitbit.util.o;
import com.fitbit.util.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.settings.ui:
//            DeveloperOptionsFragment, SoftTrackerSettingsActivity, MixPanelSettingsActivity_, HardcodedSynclairConfigSettingsActivity_, 
//            MaintananceSettingsActivity, ClientBackOffSettingsActivity, GoogleStepsServiceSettingsActivity

public class HelpPageListFragment extends FitbitListFragment
{
    public static interface a
    {

        public abstract void a(Fragment fragment, String s1);
    }


    private static final String a = "Help Page";
    private static final String b = "Help Page";
    private GalileoServicesStateListener c;
    private b d;
    private a e;
    private ListView f;

    public HelpPageListFragment()
    {
    }

    private View A()
    {
        Object obj = FitBitApplication.a().f();
        String s1;
        Object aobj[];
        String s2;
        int j1;
        int k1;
        if (obj != null)
        {
            obj = ((com.fitbit.config.a) (obj)).b();
        } else
        {
            obj = null;
        }
        s2 = getString(0x7f080371, new Object[] {
            obj
        });
        obj = s2;
        if (b.a == BuildType.e)
        {
            Object obj1 = getActivity().getPackageManager();
            String s3 = getActivity().getPackageName();
            obj = s2;
            if (obj1 != null)
            {
                obj = s2;
                if (s3 != null)
                {
    /* anonymous class not found */
    class _anm2 {}

                    try
                    {
                        obj1 = ((PackageManager) (obj1)).getPackageInfo(s3, 0);
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        com.fitbit.e.a.a("Help Page", ((android.content.pm.PackageManager.NameNotFoundException) (obj)).toString(), new Object[0]);
                        obj1 = null;
                    }
                    obj = s2;
                    if (obj1 != null)
                    {
                        int i1 = ((PackageInfo) (obj1)).versionCode;
                        obj = (new StringBuilder()).append(s2).append(" ").append(i1).toString();
                    }
                }
            }
        }
        com.fitbit.settings.ui._cls2.b[b.a.ordinal()];
        JVM INSTR tableswitch 1 3: default 152
    //                   1 253
    //                   2 253
    //                   3 319;
           goto _L1 _L2 _L2 _L3
_L1:
        obj = new SpannableStringBuilder(((CharSequence) (obj)));
_L5:
        obj1 = LayoutInflater.from(getActivity()).inflate(0x7f040178, null);
        ((TextView)((View) (obj1)).findViewById(0x7f110426)).setText(((CharSequence) (obj)));
        ((TextView)((View) (obj1)).findViewById(0x7f110427)).setText(bh.a(getActivity(), 0x7f080115, new String[] {
            String.valueOf(com.fitbit.util.o.e())
        }));
        ((View) (obj1)).setEnabled(false);
        ((View) (obj1)).setOnClickListener(null);
        return ((View) (obj1));
_L2:
        s1 = (new StringBuilder()).append(((String) (obj))).append("[beta]").toString();
        obj = new SpannableStringBuilder(s1);
        ((SpannableStringBuilder) (obj)).setSpan(new ImageSpan(getActivity(), 0x7f02006e, 1), s1.length() - "[beta]".length(), s1.length(), 33);
        if (true)
        {
            continue; /* Loop/switch isn't completed */
        }
_L3:
        obj = new SpannableStringBuilder((new StringBuilder()).append(((String) (obj))).append("[alpha]").toString());
        aobj = new Object[2];
        aobj[0] = new BackgroundColorSpan(0xffff0000);
        aobj[1] = new ForegroundColorSpan(-1);
        k1 = aobj.length;
        j1 = 0;
        while (j1 < k1) 
        {
            ((SpannableStringBuilder) (obj)).setSpan(aobj[j1], ((SpannableStringBuilder) (obj)).length() - "[alpha]".length(), ((SpannableStringBuilder) (obj)).length(), 18);
            j1++;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static View a(Context context, String s1)
    {
        context = LayoutInflater.from(context).inflate(0x7f040177, null);
        ((TextView)context.findViewById(0x7f110425)).setText(s1);
        context.setEnabled(false);
        context.setOnClickListener(null);
        return context;
    }

    public static View a(Context context, String s1, String s2)
    {
        return bq.a(context, 0x7f040179, s1, s2);
    }

    static Device a(String s1)
    {
        return com.fitbit.util.p.d(s1);
    }

    public static HelpPageListFragment a()
    {
        Bundle bundle = new Bundle();
        HelpPageListFragment helppagelistfragment = new HelpPageListFragment();
        helppagelistfragment.setArguments(bundle);
        return helppagelistfragment;
    }

    private void a(Fragment fragment, Setting setting)
    {
    /* block-local class not found */
    class Setting {}

        if (e != null)
        {
            e.a(fragment, setting.name());
        }
    }

    private void a(Device device)
    {
        if (device != null && device.h() != null)
        {
            GuideActivity.a(getActivity(), device.z());
        }
    }

    static void a(HelpPageListFragment helppagelistfragment)
    {
        helppagelistfragment.o();
    }

    static View b(HelpPageListFragment helppagelistfragment)
    {
        return helppagelistfragment.A();
    }

    static List b()
    {
        return com.fitbit.util.p.b(DeviceType.TRACKER);
    }

    private void b(Device device)
    {
        if (device != null && device.h() != null)
        {
            device = device.h().getHelpUrl();
            if (!TextUtils.isEmpty(device))
            {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse(device)));
            }
        }
    }

    static Device c()
    {
        return com.fitbit.util.p.i();
    }

    private void e()
    {
        startActivity(new Intent(getActivity(), com/fitbit/debug/ProxySettings));
    }

    private void f()
    {
        com.fitbit.e.a.d("Help Page", "Requested to send logs but development options currently are off, informing user", new Object[0]);
        a(com.fitbit.settings.ui.DeveloperOptionsFragment.a(false), com.fitbit.settings.ui.Setting.o);
    }

    private void g()
    {
        com.fitbit.settings.ui.SoftTrackerSettingsActivity.a(getActivity());
    }

    private void h()
    {
        com.fitbit.e.a.a("SettingsActivity", (new StringBuilder()).append("onSendLogs(): ").append(new Date()).toString(), new Object[0]);
        a(com.fitbit.settings.ui.DeveloperOptionsFragment.a(true), com.fitbit.settings.ui.Setting.o);
    }

    private void i()
    {
        ServerSettingsActivity.a(getActivity());
    }

    private void j()
    {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(getString(0x7f0801b6))));
    }

    private void k()
    {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(getString(0x7f0805e6))));
    }

    private void l()
    {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(getString(0x7f08060e))));
    }

    private void m()
    {
        String s1 = String.format("file:///android_asset/%s", new Object[] {
            getString(0x7f08005d)
        });
        WebViewActivity.a(getActivity(), null, s1, true);
    }

    private void n()
    {
        GalileoServiceSettingsActivity.a(getActivity());
    }

    private void o()
    {
        if (!com.fitbit.bluetooth.g.g())
        {
            com.fitbit.bluetooth.g.a(this, new _cls1(), "BluetoothUtils.REQUEST_ENABLE_BLUETOOTH");
            return;
        }
        com.fitbit.galileo.service.GalileoServicesStateListener.GalileoState galileostate = c.c();
        if (galileostate == com.fitbit.galileo.service.GalileoServicesStateListener.GalileoState.a || galileostate == com.fitbit.galileo.service.GalileoServicesStateListener.GalileoState.e)
        {
            GalileoScanActivity.a(getActivity());
            return;
        } else
        {
            com.fitbit.ui.s.a(getActivity(), 0x7f08053e, 0).i();
            return;
        }
    }

    private void p()
    {
        String s1 = com.google.android.gcm.b.g(FitBitApplication.a());
        if ("".equals(s1))
        {
            com.fitbit.ui.s.a(getActivity(), "Device is not registered yet.", 1).i();
            return;
        } else
        {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.SUBJECT", "Registration ID");
            intent.putExtra("android.intent.extra.TEXT", s1);
            startActivity(intent);
            return;
        }
    }

    private void q()
    {
        com.fitbit.settings.ui.MixPanelSettingsActivity_.a(getActivity()).b();
    }

    private void r()
    {
        com.fitbit.settings.ui.HardcodedSynclairConfigSettingsActivity_.a(getActivity()).b();
    }

    private void s()
    {
        com.fitbit.settings.ui.MaintananceSettingsActivity.a(getActivity());
    }

    private void t()
    {
        com.fitbit.settings.ui.ClientBackOffSettingsActivity.a(getActivity());
    }

    private void u()
    {
        com.fitbit.settings.ui.GoogleStepsServiceSettingsActivity.a(getActivity());
    }

    private void v()
    {
        com.fitbit.savedstate.h.i();
    /* block-local class not found */
    class b {}

        d.notifyDataSetChanged();
    }

    private void w()
    {
        com.fitbit.savedstate.h.k();
        d.notifyDataSetChanged();
    }

    private void x()
    {
        com.fitbit.savedstate.q.h();
        d.notifyDataSetChanged();
    }

    private void y()
    {
        ChinaStoreUtilsSavedState.j();
        d.notifyDataSetChanged();
    }

    private List z()
    {
    /* block-local class not found */
    class c {}

        ArrayList arraylist;
        boolean flag;
        arraylist = new ArrayList();
        arraylist.add(new c(com.fitbit.settings.ui.Setting.a));
        arraylist.add(new c(com.fitbit.settings.ui.Setting.b));
        arraylist.add(new c(Setting.f));
        Iterator iterator;
        Device device;
        if (al.h())
        {
            arraylist.add(new c(com.fitbit.settings.ui.Setting.g));
        } else
        {
            arraylist.add(new c(com.fitbit.settings.ui.Setting.h));
        }
        arraylist.add(new c(Setting.m));
        arraylist.add(new c(Setting.i));
        iterator = b().iterator();
        flag = false;
_L3:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        device = (Device)iterator.next();
        if (device != null && DeviceVersion.MOTIONBIT != device.h())
        {
            boolean flag1 = flag;
            if (com.fitbit.util.p.a(device))
            {
                if (!flag)
                {
                    arraylist.add(new c(Setting.c));
                }
                arraylist.add(new c(Setting.j, device.c()));
                flag1 = true;
            }
            if (al.h())
            {
                if (!flag1)
                {
                    arraylist.add(new c(Setting.c));
                }
                arraylist.add(new c(Setting.k, device.c()));
                flag = true;
            } else
            {
                flag = flag1;
            }
        }
        if (true) goto _L3; else goto _L2
_L2:
        if (al.h() && c() != null)
        {
            arraylist.add(new c(Setting.l));
        }
        return arraylist;
    }

    public void d()
    {
        Object obj = Collections.singletonList(getString(0x7f0803b4));
        if (!TextUtils.isEmpty(b.e))
        {
            obj = new ArrayList(((java.util.Collection) (obj)));
            ((List) (obj)).add(b.e);
        }
        Intent intent = new Intent("android.intent.action.SEND");
        String as[] = (String[])((List) (obj)).toArray(new String[((List) (obj)).size()]);
        String s1 = getString(0x7f0803b7);
        String s2 = (new StringBuilder()).append(com.fitbit.util.c.b.a(getActivity().getApplicationContext(), null)).append(getString(0x7f0803b5)).toString();
        intent.putExtra("android.intent.extra.EMAIL", as);
        intent.putExtra("android.intent.extra.SUBJECT", s1);
        intent.putExtra("android.intent.extra.TEXT", s2);
        intent.setType("plain/text");
        startActivity(intent);
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        if (activity instanceof a)
        {
            e = (a)activity;
        }
        c = com.fitbit.galileo.service.b.b(activity);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
    }

    public void onDetach()
    {
        super.onDetach();
        e = null;
    }

    public void onListItemClick(ListView listview, View view, int i1, long l1)
    {
        listview = (c)d.getItem(i1);
        view = ((c) (listview)).a;
        switch (com.fitbit.settings.ui._cls2.a[view.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            j();
            return;

        case 2: // '\002'
            k();
            return;

        case 3: // '\003'
            l();
            return;

        case 4: // '\004'
            m();
            return;

        case 5: // '\005'
            b(a(((c) (listview)).b));
            return;

        case 6: // '\006'
            a(a(((c) (listview)).b));
            return;

        case 7: // '\007'
            b(c());
            return;

        case 8: // '\b'
            d();
            return;

        case 9: // '\t'
            p();
            return;

        case 10: // '\n'
            i();
            return;

        case 11: // '\013'
            g();
            return;

        case 12: // '\f'
            n();
            return;

        case 13: // '\r'
            o();
            return;

        case 14: // '\016'
            h();
            return;

        case 15: // '\017'
            f();
            return;

        case 16: // '\020'
            q();
            return;

        case 17: // '\021'
            s();
            return;

        case 18: // '\022'
            t();
            return;

        case 19: // '\023'
            e();
            return;

        case 20: // '\024'
            u();
            return;

        case 21: // '\025'
            v();
            return;

        case 22: // '\026'
            w();
            return;

        case 23: // '\027'
            x();
            return;

        case 24: // '\030'
            y();
            break;
        }
    }

    public void onStart()
    {
        super.onStart();
        FitBitApplication.a().c().a(0x7f11000a).a("Help Page");
        getActivity().setTitle(0x7f080252);
        d.clear();
        d.addAll(z());
        d.notifyDataSetChanged();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        d = new b(null);
        d.addAll(z());
        setListAdapter(d);
        getListView().setDivider(null);
    }

    /* member class not found */
    class _cls1 {}

}

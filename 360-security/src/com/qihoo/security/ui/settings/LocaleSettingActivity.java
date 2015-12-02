// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.settings;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.support.v4.app.f;
import android.support.v4.app.h;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.qihoo.security.app.BaseActivity;
import com.qihoo.security.locale.LocaleInfo;
import com.qihoo.security.locale.d;
import com.qihoo.security.locale.fragment.LanguagePacketFragment;
import com.qihoo.security.service.SecurityService;
import com.qihoo.security.service.a;
import com.qihoo.security.ui.fragment.utils.FragmentAction;
import com.qihoo360.common.utils.Utils;
import com.qihoo360.mobilesafe.b.r;

// Referenced classes of package com.qihoo.security.ui.settings:
//            a

public class LocaleSettingActivity extends BaseActivity
    implements android.widget.AdapterView.OnItemClickListener
{

    private LanguagePacketFragment A;
    private final Handler B = new Handler() {

        final LocaleSettingActivity a;

        public void handleMessage(Message message)
        {
            super.handleMessage(message);
            message.what;
            JVM INSTR tableswitch 3 3: default 28
        //                       3 29;
               goto _L1 _L2
_L1:
            return;
_L2:
            if (com.qihoo.security.ui.settings.LocaleSettingActivity.a(a) != null)
            {
                com.qihoo.security.ui.settings.LocaleSettingActivity.a(a).a();
                return;
            }
            if (true) goto _L1; else goto _L3
_L3:
        }

            
            {
                a = LocaleSettingActivity.this;
                super();
            }
    };
    private a C;
    private final ServiceConnection D = new ServiceConnection() {

        final LocaleSettingActivity a;

        public void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            com.qihoo.security.ui.settings.LocaleSettingActivity.a(a, com.qihoo.security.service.a.a.a(ibinder));
        }

        public void onServiceDisconnected(ComponentName componentname)
        {
            com.qihoo.security.ui.settings.LocaleSettingActivity.a(a, null);
        }

            
            {
                a = LocaleSettingActivity.this;
                super();
            }
    };
    private final com.qihoo.security.locale.b.a E = new com.qihoo.security.locale.b.a() {

        final LocaleSettingActivity a;

        public void a()
            throws RemoteException
        {
            try
            {
                if (LocaleSettingActivity.c(a) != null)
                {
                    LocaleSettingActivity.c(a).b();
                }
                return;
            }
            catch (Exception exception)
            {
                return;
            }
        }

        public void a(String s)
            throws RemoteException
        {
        }

        public void a(boolean flag, boolean flag1, String s, String s1, String s2)
            throws RemoteException
        {
        }

        public void b()
            throws RemoteException
        {
            if (LocaleSettingActivity.b(a) != null)
            {
                LocaleSettingActivity.b(a).sendEmptyMessage(3);
            }
        }

        public void c()
            throws RemoteException
        {
            if (LocaleSettingActivity.b(a) != null)
            {
                LocaleSettingActivity.b(a).sendEmptyMessage(3);
            }
        }

        public void d()
            throws RemoteException
        {
            if (LocaleSettingActivity.b(a) != null)
            {
                LocaleSettingActivity.b(a).sendEmptyMessage(3);
            }
        }

            
            {
                a = LocaleSettingActivity.this;
                super();
            }
    };
    private ListView y;
    private com.qihoo.security.ui.settings.a z;

    public LocaleSettingActivity()
    {
        C = null;
    }

    static a a(LocaleSettingActivity localesettingactivity, a a1)
    {
        localesettingactivity.C = a1;
        return a1;
    }

    static com.qihoo.security.ui.settings.a a(LocaleSettingActivity localesettingactivity)
    {
        return localesettingactivity.z;
    }

    static Handler b(LocaleSettingActivity localesettingactivity)
    {
        return localesettingactivity.B;
    }

    static a c(LocaleSettingActivity localesettingactivity)
    {
        return localesettingactivity.C;
    }

    public void a(FragmentAction fragmentaction, Bundle bundle)
    {
        super.a(fragmentaction, bundle);
        static class _cls4
        {

            static final int a[];

            static 
            {
                a = new int[FragmentAction.values().length];
                try
                {
                    a[FragmentAction.REFRESH.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror) { }
            }
        }

        switch (com.qihoo.security.ui.settings._cls4.a[fragmentaction.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            B.sendEmptyMessage(3);
            break;
        }
    }

    public void finish()
    {
        Intent intent = getIntent();
        if (intent != null && intent.getIntExtra("from", 0) == 3)
        {
            r.a(this, com/qihoo/security/ui/settings/LocaleSettingActivity.getName(), false);
        }
        super.finish();
    }

    protected void j()
    {
        super.j();
        if (r != null)
        {
            b(o.a(0x7f0c0163));
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030073);
        y = (ListView)findViewById(0x7f0b0182);
        bundle = findViewById(0x7f0b012f);
        y.setEmptyView(bundle);
        z = new com.qihoo.security.ui.settings.a(p, null);
        y.setAdapter(z);
        y.setOnItemClickListener(this);
        o.a(E);
        Utils.bindService(p, com/qihoo/security/service/SecurityService, "com.qihoo.security.service.INTERNAL_CONTROL", D, 1);
        A = new LanguagePacketFragment();
        bundle = s.a();
        bundle.a(A, "language fragment");
        bundle.a();
    }

    protected void onDestroy()
    {
        super.onDestroy();
        o.b(E);
        Utils.unbindService("LocaleSettingActivity", p, D);
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (!com.qihoo360.mobilesafe.b.f.a()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        adapterview = (LocaleInfo)z.getItem(i);
        view = d.a().f();
        if (!((LocaleInfo) (adapterview)).buildin)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!((LocaleInfo) (adapterview)).locale.equals(view))
        {
            A.b(((LocaleInfo) (adapterview)).locale);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (((LocaleInfo) (adapterview)).support)
        {
            A.a(adapterview);
            return;
        }
        switch (((LocaleInfo) (adapterview)).state)
        {
        default:
            return;

        case 0: // '\0'
        case 3: // '\003'
            if (!((LocaleInfo) (adapterview)).locale.equals(view))
            {
                A.b(((LocaleInfo) (adapterview)).locale);
                return;
            }
            break;

        case 1: // '\001'
            A.a(adapterview);
            return;

        case 2: // '\002'
            A.a(adapterview);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }
}

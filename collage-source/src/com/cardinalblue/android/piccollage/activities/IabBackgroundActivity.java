// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.Toolbar;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.b;
import com.cardinalblue.android.piccollage.controller.a;
import com.cardinalblue.android.piccollage.iab.util.d;
import com.cardinalblue.android.piccollage.iab.util.f;
import com.cardinalblue.android.piccollage.iab.util.g;
import com.cardinalblue.android.piccollage.model.PurchasableStickerBundle;
import com.cardinalblue.android.piccollage.model.StickerBundle;
import com.cardinalblue.android.piccollage.view.fragments.e;
import com.cardinalblue.android.piccollage.view.fragments.y;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            BaseActivity

public class IabBackgroundActivity extends BaseActivity
    implements Observer
{
    private static class a extends Handler
    {

        private final WeakReference a;

        public void handleMessage(Message message)
        {
            IabBackgroundActivity iabbackgroundactivity = (IabBackgroundActivity)a.get();
            message.what;
            JVM INSTR tableswitch 0 2: default 40
        //                       0 41
        //                       1 50
        //                       2 77;
               goto _L1 _L2 _L3 _L4
_L1:
            return;
_L2:
            if (iabbackgroundactivity != null)
            {
                com.cardinalblue.android.piccollage.activities.IabBackgroundActivity.a(iabbackgroundactivity);
                return;
            }
            continue; /* Loop/switch isn't completed */
_L3:
            if (iabbackgroundactivity != null)
            {
                if (com.cardinalblue.android.piccollage.activities.IabBackgroundActivity.b(iabbackgroundactivity) == null)
                {
                    com.cardinalblue.android.piccollage.activities.IabBackgroundActivity.a(iabbackgroundactivity);
                }
                com.cardinalblue.android.piccollage.activities.IabBackgroundActivity.b(iabbackgroundactivity).setProgress(message.arg1);
                return;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            if (iabbackgroundactivity != null)
            {
                k.a(iabbackgroundactivity, com.cardinalblue.android.piccollage.activities.IabBackgroundActivity.b(iabbackgroundactivity));
                return;
            }
            if (true) goto _L1; else goto _L5
_L5:
        }

        public a(IabBackgroundActivity iabbackgroundactivity)
        {
            a = new WeakReference(iabbackgroundactivity);
        }
    }


    Handler a;
    private d b;
    private ProgressDialog c;

    public IabBackgroundActivity()
    {
        a = new a(this);
    }

    private void a()
    {
        if (c == null)
        {
            c = new ProgressDialog(this);
        }
        c.setMessage(getString(0x7f070132));
        c.setProgressStyle(1);
        k.b(this, c);
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            c.setProgressNumberFormat(null);
        }
        c.setCanceledOnTouchOutside(false);
        c.setCancelable(true);
        c.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

            final IabBackgroundActivity a;

            public void onCancel(DialogInterface dialoginterface)
            {
                com.cardinalblue.android.piccollage.controller.a.a().e();
            }

            
            {
                a = IabBackgroundActivity.this;
                super();
            }
        });
    }

    static void a(IabBackgroundActivity iabbackgroundactivity)
    {
        iabbackgroundactivity.a();
    }

    static ProgressDialog b(IabBackgroundActivity iabbackgroundactivity)
    {
        return iabbackgroundactivity.c;
    }

    private void b()
    {
        b = new d(this, k.o());
        b.a(false);
        b.a(new com.cardinalblue.android.piccollage.iab.util.d.d() {

            final IabBackgroundActivity a;

            public void a(com.cardinalblue.android.piccollage.iab.util.e e1)
            {
                if (e1.c());
            }

            
            {
                a = IabBackgroundActivity.this;
                super();
            }
        });
    }

    static d c(IabBackgroundActivity iabbackgroundactivity)
    {
        return iabbackgroundactivity.b;
    }

    public void a(StickerBundle stickerbundle)
    {
        String s;
label0:
        {
            if (stickerbundle != null)
            {
                s = stickerbundle.l();
                if (s != null)
                {
                    break label0;
                }
            }
            k.a(this, 0x7f0700f8, 1);
            return;
        }
        if (b != null && b.c())
        {
            try
            {
                b.a(this, s, 701, new com.cardinalblue.android.piccollage.iab.util.d.c(s, stickerbundle) {

                    final String a;
                    final StickerBundle b;
                    final IabBackgroundActivity c;

                    public void a(com.cardinalblue.android.piccollage.iab.util.e e1, g g1)
                    {
                        boolean flag;
                        while (IabBackgroundActivity.c(c) == null || e1 == null) 
                        {
                            return;
                        }
                        if (e1.a() == 7)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        if (e1.d() && !flag)
                        {
                            switch (e1.a())
                            {
                            default:
                                return;

                            case 6: // '\006'
                                e1 = new ArrayList();
                                break;
                            }
                            e1.add(a);
                            IabBackgroundActivity.c(c).a(true, e1, new com.cardinalblue.android.piccollage.iab.util.d.e(this, g1) {

                                final g a;
                                final _cls3 b;

                                public void a(com.cardinalblue.android.piccollage.iab.util.e e1, f f1)
                                {
                                    if (!e1.d())
                                    {
                                        e1 = f1.a(b.a);
                                        if (a != null)
                                        {
                                            IabBackgroundActivity.c(b.c).a(e1, null);
                                            return;
                                        }
                                    }
                                }

            
            {
                b = _pcls3;
                a = g;
                super();
            }
                            });
                            return;
                        }
                        if (!flag) goto _L2; else goto _L1
_L1:
                        k.a(c, 0x7f0701ef, 0);
_L4:
                        (new Handler()).post(new Runnable(this) {

                            final _cls3 a;

                            public void run()
                            {
                                com.cardinalblue.android.piccollage.controller.a.a().a(a.b);
                            }

            
            {
                a = _pcls3;
                super();
            }
                        });
                        return;
_L2:
                        if (g1 != null)
                        {
                            com.cardinalblue.android.piccollage.a.b.f(g1.d(), "background store");
                        }
                        if (true) goto _L4; else goto _L3
_L3:
                    }

            
            {
                c = IabBackgroundActivity.this;
                a = s;
                b = stickerbundle;
                super();
            }
                });
                return;
            }
            // Misplaced declaration of an exception variable
            catch (StickerBundle stickerbundle)
            {
                k.a(this, 0x7f07010e, 1);
            }
            return;
        } else
        {
            k.a(this, e.a(null, getString(0x7f07023f), getString(0x104000a), null), "can not bind iab helper");
            return;
        }
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        if (b == null || !b.a(i, j, intent))
        {
            super.onActivityResult(i, j, intent);
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f03003c);
        setSupportActionBar((Toolbar)findViewById(0x7f1000c5));
        bundle = (PurchasableStickerBundle)getIntent().getExtras().getParcelable("extra_purchasable_bundle");
        y y1 = new y();
        Bundle bundle1 = new Bundle();
        bundle1.putParcelable("sticker_bundle", bundle);
        y1.setArguments(bundle1);
        getSupportFragmentManager().beginTransaction().replace(0x7f1000cd, y1, "purchase_background_fragment").commitAllowingStateLoss();
        com.cardinalblue.android.piccollage.controller.a.a().addObserver(this);
        try
        {
            b();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            bundle.printStackTrace();
        }
    }

    protected void onDestroy()
    {
        super.onDestroy();
        com.cardinalblue.android.piccollage.controller.a.a().deleteObserver(this);
    }

    public void update(Observable observable, Object obj)
    {
        observable = (com.cardinalblue.android.piccollage.controller.a.a)obj;
        static class _cls4
        {

            static final int a[];

            static 
            {
                a = new int[com.cardinalblue.android.piccollage.controller.a.a.a.values().length];
                try
                {
                    a[com.cardinalblue.android.piccollage.controller.a.a.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[com.cardinalblue.android.piccollage.controller.a.a.a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[com.cardinalblue.android.piccollage.controller.a.a.a.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.cardinalblue.android.piccollage.controller.a.a.a.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.cardinalblue.android.piccollage.controller.a.a.a.e.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (com.cardinalblue.android.piccollage.activities._cls4.a[((com.cardinalblue.android.piccollage.controller.a.a) (observable)).a.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            a.sendEmptyMessage(0);
            return;

        case 2: // '\002'
            a.sendMessage(a.obtainMessage(1, Integer.valueOf(((com.cardinalblue.android.piccollage.controller.a.a) (observable)).b.toString()).intValue(), -1));
            return;

        case 3: // '\003'
            a.sendEmptyMessage(2);
            setResult(-1);
            finish();
            return;

        case 4: // '\004'
            a.sendEmptyMessage(2);
            k.a(this, Integer.valueOf(((com.cardinalblue.android.piccollage.controller.a.a) (observable)).b.toString()).intValue(), 0);
            return;

        case 5: // '\005'
            a.sendEmptyMessage(2);
            break;
        }
        k.a(this, 0x7f070130, 0);
    }
}

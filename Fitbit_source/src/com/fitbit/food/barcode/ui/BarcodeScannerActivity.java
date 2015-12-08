// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.barcode.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.ViewTreeObserver;
import android.widget.CompoundButton;
import android.widget.ToggleButton;
import com.fitbit.FitBitApplication;
import com.fitbit.analytics.google.ga.AnalyticsContainer;
import com.fitbit.data.bl.ci;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.bl.r;
import com.fitbit.data.domain.FoodItem;
import com.fitbit.e.a;
import com.fitbit.food.barcode.a.d;
import com.fitbit.food.barcode.a.h;
import com.fitbit.food.barcode.a.i;
import com.fitbit.food.barcode.a.l;
import com.fitbit.food.barcode.b.b;
import com.fitbit.food.ui.logging.LogFoodActivity;
import com.fitbit.ui.FitbitActivity;
import com.fitbit.ui.s;
import com.fitbit.util.RetryDialogFragment;
import com.fitbit.util.SimpleConfirmDialogFragment;
import com.fitbit.util.ad;
import com.fitbit.util.bi;
import com.fitbit.util.threading.c;
import com.google.zxing.f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.EnumSet;

// Referenced classes of package com.fitbit.food.barcode.ui:
//            BarcodeScannerActivity_, NeedSubmitFragment, SubmitCompletedFragment, SubmitToDbFragment, 
//            BarcodeStatusView, BarcodeCrosshairView, b

public class BarcodeScannerActivity extends FitbitActivity
    implements android.support.v4.app.LoaderManager.LoaderCallbacks, i
{
    public static final class ScanningState extends Enum
    {

        public static final ScanningState a;
        public static final ScanningState b;
        public static final ScanningState c;
        public static final ScanningState d;
        public static final ScanningState e;
        public static final ScanningState f;
        private static final ScanningState g[];

        public static ScanningState valueOf(String s1)
        {
            return (ScanningState)Enum.valueOf(com/fitbit/food/barcode/ui/BarcodeScannerActivity$ScanningState, s1);
        }

        public static ScanningState[] values()
        {
            return (ScanningState[])g.clone();
        }

        static 
        {
            a = new ScanningState("NO_CONNECTION", 0);
            b = new ScanningState("SCAN", 1);
            c = new ScanningState("SEND_REQUEST", 2);
            d = new ScanningState("SEARCH_NO_RESULTS", 3);
            e = new ScanningState("SUBMIT_TO_DB", 4);
            f = new ScanningState("SUBMITTING_COMPLETED", 5);
            g = (new ScanningState[] {
                a, b, c, d, e, f
            });
        }

        private ScanningState(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    class a
        implements android.view.SurfaceHolder.Callback
    {

        final BarcodeScannerActivity a;

        public void surfaceChanged(SurfaceHolder surfaceholder, int i1, int j1, int k1)
        {
        }

        public void surfaceCreated(SurfaceHolder surfaceholder)
        {
            a.a(surfaceholder);
        }

        public void surfaceDestroyed(SurfaceHolder surfaceholder)
        {
        }

        a()
        {
            a = BarcodeScannerActivity.this;
            super();
        }
    }


    private static final String j = "Log Food - barcode";
    private static final String k = "BarcodeScannerActivity";
    private static final int l = 5000;
    private static final String m = "com.fitbit.food.barcode.ui.BarcodeScannerActivity.TAG_DIALOG_SUBMIT_TO_DB";
    private static final String n = "com.fitbit.food.barcode.ui.BarcodeScannerActivity.TAG_DIALOG_UPLOAD_FINISHED";
    private static final String o = "com.fitbit.food.barcode.ui.BarcodeScannerActivity.TAG_FRAGMENT_SUBMIT_TO_DB";
    private static final String p = "com.fitbit.food.barcode.ui.BarcodeScannerActivity.TAG_DIALOG_RETRY";
    private Handler A;
    private Runnable B;
    private boolean C;
    protected SurfaceView a;
    protected BarcodeCrosshairView b;
    protected ToggleButton c;
    protected BarcodeStatusView d;
    protected ScanningState e;
    protected ScanningState f;
    protected String g;
    protected ArrayList h;
    protected Date i;
    private com.fitbit.food.barcode.b.a.a q;
    private c r;
    private com.fitbit.food.barcode.b.b.a s;
    private EnumSet t;
    private SurfaceHolder u;
    private a v;
    private f w;
    private d x;
    private com.fitbit.food.barcode.b.a y;
    private b z;

    public BarcodeScannerActivity()
    {
        q = new com.fitbit.food.barcode.b.a.a() {

            final BarcodeScannerActivity a;

            public void a()
            {
                com.fitbit.food.barcode.ui.BarcodeScannerActivity.a(a);
            }

            public void a(String s1)
            {
                a.g = s1;
                a.b(com.fitbit.food.barcode.ui.ScanningState.c);
            }

            
            {
                a = BarcodeScannerActivity.this;
                super();
            }
        };
        r = new c() {

            final BarcodeScannerActivity a;

            protected void a(Intent intent)
            {
                if (intent == null) goto _L2; else goto _L1
_L1:
                String s1;
                byte byte0;
                s1 = intent.getAction();
                byte0 = -1;
                s1.hashCode();
                JVM INSTR lookupswitch 3: default 48
            //                           -1603278973: 105
            //                           1438654852: 77
            //                           1499674368: 91;
                   goto _L3 _L4 _L5 _L6
_L3:
                byte0;
                JVM INSTR tableswitch 0 2: default 76
            //                           0 119
            //                           1 147
            //                           2 155;
                   goto _L2 _L7 _L8 _L9
_L2:
                return;
_L5:
                if (s1.equals("com.fitbit.food.barcode.ui.UploadBarcodeFragment.ACTION_SUBMIT_TO_DB"))
                {
                    byte0 = 0;
                }
                  goto _L3
_L6:
                if (s1.equals("com.fitbit.food.barcode.ui.ScanAnotherBarcodeFragment.ACTION_START_SCAN"))
                {
                    byte0 = 1;
                }
                  goto _L3
_L4:
                if (s1.equals("com.fitbit.food.barcode.ui.SubmitToDbFragment.ACTION_TAKE_PICTURE"))
                {
                    byte0 = 2;
                }
                  goto _L3
_L7:
                com.fitbit.food.barcode.c.c.a(a);
                a.h.clear();
                a.b(ScanningState.e);
                return;
_L8:
                com.fitbit.food.barcode.ui.BarcodeScannerActivity.a(a);
                return;
_L9:
                a.h = intent.getParcelableArrayListExtra("com.fitbit.food.barcode.ui.SubmitCompletedFragment.EXTRA_URI_LIST");
                a.b(com.fitbit.food.barcode.ui.ScanningState.f);
                return;
            }

            
            {
                a = BarcodeScannerActivity.this;
                super();
            }
        };
        s = new com.fitbit.food.barcode.b.b.a() {

            final BarcodeScannerActivity a;
            private com.fitbit.util.SimpleConfirmDialogFragment.a b;
            private com.fitbit.util.SimpleConfirmDialogFragment.a c;

            private com.fitbit.util.SimpleConfirmDialogFragment.a b()
            {
                if (b == null)
                {
                    b = new com.fitbit.util.SimpleConfirmDialogFragment.a(this) {

                        final _cls4 a;

                        public void a(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
                        {
                            if (com.fitbit.food.barcode.ui.BarcodeScannerActivity.b(a.a))
                            {
                                com.fitbit.food.barcode.ui.BarcodeScannerActivity.a(a.a);
                            }
                        }

                        public void b(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
                        {
                            a.a.finish();
                        }

                        public void c(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
                        {
                        }

            
            {
                a = _pcls4;
                super();
            }
                    };
                }
                return b;
            }

            private com.fitbit.util.SimpleConfirmDialogFragment.a c()
            {
                if (c == null)
                {
                    c = new com.fitbit.util.SimpleConfirmDialogFragment.a(this) {

                        final _cls4 a;

                        public void a(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
                        {
                            if (com.fitbit.food.barcode.ui.BarcodeScannerActivity.b(a.a))
                            {
                                com.fitbit.food.barcode.ui.BarcodeScannerActivity.c(a.a);
                            }
                        }

                        public void b(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
                        {
                            a.a.finish();
                        }

                        public void c(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
                        {
                        }

            
            {
                a = _pcls4;
                super();
            }
                    };
                }
                return c;
            }

            public void a()
            {
                a.b(com.fitbit.food.barcode.ui.ScanningState.d);
            }

            public void a(ServerCommunicationException servercommunicationexception)
            {
                com.fitbit.util.SimpleConfirmDialogFragment.a a1;
                if (com.fitbit.data.bl.exceptions.ServerCommunicationException.ServerErrorType.a == servercommunicationexception.f())
                {
                    a1 = b();
                } else
                {
                    a1 = c();
                }
                RetryDialogFragment.a(a1, 0x7f08048f, servercommunicationexception.a()).show(a.getSupportFragmentManager(), "com.fitbit.food.barcode.ui.BarcodeScannerActivity.TAG_DIALOG_RETRY");
            }

            public void a(FoodItem fooditem)
            {
                a.finish();
                LogFoodActivity.a(a, fooditem, a.i);
            }

            
            {
                a = BarcodeScannerActivity.this;
                super();
            }
        };
        t = EnumSet.of(com.fitbit.food.barcode.ui.ScanningState.b, com.fitbit.food.barcode.ui.ScanningState.c, com.fitbit.food.barcode.ui.ScanningState.a);
        C = false;
    }

    static com.fitbit.food.barcode.b.a a(BarcodeScannerActivity barcodescanneractivity, com.fitbit.food.barcode.b.a a1)
    {
        barcodescanneractivity.y = a1;
        return a1;
    }

    public static void a(Context context, Date date)
    {
        com.fitbit.food.barcode.ui.BarcodeScannerActivity_.a(context).a(date).a(0x4000000).b();
    }

    public static void a(Fragment fragment, Date date)
    {
        com.fitbit.food.barcode.ui.BarcodeScannerActivity_.a(fragment).a(date).a(0x4000000).b();
    }

    static void a(BarcodeScannerActivity barcodescanneractivity)
    {
        barcodescanneractivity.p();
    }

    private void a(String s1)
    {
        ad.a(getSupportFragmentManager(), s1, 4099);
    }

    private void b(String s1)
    {
        FragmentManager fragmentmanager = getSupportFragmentManager();
        FragmentTransaction fragmenttransaction = fragmentmanager.beginTransaction();
        Fragment fragment = fragmentmanager.findFragmentByTag(s1);
        if (fragment == null)
        {
            fragmenttransaction.add(0x7f11006c, c(s1), s1);
        } else
        {
            fragmenttransaction.show(fragment);
        }
        fragmenttransaction.setTransition(4099);
        fragmenttransaction.commitAllowingStateLoss();
        fragmentmanager.executePendingTransactions();
    }

    static boolean b(BarcodeScannerActivity barcodescanneractivity)
    {
        return barcodescanneractivity.r();
    }

    private Fragment c(String s1)
    {
        byte byte0 = -1;
        s1.hashCode();
        JVM INSTR lookupswitch 3: default 40
    //                   -413507227: 98
    //                   1725280606: 84
    //                   1962252333: 70;
           goto _L1 _L2 _L3 _L4
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break MISSING_BLOCK_LABEL_98;
_L5:
        switch (byte0)
        {
        default:
            return null;

        case 0: // '\0'
            return com.fitbit.food.barcode.ui.NeedSubmitFragment.a(C);

        case 1: // '\001'
            return com.fitbit.food.barcode.ui.SubmitCompletedFragment.a(h);

        case 2: // '\002'
            return com.fitbit.food.barcode.ui.SubmitToDbFragment.a(h, g, this);
        }
_L4:
        if (s1.equals("com.fitbit.food.barcode.ui.BarcodeScannerActivity.TAG_DIALOG_SUBMIT_TO_DB"))
        {
            byte0 = 0;
        }
          goto _L5
_L3:
        if (s1.equals("com.fitbit.food.barcode.ui.BarcodeScannerActivity.TAG_DIALOG_UPLOAD_FINISHED"))
        {
            byte0 = 1;
        }
          goto _L5
        if (s1.equals("com.fitbit.food.barcode.ui.BarcodeScannerActivity.TAG_FRAGMENT_SUBMIT_TO_DB"))
        {
            byte0 = 2;
        }
          goto _L5
    }

    private void c(ScanningState scanningstate)
    {
        static class _cls2
        {

            static final int a[];

            static 
            {
                a = new int[ScanningState.values().length];
                try
                {
                    a[com.fitbit.food.barcode.ui.ScanningState.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[com.fitbit.food.barcode.ui.ScanningState.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[com.fitbit.food.barcode.ui.ScanningState.d.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[ScanningState.e.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.fitbit.food.barcode.ui.ScanningState.f.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.fitbit.food.barcode.ui.ScanningState.a.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (com.fitbit.food.barcode.ui._cls2.a[scanningstate.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            d.setVisibility(0);
            if (com.fitbit.food.barcode.ui.BarcodeStatusView.SearchStatus.c != d.a())
            {
                d.a(com.fitbit.food.barcode.ui.BarcodeStatusView.SearchStatus.b);
            }
            b.setVisibility(0);
            b.b();
            j();
            return;

        case 2: // '\002'
            h();
            d.setVisibility(0);
            d.a(com.fitbit.food.barcode.ui.BarcodeStatusView.SearchStatus.d);
            b.setVisibility(0);
            b.a();
            i();
            return;

        case 3: // '\003'
            d.setVisibility(8);
            b.setVisibility(8);
            b("com.fitbit.food.barcode.ui.BarcodeScannerActivity.TAG_DIALOG_SUBMIT_TO_DB");
            return;

        case 4: // '\004'
            d.setVisibility(8);
            if (g == null)
            {
                p();
                return;
            } else
            {
                b("com.fitbit.food.barcode.ui.BarcodeScannerActivity.TAG_FRAGMENT_SUBMIT_TO_DB");
                return;
            }

        case 5: // '\005'
            d.setVisibility(8);
            b("com.fitbit.food.barcode.ui.BarcodeScannerActivity.TAG_DIALOG_UPLOAD_FINISHED");
            return;

        case 6: // '\006'
            h();
            l();
            d.setVisibility(0);
            d.a(com.fitbit.food.barcode.ui.BarcodeStatusView.SearchStatus.a);
            b.setVisibility(8);
            return;
        }
    }

    static void c(BarcodeScannerActivity barcodescanneractivity)
    {
        barcodescanneractivity.q();
    }

    public static boolean c()
    {
        boolean flag = com.fitbit.data.bl.r.a().t();
        boolean flag1 = com.fitbit.food.barcode.a.d.a(FitBitApplication.a());
        return flag && flag1;
    }

    static d d(BarcodeScannerActivity barcodescanneractivity)
    {
        return barcodescanneractivity.x;
    }

    static com.fitbit.food.barcode.b.a e(BarcodeScannerActivity barcodescanneractivity)
    {
        return barcodescanneractivity.y;
    }

    static f f(BarcodeScannerActivity barcodescanneractivity)
    {
        return barcodescanneractivity.w;
    }

    private void f()
    {
        ViewTreeObserver viewtreeobserver = b.getViewTreeObserver();
        if (viewtreeobserver.isAlive())
        {
            viewtreeobserver.addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

                final BarcodeScannerActivity a;

                public void onGlobalLayout()
                {
                    Rect rect;
                    Point point;
                    int i1;
                    int j1;
                    if (com.fitbit.util.b.a.a(16))
                    {
                        a.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    } else
                    {
                        a.b.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    }
                    rect = new Rect();
                    a.b.getGlobalVisibleRect(rect);
                    point = new Point(rect.left, rect.top);
                    i1 = rect.width();
                    j1 = rect.height();
                    com.fitbit.food.barcode.ui.BarcodeScannerActivity.d(a).a(point, i1, j1);
                }

            
            {
                a = BarcodeScannerActivity.this;
                super();
            }
            });
        }
    }

    private IntentFilter g()
    {
        IntentFilter intentfilter = new IntentFilter("com.fitbit.food.barcode.ui.ScanAnotherBarcodeFragment.ACTION_START_SCAN");
        intentfilter.addAction("com.fitbit.food.barcode.ui.UploadBarcodeFragment.ACTION_SUBMIT_TO_DB");
        intentfilter.addAction("com.fitbit.food.barcode.ui.SubmitToDbFragment.ACTION_TAKE_PICTURE");
        return intentfilter;
    }

    static com.fitbit.food.barcode.b.a.a g(BarcodeScannerActivity barcodescanneractivity)
    {
        return barcodescanneractivity.q;
    }

    private void h()
    {
        A.removeCallbacksAndMessages(null);
        B = null;
    }

    static void h(BarcodeScannerActivity barcodescanneractivity)
    {
        barcodescanneractivity.n();
    }

    private void i()
    {
        if (g != null)
        {
            if (z != null)
            {
                z.cancel(true);
            }
            z = new b(s);
            z.execute(new String[] {
                g
            });
        }
    }

    private void j()
    {
        g = null;
        k();
        com.fitbit.food.barcode.ui.b b1 = o();
        x.a(b1);
    }

    private void k()
    {
        B = new Runnable() {

            final BarcodeScannerActivity a;

            public void run()
            {
                if (com.fitbit.food.barcode.ui.ScanningState.b == a.e())
                {
                    a.d.a(com.fitbit.food.barcode.ui.BarcodeStatusView.SearchStatus.c);
                }
            }

            
            {
                a = BarcodeScannerActivity.this;
                super();
            }
        };
        A.postDelayed(B, 5000L);
    }

    private void l()
    {
        if (f == null) goto _L2; else goto _L1
_L1:
        com.fitbit.food.barcode.ui._cls2.a[f.ordinal()];
        JVM INSTR tableswitch 3 5: default 44
    //                   3 45
    //                   4 52
    //                   5 59;
           goto _L2 _L3 _L4 _L5
_L2:
        return;
_L3:
        a("com.fitbit.food.barcode.ui.BarcodeScannerActivity.TAG_DIALOG_SUBMIT_TO_DB");
        return;
_L4:
        a("com.fitbit.food.barcode.ui.BarcodeScannerActivity.TAG_FRAGMENT_SUBMIT_TO_DB");
        return;
_L5:
        a("com.fitbit.food.barcode.ui.BarcodeScannerActivity.TAG_DIALOG_UPLOAD_FINISHED");
        return;
    }

    private void m()
    {
        boolean flag;
        c.setEnabled(true);
        flag = false;
        boolean flag1 = x.i();
        flag = flag1;
_L2:
        c.setChecked(flag);
        return;
        IOException ioexception;
        ioexception;
        n();
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void n()
    {
        com.fitbit.ui.s.a(this, 0x7f08053a, 1).a(new android.content.DialogInterface.OnClickListener() {

            final BarcodeScannerActivity a;

            public void onClick(DialogInterface dialoginterface, int i1)
            {
                a.finish();
            }

            
            {
                a = BarcodeScannerActivity.this;
                super();
            }
        }).i();
    }

    private com.fitbit.food.barcode.ui.b o()
    {
        return new com.fitbit.food.barcode.ui.b(x) {

            final BarcodeScannerActivity a;

            public void a(com.google.zxing.b b1)
            {
                if (BarcodeScannerActivity.e(a) != null)
                {
                    BarcodeScannerActivity.e(a).b();
                }
                com.fitbit.food.barcode.ui.BarcodeScannerActivity.a(a, new com.fitbit.food.barcode.b.a(com.fitbit.food.barcode.ui.BarcodeScannerActivity.f(a), BarcodeScannerActivity.g(a)));
                BarcodeScannerActivity.e(a).execute(new com.google.zxing.b[] {
                    b1
                });
            }

            
            {
                a = BarcodeScannerActivity.this;
                super(d1);
            }
        };
    }

    private void p()
    {
label0:
        {
            if (r())
            {
                if (com.fitbit.food.barcode.ui.ScanningState.b != e)
                {
                    break label0;
                }
                c(com.fitbit.food.barcode.ui.ScanningState.b);
            }
            return;
        }
        a(com.fitbit.food.barcode.ui.ScanningState.b);
    }

    private void q()
    {
label0:
        {
            if (r())
            {
                if (com.fitbit.food.barcode.ui.ScanningState.c != e)
                {
                    break label0;
                }
                c(com.fitbit.food.barcode.ui.ScanningState.c);
            }
            return;
        }
        a(com.fitbit.food.barcode.ui.ScanningState.c);
    }

    private boolean r()
    {
        return com.fitbit.food.barcode.ui.ScanningState.a != e;
    }

    public void a(Loader loader, Boolean boolean1)
    {
        boolean flag;
        if (boolean1 != null && boolean1.booleanValue())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        C = flag;
    }

    public void a(SurfaceHolder surfaceholder)
    {
        x.a();
        x.a(surfaceholder);
        x.e();
        m();
        if (!P())
        {
            break MISSING_BLOCK_LABEL_76;
        }
        if (e != null)
        {
            if (t.contains(e))
            {
                c(e);
                return;
            }
            break MISSING_BLOCK_LABEL_76;
        }
        try
        {
            b(com.fitbit.food.barcode.ui.ScanningState.b);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (SurfaceHolder surfaceholder)
        {
            n();
        }
    }

    public void a(CompoundButton compoundbutton, boolean flag)
    {
        try
        {
            x.a(flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (CompoundButton compoundbutton)
        {
            n();
        }
    }

    public void a(h h1, String s1)
    {
        String s2;
        if (x.b())
        {
            s2 = "open";
        } else
        {
            s2 = "close";
        }
        com.fitbit.e.a.a("BarcodeScannerActivity", "Scanner activity start take photo. Camera manager is %s", new Object[] {
            s2
        });
        if (!x.b())
        {
            break MISSING_BLOCK_LABEL_63;
        }
        h1 = new l(h1, s1) {

            final BarcodeScannerActivity a;

            public void a(Exception exception)
            {
                com.fitbit.e.a.f("BarcodeScannerActivity", "Show internal error dialog", exception, new Object[0]);
                com.fitbit.food.barcode.ui.BarcodeScannerActivity.h(a);
            }

            
            {
                a = BarcodeScannerActivity.this;
                super(h1, s1);
            }
        };
        x.a(h1, u);
        return;
        h1;
        com.fitbit.e.a.f("BarcodeScannerActivity", "IOException taking photo", h1, new Object[0]);
        n();
        return;
    }

    protected void a(ScanningState scanningstate)
    {
        if (scanningstate != null && e != scanningstate)
        {
            f = e;
            e = scanningstate;
            c(scanningstate);
        }
    }

    public void b(ScanningState scanningstate)
    {
        if (r())
        {
            a(scanningstate);
        }
    }

    protected void d()
    {
        f();
        c.setEnabled(false);
    }

    public ScanningState e()
    {
        return e;
    }

    protected void m_()
    {
        if (!r())
        {
            a(f);
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        A = new Handler();
        w = new f();
        x = new d(this);
        v = new a();
        if (h == null)
        {
            h = new ArrayList();
        }
        if (f == null)
        {
            f = com.fitbit.food.barcode.ui.ScanningState.b;
        }
        getSupportLoaderManager().restartLoader(29, null, this);
    }

    public Loader onCreateLoader(int i1, Bundle bundle)
    {
        return new bi(this) {

            final BarcodeScannerActivity a;

            public Boolean b()
            {
                return Boolean.valueOf(com.fitbit.data.bl.r.a().s());
            }

            protected Intent f()
            {
                return ci.a(a);
            }

            public Object f_()
            {
                return b();
            }

            
            {
                a = BarcodeScannerActivity.this;
                super(context);
            }
        };
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (Boolean)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }

    protected void onPause()
    {
        r.d();
        x.f();
        u.removeCallback(v);
        x.c();
        super.onPause();
    }

    protected void onResume()
    {
        super.onResume();
        u = a.getHolder();
        u.addCallback(v);
        com.fitbit.food.barcode.ui.SubmitToDbFragment.a(getSupportFragmentManager(), "com.fitbit.food.barcode.ui.BarcodeScannerActivity.TAG_FRAGMENT_SUBMIT_TO_DB", this);
        a(u);
        IntentFilter intentfilter = g();
        r.a(intentfilter);
        FitBitApplication.a().c().a(0x7f11000a).a("Log Food - barcode");
    }

    protected void t_()
    {
        if (r())
        {
            a(com.fitbit.food.barcode.ui.ScanningState.a);
        }
    }
}

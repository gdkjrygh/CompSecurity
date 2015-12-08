// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Vibrator;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.OrientationEventListener;
import android.view.SurfaceView;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.paypal.android.sdk.go;
import com.paypal.android.sdk.gt;
import com.paypal.android.sdk.gu;
import com.paypal.android.sdk.w;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Constructor;

// Referenced classes of package io.card.payment:
//            CardScanner, r, a, u, 
//            s, DataEntryActivity, c, e, 
//            h, g, CreditCard

public final class CardIOActivity extends Activity
{

    private static boolean A;
    public static final int a = 0xca8d10;
    public static final int b;
    public static final int c;
    public static final int d;
    public static final int e;
    static Bitmap f = null;
    private static int g;
    private static final String h = io/card/payment/CardIOActivity.getSimpleName();
    private static final long i[] = {
        0L, 70L, 10L, 40L
    };
    private static int j = 10;
    private static final int k = 10;
    private static int x = 0;
    private r l;
    private OrientationEventListener m;
    private s n;
    private CreditCard o;
    private Rect p;
    private int q;
    private int r;
    private boolean s;
    private boolean t;
    private LinearLayout u;
    private RelativeLayout v;
    private FrameLayout w;
    private CardScanner y;
    private boolean z;

    public CardIOActivity()
    {
        s = false;
        t = false;
        z = false;
    }

    static CreditCard a(CardIOActivity cardioactivity, CreditCard creditcard)
    {
        cardioactivity.o = null;
        return null;
    }

    static r a(CardIOActivity cardioactivity)
    {
        return cardioactivity.l;
    }

    private void a(float f1)
    {
        if (u != null)
        {
            RotateAnimation rotateanimation = new RotateAnimation(0.0F, f1, u.getWidth() / 2, u.getHeight() / 2);
            rotateanimation.setDuration(0L);
            rotateanimation.setRepeatCount(0);
            rotateanimation.setFillAfter(true);
            u.setAnimation(rotateanimation);
        }
    }

    private void a(int i1, Intent intent)
    {
        setResult(i1, intent);
        f = null;
        finish();
    }

    static void a(CardIOActivity cardioactivity, int i1)
    {
        cardioactivity.b(i1);
    }

    private void a(Exception exception)
    {
        String s1 = gt.a(gu.r);
        Log.e("card.io", "Unkown exception - please send the stack trace to support@card.io", exception);
        exception = Toast.makeText(this, s1, 1);
        exception.setGravity(17, 0, -75);
        exception.show();
        z = true;
    }

    private void a(boolean flag)
    {
        boolean flag1;
        if (n != null && l != null && y.b(flag))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            l.b(flag);
        }
    }

    public static boolean a()
    {
        boolean flag;
        try
        {
            flag = io.card.payment.u.a();
        }
        catch (a a1)
        {
            return false;
        }
        catch (RuntimeException runtimeexception)
        {
            Log.w(h, "RuntimeException accessing Util.hardwareSupported()");
            return false;
        }
        return flag;
    }

    static CreditCard b(CardIOActivity cardioactivity)
    {
        return cardioactivity.o;
    }

    private void b(int i1)
    {
        if (i1 >= 0 && y != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int j1 = ((WindowManager)getSystemService("window")).getDefaultDisplay().getRotation();
        if (j1 == 0) goto _L4; else goto _L3
_L3:
        byte byte0;
        if (j1 == 1)
        {
            j1 = 90;
        } else
        {
label0:
            {
                if (j1 != 2)
                {
                    break label0;
                }
                j1 = 180;
            }
        }
_L6:
        j1 += i1;
        if (j1 > 360)
        {
            j1 -= 360;
        }
        byte0 = -1;
        if (j1 < 15 || j1 > 345)
        {
            r = 1;
            i1 = 0;
        } else
        if (j1 > 75 && j1 < 105)
        {
            r = 4;
            i1 = 90;
        } else
        if (j1 > 165 && j1 < 195)
        {
            i1 = 180;
            r = 2;
        } else
        {
            i1 = byte0;
            if (j1 > 255)
            {
                i1 = byte0;
                if (j1 < 285)
                {
                    r = 3;
                    i1 = 270;
                }
            }
        }
        if (i1 >= 0 && i1 != q)
        {
            (new StringBuilder("onOrientationChanged(")).append(i1).append(") calling setDeviceOrientation(").append(r).append(")");
            y.a(r);
            c(i1);
            if (i1 == 90)
            {
                a(270F);
                return;
            }
            break MISSING_BLOCK_LABEL_262;
        }
        if (true) goto _L1; else goto _L4
        if (j1 != 3) goto _L4; else goto _L5
_L5:
        j1 = 270;
          goto _L6
_L4:
        j1 = 0;
          goto _L6
        if (i1 == 270)
        {
            a(90F);
            return;
        }
        a(i1);
        return;
          goto _L6
    }

    private void c(int i1)
    {
        SurfaceView surfaceview = n.a();
        if (surfaceview == null)
        {
            Log.wtf("card.io", "surface view is null.. recovering... rotation might be weird.");
            return;
        } else
        {
            p = y.a(surfaceview.getWidth(), surfaceview.getHeight());
            Rect rect = p;
            rect.top = rect.top + surfaceview.getTop();
            rect = p;
            int j1 = rect.bottom;
            rect.bottom = surfaceview.getTop() + j1;
            l.a(p, i1);
            q = i1;
            return;
        }
    }

    static void c(CardIOActivity cardioactivity)
    {
        cardioactivity.f();
    }

    static String d()
    {
        return h;
    }

    static int e()
    {
        return k;
    }

    private void f()
    {
        Intent intent1 = getIntent();
        if (intent1 != null && intent1.getBooleanExtra("io.card.payment.suppressConfirmation", false))
        {
            Intent intent = new Intent(this, io/card/payment/DataEntryActivity);
            intent.putExtra("io.card.payment.scanResult", o);
            o = null;
            if (intent1.getBooleanExtra("io.card.payment.returnCardImage", false) && l != null && l.a() != null)
            {
                ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
                l.a().compress(android.graphics.Bitmap.CompressFormat.JPEG, 80, bytearrayoutputstream);
                intent.putExtra("io.card.payment.capturedCardImage", bytearrayoutputstream.toByteArray());
            }
            a(e, intent);
            return;
        } else
        {
            (new Handler()).post(new c(this));
            return;
        }
    }

    private boolean g()
    {
        o = null;
        if (!A && n == null)
        {
            throw new AssertionError();
        }
        CardScanner cardscanner = y;
        android.view.SurfaceHolder surfaceholder = n.a().getHolder();
        if (!s.a && surfaceholder == null)
        {
            throw new AssertionError();
        }
        boolean flag = cardscanner.a(surfaceholder);
        if (flag)
        {
            v.setVisibility(0);
        }
        return flag;
    }

    final void a(int i1)
    {
        SurfaceView surfaceview = n.a();
        if (l != null)
        {
            l.a(new Rect(surfaceview.getLeft(), surfaceview.getTop(), surfaceview.getRight(), surfaceview.getBottom()));
        }
        r = 1;
        c(0);
        if (1 != r)
        {
            Log.wtf("card.io", "the orientation of the scanner doesn't match the orientation of the activity");
        }
        a(new e());
    }

    final void a(Bitmap bitmap, e e1)
    {
        float f1;
        try
        {
            ((Vibrator)getSystemService("vibrator")).vibrate(i, -1);
        }
        catch (SecurityException securityexception)
        {
            Log.e("card.io", "Could not activate vibration feedback. Please add <uses-permission android:name=\"android.permission.VIBRATE\" /> to your application's manifest.");
        }
        catch (Exception exception)
        {
            Log.w("card.io", "Exception while attempting to vibrate: ", exception);
        }
        y.c();
        v.setVisibility(4);
        if (e1.a)
        {
            o = e1.a();
            l.a(o);
        }
        if (r == 1 || r == 2)
        {
            f1 = ((float)p.right / 428F) * 0.95F;
        } else
        {
            f1 = ((float)p.right / 428F) * 1.15F;
        }
        e1 = new Matrix();
        (new StringBuilder("Scale factor: ")).append(f1);
        e1.postScale(f1, f1);
        e1 = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), e1, false);
        l.a(e1);
        if (t)
        {
            bitmap = new ByteArrayOutputStream();
            e1.compress(android.graphics.Bitmap.CompressFormat.JPEG, 80, bitmap);
            e1 = new Intent();
            if (getIntent() != null && getIntent().getBooleanExtra("io.card.payment.returnCardImage", false))
            {
                e1.putExtra("io.card.payment.capturedCardImage", bitmap.toByteArray());
            }
            a(d, ((Intent) (e1)));
            return;
        } else
        {
            f();
            return;
        }
    }

    final void a(e e1)
    {
        l.a(e1);
    }

    final void b()
    {
        boolean flag;
        if (!y.e())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(flag);
    }

    final void c()
    {
        y.a(true);
    }

    protected final void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
        String.format("onActivityResult(requestCode:%d, resultCode:%d, ...", new Object[] {
            Integer.valueOf(i1), Integer.valueOf(j1)
        });
        if (j1 == a || j1 == b || z)
        {
            if (intent != null && intent.hasExtra("io.card.payment.scanResult"))
            {
                (new StringBuilder("data entry result: ")).append(intent.getParcelableExtra("io.card.payment.scanResult"));
            }
            a(j1, intent);
        } else
        if (v != null)
        {
            v.setVisibility(0);
            return;
        }
    }

    public final void onBackPressed()
    {
        r r1;
        if (!z)
        {
            r1 = l;
        }
        if (y != null)
        {
            super.onBackPressed();
        }
    }

    protected final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        int i1 = x + 1;
        x = i1;
        if (i1 != 1)
        {
            String.format("INTERNAL WARNING: There are %d (not 1) CardIOActivity allocations!", new Object[] {
                Integer.valueOf(x)
            });
        }
        bundle = getIntent();
        bundle.getBooleanExtra("io.card.payment.keepApplicationTheme", false);
        gt.a(bundle);
        t = bundle.getBooleanExtra("io.card.payment.suppressScan", false);
        String s1 = io.card.payment.u.a(getPackageManager().resolveActivity(bundle, 0x10000), io/card/payment/CardIOActivity);
        if (s1 != null)
        {
            throw new RuntimeException(s1);
        }
        s = bundle.getBooleanExtra("io.card.payment.suppressManual", false);
        if (!bundle.getBooleanExtra("io.card.payment.noCamera", false)) goto _L2; else goto _L1
_L1:
        z = true;
_L9:
        if (z) goto _L4; else goto _L3
_L3:
        requestWindowFeature(1);
        p = new Rect();
        r = 1;
        if (!bundle.getBooleanExtra("io.card.payment.cameraBypassTestMode", false)) goto _L6; else goto _L5
_L5:
        if (!getPackageName().contentEquals("io.card.development"))
        {
            Log.e(h, (new StringBuilder()).append(getPackageName()).append(" is not correct").toString());
            throw new IllegalStateException("illegal access of private extra");
        }
          goto _L7
        bundle;
        a(bundle);
_L4:
        if (z && s)
        {
            a(c, ((Intent) (null)));
        }
        return;
_L2:
        if (io.card.payment.u.a()) goto _L9; else goto _L8
_L8:
        gu gu1 = gu.p;
        String s3 = gt.a(gu1);
        Log.w("card.io", (new StringBuilder()).append(gu1).append(": ").append(s3).toString());
        z = true;
          goto _L9
        Object obj;
        obj;
        Object obj1 = gu.q;
        String s4 = gt.a(((gu) (obj1)));
        Log.e("card.io", (new StringBuilder()).append(obj1).append(": ").append(s4).toString());
        obj1 = Toast.makeText(this, s4, 1);
        ((Toast) (obj1)).setGravity(17, 0, -75);
        ((Toast) (obj1)).show();
        z = true;
          goto _L9
        obj1;
        a(((Exception) (obj1)));
          goto _L9
_L7:
        y = (CardScanner)Class.forName("io.card.payment.CardScannerTester").getConstructor(new Class[] {
            getClass(), Integer.TYPE
        }).newInstance(new Object[] {
            this, Integer.valueOf(r)
        });
_L16:
        y.b();
        w = new FrameLayout(this);
        w.setBackgroundColor(0xff000000);
        w.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        bundle = new FrameLayout(this);
        bundle.setId(1);
        y.getClass();
        y.getClass();
        n = new s(this, null, 640, 480);
        n.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1, 48));
        bundle.addView(n);
        l = new r(this, null, io.card.payment.u.a(this));
        l.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        if (getIntent() == null) goto _L11; else goto _L10
_L10:
        int j1;
        boolean flag = getIntent().getBooleanExtra("io.card.payment.useCardIOLogo", false);
        l.c(flag);
        j1 = getIntent().getIntExtra("io.card.payment.guideColor", 0);
        int k1;
        if (j1 == 0)
        {
            break MISSING_BLOCK_LABEL_1160;
        }
        k1 = 0xff000000 | j1;
        if (j1 == k1)
        {
            break MISSING_BLOCK_LABEL_662;
        }
        Log.w("card.io", "Removing transparency from provided guide color.");
        l.a(k1);
_L17:
        String s2;
        boolean flag1 = getIntent().getBooleanExtra("io.card.payment.hideLogo", false);
        l.a(flag1);
        s2 = getIntent().getStringExtra("io.card.payment.scanInstructions");
        if (s2 == null) goto _L11; else goto _L12
_L12:
        l.a(s2);
_L11:
        bundle.addView(l);
        android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        layoutparams.addRule(10);
        layoutparams.addRule(2, 2);
        w.addView(bundle, layoutparams);
        v = new RelativeLayout(this);
        v.setGravity(80);
        bundle = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutparams.addRule(12);
        v.setLayoutParams(bundle);
        v.setId(2);
        v.setGravity(85);
        if (!s)
        {
            bundle = new Button(this);
            bundle.setId(3);
            bundle.setText(gt.a(gu.m));
            bundle.setTextSize(12F);
            bundle.setOnClickListener(new h(this));
            v.addView(bundle);
            go.a(bundle, false, this);
            bundle.setTextSize(14F);
            bundle.setMinimumHeight(go.a("42dip", this));
            android.widget.RelativeLayout.LayoutParams layoutparams1 = (android.widget.RelativeLayout.LayoutParams)bundle.getLayoutParams();
            layoutparams1.width = -2;
            layoutparams1.height = -2;
            layoutparams1.addRule(12);
            go.a(bundle, "16dip", null, "16dip", null);
            go.b(bundle, "4dip", "4dip", "4dip", "4dip");
        }
        bundle = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        bundle.addRule(12);
        j1 = (int)(getResources().getDisplayMetrics().density * 15F + 0.5F);
        bundle.setMargins(0, j1, 0, j1);
        w.addView(v, bundle);
        if (getIntent() == null) goto _L14; else goto _L13
_L13:
        if (u != null)
        {
            w.removeView(u);
            u = null;
        }
        j1 = getIntent().getIntExtra("io.card.payment.scanOverlayLayoutId", -1);
        if (j1 == -1) goto _L14; else goto _L15
_L15:
        u = new LinearLayout(this);
        u.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        getLayoutInflater().inflate(j1, u);
        w.addView(u);
_L14:
        setContentView(w);
        m = new g(this, this, 2);
          goto _L4
_L6:
        y = new CardScanner(this, r);
          goto _L16
        l.a(0xff00ff00);
          goto _L17
    }

    protected final void onDestroy()
    {
        l = null;
        x--;
        if (y != null)
        {
            y.d();
            y = null;
        }
        super.onDestroy();
    }

    protected final void onPause()
    {
        super.onPause();
        if (m != null)
        {
            m.disable();
        }
        a(false);
        if (y != null)
        {
            y.c();
        } else
        if (!z)
        {
            Log.wtf("card.io", "cardScanner is null in onPause()");
            return;
        }
    }

    protected final void onResume()
    {
        super.onResume();
        if (z)
        {
            f();
            return;
        }
        io.card.payment.u.b();
        getWindow().addFlags(1024);
        getWindow().addFlags(128);
        com.paypal.android.sdk.w.b(this);
        setRequestedOrientation(1);
        m.enable();
        if (!g())
        {
            Log.e(h, "Could not connect to camera.");
            String s1 = gt.a(gu.r);
            Log.e("card.io", (new StringBuilder("error display: ")).append(s1).toString());
            Toast.makeText(this, s1, 1).show();
            f();
        } else
        {
            a(false);
        }
        b(q);
    }

    static 
    {
        int i1;
        boolean flag;
        if (!io/card/payment/CardIOActivity.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        A = flag;
        g = 0xca8d10;
        g = 0xca8d11;
        i1 = g;
        g = i1 + 1;
        b = i1;
        i1 = g;
        g = i1 + 1;
        c = i1;
        i1 = g;
        g = i1 + 1;
        d = i1;
        i1 = g;
        g = i1 + 1;
        e = i1;
        j = 11;
    }
}

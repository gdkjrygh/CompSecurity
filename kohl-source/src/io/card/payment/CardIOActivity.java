// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
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
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Constructor;
import java.util.Date;

// Referenced classes of package io.card.payment:
//            P, ao, an, V, 
//            CardScanner, ah, ai, CameraUnavailableException, 
//            al, DataEntryActivity, R, DetectionInfo, 
//            T, ad, a, aj, 
//            S, m, Q, CreditCard

public final class CardIOActivity extends Activity
    implements P
{

    public static final String EXTRA_APP_TOKEN = "io.card.payment.appToken";
    public static final String EXTRA_GUIDE_COLOR = "io.card.payment.guideColor";
    public static final String EXTRA_LANGUAGE_OR_LOCALE = "io.card.payment.languageOrLocale";
    public static final String EXTRA_NO_CAMERA = "io.card.payment.noCamera";
    public static final String EXTRA_REQUIRE_CVV = "io.card.payment.requireCVV";
    public static final String EXTRA_REQUIRE_EXPIRY = "io.card.payment.requireExpiry";
    public static final String EXTRA_REQUIRE_POSTAL_CODE = "io.card.payment.requirePostalCode";
    public static final String EXTRA_REQUIRE_ZIP = "io.card.payment.requireZip";
    public static final String EXTRA_SCAN_RESULT = "io.card.payment.scanResult";
    public static final String EXTRA_SUPPRESS_CONFIRMATION = "io.card.payment.suppressConfirmation";
    public static final String EXTRA_SUPPRESS_MANUAL_ENTRY = "io.card.payment.suppressManual";
    public static final String EXTRA_USE_CARDIO_LOGO = "io.card.payment.useCardIOLogo";
    public static final int RESULT_CARD_INFO = 0xca8d10;
    public static final int RESULT_CONFIRMATION_SUPPRESSED;
    public static final int RESULT_ENTRY_CANCELED;
    public static final int RESULT_SCAN_NOT_AVAILABLE;
    public static final int RESULT_SCAN_SUPPRESSED;
    static Bitmap a = null;
    private static int b;
    private static final long c[] = {
        0L, 70L, 10L, 40L
    };
    private static int d = 10;
    private static final int e = 10;
    private static String f;
    private static int s = 0;
    private static boolean w = true;
    private static boolean x;
    private ah g;
    private OrientationEventListener h;
    private ai i;
    private CreditCard j;
    private Rect k;
    private int l;
    private int m;
    private boolean n;
    private boolean o;
    private LinearLayout p;
    private RelativeLayout q;
    private FrameLayout r;
    private CardScanner t;
    private V u;
    private boolean v;

    public CardIOActivity()
    {
        n = false;
        o = false;
        v = false;
    }

    static CreditCard a(CardIOActivity cardioactivity, CreditCard creditcard)
    {
        cardioactivity.j = null;
        return null;
    }

    static ah a(CardIOActivity cardioactivity)
    {
        return cardioactivity.g;
    }

    private void a(float f1)
    {
        if (p != null)
        {
            RotateAnimation rotateanimation = new RotateAnimation(0.0F, f1, p.getWidth() / 2, p.getHeight() / 2);
            rotateanimation.setDuration(0L);
            rotateanimation.setRepeatCount(0);
            rotateanimation.setFillAfter(true);
            p.setAnimation(rotateanimation);
        }
    }

    private void a(int i1, Intent intent)
    {
        setResult(i1, intent);
        a = null;
        finish();
    }

    static void a(CardIOActivity cardioactivity, int i1)
    {
        cardioactivity.b(i1);
    }

    static void a(CardIOActivity cardioactivity, int i1, Intent intent)
    {
        cardioactivity.a(0, ((Intent) (null)));
    }

    private void a(Exception exception)
    {
        ao ao1 = ao.w;
        Object obj = an.a(ao1);
        Log.e("card.io", "Unkown exception - please send the stack trace to support@card.io", exception);
        obj = Toast.makeText(this, ((CharSequence) (obj)), 1);
        ((Toast) (obj)).setGravity(17, 0, -75);
        ((Toast) (obj)).show();
        v = true;
        u.a(ao1, exception, null);
    }

    private void a(boolean flag)
    {
        boolean flag1;
        if (i != null && g != null && t.b(flag))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            g.a(flag);
        }
    }

    static CreditCard b(CardIOActivity cardioactivity)
    {
        return cardioactivity.j;
    }

    private void b(int i1)
    {
        if (i1 >= 0 && t != null) goto _L2; else goto _L1
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
            m = 1;
            i1 = 0;
        } else
        if (j1 > 75 && j1 < 105)
        {
            m = 4;
            i1 = 90;
        } else
        if (j1 > 165 && j1 < 195)
        {
            i1 = 180;
            m = 2;
        } else
        {
            i1 = byte0;
            if (j1 > 255)
            {
                i1 = byte0;
                if (j1 < 285)
                {
                    m = 3;
                    i1 = 270;
                }
            }
        }
        if (i1 >= 0 && i1 != l)
        {
            (new StringBuilder("onOrientationChanged(")).append(i1).append(") calling setDeviceOrientation(").append(m).append(")").toString();
            t.a(m);
            c(i1);
            if (i1 == 90)
            {
                a(270F);
                return;
            }
            break MISSING_BLOCK_LABEL_268;
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

    static int c()
    {
        return e;
    }

    static CardScanner c(CardIOActivity cardioactivity)
    {
        return cardioactivity.t;
    }

    private void c(int i1)
    {
        SurfaceView surfaceview = i.a();
        if (surfaceview == null)
        {
            Log.wtf("card.io", "surface view is null.. recovering... rotation might be weird.");
            return;
        } else
        {
            k = t.a(surfaceview.getWidth(), surfaceview.getHeight());
            Rect rect = k;
            rect.top = rect.top + surfaceview.getTop();
            rect = k;
            int j1 = rect.bottom;
            rect.bottom = surfaceview.getTop() + j1;
            g.a(k, i1);
            l = i1;
            return;
        }
    }

    public static boolean canReadCardWithCamera()
    {
label0:
        {
            boolean flag1 = false;
            boolean flag = flag1;
            boolean flag2;
            try
            {
                if (!w)
                {
                    break label0;
                }
                flag2 = al.a();
            }
            catch (CameraUnavailableException cameraunavailableexception)
            {
                return false;
            }
            catch (RuntimeException runtimeexception)
            {
                Log.w("CardIOActivity", "RuntimeException accessing Util.hardwareSupported()");
                return false;
            }
            flag = flag1;
            if (flag2)
            {
                flag = true;
            }
        }
        return flag;
    }

    public static boolean canReadCardWithCamera(Context context)
    {
        return canReadCardWithCamera();
    }

    static V d(CardIOActivity cardioactivity)
    {
        return cardioactivity.u;
    }

    private void d()
    {
        if (!w)
        {
            return;
        }
        Intent intent = getIntent();
        if (intent != null && intent.getBooleanExtra("io.card.payment.suppressConfirmation", false))
        {
            Intent intent1 = new Intent(this, io/card/payment/DataEntryActivity);
            intent1.putExtra("io.card.payment.scanResult", j);
            j = null;
            a(RESULT_CONFIRMATION_SUPPRESSED, intent1);
            return;
        } else
        {
            (new Handler()).post(new R(this));
            return;
        }
    }

    static void e(CardIOActivity cardioactivity)
    {
        cardioactivity.d();
    }

    private boolean e()
    {
        j = null;
        if (!x && i == null)
        {
            throw new AssertionError();
        }
        boolean flag = t.a(i.b());
        if (flag)
        {
            q.setVisibility(0);
        }
        return flag;
    }

    public static Date sdkBuildDate()
    {
        return new Date("04/30/2014 22:39:27 -0500");
    }

    public static String sdkVersion()
    {
        return "sdk-3.1.5";
    }

    final void a()
    {
        boolean flag;
        if (!t.f())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(flag);
    }

    final void a(int i1)
    {
        SurfaceView surfaceview = i.a();
        if (g != null)
        {
            g.a(new Rect(surfaceview.getLeft(), surfaceview.getTop(), surfaceview.getRight(), surfaceview.getBottom()));
        }
        m = 1;
        c(0);
        if (1 != m)
        {
            Log.wtf("card.io", "the orientation of the scanner doesn't match the orientation of the activity");
        }
        a(new DetectionInfo());
    }

    final void a(Bitmap bitmap, DetectionInfo detectioninfo)
    {
        float f1;
        try
        {
            ((Vibrator)getSystemService("vibrator")).vibrate(c, -1);
        }
        catch (SecurityException securityexception)
        {
            Log.e("card.io", "Could not activate vibration feedback. Please add <uses-permission android:name=\"android.permission.VIBRATE\" /> to your application's manifest.");
        }
        catch (Exception exception)
        {
            Log.w("card.io", "Exception while attempting to vibrate: ", exception);
        }
        t.c();
        q.setVisibility(4);
        if (detectioninfo.b())
        {
            j = detectioninfo.c();
            g.a(j);
            u.d(t.e());
        }
        if (m == 1 || m == 2)
        {
            f1 = ((float)k.right / 428F) * 0.95F;
        } else
        {
            f1 = ((float)k.right / 428F) * 1.15F;
        }
        detectioninfo = new Matrix();
        (new StringBuilder("Scale factor: ")).append(f1).toString();
        detectioninfo.postScale(f1, f1);
        bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), detectioninfo, false);
        g.a(bitmap);
        if (o && w)
        {
            u.c(t.e());
            detectioninfo = new ByteArrayOutputStream();
            bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 80, detectioninfo);
            bitmap = new Intent();
            a(RESULT_SCAN_SUPPRESSED, ((Intent) (bitmap)));
            return;
        } else
        {
            d();
            return;
        }
    }

    final void a(DetectionInfo detectioninfo)
    {
        g.a(detectioninfo);
    }

    public final void authorizeScanFailed(Throwable throwable)
    {
        Log.w("CardIOActivity", (new StringBuilder("Scan authorization failed: ")).append(throwable.getMessage()).toString());
    }

    public final void authorizeScanSuccessful()
    {
    }

    public final void authorizeScanUnsuccessful()
    {
        if (!w)
        {
            return;
        } else
        {
            w = false;
            Log.e("card.io", "This app is not authorized to scan. Please register it at https://card.io. All card scans will be disabled.");
            (new android.app.AlertDialog.Builder(this)).setTitle(an.a(ao.t)).setMessage(an.a(ao.a)).setNegativeButton(an.a(ao.b), new T(this)).setCancelable(false).create().show();
            return;
        }
    }

    final void b()
    {
        t.a(true);
    }

    public final Rect getTorchRect()
    {
        if (g == null)
        {
            return null;
        } else
        {
            return g.d();
        }
    }

    protected final void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
        String.format("onActivityResult(requestCode:%d, resultCode:%d, ...", new Object[] {
            Integer.valueOf(i1), Integer.valueOf(j1)
        });
        if (j1 == RESULT_CARD_INFO || j1 == RESULT_ENTRY_CANCELED || v)
        {
            if (intent != null && intent.hasExtra("io.card.payment.scanResult"))
            {
                (new StringBuilder("data entry result: ")).append(intent.getParcelableExtra("io.card.payment.scanResult")).toString();
            }
            a(j1, intent);
        } else
        if (q != null)
        {
            q.setVisibility(0);
            return;
        }
    }

    public final void onBackPressed()
    {
        if (v || !g.c())
        {
            break MISSING_BLOCK_LABEL_49;
        }
        e();
_L1:
        return;
        RuntimeException runtimeexception;
        runtimeexception;
        Log.w("CardIOActivity", (new StringBuilder("*** could not return to preview: ")).append(runtimeexception).toString());
        return;
        if (u != null && t != null)
        {
            u.a(t.e());
            super.onBackPressed();
            return;
        }
          goto _L1
    }

    protected final void onCreate(Bundle bundle)
    {
        int i1 = s + 1;
        s = i1;
        if (i1 != 1)
        {
            String.format("INTERNAL WARNING: There are %d (not 1) CardIOActivity allocations!", new Object[] {
                Integer.valueOf(s)
            });
        }
        super.onCreate(bundle);
        bundle = getIntent();
        an.a(bundle);
        String s1 = bundle.getStringExtra("io.card.payment.appToken");
        f = s1;
        if (s1 == null || f.length() == 0 || f.contains(" "))
        {
            throw new IllegalArgumentException("A valid card.io app token must be supplied as a stringExtra with the key CardIOActivity.EXTRA_APP_TOKEN. Get one at https://card.io");
        }
        o = false;
        u = new V(this, f, o);
        s1 = f;
        a a1 = ad.a();
        a1.a(s1, null);
        a1.a(this, "https://api.card.io/0/sdk/auth.json", new aj(this));
        s1 = al.a(getPackageManager().resolveActivity(bundle, 0x10000), io/card/payment/CardIOActivity);
        if (s1 != null)
        {
            throw new RuntimeException(s1);
        }
        n = bundle.getBooleanExtra("io.card.payment.suppressManual", false);
        if (!bundle.getBooleanExtra("io.card.payment.noCamera", false)) goto _L2; else goto _L1
_L1:
        v = true;
_L9:
        if (!w || v) goto _L4; else goto _L3
_L3:
        requestWindowFeature(1);
        k = new Rect();
        m = 1;
        if (!bundle.getBooleanExtra("io.card.payment.cameraBypassTestMode", false)) goto _L6; else goto _L5
_L5:
        if (!getPackageName().contentEquals("io.card.development"))
        {
            Log.e("CardIOActivity", (new StringBuilder()).append(getPackageName()).append(" is not correct").toString());
            throw new IllegalStateException("illegal access of private extra");
        }
          goto _L7
        bundle;
        a(bundle);
_L4:
        if ((v || !w) && n)
        {
            a(RESULT_SCAN_NOT_AVAILABLE, ((Intent) (null)));
        }
        return;
_L2:
        if (al.a()) goto _L9; else goto _L8
_L8:
        ao ao1 = ao.u;
        String s2 = an.a(ao1);
        Log.w("card.io", (new StringBuilder()).append(ao1).append(": ").append(s2).toString());
        v = true;
        u.a(ao1, null);
          goto _L9
        Object obj;
        obj;
        ao ao2 = ao.v;
        Object obj2 = an.a(ao2);
        Log.e("card.io", (new StringBuilder()).append(ao2).append(": ").append(((String) (obj2))).toString());
        obj2 = Toast.makeText(this, ((CharSequence) (obj2)), 1);
        ((Toast) (obj2)).setGravity(17, 0, -75);
        ((Toast) (obj2)).show();
        v = true;
        u.a(ao2, ((Throwable) (obj)), null);
          goto _L9
        obj;
        a(((Exception) (obj)));
          goto _L9
_L7:
        t = (CardScanner)Class.forName("io.card.payment.CardScannerTester").getConstructor(new Class[] {
            getClass(), Integer.TYPE
        }).newInstance(new Object[] {
            this, Integer.valueOf(m)
        });
_L12:
        Object obj1;
        t.b();
        r = new FrameLayout(this);
        r.setBackgroundColor(0xff000000);
        r.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        obj1 = new FrameLayout(this);
        ((FrameLayout) (obj1)).setId(1);
        t.getClass();
        t.getClass();
        i = new ai(this, null, 640, 480);
        i.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1, 48));
        ((FrameLayout) (obj1)).addView(i);
        g = new ah(this, null, al.a(this));
        g.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        if (getIntent() == null) goto _L11; else goto _L10
_L10:
        int j1;
        boolean flag = getIntent().getBooleanExtra("io.card.payment.useCardIOLogo", false);
        g.b(flag);
        j1 = getIntent().getIntExtra("io.card.payment.guideColor", 0);
        int l1;
        if (j1 == 0)
        {
            break MISSING_BLOCK_LABEL_1126;
        }
        l1 = 0xff000000 | j1;
        if (j1 == l1)
        {
            break MISSING_BLOCK_LABEL_775;
        }
        Log.w("card.io", "Removing transparency from provided guide color.");
        g.a(l1);
_L11:
        ((FrameLayout) (obj1)).addView(g);
        bundle = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        bundle.addRule(10);
        bundle.addRule(2, 2);
        r.addView(((View) (obj1)), bundle);
        q = new RelativeLayout(this);
        q.setGravity(80);
        obj1 = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        bundle.addRule(12);
        q.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1)));
        q.setId(2);
        q.setGravity(85);
        if (!n)
        {
            bundle = new Button(this);
            bundle.setId(3);
            bundle.setText(an.a(ao.q));
            bundle.setTextSize(12F);
            bundle.setOnClickListener(new S(this));
            q.addView(bundle);
            io.card.payment.m.a(bundle, false, this);
            bundle.setTextSize(14F);
            bundle.setMinimumHeight(io.card.payment.m.a("42dip", this));
            android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)bundle.getLayoutParams();
            layoutparams.width = -2;
            layoutparams.height = -2;
            layoutparams.addRule(12);
            io.card.payment.m.a(bundle, "16dip", null, "16dip", null);
            io.card.payment.m.b(bundle, "4dip", "4dip", "4dip", "4dip");
        }
        bundle = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        bundle.addRule(12);
        int k1 = (int)(getResources().getDisplayMetrics().density * 15F + 0.5F);
        bundle.setMargins(0, k1, 0, k1);
        r.addView(q, bundle);
        setContentView(r);
        h = new Q(this, this, 2);
          goto _L4
_L6:
        t = new CardScanner(this, m);
          goto _L12
        g.a(0xff00ff00);
          goto _L11
    }

    protected final void onDestroy()
    {
        g = null;
        s--;
        if (t != null)
        {
            t.d();
            t = null;
        }
        super.onDestroy();
    }

    protected final void onPause()
    {
        super.onPause();
        if (h != null)
        {
            h.disable();
        }
        a(false);
        if (t != null)
        {
            t.c();
        } else
        if (!v)
        {
            Log.wtf("card.io", "cardScanner is null in onPause()");
            return;
        }
    }

    protected final void onResume()
    {
        super.onResume();
        if (v)
        {
            u.b(null);
            d();
            return;
        }
        if (!w)
        {
            Log.e("card.io", "This app is not authorized to scan");
            a(0, ((Intent) (null)));
            return;
        }
        al.b();
        getWindow().addFlags(1024);
        getWindow().addFlags(128);
        setRequestedOrientation(1);
        h.enable();
        if (!e())
        {
            Log.e("CardIOActivity", "Could not connect to camera.");
            ao ao1 = ao.w;
            String s1 = an.a(ao1);
            Log.e("card.io", (new StringBuilder("error display: ")).append(s1).toString());
            Toast.makeText(this, s1, 1).show();
            d();
            u.a(ao1, t.e());
        } else
        {
            a(false);
            u.a();
        }
        b(l);
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
        x = flag;
        b = 0xca8d10;
        b = 0xca8d11;
        i1 = b;
        b = i1 + 1;
        RESULT_ENTRY_CANCELED = i1;
        i1 = b;
        b = i1 + 1;
        RESULT_SCAN_NOT_AVAILABLE = i1;
        i1 = b;
        b = i1 + 1;
        RESULT_SCAN_SUPPRESSED = i1;
        i1 = b;
        b = i1 + 1;
        RESULT_CONFIRMATION_SUPPRESSED = i1;
        d = 11;
    }
}

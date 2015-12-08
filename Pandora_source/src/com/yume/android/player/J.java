// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.player;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Display;
import android.view.OrientationEventListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.yume.android.sdk.YuMeAdInfo;
import com.yume.android.sdk.YuMeAssetType;
import com.yume.android.sdk.YuMeException;
import com.yume.android.sdk.YuMeFileFormat;
import com.yume.android.sdk.YuMePlaybackStatus;
import com.yume.android.sdk.YuMePlayerException;
import com.yume.android.sdk.YuMePlayerInfo;
import com.yume.android.sdk.YuMeSDKPlayerInterface;
import com.yume.android.sdk.YuMeTransitionEffect;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

// Referenced classes of package com.yume.android.player:
//            B, P, N, O, 
//            YuMePlayerInterfaceImpl, t, S, q, 
//            az, M, Q, G, 
//            l, X, Z, R, 
//            aa, V, ai, x, 
//            Y, K, ar, a, 
//            b, L, ah, ab

final class J
{

    private static Context A = null;
    private static Context B = null;
    static P b;
    static t c;
    static S d;
    static q e;
    private static B g = com.yume.android.player.B.a();
    private static az i;
    private static int m = -1;
    private static YuMeSDKPlayerInterface n;
    private static YuMePlaybackStatus o;
    private int C;
    private ImageView D;
    private List E;
    private List F;
    N a;
    boolean f;
    private O h;
    private FrameLayout j;
    private int k;
    private int l;
    private OrientationEventListener p;
    private int q;
    private Timer r;
    private int s;
    private int t;
    private String u;
    private int v;
    private int w;
    private Q x;
    private Q y;
    private boolean z;

    public J()
    {
        boolean flag1;
        flag1 = false;
        super();
        a = N.a;
        h = O.a;
        j = null;
        k = 0;
        l = 0;
        p = null;
        q = -1;
        s = 0;
        t = 0;
        u = "";
        v = -1;
        w = -1;
        x = null;
        y = null;
        z = true;
        C = 2;
        f = false;
        D = null;
        E = null;
        F = null;
        n = YuMePlayerInterfaceImpl.a;
        L();
        h = u();
        c = new t();
        d = new S();
        e = new q();
        i = new az();
        Class.forName("net.fortuna.ical4j.data.CalendarBuilder");
        g.b("External jars required for supporting 'Tap To Calendar' found.");
        boolean flag = true;
_L1:
        int i1 = ((flag1) ? 1 : 0);
        if (D() != null)
        {
            i1 = A.checkCallingOrSelfPermission("android.permission.READ_CALENDAR");
            int j1 = A.checkCallingOrSelfPermission("android.permission.WRITE_CALENDAR");
            ClassNotFoundException classnotfoundexception;
            if (i1 == 0 && j1 == 0)
            {
                g.b("Permission GRANTED for Calendar Read & Write Operations.");
                i1 = 1;
            } else
            if (i1 == -1 && j1 == -1)
            {
                g.b("Permission DENIED for Calendar Read & Write Operations.");
                i1 = ((flag1) ? 1 : 0);
            } else
            {
                if (i1 == -1)
                {
                    g.b("Permission DENIED for Calendar Read Operation.");
                }
                i1 = ((flag1) ? 1 : 0);
                if (j1 == -1)
                {
                    g.b("Permission DENIED for Calendar Write Operation.");
                    i1 = ((flag1) ? 1 : 0);
                }
            }
        }
        if (flag && i1 != 0)
        {
            f = true;
        }
        return;
        classnotfoundexception;
        flag = false;
_L2:
        g.b("External jars required for supporting 'Tap To Calendar' missing.");
          goto _L1
        ClassNotFoundException classnotfoundexception1;
        classnotfoundexception1;
        flag = true;
          goto _L2
    }

    static boolean A()
    {
        return i.c;
    }

    static int B()
    {
        if (D() != null)
        {
            return ((WindowManager)A.getSystemService("window")).getDefaultDisplay().getWidth();
        } else
        {
            return 0;
        }
    }

    static int C()
    {
        if (D() != null)
        {
            return ((WindowManager)A.getSystemService("window")).getDefaultDisplay().getHeight();
        } else
        {
            return 0;
        }
    }

    static Context D()
    {
        if (A != null) goto _L2; else goto _L1
_L1:
        if (n != null) goto _L4; else goto _L3
_L3:
        g.c("getApplicationContextFromApp(): sdkInterface is NULL.");
_L2:
        return A;
_L4:
        Context context = n.YuMeSDKPlayer_GetApplicationContext();
        A = context;
        if (context == null)
        {
            g.c("getApplicationContextFromApp(): Invalid Application Context received from App.");
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    static Context E()
    {
        if (B != null) goto _L2; else goto _L1
_L1:
        if (n != null) goto _L4; else goto _L3
_L3:
        g.c("getActivityContextFromSDK(): sdkInterface is NULL.");
_L2:
        return B;
_L4:
        Context context = n.YuMeSDKPlayer_GetActivityContext();
        B = context;
        if (context == null)
        {
            g.c("getActivityContextFromSDK(): Invalid Activity Context received from SDK.");
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    static void I()
    {
        try
        {
            n.YuMeSDKPlayer_TransitionEffectShown();
            return;
        }
        catch (YuMeException yumeexception)
        {
            yumeexception.printStackTrace();
        }
    }

    private void J()
    {
        P();
        try
        {
            n.YuMeSDKPlayer_PlaybackFinished(o, false);
        }
        catch (YuMeException yumeexception)
        {
            yumeexception.printStackTrace();
        }
        o = YuMePlaybackStatus.NONE;
    }

    private void K()
    {
        this;
        JVM INSTR monitorenter ;
        if (r == null)
        {
            r = new Timer();
            r.schedule(new M(this), 100L, 100L);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void L()
    {
        if (D() != null)
        {
            Display display = ((WindowManager)A.getSystemService("window")).getDefaultDisplay();
            v = display.getWidth();
            w = display.getHeight();
            int i1 = display.getRotation();
            if (i1 == 0 || i1 == 2)
            {
                u = "PORTRAIT";
            } else
            if (i1 == 1 || i1 == 3)
            {
                v = display.getHeight();
                w = display.getWidth();
                u = "LANDSCAPE";
                return;
            }
        }
    }

    private boolean M()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (a == N.c)
        {
            flag = flag1;
            if (y != null)
            {
                Q q1 = y;
                flag = flag1;
                if (q1.d != null)
                {
                    flag = flag1;
                    if (q1.d.b != null)
                    {
                        flag = flag1;
                        if (!q1.d.b.f)
                        {
                            flag = true;
                        }
                    }
                }
            }
        }
        return flag;
    }

    private static void N()
    {
        S s1 = d;
        s1.runOnUiThread(new X(s1));
        i.a();
    }

    private int O()
    {
        Q q1 = z();
        if (q1 != null)
        {
            return q1.n();
        } else
        {
            return 0;
        }
    }

    private void P()
    {
        if (p != null && p.canDetectOrientation())
        {
            p.disable();
            g.b("Orientation Listener Reset Successfully.");
            p = null;
        }
        m();
        N();
        B = null;
        m = -1;
        b = P.a;
    }

    static void a(int i1)
    {
        String s1;
        if (i1 / 10 <= 0)
        {
            s1 = ":0";
        } else
        {
            s1 = ":";
        }
        s1 = (new StringBuilder(String.valueOf(s1))).append(Integer.toString(i1)).toString();
        d.a(s1);
    }

    static void a(YuMePlaybackStatus yumeplaybackstatus)
    {
        o = yumeplaybackstatus;
    }

    static void a(String s1)
    {
        if (i.c)
        {
            return;
        } else
        {
            i.a(s1);
            return;
        }
    }

    static void a(boolean flag, boolean flag1, boolean flag2)
    {
        S s1 = d;
        s1.runOnUiThread(new Z(s1, flag, flag1, flag2));
    }

    static void b(int i1)
    {
        d.a(i1);
    }

    static void b(String s1)
    {
        if (s1 != null)
        {
            if (s1.equalsIgnoreCase("android.intent.action.MEDIA_REMOVED") || s1.equalsIgnoreCase("android.intent.action.MEDIA_UNMOUNTED") || s1.equalsIgnoreCase("android.intent.action.MEDIA_BAD_REMOVAL") || s1.equalsIgnoreCase("android.intent.action.MEDIA_EJECT") || s1.equalsIgnoreCase("android.intent.action.MEDIA_SHARED"))
            {
                g.b();
                g.a(false);
            } else
            if (s1.equalsIgnoreCase("android.intent.action.MEDIA_MOUNTED") && YuMePlayerInterfaceImpl.c.b)
            {
                g.a(true);
                g.a(D());
                return;
            }
        }
    }

    static void b(boolean flag)
    {
        S s1 = d;
        s1.runOnUiThread(new aa(s1, flag));
    }

    static void c(int i1)
    {
        S s1 = d;
        try
        {
            if (s1.c == null)
            {
                s1.c = new ArrayList();
            }
            s1.c.add(Integer.valueOf(i1));
            s1.runOnUiThread(new V(s1));
            return;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
    }

    public static int g()
    {
        boolean flag = false;
        if (m == -1 && E() != null)
        {
            Object obj = (Activity)B;
            if (D() != null)
            {
                Rect rect = new Rect();
                obj = ((Activity) (obj)).getWindow();
                ((Window) (obj)).getDecorView().getWindowVisibleDisplayFrame(rect);
                int i1 = rect.top;
                int k1 = ((Window) (obj)).findViewById(0x1020002).getTop();
                int j1;
                if (k1 > 0)
                {
                    j1 = k1 - i1;
                } else
                {
                    j1 = 0;
                }
                if (k1 == 0)
                {
                    i1 = 0;
                }
                obj = ((WindowManager)A.getSystemService("window")).getDefaultDisplay();
                if (rect.bottom < ((Display) (obj)).getHeight())
                {
                    i1 = ((Display) (obj)).getHeight() - rect.bottom;
                    m = j1;
                } else
                {
                    m = i1 + j1;
                }
                g.b((new StringBuilder("Status Bar Height: ")).append(i1).append(", Title Bar Height: ").append(j1).toString());
                g.b((new StringBuilder("Status Bar & Title Bar Height: ")).append(m).toString());
            }
        }
        i1 = ((flag) ? 1 : 0);
        if (m != -1)
        {
            i1 = m;
        }
        return i1;
    }

    final void F()
    {
        Q q1 = z();
        if (q1 != null)
        {
            if (q1.b != null)
            {
                q1.b.e();
            } else
            if (q1.c != null)
            {
                q1.c.a(true);
                return;
            }
        }
    }

    final void G()
    {
        Q q1 = z();
        if (q1 != null)
        {
            q1.q();
        }
    }

    final void H()
    {
        if (y != null)
        {
            Object obj = y;
            if (((Q) (obj)).b != null)
            {
                ((Q) (obj)).b.g();
                obj = d;
                ((S) (obj)).runOnUiThread(new Y(((S) (obj))));
            }
        }
    }

    public final String a(boolean flag)
    {
        if (x != null)
        {
            if (x.d() == null)
            {
                return "Image Ad Info not set.";
            }
        } else
        if (y != null && y.d() == null)
        {
            return "Video Ad Info not set.";
        }
        if (j == null)
        {
            return "Parent View not set.";
        }
        z = flag;
        if (x == null) goto _L2; else goto _L1
_L1:
        x.a = z;
_L4:
        (new Timer()).schedule(new K(), 50L);
        return "";
_L2:
        if (y != null)
        {
            y.a = z;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a()
    {
        if (c != null)
        {
            c.a();
        }
        if (i != null)
        {
            N();
            i.d();
        }
        if (x != null)
        {
            x.b();
            x = null;
        }
        if (y != null)
        {
            y.b();
            y = null;
        }
        i = null;
        c = null;
        d = null;
        e = null;
        o = YuMePlaybackStatus.NONE;
        a = N.a;
        j = null;
        m();
    }

    public final void a(FrameLayout framelayout)
        throws YuMePlayerException
    {
        j = framelayout;
        k = j.getLayoutParams().width;
        l = j.getLayoutParams().height;
        g.b((new StringBuilder("Parent View: Width: ")).append(k).append(", Height: ").append(l).toString());
        i.a(j);
    }

    public final void a(YuMeAdInfo yumeadinfo, boolean flag)
    {
        if (x != null)
        {
            x = null;
        }
        if (y != null)
        {
            y = null;
        }
        a = N.a;
        z = flag;
        if (yumeadinfo.eBaseAssetType == YuMeAssetType.IMAGE)
        {
            x = new Q(this, j, yumeadinfo);
            a = N.b;
        } else
        if (yumeadinfo.eBaseAssetType == YuMeAssetType.VIDEO)
        {
            y = new Q(this, j, yumeadinfo);
            a = N.c;
            return;
        }
    }

    final void a(YuMeTransitionEffect yumetransitioneffect)
    {
        Object obj;
        obj = null;
        if (yumetransitioneffect != YuMeTransitionEffect.FLIP)
        {
            break MISSING_BLOCK_LABEL_376;
        }
        if (a != N.c) goto _L2; else goto _L1
_L1:
        ar ar1 = y.b.c;
        if (ar1 != null)
        {
            float f1 = (float)ar1.getWidth() / 2.0F;
            float f2 = (float)ar1.getHeight() / 2.0F;
            yumetransitioneffect = ((YuMeTransitionEffect) (obj));
            if (x != null)
            {
                yumetransitioneffect = ((YuMeTransitionEffect) (obj));
                if (x.c != null)
                {
                    yumetransitioneffect = x.c.f;
                }
            }
            if (yumetransitioneffect == null)
            {
                if (D == null)
                {
                    D = new ImageView(D());
                } else
                {
                    j.removeView(D);
                }
                yumetransitioneffect = D.getParent();
                if (yumetransitioneffect != null)
                {
                    ((ViewGroup)yumetransitioneffect).removeView(D);
                }
                j.addView(D);
                yumetransitioneffect = D;
            }
            obj = new a(0.0F, 90F, f1, f2, true);
            ((a) (obj)).setDuration(500L);
            ((a) (obj)).setFillAfter(true);
            ((a) (obj)).setInterpolator(new AccelerateInterpolator());
            ((a) (obj)).setAnimationListener(new b(a, ar1, yumetransitioneffect));
            ar1.requestFocus();
            ar1.startAnimation(((android.view.animation.Animation) (obj)));
        }
_L4:
        return;
_L2:
        if (a != N.b) goto _L4; else goto _L3
_L3:
        obj = x.c.f;
        if (obj == null) goto _L4; else goto _L5
_L5:
        a a1;
        if (y != null)
        {
            yumetransitioneffect = y.b.c;
        } else
        {
            yumetransitioneffect = null;
        }
        a1 = new a(0.0F, 90F, (float)((ImageView) (obj)).getWidth() / 2.0F, (float)((ImageView) (obj)).getHeight() / 2.0F, true);
        a1.setDuration(500L);
        a1.setFillAfter(true);
        a1.setInterpolator(new AccelerateInterpolator());
        a1.setAnimationListener(new b(a, yumetransitioneffect, ((ImageView) (obj))));
        ((ImageView) (obj)).requestFocus();
        ((ImageView) (obj)).startAnimation(a1);
        return;
        g.c("Unsupported Transition Effect.");
        return;
    }

    public final boolean a(float f1)
    {
        if (!M())
        {
            float f2 = O();
            float f3 = w - O();
            float f4 = w;
            if (f1 >= 0.0F && f1 <= f2 || f1 >= f3 && f1 <= f4)
            {
                return true;
            }
        }
        return false;
    }

    final boolean a(float f1, float f2)
    {
        if (!M())
        {
            float f3 = O();
            float f4 = w - O();
            float f5 = w;
            if (f1 < f2 && f1 >= 0.0F && f2 <= f3 || f1 > f2 && f1 <= f3 && f2 >= 0.0F || f1 < f2 && f1 >= f4 && f2 <= f5 || f1 > f2 && f1 <= f5 && f2 >= f4)
            {
                return true;
            }
        }
        return false;
    }

    final List b()
    {
        if (E == null)
        {
            E = new ArrayList();
            E.add(YuMeFileFormat.IMAGE_BMP);
            E.add(YuMeFileFormat.IMAGE_GIF);
            E.add(YuMeFileFormat.IMAGE_JPEG);
            E.add(YuMeFileFormat.IMAGE_PNG);
            E.add(YuMeFileFormat.VIDEO_3GPP_H263_AMR);
            E.add(YuMeFileFormat.VIDEO_MP4_H264AVC_AAC);
        }
        return E;
    }

    final void b(YuMeAdInfo yumeadinfo, boolean flag)
    {
        if (yumeadinfo == null) goto _L2; else goto _L1
_L1:
        z = flag;
        if (yumeadinfo.eBaseAssetType != YuMeAssetType.IMAGE) goto _L4; else goto _L3
_L3:
        x = new Q(this, j, yumeadinfo);
_L2:
        if (a != N.c) goto _L6; else goto _L5
_L5:
        a = N.b;
        ai.f = false;
        x.q();
_L8:
        return;
_L4:
        if (yumeadinfo.eBaseAssetType == YuMeAssetType.VIDEO)
        {
            y = new Q(this, j, yumeadinfo);
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (a != N.b) goto _L8; else goto _L7
_L7:
        a = N.c;
        x.g = false;
        y.q();
        return;
        if (true) goto _L2; else goto _L9
_L9:
    }

    final List c()
    {
        if (F == null)
        {
            F = new ArrayList();
            F.add("image/bmp");
            F.add("image/gif");
            F.add("image/jpg");
            F.add("image/jpeg");
            F.add("image/png");
            F.add("video/3gpp");
            F.add("video/mp4");
        }
        return F;
    }

    final void c(String s1)
    {
        if (f)
        {
            Q q1 = z();
            if (q1 != null && q1.d != null)
            {
                q1.d.b(s1);
            }
            return;
        } else
        {
            g.a("No support for adding Calendar Event.");
            return;
        }
    }

    final void d()
    {
        boolean flag = false;
        if (x != null)
        {
            flag = x.a();
        } else
        if (y != null)
        {
            flag = y.a();
        }
        if (!flag)
        {
            a = N.a;
            try
            {
                n.YuMeSDKPlayer_PlaybackFinished(YuMePlaybackStatus.FAILED, false);
                return;
            }
            catch (YuMeException yumeexception)
            {
                yumeexception.printStackTrace();
            }
            return;
        }
        if (D() != null) goto _L2; else goto _L1
_L1:
        g.c("Error Setting Orientation Listener.");
_L4:
        b = P.b;
        return;
_L2:
        p = new L(this, A);
        if (p.canDetectOrientation())
        {
            p.enable();
            g.b("Orientation Listener Set Successfully.");
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    final void e()
    {
        if (x != null)
        {
            x.b();
        }
        if (y != null)
        {
            y.b();
        }
        P();
        o = YuMePlaybackStatus.NONE;
    }

    public final YuMePlayerInfo f()
    {
        YuMePlayerInfo yumeplayerinfo = new YuMePlayerInfo();
        if (j != null)
        {
            yumeplayerinfo.width = k;
            yumeplayerinfo.height = l;
        }
        yumeplayerinfo.version = ah.a();
        return yumeplayerinfo;
    }

    final void h()
    {
        if (a == N.c)
        {
            ai.f = false;
        } else
        if (a == N.b)
        {
            x.g = false;
        }
        if (b == P.b)
        {
            try
            {
                n.YuMeSDKPlayer_UserActionViewClosed();
                return;
            }
            catch (YuMeException yumeexception)
            {
                yumeexception.printStackTrace();
            }
            return;
        } else
        {
            J();
            return;
        }
    }

    final N i()
    {
        return a;
    }

    final void j()
    {
        if (YuMePlayerInterfaceImpl.b)
        {
            b = P.a;
            if (x != null)
            {
                x.p();
            }
            if (y != null)
            {
                y.p();
            }
            if (!i.c)
            {
                J();
                return;
            }
        }
    }

    final void k()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = D();
        if (obj != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        int i1 = ((WindowManager)A.getSystemService("window")).getDefaultDisplay().getRotation();
        if (q == i1) goto _L1; else goto _L3
_L3:
        q = i1;
        if (i1 != 0 && i1 != 2) goto _L5; else goto _L4
_L4:
        g.b("ORIENTATION Changed to PORTRAIT.");
        u = "PORTRAIT";
_L7:
        if (b != P.a || i.c)
        {
            break MISSING_BLOCK_LABEL_143;
        }
        g.a("Player Operation not in progress - Ignoring Orientation Change.");
          goto _L1
        Object obj1;
        obj1;
        ((Exception) (obj1)).printStackTrace();
          goto _L1
        obj1;
        throw obj1;
_L5:
        if (i1 != 1 && i1 != 3) goto _L7; else goto _L6
_L6:
        g.b("ORIENTATION Changed to LANDSCAPE.");
        u = "LANDSCAPE";
          goto _L7
        obj1 = z();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_166;
        }
        if (((Q) (obj1)).d != null)
        {
            ((Q) (obj1)).d.b();
        }
        if (!l())
        {
            break MISSING_BLOCK_LABEL_180;
        }
        n();
          goto _L1
        K();
          goto _L1
    }

    final boolean l()
    {
        if (j != null && j.getLayoutParams() != null)
        {
            int i1 = j.getLayoutParams().width;
            int j1 = j.getLayoutParams().height;
            if (i1 != s && j1 != t)
            {
                s = i1;
                t = j1;
                return true;
            }
        }
        return false;
    }

    final void m()
    {
        this;
        JVM INSTR monitorenter ;
        if (r != null)
        {
            r.cancel();
            r = null;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    final void n()
    {
        g.b((new StringBuilder("Handling Orientation Change to ")).append(u).toString());
        S s1 = d;
        s1.runOnUiThread(new ab(s1));
    }

    final void o()
    {
        k = j.getLayoutParams().width;
        l = j.getLayoutParams().height;
        if (x != null)
        {
            x.c();
        }
        if (y != null)
        {
            y.c();
        }
        i.b();
    }

    public final int p()
    {
        return k;
    }

    public final int q()
    {
        return l;
    }

    final int r()
    {
        L();
        return v;
    }

    final int s()
    {
        L();
        return w;
    }

    final String t()
    {
        return u;
    }

    final O u()
    {
        if (h != O.a)
        {
            return h;
        }
        if (D() != null)
        {
            if (A.getPackageManager().hasSystemFeature("com.google.android.tv"))
            {
                h = O.d;
            } else
            {
                C = A.getResources().getConfiguration().screenLayout & 0xf;
                if (C >= 3)
                {
                    h = O.c;
                } else
                {
                    h = O.b;
                }
            }
        }
        return h;
    }

    final boolean v()
    {
        Q q1 = z();
        if (q1 != null)
        {
            return q1.j();
        } else
        {
            return false;
        }
    }

    final boolean w()
    {
        Q q1 = z();
        if (q1 != null)
        {
            return q1.f();
        } else
        {
            return false;
        }
    }

    final void x()
    {
        Q q1;
        if (!i.c)
        {
            if ((q1 = z()) != null)
            {
                try
                {
                    n.YuMeSDKPlayer_ClickEventOccured(q1.h());
                    return;
                }
                catch (YuMeException yumeexception)
                {
                    yumeexception.printStackTrace();
                }
                return;
            }
        }
    }

    final void y()
    {
        Q q1;
        if (!i.c)
        {
            if ((q1 = z()) != null)
            {
                try
                {
                    n.YuMeSDKPlayer_SwipeEventOccured(q1.h());
                    return;
                }
                catch (YuMeException yumeexception)
                {
                    yumeexception.printStackTrace();
                }
                return;
            }
        }
    }

    final Q z()
    {
        if (a == N.b)
        {
            return x;
        }
        if (a == N.c)
        {
            return y;
        } else
        {
            return null;
        }
    }

    static 
    {
        b = P.a;
    }
}

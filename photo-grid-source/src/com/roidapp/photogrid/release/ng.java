// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.PathShape;
import android.media.MediaPlayer;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.preference.PreferenceManager;
import android.support.v4.app.FragmentManager;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.roidapp.imagelib.ImageLibrary;
import com.roidapp.imagelib.b.c;
import com.roidapp.imagelib.filter.filterinfo.IFilterInfo;
import com.roidapp.imagelib.filter.groupinfo.IGroupInfo;
import com.roidapp.photogrid.a.m;
import com.roidapp.photogrid.common.aj;
import com.roidapp.photogrid.common.az;
import com.roidapp.photogrid.common.y;
import com.roidapp.videolib.b.u;
import com.roidapp.videolib.core.e;
import com.roidapp.videolib.core.g;
import com.roidapp.videolib.core.h;
import com.roidapp.videolib.core.i;
import com.roidapp.videolib.core.l;
import com.roidapp.videolib.gl.GPUVideoView;
import com.roidapp.videolib.gl.a;
import com.roidapp.videolib.gl.f;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package com.roidapp.photogrid.release:
//            mm, ih, nh, rf, 
//            ig, ml, ProgressView, nk, 
//            PhotoGridActivity, ni, nj, an, 
//            dk, el

public final class ng extends mm
    implements android.media.MediaPlayer.OnCompletionListener, android.media.MediaPlayer.OnInfoListener, android.media.MediaPlayer.OnPreparedListener, h
{

    protected String L[];
    protected boolean M[];
    protected String N;
    protected String O;
    protected String P;
    protected String Q;
    protected int R;
    protected int S;
    protected int T;
    protected boolean U;
    protected boolean V;
    protected int W[];
    public String X;
    u Y[];
    u Z;
    private boolean aA;
    private boolean aB;
    private float aC;
    private float aD;
    private Bitmap aE;
    private Bitmap aF;
    private boolean aG;
    private final float aH;
    private com.roidapp.photogrid.video.e aI;
    private i aJ;
    private Object aK;
    private boolean aL;
    private boolean aM;
    private boolean aN;
    private float aO;
    private float aP;
    private e aQ;
    private Object aR;
    private boolean aS;
    IFilterInfo aa;
    int ab;
    boolean ac;
    private RelativeLayout ad;
    private RelativeLayout ae;
    private LinearLayout af;
    private LinearLayout ag;
    private GPUVideoView ah;
    private TextView ai;
    private float aj;
    private MediaPlayer ak;
    private int al;
    private String am;
    private int an;
    private int ao;
    private boolean ap;
    private int aq;
    private int ar;
    private boolean as;
    private int at;
    private int au;
    private int av;
    private int aw;
    private ProgressView ax;
    private int ay;
    private f az;

    public ng(boolean flag, Activity activity, ig aig[], ml ml1)
    {
        aj = 1.0F;
        al = 0;
        O = "";
        Q = "";
        R = 0;
        an = 0;
        T = 5000;
        V = false;
        ap = false;
        aq = 15000;
        ar = 0;
        as = false;
        at = 100;
        au = 100;
        ay = 640;
        aC = 0.0F;
        aD = 0.0F;
        aE = null;
        Y = null;
        Z = u.a;
        aa = null;
        ab = 100;
        aI = null;
        aJ = null;
        aK = new Object();
        aL = false;
        aM = false;
        aN = false;
        aO = 1.0F;
        aP = 0.0F;
        aQ = null;
        aR = new Object();
        aS = false;
        ac = true;
        F = flag;
        h = activity;
        i = aig;
        l = ml1;
        h.getWindow().setFormat(1);
        activity = ih.C();
        if (flag)
        {
            activity.d(-20);
            activity.g(0);
            activity.e(4);
            activity.f(4);
            activity.g(false);
            activity.d(0.0F);
            activity.e(0.0F);
            activity.f(0.0F);
            activity.d(false);
            activity.c(0);
            activity.b(1.0F);
            activity.e(false);
            activity.f(false);
            activity.a(u.a);
            activity.a(null);
            activity.j(null);
            activity.a(0.0F);
            activity.l(100);
            activity.a(null);
            activity.a(null);
        }
        s = activity.x();
        r = activity.A();
        t = activity.y();
        u = activity.z();
        aD = activity.S();
        aC = activity.V();
        aP = activity.c();
        m = 0;
        W = com.roidapp.photogrid.common.aj.a().b;
        aH = h.getResources().getDisplayMetrics().scaledDensity;
        aa = activity.ac();
        ab = activity.ae();
        activity = PreferenceManager.getDefaultSharedPreferences(h);
        if (activity.getBoolean("show_sign", false))
        {
            X = activity.getString("sign_text", "");
            ar = 1000;
        }
        b(h);
        az = new nh(this);
    }

    private void A()
    {
        synchronized (aK)
        {
            if (aJ != null)
            {
                aJ.b();
                aJ = null;
            }
        }
        synchronized (aR)
        {
            if (aQ != null)
            {
                aQ.e();
                aQ = null;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
    }

    private void B()
    {
        if (!com.roidapp.videolib.core.e.a(Z))
        {
            return;
        }
        Object obj = aR;
        obj;
        JVM INSTR monitorenter ;
        String as1[];
        if (aQ != null)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        aQ = new e();
        as1 = com.roidapp.videolib.core.e.b(Z);
        int i1 = 0;
_L2:
        if (i1 >= as1.length)
        {
            break; /* Loop/switch isn't completed */
        }
        as1[i1] = (new StringBuilder()).append(com.roidapp.imagelib.b.c.a()).append("/.video/").append(as1[i1]).toString();
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        aQ.a(as1);
        aQ.b();
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static float a(TextPaint textpaint, String s1)
    {
        s1 = s1.split(System.getProperty("line.separator", "\n"));
        float f1 = 0.0F;
        for (int i1 = 0; i1 < s1.length;)
        {
            String s2 = s1[i1];
            float f2 = f1;
            if (s2 != null)
            {
                Rect rect = new Rect();
                textpaint.getTextBounds(s2, 0, s2.length(), rect);
                float f3 = rect.width();
                f2 = f1;
                if (f3 > f1)
                {
                    f2 = f3;
                }
            }
            i1++;
            f1 = f2;
        }

        return f1;
    }

    static float a(ng ng1, float f1)
    {
        ng1.aC = f1;
        return f1;
    }

    static int a(float f1, float f2)
    {
        return (int)(f1 * f2 + 0.5F);
    }

    static int a(ng ng1, int i1)
    {
        ng1.av = i1;
        return i1;
    }

    static Bitmap a(ng ng1, Bitmap bitmap)
    {
        ng1.aF = bitmap;
        return bitmap;
    }

    static i a(ng ng1, i i1)
    {
        ng1.aJ = i1;
        return i1;
    }

    static Object a(ng ng1)
    {
        return ng1.aR;
    }

    private void a(RelativeLayout relativelayout)
    {
        com.roidapp.photogrid.release.rf.a();
        com.roidapp.photogrid.release.rf.a(j, relativelayout, h);
    }

    private void a(a a1, Bitmap bitmap, float f1)
    {
        int i1 = bitmap.getWidth();
        int j1 = bitmap.getHeight();
        float f2;
        float f3;
        float f4;
        float f5;
        boolean flag;
        if (i1 > j1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            f2 = (float)i1 / (float)ay;
        } else
        {
            f2 = (float)j1 / (float)ay;
        }
        f3 = (float)j1 / f2;
        f2 = (float)i1 / f2 / (float)ay;
        f3 /= ay;
        if (f2 > f3)
        {
            f2 = f3;
        }
        f3 = 0.5F - f2 / 2.0F;
        f4 = f3 + f2;
        f5 = 0.5F - f2 / 2.0F;
        f2 += f5;
        if (f1 > 0.0F)
        {
            float f6 = Math.min(i1, j1);
            f1 = ((f1 / 100F) * ((0.96F * f6) / 2.0F) * 0.414F) / (f6 * 1.414F);
            a1.c = (new float[] {
                f3 + f1 + 0.01F, f2 - f1 - 0.01F, f4 - f1 - 0.01F, f2 - f1 - 0.01F, f3 + f1 + 0.01F, f5 + f1 + 0.01F, f4 - f1 - 0.01F, f5 + f1 + 0.01F
            });
            return;
        } else
        {
            a1.c = (new float[] {
                f3 + 0.01F, f2 - 0.01F, f4 - 0.01F, f2 - 0.01F, f3 + 0.01F, f5 + 0.01F, f4 - 0.01F, f5 + 0.01F
            });
            return;
        }
    }

    public static boolean a(Context context)
    {
        boolean flag = true;
        if (android.os.Build.VERSION.SDK_INT < 14)
        {
            flag = false;
        }
        if (c(context) > 25)
        {
            return false;
        } else
        {
            return flag;
        }
    }

    static int b(ng ng1, int i1)
    {
        ng1.aw = i1;
        return i1;
    }

    static Bitmap b(ng ng1, Bitmap bitmap)
    {
        ng1.aE = bitmap;
        return bitmap;
    }

    static e b(ng ng1)
    {
        return ng1.aQ;
    }

    private static void b(Context context)
    {
        String s2;
        File file1;
        String s1 = (new StringBuilder()).append(com.roidapp.imagelib.b.c.a()).append("/.video/").toString();
        File file = new File(s1);
        if (!file.exists())
        {
            file.mkdirs();
        }
        c((new StringBuilder()).append(com.roidapp.imagelib.b.c.a()).append(File.separator).append("effect.mp4").toString());
        c((new StringBuilder()).append(com.roidapp.imagelib.b.c.a()).append(File.separator).append("mask.mp4").toString());
        s2 = (new StringBuilder()).append(s1).append(File.separator).append("test.mp4").toString();
        file1 = new File(s2);
        if (file1.exists()) goto _L2; else goto _L1
_L1:
        com.roidapp.baselib.d.a.a(context.getAssets(), file1, "test.mp4");
        PreferenceManager.getDefaultSharedPreferences(context).edit().putString((new StringBuilder("video")).append(s2).toString(), com.roidapp.videolib.core.l.a(s2)).commit();
_L4:
        return;
_L2:
        InputStream inputstream1 = null;
        InputStream inputstream = context.getAssets().open("test.mp4");
        inputstream1 = inputstream;
        String s3 = com.roidapp.videolib.core.l.a(inputstream);
        if (s3 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        inputstream1 = inputstream;
        if (s3.equalsIgnoreCase(PreferenceManager.getDefaultSharedPreferences(context).getString((new StringBuilder("video")).append(s2).toString(), "")))
        {
            continue; /* Loop/switch isn't completed */
        }
        inputstream1 = inputstream;
        com.roidapp.baselib.d.a.a(context.getAssets(), file1, "test.mp4");
        inputstream1 = inputstream;
        PreferenceManager.getDefaultSharedPreferences(context).edit().putString((new StringBuilder("video")).append(s2).toString(), s3).commit();
        if (inputstream == null) goto _L4; else goto _L3
_L3:
        try
        {
            inputstream.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
        context;
        if (inputstream1 == null) goto _L4; else goto _L5
_L5:
        try
        {
            inputstream1.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
        context;
        inputstream = null;
_L7:
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            catch (Exception exception) { }
        }
        throw context;
        context;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private void b(u u1)
    {
        Z = u1;
        ih.C().a(u1);
    }

    private void b(String s1)
    {
        if (ak != null)
        {
            ak.stop();
            ak.release();
            ak = null;
        }
        ak = new MediaPlayer();
        ak.setOnPreparedListener(this);
        ak.setOnCompletionListener(this);
        am = s1;
        if (aP != 0.0F || R != 0)
        {
            aM = true;
        }
        ak.setOnInfoListener(this);
        ak.setDataSource(s1);
        ac = true;
        ak.prepare();
_L1:
        return;
        Exception exception;
        exception;
        exception.printStackTrace();
        a(60936, s1);
        if (N != null)
        {
            try
            {
                ak.setDataSource(N);
                ak.prepare();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                s1.printStackTrace();
            }
            N = null;
            y();
            return;
        }
          goto _L1
    }

    private static boolean b(float f1, float f2)
    {
        return f1 < f2 + 1E-06F && f1 > f2 - 1E-06F;
    }

    private static int c(Context context)
    {
        int i1;
        int j1;
        long l1;
        i1 = PreferenceManager.getDefaultSharedPreferences(context).getInt("videoDecodeSpeed", 0);
        if (i1 != 0)
        {
            return i1;
        }
        g g1;
        byte abyte0[];
        try
        {
            b(context);
            g1 = new g((new StringBuilder()).append(com.roidapp.imagelib.b.c.a()).append("/.video/test.mp4").toString());
            g1.a();
            abyte0 = new byte[0x190000];
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return 100;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return 100;
        }
        j1 = 50;
        i1 = 0;
_L2:
        if (i1 >= 5)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        l1 = System.currentTimeMillis();
        g1.a(abyte0);
        l1 = System.currentTimeMillis() - l1;
        if (l1 >= (long)j1)
        {
            l1 = j1;
        }
        break MISSING_BLOCK_LABEL_147;
        g1.c();
        PreferenceManager.getDefaultSharedPreferences(context).edit().putInt("videoDecodeSpeed", j1).commit();
        return j1;
        j1 = (int)l1;
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static void c(String s1)
    {
        try
        {
            s1 = new File(s1);
            if (s1.exists())
            {
                s1.delete();
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return;
        }
    }

    private void c(boolean flag)
    {
        if (V)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        if (flag)
        {
            try
            {
                if (ak != null)
                {
                    ak.stop();
                    ak.release();
                    ak = null;
                    return;
                }
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
            }
            break MISSING_BLOCK_LABEL_68;
        }
        if (ak != null && ak.isPlaying())
        {
            ak.pause();
            return;
        }
    }

    static boolean c(ng ng1)
    {
        return com.roidapp.videolib.core.e.a(ng1.Z);
    }

    static int d(ng ng1)
    {
        return ng1.aq;
    }

    static int e(ng ng1)
    {
        return ng1.ao;
    }

    static Object f(ng ng1)
    {
        return ng1.aK;
    }

    static i g(ng ng1)
    {
        return ng1.aJ;
    }

    static boolean h(ng ng1)
    {
        return ng1.aG;
    }

    static Bitmap i(ng ng1)
    {
        return ng1.aF;
    }

    static boolean j(ng ng1)
    {
        ng1.aG = false;
        return false;
    }

    static int k(ng ng1)
    {
        return ng1.ay;
    }

    static float l(ng ng1)
    {
        return ng1.aH;
    }

    private Bitmap m(int i1)
    {
        if (i[i1].f != null && !(new File(i[i1].f)).exists())
        {
            Message message = Message.obtain();
            message.what = 21;
            message.arg1 = 60938;
            message.obj = i[i1].f;
            l.sendMessage(message);
            i[i1].f = null;
            ih.C().a(null);
        } else
        if (i[i1].f != null)
        {
            return com.roidapp.baselib.a.a.a(i[i1].f, ay, ay, false, ih.C().ax());
        }
        return null;
    }

    static boolean m(ng ng1)
    {
        return ng1.aB;
    }

    static Bitmap n(ng ng1)
    {
        return ng1.aE;
    }

    private void n(int i1)
    {
        an = i1;
        if (V || N == null)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        if (ak == null)
        {
            b(N);
        }
        if (!ac)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        int j1;
        if (com.roidapp.videolib.core.e.a(Z))
        {
            j1 = 15000;
        } else
        {
            j1 = aq - ar;
        }
        p(i1 / j1);
        ak.seekTo(Math.min(R + an, ak.getDuration()));
        return;
        Throwable throwable;
        throwable;
    }

    private void o(int i1)
    {
        B();
        U = true;
        af.setVisibility(8);
        ai.setVisibility(8);
        if (com.roidapp.videolib.core.e.a(Z))
        {
            ax.a(false);
            ax.setVisibility(0);
        } else
        {
            ax.a(true);
            ax.setVisibility(8);
        }
        K.removeMessages(6);
        K.removeMessages(7);
        K.removeMessages(8214);
        if (aI != null)
        {
            com.roidapp.photogrid.video.e e1 = aI;
            boolean flag;
            if (!com.roidapp.videolib.core.e.a(Z))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            e1.a(flag, false);
        }
        if (com.roidapp.videolib.core.e.a(Z))
        {
            aP = 0.0F;
            ah.a(0L);
            n(0);
        } else
        {
            aP = (float)i1 / (float)aq;
            ah.a(i1);
            n(i1);
        }
        u();
        aN = true;
        aS = false;
    }

    static boolean o(ng ng1)
    {
        ng1.aB = false;
        return false;
    }

    static int p(ng ng1)
    {
        return ng1.av;
    }

    private void p(int i1)
    {
        float f2 = 0.0F;
        float f1 = 1.0F;
        if (as)
        {
            i1 = Math.max(0, at - i1);
            if (i1 < 30)
            {
                f1 = (float)i1 / 30F;
            }
            if (f1 < 0.0F)
            {
                f1 = f2;
            }
        } else
        {
            f1 = 1.0F;
        }
        if (f1 != aO)
        {
            if (ak != null)
            {
                ak.setVolume(f1, f1);
            }
            aO = f1;
        }
    }

    static int q(ng ng1)
    {
        return ng1.aw;
    }

    private a q(int i1)
    {
        a a1;
        Object obj;
        Bitmap bitmap;
        BitmapShader bitmapshader;
        a1 = new a();
        if (com.roidapp.videolib.core.e.a(Z) || aC <= 0.0F)
        {
            break MISSING_BLOCK_LABEL_584;
        }
        bitmap = m(i1);
        if (bitmap == null)
        {
            a1.b = null;
            return a1;
        }
        a(a1, bitmap, aC);
        bitmapshader = new BitmapShader(bitmap, android.graphics.Shader.TileMode.CLAMP, android.graphics.Shader.TileMode.CLAMP);
        try
        {
            com.roidapp.photogrid.release.rf.a();
            obj = com.roidapp.photogrid.release.rf.a(bitmap.getWidth(), bitmap.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            a1.b = null;
            return a1;
        }
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        a1.b = null;
        return a1;
        float f1 = aC / 100F;
        float f4 = (0.96F * (float)Math.min(bitmap.getWidth(), bitmap.getHeight())) / 2.0F;
        Canvas canvas2 = new Canvas(((Bitmap) (obj)));
        canvas2.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        Object obj1 = new Path();
        ((Path) (obj1)).moveTo(0.0F, 0.0F);
        ((Path) (obj1)).lineTo(bitmap.getWidth(), 0.0F);
        ((Path) (obj1)).lineTo(bitmap.getWidth(), bitmap.getHeight());
        ((Path) (obj1)).lineTo(0.0F, bitmap.getHeight());
        ((Path) (obj1)).close();
        obj1 = new ShapeDrawable(new PathShape(((Path) (obj1)), bitmap.getWidth(), bitmap.getHeight()));
        ((ShapeDrawable) (obj1)).getPaint().setPathEffect(new CornerPathEffect(f1 * f4));
        ((ShapeDrawable) (obj1)).getPaint().setShader(bitmapshader);
        ((ShapeDrawable) (obj1)).setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
        ((ShapeDrawable) (obj1)).draw(canvas2);
        bitmap.recycle();
        if (ih.C().ax())
        {
            break MISSING_BLOCK_LABEL_568;
        }
        try
        {
            com.roidapp.photogrid.release.rf.a();
            bitmap = com.roidapp.photogrid.release.rf.a(ay, ay, android.graphics.Bitmap.Config.ARGB_8888);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            a1.b = null;
            return a1;
        }
        if (bitmap != null)
        {
            break MISSING_BLOCK_LABEL_385;
        }
        a1.b = null;
        return a1;
        Canvas canvas1 = new Canvas(bitmap);
        canvas1.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        float f2;
        Matrix matrix;
        if (((Bitmap) (obj)).getWidth() > ((Bitmap) (obj)).getHeight())
        {
            i1 = ((Bitmap) (obj)).getWidth();
        } else
        {
            i1 = ((Bitmap) (obj)).getHeight();
        }
        f2 = (float)ay / (float)i1;
        matrix = new Matrix();
        matrix.postTranslate((float)ay / 2.0F - (float)((Bitmap) (obj)).getWidth() / 2.0F, (float)ay / 2.0F - (float)((Bitmap) (obj)).getHeight() / 2.0F);
        matrix.postScale(f2, f2, (float)ay / 2.0F, (float)ay / 2.0F);
        canvas1.drawARGB(0, 255, 255, 255);
        canvas1.drawBitmap(((Bitmap) (obj)), matrix, new Paint());
        ((Bitmap) (obj)).recycle();
        a1.b = bitmap;
        a1.d = false;
        return a1;
        a1.b = ((Bitmap) (obj));
        a1.d = false;
        return a1;
        if (ih.C().ax())
        {
            break MISSING_BLOCK_LABEL_853;
        }
        try
        {
            com.roidapp.photogrid.release.rf.a();
            obj = com.roidapp.photogrid.release.rf.a(ay, ay, android.graphics.Bitmap.Config.ARGB_8888);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            a1.b = null;
            return a1;
        }
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_638;
        }
        a1.b = null;
        return a1;
        Canvas canvas = new Canvas(((Bitmap) (obj)));
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        Bitmap bitmap1 = m(i1);
        if (bitmap1 == null)
        {
            a1.b = null;
            return a1;
        }
        a(a1, bitmap1, -1F);
        float f3;
        Matrix matrix1;
        if (bitmap1.getWidth() > bitmap1.getHeight())
        {
            i1 = bitmap1.getWidth();
        } else
        {
            i1 = bitmap1.getHeight();
        }
        f3 = (float)ay / (float)i1;
        matrix1 = new Matrix();
        matrix1.postTranslate((float)ay / 2.0F - (float)bitmap1.getWidth() / 2.0F, (float)ay / 2.0F - (float)bitmap1.getHeight() / 2.0F);
        matrix1.postScale(f3, f3, (float)ay / 2.0F, (float)ay / 2.0F);
        canvas.drawARGB(0, 255, 255, 255);
        canvas.drawBitmap(bitmap1, matrix1, new Paint());
        bitmap1.recycle();
        a1.b = ((Bitmap) (obj));
        a1.d = false;
        return a1;
        a1.b = m(i1);
        a1.d = false;
        a(a1, a1.b, -1F);
        return a1;
    }

    static void r(ng ng1)
    {
        float f1;
        float f3;
        Object obj;
        int i1;
        int j1;
label0:
        {
            if (ng1.L != null)
            {
                obj = (new StringBuilder()).append(ImageLibrary.a().b(ng1.h));
                ImageLibrary.a();
                obj = ((StringBuilder) (obj)).append(ImageLibrary.f()).toString();
                if (com.roidapp.photogrid.release.rf.a(ng1.h, 15))
                {
                    break label0;
                }
                obj = Message.obtain();
                obj.what = 702;
                ng1.K.sendMessage(((Message) (obj)));
            }
            return;
        }
        ng1.l.a(20, 0);
        j1 = ng1.L.length;
        f3 = 80F / (float)ng1.al;
        f1 = 20F;
        i1 = 0;
_L9:
        if (i1 >= j1) goto _L2; else goto _L1
_L1:
        float f2 = f1;
        if (!ng1.M[i1]) goto _L4; else goto _L3
_L3:
        if ((new File(ng1.L[i1])).exists()) goto _L6; else goto _L5
_L5:
        ih.C().a(null);
        ng1.a(60938, ng1.L[i1]);
_L2:
        ng1.U = false;
        ng1.l.sendEmptyMessage(3);
        return;
_L6:
        Bitmap bitmap;
        String s1;
        bitmap = com.roidapp.baselib.a.a.a(ng1.L[i1], ng1.ay, ng1.ay, false, ih.C().ax());
        s1 = ng1.L[i1].substring(ng1.L[i1].lastIndexOf("/") + 1);
        if (bitmap != null && ng1.i != null) goto _L8; else goto _L7
_L7:
        f2 = f1 + f3;
        if (bitmap != null)
        {
            bitmap.recycle();
        }
        ng1.l.a((int)f2, 0);
_L4:
        i1++;
        f1 = f2;
          goto _L9
_L8:
        Object obj1;
        s1 = (new StringBuilder()).append(((String) (obj))).append("/").append(s1).toString();
        obj1 = new File(((String) (obj)));
        if (!((File) (obj1)).exists() && !((File) (obj1)).mkdirs()) goto _L7; else goto _L10
_L10:
        obj1 = new File(s1);
        if (((File) (obj1)).exists())
        {
            ((File) (obj1)).delete();
        }
        ((File) (obj1)).createNewFile();
        IOException ioexception;
        try
        {
            obj1 = new FileOutputStream(((File) (obj1)));
            bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, ((OutputStream) (obj1)));
            ((OutputStream) (obj1)).flush();
            ((OutputStream) (obj1)).close();
        }
        catch (IOException ioexception1)
        {
            ioexception1.printStackTrace();
        }
        ng1.i[i1].f = s1;
        ng1.M[i1] = false;
          goto _L7
        ioexception;
        ioexception.printStackTrace();
          goto _L7
    }

    private void u()
    {
        char c1 = '\u3A98';
        int j1 = 150;
        if (android.os.Build.VERSION.SDK_INT == 14)
        {
            j1 = 200;
        }
        float f1;
        ProgressView progressview;
        int i1;
        int k1;
        if (com.roidapp.videolib.core.e.a(Z))
        {
            i1 = 15000;
        } else
        {
            i1 = aq - ar;
        }
        if (com.roidapp.videolib.core.e.a(Z))
        {
            k1 = 15000;
        } else
        {
            k1 = aq;
        }
        at = Math.round(((float)k1 * 1.0F) / (float)j1);
        if (com.roidapp.videolib.core.e.a(Z))
        {
            i1 = c1;
        }
        au = Math.round(((float)i1 * 1.0F) / (float)j1);
        f1 = ((float)ar * 1.0F) / (float)j1;
        progressview = ax;
        if (com.roidapp.videolib.core.e.a(Z))
        {
            i1 = com.roidapp.videolib.core.e.c(Z);
        } else
        {
            i1 = i.length;
        }
        progressview.a(i1, at, f1);
        if (aq >= 6000 && S > aq || com.roidapp.videolib.core.e.a(Z))
        {
            as = true;
        } else
        {
            as = false;
        }
        K.sendEmptyMessage(6);
    }

    private boolean v()
    {
        int i1;
        M = new boolean[ao];
        i1 = 0;
_L8:
        if (i1 >= ao) goto _L2; else goto _L1
_L1:
        if (i[i1].f == null) goto _L4; else goto _L3
_L3:
        if (!(new File(i[i1].f)).exists())
        {
            com.roidapp.photogrid.common.y.c(h, i[i1].f);
            return false;
        }
        if (!L[i1].substring(L[i1].lastIndexOf("/") + 1).equalsIgnoreCase(i[i1].f.substring(i[i1].f.lastIndexOf("/") + 1))) goto _L4; else goto _L5
_L5:
        M[i1] = false;
_L6:
        i1++;
        continue; /* Loop/switch isn't completed */
_L4:
        M[i1] = true;
        al = al + 1;
        if (true) goto _L6; else goto _L2
_L2:
        return true;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private void w()
    {
        if (i == null || i.length == 0)
        {
            com.roidapp.photogrid.common.c.a("200", h);
        } else
        {
            if (Environment.getExternalStorageState().equals("mounted"))
            {
                Object obj = (new StringBuilder()).append(Environment.getExternalStorageDirectory().getAbsolutePath()).append("/").append(h.getString(0x7f07002e)).append("/.music").toString();
                String s1 = (new StringBuilder()).append(((String) (obj))).append("/default.mp3").toString();
                obj = new File(((String) (obj)));
                if (((File) (obj)).exists() || ((File) (obj)).mkdirs())
                {
                    File file = new File(s1);
                    if (!file.exists())
                    {
                        com.roidapp.baselib.d.a.a(h.getAssets(), file, "default.mp3");
                    }
                    P = s1;
                    ih.C().a(P);
                }
            }
            ao = i.length;
            L = new String[ao];
            String s2;
            for (int i1 = 0; i1 < ao; i1++)
            {
                String as1[] = L;
                if (i[i1].e == null)
                {
                    s2 = i[i1].d();
                } else
                {
                    s2 = i[i1].e;
                }
                as1[i1] = s2;
                if (!(new File(L[i1])).exists())
                {
                    ih.C().a(null);
                    com.roidapp.photogrid.common.y.c(h, L[i1]);
                    return;
                }
            }

            if (v())
            {
                if (ih.C().ap() == 0)
                {
                    T = Math.round(15000F / (float)ao);
                    ih.C().n(T);
                } else
                {
                    T = ih.C().ap();
                }
                aq = T * ao;
                R = ih.C().as();
                N = ih.C().ar();
                V = ih.C().at();
                if (N != null)
                {
                    Q = N.substring(N.lastIndexOf("/") + 1);
                    b(N);
                }
                b(ih.C().ab());
                Y = ih.C().aa();
                ay = Math.min(w, 720);
                (new Thread(new nk(this))).start();
                return;
            }
        }
    }

    private void x()
    {
        int j1 = 15000;
        if (V) goto _L2; else goto _L1
_L1:
        if (N == null) goto _L2; else goto _L3
_L3:
        if (ak != null) goto _L5; else goto _L4
_L4:
        b(N);
        if (!ac) goto _L5; else goto _L6
_L6:
        float f1 = aP;
        if (!com.roidapp.videolib.core.e.a(Z)) goto _L8; else goto _L7
_L7:
        int i1 = 15000;
_L13:
        an = (int)((float)i1 * f1);
        ak.seekTo(R + an);
_L5:
        ak.setVolume(aO, aO);
        f1 = aP;
        if (!com.roidapp.videolib.core.e.a(Z)) goto _L10; else goto _L9
_L9:
        i1 = j1;
_L11:
        try
        {
            if ((float)i1 * f1 + (float)R < (float)ak.getDuration())
            {
                ak.start();
                return;
            }
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
          goto _L2
_L8:
        i1 = aq - ar;
        continue; /* Loop/switch isn't completed */
_L10:
        i1 = aq;
        j1 = ar;
        i1 -= j1;
          goto _L11
_L2:
        return;
        if (true) goto _L13; else goto _L12
_L12:
    }

    private void y()
    {
        az.v = false;
        ap = false;
        V = false;
        R = 0;
        ih.C().g(N);
        ih.C().f(O);
        ih.C().j(false);
        ih.C().o(0);
    }

    private void z()
    {
        if (ah == null)
        {
            return;
        }
        if (!com.roidapp.videolib.core.e.a(Z))
        {
            ah.a(1.0F - aD / 100F);
            return;
        } else
        {
            ah.a(1.0F);
            return;
        }
    }

    public final void a()
    {
        float f1;
        float f2;
        float f3;
        float f4;
        Object obj;
        int j1;
        int k1;
        try
        {
            l.a(11, 0);
            if (j != null)
            {
                j.removeAllViews();
            }
            f2 = ih.C().t();
            x = h.getResources().getDisplayMetrics().heightPixels;
            w = h.getResources().getDisplayMetrics().widthPixels;
            if (x < w)
            {
                int i1 = x;
                x = w;
                w = i1;
            }
            f3 = h.getResources().getDimension(0x7f0900dd);
            f4 = h.getResources().getDimension(0x7f090058);
            f1 = h.getResources().getDimension(0x7f090057);
            obj = h.findViewById(0x7f0d0085);
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            return;
        }
        if (obj == null) goto _L2; else goto _L1
_L1:
        com.roidapp.photogrid.common.a.a();
        if (!com.roidapp.photogrid.common.a.a(h, "video", false) || com.roidapp.photogrid.a.m.a(h) == 1) goto _L4; else goto _L3
_L3:
        if (az.B) goto _L6; else goto _L5
_L5:
        ((View) (obj)).setVisibility(0);
        if (h instanceof PhotoGridActivity)
        {
            PhotoGridActivity photogridactivity = (PhotoGridActivity)h;
            if (photogridactivity.F)
            {
                photogridactivity.F = false;
                photogridactivity.C();
            }
        }
_L2:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_893;
        }
        if (((View) (obj)).getVisibility() != 0)
        {
            break MISSING_BLOCK_LABEL_893;
        }
        obj = ((View) (obj)).findViewById(0x7f0d0086);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_282;
        }
        j1 = ((View) (obj)).getLayoutParams().height;
        if (j1 > 0)
        {
            f1 = j1;
        }
_L11:
        float f5 = h.getResources().getDimension(0x7f0900cb);
        float f6 = h.getResources().getDimension(0x7f090050);
        j1 = (int)((float)x - f3 - f4 - f1 - f5 - f6 - (float)az.g);
        if (f2 >= (float)w / (float)j1) goto _L8; else goto _L7
_L7:
        k1 = (int)((float)j1 * f2);
_L10:
        k1 = (int)((float)k1 * aj);
        j1 = (int)((float)j1 * aj);
        j = (ViewGroup)LayoutInflater.from(h).inflate(0x7f03000e, null);
        obj = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        obj.width = k1;
        obj.height = j1;
        j.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        ad = (RelativeLayout)j.findViewById(0x7f0d0061);
        obj = (android.widget.RelativeLayout.LayoutParams)ad.getLayoutParams();
        obj.width = k1;
        obj.height = j1;
        ((android.widget.RelativeLayout.LayoutParams) (obj)).setMargins(0, 0, 0, 0);
        ad.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        ae = (RelativeLayout)j.findViewById(0x7f0d0064);
        ae.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        q = null;
        af = (LinearLayout)j.findViewById(0x7f0d0067);
        af.setOnClickListener(new ni(this));
        ag = (LinearLayout)j.findViewById(0x7f0d0068);
        ag.setVisibility(4);
        ai = (TextView)j.findViewById(0x7f0d0069);
        ax = (ProgressView)j.findViewById(0x7f0d0065);
        l.a(12, 0);
        a(ad);
        l.a(13, 0);
        ah = (GPUVideoView)ad.findViewById(1);
        ah.a(K);
        w();
        if (!com.roidapp.videolib.core.e.a(Z))
        {
            ah.b((long)((float)o() * aP));
        }
        ah.setOnClickListener(new nj(this));
        ah.a(az);
        l.a(14, 0);
        if (aP != 0.0F)
        {
            ih.C().a(0.0F);
        }
        av = j.getLayoutParams().width;
        aw = j.getLayoutParams().height;
        if (q == null)
        {
            q = new an(h, av, aw);
            ih.C().a(true);
            q.a(r, s, t, u);
            return;
        }
          goto _L9
_L6:
        ((View) (obj)).setVisibility(8);
          goto _L2
_L4:
        ((View) (obj)).setVisibility(8);
          goto _L2
_L8:
        k1 = w;
        j1 = (int)((float)k1 / f2);
          goto _L10
_L9:
        return;
        f1 = 0.0F;
          goto _L11
    }

    public final void a(int i1)
    {
        aA = true;
        aB = true;
        super.a(i1);
    }

    public final void a(int i1, int j1)
    {
        aA = true;
        aB = true;
        super.a(i1, j1);
    }

    public final void a(int i1, String s1)
    {
        ap = false;
        am = N;
        af.setVisibility(0);
        super.a(i1, s1);
    }

    public final void a(RelativeLayout relativelayout, android.view.View.OnTouchListener ontouchlistener)
    {
        l.a(95, 0);
        ah = (GPUVideoView)ad.findViewById(1);
        z();
        ah.a(ih.C().ag(), ih.C().af());
        int i1;
        int j1;
        if (ao == 1)
        {
            ai.setText(h.getString(0x7f0702e1, new Object[] {
                Integer.valueOf(ao)
            }));
        } else
        {
            ai.setText(h.getString(0x7f0702e0, new Object[] {
                Integer.valueOf(ao)
            }));
        }
        l.a(100, 0);
        ontouchlistener = (android.widget.RelativeLayout.LayoutParams)relativelayout.getLayoutParams();
        ontouchlistener.setMargins(0, 0, 0, (int)h.getResources().getDimension(0x7f09010a));
        relativelayout.setLayoutParams(ontouchlistener);
        relativelayout.removeAllViews();
        relativelayout.addView(j);
        ax.bringToFront();
        relativelayout = ax;
        i1 = j.getLayoutParams().width;
        j1 = (int)h.getResources().getDimension(0x7f0901f9);
        com.roidapp.videolib.core.e.a(Z);
        com.roidapp.videolib.core.e.a(Z);
        relativelayout.a(i1, j1);
        try
        {
            relativelayout = (FrameLayout)h.findViewById(0x7f0d03eb);
            ontouchlistener = (android.widget.RelativeLayout.LayoutParams)relativelayout.getLayoutParams();
            ontouchlistener.setMargins(0, ad.getLayoutParams().height, 0, 0);
            relativelayout.setLayoutParams(ontouchlistener);
            relativelayout.setVisibility(0);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (RelativeLayout relativelayout)
        {
            return;
        }
    }

    public final void a(IGroupInfo igroupinfo, IFilterInfo ifilterinfo, int i1)
    {
        az.v = false;
        aa = ifilterinfo;
        ab = i1;
        if (ah != null)
        {
            ah.a();
        }
        ih.C().l(i1);
        ih.C().a(igroupinfo);
        ih.C().a(ifilterinfo);
    }

    public final void a(com.roidapp.photogrid.video.e e1)
    {
        aI = e1;
        if (aP != 0.0F && aI != null)
        {
            e1 = aI;
            boolean flag;
            if (!com.roidapp.videolib.core.e.a(Z))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            e1.a(flag, false);
            aI.a((int)(aP * (float)o()), o());
        }
    }

    public final void a(u u1)
    {
        az.v = false;
        a(false, true);
        if (Y != null)
        {
            Y = null;
        }
        b(u1);
        z();
        j(0);
    }

    public final void a(String s1)
    {
        if (X == null || !X.equals(s1))
        {
            X = s1;
            aG = true;
            ((PhotoGridActivity)h).c = null;
        }
        if ((T * L.length) / 1000 < 3)
        {
            h(3000 / L.length);
        } else
        {
            h(ih.C().ap());
        }
        if (!U)
        {
            ar = 1000;
            s1 = ax;
            int i1 = j.getLayoutParams().width;
            int j1 = (int)h.getResources().getDimension(0x7f0901f9);
            com.roidapp.videolib.core.e.a(Z);
            com.roidapp.videolib.core.e.a(Z);
            s1.a(i1, j1);
            if (com.roidapp.videolib.core.e.a(Z))
            {
                i1 = 0;
            } else
            {
                i1 = az.c() - 1000;
            }
            o(i1);
            K.removeMessages(6);
            c(false);
        }
    }

    public final void a(boolean flag, boolean flag1)
    {
        super.a(flag, flag1);
        if (U)
        {
            U = false;
            c(flag);
            K.removeMessages(6);
            K.removeMessages(7);
            K.removeMessages(8214);
            K.removeMessages(8213);
            if (flag1)
            {
                ah.b();
                ax.a(0);
                K.removeMessages(8212);
                if (aI == null);
            } else
            {
                ah.c();
            }
            af.setVisibility(0);
            ai.setVisibility(0);
        }
        if (flag1)
        {
            aN = false;
            A();
        }
    }

    protected final void a(String as1[])
    {
        if (as1 != null && as1.length >= 2)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        int i1;
        try
        {
            as1 = (dk)((PhotoGridActivity)h).getSupportFragmentManager().findFragmentByTag("fragmentEditVideo");
        }
        // Misplaced declaration of an exception variable
        catch (String as1[])
        {
            return;
        }
        if (as1 == null)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        if (Q == null || Q == "")
        {
            as1.a(false);
        }
        return;
        i1 = Integer.valueOf(as1[0]).intValue();
        as1 = as1[1];
        switch (i1)
        {
        case 0: // '\0'
        default:
            return;

        case -3: 
            a(60937, ((String) (as1)));
            return;

        case -1: 
            a(60940, ((String) (null)));
            return;

        case -2: 
            a(60936, ((String) (null)));
            return;

        case 1: // '\001'
            af.setVisibility(8);
            break;
        }
        l.sendEmptyMessage(18);
        ap = true;
        O = ih.C().aq();
        b(as1);
        return;
    }

    public final int b(boolean flag)
    {
        return 0;
    }

    public final void b()
    {
        a(true, false);
        if (ak != null)
        {
            try
            {
                ak.release();
                ak = null;
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
            }
        }
        if (j != null)
        {
            j.removeAllViews();
        }
        if (q != null)
        {
            q.a();
        }
        if (aF != null)
        {
            aF.recycle();
            aF = null;
        }
        if (aE != null)
        {
            aE.recycle();
            aE = null;
        }
    }

    public final void b(int i1, int j1)
    {
    }

    public final void b(int i1, boolean flag)
    {
    }

    public final void c(int i1)
    {
        boolean flag = true;
        az.v = false;
        if (!b(aC, ih.C().V()) || !b(aD, ih.C().S()) || aA)
        {
            a(false, false);
        }
        if (ah != null)
        {
            if (!b(aD, ih.C().S()))
            {
                aD = ih.C().S();
                z();
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (!b(aC, ih.C().V()))
            {
                A();
                i1 = ((flag) ? 1 : 0);
            }
            if (i1 != 0 || aA)
            {
                ah.a();
            }
            if (aA)
            {
                aA = false;
            }
        } else
        {
            a(ad);
            ah = (GPUVideoView)ad.findViewById(1);
            if (ah == null)
            {
                a();
                return;
            }
        }
    }

    public final void c(int i1, int j1)
    {
    }

    public final void c(int i1, boolean flag)
    {
        if (ah != null)
        {
            ah.a(i1, flag);
        }
        aL = flag;
        ih.C().i(aL);
        ih.C().m(i1);
        if (ih.C().ax() && aL)
        {
            if (ih.C().S() < 10.45F)
            {
                ih.C().e(10.45F);
            }
            c(2);
        } else
        if (ih.C().ax() && !aL)
        {
            ih.C().e(ih.C().U());
            c(2);
            return;
        }
    }

    public final void d(int i1)
    {
        super.d(i1);
    }

    public final void e(int i1)
    {
label0:
        {
            super.e(i1);
            if (U)
            {
                aP = Math.min(1.0F, (float)i1 / (float)au);
                if (ax != null)
                {
                    ax.a(i1);
                }
                p(i1);
                if (aI != null && au != 0)
                {
                    if (au <= i1)
                    {
                        break label0;
                    }
                    aI.a(i1, au);
                }
            }
            return;
        }
        aI.a(false, true);
    }

    public final a f(int i1)
    {
        int j1 = i1;
        if (com.roidapp.videolib.core.e.a(Z))
        {
            j1 = i1;
            if (ao != 0)
            {
                j1 = i1 % ao;
            }
        }
        return q(j1);
    }

    public final void f()
    {
    }

    public final void g()
    {
        if (ae.isShown())
        {
            ae.setVisibility(8);
        }
    }

    protected final void g(int i1)
    {
        R = i1;
        ih.C().o(i1);
    }

    public final void h()
    {
        x();
    }

    protected final void h(int i1)
    {
        T = i1;
        aq = T * ao;
        ih.C().n(i1);
    }

    public final void i()
    {
        if (ah != null)
        {
            ah.onResume();
        }
    }

    public final void i(int i1)
    {
        az.v = false;
        ab = i1;
        if (ah != null)
        {
            ah.a();
        }
        ih.C().l(i1);
    }

    public final void j()
    {
        if (ah != null)
        {
            ah.onPause();
        }
    }

    protected final void j(int i1)
    {
        B();
        U = true;
        n((aq * i1) / ao);
        af.setVisibility(8);
        ai.setVisibility(8);
        if (com.roidapp.videolib.core.e.a(Z))
        {
            ax.a(false);
            ax.setVisibility(0);
        } else
        {
            ax.a(true);
            ax.setVisibility(8);
        }
        K.removeMessages(6);
        K.removeMessages(7);
        K.removeMessages(8214);
        if (com.roidapp.videolib.core.e.a(Z))
        {
            aP = 0.0F;
            ah.a(0L);
            n(0);
        } else
        {
            aP = (float)i1 / (float)ao;
            ah.a(i1);
            n((aq * i1) / ao);
        }
        u();
        if (aI != null)
        {
            com.roidapp.photogrid.video.e e1 = aI;
            boolean flag;
            if (!com.roidapp.videolib.core.e.a(Z))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            e1.a(flag, false);
            if (com.roidapp.videolib.core.e.a(Z) || i1 == 0)
            {
                aI.a(0, au);
            }
        }
        aN = true;
        aS = false;
    }

    public final void k(int i1)
    {
        if (ah == null || i1 < 0 || i1 >= i.length || ao == 0 || at == 0)
        {
            return;
        }
        s();
        try
        {
            if (U)
            {
                aP = (float)i1 / (float)ao;
                ah.b(i1);
                n((aq * i1) / ao);
                x();
                return;
            }
        }
        catch (Exception exception)
        {
            return;
        }
        j(i1);
        return;
    }

    public final void l(int i1)
    {
        float f1;
        if (ah == null || i1 < 0 || ao == 0 || at == 0)
        {
            return;
        }
        s();
        f1 = i1;
        if (!com.roidapp.videolib.core.e.a(Z))
        {
            break MISSING_BLOCK_LABEL_84;
        }
        int j1 = 15000;
_L1:
        try
        {
            aP = f1 / (float)j1;
            ah.b(i1);
            n(i1);
            if (!U)
            {
                aS = true;
                return;
            }
        }
        catch (Exception exception)
        {
            return;
        }
        break MISSING_BLOCK_LABEL_98;
        j1 = aq - ar;
          goto _L1
        aS = false;
        return;
    }

    public final void m()
    {
        ih.C().i(false);
        if (ah != null)
        {
            ah.a(-1, false);
        }
    }

    protected final void n()
    {
        if (!aN)
        {
            B();
        }
        af.setVisibility(8);
        ai.setVisibility(8);
        float f1;
        int i1;
        int j1;
        if (com.roidapp.videolib.core.e.a(Z))
        {
            ax.a(false);
            ax.setVisibility(0);
        } else
        {
            ax.a(true);
            ax.setVisibility(8);
        }
        s();
        if (com.roidapp.videolib.core.e.a(Z))
        {
            i1 = 15000;
        } else
        {
            i1 = aq;
        }
        f1 = aP;
        if (com.roidapp.videolib.core.e.a(Z))
        {
            j1 = 15000;
        } else
        {
            j1 = aq - ar;
        }
        j1 = (int)((double)((float)j1 * f1) + 0.5D);
        if (aN)
        {
            if (aS && j1 + T / 2 >= i1 && aP >= 0.97F)
            {
                aP = 0.0F;
                l(0);
            }
            ah.d();
            x();
        } else
        {
            if (T / 2 + j1 >= i1 && aP >= 0.97F || aP >= 1.0F)
            {
                aP = 0.0F;
                i1 = 0;
            } else
            {
                i1 = j1;
            }
            u();
            if (aI != null)
            {
                com.roidapp.photogrid.video.e e1 = aI;
                boolean flag;
                if (!com.roidapp.videolib.core.e.a(Z))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                e1.a(flag, false);
                aI.a((int)Math.ceil(aP * (float)au), au);
            }
            ah.a(i1);
            n(i1);
            aN = true;
        }
        U = true;
        aS = false;
    }

    public final int o()
    {
        if (com.roidapp.videolib.core.e.a(Z))
        {
            return 15000;
        } else
        {
            return aq - ar;
        }
    }

    public final void onCompletion(MediaPlayer mediaplayer)
    {
    }

    public final boolean onInfo(MediaPlayer mediaplayer, int i1, int j1)
    {
        switch (i1)
        {
        default:
            return false;

        case 801: 
            ac = false;
            break;
        }
        return false;
    }

    public final void onPrepared(MediaPlayer mediaplayer)
    {
        N = am;
        Q = N.substring(N.lastIndexOf("/") + 1);
        S = mediaplayer.getDuration();
        if (ap)
        {
            af.setVisibility(0);
            l.sendEmptyMessage(15);
            y();
            ((PhotoGridActivity)h).a(0x7f0d03ec, new el(), "fragmentEditVideoPopupMusic");
            float f1;
            int i1;
            try
            {
                ((dk)((PhotoGridActivity)h).getSupportFragmentManager().findFragmentByTag("fragmentEditVideo")).a(true);
            }
            // Misplaced declaration of an exception variable
            catch (MediaPlayer mediaplayer) { }
        }
        if (aM)
        {
            f1 = aP;
            if (com.roidapp.videolib.core.e.a(Z))
            {
                i1 = 15000;
            } else
            {
                i1 = aq - ar;
            }
            n((int)((float)i1 * f1));
            aM = false;
        }
    }

    public final int p()
    {
        int i1 = 0;
        if (ah != null)
        {
            i1 = ah.e();
        }
        ig aig[] = ih.C().M();
        int j1 = i1;
        if (com.roidapp.videolib.core.e.a(Z))
        {
            j1 = i1;
            if (aig != null)
            {
                j1 = i1;
                if (aig.length != 0)
                {
                    j1 = i1 % aig.length;
                }
            }
        }
        return j1;
    }

    public final float q()
    {
        return aP;
    }

    public final void r()
    {
        if (!"".equals(X))
        {
            X = "";
            aG = true;
            ((PhotoGridActivity)h).c = null;
        }
        if (!U)
        {
            ar = 0;
            ProgressView progressview = ax;
            int i1 = j.getLayoutParams().width;
            int j1 = (int)h.getResources().getDimension(0x7f0901f9);
            com.roidapp.videolib.core.e.a(Z);
            com.roidapp.videolib.core.e.a(Z);
            progressview.a(i1, j1);
            if (com.roidapp.videolib.core.e.a(Z))
            {
                i1 = 0;
            } else
            {
                i1 = az.c() - 1;
            }
            o(i1);
            K.removeMessages(6);
            c(false);
        }
    }

    public final void s()
    {
        K.removeMessages(6);
        K.removeMessages(7);
        K.removeMessages(8214);
        K.removeMessages(8213);
        K.removeMessages(8212);
    }

    public final android.view.ViewGroup.LayoutParams t()
    {
        return ad.getLayoutParams();
    }
}

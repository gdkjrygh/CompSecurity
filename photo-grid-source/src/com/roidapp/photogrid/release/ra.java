// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.PointF;
import android.graphics.PorterDuffXfermode;
import android.graphics.Typeface;
import android.text.DynamicLayout;
import android.text.Editable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import com.roidapp.baselib.c.n;
import com.roidapp.baselib.c.p;
import com.roidapp.photogrid.common.az;
import com.roidapp.photogrid.common.b;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.roidapp.photogrid.release:
//            ao, rb, rf, rc

public final class ra extends ao
{

    public Matrix G;
    public Matrix H;
    public Matrix I;
    protected Typeface J;
    protected android.text.Layout.Alignment K;
    protected String L;
    protected int M;
    protected final int N;
    protected final int O;
    protected int P;
    protected int Q;
    protected int R;
    protected Bitmap S;
    protected Bitmap T;
    protected Bitmap U;
    protected float V;
    public Layout W;
    public Layout X;
    public float Y;
    public float Z;
    private int aA;
    private int aB;
    private PaintFlagsDrawFilter aC;
    private TextPaint aD;
    private TextPaint aE;
    private float aF;
    private float aG;
    private float aH;
    private final int aI;
    private SharedPreferences aJ;
    private final String aK;
    private final String aL;
    private final String aM;
    private final String aN;
    private final String aO;
    private final String aP;
    private final String aQ;
    private final String aR;
    private final String aS;
    private final String aT;
    private final String aU;
    private final String aV;
    private float aW;
    private boolean aX;
    private boolean aY;
    private int aZ;
    public float aa;
    float ab[];
    float ac[];
    public float ad;
    protected int ae;
    protected int af;
    protected boolean ag;
    protected float ah;
    public float ai;
    protected int aj;
    protected boolean ak;
    protected boolean al;
    protected boolean am;
    protected boolean an;
    public String ao;
    public int ap;
    public boolean aq;
    public int ar;
    public int as;
    public float at;
    public float au;
    public float av;
    public float aw;
    public int ax;
    private CharSequence ay;
    private Paint az;
    private float ba;
    private boolean bb;

    public ra(Context context)
    {
        this(context, "");
    }

    public ra(Context context, String s1)
    {
        this(context, s1, false);
    }

    public ra(Context context, String s1, boolean flag)
    {
        boolean flag1 = true;
        super(context);
        J = Typeface.DEFAULT;
        N = 2;
        O = 1;
        P = 2;
        aC = new PaintFlagsDrawFilter(0, 3);
        aa = 16F;
        ad = 30F;
        ae = 0xff000000;
        aI = -21;
        af = -21;
        ag = false;
        ah = 1.0F;
        aK = "FREE_TEXT_F_COLOR";
        aL = "FREE_TEXT_FONT";
        aM = "FREE_TEXT_S_COLOR";
        aN = "REE_TEXT_BG_COLOR";
        aO = "REE_TEXT_BG_PI0";
        aP = "REE_TEXT_BG_PI1";
        aQ = "free_text_alpha";
        aR = "free_text_stroke_scale";
        aS = "free_text_shadow_color";
        aT = "free_text_shadow_radius";
        aU = "free_text_shadow_space";
        aV = "free_text_show_shadow";
        aW = 1.5F;
        ai = 2.0F;
        aj = 255;
        ak = false;
        al = false;
        am = false;
        an = false;
        ar = 1;
        at = 0.0F;
        au = 2.5F;
        ax = 0xff000000;
        aX = false;
        aZ = -1;
        ba = 1.0F;
        bb = flag;
        aJ = context.getSharedPreferences(context.getPackageName(), 0);
        aW = context.getResources().getDisplayMetrics().density;
        Y = 3F * aW;
        Z = 0.0F * aW;
        aH = context.getResources().getDisplayMetrics().scaledDensity;
        ae = aJ.getInt("FREE_TEXT_F_COLOR", 0xff000000);
        J = b(aJ.getInt("FREE_TEXT_FONT", 0));
        M = a(J);
        af = aJ.getInt("FREE_TEXT_S_COLOR", -1);
        P = aJ.getInt("REE_TEXT_BG_COLOR", 2);
        Q = aJ.getInt("REE_TEXT_BG_PI0", 2);
        R = aJ.getInt("REE_TEXT_BG_PI1", 1);
        aj = aJ.getInt("free_text_alpha", 255);
        ax = aJ.getInt("free_text_shadow_color", 0xff000000);
        ah = aJ.getFloat("free_text_stroke_scale", 1.0F);
        au = aJ.getFloat("free_text_shadow_radius", 1.0F);
        float f1 = aJ.getFloat("free_text_shadow_space", 0.0F);
        aw = f1;
        av = f1;
        ag = aJ.getBoolean("free_text_show_shadow", false);
        ai = ai * context.getResources().getDisplayMetrics().density;
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        aX = flag;
        az = new Paint();
        K = android.text.Layout.Alignment.ALIGN_NORMAL;
        L = "";
        if (bb)
        {
            ay = android.text.Editable.Factory.getInstance().newEditable(s1);
            ((Editable)ay).setSpan(new rb(this, (byte)0), 0, ay.length(), 18);
        } else
        {
            ay = s1;
        }
        I = new Matrix(b);
        G = new Matrix(b);
        H = new Matrix(b);
    }

    private void G()
    {
        aE = new TextPaint();
        aE.setAntiAlias(true);
        aE.setColor(af);
        aE.setTypeface(J);
        aE.setTextSize(ad * aH);
        aE.setStrokeWidth(2.0F * ah * aW);
        aE.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        Object obj;
        if (bb)
        {
            obj = a(ay, aE, Math.round(aF), K);
        } else
        {
            obj = new StaticLayout(ay, aE, Math.round(aF), K, 1.0F, 0.0F, true);
        }
        X = ((Layout) (obj));
        com.roidapp.photogrid.common.b.a((new StringBuilder("mBgTextLayout:")).append(s).append("/").append(t).append("Max:").append(aF).toString());
    }

    private void H()
    {
        s = W.getWidth() + (int)aG / 2 + (int)((Z + ai) * 2.0F);
        t = W.getHeight() + (int)((Y + ai) * 2.0F);
        if ((s > aZ - 10 || t > aZ - 10) && aZ > 0)
        {
            float f1;
            if (s > t)
            {
                f1 = s;
            } else
            {
                f1 = t;
            }
            ba = (float)(aZ - 10) / f1;
            s = (int)((float)s * ba);
            t = (int)((float)t * ba);
        } else
        {
            ba = 1.0F;
        }
        a(U);
        n = (new float[] {
            0.0F, 0.0F, (float)(s / 2), 0.0F, (float)s, 0.0F, (float)s, (float)(t / 2), (float)s, (float)t, 
            (float)(s / 2), (float)t, 0.0F, (float)t, 0.0F, (float)(t / 2), (float)(s / 2), (float)(t / 2)
        });
        o = (float[])n.clone();
        b.mapPoints(o, n);
        ab = (float[])n.clone();
        ac = (float[])n.clone();
        if (as == 1 && at == 0.0F)
        {
            at = s;
        }
        h();
    }

    private static float a(TextPaint textpaint, String s1)
    {
        float f1 = 0.0F;
        s1 = s1.split(System.getProperty("line.separator", "\n"));
        int j1 = s1.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            String s2 = s1[i1];
            if (s2 == null)
            {
                continue;
            }
            float f2 = textpaint.measureText(s2);
            if (f2 > f1)
            {
                f1 = f2;
            }
        }

        return f1;
    }

    private static DynamicLayout a(CharSequence charsequence, TextPaint textpaint, int i1, android.text.Layout.Alignment alignment)
    {
        DynamicLayout dynamiclayout;
        try
        {
            dynamiclayout = (DynamicLayout)android/text/DynamicLayout.getConstructor(new Class[] {
                java/lang/CharSequence, android/text/TextPaint, Integer.TYPE, android/text/Layout$Alignment, Float.TYPE, Float.TYPE, Boolean.TYPE, Boolean.TYPE
            }).newInstance(new Object[] {
                charsequence, textpaint, Integer.valueOf(i1), alignment, Float.valueOf(1.0F), Float.valueOf(0.0F), Boolean.valueOf(true), Boolean.valueOf(true)
            });
        }
        catch (Exception exception)
        {
            return new DynamicLayout(charsequence, textpaint, i1, alignment, 1.0F, 0.0F, true);
        }
        return dynamiclayout;
    }

    private static void a(Bitmap bitmap)
    {
        if (bitmap != null && !bitmap.isRecycled())
        {
            bitmap.recycle();
        }
    }

    static void a(ra ra1)
    {
        ra1.H();
    }

    private boolean a(float af1[])
    {
        float f2 = 0.7F;
        float f4 = 0.1F;
        if (af1[16] > 0.0F && af1[16] < (float)c && af1[17] > 0.0F && af1[17] < (float)d)
        {
            return false;
        }
        float f1 = c();
        float f5 = d();
        float f3;
        float af2[];
        if (c > d)
        {
            f3 = d;
        } else
        {
            f3 = c;
        }
        if (f3 > f1)
        {
            f1 = 0.7F / (f3 / f1);
        } else
        {
            f1 = 0.7F;
        }
        if (f3 > f5)
        {
            f2 = 0.7F / (f3 / f5);
        }
        f3 = f1;
        if (f1 < 0.1F)
        {
            f3 = 0.1F;
        }
        if (f2 < 0.1F)
        {
            f1 = f4;
        } else
        {
            f1 = f2;
        }
        af2 = new float[18];
        F.reset();
        F.postScale(f3, f1, af1[16], af1[17]);
        F.mapPoints(af2, af1);
        if (af2[0] > 0.0F && af2[0] < (float)c && af2[1] > 0.0F && af2[1] < (float)d)
        {
            return false;
        }
        if (af2[2] > 0.0F && af2[2] < (float)c && af2[3] > 0.0F && af2[3] < (float)d)
        {
            return false;
        }
        if (af2[4] > 0.0F && af2[4] < (float)c && af2[5] > 0.0F && af2[5] < (float)d)
        {
            return false;
        }
        if (af2[6] > 0.0F && af2[6] < (float)c && af2[7] > 0.0F && af2[7] < (float)d)
        {
            return false;
        }
        if (af2[8] > 0.0F && af2[8] < (float)c && af2[9] > 0.0F && af2[9] < (float)d)
        {
            return false;
        }
        if (af2[10] > 0.0F && af2[10] < (float)c && af2[11] > 0.0F && af2[11] < (float)d)
        {
            return false;
        }
        if (af2[12] > 0.0F && af2[12] < (float)c && af2[13] > 0.0F && af2[13] < (float)d)
        {
            return false;
        }
        return af2[14] <= 0.0F || af2[14] >= (float)c || af2[15] <= 0.0F || af2[15] >= (float)d;
    }

    private void b(boolean flag)
    {
        int l1;
        int j2;
        boolean flag1;
        flag1 = true;
        if (P != 1)
        {
            break MISSING_BLOCK_LABEL_744;
        }
        j2 = (int)(((float)s - ai * 2.0F) * h);
        l1 = (int)(((float)t - ai * 2.0F) * h);
        if (!flag)
        {
            j2 = (int)((float)c() - ai * 2.0F * h);
            l1 = (int)((float)d() - ai * 2.0F * h);
        }
        if (j2 > 0 && l1 > 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (S != null && !S.isRecycled())
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!aq || ao == null) goto _L4; else goto _L3
_L3:
        if (!ao.equals(""))
        {
label0:
            {
                if (ap != 1)
                {
                    break label0;
                }
                S = BitmapFactory.decodeFile(ao);
                if (S != null)
                {
                    break MISSING_BLOCK_LABEL_322;
                }
                if (flag)
                {
                    throw new OutOfMemoryError("bg create decodeBitmap null");
                }
            }
        }
          goto _L1
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(ao, options);
        int k2 = options.outWidth / j2;
        int i1 = k2;
        if (k2 > options.outHeight / l1)
        {
            i1 = options.outHeight / l1;
        }
        if (i1 <= 0)
        {
            i1 = ((flag1) ? 1 : 0);
        }
        options.inSampleSize = i1;
        options.inJustDecodeBounds = false;
        Bitmap bitmap1 = BitmapFactory.decodeFile(ao, options);
        float f1 = (float)j2 / (float)options.outWidth;
        float f3 = (float)l1 / (float)options.outHeight;
        rf.a();
        S = rf.a(bitmap1, f1, f3);
_L8:
        rf.a();
        Bitmap bitmap = S;
        float f2 = V;
        S = rf.a(bitmap, f2, f2);
        if (S == null) goto _L1; else goto _L5
_L5:
        Object obj;
        ArrayIndexOutOfBoundsException arrayindexoutofboundsexception;
        int j1;
        if (j2 % S.getWidth() != 0)
        {
            j1 = j2 / S.getWidth() + 1;
        } else
        {
            j1 = j2 / S.getWidth();
        }
        aA = j1;
        if (l1 % S.getHeight() != 0)
        {
            j1 = l1 / S.getHeight() + 1;
        } else
        {
            j1 = l1 / S.getHeight();
        }
        aB = j1;
        obj = T;
        try
        {
            rf.a();
            T = rf.a(j2, l1, az.c);
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            outofmemoryerror.printStackTrace();
            T = null;
        }
        if (T != null) goto _L7; else goto _L6
_L6:
        if (flag)
        {
            throw new OutOfMemoryError("mBg==null  throw oom");
        }
          goto _L1
_L4:
        obj = new android.graphics.BitmapFactory.Options();
        obj.inJustDecodeBounds = false;
        try
        {
            rf.a();
            S = rf.a(a, com.roidapp.baselib.c.p.a().j[Q][R], ((android.graphics.BitmapFactory.Options) (obj)), S);
        }
        // Misplaced declaration of an exception variable
        catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception)
        {
            arrayindexoutofboundsexception.printStackTrace();
            Q = 2;
            R = 0;
            rf.a();
            S = rf.a(a, com.roidapp.baselib.c.p.a().j[Q][R], ((android.graphics.BitmapFactory.Options) (obj)), S);
        }
          goto _L8
_L7:
        Canvas canvas = new Canvas(T);
        canvas.setDrawFilter(aC);
        for (int k1 = 0; k1 < aB; k1++)
        {
            for (int i2 = 0; i2 < aA; i2++)
            {
                canvas.drawBitmap(S, S.getWidth() * i2, S.getHeight() * k1, null);
            }

        }

        if (obj != null && !((Bitmap) (obj)).isRecycled())
        {
            ((Bitmap) (obj)).recycle();
        }
        canvas.save();
        h();
        return;
          goto _L8
    }

    private void c(boolean flag)
    {
        if (!flag)
        {
            a(S);
        }
        b(false);
    }

    public final boolean A()
    {
        return TextUtils.isEmpty(ay);
    }

    public final boolean B()
    {
        return aY;
    }

    public final void C()
    {
        aY = true;
    }

    public final void D()
    {
        aY = false;
    }

    public final boolean E()
    {
        return an;
    }

    public final void F()
    {
        an = true;
    }

    public final int a(Typeface typeface)
    {
        for (Iterator iterator = rc.a(a).a().entrySet().iterator(); iterator.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            if (entry.getValue() == typeface)
            {
                return ((Integer)entry.getKey()).intValue();
            }
        }

        return -1;
    }

    public final ao a(Context context)
    {
        context = new ra(context, ay.toString());
        context.b = new Matrix();
        context.H = new Matrix(((ra) (context)).b);
        context.G = new Matrix(((ra) (context)).b);
        context.I = new Matrix(((ra) (context)).b);
        context.bb = bb;
        context.g = g;
        context.j = j;
        context.k = k;
        context.l = l;
        context.p = d();
        context.q = c();
        context.h = h;
        context.r = e();
        context.s = s;
        context.t = t;
        context.c = c;
        context.d = d;
        context.aD = aD;
        context.az = az;
        context.P = P;
        context.Q = Q;
        context.R = R;
        context.W = W;
        context.a = a;
        context.V = V;
        context.Y = Y;
        context.Z = Z;
        context.ad = ad;
        context.aH = aH;
        context.K = K;
        context.ae = ae;
        context.af = af;
        context.J = J;
        context.ah = ah;
        context.aa = aa;
        context.ao = ao;
        context.ap = ap;
        context.aq = aq;
        context.ar = ar;
        context.as = as;
        context.at = at;
        context.ax = ax;
        context.av = av;
        context.aw = aw;
        context.aj = aj;
        context.au = au;
        context.ag = ag;
        return context;
    }

    public final void a()
    {
        if (S != null && !S.isRecycled())
        {
            S.recycle();
            S = null;
        }
        if (T != null && !T.isRecycled())
        {
            T.recycle();
            T = null;
        }
        if (U != null)
        {
            U.recycle();
        }
    }

    public final void a(int i1)
    {
        P = i1;
        android.content.SharedPreferences.Editor editor = aJ.edit();
        editor.putInt("REE_TEXT_BG_COLOR", i1);
        editor.apply();
    }

    public final void a(int i1, int j1)
    {
        Q = i1;
        R = j1;
        android.content.SharedPreferences.Editor editor = aJ.edit();
        editor.putInt("REE_TEXT_BG_PI0", Q);
        editor.putInt("REE_TEXT_BG_PI1", R);
        editor.apply();
        a(1);
    }

    public final void a(Canvas canvas)
    {
        canvas.setDrawFilter(aC);
        canvas.save();
        if (P == 1)
        {
            H.mapPoints(ab, n);
            I.mapPoints(ac, n);
            I.postTranslate(ab[0] - ac[0], ab[1] - ac[1]);
            if (T != null && !T.isRecycled())
            {
                az.setAlpha(aj);
                canvas.drawBitmap(T, I, az);
            }
        } else
        if (P != 2)
        {
            canvas.concat(H);
            if (ar != 1)
            {
                az.setColor(ar);
            } else
            {
                az.setColor(P);
            }
            az.setAlpha(aj);
            canvas.drawRect(0.0F, 0.0F, (float)s - ai * 2.0F, (float)t - ai * 2.0F, az);
        }
        canvas.restore();
        canvas.save();
        canvas.concat(G);
        if (af != -21)
        {
            int j1;
            int l1;
            if (ag)
            {
                if (aX)
                {
                    int i1 = aj;
                    int k1 = ax;
                    aE.setShadowLayer(au, av, aw, i1 << 24 | k1 & 0xffffff);
                } else
                {
                    aE.setShadowLayer(au, av, aw, ax);
                }
            } else
            {
                aE.setShadowLayer(0.0F, av, aw, ax);
            }
            canvas.translate(Z + ai + aa / 2.0F + aG / 4F, Y + ai);
            aE.setAlpha(aj);
            X.draw(canvas);
        }
        canvas.restore();
        canvas.save();
        canvas.concat(G);
        if (ag)
        {
            if (af == -21)
            {
                if (aX)
                {
                    j1 = aj;
                    l1 = ax;
                    aD.setShadowLayer(au, av, aw, j1 << 24 | l1 & 0xffffff);
                } else
                {
                    aD.setShadowLayer(au, av, aw, ax);
                }
            } else
            {
                aD.setShadowLayer(0.0F, av, aw, ax);
            }
        } else
        {
            aD.setShadowLayer(0.0F, av, aw, ax);
        }
        canvas.translate(Z + ai + aa / 2.0F + aG / 4F, Y + ai);
        aD.setAlpha(aj);
        W.draw(canvas);
        canvas.restore();
    }

    public final void a(PointF pointf, PointF pointf1)
    {
        float f3 = 0.0F;
        float f1 = pointf1.x;
        float f4 = pointf.x;
        float f5 = pointf1.y;
        float f6 = pointf.y;
        b(-(f1 - f4), -(f5 - f6));
        b.mapPoints(o, n);
        if (a(o))
        {
            float f2;
            if (o[16] < 0.0F || o[16] > (float)c)
            {
                f2 = (float)((c - c()) / 2) - o[16];
            } else
            {
                f2 = 0.0F;
            }
            if (o[17] < 0.0F || o[17] > (float)d)
            {
                f3 = (float)((d - d()) / 4) - o[17];
            }
            b(f2, f3);
        }
    }

    public final void a(android.text.Layout.Alignment alignment)
    {
        if (K != alignment) goto _L2; else goto _L1
_L1:
        return;
_L2:
        K = alignment;
        if (!alignment.equals(android.text.Layout.Alignment.ALIGN_NORMAL)) goto _L4; else goto _L3
_L3:
        aa = aG;
_L5:
        if (W != null)
        {
            Object obj;
            if (bb)
            {
                obj = a(ay, aD, (int)aF, alignment);
            } else
            {
                obj = new StaticLayout(ay, aD, (int)aF, alignment, 1.0F, 0.0F, true);
            }
            W = ((Layout) (obj));
            if (X != null)
            {
                if (bb)
                {
                    alignment = a(ay, aE, (int)aF, alignment);
                } else
                {
                    alignment = new StaticLayout(ay, aE, (int)aF, alignment, 1.0F, 0.0F, true);
                }
                X = alignment;
                return;
            }
        }
        if (true) goto _L1; else goto _L4
_L4:
        if (alignment.equals(android.text.Layout.Alignment.ALIGN_CENTER))
        {
            aa = 0.0F;
        } else
        if (alignment.equals(android.text.Layout.Alignment.ALIGN_OPPOSITE))
        {
            aa = -aG;
        }
          goto _L5
    }

    public final void a(String s1)
    {
        if (bb)
        {
            ((Editable)ay).replace(0, ay.length(), s1);
            return;
        } else
        {
            ay = s1;
            a();
            g();
            c(false);
            return;
        }
    }

    public final void a(boolean flag)
    {
        ag = flag;
    }

    public final boolean a(float f1)
    {
        int j1 = (int)((float)c() + ai);
        int k1 = (int)((float)d() + ai);
        Matrix matrix = new Matrix(b);
        matrix.postScale(f1, f1, o[16], o[17]);
        float af1[] = (float[])n.clone();
        matrix.mapPoints(af1, n);
        float f3 = a(af1[0], af1[1], af1[12], af1[13]);
        float f4 = a(af1[0], af1[1], af1[4], af1[5]);
        float f2 = f4;
        if (f3 >= f4)
        {
            f2 = f3;
        }
        int i1;
        boolean flag;
        if (d >= c)
        {
            i1 = d;
        } else
        {
            i1 = c;
        }
        if (f2 <= (float)i1 * 0.9F && f2 > 0.0F || f1 < 1.0F)
        {
            h = h * f1;
            b.postScale(f1, f1, o[16], o[17]);
            G.postScale(f1, f1, o[16], o[17]);
            H.postScale(f1, f1, o[16], o[17]);
            c(true);
            flag = true;
        } else
        {
            flag = false;
        }
        j = j + ((float)j1 - ((float)c() + ai)) / 2.0F;
        k = k + ((float)k1 - ((float)d() + ai)) / 2.0F;
        return flag;
    }

    public final Typeface b(int i1)
    {
        if (rc.a(a).a().get(Integer.valueOf(i1)) == null)
        {
            return Typeface.DEFAULT;
        } else
        {
            return (Typeface)rc.a(a).a().get(Integer.valueOf(i1));
        }
    }

    public final void b()
    {
        if (o == null)
        {
            return;
        } else
        {
            b((float)D - o[16], (float)E - o[17]);
            return;
        }
    }

    public final void b(float f1)
    {
        super.b(f1);
        H.postRotate(f1, o[16], o[17]);
        G.postRotate(f1, o[16], o[17]);
        I.postRotate(f1, o[16], o[17]);
    }

    public final void b(float f1, float f2)
    {
        super.b(f1, f2);
        G.postTranslate(f1, f2);
        H.postTranslate(f1, f2);
        I.postTranslate(f1, f2);
    }

    public final void b(float f1, float f2, float f3, float f4)
    {
        h = f1;
        b.setScale(h, h);
        b.mapPoints(o, n);
        I = new Matrix(b);
        I.setScale(1.0F, 1.0F);
        G.setScale(h, h);
        H.setScale(h, h);
        H.postTranslate(ai * h, ai * h);
        l = 0.0F;
        b(f2);
        b(f3, f4);
    }

    public final void b(int i1, int j1)
    {
        if (i1 > j1)
        {
            V = (float)i1 / (a.getResources().getDisplayMetrics().density * 1280F);
            return;
        } else
        {
            V = (float)j1 / (a.getResources().getDisplayMetrics().density * 1280F);
            return;
        }
    }

    public final void b(Canvas canvas)
    {
        if (aZ < 0 && com.roidapp.baselib.c.n.a())
        {
            aZ = canvas.getMaximumBitmapWidth();
        }
        canvas.setDrawFilter(aC);
        canvas.save();
        if (P == 1)
        {
            H.mapPoints(ab, n);
            I.mapPoints(ac, n);
            I.postTranslate(ab[0] - ac[0], ab[1] - ac[1]);
            if (T != null && !T.isRecycled())
            {
                az.setAlpha(aj);
                canvas.drawBitmap(T, I, az);
            }
            break MISSING_BLOCK_LABEL_150;
        } else
        {
            if (P != 2)
            {
                canvas.concat(H);
                if (ar != 1)
                {
                    az.setColor(ar);
                } else
                {
                    az.setColor(P);
                }
                az.setAlpha(aj);
                canvas.drawRect(0.0F, 0.0F, (float)s - ai * 2.0F, (float)t - ai * 2.0F, az);
            }
            continue;
        }
        do
        {
            canvas.restore();
            canvas.save();
            canvas.concat(G);
            Object obj;
            try
            {
                rf.a();
                obj = rf.a(s, t, android.graphics.Bitmap.Config.ARGB_8888);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((OutOfMemoryError) (obj)).printStackTrace();
                System.gc();
                System.gc();
                rf.a();
                obj = rf.a(s, t, android.graphics.Bitmap.Config.ARGB_8888);
            }
            if (obj == null)
            {
                throw new OutOfMemoryError("textItem setBitmap mTextTmp==null");
            }
            Canvas canvas1 = new Canvas(((Bitmap) (obj)));
            Matrix matrix = new Matrix();
            matrix.postScale(ba, ba);
            canvas1.concat(matrix);
            canvas1.setDrawFilter(aC);
            if (af != -21)
            {
                if (X == null)
                {
                    G();
                }
                aE.setAlpha(aj);
                canvas1.save();
                int j1;
                int l1;
                if (ag)
                {
                    if (aX)
                    {
                        int i1 = aj;
                        int k1 = ax;
                        aE.setShadowLayer(au, av, aw, i1 << 24 | k1 & 0xffffff);
                    } else
                    {
                        aE.setShadowLayer(au, av, aw, ax);
                    }
                } else
                {
                    aE.setShadowLayer(0.0F, av, aw, ax);
                }
                canvas1.translate(Z + ai + aa / 2.0F + aG / 4F, Y + ai);
                X.draw(canvas1);
                canvas1.restore();
            }
            aD.setAlpha(aj);
            canvas1.save();
            if (ag)
            {
                if (af == -21)
                {
                    if (aX)
                    {
                        j1 = aj;
                        l1 = ax;
                        aD.setShadowLayer(au, av, aw, j1 << 24 | l1 & 0xffffff);
                    } else
                    {
                        aD.setShadowLayer(au, av, aw, ax);
                    }
                } else
                {
                    aD.setShadowLayer(0.0F, av, aw, ax);
                }
            } else
            {
                aD.setShadowLayer(0.0F, av, aw, ax);
            }
            canvas1.translate(Z + ai + aa / 2.0F + aG / 4F, Y + ai);
            W.draw(canvas1);
            canvas1.restore();
            canvas.drawBitmap(((Bitmap) (obj)), 0.0F, 0.0F, null);
            canvas.translate(-10F, 0.0F);
            canvas.restore();
            if (f && az.q != 8)
            {
                if (U == null || U.isRecycled())
                {
                    h();
                }
                canvas.drawBitmap(U, b, null);
            }
            ((Bitmap) (obj)).recycle();
            b.mapPoints(o, n);
            if (a(o))
            {
                if (!B && e != null)
                {
                    C = true;
                    if (o != null)
                    {
                        D = (int)o[16];
                        E = (int)o[17];
                    }
                    B = true;
                }
                return;
            }
            B = false;
            C = false;
            return;
        } while (true);
    }

    public final void b(Typeface typeface)
    {
        if (J == typeface)
        {
            return;
        } else
        {
            J = typeface;
            M = a(typeface);
            typeface = aJ.edit();
            typeface.putInt("FREE_TEXT_FONT", M);
            typeface.apply();
            g();
            c(true);
            return;
        }
    }

    protected final void c(float f1)
    {
        float f2 = (float)c * f1;
        if (c > d)
        {
            f2 = (float)d * f1;
        }
        f1 = a(n[0], n[1], n[12], n[13]);
        float f3 = a(n[0], n[1], n[4], n[5]);
        int i1;
        int j1;
        if (f1 > f3)
        {
            f1 = f2 / f1;
        } else
        {
            f1 = f2 / f3;
        }
        i1 = (int)((float)c() + ai);
        j1 = (int)((float)d() + ai);
        h = h * f1;
        b.postScale(f1, f1, o[16], o[17]);
        G.postScale(f1, f1, o[16], o[17]);
        H.postScale(f1, f1, o[16], o[17]);
        c(true);
        j = j + ((float)i1 - ((float)c() + ai)) / 2.0F;
        k = k + ((float)j1 - ((float)d() + ai)) / 2.0F;
    }

    protected final void c(float f1, float f2)
    {
        f1 = (aF / 2.0F) * h + f1;
        super.b(f1, f2);
        G.postTranslate(f1, f2);
        H.postTranslate(f1, f2);
        I.postTranslate(f1, f2);
    }

    public final void c(int i1)
    {
        Typeface typeface = b(i1);
        if (J == typeface)
        {
            return;
        } else
        {
            b(typeface);
            return;
        }
    }

    public final void d(float f1)
    {
        if (!ag)
        {
            ag = true;
            android.content.SharedPreferences.Editor editor = aJ.edit();
            editor.putBoolean("free_text_show_shadow", true);
            editor.apply();
        }
        au = f1;
    }

    public final void d(float f1, float f2)
    {
        if (!ag)
        {
            ag = true;
            android.content.SharedPreferences.Editor editor = aJ.edit();
            editor.putBoolean("free_text_show_shadow", true);
            editor.apply();
        }
        av = f1;
        aw = f2;
    }

    public final void d(int i1)
    {
        if (i1 < 0 || i1 > 255)
        {
            return;
        } else
        {
            aj = i1;
            return;
        }
    }

    public final void e(float f1)
    {
        V = f1;
    }

    public final void e(float f1, float f2)
    {
        if (android.os.Build.VERSION.SDK_INT == 19 && Math.ceil(f1 * f2 * h) >= 15D)
        {
            ah = (float)Math.floor(f1 / f2);
            return;
        } else
        {
            ah = f1 * f2;
            return;
        }
    }

    public final void e(int i1)
    {
        if (ae == i1)
        {
            return;
        } else
        {
            ae = i1;
            android.content.SharedPreferences.Editor editor = aJ.edit();
            editor.putInt("FREE_TEXT_F_COLOR", i1);
            editor.apply();
            g();
            return;
        }
    }

    public final void f(float f1)
    {
        ah = f1;
        if (ah == 0.0F)
        {
            if (W != null)
            {
                af = -21;
            }
            return;
        }
        if (aE != null)
        {
            af = aJ.getInt("FREE_TEXT_S_COLOR", -1);
            if (af == -21)
            {
                af = -1;
            }
            aE.setStrokeWidth(2.0F * f1 * aW);
            aE.setColor(af);
            return;
        } else
        {
            G();
            return;
        }
    }

    public final void f(int i1)
    {
        if (af == i1)
        {
            return;
        } else
        {
            android.content.SharedPreferences.Editor editor = aJ.edit();
            editor.putInt("FREE_TEXT_S_COLOR", i1);
            editor.apply();
            af = i1;
            G();
            return;
        }
    }

    public final void g()
    {
        aD = new TextPaint();
        aD.setAntiAlias(true);
        aD.setColor(ae);
        aD.setTypeface(J);
        aD.setTextSize(ad * aH);
        aD.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        aG = aD.measureText("\u3002.");
        float f1;
        Object obj;
        if (bb)
        {
            f1 = (float)c - 2.0F * aG;
        } else
        {
            f1 = a(aD, ay.toString()) + aG;
        }
        aF = f1;
        if (K.equals(android.text.Layout.Alignment.ALIGN_NORMAL))
        {
            aa = aG;
        } else
        if (K.equals(android.text.Layout.Alignment.ALIGN_CENTER))
        {
            aa = 0.0F;
        } else
        if (K.equals(android.text.Layout.Alignment.ALIGN_OPPOSITE))
        {
            aa = -aG;
        }
        if (af != -21)
        {
            G();
        }
        if (bb)
        {
            obj = a(ay, aD, Math.round(aF), K);
        } else
        {
            obj = new StaticLayout(ay, aD, Math.round(aF), K, 1.0F, 0.0F, true);
        }
        W = ((Layout) (obj));
        H();
        com.roidapp.photogrid.common.b.a((new StringBuilder("mTextLayout:")).append(s).append("/").append(t).append("Max:").append(aF).toString());
    }

    public final void g(int i1)
    {
        if (!ag)
        {
            ag = true;
            android.content.SharedPreferences.Editor editor = aJ.edit();
            editor.putBoolean("free_text_show_shadow", true);
            editor.apply();
        }
        if (ax == i1)
        {
            return;
        } else
        {
            ax = i1;
            android.content.SharedPreferences.Editor editor1 = aJ.edit();
            editor1.putInt("free_text_shadow_color", i1);
            editor1.apply();
            return;
        }
    }

    public final void h()
    {
        if (az.q != 8 && (U == null || U.isRecycled()) && s > 0 && t > 0)
        {
            if (U == null && !ak)
            {
                H.postTranslate(ai, ai);
            }
            Bitmap bitmap = U;
            try
            {
                rf.a();
                U = rf.a(s, t, android.graphics.Bitmap.Config.ARGB_8888);
            }
            catch (OutOfMemoryError outofmemoryerror)
            {
                outofmemoryerror.printStackTrace();
                com.roidapp.photogrid.common.b.a((new StringBuilder("OOM:")).append(s).append("/").append(t).toString());
                System.gc();
                System.gc();
                Log.e("Text", "OOM, use ARGB_4444 to create again");
                try
                {
                    rf.a();
                    U = rf.a(s, t, android.graphics.Bitmap.Config.ARGB_4444);
                }
                catch (OutOfMemoryError outofmemoryerror1)
                {
                    U = null;
                }
            }
            if (U == null)
            {
                throw new OutOfMemoryError("mBorder==null  throw oom");
            }
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setColor(0xff3c64d5);
            Canvas canvas = new Canvas(U);
            canvas.drawRect(0.0F, 0.0F, s, t, paint);
            PorterDuffXfermode porterduffxfermode = new PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_OUT);
            paint.setColor(0xffffff);
            paint.setXfermode(porterduffxfermode);
            canvas.drawRect(ai, ai, (float)s - ai, (float)t - ai, paint);
            canvas.save();
            if (bitmap != null && !bitmap.isRecycled())
            {
                bitmap.recycle();
                return;
            }
        }
    }

    public final void i()
    {
        g();
    }

    public final void j()
    {
        c(false);
    }

    public final void k()
    {
        b(true);
    }

    public final void l()
    {
        b(true);
    }

    public final int m()
    {
        return P;
    }

    public final int[] n()
    {
        return (new int[] {
            Q, R
        });
    }

    public final int o()
    {
        return M;
    }

    public final android.text.Layout.Alignment p()
    {
        return K;
    }

    public final int q()
    {
        return aj;
    }

    public final String r()
    {
        return ay.toString();
    }

    public final int s()
    {
        return ae;
    }

    public final int t()
    {
        return af;
    }

    public final void u()
    {
        if (W != null)
        {
            af = -21;
            android.content.SharedPreferences.Editor editor = aJ.edit();
            editor.putInt("FREE_TEXT_S_COLOR", -21);
            editor.apply();
        }
    }

    public final void v()
    {
        if (W != null)
        {
            ag = false;
            android.content.SharedPreferences.Editor editor = aJ.edit();
            editor.putBoolean("free_text_show_shadow", false);
            editor.apply();
        }
    }

    public final boolean w()
    {
        return ag;
    }

    public final void x()
    {
        P = 2;
        android.content.SharedPreferences.Editor editor = aJ.edit();
        editor.putInt("REE_TEXT_BG_COLOR", P);
        editor.apply();
    }

    public final float y()
    {
        return V;
    }

    public final float z()
    {
        return ah;
    }
}

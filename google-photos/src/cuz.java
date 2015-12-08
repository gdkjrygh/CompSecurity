// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.Log;
import android.util.SparseArray;
import java.util.Iterator;
import java.util.List;

public class cuz
    implements cuu
{

    private static final String a = cuz.getSimpleName();
    private static final RectF b = new RectF(0.0F, 0.0F, 1.0F, 1.0F);
    private cij A;
    private ctu B;
    private ctu C;
    private cin D;
    private cin E;
    private cin F;
    private cin G;
    private SparseArray H;
    private int I;
    private int J;
    private String K;
    private cay L;
    private final Context c;
    private final chq d;
    private final Resources e;
    private final AssetManager f;
    private final android.graphics.BitmapFactory.Options g = new android.graphics.BitmapFactory.Options();
    private final ddx h;
    private final ddx i;
    private final Matrix j[] = new Matrix[4];
    private final Matrix k = new Matrix();
    private final cay l = (new cbh()).a();
    private final deo m;
    private final deo n;
    private cin o;
    private cin p;
    private cin q;
    private cij r;
    private cij s;
    private cij t;
    private cij u;
    private cij v;
    private cij w;
    private cij x;
    private cij y;
    private cij z;

    public cuz(Context context, chq chq1)
    {
        c = (Context)b.a(context, "context", null);
        d = (chq)b.a(chq1, "renderContext", null);
        e = context.getResources();
        f = context.getAssets();
        g.inScaled = false;
        m = new deo(a);
        n = new deo(a);
        context = new Matrix[20];
        for (int i1 = 0; i1 < 20; i1++)
        {
            context[i1] = new Matrix();
        }

        h = new ddx(context);
        context = new cho[4];
        for (int j1 = 0; j1 < 4; j1++)
        {
            context[j1] = new cho();
        }

        i = new ddx(context);
    }

    private Matrix a(float af[])
    {
        Matrix matrix = (Matrix)h.a();
        ddl.a(matrix, af);
        return matrix;
    }

    static cay a(cuz cuz1, cay cay1, cba cba1)
    {
        if (cba1.i != cnt.c) goto _L2; else goto _L1
_L1:
        if (!b.e(cba1)) goto _L4; else goto _L3
_L3:
        cay1 = cay1.b(cuz1.f, cuz1.e);
_L6:
        return cay1;
_L4:
        return cay1.a();
_L2:
        if (b.e(cba1))
        {
            return cay1.a(cuz1.f, cuz1.e);
        }
        if (cba1.i == cnt.d)
        {
            return cay1.b();
        }
        if (cba1.i == cnt.e)
        {
            return cuz1.l;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private cin a(int i1)
    {
        cin cin2 = (cin)H.get(i1);
        cin cin1 = cin2;
        if (cin2 == null)
        {
            if (i1 != 0)
            {
                Bitmap bitmap = BitmapFactory.decodeResource(e, i1, g);
                cin1 = d.a(bitmap, 1);
                bitmap.recycle();
            } else
            {
                cin1 = d.c();
            }
            H.put(i1, cin1);
        }
        return cin1;
    }

    private void a(cay cay1, cba cba1)
    {
        int i1 = cay1.f(cba1);
        float f1 = cay1.h(cba1);
        if (i1 != 0 && f1 > 0.0F)
        {
            a(a(i1), cay1.g(cba1), f1, cay1.i(cba1));
        }
        i1 = cay1.j(cba1);
        f1 = cay1.l(cba1);
        if (i1 != 0 && f1 > 0.0F)
        {
            a(a(i1), cay1.k(cba1), f1, cay1.m(cba1));
        }
        i1 = cay1.n(cba1);
        f1 = cay1.p(cba1);
        boolean flag = b.e(cba1);
        if (f1 > 0.0F && (flag || i1 != 0))
        {
            cin cin1;
            if (flag)
            {
                cin1 = b(cay1, cba1);
            } else
            {
                cin1 = a(i1);
            }
            a(cin1, cay1.o(cba1), f1, cay1.q(cba1));
        }
    }

    private void a(chy chy1, cin cin1, float f1)
    {
        cie cie1 = cie.a(y);
        cie1.a("postaddition", f1, false);
        if (chy1.f())
        {
            chi.a(chy1, cin1, ddl.c, 0, cie1);
            return;
        } else
        {
            chi.a(chy1, cin1, cie1);
            return;
        }
    }

    private void a(cie cie1, int i1, int j1, cay cay1, cba cba1, cpy cpy1, cij cij)
    {
        cba1.u = (float)i1 / (float)j1;
        cpy1 = cay1.a(cba1, cpy1);
        k.postConcat(cpy1);
        Object obj = (Matrix)h.a();
        cay1.x(cba1).invert(((Matrix) (obj)));
        ((Matrix) (obj)).preConcat(cpy1);
        cie1.a("primary_crop", ((Matrix) (obj)), true).a("primary_transform", cpy1, false);
        h.a(obj);
        j1 = cay1.e(cba1);
        boolean flag;
        if (j1 != 0)
        {
            obj = a(j1);
        } else
        {
            obj = null;
        }
        flag = cay1.a(cba1);
        if (flag)
        {
            cpy1 = cay1.c(cba1);
        } else
        {
            cpy1 = ddl.a;
        }
        if (cij == t)
        {
            Matrix matrix;
            Matrix matrix1;
            if (flag)
            {
                cij = cay1.d(cba1);
            } else
            {
                cij = ddl.a;
            }
            matrix = cay1.b(cba1);
            matrix1 = (Matrix)h.a();
            cay1.y(cba1).invert(matrix1);
            matrix1.preConcat(matrix);
            cie1.a("secondary_bkgd_transform", cij, false).a("secondary_crop", matrix1, false).a("secondary_transform", matrix, false).a("secondary_opacity", cay1.w(cba1), false);
            h.a(matrix1);
        }
        if (obj != null)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        cie1 = cie1.a("lut_is_active", i1, false).a("sampler_lut", a(j1)).a("barrel_distortion_amount", cay1.t(cba1), true);
        cay1 = cay1.h();
        cie1.b();
        cba1 = cie1.a("padding_color", true);
        if (cba1 != null)
        {
            cie1.a(cba1.intValue(), 1, cay1.length);
            cij = cie.a.a(cay1.length);
            System.arraycopy(cay1, 0, cij, 0, cij.length);
            cie1.b[cba1.intValue()] = cij;
        }
        if (flag)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        cie1.a("use_blurred_background", i1, true).a("primary_bkgd_transform", cpy1, true);
    }

    private void a(cin cin1, Matrix matrix, float f1, int i1)
    {
        cij cij = null;
        cvb.a[i1 - 1];
        JVM INSTR tableswitch 1 5: default 44
    //                   1 134
    //                   2 147
    //                   3 160
    //                   4 173
    //                   5 185;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        byte byte0 = 0;
_L10:
        Matrix matrix1;
        matrix1 = (Matrix)h.a();
        matrix1.set(matrix);
        matrix1.postConcat(ddl.b);
        matrix = cie.a(cij);
        cvb.a[i1 - 1];
        JVM INSTR tableswitch 1 5: default 124
    //                   1 197
    //                   2 197
    //                   3 197
    //                   4 218
    //                   5 218;
           goto _L7 _L8 _L8 _L8 _L9 _L9
_L7:
        break; /* Loop/switch isn't completed */
_L9:
        break MISSING_BLOCK_LABEL_218;
_L11:
        h.a(matrix1);
        return;
_L2:
        cij = v;
        byte0 = 10;
          goto _L10
_L3:
        cij = v;
        byte0 = 11;
          goto _L10
_L4:
        cij = v;
        byte0 = 12;
          goto _L10
_L5:
        cij = w;
        byte0 = 0;
          goto _L10
_L6:
        cij = x;
        byte0 = 0;
          goto _L10
_L8:
        chi.a(F, cin1, cin1, ddl.a, matrix1, f1, byte0, matrix);
          goto _L11
        cin cin2 = F;
        if (F == D)
        {
            F = E;
        } else
        {
            F = D;
        }
        chi.a(F, cin2, cin1, ddl.a, matrix1, f1, 0, matrix);
          goto _L11
    }

    private void a(cin cin1, Matrix matrix, chy chy1)
    {
        cij cij;
        if (cin1.b())
        {
            cij = r;
        } else
        {
            cij = z;
        }
        chi.a(chy1, cin1, matrix, cij);
    }

    private void a(cin cin1, Matrix matrix, chy chy1, ctu ctu1, float f1, boolean flag)
    {
        a(cin1, matrix, ((chy) (D)));
        if (flag)
        {
            ctu1.a(D, ctu1.b, chy1, f1);
            return;
        } else
        {
            ctu1.a(D, ctu1.c, chy1, f1);
            return;
        }
    }

    static void a(cuz cuz1, chy chy1)
    {
        if (cuz1.I != chy1.d() || cuz1.J != chy1.e())
        {
            cuz1 = String.format("Render sink dimensions changed without calling setNewSize. Got (%s, %s), expected (%s, %s)", new Object[] {
                Integer.valueOf(chy1.d()), Integer.valueOf(chy1.e()), Integer.valueOf(cuz1.I), Integer.valueOf(cuz1.J)
            });
            Log.w(a, cuz1);
        }
    }

    static void a(cuz cuz1, cux cux1, chp chp1, long l1, cay cay1, cba cba1)
    {
        if (cay1.d())
        {
            cuz1.F = cuz1.D;
            chl.a(cuz1.F, cay1.e());
            for (int i1 = 0; i1 < cux1.a.size(); i1++)
            {
                cpy cpy1 = (cpy)cux1.a.get(i1);
                cuz1.k.set(cuz1.j[i1]);
                cie cie2 = cie.a(cuz1.u);
                cho cho1 = (cho)cuz1.i.a();
                cay1.a(cpy1, cba1, cho1);
                cie2.b();
                Integer integer = cie2.a("quad_transform", false);
                if (integer != null)
                {
                    cie2.a(integer.intValue(), 1, 16);
                    float af[] = cie.a.a(16);
                    for (int k1 = 0; k1 < cho1.a.length; k1++)
                    {
                        af[k1] = cho1.a[k1];
                    }

                    cie2.b[integer.intValue()] = af;
                }
                cuz1.a(cie2, chp1.d(), chp1.e(), cay1, cba1, cpy1, cuz1.s);
                cuz1.n.b("Setup effect and primary color correction");
                cuz1.a(cpy1.a.c, cuz1.j[i1], ((chy) (cuz1.o)));
                cuz1.n.b("Copy external texture");
                cie2.a("sampler_primary_frame", cuz1.o);
                chi.a(cuz1.F, 0, cie2);
                cuz1.i.a(cho1);
            }

            cuz1.n.b("Image shader processing");
            cuz1.a(cay1, cba1);
            cuz1.a(((chy) (chp1)), cuz1.F, cay1.v(cba1));
            chp1.a(l1);
            cuz1.n.b("Render into video sink");
            return;
        }
        if (cux1.a.size() == 1)
        {
            cux1 = (cpy)cux1.a.get(0);
            Matrix matrix = cuz1.j[0];
            ciy ciy1 = ((cpy) (cux1)).a;
            cuz1.k.set(matrix);
            cie cie1 = cie.a(cuz1.s);
            cuz1.a(cie1, chp1.d(), chp1.e(), cay1, cba1, null, cuz1.s);
            cuz1.n.b("Setup effect and primary color correction");
            float f1;
            if (b.e(cba1))
            {
                cux1 = cuz1.C;
                cux1.a(cay1.a(cuz1.f, cuz1.e).E_());
                f1 = cay1.a(cuz1.f, cuz1.e).u(cba1);
            } else
            {
                cux1 = cuz1.B;
                cux1.a(cay1.E_());
                f1 = cay1.u(cba1);
            }
            if (((ctu) (cux1)).a == car.a)
            {
                cuz1.a(ciy1.c, matrix, ((chy) (cuz1.o)));
                cuz1.n.b("Copy external texture");
                cux1 = cuz1.G;
            } else
            {
                cuz1.a(ciy1.c, matrix, ((chy) (cuz1.o)), ((ctu) (cux1)), f1, true);
                cux1 = ((ctu) (cux1)).b;
                cuz1.n.b("Copy external texture and apply blur");
            }
            cie1.a("sampler_primary_frame", cuz1.o).a("sampler_primary_blurred_source", cux1);
            cuz1.F = cuz1.D;
            chi.a(cuz1.F, 0, cie1);
            cuz1.n.b("Image shader processing");
            cuz1.a(cay1, cba1);
            cuz1.a(((chy) (chp1)), cuz1.F, cay1.v(cba1));
            chp1.a(l1);
            cuz1.n.b("Render into video sink");
            return;
        }
        if (cux1.a.size() == 2 && cux1.b)
        {
            Object obj1 = (cpy)cux1.a.get(0);
            cux1 = (cpy)cux1.a.get(1);
            Object obj = cuz1.j[0];
            Matrix matrix1 = cuz1.j[1];
            ciy ciy3 = ((cpy) (obj1)).a;
            ciy ciy2 = ((cpy) (cux1)).a;
            cuz1.k.set(((Matrix) (obj)));
            obj1 = cie.a(cuz1.t);
            cuz1.a(((cie) (obj1)), chp1.d(), chp1.e(), cay1, cba1, null, cuz1.t);
            cuz1.n.b("Setup effect and color correction");
            float f2;
            if (b.e(cba1))
            {
                cux1 = cuz1.C;
                cuz1.C.a(cay1.a(cuz1.f, cuz1.e).E_());
                f2 = cay1.a(cuz1.f, cuz1.e).u(cba1);
            } else
            {
                cux1 = cuz1.B;
                cuz1.B.a(cay1.E_());
                f2 = cay1.u(cba1);
            }
            if (((ctu) (cux1)).a == car.a)
            {
                cuz1.a(ciy3.c, ((Matrix) (obj)), ((chy) (cuz1.o)));
                obj = cuz1.G;
                cuz1.n.b("Copy primary external texture");
                cuz1.a(ciy2.c, matrix1, ((chy) (cuz1.p)));
                cux1 = cuz1.G;
                cuz1.n.b("Copy secondary external texture");
            } else
            {
                cuz1.a(ciy3.c, ((Matrix) (obj)), ((chy) (cuz1.o)), ((ctu) (cux1)), f2, true);
                obj = ((ctu) (cux1)).b;
                cuz1.n.b("Copy primary external texture and apply blur");
                cuz1.a(ciy2.c, matrix1, ((chy) (cuz1.p)), ((ctu) (cux1)), f2, false);
                cux1 = ((ctu) (cux1)).c;
                cuz1.n.b("Copy secondary external texture and apply blur");
            }
            ((cie) (obj1)).a("sampler_primary_frame", cuz1.o).a("sampler_primary_blurred_source", ((cin) (obj))).a("sampler_secondary_frame", cuz1.p).a("sampler_secondary_blurred_source", cux1);
            cuz1.F = cuz1.D;
            chi.a(cuz1.F, 0, ((cie) (obj1)));
            cuz1.n.b("Image shader processing");
            cuz1.a(cay1, cba1);
            cuz1.a(((chy) (chp1)), cuz1.F, cay1.v(cba1));
            chp1.a(l1);
            cuz1.n.b("Render into video sink");
            return;
        } else
        {
            int j1 = cux1.a.size();
            throw b.a((new StringBuilder(55)).append("too many quads for non-composite rendering: ").append(j1).toString());
        }
    }

    static boolean a(cba cba1, cay cay1)
    {
        if (cay1 != null && cba1.f == cba1.g)
        {
            int i1 = cay1.r(cba1);
            long l1 = cba1.b;
            long l2 = cba1.c;
            if (i1 > 0 && l1 - l2 < (long)(0xf4240 / i1))
            {
                return true;
            }
        }
        cba1.c = cba1.b;
        cba1.g = cba1.f;
        return false;
    }

    private cin b(cay cay1, cba cba1)
    {
        if (!b.e(cba1.p, K) || cay1 != L)
        {
            dee.a(q);
            K = cba1.p;
            L = cay1;
            try
            {
                cay1 = cay1.a(c, cba1, F.d(), F.e());
            }
            // Misplaced declaration of an exception variable
            catch (cay cay1)
            {
                Log.e(a, "Failed to render title", cay1);
                cay1 = null;
            }
            if (cay1 != null)
            {
                cay1 = d.a(cay1, 0);
            } else
            {
                cay1 = d.c();
            }
            q = cay1;
        }
        return q;
    }

    public final void a()
    {
        for (int i1 = 0; i1 < H.size(); i1++)
        {
            dee.a((ded)H.valueAt(i1));
        }

        H.clear();
        H = null;
        dee.a(q);
        dee.a(G);
        dee.a(o);
        dee.a(p);
        dee.a(D);
        dee.a(E);
        dee.a(B);
        dee.a(C);
        r = null;
        s = null;
        t = null;
        u = null;
        v = null;
        w = null;
        x = null;
        y = null;
        z = null;
        A = null;
    }

    public final void a(int i1, int j1)
    {
        b.a(i1, "width");
        b.a(j1, "height");
        if (i1 == I && j1 == J)
        {
            return;
        } else
        {
            dee.a(o);
            dee.a(p);
            o = d.b(i1, j1);
            p = d.b(i1, j1);
            dee.a(D);
            D = d.b(i1, j1);
            dee.a(E);
            E = d.b(i1, j1);
            B.a(i1, j1);
            C.a(i1, j1);
            K = null;
            I = i1;
            J = j1;
            return;
        }
    }

    public final void a(RectF rectf)
    {
        k.mapRect(rectf, b);
        rectf.set(rectf.left, 1.0F - rectf.bottom, rectf.right, 1.0F - rectf.top);
    }

    public final void a(cay cay1)
    {
        for (cay1 = ((cay)b.a(cay1, "effect", null)).D_().iterator(); cay1.hasNext(); a(((Integer)cay1.next()).intValue())) { }
    }

    public final void a(cux cux1, chp chp1, long l1, cay cay1, cba cba1)
    {
        b.a(cay1, "effect", null);
        deo deo1 = n;
        int i1 = cux1.a.size();
        deo1.a((new StringBuilder(37)).append("renderFrame() with ").append(i1).append(" frames").toString());
        for (i1 = 0; i1 < cux1.a.size(); i1++)
        {
            Object obj = (cpy)cux1.a.get(i1);
            j[i1] = (Matrix)h.a();
            Matrix matrix = a(((cpy) (obj)).a.d);
            obj = a(((cpy) (obj)).b.c);
            j[i1].set(((Matrix) (obj)));
            j[i1].postConcat(matrix);
            h.a(obj);
            h.a(matrix);
        }

        n.b("Populate stabilized matrices");
        try
        {
            chp1.a(new cva(this, chp1, cay1, cba1, cux1, l1));
        }
        // Misplaced declaration of an exception variable
        catch (chp chp1)
        {
            Log.w(a, "exception while rendering", chp1);
        }
        for (i1 = 0; i1 < cux1.a.size(); i1++)
        {
            h.a(j[i1]);
        }

        if (m.a)
        {
            m.b("render");
            m.a(false);
        }
        m.a("Frames");
        n.a(false);
    }

    public final void b()
    {
        c.b(H, "mDrawableSourceCache", null);
        H = new SparseArray();
        cid cid1 = d.i;
        b.a(cid1, "shaderCache", null);
        r = cid1.a(b.ia, b.hM);
        s = cid1.a(b.ic, b.hP);
        t = cid1.a(b.id, b.hQ);
        u = cid1.a(b.ib, b.hO);
        v = cid1.a(b.ie, b.hU);
        w = cid1.a(b.ie, b.hR);
        x = cid1.a(b.ie, b.hS);
        y = cid1.a(b.ia, b.hL);
        A = cid1.a(b.ie, b.hT);
        z = cid1.a(b.ia, b.hN);
        B = new ctu(d, A, z);
        C = new ctu(d, A, z);
        q = d.c();
        G = d.c();
        I = -1;
        J = -1;
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.caverock.androidsvg;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.RectF;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.xml.sax.SAXException;

// Referenced classes of package com.caverock.androidsvg:
//            SVGParseException, SVGParser, b, c, 
//            PreserveAspectRatio

public class SVG
{

    protected static final long A = 0x2000000L;
    protected static final long B = 0x4000000L;
    protected static final long C = 0x8000000L;
    protected static final long D = 0x10000000L;
    protected static final long E = 0x20000000L;
    protected static final long F = 0x40000000L;
    protected static final long G = 0x80000000L;
    protected static final long H = 0x100000000L;
    protected static final long I = 0x200000000L;
    protected static final long J = 0x400000000L;
    protected static final long K = 0x800000000L;
    protected static final long L = 0x1000000000L;
    protected static final long M = -1L;
    protected static final long N = 0xfdd180800L;
    private static final String O = "AndroidSVG";
    private static final String P = "1.2.1";
    private static final int Q = 512;
    private static final int R = 512;
    private static final double S = 1.4142135623730949D;
    private static final List T = new ArrayList(0);
    protected static final String a = "1.2";
    protected static final long b = 1L;
    protected static final long c = 2L;
    protected static final long d = 4L;
    protected static final long e = 8L;
    protected static final long f = 16L;
    protected static final long g = 32L;
    protected static final long h = 64L;
    protected static final long i = 128L;
    protected static final long j = 256L;
    protected static final long k = 512L;
    protected static final long l = 1024L;
    protected static final long m = 2048L;
    protected static final long n = 4096L;
    protected static final long o = 8192L;
    protected static final long p = 16384L;
    protected static final long q = 32768L;
    protected static final long r = 0x10000L;
    protected static final long s = 0x20000L;
    protected static final long t = 0x40000L;
    protected static final long u = 0x80000L;
    protected static final long v = 0x100000L;
    protected static final long w = 0x200000L;
    protected static final long x = 0x400000L;
    protected static final long y = 0x800000L;
    protected static final long z = 0x1000000L;
    private ac U;
    private String V;
    private String W;
    private c X;
    private float Y;
    private CSSParser.d Z;

    protected SVG()
    {
        U = null;
        V = "";
        W = "";
        X = null;
        Y = 96F;
        Z = new CSSParser.d();
    }

    private ai a(ag ag1, String s1)
    {
    /* block-local class not found */
    class ai {}

        Object obj = (ai)ag1;
        if (s1.equals(((ai) (obj)).p))
        {
            return ((ai) (obj));
        }
    /* block-local class not found */
    class ag {}

        ag1 = ag1.a().iterator();
        do
        {
            do
            {
                do
                {
                    if (!ag1.hasNext())
                    {
                        return null;
                    }
    /* block-local class not found */
    class ak {}

                    obj = (ak)ag1.next();
                } while (!(obj instanceof ai));
                ai ai1 = (ai)obj;
                if (s1.equals(ai1.p))
                {
                    return ai1;
                }
            } while (!(obj instanceof ag));
            obj = a((ag)obj, s1);
        } while (obj == null);
        return ((ai) (obj));
    }

    public static SVG a(Context context, int i1)
        throws SVGParseException
    {
        return a(context.getResources(), i1);
    }

    public static SVG a(AssetManager assetmanager, String s1)
        throws SVGParseException, IOException
    {
        SVGParser svgparser = new SVGParser();
        assetmanager = assetmanager.open(s1);
        s1 = svgparser.a(assetmanager);
        assetmanager.close();
        return s1;
    }

    public static SVG a(Resources resources, int i1)
        throws SVGParseException
    {
        return (new SVGParser()).a(resources.openRawResource(i1));
    }

    public static SVG a(InputStream inputstream)
        throws SVGParseException
    {
        return (new SVGParser()).a(inputstream);
    }

    public static SVG a(String s1)
        throws SVGParseException
    {
        return (new SVGParser()).a(new ByteArrayInputStream(s1.getBytes()));
    }

    private List a(ag ag1, Class class1)
    {
        ArrayList arraylist = new ArrayList();
        if (ag1.getClass() == class1)
        {
            arraylist.add((ak)ag1);
        }
        ag1 = ag1.a().iterator();
        do
        {
            ak ak1;
            do
            {
                if (!ag1.hasNext())
                {
                    return arraylist;
                }
                ak1 = (ak)ag1.next();
                if (ak1.getClass() == class1)
                {
                    arraylist.add(ak1);
                }
            } while (!(ak1 instanceof ag));
            a((ag)ak1, class1);
        } while (true);
    }

    public static String c()
    {
        return "1.2.1";
    }

    private a d(float f1)
    {
    /* block-local class not found */
    class ac {}

        n n1 = U.c;
        n n2 = U.d;
    /* block-local class not found */
    class Unit {}

    /* block-local class not found */
    class a {}

    /* block-local class not found */
    class n {}

        if (n1 == null || n1.b() || n1.b == Unit.i || n1.b == Unit.b || n1.b == Unit.c)
        {
            return new a(-1F, -1F, -1F, -1F);
        }
        float f2 = n1.a(f1);
        if (n2 != null)
        {
            if (n2.b() || n2.b == Unit.i || n2.b == Unit.b || n2.b == Unit.c)
            {
                return new a(-1F, -1F, -1F, -1F);
            }
            f1 = n2.a(f1);
        } else
        if (U.x != null)
        {
            f1 = (U.x.d * f2) / U.x.c;
        } else
        {
            f1 = f2;
        }
        return new a(0.0F, 0.0F, f2, f1);
    }

    static List q()
    {
        return T;
    }

    public float a()
    {
        return Y;
    }

    public Picture a(int i1, int j1)
    {
        Picture picture = new Picture();
        (new b(picture.beginRecording(i1, j1), new a(0.0F, 0.0F, i1, j1), Y)).a(this, null, null, false);
        picture.endRecording();
        return picture;
    }

    public Picture a(String s1, int i1, int j1)
    {
        s1 = g(s1);
        if (s1 == null)
        {
            return null;
        }
    /* block-local class not found */
    class bb {}

        if (!(s1 instanceof bb))
        {
            return null;
        }
        s1 = (bb)s1;
        if (((bb) (s1)).x == null)
        {
            Log.w("AndroidSVG", "View element is missing a viewBox attribute.");
            return null;
        } else
        {
            Picture picture = new Picture();
            (new b(picture.beginRecording(i1, j1), new a(0.0F, 0.0F, i1, j1), Y)).a(this, ((bb) (s1)).x, ((bb) (s1)).w, false);
            picture.endRecording();
            return picture;
        }
    }

    protected List a(Class class1)
    {
        return a(((ag) (U)), class1);
    }

    public void a(float f1)
    {
        Y = f1;
    }

    public void a(float f1, float f2, float f3, float f4)
    {
        if (U == null)
        {
            throw new IllegalArgumentException("SVG document is empty");
        } else
        {
            U.x = new a(f1, f2, f3, f4);
            return;
        }
    }

    public void a(Canvas canvas)
    {
        a(canvas, ((RectF) (null)));
    }

    public void a(Canvas canvas, RectF rectf)
    {
        if (rectf != null)
        {
            rectf = a.a(rectf.left, rectf.top, rectf.right, rectf.bottom);
        } else
        {
            rectf = new a(0.0F, 0.0F, canvas.getWidth(), canvas.getHeight());
        }
        (new b(canvas, rectf, Y)).a(this, null, null, true);
    }

    protected void a(CSSParser.d d1)
    {
        Z.a(d1);
    }

    public void a(PreserveAspectRatio preserveaspectratio)
    {
        if (U == null)
        {
            throw new IllegalArgumentException("SVG document is empty");
        } else
        {
            U.w = preserveaspectratio;
            return;
        }
    }

    protected void a(ac ac1)
    {
        U = ac1;
    }

    public void a(c c1)
    {
        X = c1;
    }

    public void a(String s1, Canvas canvas)
    {
        a(s1, canvas, ((RectF) (null)));
    }

    public void a(String s1, Canvas canvas, RectF rectf)
    {
        for (s1 = g(s1); s1 == null || !(s1 instanceof bb);)
        {
            return;
        }

        bb bb1 = (bb)s1;
        if (bb1.x == null)
        {
            Log.w("AndroidSVG", "View element is missing a viewBox attribute.");
            return;
        }
        if (rectf != null)
        {
            s1 = a.a(rectf.left, rectf.top, rectf.right, rectf.bottom);
        } else
        {
            s1 = new a(0.0F, 0.0F, canvas.getWidth(), canvas.getHeight());
        }
        (new b(canvas, s1, Y)).a(this, bb1.x, bb1.w, true);
    }

    public Picture b()
    {
        Object obj = U.c;
        if (obj != null)
        {
            float f2 = ((n) (obj)).a(Y);
            obj = U.x;
            float f1;
            if (obj != null)
            {
                f1 = (((a) (obj)).d * f2) / ((a) (obj)).c;
            } else
            {
                n n1 = U.d;
                if (n1 != null)
                {
                    f1 = n1.a(Y);
                } else
                {
                    f1 = f2;
                }
            }
            return a((int)Math.ceil(f2), (int)Math.ceil(f1));
        } else
        {
            return a(512, 512);
        }
    }

    public void b(float f1)
    {
        if (U == null)
        {
            throw new IllegalArgumentException("SVG document is empty");
        } else
        {
            U.c = new n(f1);
            return;
        }
    }

    public void b(String s1)
        throws SVGParseException
    {
        if (U == null)
        {
            throw new IllegalArgumentException("SVG document is empty");
        }
        try
        {
            U.c = SVGParser.a(s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw new SVGParseException(s1.getMessage());
        }
    }

    public void c(float f1)
    {
        if (U == null)
        {
            throw new IllegalArgumentException("SVG document is empty");
        } else
        {
            U.d = new n(f1);
            return;
        }
    }

    public void c(String s1)
        throws SVGParseException
    {
        if (U == null)
        {
            throw new IllegalArgumentException("SVG document is empty");
        }
        try
        {
            U.d = SVGParser.a(s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw new SVGParseException(s1.getMessage());
        }
    }

    protected ak d(String s1)
    {
        while (s1 == null || s1.length() <= 1 || !s1.startsWith("#")) 
        {
            return null;
        }
        return g(s1.substring(1));
    }

    public String d()
    {
        if (U == null)
        {
            throw new IllegalArgumentException("SVG document is empty");
        } else
        {
            return V;
        }
    }

    public String e()
    {
        if (U == null)
        {
            throw new IllegalArgumentException("SVG document is empty");
        } else
        {
            return W;
        }
    }

    protected void e(String s1)
    {
        V = s1;
    }

    public String f()
    {
        if (U == null)
        {
            throw new IllegalArgumentException("SVG document is empty");
        } else
        {
            return U.e;
        }
    }

    protected void f(String s1)
    {
        W = s1;
    }

    protected ak g(String s1)
    {
        if (s1.equals(U.p))
        {
            return U;
        } else
        {
            return a(U, s1);
        }
    }

    public Set g()
    {
        if (U == null)
        {
            throw new IllegalArgumentException("SVG document is empty");
        }
        Object obj = a(com/caverock/androidsvg/SVG$bb);
        HashSet hashset = new HashSet(((List) (obj)).size());
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                return hashset;
            }
            bb bb1 = (bb)(ak)((Iterator) (obj)).next();
            if (bb1.p != null)
            {
                hashset.add(bb1.p);
            } else
            {
                Log.w("AndroidSVG", "getViewList(): found a <view> without an id attribute");
            }
        } while (true);
    }

    public float h()
    {
        if (U == null)
        {
            throw new IllegalArgumentException("SVG document is empty");
        } else
        {
            return d(Y).c;
        }
    }

    public float i()
    {
        if (U == null)
        {
            throw new IllegalArgumentException("SVG document is empty");
        } else
        {
            return d(Y).d;
        }
    }

    public RectF j()
    {
        if (U == null)
        {
            throw new IllegalArgumentException("SVG document is empty");
        }
        if (U.x == null)
        {
            return null;
        } else
        {
            return U.x.a();
        }
    }

    public PreserveAspectRatio k()
    {
        if (U == null)
        {
            throw new IllegalArgumentException("SVG document is empty");
        }
        if (U.w == null)
        {
            return null;
        } else
        {
            return U.w;
        }
    }

    public float l()
    {
        n n1;
        n n2;
        if (U == null)
        {
            throw new IllegalArgumentException("SVG document is empty");
        }
        n1 = U.c;
        n2 = U.d;
        if (n1 == null || n2 == null || n1.b == Unit.i || n2.b == Unit.i) goto _L2; else goto _L1
_L1:
        if (!n1.b() && !n2.b()) goto _L4; else goto _L3
_L3:
        return -1F;
_L4:
        return n1.a(Y) / n2.a(Y);
_L2:
        if (U.x != null && U.x.c != 0.0F && U.x.d != 0.0F)
        {
            return U.x.c / U.x.d;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    protected ac m()
    {
        return U;
    }

    protected List n()
    {
        return Z.a();
    }

    protected boolean o()
    {
        return !Z.b();
    }

    protected c p()
    {
        return X;
    }


    // Unreferenced inner class com/caverock/androidsvg/SVG$GradientSpread
    /* block-local class not found */
    class GradientSpread {}


    // Unreferenced inner class com/caverock/androidsvg/SVG$Style
    /* block-local class not found */
    class Style {}


    // Unreferenced inner class com/caverock/androidsvg/SVG$aa
    /* block-local class not found */
    class aa {}


    // Unreferenced inner class com/caverock/androidsvg/SVG$ab
    /* block-local class not found */
    class ab {}


    // Unreferenced inner class com/caverock/androidsvg/SVG$ad
    /* block-local class not found */
    class ad {}


    // Unreferenced inner class com/caverock/androidsvg/SVG$ae
    /* block-local class not found */
    class ae {}


    // Unreferenced inner class com/caverock/androidsvg/SVG$af
    /* block-local class not found */
    class af {}


    // Unreferenced inner class com/caverock/androidsvg/SVG$ah
    /* block-local class not found */
    class ah {}


    // Unreferenced inner class com/caverock/androidsvg/SVG$aj
    /* block-local class not found */
    class aj {}


    // Unreferenced inner class com/caverock/androidsvg/SVG$al
    /* block-local class not found */
    class al {}


    // Unreferenced inner class com/caverock/androidsvg/SVG$am
    /* block-local class not found */
    class am {}


    // Unreferenced inner class com/caverock/androidsvg/SVG$an
    /* block-local class not found */
    class an {}


    // Unreferenced inner class com/caverock/androidsvg/SVG$ao
    /* block-local class not found */
    class ao {}


    // Unreferenced inner class com/caverock/androidsvg/SVG$ap
    /* block-local class not found */
    class ap {}


    // Unreferenced inner class com/caverock/androidsvg/SVG$aq
    /* block-local class not found */
    class aq {}


    // Unreferenced inner class com/caverock/androidsvg/SVG$ar
    /* block-local class not found */
    class ar {}


    // Unreferenced inner class com/caverock/androidsvg/SVG$as
    /* block-local class not found */
    class as {}


    // Unreferenced inner class com/caverock/androidsvg/SVG$at
    /* block-local class not found */
    class at {}


    // Unreferenced inner class com/caverock/androidsvg/SVG$au
    /* block-local class not found */
    class au {}


    // Unreferenced inner class com/caverock/androidsvg/SVG$av
    /* block-local class not found */
    class av {}


    // Unreferenced inner class com/caverock/androidsvg/SVG$aw
    /* block-local class not found */
    class aw {}


    // Unreferenced inner class com/caverock/androidsvg/SVG$ax
    /* block-local class not found */
    class ax {}


    // Unreferenced inner class com/caverock/androidsvg/SVG$ay
    /* block-local class not found */
    class ay {}


    // Unreferenced inner class com/caverock/androidsvg/SVG$az
    /* block-local class not found */
    class az {}


    // Unreferenced inner class com/caverock/androidsvg/SVG$b
    /* block-local class not found */
    class b {}


    // Unreferenced inner class com/caverock/androidsvg/SVG$ba
    /* block-local class not found */
    class ba {}


    // Unreferenced inner class com/caverock/androidsvg/SVG$c
    /* block-local class not found */
    class c {}


    // Unreferenced inner class com/caverock/androidsvg/SVG$d
    /* block-local class not found */
    class d {}


    // Unreferenced inner class com/caverock/androidsvg/SVG$e
    /* block-local class not found */
    class e {}


    // Unreferenced inner class com/caverock/androidsvg/SVG$f
    /* block-local class not found */
    class f {}


    // Unreferenced inner class com/caverock/androidsvg/SVG$g
    /* block-local class not found */
    class g {}


    // Unreferenced inner class com/caverock/androidsvg/SVG$h
    /* block-local class not found */
    class h {}


    // Unreferenced inner class com/caverock/androidsvg/SVG$i
    /* block-local class not found */
    class i {}


    // Unreferenced inner class com/caverock/androidsvg/SVG$j
    /* block-local class not found */
    class j {}


    // Unreferenced inner class com/caverock/androidsvg/SVG$k
    /* block-local class not found */
    class k {}


    // Unreferenced inner class com/caverock/androidsvg/SVG$l
    /* block-local class not found */
    class l {}


    // Unreferenced inner class com/caverock/androidsvg/SVG$m
    /* block-local class not found */
    class m {}


    // Unreferenced inner class com/caverock/androidsvg/SVG$o
    /* block-local class not found */
    class o {}


    // Unreferenced inner class com/caverock/androidsvg/SVG$p
    /* block-local class not found */
    class p {}


    // Unreferenced inner class com/caverock/androidsvg/SVG$q
    /* block-local class not found */
    class q {}


    // Unreferenced inner class com/caverock/androidsvg/SVG$r
    /* block-local class not found */
    class r {}


    // Unreferenced inner class com/caverock/androidsvg/SVG$s
    /* block-local class not found */
    class s {}


    // Unreferenced inner class com/caverock/androidsvg/SVG$t
    /* block-local class not found */
    class t {}


    // Unreferenced inner class com/caverock/androidsvg/SVG$u
    /* block-local class not found */
    class u {}


    // Unreferenced inner class com/caverock/androidsvg/SVG$v
    /* block-local class not found */
    class v {}


    // Unreferenced inner class com/caverock/androidsvg/SVG$w
    /* block-local class not found */
    class w {}


    // Unreferenced inner class com/caverock/androidsvg/SVG$x
    /* block-local class not found */
    class x {}


    // Unreferenced inner class com/caverock/androidsvg/SVG$y
    /* block-local class not found */
    class y {}


    // Unreferenced inner class com/caverock/androidsvg/SVG$z
    /* block-local class not found */
    class z {}

}

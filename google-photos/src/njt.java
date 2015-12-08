// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.ByteBuffer;
import java.util.Map;

public final class njt extends nbc
    implements nvy, nvz
{

    private static final njw A;
    private static final njw B;
    private static final njw C;
    private static final njw D[];
    private static final njw E[];
    private static final njw F[];
    private static boolean G;
    private static boolean H;
    private static int I;
    private static int J;
    private static int K;
    private static int L;
    private static int M;
    private static int N;
    private static int O;
    private static final njw q;
    private static final njw r;
    private static final njw s;
    private static final njw t;
    private static final njw u;
    private static final njw v;
    private static final njw w;
    private static final njw x;
    private static final njw y;
    private static final njw z;
    private String P;
    private File Q;
    private File R;
    private njw S;
    private njw T;
    private String U;
    private ConnectivityManager V;
    private nju W;
    private int X;
    private int Y;
    private int Z;
    private int aa;
    private int ab;
    private int ac;

    public njt(nbj nbj1, njv njv1)
    {
        super(nbj1, njv1);
        X = -1;
        Y = -1;
        Z = 0;
        aa = 0;
        ab = -1;
        ac = -1;
        if (!G)
        {
            int i = nbj1.f();
            J = i;
            K = (int)((float)i * 0.5F);
            L = (int)((float)J * 0.3F);
            float f1 = nbj1.m();
            if ((double)f1 < 0.75D)
            {
                H = true;
                I = (int)(f1 * 8192F);
            }
            M = nbj1.g();
            N = nbj1.h();
            nbj1 = b.x(nbj1.o());
            O = Math.min(((DisplayMetrics) (nbj1)).widthPixels, ((DisplayMetrics) (nbj1)).heightPixels) / 4;
            G = true;
        }
        if (njv1.g != -1)
        {
            W = (nju)olm.a(a.o(), nju);
            X = W.b();
            Y = W.c();
        }
    }

    private Bitmap a(Context context, Uri uri, int i)
    {
        Object obj = context.getContentResolver();
        Object obj1 = b.a(((android.content.ContentResolver) (obj)), uri);
        int j = Math.max(((Point) (obj1)).x / i, ((Point) (obj1)).y / i);
        Bitmap bitmap = null;
        if (j == 1)
        {
            bitmap = a.a(((Point) (obj1)).x, ((Point) (obj1)).y);
        }
        obj = b.a(((android.content.ContentResolver) (obj)), uri, j, bitmap);
        if (obj != bitmap)
        {
            a.a(bitmap);
        }
        j = ((Bitmap) (obj)).getWidth();
        int l = ((Bitmap) (obj)).getHeight();
        float f1 = (float)i / (float)Math.max(j, l);
        if (f1 < 1.0F)
        {
            Bitmap bitmap2 = a.a(Math.round((float)j * f1), Math.round((float)l * f1));
            Bitmap bitmap1;
            if (f1 >= 1.0F)
            {
                bitmap1 = ((Bitmap) (obj));
            } else
            {
                if (bitmap2 == null)
                {
                    bitmap1 = Bitmap.createBitmap(Math.round((float)((Bitmap) (obj)).getWidth() * f1), Math.round((float)((Bitmap) (obj)).getHeight() * f1), android.graphics.Bitmap.Config.ARGB_8888);
                } else
                {
                    bitmap1 = bitmap2;
                }
                obj1 = new Matrix();
                ((Matrix) (obj1)).setScale(f1, f1);
                (new Canvas(bitmap1)).drawBitmap(((Bitmap) (obj)), ((Matrix) (obj1)), new Paint(3));
            }
            obj1 = bitmap1;
            if (bitmap1 != bitmap2)
            {
                a.a(bitmap2);
                obj1 = bitmap1;
            }
        } else
        {
            obj1 = obj;
        }
        if (obj1 != obj)
        {
            a.a(((Bitmap) (obj)));
        }
        context = a(context, uri, ((Bitmap) (obj1)));
        if (context != obj1)
        {
            a.a(((Bitmap) (obj1)));
        }
        return context;
    }

    private Bitmap a(Context context, Uri uri, Bitmap bitmap)
    {
        int i = b.b(context.getContentResolver(), uri);
        context = bitmap;
        if (i != 0)
        {
            uri = a.a(bitmap.getWidth(), bitmap.getHeight());
            Matrix matrix = new Matrix();
            matrix.setRotate(i);
            RectF rectf = new RectF(0.0F, 0.0F, bitmap.getWidth(), bitmap.getHeight());
            matrix.mapRect(rectf);
            i = Math.round(rectf.width());
            int j = Math.round(rectf.height());
            context = a.a(i, j);
            matrix.postTranslate(-rectf.left, -rectf.top);
            (new Canvas(context)).drawBitmap(bitmap, matrix, new Paint(3));
            if (context != uri)
            {
                a.a(uri);
            }
        }
        return context;
    }

    public static File a(Context context, String s1)
    {
        myy myy1 = ((nbj)olm.a(context, nbj)).e();
        context = a(njr.a(context, s1, njx.b), 0, 4, 0, 0, null, null);
        s1 = myy1.a(context);
        if (s1 != null)
        {
            return s1;
        } else
        {
            return myy1.a((new StringBuilder(String.valueOf(context).length() + 1)).append(context).append('~').toString());
        }
    }

    private String a(njr njr1, int i, int j, int l, int i1, int j1)
    {
        StringBuilder stringbuilder = oqs.a();
        a(stringbuilder, njr1.b).append(File.separatorChar).append(j).append(',').append(l).append(',').append(i1).append(',').append(j1).append(',');
        a(stringbuilder, i);
        stringbuilder.append(',');
        return oqs.b(stringbuilder);
    }

    private static String a(njr njr1, int i, int j, int l, int i1, RectF rectf, String s1)
    {
        Object obj;
        if (njr1.b())
        {
            if (njr1.d == njx.b)
            {
                njr1 = nkn.a(njr1.b);
            } else
            {
                njr1 = njr1.b;
            }
        } else
        if (njr1.c())
        {
            obj = String.valueOf(njr1.c);
            njr1 = String.valueOf(njr1.f);
            njr1 = (new StringBuilder(String.valueOf(obj).length() + 0 + String.valueOf(njr1).length())).append(((String) (obj))).append(njr1).toString();
        } else
        {
            boolean flag;
            if (njr1.a.a != 0L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                njr1 = Long.toString(njr1.a());
            } else
            {
                njr1 = String.valueOf(njr1);
                throw new IllegalStateException((new StringBuilder(String.valueOf(njr1).length() + 31)).append("A media ref should have a URI: ").append(njr1).toString());
            }
        }
        obj = njr1;
        if (s1 != null)
        {
            njr1 = String.valueOf(njr1);
            s1 = String.valueOf(s1);
            if (s1.length() != 0)
            {
                obj = njr1.concat(s1);
            } else
            {
                obj = new String(njr1);
            }
        }
        njr1 = oqs.a();
        njr1.append(b.A(((String) (obj))));
        j;
        JVM INSTR tableswitch 0 4: default 112
    //                   0 304
    //                   1 112
    //                   2 328
    //                   3 339
    //                   4 350;
           goto _L1 _L2 _L1 _L3 _L4 _L5
_L1:
        a(((StringBuilder) (njr1)), i);
        if (rectf != null)
        {
            njr1.append(nkj.a(rectf, 0));
        }
        return oqs.b(njr1);
_L2:
        njr1.append('-').append(l).append('x').append(i1);
        continue; /* Loop/switch isn't completed */
_L3:
        njr1.append("-t");
        continue; /* Loop/switch isn't completed */
_L4:
        njr1.append("-l");
        continue; /* Loop/switch isn't completed */
_L5:
        njr1.append("-z");
        if (true) goto _L1; else goto _L6
_L6:
    }

    private static StringBuilder a(StringBuilder stringbuilder, String s1)
    {
        stringbuilder.append(b.A(b.B(s1))).append('+');
        return stringbuilder;
    }

    private void a(Bitmap bitmap, String s1)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 85, bytearrayoutputstream);
        a.d().a(s1, ByteBuffer.wrap(bytearrayoutputstream.toByteArray()));
        bytearrayoutputstream.close();
        return;
        bitmap;
        bytearrayoutputstream.close();
        throw bitmap;
    }

    private static void a(StringBuilder stringbuilder, int i)
    {
        if ((i & 4) != 0)
        {
            stringbuilder.append("-a");
        }
        if ((i & 0x20) != 0)
        {
            stringbuilder.append("-nw");
        }
        if ((i & 0x100) != 0)
        {
            stringbuilder.append("-p");
        }
        if ((0x20000 & i) != 0)
        {
            stringbuilder.append("-ip");
        }
    }

    private static boolean a(int i, int j, int l)
    {
        if (i != 0 && j != 0)
        {
            i -= l;
            j -= l;
            if (i > 0)
            {
                while (j < 0 || j > i) 
                {
                    return true;
                }
            } else
            if (j < 0 && j < i)
            {
                return true;
            }
        }
        return false;
    }

    private static boolean a(njv njv1)
    {
        return njv1.f == 0 && njv1.g != -1 && njv1.k == null && njv1.j == null && njv1.e.b() && (njv1.e.d == njx.a || njv1.e.d == njx.d);
    }

    private void b(njv njv1)
    {
        if (njv1.h == 0 || Z == 0) goto _L2; else goto _L1
_L1:
        double d1 = (double)Z / (double)njv1.h;
_L6:
        if (d1 >= 2D) goto _L4; else goto _L3
_L3:
        return;
_L2:
        if (njv1.i == 0 || aa == 0) goto _L3; else goto _L5
_L5:
        d1 = (double)aa / (double)njv1.i;
          goto _L6
_L4:
        int i;
        int j;
        j = (int)Math.pow(2D, Math.floor(Math.log(d1) / Math.log(2D)));
        Bitmap bitmap;
        int l;
        try
        {
            bitmap = b.a(a.o().getContentResolver(), Uri.fromFile(R), j, null);
        }
        // Misplaced declaration of an exception variable
        catch (njv njv1)
        {
            Log.e("ImageResource", "Cannot save downsampled bitmap", njv1);
            return;
        }
        if (bitmap == null) goto _L3; else goto _L7
_L7:
        l = bitmap.getWidth();
        i = bitmap.getHeight();
        if (Z == 0) goto _L9; else goto _L8
_L8:
        i = Z - l * j;
_L11:
        if (Math.abs(i) >= j) goto _L3; else goto _L10
_L10:
        Z = Z / j;
        aa = aa / j;
        njv1 = a(njv1.e, njv1.b, Z, aa, ab, ac);
        a(bitmap, njv1);
        R = new File(a.d().b(njv1));
        return;
_L9:
        int i1 = aa;
        i = i1 - i * j;
          goto _L11
    }

    static int p()
    {
        return K;
    }

    static int q()
    {
        return L;
    }

    private void u()
    {
        njw anjw[];
        int i;
        i = ((njv)g).b();
        anjw = null;
        i;
        JVM INSTR tableswitch 6 8: default 44
    //                   6 140
    //                   7 147
    //                   8 154;
           goto _L1 _L2 _L3 _L4
_L1:
        String s1;
        s1 = b();
        i = 0;
_L5:
        if (i < anjw.length)
        {
            Object obj = String.valueOf(s1);
            Object obj1 = String.valueOf(((njw) (anjw[i])).b);
            if (((String) (obj1)).length() != 0)
            {
                obj = ((String) (obj)).concat(((String) (obj1)));
            } else
            {
                obj = new String(((String) (obj)));
            }
            obj1 = a.d().a(((String) (obj)));
            if (obj1 == null)
            {
                obj = a.e().a(((String) (obj)));
            } else
            {
                obj = obj1;
            }
            if (obj == null)
            {
                break MISSING_BLOCK_LABEL_173;
            }
            S = anjw[i];
            R = ((File) (obj));
        }
        return;
_L2:
        anjw = D;
          goto _L1
_L3:
        anjw = E;
          goto _L1
_L4:
        anjw = F;
          goto _L1
        i++;
          goto _L5
    }

    private boolean v()
    {
        if (V == null)
        {
            V = (ConnectivityManager)a.o().getSystemService("connectivity");
        }
        ConnectivityManager connectivitymanager = V;
        NetworkInfo networkinfo = connectivitymanager.getNetworkInfo(1);
        if (networkinfo == null || !networkinfo.isConnected())
        {
            return false;
        }
        return !ig.a(connectivitymanager);
    }

    private njw w()
    {
        switch (((njv)g).b())
        {
        default:
            return C;

        case 6: // '\006'
            return A;

        case 7: // '\007'
            return B;
        }
    }

    private boolean x()
    {
        Object obj = ((njv)g).e.c;
        if (oql.a(((Uri) (obj))))
        {
            Q = new File(((Uri) (obj)).getPath());
        } else
        {
            obj = oql.a(a.o().getContentResolver(), ((Uri) (obj)));
            if (obj == null)
            {
                obj = String.valueOf(g);
                a((new StringBuilder(String.valueOf(obj).length() + 32)).append("Couldn't compute raw file name: ").append(((String) (obj))).toString(), ((Throwable) (null)));
                return false;
            }
            Q = new File(((String) (obj)));
        }
        return true;
    }

    public final Uri a(Uri uri)
    {
        njl njl1 = (njl)olm.a(a.o(), njl);
        uri.getPath();
        uri = njx.a;
        return njl1.c();
    }

    public final String a()
    {
        Object obj;
        Object obj1;
        njv njv2;
        int i;
        int i1;
        njv2 = (njv)g;
        obj = njv2.e.b;
        obj1 = obj;
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            obj = (njl)olm.b(a.o(), njl);
            if (obj != null)
            {
                obj = ((njl) (obj)).a();
            } else
            {
                obj = null;
            }
            obj1 = obj;
            if (obj == null)
            {
                if (super.m)
                {
                    obj = String.valueOf(g);
                    (new StringBuilder(String.valueOf(obj).length() + 33)).append("Cannot retrieve content URI for: ").append(((String) (obj)));
                }
                return null;
            }
        }
        obj = b.B(((String) (obj1)));
        obj1 = (njv)g;
        i = 6;
        i1 = ((njv) (obj1)).b;
        if ((i1 & 4) != 0) goto _L2; else goto _L1
_L1:
        i = 22;
_L11:
        int j = i;
        if ((i1 & 0x20) == 0)
        {
            j = i | 0x20;
        }
        i = j;
        if ((i1 & 0x4000) != 0)
        {
            i = j | 0x80;
        }
        if (((njv) (obj1)).j != null)
        {
            i |= 0x400;
        }
        if ((0x20000 & i1) != 0)
        {
            i |= 0x200;
        }
        switch (njv2.f)
        {
        case 4: // '\004'
        default:
            return ((String) (obj));

        case 0: // '\0'
            int l = i;
            if (njv2.h != 0)
            {
                l = i;
                if (njv2.i != 0)
                {
                    if ((njv2.b & 0x100) == 0)
                    {
                        l = i | 0x48;
                    } else
                    {
                        l = i;
                        if ((njv2.b & 0x200) == 512)
                        {
                            l = i | 0x40;
                        }
                    }
                }
            }
            njv njv1;
            if (njv2.g != -1)
            {
                i = W.a();
            } else
            {
                i = l;
            }
            return nkj.a(((String) (obj)), i, njv2.h, njv2.i, X, Y, njv2.j);

        case 2: // '\002'
            l = i;
            if ((njv2.b & 0x100) == 0)
            {
                l = i | 8;
            }
            return nkj.a(((String) (obj)), l, M, njv2.j);

        case 3: // '\003'
            return nkj.a(((String) (obj)), i, N, njv2.j);

        case 1: // '\001'
            return nkj.a(((String) (obj)), i, njv2.j);

        case 5: // '\005'
            njv1 = (njv)g;
            i1 = Math.max(njv1.h, njv1.i);
            l = i1;
            if (i1 == 0)
            {
                l = J;
            }
            i1 = l;
            break;
        }
          goto _L3
_L2:
        if ((i1 & 0x20) == 0)
        {
            i = 16390;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if ((njv1.b & 0x400) != 0) goto _L5; else goto _L4
_L4:
        if (T == null)
        {
            T = w();
        }
        i1 = l;
        T.a;
        JVM INSTR tableswitch 1 2: default 552
    //                   1 556
    //                   2 569;
           goto _L6 _L7 _L8
_L7:
        break; /* Loop/switch isn't completed */
_L6:
        i1 = l;
_L5:
        return nkj.a(((String) (obj)), i, i1, njv2.j);
_L8:
        i1 = l;
        if (H)
        {
            i1 = (I * l) / 8192;
        }
        if (true) goto _L5; else goto _L9
_L9:
        if (true) goto _L11; else goto _L10
_L10:
    }

    public final void a(Object obj)
    {
        njv njv1 = (njv)g;
        njv1.f;
        JVM INSTR lookupswitch 2: default 40
    //                   0: 69
    //                   5: 46;
           goto _L1 _L2 _L3
_L1:
        super.a(obj);
        return;
_L3:
        if (T != null)
        {
            S = T;
            T = null;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        Z = njv1.h;
        aa = njv1.i;
        ab = X;
        ac = Y;
        if (true) goto _L1; else goto _L4
_L4:
    }

    public final String b()
    {
        if (P == null)
        {
            Object obj = (njv)g;
            if (a(((njv) (obj))))
            {
                P = a(((njv) (obj)).e, ((njv) (obj)).b, ((njv) (obj)).h, ((njv) (obj)).i, X, Y);
            } else
            {
                njr njr1 = ((njv) (obj)).e;
                int i = ((njv) (obj)).b;
                int j = ((njv) (obj)).f;
                int l = ((njv) (obj)).h;
                int i1 = ((njv) (obj)).i;
                RectF rectf = ((njv) (obj)).j;
                if (((njv) (obj)).k == null)
                {
                    obj = null;
                } else
                {
                    obj = ((njv) (obj)).k.A();
                }
                P = a(njr1, i, j, l, i1, rectf, ((String) (obj)));
            }
        }
        return P;
    }

    public final void b(int i)
    {
        boolean flag = false;
        i;
        JVM INSTR tableswitch 0 3: default 32
    //                   0 103
    //                   1 143
    //                   2 138
    //                   3 143;
           goto _L1 _L2 _L3 _L4 _L3
_L1:
        i = ((flag) ? 1 : 0);
_L6:
        if (super.m)
        {
            String s1 = String.valueOf(g);
            (new StringBuilder(String.valueOf(s1).length() + 66)).append("Delivering resource type to consumers: ").append(s1).append(" resource type: ").append(i);
        }
        if (i != 0)
        {
            a.b(this, i);
        }
        return;
_L2:
        if (oql.a(U))
        {
            i = 2;
        } else
        if (oql.b(U))
        {
            i = 1;
        } else
        {
            i = -1;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        i = 4;
        continue; /* Loop/switch isn't completed */
_L3:
        i = 3;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void c()
    {
        njv njv1 = (njv)g;
        njr njr1 = njv1.e;
        if ((njv1.b & 2) != 0 && njr1.c())
        {
            if (x())
            {
                if (super.m)
                {
                    String s1 = String.valueOf(g);
                    String s2 = String.valueOf(e());
                    (new StringBuilder(String.valueOf(s1).length() + 46 + String.valueOf(s2).length())).append("Returning file name to consumers: ").append(s1).append(" file name: ").append(s2);
                }
                a.a(this, 1, e());
                return;
            } else
            {
                a.a(this, 5, null);
                return;
            }
        } else
        {
            super.c();
            return;
        }
    }

    public final void c(Object obj)
    {
        boolean flag;
        flag = true;
        super.c(obj);
        if (s() == 0) goto _L2; else goto _L1
_L1:
        njv njv1 = (njv)g;
        njv1.f;
        JVM INSTR lookupswitch 2: default 56
    //                   0: 153
    //                   5: 57;
           goto _L2 _L3 _L4
_L2:
        return;
_L4:
        if (S == null)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = S.c;
        if (obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (((njw) (obj)).a == 2)
        {
            T = ((njw) (obj));
        } else
        if (((njw) (obj)).a == 3 && H && (njv1.b & 0x1000) == 0 && v())
        {
            T = ((njw) (obj));
        }
        if (T == null)
        {
            break; /* Loop/switch isn't completed */
        }
_L6:
        if (flag)
        {
            g();
            return;
        }
        if (true) goto _L2; else goto _L5
_L5:
        flag = false;
          goto _L6
_L3:
        if (!v()) goto _L2; else goto _L7
_L7:
        if (njv1.e.c() || !a(njv1) || njv1.g == -1 || (njv1.b & 0x1000) != 0) goto _L9; else goto _L8
_L8:
        if (ab != 0) goto _L11; else goto _L10
_L10:
        if (ac <= Y) goto _L13; else goto _L12
_L12:
        int i = 1;
_L15:
        if (i != 0)
        {
            g();
            return;
        }
          goto _L2
_L11:
        if (ac >= Y) goto _L13; else goto _L14
_L14:
        i = 1;
          goto _L15
_L13:
        int l = b(obj);
        i = l();
        double d1 = (double)l / (double)i;
        int j;
        if (njv1.h == 0)
        {
            i = (int)((double)njv1.i * d1);
        } else
        {
            i = njv1.h;
        }
        if (Z == 0)
        {
            j = (int)(d1 * (double)aa);
        } else
        {
            j = Z;
        }
        if (i - O <= j) goto _L9; else goto _L16
_L16:
        if (j > l)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i == 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
          goto _L15
_L9:
        i = 0;
          goto _L15
    }

    public final String d()
    {
        if (T != null)
        {
            String s1 = String.valueOf(b());
            String s2 = String.valueOf(T.b);
            if (s2.length() != 0)
            {
                return s1.concat(s2);
            } else
            {
                return new String(s1);
            }
        } else
        {
            return b();
        }
    }

    public final File e()
    {
        if (Q != null)
        {
            return Q;
        } else
        {
            return super.e();
        }
    }

    public final File f()
    {
        Object obj;
        if (Q != null)
        {
            return Q;
        }
        obj = (njv)g;
        if ((((njv) (obj)).b & 0x400) != 0)
        {
            return a.e().a(b());
        }
        ((njv) (obj)).f;
        JVM INSTR lookupswitch 2: default 80
    //                   0: 85
    //                   5: 878;
           goto _L1 _L2 _L3
_L1:
        return super.f();
_L2:
        if (!a(((njv) (obj)))) goto _L1; else goto _L4
_L4:
        njv njv1;
        File file;
        njv1 = (njv)g;
        obj = a.d();
        R = null;
        Z = 0;
        aa = 0;
        ab = -1;
        ac = -1;
        StringBuilder stringbuilder = oqs.a();
        a(stringbuilder, njv1.e.b);
        file = new File(((myy) (obj)).b(oqs.b(stringbuilder)));
        if (!file.exists()) goto _L6; else goto _L5
_L5:
        double d1;
        String s4;
        File afile[];
        int j;
        String s1;
        if (njv1.h == 0 || njv1.i == 0)
        {
            d1 = -1D;
        } else
        {
            d1 = (double)njv1.h / (double)njv1.i;
        }
        j = njv1.b & 0xffffffdf;
        obj = oqs.a();
        a(((StringBuilder) (obj)), j);
        s4 = oqs.b(((StringBuilder) (obj)));
        afile = file.listFiles();
        if (afile != null && afile.length != 0) goto _L7; else goto _L6
_L6:
        if (R != null)
        {
            if (Log.isLoggable("ImageResource", 3))
            {
                obj = String.valueOf(R.getParent());
                s1 = String.valueOf(R.getName());
                (new StringBuilder(String.valueOf(obj).length() + 24 + String.valueOf(s1).length())).append("Cached resource found: ").append(((String) (obj))).append("/").append(s1);
            }
            return R;
        }
        break; /* Loop/switch isn't completed */
_L7:
        int i;
        i = 0;
        obj = null;
_L12:
        if (i >= afile.length) goto _L9; else goto _L8
_L8:
        String s3;
        String as[];
        s3 = afile[i].getName();
        as = s3.split(",");
        if (as.length >= 4) goto _L11; else goto _L10
_L10:
        Object obj1;
        (new File(file, s3)).delete();
        obj1 = obj;
_L14:
        i++;
        obj = obj1;
          goto _L12
_L11:
        int k1;
        obj1 = obj;
        if (as.length >= 6)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (j == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        String s2;
        int j1;
        if (as.length >= 5)
        {
            s2 = as[4];
        } else
        {
            s2 = "";
        }
        obj1 = obj;
        if (!s4.equals(s2)) goto _L14; else goto _L13
_L13:
        double d2;
        int l;
        int i1;
        try
        {
            l = Integer.parseInt(as[0]);
            i1 = Integer.parseInt(as[1]);
            j1 = Integer.parseInt(as[2]);
            k1 = Integer.parseInt(as[3]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            Log.e("ImageResource", "NumberFormatException parsing cached file's filename.");
            obj1 = obj;
            break; /* Loop/switch isn't completed */
        }
        if (l == 0 || i1 == 0)
        {
            d2 = -1D;
        } else
        {
            d2 = (double)l / (double)i1;
        }
        obj1 = obj;
        if (d2 < d1 - 0.10000000000000001D)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj1 = obj;
        if (d2 > d1 + 0.10000000000000001D)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj1 = obj;
        if (j1 != X)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (j1 != 0) goto _L16; else goto _L15
_L15:
        obj1 = obj;
        if (ac < k1)
        {
            continue; /* Loop/switch isn't completed */
        }
_L19:
        if (Z == njv1.h && aa == njv1.i)
        {
            obj1 = obj;
            if (l != njv1.h)
            {
                break; /* Loop/switch isn't completed */
            }
            obj1 = obj;
            if (i1 != njv1.i)
            {
                break; /* Loop/switch isn't completed */
            }
        }
        obj1 = obj;
        if (a(Z, l, njv1.h))
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = obj;
        if (a(aa, i1, njv1.i))
        {
            break; /* Loop/switch isn't completed */
        }
        if (njv1.h != 0 && Z != 0)
        {
            obj1 = obj;
            if (l == 0)
            {
                break; /* Loop/switch isn't completed */
            }
        }
        if (njv1.i != 0 && aa != 0)
        {
            obj1 = obj;
            if (i1 == 0)
            {
                break; /* Loop/switch isn't completed */
            }
        }
        break; /* Loop/switch isn't completed */
        if (true) goto _L18; else goto _L17
_L18:
        break; /* Loop/switch isn't completed */
_L17:
        Z = l;
        aa = i1;
        ab = j1;
        ac = k1;
        obj1 = s3;
        break; /* Loop/switch isn't completed */
_L16:
        obj1 = obj;
        if (ac > k1) goto _L14; else goto _L19
_L9:
        if (obj != null)
        {
            R = new File(file, ((String) (obj)));
            if (njv1.e.d == njx.a)
            {
                b(njv1);
            }
        }
        if (true) goto _L6; else goto _L20
_L20:
        if (!Log.isLoggable("ImageResource", 3));
          goto _L1
_L3:
        u();
        return R;
    }

    protected final void g()
    {
        Object obj;
        obj = (njv)g;
        if (T == null && ((njv) (obj)).f == 5 && (((njv) (obj)).b & 0x400) == 0)
        {
            T = w();
            if (T.c != null && (((njv) (obj)).b & 0x8000) != 0 && v())
            {
                T = T.c;
            }
        }
        obj = ((njv)g).e;
        if (!((njr) (obj)).c()) goto _L2; else goto _L1
_L1:
        int i;
        obj = ((njr) (obj)).c;
        String s1 = ((Uri) (obj)).getScheme();
        njl njl1 = (njl)olm.b(a.o(), njl);
        String s2;
        boolean flag3;
        if (njl1 != null && njl1.b())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (s1 == null || s1.startsWith("http") || i != 0) goto _L2; else goto _L3
_L3:
        if (obj == null) goto _L5; else goto _L4
_L4:
        long l1 = SystemClock.currentThreadTimeMillis();
        Context context = a.o();
        njv njv1 = (njv)g;
        Object obj2 = njv1.e.c;
        if (super.m)
        {
            obj = String.valueOf(obj2);
            (new StringBuilder(String.valueOf(obj).length() + 23)).append("Loading local resource ").append(((String) (obj)));
        }
        U = oql.b(context.getContentResolver(), ((Uri) (obj2)));
        boolean flag = oql.c(U);
        boolean flag1 = oql.a(U);
        boolean flag2 = oql.b(((Uri) (obj2)));
        flag3 = oql.a(((Uri) (obj2)));
        if (!flag && !flag1)
        {
            Object obj1 = nvt.a(context);
            Object obj3 = U;
            obj = ((nvt) (obj1)).b;
            s2 = String.valueOf(obj2);
            obj = (Integer)((Map) (obj)).get((new StringBuilder(String.valueOf(s2).length() + 0 + String.valueOf(obj3).length())).append(s2).append(((String) (obj3))).toString());
            int j;
            int l;
            int i1;
            if (obj != null)
            {
                b(((Integer) (obj)).intValue());
            } else
            {
                float f1;
                float f2;
                float f3;
                if (oql.a(((Uri) (obj2))))
                {
                    obj = a(((Uri) (obj2)));
                    ((nvt) (obj1)).a.grantUriPermission("com.google.android.gms", ((Uri) (obj)), 1);
                } else
                {
                    obj = obj2;
                }
                if (((nvt) (obj1)).c == null)
                {
                    obj1.c = (mfg)olm.a(((nvt) (obj1)).a, mfg);
                }
                ((nvt) (obj1)).c.a(((Uri) (obj)), new nvu(((nvt) (obj1)), ((Uri) (obj2)), ((String) (obj3)), this));
            }
        } else
        if (flag1)
        {
            this.l = 2;
            a.b(this, 2);
        }
        obj1 = null;
        obj3 = null;
        l = njv1.h;
        i1 = njv1.i;
        if (njv1.f != 2) goto _L7; else goto _L6
_L6:
        i = M;
        j = i;
_L17:
        obj = null;
        if (!flag3) goto _L9; else goto _L8
_L8:
        obj = String.valueOf(((Uri) (obj2)).getPath());
        s2 = String.valueOf("-thumb");
        if (s2.length() == 0) goto _L11; else goto _L10
_L10:
        obj = ((String) (obj)).concat(s2);
_L22:
        obj = new File(((String) (obj)));
_L9:
        if (njv1.f != 2 || obj == null) goto _L13; else goto _L12
_L12:
        if (!((File) (obj)).exists()) goto _L13; else goto _L14
_L14:
        obj = b.a(((File) (obj)), false);
        obj1 = obj3;
_L28:
        if (obj1 != null)
        {
            try
            {
                if ((njv1.b & 1) == 0)
                {
                    l1 = SystemClock.currentThreadTimeMillis();
                    a(((Bitmap) (obj1)), d());
                    if (super.m)
                    {
                        obj = String.valueOf(g);
                        obj2 = String.valueOf(e());
                        obj3 = String.valueOf(b.d(SystemClock.currentThreadTimeMillis() - l1));
                        (new StringBuilder(String.valueOf(obj).length() + 62 + String.valueOf(obj2).length() + String.valueOf(obj3).length())).append("Saved local thumbnail in file cache: ").append(((String) (obj))).append(" file name: ").append(((String) (obj2))).append(" time spent: ").append(((String) (obj3)));
                    }
                }
                c(obj1);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                a(6);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                a(3);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                a(5);
            }
            return;
        }
          goto _L15
_L2:
        obj = null;
          goto _L3
_L7:
        i = i1;
        j = l;
        njv1.f;
        JVM INSTR tableswitch 0 5: default 1666
    //                   0 450
    //                   1 450
    //                   2 860
    //                   3 877
    //                   4 860
    //                   5 889;
           goto _L16 _L17 _L17 _L16 _L18 _L16 _L19
_L16:
        throw new UnsupportedOperationException();
_L18:
        i = N;
        j = i;
          goto _L17
_L19:
        i = i1;
        j = l;
        if (l != 0) goto _L17; else goto _L20
_L20:
        i = i1;
        j = l;
        if (i1 != 0) goto _L17; else goto _L21
_L21:
        i = N;
        j = i;
          goto _L17
_L11:
        obj = new String(((String) (obj)));
          goto _L22
_L13:
        if (!flag1) goto _L24; else goto _L23
_L23:
        if ((njv1.b & 4) == 0) goto _L24; else goto _L25
_L25:
        if (!x()) goto _L27; else goto _L26
_L26:
        obj = b.a(Q, false);
        obj1 = obj3;
          goto _L28
_L24:
        if (!flag2) goto _L30; else goto _L29
_L29:
        obj = (njv)g;
        if (((njv) (obj)).f != 2 && !flag) goto _L32; else goto _L31
_L31:
        if (j != 0 || i != 0) goto _L34; else goto _L33
_L33:
        throw new IllegalArgumentException("Both width and height cannot be zero.");
_L34:
        obj1 = a.a(512, 384);
        obj = b.a(context, ((Uri) (obj2)), ((Bitmap) (obj1)));
        if (obj == obj1) goto _L36; else goto _L35
_L35:
        a.a(((Bitmap) (obj1)));
_L36:
        i1 = ((Bitmap) (obj)).getWidth();
        l = ((Bitmap) (obj)).getHeight();
        f1 = (float)i1 / (float)l;
        if (j != 0) goto _L38; else goto _L37
_L37:
        j = Math.round(f1 * (float)i);
_L46:
        j = Math.min(i1, j);
        i = Math.min(l, i);
        obj1 = a(context, ((Uri) (obj2)), ((Bitmap) (obj)));
        if (obj1 == obj) goto _L40; else goto _L39
_L39:
        a.a(((Bitmap) (obj)));
_L40:
        obj2 = a.a(j, i);
        if (obj1 != null) goto _L42; else goto _L41
_L41:
        obj = null;
_L49:
        if (obj1 == obj) goto _L44; else goto _L43
_L43:
        a.a(((Bitmap) (obj1)));
_L44:
        obj1 = obj;
        if (obj2 == obj)
        {
            break MISSING_BLOCK_LABEL_1243;
        }
        a.a(((Bitmap) (obj2)));
        obj1 = obj;
_L58:
        a(l1, "mediastore", -1, -1, -1, ((Bitmap) (obj1)));
        obj = null;
          goto _L28
_L38:
        if (i != 0) goto _L46; else goto _L45
_L45:
        i = Math.round((float)j / f1);
          goto _L46
_L42:
        if (((Bitmap) (obj1)).getWidth() != j || ((Bitmap) (obj1)).getHeight() != i) goto _L48; else goto _L47
_L47:
        obj = obj1;
          goto _L49
_L48:
        f2 = 0.0F;
        f1 = 0.0F;
        obj3 = new Matrix();
        if (((Bitmap) (obj1)).getWidth() * i <= ((Bitmap) (obj1)).getHeight() * j) goto _L51; else goto _L50
_L50:
        f3 = (float)i / (float)((Bitmap) (obj1)).getHeight();
        f2 = ((float)j - (float)((Bitmap) (obj1)).getWidth() * f3) * 0.5F;
_L54:
        ((Matrix) (obj3)).setScale(f3, f3);
        ((Matrix) (obj3)).postTranslate((float)(int)f2 + 0.5F, (float)(int)f1 + 0.5F);
        if (obj2 == null) goto _L53; else goto _L52
_L52:
        obj = obj2;
_L55:
        (new Canvas(((Bitmap) (obj)))).drawBitmap(((Bitmap) (obj1)), ((Matrix) (obj3)), new Paint(3));
          goto _L49
_L51:
        f3 = (float)j / (float)((Bitmap) (obj1)).getWidth();
        f1 = ((float)i - (float)((Bitmap) (obj1)).getHeight() * f3) * 0.5F;
          goto _L54
_L53:
        obj = Bitmap.createBitmap(j, i, android.graphics.Bitmap.Config.ARGB_8888);
          goto _L55
_L32:
        if (((njv) (obj)).f != 1) goto _L57; else goto _L56
_L56:
        obj1 = b.a(context.getContentResolver(), ((Uri) (obj2)), a.c());
          goto _L58
_L57:
        obj1 = a(context, ((Uri) (obj2)), Math.max(j, i));
          goto _L58
_L30:
        if (!flag) goto _L60; else goto _L59
_L59:
        obj1 = b.a(context, ((Uri) (obj2)), j, i);
        a(l1, "video", -1, -1, -1, ((Bitmap) (obj1)));
        obj = null;
          goto _L28
_L60:
        if (njv1.f != 1) goto _L62; else goto _L61
_L61:
        obj1 = b.a(context.getContentResolver(), ((Uri) (obj2)), a.c());
_L63:
        a(l1, ((Uri) (obj2)).getAuthority(), -1, -1, -1, ((Bitmap) (obj1)));
          goto _L27
_L62:
        obj1 = a(context, ((Uri) (obj2)), Math.max(j, i));
          goto _L63
_L15:
        if (obj == null) goto _L65; else goto _L64
_L64:
        a(obj);
        return;
_L65:
        a(3);
        return;
_L5:
        super.g();
        return;
_L27:
        obj = null;
          goto _L28
    }

    public final void o()
    {
        if (super.m)
        {
            String s1 = String.valueOf(g);
            (new StringBuilder(String.valueOf(s1).length() + 48)).append("Failed to determine if the image is a panorama: ").append(s1);
        }
    }

    static 
    {
        q = new njw(3, 0);
        r = new njw(6, 3);
        s = new njw(6, 2);
        t = new njw(6, 1);
        u = new njw(7, 3);
        v = new njw(7, 2);
        w = new njw(7, 1);
        x = new njw(8, 3);
        y = new njw(8, 2);
        z = new njw(8, 1);
        A = s.a(r);
        B = v.a(u);
        C = y.a(x);
        D = (new njw[] {
            r, q.a(r), A, u.a(r), v.a(s), t.a(s), w.a(s), x.a(s)
        });
        E = (new njw[] {
            q, u, B, x.a(v), s, y.a(v), t.a(v), w.a(v)
        });
        F = (new njw[] {
            q, x, C, v, t.a(y), w.a(y), z.a(y)
        });
    }
}

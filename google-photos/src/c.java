// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.res.ColorStateList;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.media.MediaFormat;
import android.media.RemoteControlClient;
import android.net.Uri;
import android.os.Bundle;
import android.support.rastermill.FrameSequence;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.accessibility.AccessibilityManager;
import android.widget.CompoundButton;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class c
    implements j
{

    public static final int A = 0x7f0400c5;
    public static final int B = 0x7f0400c6;
    public static final int C = 0x7f0400c9;
    public static final int D = 0x7f0400cc;
    public static final int E = 0x7f0400cd;
    public static final int F = 0x7f0400cf;
    public static final int G = 0x7f0400d0;
    public static final int H = 0x7f0400d1;
    public static final int I = 0x7f0400d2;
    public static final int J = 0x7f0400d3;
    public static final int K = 0x7f0400d4;
    public static final int L = 0x7f0400d5;
    public static final int M = 0x7f0400d6;
    public static final int N = 0x7f0400d7;
    public static final int O = 0x7f0400d8;
    public static final int P = 0x7f0400d9;
    public static final int Q = 0x7f0400db;
    public static final int R = 0x7f0400dd;
    public static final int S = 0x7f0400de;
    public static final int T = 0x7f0400df;
    public static final int U = 0x7f0b043b;
    public static final int V = 0x7f0b0439;
    public static final int W = 0x7f0b043a;
    public static final int X = 0x7f0b0438;
    public static final int Y = 0x7f0b0437;
    public static final int Z = 0x7f0b0435;
    public static final int aA = 0x7f0b046e;
    public static final int aB = 0x7f0b03fb;
    public static final int aC = 0x7f0b03fc;
    public static final int aD = 0x7f0b03fa;
    public static final int aE = 0x7f0b045a;
    public static final int aF = 0x7f0b0444;
    public static final int aG = 0x7f0b049c;
    public static final int aH = 0x7f0b046d;
    public static final int aI = 0x7f0b046c;
    public static final int aJ = 0x7f0b0407;
    public static final int aK = 0x7f0b040c;
    public static final int aL = 0x7f0b040b;
    public static final int aM = 0x7f0b0408;
    public static final int aN = 0x7f0b040e;
    public static final int aO = 0x7f0b0410;
    public static final int aP = 0x7f0b0446;
    public static final int aQ = 0x7f0b047b;
    public static final int aR = 0x7f0b047c;
    public static final int aS = 0x7f0b047d;
    public static final int aT = 0x7f0b047a;
    public static final int aU = 0x7f0b04a0;
    public static final int aV = 0x7f0b046b;
    public static final int aW = 0x7f0b046a;
    public static final int aX = 0x7f0b03fe;
    public static final int aY = 0x7f0b0400;
    public static final int aZ = 0x7f0b03ff;
    public static final int aa = 0x7f0b0436;
    public static final int ab = 0x7f0b0433;
    public static final int ac = 0x7f0b0434;
    public static final int ad = 0x7f0b044e;
    public static final int ae = 0x7f0b0454;
    public static final int af = 0x7f0b0406;
    public static final int ag = 0x7f0b049d;
    public static final int ah = 0x7f0b049e;
    public static final int ai = 0x7f0b0451;
    public static final int aj = 0x7f0b0466;
    public static final int ak = 0x7f0b0465;
    public static final int al = 0x7f0b0468;
    public static final int am = 0x7f0b0467;
    public static final int an = 0x7f0b0431;
    public static final int ao = 0x7f0b0430;
    public static final int ap = 0x7f0b042f;
    public static final int aq = 0x7f0b049b;
    public static final int ar = 0x7f0b0477;
    public static final int as = 0x7f0b0478;
    public static final int at = 0x7f0b0479;
    public static final int au = 0x7f0b0476;
    public static final int av = 0x7f0b0473;
    public static final int aw = 0x7f0b0472;
    public static final int ax = 0x7f0b046f;
    public static final int ay = 0x7f0b0470;
    public static final int az = 0x7f0b0471;
    public static Method b;
    public static final int bA = 0x7f0b048e;
    public static final int bB = 0x7f0b0485;
    public static final int bC = 0x7f0b0487;
    public static final int bD = 0x7f0b0488;
    public static final int bE = 0x7f0b0489;
    public static final int bF = 0x7f0b048a;
    public static final int bG = 0x7f0b048b;
    public static final int bH = 0x7f0b048f;
    public static final int bI = 0x7f0b047f;
    public static final int bJ = 0x7f0b048c;
    public static final int bK = 0x7f0b047e;
    public static final int bL = 0x7f0b044c;
    public static final int bM = 0x7f0b0469;
    public static final int bN = 0x7f0b0499;
    public static final int bO = 0x7f0b0414;
    public static final int bP = 0x7f0b0412;
    public static final int bQ = 0x7f0b0413;
    public static final int bR = 0x7f0b0455;
    public static final int bS = 0x7f0b0453;
    public static final int bT = 0x7f0b043c;
    public static final int bU = 0x7f0b043d;
    public static final int bV = 0x7f0b0475;
    public static final int bW = 0x7f0b0474;
    public static final int bX = 0x7f0b05c6;
    public static final int bY = 0x7f09019d;
    public static final int bZ = 0x7f09019e;
    public static final int ba = 0x7f0b0401;
    public static final int bb = 0x7f0b03fd;
    public static final int bc = 0x7f0b0498;
    public static final int bd = 0x7f0b0417;
    public static final int be = 0x7f0b03f8;
    public static final int bf = 0x7f0b0416;
    public static final int bg = 0x7f0b0456;
    public static final int bh = 0x7f0b0459;
    public static final int bi = 0x7f0b049f;
    public static final int bj = 0x7f0b0458;
    public static final int bk = 0x7f0b0457;
    public static final int bl = 0x7f0b0404;
    public static final int bm = 0x7f0b0402;
    public static final int bn = 0x7f0b0403;
    public static final int bo = 0x7f0b0405;
    public static final int bp = 0x7f0b044a;
    public static final int bq = 0x7f0b044b;
    public static final int br = 0x7f0b0445;
    public static final int bs = 0x7f0b0480;
    public static final int bt = 0x7f0b0481;
    public static final int bu = 0x7f0b0482;
    public static final int bv = 0x7f0b0490;
    public static final int bw = 0x7f0b048d;
    public static final int bx = 0x7f0b0486;
    public static final int by = 0x7f0b0483;
    public static final int bz = 0x7f0b0484;
    public static boolean c = false;
    public static final int cA = 0x7f02023a;
    public static final int cB = 0x7f0202a0;
    public static final int cC = 0x7f0202a9;
    public static final int cD = 0x7f0202dc;
    public static final int cE = 0x7f050011;
    public static final int cF = 0x7f050012;
    public static final int cG = 0x7f050021;
    public static final int cH = 0x7f020224;
    public static final int cI = 0x7f0202a1;
    public static final int cJ = 0x7f0202c3;
    public static final int cK = 0x7f0202c8;
    public static final int cL = 0x7f09042e;
    public static final int cM = 0x7f090448;
    public static final int cN = 0x7f090299;
    public static final int cO = 0x7f090297;
    public static final int cP = 0x7f09029a;
    public static final int cQ = 0x7f09029c;
    public static final int cR = 0x7f09029b;
    public static final int cS = 0x7f090298;
    public static final int cT = 0x7f0901be;
    public static final int cU = 0x7f0900be;
    public static final int cV = 0x7f090389;
    public static final int cW = 0x7f0901bc;
    public static final int cX = 0x7f0c004c;
    public static final int cY = 0x7f0c004d;
    public static final int cZ = 0x7f0c0053;
    public static final int ca = 0x7f0901bf;
    public static final int cb = 0x7f090339;
    public static final int cc = 0x7f09033a;
    public static final int cd = 0x7f0900b9;
    public static final int ce = 0x7f0900ba;
    public static final int cf = 0x7f09041f;
    public static final int cg = 0x7f0901cd;
    public static final int ch = 0x7f0900c7;
    public static final int ci = 0x7f090233;
    public static final int cj = 0x7f0901ce;
    public static final int ck = 0x7f0c020d;
    public static final int cl = 0x7f0b02a5;
    public static final int cm = 0x7f0b01b3;
    public static final int cn = 0x7f0b01b2;
    public static final int co = 0x7f0b01b0;
    public static final int cp = 0x7f0b01b1;
    public static final int cq = 0x7f0b01af;
    public static final int cr = 0x7f02016c;
    public static final int cs = 0x7f0b029f;
    public static final int ct = 0x7f0201fd;
    public static final int cu = 0x7f0201fe;
    public static final int cv = 0x7f0201ff;
    public static final int cw = 0x7f020200;
    public static final int cx = 0x7f02020d;
    public static final int cy = 0x7f02020e;
    public static final int cz = 0x7f02020f;
    public static Field d;
    public static final int dA = 0x7f02029e;
    public static final int dB = 0x7f0202b4;
    public static final int dC = 0x7f0202bd;
    public static final int dD = 0x7f0202cc;
    public static final int dE = 0x7f0202cd;
    public static final int dF = 0x7f0c0199;
    public static final int dG = 0x7f0c0210;
    public static final int dH = 0x7f02022a;
    public static final int dI = 0x7f0b04b9;
    public static final int dJ = 0x7f0b04ba;
    public static final int dK = 0x7f05000f;
    public static final int dL = 0x7f050010;
    public static final int dM = 0x7f0900f9;
    public static final int dN = 0x7f0900f8;
    public static final int dO = 0x7f0900f7;
    public static final int dP = 0x7f0900bf;
    public static final int dQ = 0x7f0900fe;
    public static final int dR = 0x7f0900c0;
    public static final int dS = 0x7f0b03a1;
    public static final int dT = 0x7f0b03c1;
    public static final int dU = 0x7f0b01f4;
    public static final int dV = 0x7f0b01fc;
    public static final int dW = 0x7f0b01fa;
    public static final int dX = 0x7f0b01f9;
    public static final int dY = 0x7f0b01fb;
    public static final int dZ = 0x7f0b01f1;
    public static final int da = 0x7f0c0052;
    public static final int db = 0x7f0c0051;
    public static final int dc = 0x7f0c004b;
    public static final int dd = 0x7f0c0147;
    public static final int de = 0x7f0a0113;
    public static final int df = 0x7f0a0114;
    public static final int dg = 0x7f0a010a;
    public static final int dh = 0x7f0a0105;
    public static final int di = 0x7f0a0106;
    public static final int dj = 0x7f0a0104;
    public static final int dk = 0x7f0a0103;
    public static final int dl = 0x7f0a0102;
    public static final int dm = 0x7f0a010f;
    public static final int dn = 0x7f0a010e;
    public static final int _flddo = 0x7f0a0110;
    public static final int dp = 0x7f0a0111;
    public static final int dq = 0x7f0a0117;
    public static final int dr = 0x7f0a0116;
    public static final int ds = 0x7f0a0115;
    public static final int dt = 0x7f0a023e;
    public static final int du = 0x7f0201fa;
    public static final int dv = 0x7f020234;
    public static final int dw = 0x7f020255;
    public static final int dx = 0x7f02025b;
    public static final int dy = 0x7f02027a;
    public static final int dz = 0x7f02027d;
    public static boolean e = false;
    public static final int eA = 0x7f09016a;
    public static final int eB = 0x7f090396;
    public static final int eC = 0x7f0901f1;
    public static final int eD = 0x7f0901f2;
    public static final int eE = 0x7f0903c6;
    public static final int eF = 0x7f09036c;
    public static final int eG = 0x7f09045c;
    public static final int eH = 0x7f0903c5;
    public static final int eI = 0x7f0903c4;
    public static final int eJ = 0x7f0903c3;
    public static final int eK = 0x7f090076;
    public static final int eL = 0x7f0903a4;
    public static final int eM = 0x7f0903a5;
    public static final int eN = 0x7f0903a6;
    public static final int eO = 0x7f0903a3;
    public static final int eP = 0x7f0903a7;
    public static final int eQ = 0x7f090281;
    public static final int eR = 0x7f090282;
    public static final int eS = 0x7f090078;
    public static final int eT = 0x7f090074;
    public static final int eU = 0x7f090077;
    public static final int eV = 0x7f090476;
    public static final int eW = 0x7f0903cf;
    public static final int eX = 0x7f0903ce;
    public static final int eY = 0x7f090075;
    public static final int eZ = 0x7f090073;
    public static final int ea = 0x7f0b01ea;
    public static final int eb = 0x7f0b01e9;
    public static final int ec = 0x7f0b01ec;
    public static final int ed = 0x7f0b01eb;
    public static final int ee = 0x7f0b01dc;
    public static final int ef = 0x7f0b01da;
    public static final int eg = 0x7f0b01f8;
    public static final int eh = 0x7f0b01fd;
    public static final int ei = 0x7f0b01ee;
    public static final int ej = 0x7f0b01e0;
    public static final int ek = 0x7f0b01e4;
    public static final int el = 0x7f0b01f0;
    public static final int em = 0x7f0b01f6;
    public static final int en = 0x7f0b01ef;
    public static final int eo = 0x7f0b01de;
    public static final int ep = 0x7f0b01ed;
    public static final int eq = 0x7f0b01e3;
    public static final int er = 0x7f0b01e5;
    public static final int es = 0x7f0100cb;
    public static final int et = 0x7f050000;
    public static final int eu = 0x7f050001;
    public static final int ev = 0x7f050015;
    public static final int ew = 0x7f120009;
    public static final int ex = 0x7f0b059a;
    public static final int ey = 0x7f0b0149;
    public static final int ez = 0x7f0b013d;
    public static Field f;
    public static final int fA = 0x7f0b04b3;
    public static final int fB = 0x7f0b04b4;
    public static final int fC = 0x7f0b04b1;
    public static final int fD = 0x7f0b04af;
    public static final int fE = 0x7f0c00e1;
    public static final int fF = 0x7f0c019a;
    public static final int fG = 0x7f0c017e;
    public static final int fH = 0x7f040061;
    public static final int fI = 0x7f04013f;
    public static final int fJ = 0x7f090256;
    public static final int fK = 0x7f090258;
    public static final int fL = 0x7f090255;
    public static final int fM = 0x7f0e0045;
    public static final int fN = 0x7f02013d;
    public static final int fO = 0x7f0201b9;
    public static final int fP = 0x7f0201f2;
    public static final int fQ = 0x7f020283;
    public static final int fR = 0x7f0202bf;
    public static nkz fS[];
    public static final int fT = 0x7f0902bd;
    public static Method fU;
    public static final int fV = 0x7f02019a;
    public static final int fa = 0x7f0b05c1;
    public static final int fb = 0x7f0b0587;
    public static final int fc = 0x7f0b0167;
    public static final int fd = 0x7f0b0158;
    public static final int fe = 0x7f0b0159;
    public static final int ff = 0x7f0b015d;
    public static final int fg = 0x7f0b015e;
    public static final int fh = 0x7f0b015c;
    public static final int fi = 0x7f0b0161;
    public static final int fj = 0x7f0b015f;
    public static final int fk = 0x7f0b0160;
    public static final int fl = 0x7f0b0162;
    public static final int fm = 0x7f120000;
    public static final int fn = 0x7f120005;
    public static final int fo = 0x7f0c016c;
    public static final int fp = 0x7f0c020f;
    public static final int fq = 0x7f09019a;
    public static final int fr = 0x7f0903b3;
    public static final int fs = 0x7f09019c;
    public static final int ft = 0x7f0903b7;
    public static final int fu = 0x7f090246;
    public static final int fv = 0x7f0903b5;
    public static final int fw = 0x7f0903b4;
    public static final int fx = 0x7f0903b6;
    public static final int fy = 0x7f0903b9;
    public static final int fz = 0x7f0b04b0;
    public static boolean g = false;
    public static Method h;
    public static boolean i = false;
    public static final int j = 0x7f090341;
    public static final int k = 0x7f090340;
    public static final int l = 0x7f090346;
    public static final int m = 0x7f09033f;
    public static final int n = 0x7f09033b;
    public static final int o = 0x7f090343;
    public static final int p = 0x7f090344;
    public static final int q = 0x7f090342;
    public static final int r = 0x7f09033d;
    public static final int s = 0x7f09033e;
    public static final int t = 0x7f090347;
    public static final int u = 0x7f090275;
    public static final int v = 0x7f090171;
    public static final int w = 0x7f0400be;
    public static final int x = 0x7f0400c0;
    public static final int y = 0x7f0400c1;
    public static final int z = 0x7f0400c3;
    public long a;

    public c()
    {
    }

    public c(long l1)
    {
        a = l1;
    }

    public static int a(float f1, int i1)
    {
        return Float.floatToIntBits(f1) + i1 * 31;
    }

    public static int a(int i1, CharSequence charsequence, int j1, int k1)
    {
        return a(i1, charsequence, 1, k1, null);
    }

    public static int a(int i1, CharSequence charsequence, int j1, int k1, CharSequence charsequence1)
    {
        if (i1 < j1 || i1 > k1)
        {
            a(((CharSequence) ((new StringBuilder()).append(charsequence).append(" must be between ").append(j1).append(" and ").append(k1).append(": ").append(i1))), charsequence1);
        }
        return i1;
    }

    public static int a(int i1, CharSequence charsequence, Collection collection)
    {
        return a(i1, charsequence, 0, collection.size() - 1, null);
    }

    public static int a(long l1)
    {
        int j1 = b.a(l1);
        int i1 = j1;
        if ((256L & l1) != 0L)
        {
            i1 = j1 | 0x100;
        }
        return i1;
    }

    public static int a(long l1, int i1)
    {
        return (int)(l1 >>> 32 ^ l1) + i1 * 31;
    }

    public static int a(Drawable drawable)
    {
        if (!c)
        {
            int i1;
            try
            {
                Method method = android/graphics/drawable/Drawable.getDeclaredMethod("getLayoutDirection", new Class[0]);
                b = method;
                method.setAccessible(true);
            }
            catch (NoSuchMethodException nosuchmethodexception) { }
            c = true;
        }
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        i1 = ((Integer)b.invoke(drawable, new Object[0])).intValue();
        return i1;
        drawable;
        b = null;
        return -1;
    }

    public static int a(Object obj, int i1)
    {
        int j1;
        if (obj == null)
        {
            j1 = 0;
        } else
        {
            j1 = obj.hashCode();
        }
        return j1 + i1 * 31;
    }

    public static int a(boolean flag, int i1)
    {
        int j1;
        if (flag)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        return j1 + i1 * 31;
    }

    public static long a(long l1, CharSequence charsequence)
    {
        if (l1 <= 0L)
        {
            a(((CharSequence) ((new StringBuilder()).append(charsequence).append(" must be positive: ").append(l1))), ((CharSequence) (null)));
        }
        return l1;
    }

    public static long a(InputStream inputstream, OutputStream outputstream)
    {
        return a(inputstream, outputstream, false, 1024);
    }

    public static long a(InputStream inputstream, OutputStream outputstream, boolean flag, int i1)
    {
        byte abyte0[];
        long l1;
        abyte0 = new byte[1024];
        l1 = 0L;
_L1:
        i1 = inputstream.read(abyte0, 0, 1024);
        if (i1 == -1)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        l1 += i1;
        outputstream.write(abyte0, 0, i1);
          goto _L1
        Exception exception;
        exception;
        if (flag)
        {
            a(((Closeable) (inputstream)));
            a(((Closeable) (outputstream)));
        }
        throw exception;
        if (flag)
        {
            a(((Closeable) (inputstream)));
            a(((Closeable) (outputstream)));
        }
        return l1;
    }

    public static Drawable a(CompoundButton compoundbutton)
    {
        if (!g)
        {
            try
            {
                Field field = android/widget/CompoundButton.getDeclaredField("mButtonDrawable");
                f = field;
                field.setAccessible(true);
            }
            catch (NoSuchFieldException nosuchfieldexception) { }
            g = true;
        }
        if (f == null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        compoundbutton = (Drawable)f.get(compoundbutton);
        return compoundbutton;
        compoundbutton;
        f = null;
        return null;
    }

    public static transient MediaFormat a(String s1, int i1, int j1, byte abyte0[][])
    {
        b.a(s1.startsWith("video/"), "mimeType");
        b.a(abyte0, "initializationData", null);
        MediaFormat mediaformat = new MediaFormat();
        mediaformat.setString("mime", s1);
        if (s1.toLowerCase(Locale.US).equals("video/avc"))
        {
            mediaformat.setInteger("max-input-size", ((i1 + 15) / 16) * ((j1 + 15) / 16) * 192);
        } else
        {
            mediaformat.setInteger("max-input-size", (i1 * j1 * 3) / 2);
        }
        mediaformat.setInteger("width", b.a(i1, "width"));
        mediaformat.setInteger("height", b.a(j1, "height"));
        for (i1 = 0; i1 < abyte0.length; i1++)
        {
            mediaformat.setByteBuffer((new StringBuilder(15)).append("csd-").append(i1).toString(), ByteBuffer.wrap(abyte0[i1]));
        }

        return mediaformat;
    }

    public static IllegalStateException a(CharSequence charsequence)
    {
        return new IllegalStateException(charsequence.toString());
    }

    public static IllegalStateException a(CharSequence charsequence, CharSequence charsequence1)
    {
        if (charsequence1 != null)
        {
            throw a(((CharSequence) ((new StringBuilder(charsequence)).append(": ").append(charsequence1))));
        } else
        {
            throw a(charsequence);
        }
    }

    public static IllegalStateException a(CharSequence charsequence, Throwable throwable)
    {
        return new IllegalStateException(charsequence.toString(), throwable);
    }

    public static Object a(int i1, long l1, long l2, float f1, long l3, 
            CharSequence charsequence, long l4, List list, long l5, Bundle bundle)
    {
        android.media.session.PlaybackState.Builder builder = new android.media.session.PlaybackState.Builder();
        builder.setState(i1, l1, f1, l4);
        builder.setBufferedPosition(l2);
        builder.setActions(l3);
        builder.setErrorMessage(charsequence);
        for (charsequence = list.iterator(); charsequence.hasNext(); builder.addCustomAction((android.media.session.PlaybackState.CustomAction)charsequence.next())) { }
        builder.setActiveQueueItemId(l5);
        builder.setExtras(bundle);
        return builder.build();
    }

    public static Object a(Object obj)
    {
        if (obj == null)
        {
            throw new NullPointerException();
        } else
        {
            return obj;
        }
    }

    public static Object a(Object obj, CharSequence charsequence, CharSequence charsequence1)
    {
        if (obj == null)
        {
            a(((CharSequence) ((new StringBuilder()).append(charsequence).append(" must not be null"))), charsequence1);
        }
        return obj;
    }

    public static Object a(Object obj, CharSequence charsequence, Object obj1, CharSequence charsequence1)
    {
        if (!b.e(obj, obj1))
        {
            a(((CharSequence) ((new StringBuilder()).append(charsequence).append(" must be equal to ").append(obj1))), charsequence1);
        }
        return obj;
    }

    public static String a(Context context, Uri uri)
    {
        long l1 = ContentUris.parseId(uri);
        return a(context, a(uri), l1);
    }

    public static String a(Context context, nkz nkz1, long l1)
    {
        Object obj;
        Cursor cursor;
        obj = null;
        cursor = context.getContentResolver().query(nkz1.b(), nkz1.c(), nkz1.a(), new String[] {
            String.valueOf(l1)
        }, null);
        if (cursor == null) goto _L2; else goto _L1
_L1:
        if (!cursor.moveToFirst()) goto _L2; else goto _L3
_L3:
        context = cursor.getString(0);
        nkz1 = context;
        if (cursor != null)
        {
            cursor.close();
            nkz1 = context;
        }
_L5:
        return nkz1;
_L2:
        nkz1 = obj;
        if (cursor == null) goto _L5; else goto _L4
_L4:
        cursor.close();
        return null;
        context;
        if (cursor != null)
        {
            cursor.close();
        }
        throw context;
    }

    public static String a(String s1, String s2)
    {
        return String.format(Locale.US, "case when %1$s > %2$s then %1$s else %2$s end", new Object[] {
            s1, s2
        });
    }

    public static transient String a(String s1, Object aobj[])
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(s1);
        stringbuilder.append('(');
        stringbuilder.append(TextUtils.join(",", aobj));
        stringbuilder.append(')');
        return stringbuilder.toString();
    }

    public static Collection a(Collection collection, CharSequence charsequence)
    {
        a(collection, charsequence, ((CharSequence) (null)));
        if (!collection.isEmpty())
        {
            a(((CharSequence) ((new StringBuilder()).append(charsequence).append(" must be empty"))), ((CharSequence) (null)));
        }
        return collection;
    }

    public static nkz a(Uri uri)
    {
        if (fS == null)
        {
            fS = (new nkz[] {
                new nky(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI), new nky(nlb.b), new nla(android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI), new nla(nlb.a)
            });
        }
        long l1 = ContentUris.parseId(uri);
        nkz ankz[] = fS;
        int j1 = ankz.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            nkz nkz1 = ankz[i1];
            if (uri.equals(ContentUris.withAppendedId(nkz1.b(), l1)))
            {
                return nkz1;
            }
        }

        return null;
    }

    public static void a(int i1, CharSequence charsequence, int j1, CharSequence charsequence1)
    {
        if (i1 != j1)
        {
            a(((CharSequence) ((new StringBuilder()).append(charsequence).append(" must be equal to ").append(j1))), charsequence1);
        }
    }

    public static void a(Context context, PendingIntent pendingintent)
    {
        ((AudioManager)context.getSystemService("audio")).unregisterMediaButtonEventReceiver(pendingintent);
    }

    public static void a(Drawable drawable, int i1)
    {
        if (drawable instanceof fi)
        {
            ((fi)drawable).setTint(i1);
        }
    }

    public static void a(Drawable drawable, ColorStateList colorstatelist)
    {
        if (drawable instanceof fi)
        {
            ((fi)drawable).setTintList(colorstatelist);
        }
    }

    public static void a(Drawable drawable, android.graphics.PorterDuff.Mode mode)
    {
        if (drawable instanceof fi)
        {
            ((fi)drawable).setTintMode(mode);
        }
    }

    public static void a(LayoutInflater layoutinflater, android.view.LayoutInflater.Factory2 factory2)
    {
        if (!e)
        {
            try
            {
                Field field = android/view/LayoutInflater.getDeclaredField("mFactory2");
                d = field;
                field.setAccessible(true);
            }
            catch (NoSuchFieldException nosuchfieldexception)
            {
                Log.e("LayoutInflaterCompatHC", (new StringBuilder("forceSetFactory2 Could not find field 'mFactory2' on class ")).append(android/view/LayoutInflater.getName()).append("; inflation may have unexpected results.").toString(), nosuchfieldexception);
            }
            e = true;
        }
        if (d == null)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        d.set(layoutinflater, factory2);
        return;
        factory2;
        Log.e("LayoutInflaterCompatHC", (new StringBuilder("forceSetFactory2 could not set the Factory2 on LayoutInflater ")).append(layoutinflater).append("; inflation may have unexpected results.").toString(), factory2);
        return;
    }

    public static void a(ay ay1)
    {
        if (fU == null)
        {
            try
            {
                fU = ay1.getClass().getMethod("noteStateNotSaved", new Class[0]);
            }
            catch (NoSuchMethodException nosuchmethodexception)
            {
                c();
            }
        }
        try
        {
            ((Method)p.a(fU)).invoke(ay1, new Object[0]);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ay ay1)
        {
            c();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ay ay1)
        {
            c();
        }
    }

    public static void a(Closeable closeable)
    {
        if (closeable == null)
        {
            break MISSING_BLOCK_LABEL_10;
        }
        closeable.close();
        return;
        closeable;
    }

    public static void a(Object obj, CharSequence charsequence, Object obj1)
    {
        a(obj, charsequence, obj1, ((CharSequence) (null)));
    }

    public static void a(Object obj, Object obj1)
    {
        ((RemoteControlClient)obj).setPlaybackPositionUpdateListener((android.media.RemoteControlClient.OnPlaybackPositionUpdateListener)obj1);
    }

    public static transient void a(StringBuilder stringbuilder, CharSequence acharsequence[])
    {
        int j1 = acharsequence.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            CharSequence charsequence = acharsequence[i1];
            if (!TextUtils.isEmpty(charsequence))
            {
                stringbuilder.append(charsequence).append(". ");
            }
        }

    }

    public static void a(boolean flag)
    {
        if (!flag)
        {
            throw new IllegalArgumentException();
        } else
        {
            return;
        }
    }

    public static void a(boolean flag, CharSequence charsequence)
    {
        if (!flag)
        {
            throw a(charsequence);
        } else
        {
            return;
        }
    }

    public static void a(boolean flag, CharSequence charsequence, boolean flag1)
    {
        if (flag)
        {
            a(((CharSequence) ((new StringBuilder()).append(charsequence).append(" must be equal to ").append(false))), ((CharSequence) (null)));
        }
    }

    public static void a(boolean flag, Object obj)
    {
        if (!flag)
        {
            throw new IllegalArgumentException(String.valueOf(obj));
        } else
        {
            return;
        }
    }

    public static boolean a(int i1)
    {
        return android.os.Build.VERSION.SDK_INT >= i1;
    }

    public static boolean a(Context context)
    {
        if (context != null)
        {
            return ox.a((AccessibilityManager)context.getSystemService("accessibility"));
        } else
        {
            return false;
        }
    }

    public static boolean a(MediaFormat mediaformat)
    {
        return mediaformat.getString("mime").startsWith("audio/");
    }

    public static boolean a(MediaFormat mediaformat, MediaFormat mediaformat1)
    {
        boolean flag = false;
        if (mediaformat == null)
        {
            if (mediaformat1 == null)
            {
                flag = true;
            }
        } else
        if (mediaformat1 != null)
        {
            return c(mediaformat).equals(c(mediaformat1));
        }
        return flag;
    }

    public static boolean a(String s1)
    {
        return c(s1).equals("audio");
    }

    public static int b()
    {
        int i1;
        try
        {
            i1 = Integer.parseInt(android.os.Build.VERSION.SDK);
        }
        catch (NumberFormatException numberformatexception)
        {
            lqh.a((new StringBuilder("Invalid version number: ")).append(android.os.Build.VERSION.SDK).toString());
            return 0;
        }
        return i1;
    }

    public static int b(int i1, CharSequence charsequence, int j1, CharSequence charsequence1)
    {
        if (i1 == j1)
        {
            a((new StringBuilder()).append(charsequence).append(" must not be equal to ").append(j1), charsequence1);
        }
        return i1;
    }

    public static kct b(Object obj)
    {
        return new kct(obj);
    }

    public static void b(Object obj, CharSequence charsequence, CharSequence charsequence1)
    {
        if (obj != null)
        {
            a((new StringBuilder()).append(charsequence).append(" must be null"), charsequence1);
        }
    }

    public static void b(boolean flag)
    {
        if (!flag)
        {
            throw new IllegalStateException();
        } else
        {
            return;
        }
    }

    public static boolean b(int i1)
    {
        return i1 > 0;
    }

    public static boolean b(Context context)
    {
        return android.os.Build.VERSION.SDK_INT >= 16 && a(context);
    }

    public static boolean b(MediaFormat mediaformat)
    {
        return mediaformat.getString("mime").startsWith("video/");
    }

    public static boolean b(Object obj, Object obj1)
    {
        return obj == obj1 || obj != null && obj.equals(obj1);
    }

    public static boolean b(String s1)
    {
        return c(s1).equals("video");
    }

    public static int c(int i1)
    {
        return i1 + 527;
    }

    public static Object c(MediaFormat mediaformat)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(mediaformat.getString("mime"));
        int i1;
        if (a(mediaformat))
        {
            arraylist.add(Integer.valueOf(mediaformat.getInteger("channel-count")));
        } else
        if (b(mediaformat))
        {
            arraylist.add(Integer.valueOf(mediaformat.getInteger("width")));
            arraylist.add(Integer.valueOf(mediaformat.getInteger("height")));
        } else
        {
            throw b.a("tried to summarize a non-audio/video MediaFormat");
        }
        i1 = 0;
        do
        {
            String s1 = String.format(Locale.US, "csd-%d", new Object[] {
                Integer.valueOf(i1)
            });
            if (mediaformat.containsKey(s1))
            {
                arraylist.add(mediaformat.getByteBuffer(s1).asReadOnlyBuffer());
                i1 = i1 + 1 + 1;
            } else
            {
                return arraylist;
            }
        } while (true);
    }

    public static String c(String s1)
    {
        int i1 = s1.indexOf('/');
        if (i1 == -1)
        {
            s1 = String.valueOf(s1);
            if (s1.length() != 0)
            {
                s1 = "Invalid mime type: ".concat(s1);
            } else
            {
                s1 = new String("Invalid mime type: ");
            }
            throw new IllegalArgumentException(s1);
        } else
        {
            return s1.substring(0, i1);
        }
    }

    public static void c()
    {
        throw new IllegalStateException("Could not access method FragmentManager#noteStateNotSaved");
    }

    public static boolean c(Object obj, Object obj1)
    {
        if (obj == null)
        {
            return obj1 == null;
        } else
        {
            return obj.equals(obj1);
        }
    }

    public static boolean d(Object obj, Object obj1)
    {
        if (obj == null || obj1 == null)
        {
            return obj == obj1;
        }
        if ((obj instanceof Object[]) && (obj1 instanceof Object[]))
        {
            return Arrays.deepEquals((Object[])obj, (Object[])obj1);
        }
        if ((obj instanceof boolean[]) && (obj1 instanceof boolean[]))
        {
            return Arrays.equals((boolean[])obj, (boolean[])obj1);
        }
        if ((obj instanceof byte[]) && (obj1 instanceof byte[]))
        {
            return Arrays.equals((byte[])obj, (byte[])obj1);
        }
        if ((obj instanceof char[]) && (obj1 instanceof char[]))
        {
            return Arrays.equals((char[])obj, (char[])obj1);
        }
        if ((obj instanceof double[]) && (obj1 instanceof double[]))
        {
            return Arrays.equals((double[])obj, (double[])obj1);
        }
        if ((obj instanceof float[]) && (obj1 instanceof float[]))
        {
            return Arrays.equals((float[])obj, (float[])obj1);
        }
        if ((obj instanceof int[]) && (obj1 instanceof int[]))
        {
            return Arrays.equals((int[])obj, (int[])obj1);
        }
        if ((obj instanceof long[]) && (obj1 instanceof long[]))
        {
            return Arrays.equals((long[])obj, (long[])obj1);
        }
        if ((obj instanceof short[]) && (obj1 instanceof short[]))
        {
            return Arrays.equals((short[])obj, (short[])obj1);
        } else
        {
            return obj.equals(obj1);
        }
    }

    public static boolean d(String s1)
    {
        if (b() < 9)
        {
            return false;
        } else
        {
            s1 = new File(s1);
            s1.setReadable(false, false);
            s1.setWritable(false, false);
            s1.setReadable(true, true);
            s1.setWritable(true, true);
            return true;
        }
    }

    public static String e(String s1)
    {
        Locale locale = Locale.US;
        String s2 = String.valueOf("case when (");
        return String.format(locale, (new StringBuilder(String.valueOf(s2).length() + 120 + String.valueOf(s1).length() + String.valueOf(s1).length() + String.valueOf(s1).length() + String.valueOf(s1).length() + String.valueOf(s1).length() + String.valueOf(s1).length() + String.valueOf(s1).length() + String.valueOf(s1).length() + String.valueOf(s1).length())).append(s2).append(s1).append(" >= %1$d and ").append(s1).append(" < %2$d) then ").append(s1).append(" * 1000 when (").append(s1).append(" >= %3$d and ").append(s1).append(" < %4$d) then ").append(s1).append(" when (").append(s1).append(" >= %5$d and ").append(s1).append(" < %6$d) then ").append(s1).append(" / 1000 else 0").append(" end").toString(), new Object[] {
            Long.valueOf(0x9660180L), Long.valueOf(0x70c81200L), Long.valueOf(0x24b675dc00L), Long.valueOf(0x1b88d865000L), Long.valueOf(0x8f68bc636000L), Long.valueOf(0x6b8e8d4a88000L)
        });
    }

    public long a(int i1, Bitmap bitmap, int j1)
    {
        if (bitmap == null || bitmap.getConfig() != android.graphics.Bitmap.Config.ARGB_8888)
        {
            throw new IllegalArgumentException("Bitmap passed must be non-null and ARGB_8888");
        }
        if (a == 0L)
        {
            throw new IllegalStateException("attempted to draw destroyed FrameSequenceState");
        } else
        {
            return FrameSequence.a(a, i1, bitmap, j1);
        }
    }

    public Bitmap a(int i1, int j1)
    {
        return Bitmap.createBitmap(i1, j1, android.graphics.Bitmap.Config.ARGB_8888);
    }

    public void a()
    {
        if (a != 0L)
        {
            FrameSequence.a(a);
            a = 0L;
        }
    }

    public void a(Bitmap bitmap)
    {
        bitmap.recycle();
    }
}

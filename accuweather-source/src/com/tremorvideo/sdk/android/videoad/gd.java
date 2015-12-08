// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import com.tremorvideo.sdk.android.c.aa;
import com.tremorvideo.sdk.android.c.ab;
import com.tremorvideo.sdk.android.c.ac;
import com.tremorvideo.sdk.android.c.ad;
import com.tremorvideo.sdk.android.c.ae;
import com.tremorvideo.sdk.android.c.af;
import com.tremorvideo.sdk.android.c.ag;
import com.tremorvideo.sdk.android.c.ah;
import com.tremorvideo.sdk.android.c.ai;
import com.tremorvideo.sdk.android.c.aj;
import com.tremorvideo.sdk.android.c.ak;
import com.tremorvideo.sdk.android.c.al;
import com.tremorvideo.sdk.android.c.am;
import com.tremorvideo.sdk.android.c.an;
import com.tremorvideo.sdk.android.c.ao;
import com.tremorvideo.sdk.android.c.ap;
import com.tremorvideo.sdk.android.c.aq;
import com.tremorvideo.sdk.android.c.ar;
import com.tremorvideo.sdk.android.c.as;
import com.tremorvideo.sdk.android.c.at;
import com.tremorvideo.sdk.android.c.au;
import com.tremorvideo.sdk.android.c.av;
import com.tremorvideo.sdk.android.c.aw;
import com.tremorvideo.sdk.android.c.c;
import com.tremorvideo.sdk.android.c.d;
import com.tremorvideo.sdk.android.c.e;
import com.tremorvideo.sdk.android.c.f;
import com.tremorvideo.sdk.android.c.g;
import com.tremorvideo.sdk.android.c.h;
import com.tremorvideo.sdk.android.c.i;
import com.tremorvideo.sdk.android.c.j;
import com.tremorvideo.sdk.android.c.k;
import com.tremorvideo.sdk.android.c.l;
import com.tremorvideo.sdk.android.c.m;
import com.tremorvideo.sdk.android.c.n;
import com.tremorvideo.sdk.android.c.o;
import com.tremorvideo.sdk.android.c.p;
import com.tremorvideo.sdk.android.c.q;
import com.tremorvideo.sdk.android.c.r;
import com.tremorvideo.sdk.android.c.t;
import com.tremorvideo.sdk.android.c.u;
import com.tremorvideo.sdk.android.c.v;
import com.tremorvideo.sdk.android.c.w;
import com.tremorvideo.sdk.android.c.x;
import com.tremorvideo.sdk.android.c.y;
import com.tremorvideo.sdk.android.c.z;
import java.io.File;
import java.io.InputStream;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.json.JSONObject;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            ct, ge, gf

public class gd
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final a f;
        public static final a g;
        public static final a h;
        public static final a i;
        public static final a j;
        private static final a m[];
        public final int k;
        public final String l;

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/tremorvideo/sdk/android/videoad/gd$a, s);
        }

        public static a[] values()
        {
            return (a[])m.clone();
        }

        static 
        {
            a = new a("ButtonText", 0, -1, "button_text_color");
            b = new a("ButtonTextShadow", 1, Color.argb(150, 0, 0, 0), "button_text_shadow_color");
            c = new a("WatermarkText", 2, -1, "watermark_text_color");
            d = new a("InputText", 3, 0xff000000, "input_text_color");
            e = new a("InputHintText", 4, 0xff888888, "input_hint_text_color");
            f = new a("DialogFill", 5, Color.argb(153, 0, 0, 0), "dialog_color");
            g = new a("DialogTitle", 6, -1, "dialog_title_color");
            h = new a("DialogTitleShadow", 7, Color.argb(153, 0, 0, 0), "dialog_title_shadow_color");
            i = new a("DialogText", 8, 0xff888888, "dialog_text_color");
            j = new a("DialogButtonText", 9, 0xff000000, "dialog_button_text_color");
            m = (new a[] {
                a, b, c, d, e, f, g, h, i, j
            });
        }

        private a(String s, int i1, int j1, String s1)
        {
            super(s, i1);
            k = j1;
            l = s1;
        }
    }

    public static final class b extends Enum
    {

        public static final b A;
        public static final b B;
        public static final b C;
        public static final b D;
        public static final b E;
        public static final b F;
        public static final b G;
        public static final b H;
        public static final b I;
        public static final b J;
        public static final b K;
        public static final b L;
        public static final b M;
        public static final b N;
        public static final b O;
        public static final b P;
        public static final b Q;
        public static final b R;
        public static final b S;
        public static final b T;
        public static final b U;
        public static final b V;
        private static final b Y[];
        public static final b a;
        public static final b b;
        public static final b c;
        public static final b d;
        public static final b e;
        public static final b f;
        public static final b g;
        public static final b h;
        public static final b i;
        public static final b j;
        public static final b k;
        public static final b l;
        public static final b m;
        public static final b n;
        public static final b o;
        public static final b p;
        public static final b q;
        public static final b r;
        public static final b s;
        public static final b t;
        public static final b u;
        public static final b v;
        public static final b w;
        public static final b x;
        public static final b y;
        public static final b z;
        public final byte W[];
        public final String X;

        public static b valueOf(String s1)
        {
            return (b)Enum.valueOf(com/tremorvideo/sdk/android/videoad/gd$b, s1);
        }

        public static b[] values()
        {
            return (b[])Y.clone();
        }

        static 
        {
            a = new b("IconWeb", 0, ae.a, "icon-web");
            b = new b("IconCall", 1, u.a, "icon-call");
            c = new b("IconMP3Store", 2, z.a, "icon-mp3store");
            d = new b("IconMarket", 3, w.a, "icon-market");
            e = new b("IconTwitter", 4, ad.a, "icon-twitter");
            f = new b("IconFacebook", 5, x.a, "icon-facebook");
            g = new b("IconTicket", 6, ac.a, "icon-ticket");
            h = new b("IconYoutube", 7, af.a, "icon-youtube");
            i = new b("IconSkip", 8, ab.a, "icon-skip");
            j = new b("IconSurvey", 9, w.a, "icon-survey");
            k = new b("IconShare", 10, aa.a, "icon-share");
            l = new b("IconCalendar", 11, t.a, "icon-calendar");
            m = new b("IconMap", 12, y.a, "icon-map");
            n = new b("IconCoupon", 13, v.a, "icon-coupon");
            o = new b("ButtonBarDivider", 14, com.tremorvideo.sdk.android.c.b.a, "buttonbar-divider");
            p = new b("ButtonBarLeft", 15, c.a, "buttonbar-left");
            q = new b("ButtonBarMiddle", 16, e.a, "buttonbar-middle");
            r = new b("ButtonBarRight", 17, g.a, "buttonbar-right");
            s = new b("ButtonBarLeftPress", 18, d.a, "buttonbar-left-press");
            t = new b("ButtonBarMiddlePress", 19, f.a, "buttonbar-middle-press");
            u = new b("ButtonBarRightPress", 20, h.a, "buttonbar-right-press");
            v = new b("ReplayBig", 21, ak.a, "replay-big");
            w = new b("WatermarkLeft", 22, av.a, "watermark-left");
            x = new b("WatermarkMiddle", 23, aw.a, "watermark-middle");
            y = new b("DialogTopLeft", 24, p.a, "dialog-top-left");
            z = new b("DialogTopMiddle", 25, q.a, "dialog-top-middle");
            A = new b("DialogTopRight", 26, r.a, "dialog-top-right");
            B = new b("DialogMiddleLeft", 27, n.a, "dialog-middle-left");
            C = new b("DialogMiddleRight", 28, o.a, "dialog-middle-right");
            D = new b("DialogBottomLeft", 29, i.a, "dialog-bottom-left");
            E = new b("DialogBottomMiddle", 30, j.a, "dialog-bottom-middle");
            F = new b("DialogBottomRight", 31, k.a, "dialog-bottom-right");
            G = new b("TwitterLeftTop", 32, as.a, "twitter-left-top");
            H = new b("TwitterLeftBottom", 33, ar.a, "twitter-left-bottom");
            I = new b("TwitterMiddle", 34, at.a, "twitter-middle");
            J = new b("TwitterRight", 35, au.a, "twitter-right");
            K = new b("InputLeft", 36, ag.a, "input-left");
            L = new b("InputMiddle", 37, ah.a, "input-middle");
            M = new b("InputRight", 38, ai.a, "input-right");
            N = new b("DialogButton", 39, l.a, "dialog-button");
            O = new b("DialogButtonPress", 40, m.a, "dialog-button-press");
            P = new b("SurveyLeft", 41, ap.a, "survey-left");
            Q = new b("SurveyMiddle", 42, aq.a, "survey-middle");
            R = new b("SurveyButtonLeft", 43, al.a, "survey-button-left");
            S = new b("SurveyButtonMiddle", 44, am.a, "survey-button-middle");
            T = new b("SurveyButtonPressLeft", 45, an.a, "survey-button-press-left");
            U = new b("SurveyButtonPressMiddle", 46, ao.a, "survey-button-press-middle");
            V = new b("InternalSurveySkip", 47, aj.a, "internal-survey-skip");
            Y = (new b[] {
                a, b, c, d, e, f, g, h, i, j, 
                k, l, m, n, o, p, q, r, s, t, 
                u, v, w, x, y, z, A, B, C, D, 
                E, F, G, H, I, J, K, L, M, N, 
                O, P, Q, R, S, T, U, V
            });
        }

        private b(String s1, int i1, byte abyte0[], String s2)
        {
            super(s1, i1);
            W = abyte0;
            X = s2;
        }
    }


    int a[];
    Dictionary b;

    public gd()
    {
        b = new Hashtable();
        a = new int[a.values().length];
    }

    public static Bitmap a(File file)
    {
        if (Integer.parseInt(android.os.Build.VERSION.SDK) < 4)
        {
            file = BitmapFactory.decodeFile(file.getAbsolutePath());
            if (ct.I() != 1.0F)
            {
                Bitmap bitmap = Bitmap.createScaledBitmap(file, Math.max(1, Math.round((float)file.getWidth() * ct.I())), Math.max(1, Math.round((float)file.getHeight() * ct.I())), true);
                file.recycle();
                return bitmap;
            } else
            {
                return file;
            }
        } else
        {
            return (new ge()).a(file);
        }
    }

    private static Bitmap a(ZipEntry zipentry, ZipFile zipfile)
    {
        if (zipentry == null)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        byte abyte0[];
        int k;
        zipfile = zipfile.getInputStream(zipentry);
        k = (int)zipentry.getSize();
        abyte0 = new byte[k];
        int i = 0;
_L2:
        int j = i + zipfile.read(abyte0, i, k - i);
        i = j;
        if (j < k) goto _L2; else goto _L1
_L1:
        zipfile = a(abyte0);
        return zipfile;
        zipfile;
        ct.a((new StringBuilder()).append("Error loading theme image: ").append(zipentry.getName()).toString(), zipfile);
        return null;
    }

    public static Bitmap a(byte abyte0[])
    {
        if (abyte0 == null)
        {
            return null;
        }
        if (Integer.parseInt(android.os.Build.VERSION.SDK) < 4)
        {
            abyte0 = BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length);
            if (ct.I() != 1.0F)
            {
                Bitmap bitmap = Bitmap.createScaledBitmap(abyte0, Math.max(1, Math.round((float)abyte0.getWidth() * ct.I())), Math.max(1, Math.round((float)abyte0.getHeight() * ct.I())), true);
                abyte0.recycle();
                return bitmap;
            } else
            {
                return abyte0;
            }
        } else
        {
            return (new gf()).a(abyte0);
        }
    }

    private boolean b(ZipFile zipfile)
    {
        boolean flag = false;
        ZipEntry zipentry;
        byte abyte0[];
        int i;
        try
        {
            zipentry = zipfile.getEntry("theme.json");
        }
        // Misplaced declaration of an exception variable
        catch (ZipFile zipfile)
        {
            ct.a("Error loading theme.json.", zipfile);
            return false;
        }
        if (zipentry == null)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        abyte0 = new byte[(int)zipentry.getSize()];
        zipfile.getInputStream(zipentry).read(abyte0);
        zipfile = new JSONObject(new String(abyte0));
        i = 0;
_L2:
        if (i >= a.values().length)
        {
            break; /* Loop/switch isn't completed */
        }
        a[i] = zipfile.getInt(a.values()[i].l);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        flag = true;
        return flag;
    }

    public int a(a a1)
    {
        return a[a1.ordinal()];
    }

    public Bitmap a(b b1)
    {
        if (b1 == null)
        {
            return null;
        } else
        {
            return (Bitmap)b.get(b1.X);
        }
    }

    public Bitmap a(String s)
    {
        return (Bitmap)b.get(s);
    }

    public void a()
    {
        boolean flag = false;
        int i = 0;
        int j;
        do
        {
            j = ((flag) ? 1 : 0);
            if (i >= b.values().length)
            {
                break;
            }
            b b1 = b.values()[i];
            b.put(b1.X, a(b1.W));
            i++;
        } while (true);
        for (; j < a.values().length; j++)
        {
            a[j] = a.values()[j].k;
        }

    }

    public void a(ZipFile zipfile)
    {
        boolean flag = false;
        for (int i = 0; i < a.values().length; i++)
        {
            a[i] = a.values()[i].k;
        }

        if (!b(zipfile))
        {
            a();
        } else
        {
            Enumeration enumeration = zipfile.entries();
            int j;
            do
            {
                j = ((flag) ? 1 : 0);
                if (!enumeration.hasMoreElements())
                {
                    break;
                }
                Object obj = (ZipEntry)enumeration.nextElement();
                String s = ((ZipEntry) (obj)).getName().toLowerCase();
                if (s.endsWith(".png"))
                {
                    s = s.replace(".png", "");
                    obj = a(((ZipEntry) (obj)), zipfile);
                    if (obj != null)
                    {
                        b.put(s, obj);
                    }
                }
            } while (true);
            while (j < b.values().length) 
            {
                zipfile = b.values()[j];
                if ((Bitmap)b.get(((b) (zipfile)).X) == null)
                {
                    Bitmap bitmap = a(((b) (zipfile)).W);
                    b.put(((b) (zipfile)).X, bitmap);
                }
                j++;
            }
        }
    }

    public void b()
    {
        for (Enumeration enumeration = b.keys(); enumeration.hasMoreElements(); ((Bitmap)b.get(enumeration.nextElement())).recycle()) { }
    }
}

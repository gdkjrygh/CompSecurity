// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.Activity;
import android.media.CamcorderProfile;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.a.c.d;
import com.roidapp.imagelib.ImageLibrary;
import com.roidapp.imagelib.filter.filterinfo.IFilterInfo;
import com.roidapp.imagelib.filter.groupinfo.IGroupInfo;
import com.roidapp.photogrid.common.af;
import com.roidapp.photogrid.common.bm;
import com.roidapp.videolib.b.u;
import com.roidapp.videolib.core.a.a;
import com.roidapp.videolib.core.a.b;
import com.roidapp.videolib.core.a.c;
import com.roidapp.videolib.core.e;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Calendar;

// Referenced classes of package com.roidapp.photogrid.release:
//            oi, ng, PhotoGridActivity, ph, 
//            hw, ih, ml, ap, 
//            ig, PhotoView, mm

public final class pg extends oi
{

    private int A;
    private int B;
    private String C;
    private boolean D;
    private String E;
    private u F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private ng r;
    private b s;
    private boolean t;
    private c u;
    private String v;
    private String w;
    private int x;
    private long y;
    private boolean z;

    public pg(Activity activity, ig aig[], ml ml1, PhotoView photoview, mm mm)
    {
        t = false;
        v = "Save";
        A = 0;
        B = 0;
        C = null;
        D = false;
        E = null;
        F = null;
        G = false;
        H = false;
        I = false;
        J = false;
        b = activity;
        c = aig;
        d = ml1;
        g = photoview;
        r = (ng)mm;
        if (((PhotoGridActivity)activity).h)
        {
            v = "Share";
        }
        s = new ph(this, ml1, activity);
    }

    static int a(pg pg1, int i1)
    {
        pg1.x = i1;
        return i1;
    }

    static long a(pg pg1, long l1)
    {
        pg1.y = l1;
        return l1;
    }

    static boolean a(pg pg1)
    {
        return pg1.z;
    }

    static String b(pg pg1)
    {
        return pg1.w;
    }

    static String c(pg pg1)
    {
        pg1.w = null;
        return null;
    }

    static String d(pg pg1)
    {
        return pg1.v;
    }

    static int e(pg pg1)
    {
        return pg1.A;
    }

    static int f(pg pg1)
    {
        return pg1.B;
    }

    static String g(pg pg1)
    {
        return pg1.C;
    }

    static boolean h(pg pg1)
    {
        return pg1.D;
    }

    static String i(pg pg1)
    {
        return pg1.E;
    }

    static u j(pg pg1)
    {
        return pg1.F;
    }

    static boolean k(pg pg1)
    {
        return pg1.I;
    }

    static boolean l(pg pg1)
    {
        return pg1.J;
    }

    static boolean m(pg pg1)
    {
        return pg1.G;
    }

    static boolean n(pg pg1)
    {
        return pg1.H;
    }

    public final void a()
    {
        char c1 = '\u0280';
        boolean flag3 = true;
        String s1 = com.roidapp.photogrid.release.hw.d(b);
        Object obj;
        Object obj1;
        Object obj2;
        boolean flag;
        int k1;
        boolean flag1;
        boolean flag2;
        if (s1.equalsIgnoreCase("smart"))
        {
            k1 = 4;
        } else
        if (s1.equalsIgnoreCase("high"))
        {
            k1 = 1;
        } else
        if (s1.equalsIgnoreCase("medium"))
        {
            k1 = 2;
        } else
        {
            k1 = 3;
        }
        obj = r.X;
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            Object obj3;
            StringBuilder stringbuilder;
            boolean flag4;
            if (!((String) (obj)).startsWith("Directed by "))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            flag4 = true;
            flag2 = flag1;
            flag1 = flag4;
        } else
        {
            flag1 = false;
            flag2 = true;
        }
        if (ih.C().x() != -20 || ih.C().y() != 4 || ih.C().z() != 4)
        {
            I = true;
        }
        if (ih.C().S() > 0.0F || ih.C().V() > 0.0F)
        {
            J = true;
        }
        obj1 = ih.C().ad();
        obj2 = ih.C().ac();
        obj = "";
        if (obj1 != null)
        {
            obj = (new StringBuilder()).append("").append("GroupId:").append(((IGroupInfo) (obj1)).c()).toString();
        }
        obj1 = obj;
        if (obj2 != null)
        {
            obj1 = (new StringBuilder()).append(((String) (obj))).append(",FilterId:").append(((IFilterInfo) (obj2)).c()).append(",Name").append(((IFilterInfo) (obj2)).b()).toString();
        }
        obj = "";
        if (r.N != null)
        {
            if (ih.C().b(r.N))
            {
                obj = ih.C();
                obj2 = r.N;
                if (((ih) (obj)).b(((String) (obj2))) && obj2 != null && (((String) (obj2)).contains("LovePhotoGrid") || ((String) (obj2)).contains("love_photo_grid")))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    obj = "default/";
                } else
                {
                    obj = "onlineMusic/";
                }
            } else
            {
                obj = "myMusic/";
            }
        }
        obj3 = b;
        stringbuilder = (new StringBuilder("Video/VideoActivity/Save/Analytics/")).append(r.L.length).append("/");
        if (r.N == null)
        {
            obj2 = "none/";
        } else
        {
            obj2 = "has/";
        }
        obj2 = stringbuilder.append(((String) (obj2))).append(r.V).append("/");
        if (r.V || r.N == null)
        {
            obj = "noneMusic/";
        }
        obj2 = ((StringBuilder) (obj2)).append(((String) (obj))).append(s1).append("/");
        if (com.a.c.d.a())
        {
            obj = "Yes";
        } else
        {
            obj = "No";
        }
        obj2 = ((StringBuilder) (obj2)).append(((String) (obj))).append("/").append(ih.C().ab()).append("/");
        if (flag1)
        {
            obj = (new StringBuilder("/signshow/")).append(flag2).toString();
        } else
        {
            obj = "";
        }
        af.b(((android.content.Context) (obj3)), ((StringBuilder) (obj2)).append(((String) (obj))).append("/").append(((String) (obj1))).toString());
        obj2 = b;
        obj3 = (new StringBuilder("Video/VideoActivity/Save/Start/")).append(v).append("/").append(r.L.length).append("/").append(r.T).append("/");
        if (r.N == null)
        {
            obj = "none/";
        } else
        {
            obj = "has/";
        }
        obj3 = ((StringBuilder) (obj3)).append(((String) (obj))).append(r.V).append("/").append(s1).append("/").append(ih.C().ab()).append("/");
        if (I)
        {
            obj = "BackgroundOn/";
        } else
        {
            obj = "BackgroundOff/";
        }
        obj3 = ((StringBuilder) (obj3)).append(((String) (obj)));
        if (J)
        {
            obj = "BorderOn/";
        } else
        {
            obj = "BorderOff/";
        }
        obj3 = ((StringBuilder) (obj3)).append(((String) (obj)));
        if (flag1)
        {
            obj = (new StringBuilder("/signshow/")).append(flag2).toString();
        } else
        {
            obj = "";
        }
        af.b(((android.content.Context) (obj2)), ((StringBuilder) (obj3)).append(((String) (obj))).append("/").append(((String) (obj1))).toString());
        A = r.L.length;
        B = r.T;
        C = r.N;
        D = r.V;
        E = s1;
        F = ih.C().ab();
        G = flag1;
        H = flag2;
        d.b(0, 1);
        float f1;
        float f2;
        float f3;
        float f4;
        String as[];
        int i1;
        int j1;
        int l1;
        long l2;
        long l3;
        if (r.N != null && !r.V)
        {
            if (r.R >= r.S)
            {
                r.R = 0;
                flag1 = true;
            } else
            if (!(new File(r.N)).exists())
            {
                r.R = 0;
                flag1 = true;
            } else
            {
                flag1 = false;
            }
        } else
        {
            flag1 = true;
        }
        w = null;
        obj1 = (new StringBuilder()).append(com.roidapp.photogrid.release.ap.a(b)).append("/PhotoGrid_Video_").append(Calendar.getInstance().getTimeInMillis()).append(".mp4").toString();
        obj = obj1;
        if (android.os.Build.VERSION.SDK_INT != 19)
        {
            break MISSING_BLOCK_LABEL_1319;
        }
        obj = new File(((String) (obj1)));
        (new FileOutputStream(((File) (obj)))).close();
        flag = true;
_L2:
        obj = obj1;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_1319;
        }
        obj = (new StringBuilder()).append(Environment.getExternalStorageDirectory().getAbsolutePath()).append("/").append(b.getString(0x7f07002e)).toString();
        obj2 = new File(((String) (obj)));
        if (!((File) (obj2)).exists() && !((File) (obj2)).mkdirs())
        {
            obj1 = Message.obtain();
            obj1.what = 701;
            obj1.obj = obj;
            q.sendMessage(((Message) (obj1)));
            return;
        }
        break; /* Loop/switch isn't completed */
        obj;
        ((Exception) (obj)).printStackTrace();
        flag = false;
        if (true) goto _L2; else goto _L1
_L1:
        com.roidapp.photogrid.release.ap.a(b, ((String) (obj)));
        obj = new File(((String) (obj)), (new StringBuilder("PhotoGrid_")).append(System.currentTimeMillis()).append(".mp4").toString());
        w = ((String) (obj1));
        obj = ((File) (obj)).getAbsolutePath();
        z = flag1;
        if (b != null)
        {
            b.isFinishing();
        }
        obj1 = CamcorderProfile.get(1);
        if (((CamcorderProfile) (obj1)).videoFrameHeight <= ((CamcorderProfile) (obj1)).videoFrameWidth) goto _L4; else goto _L3
_L3:
        j1 = ((CamcorderProfile) (obj1)).videoFrameWidth;
_L5:
        if (640 <= j1)
        {
            j1 = 640;
        }
        l1 = 0;
_L6:
        i1 = j1;
        if (l1 == 0)
        {
            break MISSING_BLOCK_LABEL_1470;
        }
        obj1 = com.a.c.d.b();
        if (obj1 != null)
        {
            if (obj1[0] > obj1[1])
            {
                i1 = obj1[1];
            } else
            {
                i1 = obj1[0];
            }
        } else
        {
            i1 = j1;
        }
        obj1 = b.getWindowManager().getDefaultDisplay();
        bm.a();
        l1 = bm.a(((android.view.Display) (obj1)));
        bm.a();
        j1 = bm.b(((android.view.Display) (obj1)));
        if (l1 <= j1)
        {
            j1 = l1;
        }
        if (i1 > j1)
        {
            i1 = j1;
        }
_L7:
        if (i1 <= 0)
        {
            j1 = c1;
        } else
        {
            j1 = i1;
        }
        if (j1 % 16 == 0)
        {
            break MISSING_BLOCK_LABEL_2329;
        }
        if (j1 >= 480)
        {
            j1 = 480;
            i1 = 480;
        } else
        if (j1 >= 320)
        {
            j1 = 320;
            i1 = 320;
        } else
        if (j1 >= 240)
        {
            j1 = 240;
            i1 = 240;
        } else
        {
            if (j1 < 144)
            {
                break MISSING_BLOCK_LABEL_2329;
            }
            j1 = 144;
            i1 = 144;
        }
_L8:
        if (flag1)
        {
            obj1 = r.P;
        } else
        {
            obj1 = r.N;
        }
        as = r.L;
        l3 = r.R;
        if (com.roidapp.videolib.core.e.a(ih.C().ab()))
        {
            l2 = 0xe4e1c0L;
        } else
        {
            l2 = r.T * r.L.length * 1000;
        }
        obj = new a(((String) (obj)), ((String) (obj1)), as, i1, j1, l3, l2, k1, ih.C().ax());
        obj.o = r.X;
        ((a) (obj)).a(ih.C().ab());
        ((a) (obj)).a(ih.C().aa());
        ((a) (obj)).a(ih.C().ae());
        ((a) (obj)).a(ih.C().ac());
        if (ih.C().S() == 0.0F && ih.C().V() == 0.0F && ih.C().ax())
        {
            af.c(b, (new StringBuilder("Video/VideoActivity/Save/Analytics2/0/0/")).append(ih.C().x()).append("/").append(ih.C().y()).append("/").append(ih.C().z()).toString());
            flag1 = flag3;
        } else
        {
            f1 = ih.C().S();
            af.c(b, (new StringBuilder("Video/VideoActivity/Save/Analytics2/")).append(f1).append("/").append(((a) (obj)).k).append("/").append(((a) (obj)).f).append("/").append(((a) (obj)).g).append("/").append(((a) (obj)).h).toString());
            flag1 = false;
        }
        obj1 = r.j.getLayoutParams();
        i1 = ((android.view.ViewGroup.LayoutParams) (obj1)).width;
        k1 = ((android.view.ViewGroup.LayoutParams) (obj1)).height;
        j1 = f;
        f2 = (float)f / (float)i1;
        k1 = (int)((float)k1 * f2);
        if (ih.C().t() < 1.0F)
        {
            f1 = j1;
        } else
        {
            f1 = k1;
        }
        f4 = ih.C().S();
        f3 = f4 / 100F;
        f4 /= 100F;
        obj1 = (new StringBuilder()).append(ImageLibrary.a().b(b));
        ImageLibrary.a();
        obj1 = ((StringBuilder) (obj1)).append(ImageLibrary.e()).toString();
        p = (new StringBuilder()).append(((String) (obj1))).append("/coverTemp.jpg").toString();
        obj.a = j1;
        obj.b = k1;
        obj.c = f2;
        obj.d = (float)f / (float)Math.min(i1, 720);
        obj.e = ih.C().A();
        obj.f = ih.C().x();
        obj.g = ih.C().y();
        obj.h = ih.C().z();
        obj.k = ih.C().V();
        obj.l = ih.C().S();
        obj.i = f3 * f1;
        obj.j = f1 * f4;
        obj.m = ((String) (obj1));
        obj.p = ih.C().af();
        obj.q = ih.C().ag();
        u = com.roidapp.videolib.a.a.a(b);
        u.a(flag1, ((a) (obj)), s);
        return;
_L4:
        j1 = ((CamcorderProfile) (obj1)).videoFrameHeight;
          goto _L5
        obj1;
        l1 = 1;
        j1 = 640;
          goto _L6
        obj1;
        i1 = 0;
          goto _L7
        i1 = j1;
          goto _L8
    }

    public final void a(int i1)
    {
    }

    public final int c()
    {
        return 10;
    }

    public final void g()
    {
        super.g();
        if (u != null)
        {
            u.a();
        }
    }
}

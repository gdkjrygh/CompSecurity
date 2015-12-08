// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.preference.PreferenceManager;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.roidapp.baselib.c.an;
import com.roidapp.baselib.g.b;
import com.roidapp.baselib.view.FixedDrawerLayout;
import com.roidapp.imagelib.ImageLibrary;
import com.roidapp.photogrid.common.n;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

// Referenced classes of package com.roidapp.photogrid.release:
//            a, n, StickerInfo, o, 
//            b, q, PhotoGridActivity, r, 
//            qx, PhotoView, ab, ao, 
//            qz, f, e, ih, 
//            k, m, l, d, 
//            g, h, i, j

public final class c extends DialogFragment
    implements android.view.View.OnClickListener, b, a
{

    private boolean A;
    private String B;
    private String C;
    private List D;
    private ArrayList E;
    private ArrayList F;
    private int G;
    private int H;
    private ArrayList I;
    private boolean J;
    private boolean K;
    private String L;
    private int M;
    private boolean N;
    private Handler O;
    int a[];
    private int b;
    private ImageButton c;
    private ImageButton d;
    private ImageView e;
    private TextView f;
    private FixedDrawerLayout g;
    private ListView h;
    private LinearLayout i;
    private PhotoGridActivity j;
    private PhotoView k;
    private RelativeLayout l;
    private q m;
    private LinearLayout n;
    private r o;
    private ImageView p;
    private Context q;
    private Animation r;
    private Animation s;
    private final int t = 15;
    private int u;
    private int v;
    private int w;
    private boolean x;
    private int y;
    private String z;

    public c()
    {
        b = 0;
        u = 15;
        v = -1;
        w = -1;
        x = false;
        y = 100;
        A = false;
        E = new ArrayList();
        F = new ArrayList();
        I = new ArrayList();
        N = false;
        a = new int[0];
        O = new com.roidapp.photogrid.release.n(this);
    }

    static int a(c c1, int i1)
    {
        c1.H = i1;
        return i1;
    }

    public static List a(Resources resources)
    {
        Object obj = com.roidapp.photogrid.release.a.c.a().c();
        ArrayList arraylist = new ArrayList();
        arraylist.add(new StickerInfo("freeCrop", resources.getString(0x7f07011e), "freeCrop", 0xffebebeb, 0x7f0203fc));
        if (obj == null)
        {
            arraylist.add(new StickerInfo("emoji", resources.getString(0x7f0703bb), "emoji", -1, 0x7f0203fb));
            arraylist.add(new StickerInfo("text", resources.getString(0x7f070121), "text", 0xff414141, 0x7f0203fd));
            return arraylist;
        }
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            StickerInfo stickerinfo = (StickerInfo)((Iterator) (obj)).next();
            if (stickerinfo.f && "emoji".equals(stickerinfo.i))
            {
                stickerinfo.c = resources.getString(0x7f0703bb);
                stickerinfo.a = -1;
                stickerinfo.b = "emoji";
                stickerinfo.d = 0x7f0203fb;
                stickerinfo.e = true;
                stickerinfo.f = true;
                arraylist.add(stickerinfo);
            } else
            if (stickerinfo.f && "text".equals(stickerinfo.i))
            {
                stickerinfo.c = resources.getString(0x7f070121);
                stickerinfo.a = 0xff414141;
                stickerinfo.b = "text";
                stickerinfo.d = 0x7f0203fd;
                stickerinfo.e = true;
                stickerinfo.f = true;
                arraylist.add(stickerinfo);
            } else
            if (!stickerinfo.f)
            {
                if (com.roidapp.photogrid.release.a.b.a(stickerinfo))
                {
                    stickerinfo.e = true;
                } else
                {
                    stickerinfo.e = false;
                }
                arraylist.add(stickerinfo);
            }
        } while (true);
        return arraylist;
    }

    static List a(c c1, List list)
    {
        c1.D = list;
        return list;
    }

    private void a()
    {
        File file;
        StringBuilder stringbuilder = (new StringBuilder()).append(com.roidapp.imagelib.b.c.a());
        ImageLibrary.a();
        file = new File(stringbuilder.append(ImageLibrary.d()).toString());
        break MISSING_BLOCK_LABEL_36;
        while (true) 
        {
            do
            {
                return;
            } while (!file.exists() || !file.isDirectory());
            ArrayList arraylist = new ArrayList();
            File afile[] = file.listFiles();
            if (afile != null)
            {
                int l1 = afile.length;
                for (int i1 = 0; i1 < l1; i1++)
                {
                    arraylist.add(afile[i1]);
                }

                Collections.sort(arraylist, new o(this));
                if (arraylist.size() > y)
                {
                    int i2 = arraylist.size();
                    int j2 = y;
                    for (int j1 = 0; j1 < i2 - j2; j1++)
                    {
                        File file1 = (File)arraylist.get(j1);
                        if (file1.isFile())
                        {
                            file1.delete();
                        }
                    }

                }
                if (arraylist.size() > 0)
                {
                    I.clear();
                    StickerInfo stickerinfo = (StickerInfo)D.get(G);
                    int k1 = arraylist.size() - 1;
                    while (k1 >= 0) 
                    {
                        File file2 = (File)arraylist.get(k1);
                        if (file2.isFile())
                        {
                            com.roidapp.photogrid.release.b b1 = new com.roidapp.photogrid.release.b();
                            b1.c = file2.getAbsolutePath();
                            b1.a = k1;
                            b1.i = stickerinfo;
                            b1.k = 2;
                            b1.f = true;
                            b1.b = F.contains(String.valueOf(b1.a));
                            I.add(b1);
                        }
                        k1--;
                    }
                }
            }
        }
    }

    private void a(StickerInfo stickerinfo)
    {
        int j1 = 0;
        String as[] = stickerinfo.k;
        if (as != null && as.length > 0)
        {
            String s1 = com.roidapp.photogrid.release.a.b.b(stickerinfo);
            int l1 = as.length;
            int i1 = 0;
            while (i1 < l1) 
            {
                String s2 = as[i1];
                int k1 = j1;
                if (s2 != null)
                {
                    k1 = j1;
                    if (!"".equals(s2))
                    {
                        com.roidapp.photogrid.release.b b1 = new com.roidapp.photogrid.release.b();
                        b1.e = (new StringBuilder()).append(s1).append(s2).toString();
                        b1.i = stickerinfo;
                        b1.j = j1;
                        b1.h = true;
                        b1.k = 3;
                        b1.g = true;
                        b1.b = F.contains((new StringBuilder()).append(s1).append(s2).toString());
                        I.add(b1);
                        k1 = j1 + 1;
                    }
                }
                i1++;
                j1 = k1;
            }
        }
    }

    static void a(c c1)
    {
        c1.p.startAnimation(c1.r);
        c1.p.setVisibility(8);
    }

    static void a(c c1, com.roidapp.photogrid.release.b b1)
    {
        c1.e(b1);
    }

    static void a(c c1, String s1)
    {
        c1.b(s1);
    }

    private void a(boolean flag)
    {
        p.setVisibility(0);
        m = new q(this);
        h.setAdapter(m);
        if (flag && K)
        {
            K = false;
            p.setVisibility(8);
            g.e(n);
        }
        if (flag && D != null)
        {
            String s1 = PreferenceManager.getDefaultSharedPreferences(j.getApplicationContext()).getString("deco_last_theme", null);
            if (s1 != null && s1 != L)
            {
                Iterator iterator = D.iterator();
                int i1 = 0;
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    StickerInfo stickerinfo = (StickerInfo)iterator.next();
                    if (s1.equals(stickerinfo.b))
                    {
                        if (stickerinfo.f || stickerinfo.e)
                        {
                            G = i1;
                            H = i1;
                            C = s1;
                            b(s1);
                            return;
                        }
                        break;
                    }
                    i1++;
                } while (true);
            }
        }
        G = M;
        H = M;
        b(L);
    }

    static LinearLayout b(c c1)
    {
        return c1.n;
    }

    static String b(c c1, String s1)
    {
        c1.C = s1;
        return s1;
    }

    private void b()
    {
        f.setText((new StringBuilder()).append((E.size() + 15) - u).append("/15 ").append(j.getResources().getString(0x7f0702e8)).toString());
    }

    private void b(String s1)
    {
_L2:
        return;
        if (x || s1 == null || s1.equals(B)) goto _L2; else goto _L1
_L1:
        A = false;
        int i1;
        if ("emoji".equals(s1))
        {
            com.roidapp.photogrid.common.n.c();
            a = com.roidapp.photogrid.common.n.a();
            i1 = 0;
        } else
        if ("text".equals(s1))
        {
            com.roidapp.photogrid.common.n.c();
            a = com.roidapp.photogrid.common.n.b();
            i1 = 0;
        } else
        if ("freeCrop".equals(s1))
        {
            i1 = 2;
        } else
        {
            i1 = 3;
        }
        i1;
        JVM INSTR tableswitch 2 3: default 72
    //                   2 207
    //                   3 233;
           goto _L3 _L4 _L5
_L3:
        d.setVisibility(8);
        b = 0;
_L7:
        synchronized (I)
        {
            I.clear();
        }
        G = H;
        m.notifyDataSetChanged();
        B = s1;
        b();
        x = true;
        l.setVisibility(0);
        obj = Message.obtain();
        obj.what = 1;
        obj.obj = s1;
        O.sendMessage(((Message) (obj)));
        return;
_L4:
        d.setImageResource(0x7f020226);
        d.setVisibility(0);
        b = 2;
        continue; /* Loop/switch isn't completed */
_L5:
        b = 3;
        if (!com.roidapp.photogrid.release.a.b.a((StickerInfo)D.get(H)))
        {
            if (j != null && !j.isFinishing())
            {
                s1 = com.roidapp.photogrid.release.a.b.a((StickerInfo)D.get(H), this);
                obj = getFragmentManager().beginTransaction();
                ((FragmentTransaction) (obj)).add(s1, "download_tag");
                ((FragmentTransaction) (obj)).commitAllowingStateLoss();
                return;
            }
            continue; /* Loop/switch isn't completed */
        }
        d.setImageResource(0x7f02037b);
        d.setVisibility(0);
        if (true) goto _L7; else goto _L6
_L6:
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
        if (true) goto _L2; else goto _L8
_L8:
    }

    static FixedDrawerLayout c(c c1)
    {
        return c1.g;
    }

    private void c(String s1)
    {
        q = null;
        q = j.createPackageContext(s1, 2);
        Object obj1 = q.getAssets().open("icons.xml");
        Object obj = XmlPullParserFactory.newInstance();
        ((XmlPullParserFactory) (obj)).setNamespaceAware(true);
        obj = ((XmlPullParserFactory) (obj)).newPullParser();
        ((XmlPullParser) (obj)).setInput(((java.io.InputStream) (obj1)), "UTF-8");
        int j1 = ((XmlPullParser) (obj)).getEventType();
        obj1 = (StickerInfo)D.get(G);
        int i1 = 0;
        int k1;
        for (; j1 != 1; j1 = k1)
        {
            j1 = i1;
            if (((XmlPullParser) (obj)).getEventType() == 2)
            {
                j1 = i1;
                if ("element".equals(((XmlPullParser) (obj)).getName()))
                {
                    String s2 = ((XmlPullParser) (obj)).getAttributeValue(0);
                    j1 = i1;
                    if (s2 != null)
                    {
                        j1 = i1;
                        if (!"".equals(s2))
                        {
                            com.roidapp.photogrid.release.b b1 = new com.roidapp.photogrid.release.b();
                            b1.d = s1;
                            b1.e = s2;
                            b1.i = ((StickerInfo) (obj1));
                            b1.j = i1;
                            b1.k = 1;
                            b1.g = true;
                            b1.b = F.contains(s2);
                            I.add(b1);
                            j1 = i1 + 1;
                        }
                    }
                }
            }
            k1 = ((XmlPullParser) (obj)).next();
            i1 = j1;
        }

    }

    private boolean c()
    {
        int j1 = D.size();
        int i1 = 0;
        do
        {
label0:
            {
                if (i1 < j1)
                {
                    StickerInfo stickerinfo = (StickerInfo)D.get(i1);
                    if (stickerinfo == null || !L.equals(stickerinfo.b))
                    {
                        break label0;
                    }
                    M = i1;
                }
                return true;
            }
            i1++;
        } while (true);
    }

    static ImageView d(c c1)
    {
        return c1.p;
    }

    private void d()
    {
        if (!N)
        {
            N = true;
            if (o != null && o.isAdded())
            {
                o.b();
            }
            if (j != null && !j.h())
            {
                dismiss();
            }
            if (j != null && !j.isFinishing())
            {
                j.i = false;
                j.a(true, false);
                return;
            }
        }
    }

    private void e(com.roidapp.photogrid.release.b b1)
    {
        if (b1.f)
        {
            File file = new File(b1.c);
            if (file.isFile())
            {
                qx.a().b(file.getAbsolutePath());
                k.a(file.getAbsolutePath());
                file.delete();
            }
        }
        b(b1);
        I.remove(b1);
        a(k.k());
        b();
        k.invalidate();
        if (o != null)
        {
            o.b(false);
        }
    }

    static void e(c c1)
    {
        c1.p.startAnimation(c1.s);
        c1.p.setVisibility(0);
    }

    static String f(c c1)
    {
        return c1.C;
    }

    static q g(c c1)
    {
        return c1.m;
    }

    static List h(c c1)
    {
        return c1.D;
    }

    static void i(c c1)
    {
        c1.d();
    }

    static void j(c c1)
    {
        boolean flag = false;
        StickerInfo stickerinfo = (StickerInfo)c1.D.get(c1.G);
        com.roidapp.photogrid.release.a.b.c(stickerinfo);
        c1.B = "";
        c1.o = null;
        ArrayList arraylist;
        ArrayList arraylist1;
        Iterator iterator;
        if (c1.M > 0 && c1.M < c1.D.size())
        {
            c1.H = c1.M;
            c1.C = ((StickerInfo)c1.D.get(c1.M)).b;
        } else
        {
            c1.H = 0;
            c1.C = ((StickerInfo)c1.D.get(0)).b;
        }
        stickerinfo.e = false;
        c1.b(c1.C);
        arraylist = new ArrayList();
        arraylist1 = new ArrayList();
        iterator = c1.E.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.roidapp.photogrid.release.b b1 = (com.roidapp.photogrid.release.b)iterator.next();
            if (stickerinfo.equals(b1.i))
            {
                flag = true;
                arraylist.add(b1);
                arraylist1.add(b1.e);
            }
        } while (true);
        if (flag)
        {
            c1.E.removeAll(arraylist);
            c1.F.removeAll(arraylist1);
        }
        c1.k.c(stickerinfo.b);
        c1.k.a();
        c1.a(c1.k.k());
        c1.b();
    }

    static void k(c c1)
    {
        int i1 = 0;
        ArrayList arraylist = c1.I;
        arraylist;
        JVM INSTR monitorenter ;
        c1.b;
        JVM INSTR tableswitch 0 3: default 530
    //                   0 197
    //                   1 319
    //                   2 439
    //                   3 446;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        Object obj;
        c1.g.setBackgroundColor(((StickerInfo)c1.D.get(c1.G)).a);
        com.roidapp.baselib.c.b.g("Click", ((StickerInfo)c1.D.get(c1.G)).b);
        if (c1.o != null && c1.o.isAdded())
        {
            break MISSING_BLOCK_LABEL_497;
        }
        c1.o = new r();
        c1.o.a(c1.v, c1.w, c1);
        c1.o.a(c1.b, c1.I, c1.q, c1.A);
        obj = c1.o;
        if (c1.j != null && !c1.j.h() && !c1.j.isFinishing()) goto _L7; else goto _L6
_L6:
        return;
_L2:
        int ai[];
        int k1;
        obj = (StickerInfo)c1.D.get(c1.G);
        ai = c1.a;
        k1 = ai.length;
        int j1 = 0;
_L9:
        if (i1 >= k1) goto _L1; else goto _L8
_L8:
        int l1 = ai[i1];
        com.roidapp.photogrid.release.b b1 = new com.roidapp.photogrid.release.b();
        b1.a = l1;
        b1.j = j1;
        b1.k = 0;
        b1.i = ((StickerInfo) (obj));
        b1.b = c1.F.contains(String.valueOf(b1.a));
        c1.I.add(b1);
        j1++;
        i1++;
          goto _L9
_L3:
        if (c1.b != 1) goto _L1; else goto _L10
_L10:
        obj = c1.z;
        c1.c((new StringBuilder("com.roidapp.photogrid.plugin.stickers")).append(((String) (obj))).toString());
          goto _L1
        android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
        namenotfoundexception;
        namenotfoundexception.printStackTrace();
        if (c1.j != null && !c1.j.isFinishing())
        {
            ab ab1 = new ab();
            ab1.a(((String) (obj)));
            ab1.a(false);
            if (c1.isAdded())
            {
                com.roidapp.baselib.c.n.a(c1.getChildFragmentManager(), ab1, "AddDecoViewTipDialogFragment");
            }
        }
          goto _L1
        c1;
        arraylist;
        JVM INSTR monitorexit ;
        throw c1;
        obj;
        ((IOException) (obj)).printStackTrace();
          goto _L1
        obj;
        ((XmlPullParserException) (obj)).printStackTrace();
          goto _L1
_L4:
        c1.a();
          goto _L1
_L5:
        c1.a((StickerInfo)c1.D.get(c1.G));
          goto _L1
_L7:
        if (!c1.isAdded()) goto _L6; else goto _L11
_L11:
        c1.getChildFragmentManager().beginTransaction().replace(0x7f0d002e, ((android.support.v4.app.Fragment) (obj))).commitAllowingStateLoss();
          goto _L6
        c1.o.a(c1.b, c1.I, c1.q, c1.A);
        c1.o.a();
          goto _L6
    }

    static RelativeLayout l(c c1)
    {
        return c1.l;
    }

    static boolean m(c c1)
    {
        c1.x = false;
        return false;
    }

    static PhotoGridActivity n(c c1)
    {
        return c1.j;
    }

    static int o(c c1)
    {
        return c1.G;
    }

    public final void a(int i1)
    {
        u = 15 - i1;
    }

    public final void a(com.roidapp.photogrid.release.b b1)
    {
        E.add(b1);
        if (b1.g || b1.h)
        {
            F.add(b1.e);
        } else
        {
            F.add(String.valueOf(b1.a));
        }
        b();
    }

    public final void a(String s1)
    {
label0:
        {
label1:
            {
                if (D != null && D.size() > G)
                {
                    if (!com.roidapp.photogrid.release.a.b.a(s1, com.roidapp.photogrid.release.a.b.b((StickerInfo)D.get(H))))
                    {
                        break label0;
                    }
                    if (com.roidapp.photogrid.release.a.b.a((StickerInfo)D.get(H)))
                    {
                        break label1;
                    }
                    an.a(getActivity(), 0x7f070037);
                }
                return;
            }
            ((StickerInfo)D.get(H)).e = true;
            b(C);
            m.notifyDataSetChanged();
            com.roidapp.baselib.c.b.g("DownloadSuccess", ((StickerInfo)D.get(H)).b);
            return;
        }
        an.a(getActivity(), 0x7f070037);
    }

    public final void b(com.roidapp.photogrid.release.b b1)
    {
        if (!b1.g && !b1.h) goto _L2; else goto _L1
_L1:
label0:
        {
            Iterator iterator = E.iterator();
            com.roidapp.photogrid.release.b b2;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                b2 = (com.roidapp.photogrid.release.b)iterator.next();
            } while (!b1.e.equals(b2.e));
            E.remove(b2);
            F.remove(b1.e);
        }
_L4:
        b();
        return;
_L2:
        Iterator iterator1 = E.iterator();
        com.roidapp.photogrid.release.b b3;
        do
        {
            if (!iterator1.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            b3 = (com.roidapp.photogrid.release.b)iterator1.next();
        } while (b3.a != b1.a);
        E.remove(b3);
        F.remove(String.valueOf(b1.a));
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void c(com.roidapp.photogrid.release.b b1)
    {
        android.app.AlertDialog.Builder builder;
        Iterator iterator;
        if (j == null || j.isFinishing() || k == null)
        {
            return;
        }
        builder = new android.app.AlertDialog.Builder(j);
        iterator = k.j().iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        qz qz1 = (qz)(ao)iterator.next();
        if (!b1.f || !b1.c.equalsIgnoreCase(qz1.K)) goto _L4; else goto _L3
_L3:
        boolean flag = true;
_L6:
        if (flag)
        {
            builder.setMessage(j.getResources().getString(0x7f070179));
            builder.setPositiveButton(0x1040013, new f(this, b1)).setNegativeButton(0x1040009, new e(this));
            builder.create().show();
            return;
        } else
        {
            e(b1);
            return;
        }
_L2:
        flag = false;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final boolean d(com.roidapp.photogrid.release.b b1)
    {
        return !b1.b && E.size() >= u;
    }

    public final void onAttach(Activity activity)
    {
        j = (PhotoGridActivity)activity;
        K = j.E;
        if (j.E)
        {
            j.E = false;
        }
        k = j.O();
        if (j == null || j.isFinishing())
        {
            d();
        } else
        {
            DisplayMetrics displaymetrics = j.getResources().getDisplayMetrics();
            float f1 = displaymetrics.density;
            if ((float)displaymetrics.widthPixels / displaymetrics.density > 720F)
            {
                v = (int)((float)(displaymetrics.widthPixels / 4) - f1 * 40F);
            } else
            {
                v = (int)((float)(displaymetrics.widthPixels / 4) - f1 * 20F);
            }
            w = v;
        }
        super.onAttach(activity);
    }

    public final void onCancel(DialogInterface dialoginterface)
    {
        if (j != null && !j.isFinishing())
        {
            j.i = false;
            j.a(true, false);
        }
        super.onCancel(dialoginterface);
    }

    public final void onClick(View view)
    {
        boolean flag = true;
        view.getId();
        JVM INSTR tableswitch 2131558441 2131558444: default 36
    //                   2131558441 390
    //                   2131558442 562
    //                   2131558443 36
    //                   2131558444 37;
           goto _L1 _L2 _L3 _L1 _L4
_L1:
        return;
_L4:
        Object obj1;
        ArrayList arraylist;
        view = null;
        obj1 = ih.C().ao();
        if (obj1 == null)
        {
            obj1 = new ArrayList();
        }
        arraylist = new ArrayList();
        Iterator iterator = E.iterator();
_L6:
        Object obj;
        com.roidapp.photogrid.release.b b1;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        b1 = (com.roidapp.photogrid.release.b)iterator.next();
        obj = new qz(j);
        obj.L = b1.a;
        obj.U = b1.j;
        obj.Q = b1.e;
        obj.V = b1.k;
        if (b1.d != null)
        {
            obj.R = b1.d;
            if (!((List) (obj1)).contains(b1.d))
            {
                ((List) (obj1)).add(b1.d);
            }
        }
        if (b1.f)
        {
            obj.J = true;
            obj.K = b1.c;
        }
        obj.S = b1.i;
        obj.T = b1.i.b;
        if (b1.h)
        {
            obj.S = b1.i;
            obj.T = b1.i.b;
        }
        arraylist.add(obj);
        view = ((View) (obj));
        if (true) goto _L6; else goto _L5
_L5:
        obj = view;
_L7:
        if (k != null && obj != null)
        {
            k.a(arraylist);
            ih.C().l(((List) (obj1)));
        }
        d();
        return;
        obj;
        view = null;
_L8:
        ((OutOfMemoryError) (obj)).printStackTrace();
        obj = view;
        if (j != null)
        {
            obj = view;
            if (!j.isFinishing())
            {
                obj = new android.app.AlertDialog.Builder(j);
                ((android.app.AlertDialog.Builder) (obj)).setMessage(getResources().getString(0x7f0702f4));
                ((android.app.AlertDialog.Builder) (obj)).setPositiveButton(0x1040013, new k(this));
                ((android.app.AlertDialog.Builder) (obj)).create().show();
                obj = view;
            }
        }
          goto _L7
_L2:
        switch (b)
        {
        default:
            return;

        case 1: // '\001'
            view = Uri.parse((new StringBuilder("package:com.roidapp.photogrid.plugin.stickers")).append(z).toString());
            obj = new Intent("android.intent.action.DELETE");
            ((Intent) (obj)).setData(view);
            startActivity(((Intent) (obj)));
            return;

        case 2: // '\002'
            if (A)
            {
                flag = false;
            }
            A = flag;
            if (o != null)
            {
                o.a(A);
                return;
            }
            break;

        case 3: // '\003'
            (new android.app.AlertDialog.Builder(getActivity())).setTitle(0x7f0703bf).setMessage(0x7f07038a).setPositiveButton(0x7f070049, new m(this)).setNegativeButton(0x7f070264, new l(this)).show();
            return;
        }
          goto _L1
_L3:
        F.clear();
        E.clear();
        d();
        return;
        OutOfMemoryError outofmemoryerror;
        outofmemoryerror;
        view = ((View) (obj));
        obj = outofmemoryerror;
          goto _L8
        obj;
          goto _L8
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030002, viewgroup, false);
        if (layoutinflater == null)
        {
            d();
        } else
        {
            c = (ImageButton)layoutinflater.findViewById(0x7f0d002c);
            c.setOnClickListener(this);
            d = (ImageButton)layoutinflater.findViewById(0x7f0d0029);
            d.setOnClickListener(this);
            e = (ImageView)layoutinflater.findViewById(0x7f0d002a);
            e.setOnClickListener(this);
            f = (TextView)layoutinflater.findViewById(0x7f0d002b);
            if (j != null && !j.isFinishing())
            {
                f.setText((new StringBuilder()).append((E.size() + 15) - u).append("/15 ").append(j.getResources().getString(0x7f0702e8)).toString());
            }
            l = (RelativeLayout)layoutinflater.findViewById(0x7f0d0032);
            g = (FixedDrawerLayout)layoutinflater.findViewById(0x7f0d002d);
            h = (ListView)layoutinflater.findViewById(0x7f0d0031);
            n = (LinearLayout)layoutinflater.findViewById(0x7f0d002f);
            i = (LinearLayout)layoutinflater.findViewById(0x7f0d0030);
            i.setOnClickListener(this);
            p = (ImageView)layoutinflater.findViewById(0x7f0d0033);
            p.setOnTouchListener(new d(this));
            p.setOnClickListener(this);
            g.setFocusableInTouchMode(false);
            g.a(new g(this));
            h.setOnScrollListener(new h(this));
            h.setOnItemClickListener(new i(this));
            getDialog().setOnKeyListener(new j(this));
            r = new TranslateAnimation(1, 0.0F, 1, -1F, 1, 0.0F, 1, 0.0F);
            r.setDuration(200L);
            s = new TranslateAnimation(1, -1F, 1, 0.0F, 1, 0.0F, 1, 0.0F);
            s.setDuration(200L);
        }
        J = true;
        return layoutinflater;
    }

    public final void onDestroy()
    {
        if (j != null)
        {
            PreferenceManager.getDefaultSharedPreferences(j.getApplicationContext()).edit().putString("deco_last_theme", B).apply();
        }
        super.onDestroy();
    }

    public final void onResume()
    {
        super.onResume();
        if (j == null)
        {
            j = (PhotoGridActivity)getActivity();
        }
        if (k == null && j != null)
        {
            k = j.O();
        }
        if (j != null && !j.isFinishing() && k != null)
        {
            if (D == null || D.size() == 0)
            {
                D = a(getResources());
                Object obj = new ArrayList();
                ArrayList arraylist = new ArrayList();
                ArrayList arraylist1 = new ArrayList();
                if (D != null && D.size() > 0)
                {
                    for (Iterator iterator = D.iterator(); iterator.hasNext();)
                    {
                        StickerInfo stickerinfo = (StickerInfo)iterator.next();
                        if (stickerinfo.e)
                        {
                            arraylist.add(stickerinfo);
                        } else
                        {
                            arraylist1.add(stickerinfo);
                        }
                    }

                }
                ((ArrayList) (obj)).addAll(arraylist);
                ((ArrayList) (obj)).addAll(arraylist1);
                D = ((List) (obj));
                M = 0;
                L = "freeCrop";
                obj = D.iterator();
                for (int i1 = 0; ((Iterator) (obj)).hasNext(); i1++)
                {
                    if ("emoji".equals(((StickerInfo)((Iterator) (obj)).next()).i))
                    {
                        M = i1;
                        L = "emoji";
                    }
                }

            }
            c();
            a(k.k());
            b();
            if (b == 1)
            {
                String s1 = (new StringBuilder("com.roidapp.photogrid.plugin.stickers")).append(z).toString();
                boolean flag;
                if (j == null || j.isFinishing())
                {
                    flag = false;
                } else
                {
                    flag = com.roidapp.baselib.c.n.a(j, s1);
                }
                if (!flag)
                {
                    G = M;
                    H = M;
                    C = L;
                    b(C);
                }
            }
            if (m != null)
            {
                m.notifyDataSetChanged();
                return;
            }
            if (J)
            {
                a(true);
                J = false;
                return;
            } else
            {
                a(false);
                return;
            }
        } else
        {
            dismiss();
            return;
        }
    }
}

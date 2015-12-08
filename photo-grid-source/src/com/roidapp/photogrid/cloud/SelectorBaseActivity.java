// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.widget.GridView;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.roidapp.baselib.c.b;
import com.roidapp.cloudlib.ae;
import com.roidapp.cloudlib.af;
import com.roidapp.cloudlib.ah;
import com.roidapp.cloudlib.ai;
import com.roidapp.cloudlib.common.a;
import com.roidapp.cloudlib.t;
import com.roidapp.photogrid.MainPage;
import com.roidapp.photogrid.b.f;
import com.roidapp.photogrid.common.al;
import com.roidapp.photogrid.common.an;
import com.roidapp.photogrid.common.az;
import com.roidapp.photogrid.common.c;
import com.roidapp.photogrid.common.y;
import com.roidapp.photogrid.release.FaceDetectorActivity;
import com.roidapp.photogrid.release.ImageEditFreeCropActivity;
import com.roidapp.photogrid.release.ParentActivity;
import com.roidapp.photogrid.release.PhotoGridActivity;
import com.roidapp.photogrid.release.ig;
import com.roidapp.photogrid.release.ih;
import com.roidapp.photogrid.release.rf;
import com.roidapp.photogrid.video.VideoPictureEditActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            bi, bn, bo, bp, 
//            bq, bj, bk, bl, 
//            bm

public abstract class SelectorBaseActivity extends ParentActivity
    implements ae, af, ai
{

    private static int y = 7;
    private boolean A;
    private boolean B;
    private String C;
    private boolean D;
    private final String a = "PhotoGrid_SelectorBaseActivity";
    protected t b;
    protected ProgressBar c;
    protected ImageButton d;
    protected LinearLayout e;
    protected TextView f;
    protected TextView g;
    protected HorizontalScrollView h;
    protected TextView i;
    protected TextView j;
    protected HashMap k;
    protected List l;
    protected int m;
    protected List n;
    protected int o;
    protected al p;
    protected LinearLayout q;
    protected android.view.View.OnTouchListener r;
    protected Handler s;
    private LinearLayout z;

    public SelectorBaseActivity()
    {
        b = null;
        n = new ArrayList();
        p = null;
        A = false;
        B = false;
        D = false;
        r = new bi(this);
        s = new bn(this);
    }

    private void a(ig ig1)
    {
        Object obj;
        try
        {
            rf.a();
            obj = rf.a(ig1);
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            exception = null;
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            outofmemoryerror.printStackTrace();
            outofmemoryerror = null;
        }
        if (obj != null && !((Bitmap) (obj)).isRecycled())
        {
            View view = LayoutInflater.from(this).inflate(0x7f030121, null);
            Object obj2 = (ImageButton)view.findViewById(0x7f0d04bb);
            String s1 = (new StringBuilder()).append(m).append("#").append(ig1.n).toString();
            m = m + 1;
            ((ImageButton) (obj2)).setTag(s1);
            ((ImageButton) (obj2)).setOnClickListener(new bo(this, ig1));
            obj2 = (ImageView)view.findViewById(0x7f0d04ba);
            ((ImageView) (obj2)).setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            ((ImageView) (obj2)).setTag(s1);
            k.put(s1, obj);
            ((ImageView) (obj2)).setImageBitmap((Bitmap)k.get(s1));
            ((ImageView) (obj2)).setOnClickListener(new bp(this, ig1));
            if (B && o == 1)
            {
                if (l.size() >= 2)
                {
                    obj = k.keySet().iterator();
                    do
                    {
                        if (!((Iterator) (obj)).hasNext())
                        {
                            break;
                        }
                        Object obj1 = (String)((Iterator) (obj)).next();
                        View view1 = e.findViewWithTag(obj1);
                        if (view1 != null && view1.getParent() != null)
                        {
                            view1 = (View)view1.getParent().getParent();
                            e.removeView(view1);
                            obj1 = (Bitmap)k.get(obj1);
                            if (obj1 != null && !((Bitmap) (obj1)).isRecycled())
                            {
                                ((Bitmap) (obj1)).recycle();
                            }
                        }
                    } while (true);
                }
                l.clear();
                l.add(ig1);
                g();
                e.addView(view);
                i();
                return;
            } else
            {
                g();
                e.addView(view);
                h.post(new bq(this));
                return;
            }
        } else
        {
            B = false;
            l.remove(ig1);
            Toast.makeText(this, 0x7f070170, 1).show();
            return;
        }
    }

    static boolean a(SelectorBaseActivity selectorbaseactivity)
    {
        selectorbaseactivity.B = false;
        return false;
    }

    static void b(SelectorBaseActivity selectorbaseactivity)
    {
        if (selectorbaseactivity.b != null)
        {
            selectorbaseactivity.b.g();
        }
    }

    static boolean c(SelectorBaseActivity selectorbaseactivity)
    {
        return selectorbaseactivity.A;
    }

    static int k()
    {
        return y;
    }

    public final void a(Message message)
    {
        if (message.what == 4352)
        {
            com.roidapp.photogrid.common.y.a(this);
        } else
        {
            if (message.what == 4353)
            {
                com.roidapp.photogrid.common.y.a(this, (String)message.obj);
                return;
            }
            if (message.what == 4354)
            {
                com.roidapp.photogrid.common.y.b(this, (String)message.obj);
                return;
            }
            if (message.what != 8457 && message.what != 8456)
            {
                if (message.what == 8480)
                {
                    d.setVisibility(4);
                    c.setVisibility(0);
                    return;
                }
                if (message.what == 8481 && b.f() == 0)
                {
                    c.setVisibility(4);
                    d.setVisibility(0);
                    return;
                }
            }
        }
    }

    public final void a(String s1)
    {
        if (TextUtils.isEmpty(s1)) goto _L2; else goto _L1
_L1:
        boolean flag = false;
        if (o != 1) goto _L4; else goto _L3
_L3:
        if (B)
        {
            flag = true;
        }
_L6:
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        s1 = Message.obtain();
        s1.what = y;
        s.sendMessage(s1);
_L2:
        return;
_L4:
        if (l.size() >= o)
        {
            flag = true;
        }
        if (true) goto _L6; else goto _L5
_L5:
        ig ig1 = new ig(s1);
        l.add(ig1);
        n.add(s1);
        B = true;
        a(ig1);
        return;
    }

    protected final void a(ig aig[])
    {
        int j1 = aig.length;
        int i1 = j1;
        if (az.q != 6)
        {
            i1 = j1;
            if (j1 > o)
            {
                i1 = o;
            }
        }
        for (int k1 = 0; k1 < i1; k1++)
        {
            l.add(aig[k1]);
            a(aig[k1]);
        }

    }

    public final boolean a()
    {
_L2:
        if (flag)
        {
            Message message = Message.obtain();
            message.what = y;
            s.sendMessage(message);
            return false;
        }
        if (o == 0)
        {
            com.roidapp.photogrid.common.c.a("350", this);
            return false;
        } else
        {
            return true;
        }
        boolean flag;
        if (o == 1)
        {
            if (B)
            {
                flag = true;
                break MISSING_BLOCK_LABEL_17;
            }
        } else
        if (l.size() >= o)
        {
            flag = true;
            continue; /* Loop/switch isn't completed */
        }
        flag = false;
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected abstract t b();

    public final String c()
    {
        return "CloudCartPage";
    }

    protected final void d()
    {
        c = (ProgressBar)findViewById(0x7f0d008b);
        d = (ImageButton)findViewById(0x7f0d008c);
        d.setAlpha(165);
        d.setVisibility(0);
        b = b();
        b.e().a(this);
        b.a(this);
        b.a(this);
        if (b.c != null)
        {
            b.c.setOnTouchListener(r);
        }
    }

    protected final void e()
    {
        e = (LinearLayout)findViewById(0x7f0d00b3);
        f = (TextView)findViewById(0x7f0d00af);
        g = (TextView)findViewById(0x7f0d00b0);
        h = (HorizontalScrollView)findViewById(0x7f0d00b2);
        l = new ArrayList();
        k = new HashMap();
        i = (TextView)findViewById(0x7f0d00b1);
        j = (TextView)findViewById(0x7f0d00b4);
        q = (LinearLayout)findViewById(0x7f0d00ab);
        q.setOnTouchListener(r);
        h.setOnTouchListener(r);
        TextView textview;
        if (ih.C().P())
        {
            if (o == 1)
            {
                j.setText(getResources().getString(0x7f0701f1));
            } else
            {
                j.setText(String.format(getResources().getString(0x7f0701f0), new Object[] {
                    Integer.valueOf(o)
                }));
            }
        } else
        if (o == 1)
        {
            j.setText(getResources().getString(0x7f0701f3));
        } else
        {
            j.setText(String.format(getResources().getString(0x7f0701f2), new Object[] {
                Integer.valueOf(o)
            }));
        }
        i.setOnClickListener(new bj(this));
        f.setOnClickListener(new bk(this));
        d.setOnClickListener(new bl(this));
        z = (LinearLayout)findViewById(0x7f0d00ad);
        textview = (TextView)z.findViewById(0x7f0d00ae);
        textview.setFocusable(false);
        textview.setClickable(false);
        textview.getCompoundDrawables()[2].setAlpha(165);
        z.setOnClickListener(new bm(this));
        g();
    }

    protected final void f()
    {
        if (k != null)
        {
            String s1;
            for (Iterator iterator = k.keySet().iterator(); iterator.hasNext(); ((Bitmap)k.get(s1)).recycle())
            {
                s1 = (String)iterator.next();
            }

            k.clear();
        }
    }

    protected final void g()
    {
        if (l != null && l.size() <= 0)
        {
            i.setVisibility(8);
            j.setVisibility(0);
            f.setTextColor(0xff565656);
        } else
        {
            j.setVisibility(8);
            f.setTextColor(getResources().getColor(0x7f0c0062));
        }
        if (!ih.C().P()) goto _L2; else goto _L1
_L1:
        f.setText((new StringBuilder("( ")).append(l.size()).append(" )").toString());
        g.setText(String.format(getResources().getString(0x7f0701b8), new Object[] {
            Integer.valueOf(o)
        }));
_L8:
        if (l.size() <= 0) goto _L4; else goto _L3
_L3:
        if (!A)
        {
            z.setBackgroundDrawable(getResources().getDrawable(0x7f0200bc));
            A = true;
        }
_L5:
        return;
_L2:
        int i1 = o;
        int j1 = l.size();
        if (az.q == 4)
        {
            f.setText((new StringBuilder("( ")).append(l.size()).append(" )").toString());
            g.setText(String.format(getResources().getString(0x7f070268), new Object[] {
                Integer.valueOf(o)
            }));
            if (l.size() < o)
            {
                z.setBackgroundColor(getResources().getColor(0x7f0c0043));
                A = false;
                return;
            }
            if (!A)
            {
                z.setBackgroundDrawable(getResources().getDrawable(0x7f0200bc));
                A = true;
                return;
            }
        } else
        {
            f.setText((new StringBuilder()).append(getString(0x7f07022d)).append(i1 - j1).append(getString(0x7f07022c)).toString());
            continue; /* Loop/switch isn't completed */
        }
        if (true) goto _L5; else goto _L4
_L4:
        if (!A) goto _L5; else goto _L6
_L6:
        z.setBackgroundColor(getResources().getColor(0x7f0c0043));
        A = false;
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    protected final void i()
    {
        int i1;
        boolean flag;
        i1 = 5;
        flag = false;
        if (l != null && l.size() != 0) goto _L2; else goto _L1
_L1:
        ig aig[];
        return;
_L2:
        if ((aig = (ig[])l.toArray(new ig[0])) == null || D) goto _L1; else goto _L3
_L3:
        D = true;
        boolean flag2 = az.w;
        az.w = false;
        ih ih1 = ih.C();
        Object obj;
        Object obj1;
        boolean flag1;
        if (!flag2)
        {
            if (az.q == 0 || az.q == 5)
            {
                if (l.size() > 1)
                {
                    i1 = 0;
                }
                az.q = i1;
            }
            ih1.e(true);
        } else
        {
            ih1.e(false);
        }
        obj = getSharedPreferences("FaceClip", 0);
        if (az.q != 4)
        {
            ((SharedPreferences) (obj)).edit().putBoolean("needFaceClip", false).apply();
        }
        flag1 = ((SharedPreferences) (obj)).getBoolean("needFaceClip", false);
        if (!flag2)
        {
            flag = flag1;
        }
        obj = new Intent();
        az.q;
        JVM INSTR tableswitch 0 5: default 220
    //                   0 347
    //                   1 220
    //                   2 220
    //                   3 220
    //                   4 367
    //                   5 347;
           goto _L4 _L5 _L4 _L4 _L4 _L6 _L5
_L4:
        break; /* Loop/switch isn't completed */
_L6:
        break MISSING_BLOCK_LABEL_367;
_L7:
        if (az.q == 6)
        {
            PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("first_in", true).apply();
            ih1.l(true);
            ((Intent) (obj)).setClass(this, com/roidapp/photogrid/video/VideoPictureEditActivity);
        } else
        if (flag)
        {
            ((Intent) (obj)).setClass(this, com/roidapp/photogrid/release/FaceDetectorActivity);
            ((Intent) (obj)).putExtra("entryFrom", 1);
            ((Intent) (obj)).putExtra("entryType", 1);
        } else
        if (flag2)
        {
            ((Intent) (obj)).setClass(this, com/roidapp/photogrid/release/ImageEditFreeCropActivity);
        } else
        {
            if (flag)
            {
                ((Intent) (obj)).putExtra("entryFrom", 3);
                ((Intent) (obj)).putExtra("entryType", 1);
            }
            ((Intent) (obj)).setClass(this, com/roidapp/photogrid/release/PhotoGridActivity);
        }
        obj1 = new Rect();
        getWindow().getDecorView().getWindowVisibleDisplayFrame(((Rect) (obj1)));
        if (((Rect) (obj1)).top > 0)
        {
            az.g = ((Rect) (obj1)).top;
        }
        if (u != null)
        {
            u.removeAllViews();
        }
        ih1.a(aig);
        ih1.j(o);
        startActivity(((Intent) (obj)));
        finish();
        return;
_L5:
        obj1 = ih1.Y();
        if (obj1 != null)
        {
            ih1.c(((String) (obj1)));
        }
          goto _L7
        if (!flag2)
        {
            obj1 = ih1.Y();
            if (obj1 != null)
            {
                ih1.c(((String) (obj1)));
            }
        }
          goto _L7
    }

    public final void j()
    {
        if (!az.w) goto _L2; else goto _L1
_L1:
        az.w = false;
        ih.C().a(ih.C().O());
        ih.C().b(null);
        ih.C().a(null);
        ih.C().ak();
_L4:
        com.roidapp.photogrid.b.f.a("MainPage_View", "Cloud_Home");
        ih.C().j(o);
        com.roidapp.cloudlib.common.a.A(this);
        startActivity(new Intent(this, com/roidapp/photogrid/MainPage));
        finish();
        return;
_L2:
        if (l != null)
        {
            ih.C().a((ig[])l.toArray(new ig[0]));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        o = ih.C().K();
        if (o == 0)
        {
            o = ih.C().ak();
        }
        az.q;
        JVM INSTR tableswitch 0 10: default 92
    //                   0 106
    //                   1 156
    //                   2 176
    //                   3 186
    //                   4 196
    //                   5 116
    //                   6 166
    //                   7 92
    //                   8 146
    //                   9 126
    //                   10 136;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L1 _L9 _L10 _L11
_L1:
        if (az.w)
        {
            C = "FreeCrop";
        }
        return;
_L2:
        C = "GridActivity";
        continue; /* Loop/switch isn't completed */
_L7:
        C = "GridActivity/Single";
        continue; /* Loop/switch isn't completed */
_L10:
        C = "VideoActivity/Single";
        continue; /* Loop/switch isn't completed */
_L11:
        C = "CameraActivity/Single";
        continue; /* Loop/switch isn't completed */
_L9:
        C = "GridActivity/Movie";
        continue; /* Loop/switch isn't completed */
_L3:
        C = "FreeActivity";
        continue; /* Loop/switch isn't completed */
_L8:
        C = "VideoActivity";
        continue; /* Loop/switch isn't completed */
_L4:
        C = "WideActivity";
        continue; /* Loop/switch isn't completed */
_L5:
        C = "HighActivity";
        continue; /* Loop/switch isn't completed */
_L6:
        C = "GridActivity/Template";
        if (true) goto _L1; else goto _L12
_L12:
    }

    public void onDestroy()
    {
        if (p != null)
        {
            p.c();
        }
        if (l != null)
        {
            l.clear();
        }
        f();
        super.onDestroy();
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        an.a(bundle);
        super.onSaveInstanceState(bundle);
    }

    protected void onStart()
    {
        super.onStart();
        com.roidapp.baselib.c.b.d("ImageSelector/Cloud");
    }

    protected void onStop()
    {
        super.onStop();
    }

    public final void x()
    {
        t = "image_selector_cloud";
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;
import com.a.c.d;
import com.roidapp.photogrid.common.az;
import java.lang.reflect.Field;

// Referenced classes of package com.roidapp.photogrid.release:
//            hw, oh, ob, oc, 
//            od, oe, of

public final class oa
{

    PopupWindow a;
    private Context b;
    private boolean c;
    private View d;
    private String e[];
    private TextView f;
    private TextView g;
    private int h[];
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private int n;
    private int o;

    public oa(Context context, View view)
    {
        l = false;
        m = false;
        o = 720;
        b = context;
        d = view;
        c = true;
        c();
    }

    public oa(Context context, View view, boolean flag, boolean flag1, int i1, boolean flag2)
    {
        l = false;
        m = false;
        o = 720;
        b = context;
        d = view;
        c = false;
        i = flag;
        k = flag1;
        n = i1;
        if (az.q == 1)
        {
            if (i1 >= 1080)
            {
                if (i1 < 1440)
                {
                    h = (new int[] {
                        720, 1024, 1080, 1660, 1920, 2048
                    });
                    o = 1920;
                } else
                {
                    h = (new int[] {
                        720, 1024, 1080, 1660, 1920, 2048, 2560
                    });
                    o = 2560;
                }
            } else
            {
                h = hw.be(context);
                o = 720;
            }
        } else
        if (az.q == 0 || az.q == 5 || az.q == 4 || az.q == 8)
        {
            if (i1 >= 1080)
            {
                if (i1 < 1440)
                {
                    h = (new int[] {
                        720, 1024, 1080, 1660, 1920, 2048
                    });
                    o = 1920;
                } else
                {
                    h = (new int[] {
                        720, 1024, 1080, 1660, 1920, 2048, 2560
                    });
                    o = 2560;
                }
            } else
            {
                h = hw.bd(context);
                o = 720;
            }
        } else
        {
            h = (new int[] {
                480
            });
            o = 480;
            l = true;
        }
        j = flag2;
        c();
    }

    public oa(Context context, TextView textview, View view, boolean flag)
    {
        l = false;
        m = false;
        o = 720;
        b = context;
        m = true;
        g = textview;
        d = view;
        i = flag;
        c();
    }

    static boolean a(oa oa1)
    {
        return oa1.c;
    }

    static String[] b(oa oa1)
    {
        return oa1.e;
    }

    static TextView c(oa oa1)
    {
        return oa1.f;
    }

    private void c()
    {
        if (!c) goto _L2; else goto _L1
_L1:
        f = (TextView)d.findViewById(0x7f0d04aa);
        e = new String[2];
        e[0] = ".JPG";
        e[1] = ".PNG";
        if (!hw.b(b)) goto _L4; else goto _L3
_L3:
        f.setText(e[1]);
_L6:
        return;
_L4:
        f.setText(e[0]);
        return;
_L2:
        if (m)
        {
            f = (TextView)d.findViewById(0x7f0d04a6);
            if (com.a.c.d.a())
            {
                e = new String[4];
                e[0] = b.getResources().getString(0x7f070315);
                e[1] = b.getResources().getString(0x7f070312);
                e[2] = b.getResources().getString(0x7f070314);
                e[3] = b.getResources().getString(0x7f070313);
                String s = com.roidapp.photogrid.release.hw.d(b);
                int i1;
                if (TextUtils.isEmpty(s))
                {
                    s = "medium";
                    i1 = 0;
                } else
                if (s.equalsIgnoreCase("smart"))
                {
                    i1 = 0;
                } else
                if (s.equalsIgnoreCase("high"))
                {
                    i1 = 1;
                } else
                if (s.equalsIgnoreCase("medium"))
                {
                    i1 = 2;
                } else
                {
                    i1 = 3;
                }
                f.setText(e[i1]);
                hw.a(b, s);
                if (g != null)
                {
                    TextView textview = g;
                    if (s.equalsIgnoreCase("smart"))
                    {
                        s = b.getResources().getString(0x7f07024d);
                    } else
                    {
                        s = b.getResources().getString(0x7f07024c);
                    }
                    textview.setText(s);
                    return;
                }
            } else
            {
                e = new String[3];
                e[0] = b.getResources().getString(0x7f070312);
                e[1] = b.getResources().getString(0x7f070314);
                e[2] = b.getResources().getString(0x7f070313);
                String s2 = com.roidapp.photogrid.release.hw.d(b);
                if (TextUtils.isEmpty(s2))
                {
                    f.setText(e[1]);
                    hw.a(b, "Medium");
                    return;
                }
                String s1;
                if (s2.equalsIgnoreCase("high"))
                {
                    s1 = e[0];
                } else
                if (s2.equalsIgnoreCase("medium"))
                {
                    s1 = e[1];
                } else
                {
                    s1 = e[2];
                }
                f.setText(s1);
                hw.a(b, s2);
                return;
            }
        } else
        {
            f = (TextView)d.findViewById(0x7f0d04a6);
            if (k)
            {
                int j1 = h[h.length - 1];
                f.setText((new StringBuilder()).append(j1).append("P").toString());
                hw.a(b, j1);
                Toast toast = Toast.makeText(b, b.getString(0x7f070289, new Object[] {
                    (new StringBuilder()).append(j1).append("P").toString()
                }), 0);
                toast.setGravity(17, 0, 0);
                toast.show();
                return;
            }
            int k1 = h[h.length - 1];
            if (k1 < hw.c(b))
            {
                f.setText((new StringBuilder()).append(k1).append("P").toString());
                hw.a(b, k1);
                return;
            }
            int l1 = hw.c(b);
            k1 = l1;
            if (l1 == 0)
            {
                k1 = o;
                hw.a(b, k1);
            }
            f.setText((new StringBuilder()).append(k1).append("P").toString());
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    static Context d(oa oa1)
    {
        return oa1.b;
    }

    static boolean e(oa oa1)
    {
        return oa1.m;
    }

    static TextView f(oa oa1)
    {
        return oa1.g;
    }

    static boolean g(oa oa1)
    {
        return oa1.j;
    }

    static boolean h(oa oa1)
    {
        return oa1.l;
    }

    static int[] i(oa oa1)
    {
        return oa1.h;
    }

    public final void a()
    {
        if (a == null)
        {
            View view = LayoutInflater.from(b).inflate(0x7f0300fb, null);
            ListView listview = (ListView)view.findViewById(0x7f0d03f6);
            listview.setAdapter(new oh(this, b));
            listview.setOnItemClickListener(new ob(this));
            listview.setOnKeyListener(new oc(this));
            view.setFocusableInTouchMode(true);
            view.setOnKeyListener(new od(this));
            a = new PopupWindow(view, -2, -2, true);
            if (android.os.Build.VERSION.SDK_INT < 14)
            {
                try
                {
                    Object obj = android/widget/PopupWindow.getDeclaredField("mAnchor");
                    ((Field) (obj)).setAccessible(true);
                    Field field = android/widget/PopupWindow.getDeclaredField("mOnScrollChangedListener");
                    field.setAccessible(true);
                    obj = new oe(this, ((Field) (obj)), (android.view.ViewTreeObserver.OnScrollChangedListener)field.get(a));
                    field.set(a, obj);
                }
                catch (Exception exception)
                {
                    exception.printStackTrace();
                }
            }
            a.setInputMethodMode(1);
            a.setTouchable(true);
            a.setOutsideTouchable(true);
            a.setFocusable(true);
            a.getContentView().setOnTouchListener(new of(this));
            a.update();
        }
        if (a.isShowing())
        {
            a.dismiss();
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 22)
        {
            a.setAttachedInDecor(false);
        }
        a.showAsDropDown(d, 0, 0);
    }

    public final boolean b()
    {
        return b.getSharedPreferences("DebugMode", 0).getBoolean("DebugMode", false);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.preference.PreferenceManager;
import android.support.v4.app.DialogFragment;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.roidapp.baselib.c.n;
import com.roidapp.photogrid.a.m;
import com.roidapp.photogrid.common.az;
import com.roidapp.photogrid.common.b;
import java.io.File;
import java.text.DecimalFormat;

// Referenced classes of package com.roidapp.photogrid.release:
//            PhotoGridActivity, oa, no, ns, 
//            ap, nz, nq, nr, 
//            hw, nt, nu, nv, 
//            nw, nx, ny, PhotoSaveDialogCircle, 
//            np

public final class nn extends DialogFragment
{

    private Context a;
    private float b;
    private float c;
    private TextView d;
    private String e;
    private boolean f;
    private ImageView g;
    private boolean h;
    private boolean i;
    private int j;
    private boolean k;
    private boolean l;

    public nn()
    {
        h = false;
        i = false;
        k = true;
        l = false;
    }

    static void a(nn nn1)
    {
        nn1 = nn1.a.getSharedPreferences(nn1.a.getPackageName(), 0);
        android.content.SharedPreferences.Editor editor = nn1.edit();
        if (nn1.getBoolean("WATER_MARK", false))
        {
            editor.putBoolean("WATER_MARK", false);
        } else
        {
            editor.putBoolean("WATER_MARK", true);
        }
        editor.apply();
    }

    private boolean a()
    {
        return a.getSharedPreferences(a.getPackageName(), 0).getBoolean("WATER_MARK", false);
    }

    static boolean b(nn nn1)
    {
        return nn1.a();
    }

    static Context c(nn nn1)
    {
        return nn1.a;
    }

    static boolean d(nn nn1)
    {
        nn1.l = false;
        return false;
    }

    static void e(nn nn1)
    {
        ((PhotoGridActivity)nn1.a).b(nn1.k, nn1.l);
        nn1.dismissAllowingStateLoss();
    }

    static String f(nn nn1)
    {
        return nn1.e;
    }

    static boolean g(nn nn1)
    {
        return nn1.h;
    }

    static boolean h(nn nn1)
    {
        nn1.k = false;
        return false;
    }

    protected final void a(String s)
    {
        if (d != null)
        {
            d.setText(s);
        }
    }

    public final void a(boolean flag, boolean flag1)
    {
        h = flag;
        l = flag;
        i = flag1;
    }

    public final void onCancel(DialogInterface dialoginterface)
    {
        com.roidapp.photogrid.common.b.a("PhotoSaveDialog/onCancel");
        k = false;
        ((PhotoGridActivity)a).b(k, l);
        super.onCancel(dialoginterface);
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        a = getActivity();
        f = true;
        if (az.q != 0) goto _L2; else goto _L1
_L1:
        e = "Grid";
_L4:
        j = a.getResources().getDisplayMetrics().widthPixels;
        return;
_L2:
        if (az.q == 5)
        {
            e = "Single";
        } else
        if (az.q == 8)
        {
            e = "Movie";
        } else
        if (az.q == 1)
        {
            e = "Free";
        } else
        if (az.q == 2)
        {
            f = false;
            e = "Wide";
        } else
        if (az.q == 3)
        {
            f = false;
            e = "High";
        } else
        if (az.q == 6)
        {
            f = false;
            e = "Video";
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        com.roidapp.photogrid.common.b.a("PhotoSaveDialog/onCreateView");
        layoutinflater = layoutinflater.inflate(0x7f030120, viewgroup, false);
        viewgroup = (LinearLayout)layoutinflater.findViewById(0x7f0d04a5);
        LinearLayout linearlayout = (LinearLayout)layoutinflater.findViewById(0x7f0d04a9);
        bundle = (RelativeLayout)layoutinflater.findViewById(0x7f0d04a1);
        RelativeLayout relativelayout = (RelativeLayout)layoutinflater.findViewById(0x7f0d04a8);
        Object obj = (LinearLayout)layoutinflater.findViewById(0x7f0d04ac);
        boolean flag2 = false;
        if (az.q == 6)
        {
            TextView textview = (TextView)layoutinflater.findViewById(0x7f0d04a3);
            TextView textview2 = (TextView)layoutinflater.findViewById(0x7f0d04a4);
            textview.setText(a.getResources().getString(0x7f07024e));
            textview2.setText(a.getResources().getString(0x7f07024c));
        } else
        {
            flag2 = hw.f(a);
            TextView textview1 = (TextView)layoutinflater.findViewById(0x7f0d04a4);
            if (!f)
            {
                textview1.setVisibility(8);
            } else
            if (flag2 || j >= 1080)
            {
                flag2 = true;
                textview1.setText(0x7f070286);
            }
        }
        if (az.q == 6)
        {
            relativelayout.setVisibility(8);
            ((LinearLayout)layoutinflater.findViewById(0x7f0d04ab)).setVisibility(8);
            ((LinearLayout) (obj)).setVisibility(8);
            layoutinflater.findViewById(0x7f0d04af).setVisibility(8);
            obj = new oa(a, (TextView)layoutinflater.findViewById(0x7f0d04a4), viewgroup, h);
            viewgroup.setOnClickListener(new no(this, ((oa) (obj))));
            bundle.setOnClickListener(new ns(this, ((oa) (obj))));
        } else
        {
            ((TextView)((LinearLayout) (obj)).findViewById(0x7f0d04ad)).setText(0x7f070221);
            oa oa1 = new oa(a, viewgroup, h, i, j, flag2);
            oa oa2 = new oa(a, linearlayout);
            viewgroup.setOnClickListener(new nt(this, oa1));
            linearlayout.setOnClickListener(new nu(this, oa2));
            bundle.setOnClickListener(new nv(this, oa1));
            relativelayout.setOnClickListener(new nw(this, oa2));
            if (az.q == 4 || az.q == 2 || az.q == 3)
            {
                ((LinearLayout) (obj)).setVisibility(8);
                layoutinflater.findViewById(0x7f0d04af).setVisibility(8);
            } else
            {
                viewgroup = (CheckBox)((LinearLayout) (obj)).findViewById(0x7f0d04ae);
                viewgroup.setChecked(a());
                viewgroup.setOnClickListener(new nx(this, viewgroup));
                ((LinearLayout) (obj)).setOnClickListener(new ny(this, viewgroup));
            }
        }
        if (h)
        {
            viewgroup = (ImageView)layoutinflater.findViewById(0x7f0d04b9);
            bundle = (TextView)layoutinflater.findViewById(0x7f0d03da);
            obj = (TextView)layoutinflater.findViewById(0x7f0d020f);
            viewgroup.setImageResource(0x7f0203ea);
            bundle.setText(0x7f07021a);
            ((TextView) (obj)).setText(0x7f070228);
        }
        d = (TextView)layoutinflater.findViewById(0x7f0d04b2);
        d.setText(ap.a(a));
        bundle = (RelativeLayout)layoutinflater.findViewById(0x7f0d04b0);
        bundle.setOnClickListener(new nz(this));
        viewgroup = (RelativeLayout)layoutinflater.findViewById(0x7f0d04b4);
        if (!n.a(a, "com.cleanmaster.mguard") && m.a(getActivity()) != 1) goto _L2; else goto _L1
_L1:
        viewgroup.setVisibility(8);
        viewgroup.removeAllViews();
        layoutinflater.findViewById(0x7f0d04b3).setVisibility(8);
        viewgroup = bundle.getLayoutParams();
        viewgroup.width = -1;
        bundle.setLayoutParams(viewgroup);
_L4:
        layoutinflater.findViewById(0x7f0d04b8).setOnClickListener(new nq(this));
        g = (ImageView)layoutinflater.findViewById(0x7f0d04a0);
        g.setOnClickListener(new nr(this));
        return layoutinflater;
_L2:
        boolean flag;
        if (!Environment.getExternalStorageState().equals("mounted"))
        {
            break; /* Loop/switch isn't completed */
        }
        bundle = PreferenceManager.getDefaultSharedPreferences(a);
        File file = new File(bundle.getString("SAVEPATH", Environment.getExternalStorageDirectory().getPath()));
        if (!file.exists() && !file.mkdirs() || bundle.getInt("get_memory_error", 0) == 1)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = true;
_L5:
        if (flag)
        {
            boolean flag1 = false;
            bundle = PreferenceManager.getDefaultSharedPreferences(a);
            flag = flag1;
            if (bundle.getInt("get_memory_error", 0) != 1)
            {
                Object obj1 = bundle.getString("SAVEPATH", Environment.getExternalStorageDirectory().getPath());
                flag = flag1;
                if (obj1 != null)
                {
                    flag = flag1;
                    if (!((String) (obj1)).equals(""))
                    {
                        flag = flag1;
                        if ((new File(((String) (obj1)))).exists())
                        {
                            bundle.edit().putInt("get_memory_error", 1).apply();
                            obj1 = new StatFs(((String) (obj1)));
                            long l1 = ((StatFs) (obj1)).getBlockSize();
                            long l2 = ((StatFs) (obj1)).getAvailableBlocks();
                            long l3 = ((StatFs) (obj1)).getBlockCount();
                            b = l2 * l1;
                            c = l1 * l3;
                            flag = true;
                            bundle.edit().putInt("get_memory_error", 2).apply();
                        }
                    }
                }
            }
            if (flag)
            {
                bundle = new PhotoSaveDialogCircle(a, b, c);
                bundle.a(Math.round(a.getResources().getDisplayMetrics().density * 20F));
                ((LinearLayout)layoutinflater.findViewById(0x7f0d04b6)).addView(bundle);
                bundle = new DecimalFormat("0.0");
                ((TextView)layoutinflater.findViewById(0x7f0d04b7)).setText((new StringBuilder()).append(bundle.format(b / 1.073742E+09F)).append("/").append(bundle.format(c / 1.073742E+09F)).append("GB").toString());
            }
        }
        viewgroup.setOnClickListener(new np(this));
        if (true) goto _L4; else goto _L3
_L3:
        flag = false;
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
    }
}

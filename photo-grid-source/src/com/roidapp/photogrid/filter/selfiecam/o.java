// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.filter.selfiecam;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.preference.PreferenceManager;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.roidapp.baselib.c.n;
import com.roidapp.photogrid.a.m;
import com.roidapp.photogrid.common.az;
import com.roidapp.photogrid.common.e;
import com.roidapp.photogrid.release.ParentActivity;
import com.roidapp.photogrid.release.PathSelector;
import com.roidapp.photogrid.release.PhotoSaveDialogCircle;
import com.roidapp.photogrid.release.ap;
import com.roidapp.photogrid.release.hw;
import java.io.File;
import java.text.DecimalFormat;
import java.util.Arrays;

// Referenced classes of package com.roidapp.photogrid.filter.selfiecam:
//            p, r, aa, v, 
//            y, s, t, u, 
//            w, x, q

public final class o extends Dialog
    implements android.view.View.OnClickListener
{

    private View a;
    private final w b;
    private final int c[];
    private v d;
    private v e;
    private CheckBox f;
    private ParentActivity g;
    private TextView h;
    private boolean i;
    private float j;
    private float k;
    private boolean l;
    private String m;

    public o(Activity activity, w w1, int ai[], boolean flag, boolean flag1)
    {
        super(activity, 0x7f0b0027);
        g = (ParentActivity)activity;
        b = w1;
        c = ai;
        i = flag;
        l = flag1;
        if (l)
        {
            setOnCancelListener(new p(this));
        }
    }

    private void a()
    {
        int i1;
        int j1;
        int k1;
        Object obj = (LinearLayout)findViewById(0x7f0d04a5);
        ((TextView)findViewById(0x7f0d04a4)).setVisibility(8);
        ((LinearLayout) (obj)).setOnClickListener(new r(this));
        obj = (TextView)findViewById(0x7f0d04a6);
        d = new aa(c, ((TextView) (obj)));
        j1 = hw.c(g);
        k1 = c.length;
        i1 = 0;
_L3:
        if (i1 >= k1)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        if (c[i1] != j1) goto _L2; else goto _L1
_L1:
        boolean flag = true;
        d.b(i1);
        i1 = ((flag) ? 1 : 0);
_L4:
        if (i1 == 0)
        {
            d.b(0);
        }
        return;
_L2:
        i1++;
          goto _L3
        i1 = 0;
          goto _L4
    }

    static void a(o o1, View view, v v1)
    {
        Object obj = LayoutInflater.from(o1.getContext()).inflate(0x7f0300fb, null);
        ListView listview = (ListView)((View) (obj)).findViewById(0x7f0d03f6);
        listview.setAdapter(new y(o1.getContext(), v1));
        obj = new PopupWindow(((View) (obj)), -2, -2, true);
        listview.setOnItemClickListener(new s(o1, v1, ((PopupWindow) (obj))));
        ((PopupWindow) (obj)).setInputMethodMode(1);
        ((PopupWindow) (obj)).setTouchable(true);
        ((PopupWindow) (obj)).setOutsideTouchable(true);
        ((PopupWindow) (obj)).setFocusable(true);
        listview.setOnKeyListener(new t(o1, ((PopupWindow) (obj))));
        ((PopupWindow) (obj)).getContentView().setOnTouchListener(new u(o1, ((PopupWindow) (obj))));
        if (android.os.Build.VERSION.SDK_INT >= 22)
        {
            ((PopupWindow) (obj)).setAttachedInDecor(false);
        }
        ((PopupWindow) (obj)).showAsDropDown(view, 0, 0);
    }

    static boolean a(o o1)
    {
        return o1.l;
    }

    static ParentActivity b(o o1)
    {
        return o1.g;
    }

    private boolean b()
    {
        Context context = getContext();
        return context.getSharedPreferences(context.getPackageName(), 0).getBoolean("WATER_MARK", false);
    }

    static boolean c(o o1)
    {
        return o1.i;
    }

    static boolean d(o o1)
    {
        o1.l = false;
        return false;
    }

    static v e(o o1)
    {
        return o1.e;
    }

    static v f(o o1)
    {
        return o1.d;
    }

    public final void a(int i1, int j1, Intent intent)
    {
        if (i1 == 52225 && j1 == 52226 && intent != null)
        {
            intent = intent.getExtras();
            if (intent != null)
            {
                intent = intent.getString("file");
                h.setText(intent);
            }
        }
    }

    public final void onClick(View view)
    {
        boolean flag;
        boolean flag2;
        flag2 = true;
        flag = true;
        view.getId();
        JVM INSTR lookupswitch 5: default 60
    //                   2131559584: 61
    //                   2131559596: 232
    //                   2131559600: 308
    //                   2131559604: 182
    //                   2131559608: 66;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        break; /* Loop/switch isn't completed */
_L4:
        break MISSING_BLOCK_LABEL_308;
_L7:
        return;
_L2:
        cancel();
        return;
_L6:
        dismiss();
        int i1 = d.b();
        view = Arrays.copyOfRange(c, 0, i1 + 1);
        int k1 = view.length;
        Integer ainteger[] = new Integer[k1 + 1];
        for (int j1 = 0; j1 < k1; j1++)
        {
            ainteger[j1] = Integer.valueOf(view[k1 - 1 - j1]);
        }

        ainteger[k1] = Integer.valueOf(360);
        if (e.b() != 1)
        {
            flag = false;
        }
        if (b != null)
        {
            b.a(ainteger, flag);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (b != null)
        {
            view = g;
            String s1 = m;
            boolean flag1;
            if (b.b() == 0)
            {
                flag1 = flag2;
            } else
            {
                flag1 = false;
            }
            com.roidapp.photogrid.common.e.a(view, s1, flag1).a();
            return;
        }
        if (true) goto _L7; else goto _L3
_L3:
        view = getContext();
        view = view.getSharedPreferences(view.getPackageName(), 0);
        android.content.SharedPreferences.Editor editor = view.edit();
        if (view.getBoolean("WATER_MARK", false))
        {
            editor.putBoolean("WATER_MARK", false);
        } else
        {
            editor.putBoolean("WATER_MARK", true);
        }
        editor.commit();
        f.setChecked(b());
        return;
        if (Environment.getExternalStorageState().equals("mounted"))
        {
            view = new Intent(g, com/roidapp/photogrid/release/PathSelector);
            view.putExtra("isFromDialogFragment", true);
            g.startActivityForResult(view, 52225);
            return;
        } else
        {
            Toast.makeText(g, 0x7f07028d, 1).show();
            return;
        }
    }

    public final void onCreate(Bundle bundle)
    {
        int i1;
        super.onCreate(bundle);
        setContentView(0x7f030120);
        RelativeLayout relativelayout;
        if (az.q == 0)
        {
            m = "Grid";
        } else
        if (az.q == 5)
        {
            m = "Single";
        } else
        if (az.q == 1)
        {
            m = "Free";
        } else
        if (az.q == 2)
        {
            m = "Wide";
        } else
        if (az.q == 3)
        {
            m = "High";
        } else
        if (az.q == 6)
        {
            m = "Video";
        }
        relativelayout = (RelativeLayout)findViewById(0x7f0d04b0);
        h = (TextView)findViewById(0x7f0d04b2);
        h.setText(ap.a(g));
        relativelayout.setOnClickListener(this);
        f = (CheckBox)findViewById(0x7f0d04ae);
        f.setClickable(false);
        f.setChecked(b());
        a = findViewById(0x7f0d04a0);
        a.setOnClickListener(this);
        bundle = (TextView)findViewById(0x7f0d03da);
        if (i)
        {
            bundle.setText(0x7f070150);
        } else
        {
            bundle.setText(0x7f07027d);
        }
        findViewById(0x7f0d04ac).setOnClickListener(this);
        ((TextView)findViewById(0x7f0d020f)).setText(b.a());
        findViewById(0x7f0d04b8).setOnClickListener(this);
        bundle = (RelativeLayout)findViewById(0x7f0d04b4);
        if (!n.a(g, "com.cleanmaster.mguard") && com.roidapp.photogrid.a.m.a(g) != 1) goto _L2; else goto _L1
_L1:
        bundle.setVisibility(8);
        bundle.removeAllViews();
        findViewById(0x7f0d04b3).setVisibility(8);
        bundle = relativelayout.getLayoutParams();
        bundle.width = -1;
        relativelayout.setLayoutParams(bundle);
_L8:
        ((ImageView)findViewById(0x7f0d04b9)).setImageResource(b.c());
        e = new x((TextView)findViewById(0x7f0d04aa), (byte)0);
        Object obj;
        Object obj1;
        long l1;
        long l2;
        long l3;
        if (hw.b(g))
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        e.b(i1);
        ((LinearLayout)findViewById(0x7f0d04a9)).setOnClickListener(new q(this));
        a();
        return;
_L2:
        if (!Environment.getExternalStorageState().equals("mounted")) goto _L4; else goto _L3
_L3:
        obj = PreferenceManager.getDefaultSharedPreferences(g);
        obj1 = new File(((SharedPreferences) (obj)).getString("SAVEPATH", Environment.getExternalStorageDirectory().getPath()));
        if (!((File) (obj1)).exists() && !((File) (obj1)).mkdirs() || ((SharedPreferences) (obj)).getInt("get_memory_error", 0) == 1) goto _L4; else goto _L5
_L5:
        i1 = 1;
_L9:
        if (i1 == 0) goto _L7; else goto _L6
_L6:
        obj = PreferenceManager.getDefaultSharedPreferences(g);
        if (((SharedPreferences) (obj)).getInt("get_memory_error", 0) == 1)
        {
            break MISSING_BLOCK_LABEL_853;
        }
        obj1 = ((SharedPreferences) (obj)).getString("SAVEPATH", Environment.getExternalStorageDirectory().getPath());
        if (obj1 == null || ((String) (obj1)).equals("") || !(new File(((String) (obj1)))).exists())
        {
            break MISSING_BLOCK_LABEL_853;
        }
        ((SharedPreferences) (obj)).edit().putInt("get_memory_error", 1).commit();
        obj1 = new StatFs(((String) (obj1)));
        l1 = ((StatFs) (obj1)).getBlockSize();
        l2 = ((StatFs) (obj1)).getAvailableBlocks();
        l3 = ((StatFs) (obj1)).getBlockCount();
        j = l2 * l1;
        k = l3 * l1;
        ((SharedPreferences) (obj)).edit().putInt("get_memory_error", 2).commit();
        i1 = 1;
_L10:
        if (i1 != 0)
        {
            obj = new PhotoSaveDialogCircle(g, j, k);
            ((PhotoSaveDialogCircle) (obj)).a(Math.round(g.getResources().getDisplayMetrics().density * 20F));
            ((LinearLayout)bundle.findViewById(0x7f0d04b6)).addView(((View) (obj)));
            obj = new DecimalFormat("0.0");
            ((TextView)bundle.findViewById(0x7f0d04b7)).setText((new StringBuilder()).append(((DecimalFormat) (obj)).format(j / 1.073742E+09F)).append("/").append(((DecimalFormat) (obj)).format(k / 1.073742E+09F)).append("GB").toString());
        }
_L7:
        bundle.setOnClickListener(this);
          goto _L8
_L4:
        i1 = 0;
          goto _L9
        i1 = 0;
          goto _L10
    }
}

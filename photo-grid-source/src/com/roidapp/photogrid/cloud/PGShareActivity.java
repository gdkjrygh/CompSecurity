// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.roidapp.baselib.c.an;
import com.roidapp.baselib.c.n;
import com.roidapp.baselib.e.l;
import com.roidapp.cloudlib.a.a;
import com.roidapp.cloudlib.sns.af;
import com.roidapp.cloudlib.sns.o;
import com.roidapp.cloudlib.sns.q;
import com.roidapp.cloudlib.sns.upload.UploadProgressStatusView;
import com.roidapp.cloudlib.sns.upload.b;
import com.roidapp.cloudlib.sns.upload.e;
import com.roidapp.cloudlib.sns.upload.i;
import com.roidapp.cloudlib.sns.upload.j;
import com.roidapp.cloudlib.upload.x;
import com.roidapp.photogrid.MainPage;
import com.roidapp.photogrid.common.az;
import com.roidapp.photogrid.common.cc;
import com.roidapp.photogrid.release.ParentActivity;
import com.roidapp.photogrid.release.jj;
import com.roidapp.photogrid.release.rf;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            bd, be, az, ch, 
//            aq, ar, bb, ba, 
//            as, ay, ax, av, 
//            ap, at, au, aw, 
//            bc

public class PGShareActivity extends ParentActivity
    implements android.view.View.OnClickListener
{

    private ArrayList A;
    private Handler B;
    private String C[];
    private int D;
    private int E;
    private RelativeLayout F;
    private RelativeLayout G;
    private ch H;
    private x I;
    private bb J;
    private int K;
    private int L;
    private String M;
    private boolean N;
    private View O;
    private Handler P;
    j a;
    private TextView b;
    private TextView c;
    private ImageView d;
    private int e;
    private EditText f;
    private RelativeLayout g;
    private RelativeLayout h;
    private ProgressBar i;
    private LinearLayout j;
    private ScrollView k;
    private CheckBox l;
    private CheckBox m;
    private RelativeLayout n;
    private TextView o;
    private String p;
    private String q;
    private String r;
    private boolean s;
    private long y;
    private ArrayList z;

    public PGShareActivity()
    {
        y = -1L;
        z = new ArrayList();
        A = new ArrayList();
        B = new bd(this, (byte)0);
        C = null;
        L = -1;
        M = "";
        P = new be(this, (byte)0);
        a = new com.roidapp.photogrid.cloud.az(this);
    }

    static int a(PGShareActivity pgshareactivity, int i1)
    {
        pgshareactivity.L = i1;
        return i1;
    }

    static RelativeLayout a(PGShareActivity pgshareactivity)
    {
        return pgshareactivity.G;
    }

    static String a(PGShareActivity pgshareactivity, String s1)
    {
        pgshareactivity.M = s1;
        return s1;
    }

    private static String a(String as1[])
    {
        if (as1 != null) goto _L2; else goto _L1
_L1:
        String s2 = null;
_L4:
        return s2;
_L2:
        int j1 = as1.length;
        String s1 = "";
        int i1 = 0;
        do
        {
            s2 = s1;
            if (i1 >= j1)
            {
                continue;
            }
            s1 = (new StringBuilder()).append(s1).append(as1[i1]).toString();
            s1 = (new StringBuilder()).append(s1).append(",").toString();
            i1++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    static boolean a(PGShareActivity pgshareactivity, long l1, int i1)
    {
        UploadProgressStatusView uploadprogressstatusview = (UploadProgressStatusView)pgshareactivity.j.findViewWithTag(Long.valueOf(l1));
        if (uploadprogressstatusview != null)
        {
            uploadprogressstatusview.a(1);
            uploadprogressstatusview.b(i1);
            if (i1 == 100)
            {
                pgshareactivity.j.removeView(uploadprogressstatusview);
                pgshareactivity.k.smoothScrollBy(0, 0);
                pgshareactivity.k.requestLayout();
            }
            return true;
        } else
        {
            return false;
        }
    }

    static int b(PGShareActivity pgshareactivity, int i1)
    {
        pgshareactivity.K = i1;
        return i1;
    }

    static LinearLayout b(PGShareActivity pgshareactivity)
    {
        return pgshareactivity.j;
    }

    static void b(PGShareActivity pgshareactivity, String s1)
    {
        pgshareactivity.d(s1);
    }

    static int c(PGShareActivity pgshareactivity)
    {
        return pgshareactivity.L;
    }

    static int c(PGShareActivity pgshareactivity, int i1)
    {
        pgshareactivity.E = i1;
        return i1;
    }

    private boolean c(String s1)
    {
        boolean flag1 = false;
        int i1 = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i1 < A.size())
                {
                    if (!((String)A.get(i1)).equalsIgnoreCase(s1))
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i1++;
        } while (true);
    }

    static CheckBox d(PGShareActivity pgshareactivity)
    {
        return pgshareactivity.m;
    }

    private void d(String s1)
    {
        if (com.roidapp.baselib.c.n.a(s1, (new StringBuilder("#")).append(M).toString()))
        {
            m.setChecked(true);
            m.setTextColor(-1);
            return;
        } else
        {
            m.setChecked(false);
            m.setTextColor(D);
            return;
        }
    }

    static int e(PGShareActivity pgshareactivity)
    {
        return pgshareactivity.D;
    }

    static EditText f(PGShareActivity pgshareactivity)
    {
        return pgshareactivity.f;
    }

    static RelativeLayout g(PGShareActivity pgshareactivity)
    {
        return pgshareactivity.g;
    }

    static CheckBox h(PGShareActivity pgshareactivity)
    {
        return pgshareactivity.l;
    }

    static int i(PGShareActivity pgshareactivity)
    {
        return pgshareactivity.K;
    }

    static String j(PGShareActivity pgshareactivity)
    {
        return pgshareactivity.M;
    }

    static long k(PGShareActivity pgshareactivity)
    {
        return pgshareactivity.y;
    }

    static RelativeLayout l(PGShareActivity pgshareactivity)
    {
        return pgshareactivity.h;
    }

    static ProgressBar m(PGShareActivity pgshareactivity)
    {
        return pgshareactivity.i;
    }

    static TextView n(PGShareActivity pgshareactivity)
    {
        return pgshareactivity.c;
    }

    static ScrollView o(PGShareActivity pgshareactivity)
    {
        return pgshareactivity.k;
    }

    static RelativeLayout p(PGShareActivity pgshareactivity)
    {
        return pgshareactivity.n;
    }

    static Handler q(PGShareActivity pgshareactivity)
    {
        return pgshareactivity.P;
    }

    static bb r(PGShareActivity pgshareactivity)
    {
        return pgshareactivity.J;
    }

    static ImageView s(PGShareActivity pgshareactivity)
    {
        return pgshareactivity.d;
    }

    static Handler t(PGShareActivity pgshareactivity)
    {
        return pgshareactivity.B;
    }

    public final void a()
    {
        N = true;
        O.setVisibility(0);
    }

    public final void a(int i1)
    {
        Object obj = getSupportFragmentManager();
        android.support.v4.app.Fragment fragment = ((FragmentManager) (obj)).findFragmentById(0x7f0d00d7);
        if (fragment == null || !(fragment instanceof ch))
        {
            obj = ((FragmentManager) (obj)).beginTransaction();
            if (H == null)
            {
                H = new ch();
            }
            H.a(i1);
            H.a(new aq(this));
            ((FragmentTransaction) (obj)).setCustomAnimations(0x7f040000, 0x7f040001, 0, 0);
            ((FragmentTransaction) (obj)).add(0x7f0d00d7, H, "tag_fragment");
            ((FragmentTransaction) (obj)).commit();
            return;
        } else
        {
            H = (ch)fragment;
            return;
        }
    }

    public final void a(String s1)
    {
        A.add(s1);
    }

    public final void a(String s1, int i1)
    {
        Object obj = getSupportFragmentManager();
        android.support.v4.app.Fragment fragment = ((FragmentManager) (obj)).findFragmentById(0x7f0d00d7);
        if (fragment == null || !(fragment instanceof x))
        {
            obj = ((FragmentManager) (obj)).beginTransaction();
            if (I == null)
            {
                I = new x();
            }
            I.a(i1);
            I.a(new ar(this));
            ((FragmentTransaction) (obj)).setCustomAnimations(0x7f040000, 0x7f040001, 0, 0).replace(0x7f0d00d7, I, "search_fragment");
            ((FragmentTransaction) (obj)).commitAllowingStateLoss();
        } else
        {
            I = (x)fragment;
        }
        I.a(s1);
    }

    public final void a(String s1, String s2)
    {
        s1 = (new StringBuilder("@")).append(s1).toString();
        s2 = (new StringBuilder("@")).append(s2).toString();
        int i1 = f.getSelectionStart();
        f.getText().replace(Math.max(i1 - s1.length(), 0), i1, s2);
        f.setSelection(Math.min((i1 - s1.length()) + s2.length(), f.length()));
        J.a();
    }

    public final void a(String s1, boolean flag)
    {
        J.a();
        if (!flag) goto _L2; else goto _L1
_L1:
        String s2;
        String as1[];
label0:
        {
            z.remove(s1);
            s2 = f.getText().toString();
            String as2[] = s2.split((new StringBuilder()).append(s1).append(" ").toString());
            if (as2.length != 1)
            {
                as1 = as2;
                if (as2.length != 0)
                {
                    break label0;
                }
            }
            as1 = s2.split(s1);
        }
        if (as1.length <= 1) goto _L4; else goto _L3
_L3:
        int i1;
        s1 = "";
        if (!as1[0].equalsIgnoreCase(" "))
        {
            s1 = as1[0];
        }
        s2 = s1;
        if (!as1[1].equalsIgnoreCase(" "))
        {
            s2 = (new StringBuilder()).append(s1).append(as1[1]).toString();
        }
        i1 = as1[0].length();
        s1 = s2;
_L6:
        f.setText(s1);
        f.setSelection(Math.min(i1, f.length()));
        return;
_L4:
        String s3;
        if (as1.length == 1)
        {
            if (!as1[0].equalsIgnoreCase(" "))
            {
                s1 = as1[0];
                i1 = as1[0].length();
                continue; /* Loop/switch isn't completed */
            }
        } else
        if (as1.length == 0)
        {
            s1 = "";
            i1 = 0;
            continue; /* Loop/switch isn't completed */
        }
        i1 = 0;
        s1 = s2;
        continue; /* Loop/switch isn't completed */
_L2:
        z.add(s1);
        i1 = f.getSelectionStart();
        s3 = f.getText().toString();
        s2 = s3.substring(0, i1);
        s3 = s3.substring(i1, s3.length());
        s1 = (new StringBuilder()).append(s1).append(" ").toString();
        s2 = (new StringBuilder()).append(s2).append(s1).append(s3).toString();
        f.setText(s2);
        f.setSelection(Math.min(i1 + s1.length(), f.length()));
        return;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void a(Collection collection)
    {
        collection = collection.iterator();
        do
        {
            if (!collection.hasNext())
            {
                break;
            }
            i i1 = (i)collection.next();
            long l1 = i1.e;
            byte byte0 = i1.f;
            UploadProgressStatusView uploadprogressstatusview = (UploadProgressStatusView)j.findViewWithTag(Long.valueOf(l1));
            if (l1 == y)
            {
                if (byte0 == 2)
                {
                    g.setVisibility(0);
                    h.setVisibility(8);
                    i.setProgress(0);
                    if (E != b.d)
                    {
                        E = b.d;
                        an.a(this, getString(0x7f0700c0));
                    }
                } else
                if (com.roidapp.cloudlib.sns.upload.e.a().b() == 0)
                {
                    c.setText(getString(0x7f0700fa));
                    g.setVisibility(8);
                    h.setVisibility(0);
                    i.setVisibility(0);
                }
            } else
            if (uploadprogressstatusview == null)
            {
                uploadprogressstatusview = new UploadProgressStatusView(this);
                uploadprogressstatusview.setTag(Long.valueOf(l1));
                uploadprogressstatusview.a(byte0);
                uploadprogressstatusview.b(i1.d);
                uploadprogressstatusview.a(i1.a);
                android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-1, -2);
                layoutparams.bottomMargin = 20;
                uploadprogressstatusview.setLayoutParams(layoutparams);
                j.addView(uploadprogressstatusview);
                uploadprogressstatusview.a(new ba(this, uploadprogressstatusview, i1));
            } else
            {
                uploadprogressstatusview.a(byte0);
                uploadprogressstatusview.b(i1.d);
            }
        } while (true);
        k.smoothScrollBy(0, 0);
    }

    public final void b()
    {
        N = false;
        O.setVisibility(8);
    }

    public final void b(String s1)
    {
        n.setVisibility(0);
        o.setText(s1);
        n.postDelayed(new as(this), 3000L);
    }

    public final boolean d()
    {
        L = -1;
        FragmentManager fragmentmanager = getSupportFragmentManager();
        android.support.v4.app.Fragment fragment = fragmentmanager.findFragmentById(0x7f0d00d7);
        boolean flag;
        if (fragment != null && (fragment instanceof x))
        {
            fragmentmanager.beginTransaction().remove(fragment).commitAllowingStateLoss();
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            j.setVisibility(0);
        }
        return flag;
    }

    public final boolean e()
    {
        FragmentManager fragmentmanager = getSupportFragmentManager();
        android.support.v4.app.Fragment fragment = fragmentmanager.findFragmentById(0x7f0d00d7);
        boolean flag;
        if (fragment != null && (fragment instanceof ch))
        {
            fragmentmanager.beginTransaction().remove(fragment).commit();
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            j.setVisibility(0);
        }
        l.setChecked(true);
        l.setVisibility(8);
        d(f.getText().toString());
        return flag;
    }

    public final void f()
    {
        A.clear();
    }

    public final ArrayList g()
    {
        Object obj = f.getText().toString();
        obj = Pattern.compile("#\\w+").matcher(((CharSequence) (obj)));
        z.clear();
        String s1;
        for (; ((Matcher) (obj)).find(); z.add(s1))
        {
            s1 = ((Matcher) (obj)).group();
        }

        return z;
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
        switch (i1)
        {
        default:
            return;

        case 13273: 
            break;
        }
        if (j1 != -1)
        {
            b();
            return;
        } else
        {
            af.a(this, new ay(this, intent));
            return;
        }
    }

    public void onClick(View view)
    {
        boolean flag = false;
        view.getId();
        JVM INSTR lookupswitch 5: default 56
    //                   2131558440: 57
    //                   2131558562: 761
    //                   2131558568: 95
    //                   2131558586: 56
    //                   2131558593: 844;
           goto _L1 _L2 _L3 _L4 _L1 _L5
_L1:
        return;
_L2:
        view = (InputMethodManager)getSystemService("input_method");
        if (view != null)
        {
            view.hideSoftInputFromWindow(f.getWindowToken(), 0);
        }
        setResult(0);
        finish();
        return;
_L4:
        if (!af.a(this))
        {
            continue; /* Loop/switch isn't completed */
        }
        view = (InputMethodManager)getSystemService("input_method");
        if (view != null)
        {
            view.hideSoftInputFromWindow(f.getWindowToken(), 0);
        }
        if (!com.roidapp.baselib.e.l.b(this))
        {
            com.roidapp.baselib.e.l.a(this, null);
            return;
        }
        Object obj = PreferenceManager.getDefaultSharedPreferences(this);
        String as1[] = ((SharedPreferences) (obj)).getString("history_tag", "").split(",");
        view = new LinkedHashSet();
        for (int i1 = as1.length - 1; i1 >= 0; i1--)
        {
            view.add(as1[i1]);
        }

        as1 = com.roidapp.baselib.c.n.a(f.getText().toString(), null);
        for (int j1 = 0; j1 < as1.length; j1++)
        {
            if (c(as1[j1]))
            {
                continue;
            }
            if (view.size() == 20)
            {
                view.remove(view.iterator().next());
            }
            view.add((new StringBuilder("#")).append(as1[j1]).toString());
        }

        String as2[] = (String[])view.toArray(new String[view.size()]);
        view = "";
        for (int k1 = as2.length - 1; k1 >= 0; k1--)
        {
            String s1 = (new StringBuilder()).append(view).append(as2[k1]).toString();
            view = s1;
            if (k1 > 0)
            {
                view = (new StringBuilder()).append(s1).append(",").toString();
            }
        }

        ((SharedPreferences) (obj)).edit().putString("history_tag", view).apply();
        com.roidapp.baselib.c.b.a("SNS", "share_click", "Save/Save/SendPG");
        com.roidapp.photogrid.common.af.b(this, "SNS", "share_click", "Save/Save/SendPG", Long.valueOf(1L));
        g.setVisibility(8);
        h.setVisibility(0);
        k.smoothScrollBy(0, 0);
        E = b.e;
        com.roidapp.cloudlib.sns.upload.e.a().b();
        if (com.roidapp.cloudlib.sns.upload.e.a().d())
        {
            g.setVisibility(8);
            h.setVisibility(0);
            i.setVisibility(8);
            c.setText(getString(0x7f0700f9));
        } else
        {
            g.setVisibility(8);
            h.setVisibility(0);
            i.setVisibility(0);
            i.setProgress(0);
            h.setBackgroundColor(-1);
            c.setText(getString(0x7f0700fa));
            com.roidapp.baselib.c.n.a(c, 0, 0, 0);
        }
        view = f.getText().toString();
        s1 = com.roidapp.baselib.c.n.a(view, C);
        obj = a(s1);
        for (int l1 = ((flag) ? 1 : 0); l1 < s1.length; l1++)
        {
            com.roidapp.baselib.c.b.a("SNS", "hashtags_upload", s1[l1]);
            com.roidapp.photogrid.common.af.b(this, "SNS", "hashtags_upload", s1[l1], Long.valueOf(1L));
        }

        if (y == -1L)
        {
            y = com.roidapp.cloudlib.sns.upload.e.a(this, p, ((String) (obj)), view);
            return;
        }
        view = com.roidapp.cloudlib.sns.upload.e.a().a(y);
        if (view == null) goto _L1; else goto _L6
_L6:
        com.roidapp.cloudlib.sns.upload.e.a().b(((i) (view)).e);
        com.roidapp.cloudlib.sns.upload.e.a(this, view);
        return;
        if (N) goto _L1; else goto _L7
_L7:
        af.a(this, new ax(this), "Save_Finish_Page");
        return;
_L3:
        if (!s)
        {
            view = new jj();
            view.a(p);
            view.setStyle(0, 2);
            com.roidapp.baselib.c.n.a(getSupportFragmentManager(), view, "ImagePreviewDialogFragment");
            return;
        }
        view = new Intent("android.intent.action.VIEW");
        view.setDataAndType(Uri.fromFile(new File(p)), "video/mp4");
        try
        {
            startActivity(view);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            return;
        }
_L5:
        if (E == b.c)
        {
            setResult(34825);
            finish();
            az.s = false;
            view = new Intent(this, com/roidapp/photogrid/MainPage);
            view.putExtra("jump_from_sharepage", true);
            startActivity(view);
            return;
        }
        if (com.roidapp.cloudlib.sns.upload.e.a().b() > 0)
        {
            an.a(this, getString(0x7f0700f9));
            return;
        } else
        {
            an.a(this, "Uploading now, please wait...");
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        int i1 = 2;
        super.onCreate(bundle);
        try
        {
            setContentView(0x7f030028);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            bundle.printStackTrace();
            v = true;
            (new cc(this)).a();
        }
        p = getIntent().getStringExtra("image_path");
        q = getIntent().getStringExtra("mode_str");
        r = getIntent().getStringExtra("text_content");
        s = getIntent().getBooleanExtra("is_video", false);
        if (!v)
        {
            if (com.roidapp.cloudlib.a.a.a(getApplicationContext()).a("event", "mother2015", false))
            {
                C = (new String[] {
                    " #mother", " #mothersday", " #mothernature", " #motherhood", " #mom"
                });
            }
            b = (TextView)findViewById(0x7f0d0028);
            b.setOnClickListener(this);
            if (e == 0)
            {
                bundle = getResources().getDisplayMetrics();
                e = Math.round(getResources().getDimension(0x7f090139) - ((DisplayMetrics) (bundle)).density * 16F);
            }
            d = (ImageView)findViewById(0x7f0d00a1);
            if (d != null)
            {
                d.setOnClickListener(this);
                bundle = new AlphaAnimation(0.0F, 1.0F);
                bundle.setDuration(3000L);
                d.setAnimation(bundle);
                int l1 = d.getLayoutParams().width;
                if (l1 > 0)
                {
                    e = l1;
                }
                if (s)
                {
                    bundle = (TextView)findViewById(0x7f0d00b7);
                    if (bundle != null)
                    {
                        Object obj = new File(p);
                        int j1;
                        long l2;
                        if (((File) (obj)).exists())
                        {
                            l2 = ((File) (obj)).length();
                        } else
                        {
                            l2 = 0L;
                        }
                        bundle.setText(rf.a(l2));
                        bundle.setVisibility(0);
                    }
                    bundle = (ImageView)findViewById(0x7f0d00a2);
                    bundle.setOnClickListener(this);
                    obj = bundle.getLayoutParams();
                    j1 = e;
                    if (l1 >= 100)
                    {
                        i1 = 3;
                    }
                    i1 = j1 / i1;
                    obj.height = i1;
                    obj.width = i1;
                    bundle.setImageResource(0x7f0200fa);
                    bundle.setVisibility(0);
                } else
                {
                    bundle = (ImageView)findViewById(0x7f0d00a2);
                    bundle.setOnClickListener(this);
                    android.view.ViewGroup.LayoutParams layoutparams = bundle.getLayoutParams();
                    int k1 = e;
                    if (l1 >= 100)
                    {
                        i1 = 3;
                    }
                    i1 = k1 / i1;
                    layoutparams.height = i1;
                    layoutparams.width = i1;
                    bundle.setImageResource(0x7f0200dc);
                    bundle.setVisibility(0);
                }
            }
            l = (CheckBox)findViewById(0x7f0d00ba);
            l.setBackgroundResource(0x7f020401);
            l.setChecked(true);
            l.setOnCheckedChangeListener(new av(this));
            l.setVisibility(8);
            O = findViewById(0x7f0d00d6);
            D = Color.parseColor("#253034");
            G = (RelativeLayout)findViewById(0x7f0d00bd);
            m = (CheckBox)findViewById(0x7f0d00bf);
            m.setChecked(false);
            m.setTextColor(D);
            m.setOnCheckedChangeListener(new ap(this));
            ((TextView)findViewById(0x7f0d00c0)).setOnClickListener(new at(this));
            com.roidapp.cloudlib.sns.q.d(new au(this)).a(this);
            F = (RelativeLayout)findViewById(0x7f0d00d7);
            n = (RelativeLayout)findViewById(0x7f0d00d2);
            o = (TextView)findViewById(0x7f0d00d3);
            f = (EditText)findViewById(0x7f0d00b8);
            f.setOnTouchListener(new aw(this));
            obj = "";
            bundle = ((Bundle) (obj));
            if (r != null)
            {
                bundle = ((Bundle) (obj));
                if (!TextUtils.isEmpty(r))
                {
                    bundle = (new StringBuilder()).append("").append(r).toString();
                }
            }
            f.setText(bundle);
            f.setSelection(bundle.length());
            f.setFilters(new InputFilter[] {
                new android.text.InputFilter.LengthFilter(4096)
            });
            J = new bb(this, (byte)0);
            f.addTextChangedListener(J);
            g = (RelativeLayout)findViewById(0x7f0d00a8);
            g.setOnClickListener(this);
            h = (RelativeLayout)findViewById(0x7f0d00c1);
            h.setVisibility(8);
            h.setOnClickListener(this);
            i = (ProgressBar)findViewById(0x7f0d00c2);
            c = (TextView)findViewById(0x7f0d00c3);
            j = (LinearLayout)findViewById(0x7f0d00b5);
            k = (ScrollView)findViewById(0x7f0d00df);
            findViewById(0x7f0d00c4).setVisibility(8);
            findViewById(0x7f0d00c5).setVisibility(8);
            findViewById(0x7f0d00c7).setVisibility(8);
            findViewById(0x7f0d00c8).setVisibility(8);
            com.roidapp.cloudlib.sns.upload.e.a().a(p);
            a(com.roidapp.cloudlib.sns.upload.e.a().c());
            com.roidapp.cloudlib.sns.upload.e.a().a(a);
            (new Thread(new bc(this, p, e, s, (byte)0))).start();
        }
    }

    public void onDestroy()
    {
        super.onDestroy();
        com.roidapp.cloudlib.sns.upload.e.a().b(a);
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        if (i1 != 4) goto _L2; else goto _L1
_L1:
        if (!e()) goto _L4; else goto _L3
_L3:
        com.roidapp.baselib.c.b.a("SNS", "click", "back/closehashtags");
        com.roidapp.photogrid.common.af.b(this, "SNS", "click", "back/closehashtags", Long.valueOf(1L));
_L5:
        return false;
_L4:
        if (d()) goto _L5; else goto _L2
_L2:
        return super.onKeyDown(i1, keyevent);
    }

    public final void p_()
    {
        j.setVisibility(8);
    }

    public final void x()
    {
    }
}

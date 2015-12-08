// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.support.v4.print.PrintHelper;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.login.LoginManager;
import com.roidapp.baselib.c.an;
import com.roidapp.baselib.c.n;
import com.roidapp.baselib.e.l;
import com.roidapp.cloudlib.a.a;
import com.roidapp.cloudlib.facebook.FbLoginActivity;
import com.roidapp.cloudlib.facebook.al;
import com.roidapp.cloudlib.sns.o;
import com.roidapp.cloudlib.sns.q;
import com.roidapp.cloudlib.sns.upload.UploadProgressStatusView;
import com.roidapp.cloudlib.sns.upload.b;
import com.roidapp.cloudlib.sns.upload.e;
import com.roidapp.cloudlib.sns.upload.i;
import com.roidapp.cloudlib.template.j;
import com.roidapp.cloudlib.twitter.TwitterVerifyActivity;
import com.roidapp.cloudlib.upload.w;
import com.roidapp.photogrid.MainPage;
import com.roidapp.photogrid.cmid.LoginService;
import com.roidapp.photogrid.common.af;
import com.roidapp.photogrid.common.az;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            o, p, cg, bt, 
//            BaseShareActivity, bv, bz, bw, 
//            bx, by, bs, ce, 
//            cb, cc, cd, ca, 
//            bu, cf

public final class br
    implements com.roidapp.photogrid.cloud.o
{

    public static String c = "https://www.facebook.com/help/249141925204375/";
    private static final p e[] = {
        new p(0x7f02016a, "Line", "jp.naver.line.android"), new p(0x7f020195, "Wechat", "com.tencent.mm"), new p(0x7f020182, "Skype", "com.skype.raider"), new p(0x7f02018a, "Telegram", "org.telegram.messenger")
    };
    private CheckBox A;
    private ce B;
    private int C;
    private int D;
    private String E;
    private Handler F;
    public LinearLayout a;
    public RelativeLayout b;
    com.roidapp.cloudlib.sns.upload.j d;
    private BaseShareActivity f;
    private EditText g;
    private TextView h;
    private CheckBox i;
    private CheckBox j;
    private RelativeLayout k;
    private RelativeLayout l;
    private RelativeLayout m;
    private ProgressBar n;
    private TextView o;
    private String p;
    private String q[];
    private int r;
    private int s;
    private CallbackManager t;
    private boolean u;
    private int v;
    private long w;
    private ArrayList x;
    private ArrayList y;
    private CheckBox z;

    br(BaseShareActivity baseshareactivity)
    {
        p = "#Hashtag";
        q = null;
        u = false;
        v = b.a;
        w = -1L;
        x = new ArrayList();
        y = new ArrayList();
        C = -1;
        D = -1;
        E = "";
        F = new cg(this, (byte)0);
        d = new bt(this);
        f = baseshareactivity;
        af.d(baseshareactivity, (new StringBuilder("Share/Finish/")).append(baseshareactivity.m).toString());
        if (com.roidapp.cloudlib.a.a.a(baseshareactivity.getApplicationContext()).a("event", "mother2015", false))
        {
            p = "#Mother's Day";
            q = (new String[] {
                " #mother", " #mothersday", " #mothernature", " #motherhood", " #mom"
            });
        }
    }

    static int a(br br1, int i1)
    {
        br1.D = i1;
        return i1;
    }

    static String a(br br1, String s1)
    {
        br1.E = s1;
        return s1;
    }

    private static String a(String as[])
    {
        if (as != null) goto _L2; else goto _L1
_L1:
        String s2 = null;
_L4:
        return s2;
_L2:
        int j1 = as.length;
        String s1 = "";
        int i1 = 0;
        do
        {
            s2 = s1;
            if (i1 >= j1)
            {
                continue;
            }
            s1 = (new StringBuilder()).append(s1).append(as[i1]).toString();
            s1 = (new StringBuilder()).append(s1).append(",").toString();
            i1++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    static Collection a(br br1)
    {
        return br1.m();
    }

    private void a(AccessToken accesstoken)
    {
        if (accesstoken == null)
        {
            return;
        }
        if (f.j)
        {
            accesstoken = FbLoginActivity.b;
        } else
        {
            accesstoken = FbLoginActivity.c;
        }
        if (!al.a(accesstoken)) goto _L2; else goto _L1
_L1:
        if (f.j)
        {
            k.setSelected(true);
            k.setBackgroundResource(0x7f0200ef);
        } else
        {
            i.setSelected(true);
        }
_L4:
        accesstoken = new Intent(f, com/roidapp/photogrid/cmid/LoginService);
        accesstoken.setAction("ACTION_LOGIN_BY_FACEBOOK");
        f.startService(accesstoken);
        return;
_L2:
        if (!u)
        {
            u = true;
            if (t == null)
            {
                t = com.facebook.CallbackManager.Factory.create();
                LoginManager.getInstance().registerCallback(t, new bv(this));
            }
            try
            {
                LoginManager.getInstance().logInWithPublishPermissions(f, Arrays.asList(accesstoken));
            }
            // Misplaced declaration of an exception variable
            catch (AccessToken accesstoken)
            {
                accesstoken.printStackTrace();
                u = false;
                al.a(f);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static void a(br br1, LayoutInflater layoutinflater, ViewGroup viewgroup, ViewGroup viewgroup1, Collection collection)
    {
        Iterator iterator = collection.iterator();
        boolean flag = true;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (p)iterator.next();
            ViewGroup viewgroup2;
            if (flag)
            {
                collection = viewgroup;
            } else
            {
                collection = viewgroup1;
            }
            viewgroup2 = (ViewGroup)layoutinflater.inflate(0x7f030026, collection, false);
            if (collection != null && viewgroup2 != null)
            {
                int i1 = ((p) (obj)).a;
                String s1 = ((p) (obj)).c;
                int j1 = ((p) (obj)).b;
                obj = (TextView)viewgroup2.findViewById(0x7f0d00dc);
                if (obj != null)
                {
                    ((TextView) (obj)).setId(i1);
                    ((TextView) (obj)).setText(s1);
                    ((TextView) (obj)).setCompoundDrawablesWithIntrinsicBounds(j1, 0, 0, 0);
                    ((TextView) (obj)).setOnClickListener(br1.f);
                    collection.addView(viewgroup2);
                    if (!flag)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                }
            }
        } while (true);
    }

    public static boolean a(Activity activity, int i1, String s1, int j1, String s2, String s3, String s4, String s5, 
            String s6, boolean flag, int k1)
    {
        return com.roidapp.photogrid.cloud.BaseShareActivity.a(activity, i1, s1, j1, s2, s3, s4, s5, s6, flag, true, k1);
    }

    static boolean a(br br1, long l1, int i1)
    {
        UploadProgressStatusView uploadprogressstatusview = (UploadProgressStatusView)br1.a.findViewWithTag(Long.valueOf(l1));
        if (uploadprogressstatusview != null)
        {
            uploadprogressstatusview.a(1);
            uploadprogressstatusview.b(i1);
            if (i1 == 100)
            {
                br1.a.removeView(uploadprogressstatusview);
            }
            return true;
        } else
        {
            return false;
        }
    }

    static int b(br br1)
    {
        return br1.D;
    }

    static int b(br br1, int i1)
    {
        br1.C = i1;
        return i1;
    }

    static void b(br br1, String s1)
    {
        br1.c(s1);
    }

    static int c(br br1, int i1)
    {
        br1.v = i1;
        return i1;
    }

    static BaseShareActivity c(br br1)
    {
        return br1.f;
    }

    private void c(String s1)
    {
        if (com.roidapp.baselib.c.n.a(s1, (new StringBuilder("#")).append(E).toString()))
        {
            A.setChecked(true);
            A.setTextColor(-1);
            return;
        } else
        {
            A.setChecked(false);
            A.setTextColor(s);
            return;
        }
    }

    static CheckBox d(br br1)
    {
        return br1.A;
    }

    private boolean d(String s1)
    {
        boolean flag1 = false;
        int i1 = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i1 < y.size())
                {
                    if (!((String)y.get(i1)).equalsIgnoreCase(s1))
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

    static int e(br br1)
    {
        return br1.s;
    }

    static EditText f(br br1)
    {
        return br1.g;
    }

    static int g(br br1)
    {
        return br1.C;
    }

    static CheckBox h(br br1)
    {
        return br1.z;
    }

    static String i(br br1)
    {
        return br1.E;
    }

    static void j(br br1)
    {
        br1.n();
    }

    static long k(br br1)
    {
        return br1.w;
    }

    static RelativeLayout l(br br1)
    {
        return br1.l;
    }

    static RelativeLayout m(br br1)
    {
        return br1.m;
    }

    private Collection m()
    {
        Object obj;
        SharedPreferences sharedpreferences;
        sharedpreferences = f.getSharedPreferences("share", 0);
        obj = null;
        if (!f.j) goto _L2; else goto _L1
_L1:
        Object obj1;
        Object obj2;
        Intent intent;
        obj1 = new HashSet();
        obj2 = f.getPackageManager();
        intent = new Intent("android.intent.action.SEND", null);
        intent.setType("video/mp4");
        obj = null;
        obj2 = ((PackageManager) (obj2)).queryIntentActivities(intent, 0);
        obj = obj2;
_L11:
        if (obj != null)
        {
            obj = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                Object obj3 = (ResolveInfo)((Iterator) (obj)).next();
                if (((ResolveInfo) (obj3)).activityInfo != null)
                {
                    obj3 = ((ResolveInfo) (obj3)).activityInfo.packageName;
                    if (!TextUtils.isEmpty(((CharSequence) (obj3))))
                    {
                        ((Set) (obj1)).add(obj3);
                    }
                }
            } while (true);
        }
        obj = obj1;
_L2:
        int i1;
        long l1;
        obj1 = new TreeSet();
        l1 = 99L;
        ((TreeSet) (obj1)).add(new p(sharedpreferences.getLong("Messenger", 100L), 0x7f02015b, -8, "Messenger"));
        if (com.roidapp.baselib.c.n.a(f, "com.whatsapp"))
        {
            l1 = 98L;
            ((TreeSet) (obj1)).add(new p(sharedpreferences.getLong("Whatsapp", 99L), 0x7f020196, -7, "Whatsapp"));
        }
        long l2 = l1;
        l1 = l2;
        if (com.roidapp.baselib.c.n.a(f, "com.google.android.apps.plus"))
        {
            ((TreeSet) (obj1)).add(new p(sharedpreferences.getLong("Google+", l2), 0x7f020162, -2, "Google+"));
            l1 = l2 - 1L;
        }
        l2 = l1;
        if (!f.j)
        {
            ((TreeSet) (obj1)).add(new p(sharedpreferences.getLong("Pinterest", l1), 0x7f020173, -6, "Pinterest"));
            l2 = l1 - 1L;
        }
        String s1 = f.getString(0x7f070140);
        ((TreeSet) (obj1)).add(new p(sharedpreferences.getLong(s1, l2), 0x7f02016d, -3, s1));
        i1 = 0;
        l1 = l2 - 1L;
_L9:
        if (i1 >= e.length) goto _L4; else goto _L3
_L3:
        if (obj != null) goto _L6; else goto _L5
_L5:
        long l3 = l1;
        if (!com.roidapp.baselib.c.n.a(f, e[i1].d)) goto _L8; else goto _L7
_L7:
        ((TreeSet) (obj1)).add(new p(e[i1], sharedpreferences.getLong(e[i1].c, l1), i1));
        l3 = l1 - 1L;
_L8:
        i1++;
        l1 = l3;
          goto _L9
_L6:
        l3 = l1;
        if (!((Set) (obj)).contains(e[i1].d)) goto _L8; else goto _L7
_L4:
        long l4 = l1;
        if (!f.j)
        {
            l4 = l1;
            if (android.os.Build.VERSION.SDK_INT >= 19)
            {
                l4 = l1;
                if (PrintHelper.systemSupportsPrint())
                {
                    ((TreeSet) (obj1)).add(new p(l1, 0x7f020176, -5, f.getString(0x7f0702b3)));
                    l4 = l1 - 1L;
                }
            }
        }
        ((TreeSet) (obj1)).add(new p(l4, 0x7f020180, -4, f.getString(0x7f070216)));
        return ((Collection) (obj1));
        Exception exception;
        exception;
        if (true) goto _L11; else goto _L10
_L10:
    }

    static ProgressBar n(br br1)
    {
        return br1.n;
    }

    private void n()
    {
        if (!com.roidapp.baselib.e.l.b(f)) goto _L2; else goto _L1
_L1:
        Object obj;
        ArrayList arraylist;
        StringBuilder stringbuilder;
        obj = e();
        arraylist = new ArrayList(2);
        stringbuilder = new StringBuilder(f.l);
        if (j != null && j.isSelected())
        {
            arraylist.add("twitter");
            stringbuilder.append("Twitter+");
            if (az.q == 4)
            {
                com.roidapp.baselib.c.b.f("SendTwitter", com.roidapp.cloudlib.template.j.g());
            }
        }
        if (!f.j) goto _L4; else goto _L3
_L3:
        if (k != null && k.isSelected())
        {
            arraylist.add("facebook");
            stringbuilder.append("Facebook+");
            if (az.q == 4)
            {
                com.roidapp.baselib.c.b.f("SendFacebook", com.roidapp.cloudlib.template.j.g());
            }
        }
_L6:
        stringbuilder.append(f.n);
        if (arraylist.size() == 0)
        {
            an.a(f, 0x7f0700d1);
        } else
        {
            af.b(f, stringbuilder.toString());
            if (!arraylist.isEmpty())
            {
                Resources resources = f.getResources();
                if (resources != null)
                {
                    com.roidapp.cloudlib.upload.w.a(f, f.f, arraylist, f.h, ((String) (obj)), resources.getString(0x7f0702d7), resources.getConfiguration().locale, f.g, f.m);
                    an.a(f, 0x7f0702c0);
                }
            }
            obj = arraylist.iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                String s1 = (String)((Iterator) (obj)).next();
                com.roidapp.baselib.c.b.a("SNS", "share_click", (new StringBuilder("Save/Share/")).append(s1).toString());
                af.b(f, "SNS", "share_click", (new StringBuilder("Save/Share/")).append(s1).toString(), Long.valueOf(1L));
            }
        }
        return;
_L4:
        if (i != null && i.isSelected())
        {
            arraylist.add("facebook");
            stringbuilder.append("Facebook+");
            if (az.q == 4)
            {
                com.roidapp.baselib.c.b.f("SendFacebook", com.roidapp.cloudlib.template.j.g());
            }
        }
        continue; /* Loop/switch isn't completed */
_L2:
        com.roidapp.baselib.e.l.a(f, null);
        return;
        if (true) goto _L6; else goto _L5
_L5:
    }

    static TextView o(br br1)
    {
        return br1.o;
    }

    private void o()
    {
        boolean flag = false;
        InputMethodManager inputmethodmanager = (InputMethodManager)f.getSystemService("input_method");
        if (inputmethodmanager != null)
        {
            inputmethodmanager.hideSoftInputFromWindow(g.getWindowToken(), 0);
        }
        if (!com.roidapp.baselib.e.l.b(f))
        {
            com.roidapp.baselib.e.l.a(f, null);
        } else
        {
            Object obj1 = PreferenceManager.getDefaultSharedPreferences(f);
            String as[] = ((SharedPreferences) (obj1)).getString("history_tag", "").split(",");
            Object obj = new LinkedHashSet();
            for (int i1 = as.length - 1; i1 >= 0; i1--)
            {
                ((Set) (obj)).add(as[i1]);
            }

            as = com.roidapp.baselib.c.n.a(g.getText().toString(), null);
            for (int j1 = 0; j1 < as.length; j1++)
            {
                if (d(as[j1]))
                {
                    continue;
                }
                if (((Set) (obj)).size() >= 20)
                {
                    ((Set) (obj)).remove(((Set) (obj)).iterator().next());
                }
                ((Set) (obj)).add((new StringBuilder("#")).append(as[j1]).toString());
            }

            String as1[] = (String[])((Set) (obj)).toArray(new String[((Set) (obj)).size()]);
            obj = "";
            for (int k1 = as1.length - 1; k1 >= 0; k1--)
            {
                String s1 = (new StringBuilder()).append(((String) (obj))).append(as1[k1]).toString();
                obj = s1;
                if (k1 > 0)
                {
                    obj = (new StringBuilder()).append(s1).append(",").toString();
                }
            }

            ((SharedPreferences) (obj1)).edit().putString("history_tag", ((String) (obj))).apply();
            com.roidapp.baselib.c.b.a("SNS", "share_click", "Save/Share/SendPG");
            af.b(f, "SNS", "share_click", "Save/Share/SendPG", Long.valueOf(1L));
            if (az.q == 4)
            {
                com.roidapp.baselib.c.b.f("SendPG", com.roidapp.cloudlib.template.j.g());
            }
            v = b.e;
            com.roidapp.cloudlib.sns.upload.e.a().b();
            if (com.roidapp.cloudlib.sns.upload.e.a().d())
            {
                l.setVisibility(8);
                m.setVisibility(0);
                n.setVisibility(8);
                o.setText(f.getString(0x7f0700f9));
                v = b.e;
            } else
            {
                l.setVisibility(8);
                m.setVisibility(0);
                n.setVisibility(0);
                n.setProgress(0);
                m.setBackgroundColor(-1);
                o.setText(f.getString(0x7f0700fa));
                com.roidapp.baselib.c.n.a(o, 0, 0, 0);
            }
            obj = g.getText().toString();
            s1 = com.roidapp.baselib.c.n.a(((String) (obj)), q);
            obj1 = a(s1);
            for (int l1 = ((flag) ? 1 : 0); l1 < s1.length; l1++)
            {
                com.roidapp.baselib.c.b.a("SNS", "hashtags_upload", s1[l1]);
                af.b(f, "SNS", "hashtags_upload", s1[l1], Long.valueOf(1L));
            }

            if (w == -1L)
            {
                w = com.roidapp.cloudlib.sns.upload.e.a(f, f.f, ((String) (obj1)), ((String) (obj)));
                return;
            }
            obj = com.roidapp.cloudlib.sns.upload.e.a().a(w);
            if (obj != null)
            {
                com.roidapp.cloudlib.sns.upload.e.a().b(((i) (obj)).e);
                com.roidapp.cloudlib.sns.upload.e.a(f, ((i) (obj)));
                return;
            }
        }
    }

    private void p()
    {
        if (h != null && g != null)
        {
            int i1 = 140 - g.getText().length();
            h.setText(String.valueOf(i1));
            TextView textview = h;
            if (i1 < 0)
            {
                i1 = 0xffee0000;
            } else
            {
                i1 = r;
            }
            textview.setTextColor(i1);
            if (h.getVisibility() != 0)
            {
                h.setVisibility(0);
            }
        }
    }

    static void p(br br1)
    {
        boolean flag1 = true;
        boolean flag = true;
        AccessToken accesstoken = al.b();
        if (br1.f.j)
        {
            if (accesstoken == null || accesstoken.isExpired() || !al.a(FbLoginActivity.b))
            {
                flag = false;
            }
            br1.k.setSelected(flag);
            if (flag)
            {
                br1.k.setBackgroundResource(0x7f0200ef);
                return;
            } else
            {
                br1.k.setBackgroundResource(0x7f0200ed);
                return;
            }
        }
        br1 = br1.i;
        if (accesstoken != null && !accesstoken.isExpired() && al.a(FbLoginActivity.c))
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        br1.setSelected(flag);
    }

    static Handler q(br br1)
    {
        return br1.F;
    }

    static ce r(br br1)
    {
        return br1.B;
    }

    public final View a(ViewGroup viewgroup)
    {
        boolean flag1 = true;
        View view = f.getLayoutInflater().inflate(0x7f030023, viewgroup, false);
        z = (CheckBox)view.findViewById(0x7f0d00ba);
        z.setBackgroundResource(0x7f020401);
        z.setChecked(true);
        z.setOnCheckedChangeListener(new bz(this));
        z.setVisibility(8);
        s = Color.parseColor("#253034");
        b = (RelativeLayout)view.findViewById(0x7f0d00bd);
        A = (CheckBox)view.findViewById(0x7f0d00bf);
        A.setChecked(false);
        A.setTextColor(s);
        A.setOnCheckedChangeListener(new bw(this));
        ((TextView)view.findViewById(0x7f0d00c0)).setOnClickListener(new bx(this));
        com.roidapp.cloudlib.sns.q.d(new by(this)).a(this);
        a = (LinearLayout)view.findViewById(0x7f0d00b5);
        j = (CheckBox)view.findViewById(0x7f0d00cc);
        i = (CheckBox)view.findViewById(0x7f0d00ca);
        k = (RelativeLayout)view.findViewById(0x7f0d00c5);
        k.setOnClickListener(f);
        l = (RelativeLayout)view.findViewById(0x7f0d00a8);
        l.setOnClickListener(f);
        m = (RelativeLayout)view.findViewById(0x7f0d00c1);
        m.setVisibility(8);
        m.setOnClickListener(f);
        if (f.j)
        {
            l.setVisibility(8);
        }
        v = b.a;
        o = (TextView)view.findViewById(0x7f0d00c3);
        n = (ProgressBar)view.findViewById(0x7f0d00c2);
        g = (EditText)view.findViewById(0x7f0d00b8);
        h = (TextView)view.findViewById(0x7f0d00bb);
        r = h.getTextColors().getDefaultColor();
        g.setOnTouchListener(new bs(this));
        String s1 = "";
        viewgroup = s1;
        if (f.i != null)
        {
            viewgroup = s1;
            if (!TextUtils.isEmpty(f.i))
            {
                viewgroup = (new StringBuilder()).append("").append(f.i).toString();
            }
        }
        g.setText(viewgroup);
        g.setSelection(viewgroup.length());
        g.setFilters(new InputFilter[] {
            new android.text.InputFilter.LengthFilter(4096)
        });
        B = new ce(this, (byte)0);
        g.addTextChangedListener(B);
        boolean flag2;
        if (android.os.Build.VERSION.SDK_INT <= 4)
        {
            flag1 = false;
            flag2 = false;
        } else
        {
            boolean flag;
            if (!al.d())
            {
                flag = false;
            } else
            {
                flag = true;
            }
            flag2 = flag;
            if (f.j)
            {
                flag1 = false;
                flag2 = flag;
            }
        }
        if (!flag2 && !flag1)
        {
            view.findViewById(0x7f0d00c8).setVisibility(8);
            view.findViewById(0x7f0d00c7).setVisibility(8);
        } else
        {
            if (!flag2)
            {
                i.setVisibility(8);
                view.findViewById(0x7f0d00cb).setVisibility(8);
            } else
            {
                i.setOnClickListener(f);
            }
            if (!flag1)
            {
                j.setVisibility(8);
                view.findViewById(0x7f0d00cb).setVisibility(8);
            } else
            {
                j.setOnClickListener(f);
            }
        }
        view.findViewById(0x7f0d00cd).setOnClickListener(f);
        view.findViewById(0x7f0d00c4).setOnClickListener(f);
        if (f.j)
        {
            view.findViewById(0x7f0d00cd).setVisibility(8);
            view.findViewById(0x7f0d00c8).setVisibility(8);
            view.findViewById(0x7f0d00c7).setVisibility(8);
            k.setVisibility(0);
        } else
        {
            k.setVisibility(8);
            com.roidapp.baselib.c.n.a(i, 0x7f020126, 0, 0);
        }
        a(com.roidapp.cloudlib.sns.upload.e.a().c());
        com.roidapp.cloudlib.sns.upload.e.a().a(d);
        return view;
    }

    public final String a(String s1)
    {
        return String.format("Cloud/Share/%s/", new Object[] {
            s1
        });
    }

    public final void a()
    {
label0:
        {
            if (f.j && al.d())
            {
                if (!al.a(FbLoginActivity.b))
                {
                    break label0;
                }
                k.setSelected(true);
                k.setBackgroundResource(0x7f0200ef);
            }
            return;
        }
        k.setSelected(false);
        k.setBackgroundResource(0x7f0200ed);
    }

    public final void a(int i1, int j1, Intent intent)
    {
        i1;
        JVM INSTR tableswitch 43969 43970: default 24
    //                   43969 50
    //                   43970 58;
           goto _L1 _L2 _L3
_L1:
        if (t != null)
        {
            t.onActivityResult(i1, j1, intent);
        }
        u = false;
_L5:
        return;
_L2:
        a(al.b());
        return;
_L3:
        if (com.roidapp.cloudlib.common.a.p(f))
        {
            j.setSelected(true);
            p();
            return;
        }
        j.setSelected(false);
        if (h != null && h.getVisibility() != 8)
        {
            h.setVisibility(8);
            return;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final void a(View view)
    {
        view.getId();
        JVM INSTR lookupswitch 7: default 72
    //                   2131558568: 424
    //                   2131558586: 72
    //                   2131558593: 468
    //                   2131558597: 78
    //                   2131558602: 78
    //                   2131558604: 319
    //                   2131558605: 73;
           goto _L1 _L2 _L1 _L3 _L4 _L4 _L5 _L6
_L1:
        return;
_L6:
        n();
        return;
_L4:
        view = al.b();
        if (view != null && !view.isExpired())
        {
            if (f.j)
            {
                if (k.isSelected())
                {
                    if ((f.o & com.roidapp.photogrid.cloud.BaseShareActivity.b) != 0)
                    {
                        af.b(f, "SharePage/ShareToFB/VideoDialog");
                        view = (new android.app.AlertDialog.Builder(f)).create();
                        view.setCanceledOnTouchOutside(false);
                        view.show();
                        try
                        {
                            view.getWindow().setContentView(0x7f03009a);
                        }
                        catch (Exception exception)
                        {
                            exception.getStackTrace();
                            view.dismiss();
                            return;
                        }
                        ((TextView)view.findViewById(0x7f0d0270)).setOnClickListener(new cb(this, view));
                        ((TextView)view.findViewById(0x7f0d0271)).setOnClickListener(new cc(this, view));
                        ((TextView)view.findViewById(0x7f0d0272)).setOnClickListener(new cd(this, view));
                        return;
                    } else
                    {
                        n();
                        return;
                    }
                } else
                {
                    a(((AccessToken) (view)));
                    return;
                }
            }
            if (i.isSelected())
            {
                i.setSelected(false);
                return;
            } else
            {
                a(((AccessToken) (view)));
                return;
            }
        } else
        {
            view = new Intent(f, com/roidapp/cloudlib/facebook/FbLoginActivity);
            view.setFlags(0x4000000);
            f.startActivityForResult(view, 43969);
            return;
        }
_L5:
        if (!com.roidapp.cloudlib.common.a.p(f))
        {
            view = new Intent(f, com/roidapp/cloudlib/twitter/TwitterVerifyActivity);
            view.setFlags(0x4000000);
            f.startActivityForResult(view, 43970);
            return;
        }
        if (j.isSelected())
        {
            j.setSelected(false);
            if (h != null && h.getVisibility() != 8)
            {
                h.setVisibility(8);
                return;
            }
        } else
        {
            j.setSelected(true);
            p();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (com.roidapp.cloudlib.sns.af.a(f))
        {
            o();
            return;
        }
        if (!f.q)
        {
            com.roidapp.cloudlib.sns.af.a(f, new ca(this), "Share_Finish_Page");
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (v == b.c)
        {
            f.setResult(34825);
            f.finish();
            view = new Intent(f, com/roidapp/photogrid/MainPage);
            view.putExtra("jump_from_sharepage", true);
            az.s = false;
            f.startActivity(view);
            return;
        }
        if (com.roidapp.cloudlib.sns.upload.e.a().b() > 0)
        {
            an.a(f, f.getString(0x7f0700f9));
            return;
        } else
        {
            an.a(f, "Uploading now, please wait...");
            return;
        }
    }

    public final void a(String s1, String s2)
    {
        s1 = (new StringBuilder("@")).append(s1).toString();
        s2 = (new StringBuilder("@")).append(s2).toString();
        int i1 = g.getSelectionStart();
        g.getText().replace(Math.max(i1 - s1.length(), 0), i1, s2);
        g.setSelection(Math.min((i1 - s1.length()) + s2.length(), g.length()));
        B.a();
    }

    public final void a(String s1, boolean flag)
    {
        B.a();
        if (!flag) goto _L2; else goto _L1
_L1:
        String s2;
        String as[];
label0:
        {
            x.remove(s1);
            s2 = g.getText().toString();
            String as1[] = s2.split((new StringBuilder()).append(s1).append(" ").toString());
            if (as1.length != 1)
            {
                as = as1;
                if (as1.length != 0)
                {
                    break label0;
                }
            }
            as = s2.split(s1);
        }
        if (as.length <= 1) goto _L4; else goto _L3
_L3:
        int i1;
        s1 = "";
        if (!as[0].equalsIgnoreCase(" "))
        {
            s1 = as[0];
        }
        s2 = s1;
        if (!as[1].equalsIgnoreCase(" "))
        {
            s2 = (new StringBuilder()).append(s1).append(as[1]).toString();
        }
        i1 = as[0].length();
        s1 = s2;
_L6:
        g.setText(s1);
        g.setSelection(Math.min(i1, g.length()));
        return;
_L4:
        String s3;
        if (as.length == 1)
        {
            if (!as[0].equalsIgnoreCase(" "))
            {
                s1 = as[0];
                i1 = as[0].length();
                continue; /* Loop/switch isn't completed */
            }
        } else
        if (as.length == 0)
        {
            s1 = "";
            i1 = 0;
            continue; /* Loop/switch isn't completed */
        }
        i1 = 0;
        s1 = s2;
        continue; /* Loop/switch isn't completed */
_L2:
        x.add(s1);
        i1 = g.getSelectionStart();
        s3 = g.getText().toString();
        s2 = s3.substring(0, i1);
        s3 = s3.substring(i1, s3.length());
        s1 = (new StringBuilder()).append(s1).append(" ").toString();
        s2 = (new StringBuilder()).append(s2).append(s1).append(s3).toString();
        g.setText(s2);
        g.setSelection(Math.min(i1 + s1.length(), g.getText().length()));
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
            UploadProgressStatusView uploadprogressstatusview = (UploadProgressStatusView)a.findViewWithTag(Long.valueOf(l1));
            if (l1 == w)
            {
                if (byte0 == 2)
                {
                    l.setVisibility(0);
                    m.setVisibility(8);
                    n.setProgress(0);
                    if (v != b.d)
                    {
                        v = b.d;
                        an.a(f, f.getString(0x7f0700c0));
                    }
                } else
                if (com.roidapp.cloudlib.sns.upload.e.a().b() == 0)
                {
                    o.setText(f.getString(0x7f0700fa));
                    l.setVisibility(8);
                    m.setVisibility(0);
                    n.setVisibility(0);
                }
            } else
            if (uploadprogressstatusview == null)
            {
                uploadprogressstatusview = new UploadProgressStatusView(f);
                uploadprogressstatusview.setTag(Long.valueOf(l1));
                uploadprogressstatusview.a(byte0);
                uploadprogressstatusview.b(i1.d);
                uploadprogressstatusview.a(i1.a);
                android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-1, -2);
                layoutparams.bottomMargin = 20;
                uploadprogressstatusview.setLayoutParams(layoutparams);
                a.addView(uploadprogressstatusview);
                uploadprogressstatusview.a(new bu(this, uploadprogressstatusview, i1));
            } else
            {
                uploadprogressstatusview.a(byte0);
                uploadprogressstatusview.b(i1.d);
            }
        } while (true);
    }

    public final void b(String s1)
    {
        y.add(s1);
    }

    public final com.roidapp.photogrid.cloud.a.l[] b()
    {
        return (new com.roidapp.photogrid.cloud.a.l[] {
            new cf(this, f, f)
        });
    }

    public final int c()
    {
        return 0x7f0d00a1;
    }

    public final int d()
    {
        return 0x7f070228;
    }

    public final String e()
    {
        if (g != null)
        {
            return g.getText().toString();
        } else
        {
            return "";
        }
    }

    public final boolean f()
    {
        return true;
    }

    public final void g()
    {
        com.roidapp.cloudlib.sns.upload.e.a().b(d);
    }

    public final void h()
    {
        D = -1;
    }

    public final void i()
    {
        C = -1;
    }

    public final void j()
    {
        y.clear();
    }

    public final ArrayList k()
    {
        Object obj = g.getText().toString();
        obj = Pattern.compile("#\\w+").matcher(((CharSequence) (obj)));
        x.clear();
        String s1;
        for (; ((Matcher) (obj)).find(); x.add(s1))
        {
            s1 = ((Matcher) (obj)).group();
        }

        return x;
    }

    public final void l()
    {
        z.setChecked(true);
        z.setVisibility(8);
        c(g.getText().toString());
    }

}

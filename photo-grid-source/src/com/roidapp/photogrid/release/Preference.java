// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Environment;
import android.preference.PreferenceManager;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.roidapp.baselib.c.n;
import com.roidapp.cloudlib.AccountMgrActivity;
import com.roidapp.photogrid.MainPage;
import com.roidapp.photogrid.common.Eula;
import com.roidapp.photogrid.common.JoinAndroidBeta;
import com.roidapp.photogrid.common.PrivacyPolicy;
import com.roidapp.photogrid.common.an;
import com.roidapp.photogrid.common.az;
import com.roidapp.photogrid.common.b;
import com.roidapp.photogrid.common.ba;
import com.roidapp.photogrid.common.bq;
import com.roidapp.photogrid.common.cc;
import com.roidapp.photogrid.common.o;
import java.io.File;

// Referenced classes of package com.roidapp.photogrid.release:
//            ParentActivity, qh, qd, PathSelector, 
//            qe, qf, qb, qc

public class Preference extends ParentActivity
{

    private ListView a;
    private o b;
    private int c;
    private boolean d;
    private boolean e;
    private final String f[] = {
        "English", "Deutsch", "French", "\u65E5\u672C\u8A9E", "\uD55C\uAD6D\uC5B4", "\u0E20\u0E32\u0E29\u0E32\u0E44\u0E17\u0E22", "\u7B80\u4F53\u4E2D\u6587", "\u7E41\u4F53\u4E2D\u6587", "Espa\361a", "\u0627\u0644\u0639\u0631\u0628\u064A\u0629", 
        "T\374rk\347e", "\u0420\u0443\u0441\u0441\u043A\u0438\u0439", "\u0939\u093F\u0902\u0926\u0940", "Indonesia", "Italiano", "Melayu", "Portugu\352s", "\u0423\u043A\u0440\u0430\u0457\u043D\u0441\u044C\u043A\u0438\u0439", "Vi\u1EC7t", "\u0641\u0627\u0631\u0633\u06CC", 
        "Polski", "Az\u0259rbaycan", "Dansk", "Norsk", "\u05E9\u05E4\u05EA \u05E2\u05D1\u05E8\u05D9\u05EA", "Nederlands", "Rom\342n", "\u0388\u03BB\u03BB\u03B7\u03BD\u03B9\u03BA\u03AC", "\u010Ce\u0161tina", "Magyar Nyelv", 
        "\u0431\u044A\u043B\u0433\u0430\u0440\u0441\u043A\u0438", "Svenska", "\u0421\u0440\u043F\u0441\u043A\u0430"
    };

    public Preference()
    {
        d = false;
    }

    static boolean A(Preference preference)
    {
        boolean flag = false;
        if (preference.getSharedPreferences(preference.getPackageName(), 0).getBoolean("SHARE_BORDER", false))
        {
            flag = true;
        }
        return flag;
    }

    static String B(Preference preference)
    {
        return (new StringBuilder()).append(preference.getString(0x7f07021d)).append(" ").append(com.roidapp.baselib.c.n.d(preference)).append(" ").append(preference.getString(0x7f07021e)).toString();
    }

    static boolean a(Preference preference)
    {
        return preference.e;
    }

    private void b()
    {
        if (d)
        {
            return;
        } else
        {
            d = true;
            ba.a().a(this);
            Intent intent = new Intent();
            intent.setClass(this, com/roidapp/photogrid/MainPage);
            startActivity(intent);
            finish();
            return;
        }
    }

    static void b(Preference preference)
    {
        preference.d();
    }

    static void c(Preference preference)
    {
        preference.b();
    }

    private void d()
    {
        if (d)
        {
            return;
        } else
        {
            d = true;
            ba.a().a(this);
            finish();
            return;
        }
    }

    static void d(Preference preference)
    {
        SharedPreferences sharedpreferences;
        android.content.SharedPreferences.Editor editor;
        sharedpreferences = preference.getSharedPreferences(preference.getPackageName(), 0);
        editor = sharedpreferences.edit();
        sharedpreferences.getInt("SHAKE", 1);
        JVM INSTR tableswitch 1 2: default 48
    //                   1 81
    //                   2 68;
           goto _L1 _L2 _L3
_L1:
        editor.apply();
        ((qh)preference.a.getAdapter()).notifyDataSetChanged();
        return;
_L3:
        editor.putInt("SHAKE", 1);
        continue; /* Loop/switch isn't completed */
_L2:
        editor.putInt("SHAKE", 2);
        if (true) goto _L1; else goto _L4
_L4:
    }

    static void e(Preference preference)
    {
        (new android.app.AlertDialog.Builder(preference)).setTitle(0x7f07019a).setSingleChoiceItems(preference.f, an.a(preference), new qd(preference)).show();
    }

    static void f(Preference preference)
    {
        SharedPreferences sharedpreferences = preference.getSharedPreferences(preference.getPackageName(), 0);
        android.content.SharedPreferences.Editor editor = sharedpreferences.edit();
        if (sharedpreferences.getBoolean("WATER_MARK", false))
        {
            editor.putBoolean("WATER_MARK", false);
        } else
        {
            editor.putBoolean("WATER_MARK", true);
        }
        editor.apply();
        ((qh)preference.a.getAdapter()).notifyDataSetChanged();
    }

    static void g(Preference preference)
    {
        SharedPreferences sharedpreferences = PreferenceManager.getDefaultSharedPreferences(preference);
        android.content.SharedPreferences.Editor editor = sharedpreferences.edit();
        if (sharedpreferences.getBoolean("SHOW_NOTIFICATION_FLAG", true))
        {
            editor.putBoolean("SHOW_NOTIFICATION_FLAG", false);
        } else
        {
            editor.putBoolean("SHOW_NOTIFICATION_FLAG", true);
        }
        editor.apply();
        ((qh)preference.a.getAdapter()).notifyDataSetChanged();
    }

    static void h(Preference preference)
    {
        if (Environment.getExternalStorageState().equals("mounted"))
        {
            preference.startActivityForResult(new Intent(preference, com/roidapp/photogrid/release/PathSelector), 52225);
            return;
        } else
        {
            Toast.makeText(preference, 0x7f07028d, 1).show();
            return;
        }
    }

    static void i(Preference preference)
    {
        SharedPreferences sharedpreferences = preference.getSharedPreferences(preference.getPackageName(), 0);
        android.content.SharedPreferences.Editor editor = sharedpreferences.edit();
        if (sharedpreferences.getBoolean("FILTER_OPTIMIZATION", false))
        {
            editor.putBoolean("FILTER_OPTIMIZATION", false);
        } else
        {
            (new android.app.AlertDialog.Builder(preference.a.getContext())).setMessage(0x7f070224).setPositiveButton(0x7f07024f, new qe(preference)).show();
            editor.putBoolean("FILTER_OPTIMIZATION", true);
        }
        editor.apply();
        ((qh)preference.a.getAdapter()).notifyDataSetChanged();
    }

    static void j(Preference preference)
    {
        SharedPreferences sharedpreferences = preference.getSharedPreferences(preference.getPackageName(), 0);
        android.content.SharedPreferences.Editor editor = sharedpreferences.edit();
        if (sharedpreferences.getBoolean("SHARE_BORDER", false))
        {
            editor.putBoolean("SHARE_BORDER", false);
        } else
        {
            editor.putBoolean("SHARE_BORDER", true);
            android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(preference);
            Object obj = LayoutInflater.from(preference).inflate(0x7f030123, null);
            builder.setView(((View) (obj)));
            builder.setPositiveButton(0x7f07024f, new qf(preference));
            obj = (TextView)((View) (obj)).findViewById(0x7f0d010c);
            String as[] = preference.getResources().getStringArray(0x7f080001);
            int ai[] = new int[as.length];
            StringBuffer stringbuffer = new StringBuffer();
            for (int i1 = 0; i1 < as.length; i1++)
            {
                ai[i1] = as[i1].length();
                stringbuffer.append(as[i1]);
            }

            SpannableString spannablestring = new SpannableString(stringbuffer.toString());
            spannablestring.setSpan(new ForegroundColorSpan(0xffff0000), ai[0], ai[0] + ai[1], 33);
            ((TextView) (obj)).setText(spannablestring);
            builder.create();
            builder.show();
        }
        editor.apply();
        ((qh)preference.a.getAdapter()).notifyDataSetChanged();
    }

    static void k(Preference preference)
    {
        az.k = false;
        Intent intent = new Intent();
        intent.setClass(preference, com/roidapp/cloudlib/AccountMgrActivity);
        preference.startActivity(intent);
    }

    static void l(Preference preference)
    {
        if (PreferenceManager.getDefaultSharedPreferences(preference).getString("SAVEPATH", "").equals(""))
        {
            String s1 = (new StringBuilder()).append(Environment.getExternalStorageDirectory().getAbsolutePath()).append("/").append(preference.getString(0x7f07002e)).toString();
            PreferenceManager.getDefaultSharedPreferences(preference).edit().putString("SAVEPATH", s1).apply();
        }
        com.roidapp.photogrid.common.b.a("Update/Click");
        bq.d();
        bq.a(preference.a(), preference).a();
    }

    static void m(Preference preference)
    {
        preference.b.b();
    }

    static void n(Preference preference)
    {
        preference.b.a();
    }

    static void o(Preference preference)
    {
        az.l = false;
        Intent intent = new Intent();
        intent.setClass(preference, com/roidapp/photogrid/common/JoinAndroidBeta);
        preference.startActivity(intent);
    }

    static void p(Preference preference)
    {
        preference.b.c();
    }

    static void q(Preference preference)
    {
        az.l = false;
        Intent intent = new Intent();
        intent.setClass(preference, com/roidapp/photogrid/common/PrivacyPolicy);
        preference.startActivity(intent);
    }

    static void r(Preference preference)
    {
        az.l = false;
        Intent intent = new Intent();
        intent.setClass(preference, com/roidapp/photogrid/common/Eula);
        preference.startActivity(intent);
    }

    static int s(Preference preference)
    {
        int i1 = preference.c;
        preference.c = i1 + 1;
        return i1;
    }

    static int t(Preference preference)
    {
        return preference.c;
    }

    static int u(Preference preference)
    {
        preference.c = 0;
        return 0;
    }

    static boolean v(Preference preference)
    {
        return preference.getSharedPreferences(preference.getPackageName(), 0).getInt("SHAKE", 1) == 1;
    }

    static boolean w(Preference preference)
    {
        return preference.getSharedPreferences(preference.getPackageName(), 0).getBoolean("WATER_MARK", false);
    }

    static boolean x(Preference preference)
    {
        return PreferenceManager.getDefaultSharedPreferences(preference).getBoolean("SHOW_NOTIFICATION_FLAG", true);
    }

    static String y(Preference preference)
    {
        String s1 = (new StringBuilder()).append(Environment.getExternalStorageDirectory().getAbsolutePath()).append("/").append(preference.getString(0x7f07002e)).toString();
        return PreferenceManager.getDefaultSharedPreferences(preference).getString("SAVEPATH", s1);
    }

    static boolean z(Preference preference)
    {
        return preference.getSharedPreferences(preference.getPackageName(), 0).getBoolean("FILTER_OPTIMIZATION", false);
    }

    public final void a(boolean flag)
    {
        getSharedPreferences("DebugMode", 0).edit().putBoolean("DebugMode", flag).apply();
    }

    public final boolean a()
    {
        return getSharedPreferences("DebugMode", 0).getBoolean("DebugMode", false);
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
        if (i1 == 52225 && j1 == 52226 && intent != null && intent.getExtras() != null)
        {
            intent = (qh)a.getAdapter();
            if (intent != null)
            {
                intent.notifyDataSetChanged();
            }
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        try
        {
            setContentView(0x7f030101);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            bundle.printStackTrace();
            v = true;
            (new cc(this)).a();
        }
        if (!v)
        {
            if (a())
            {
                c = 10;
            }
            b = new o(this);
            a = (ListView)findViewById(0x7f0d03fc);
            e = getIntent().getBooleanExtra("fromPhotoGrid", false);
            bundle = (TextView)findViewById(0x7f0d0021);
            bundle.setText(0x7f070298);
            bundle.setOnClickListener(new qb(this));
            bundle = new qh(this, (byte)0);
            a.setAdapter(bundle);
            a.setOnItemClickListener(new qc(this, bundle));
        }
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        if (i1 == 4)
        {
            if (e)
            {
                d();
            } else
            {
                b();
            }
            return true;
        } else
        {
            return super.onKeyDown(i1, keyevent);
        }
    }

    protected void onPause()
    {
        super.onPause();
        bq.d();
    }

    public final void x()
    {
    }
}

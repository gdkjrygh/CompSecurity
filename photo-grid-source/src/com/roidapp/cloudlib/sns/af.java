// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import com.facebook.AccessToken;
import com.roidapp.baselib.c.aj;
import com.roidapp.baselib.c.n;
import com.roidapp.cloudlib.al;
import com.roidapp.cloudlib.aq;
import com.roidapp.cloudlib.ar;
import com.roidapp.cloudlib.as;
import com.roidapp.cloudlib.facebook.FbLoginActivity;
import com.roidapp.cloudlib.google.GoogleAuthActivity;
import com.roidapp.cloudlib.instagram.InstagramAuthActivity;
import com.roidapp.cloudlib.sns.b.p;
import com.roidapp.cloudlib.sns.b.q;
import com.roidapp.cloudlib.sns.f.a;
import java.lang.reflect.Field;
import org.json.JSONObject;

// Referenced classes of package com.roidapp.cloudlib.sns:
//            ah, ai, l, ag, 
//            o, q, aj, w

public final class af
{

    private static boolean a;
    private static final String b = "http://api.adr.pt.ksmobile.com/user/changeIp";
    private static long c = 0L;

    private static void a(int i)
    {
        PreferenceManager.getDefaultSharedPreferences(aj.a()).edit().putInt("snsLoginType", i).apply();
    }

    public static void a(Activity activity, com.roidapp.cloudlib.sns.aj aj1, String s)
    {
        long l1 = System.currentTimeMillis();
        if (l1 - c < 500L)
        {
            return;
        }
        c = l1;
        AlertDialog alertdialog = (new android.app.AlertDialog.Builder(activity)).create();
        alertdialog.setCanceledOnTouchOutside(true);
        alertdialog.setOnDismissListener(new ah());
        alertdialog.show();
        com.roidapp.cloudlib.sns.f.a.a().a(s, 2);
        try
        {
            alertdialog.getWindow().setContentView(as.S);
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            activity.getStackTrace();
            alertdialog.dismiss();
            return;
        }
        activity = new ai(activity, s, aj1, alertdialog);
        aj1 = (ImageView)alertdialog.findViewById(ar.A);
        n.a(aj1, aq.C);
        aj1.setOnClickListener(activity);
        aj1 = (ImageView)alertdialog.findViewById(ar.y);
        n.a(aj1, aq.A);
        aj1.setOnClickListener(activity);
        aj1 = (ImageView)alertdialog.findViewById(ar.z);
        if (al.g().e(aj.a()))
        {
            n.a(aj1, aq.B);
            aj1.setOnClickListener(activity);
            return;
        } else
        {
            aj1.setVisibility(8);
            return;
        }
    }

    public static void a(Object obj)
    {
        if (a)
        {
            return;
        } else
        {
            a = true;
            (new l(b, new ag())).a(false).a(obj);
            return;
        }
    }

    public static void a(boolean flag)
    {
        PreferenceManager.getDefaultSharedPreferences(aj.a()).edit().putBoolean("whether_usa_area", flag).apply();
    }

    public static boolean a()
    {
        return PreferenceManager.getDefaultSharedPreferences(aj.a()).getBoolean("whether_usa_area", false);
    }

    public static boolean a(Activity activity, w w)
    {
        Object obj;
        int i;
        i = b();
        obj = null;
        i;
        JVM INSTR tableswitch 1 3: default 36
    //                   1 57
    //                   2 73
    //                   3 81;
           goto _L1 _L2 _L3 _L4
_L1:
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            com.roidapp.cloudlib.sns.q.a(activity, ((String) (obj)), i, w).a(activity);
        }
        return false;
_L2:
        AccessToken accesstoken = com.roidapp.cloudlib.facebook.al.b();
        if (accesstoken != null)
        {
            obj = accesstoken.getToken();
        }
        continue; /* Loop/switch isn't completed */
_L3:
        obj = com.roidapp.cloudlib.common.a.d(activity);
        continue; /* Loop/switch isn't completed */
_L4:
        obj = com.roidapp.cloudlib.common.a.v(activity);
        if (true) goto _L1; else goto _L5
_L5:
    }

    public static boolean a(Activity activity, String s, int i)
    {
        if (activity != null && !activity.isFinishing()) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (i == ar.y)
        {
            a(1);
            Intent intent = new Intent(activity, com/roidapp/cloudlib/facebook/FbLoginActivity);
            intent.putExtra("page_name", s);
            activity.startActivityForResult(intent, 13273);
        } else
        {
            if (i != ar.A)
            {
                continue; /* Loop/switch isn't completed */
            }
            a(2);
            Intent intent1 = new Intent(activity, com/roidapp/cloudlib/instagram/InstagramAuthActivity);
            intent1.putExtra("page_name", s);
            activity.startActivityForResult(intent1, 13273);
        }
_L4:
        return true;
        if (i != ar.z) goto _L1; else goto _L3
_L3:
        a(3);
        Intent intent2 = new Intent(activity, com/roidapp/cloudlib/google/GoogleAuthActivity);
        intent2.putExtra("page_name", s);
        activity.startActivityForResult(intent2, 13273);
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }

    public static boolean a(Context context)
    {
        return q.a(context).c() != null && q.a(context).c().b != null && !q.a(context).b();
    }

    public static boolean a(EditText edittext)
    {
        if (edittext != null && edittext.getVisibility() == 0)
        {
            return ((InputMethodManager)edittext.getContext().getSystemService("input_method")).hideSoftInputFromWindow(edittext.getWindowToken(), 2);
        } else
        {
            return false;
        }
    }

    public static boolean a(JSONObject jsonobject)
    {
        return jsonobject.optInt("code", 1) == 0;
    }

    public static int b()
    {
        return PreferenceManager.getDefaultSharedPreferences(aj.a()).getInt("snsLoginType", 1);
    }

    public static void b(Context context)
    {
        q.a(context).a();
        b();
        JVM INSTR tableswitch 1 3: default 36
    //                   1 60
    //                   2 67
    //                   3 74;
           goto _L1 _L2 _L3 _L4
_L1:
        PreferenceManager.getDefaultSharedPreferences(aj.a()).edit().remove("snsLoginType").apply();
        return;
_L2:
        com.roidapp.cloudlib.facebook.al.a(context);
        continue; /* Loop/switch isn't completed */
_L3:
        com.roidapp.cloudlib.common.a.a(context);
        continue; /* Loop/switch isn't completed */
_L4:
        com.roidapp.cloudlib.common.a.u(context);
        if (true) goto _L1; else goto _L5
_L5:
    }

    public static void c(Context context)
    {
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        context = (InputMethodManager)context.getSystemService("input_method");
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        Object obj;
        try
        {
            obj = android/view/inputmethod/InputMethodManager.getDeclaredField("mServedView");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        ((Field) (obj)).setAccessible(true);
        obj = ((Field) (obj)).get(context);
        if (obj instanceof View)
        {
            context.hideSoftInputFromWindow(((View)obj).getWindowToken(), 2);
        }
    }

}

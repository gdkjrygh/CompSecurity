// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.e;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Environment;
import android.preference.PreferenceManager;
import android.text.Layout;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import android.widget.EditText;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.f;
import com.google.android.libraries.translate.languages.Language;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

// Referenced classes of package com.google.android.libraries.translate.e:
//            m, f

public final class o
{

    public static final int a;
    public static final boolean b;
    public static final boolean c;
    public static final boolean d;
    public static final boolean e;
    public static final boolean f;
    public static final boolean g;
    private static String h = null;
    private static Boolean i = null;

    public static void a(Activity activity, Uri uri)
    {
        uri = (new Intent("android.intent.action.VIEW")).addCategory("android.intent.category.DEFAULT").addCategory("android.intent.category.BROWSABLE").setDataAndType(uri, "text/html");
        List list = activity.getPackageManager().queryIntentActivityOptions(activity.getComponentName(), new Intent[] {
            (new Intent()).setClassName("com.android.browser", "com.android.browser.BrowserActivity")
        }, uri, 0x10000);
        if (list.size() > 0)
        {
            uri.setClassName(((ResolveInfo)list.get(0)).activityInfo.packageName, ((ResolveInfo)list.get(0)).activityInfo.name);
        }
        try
        {
            activity.startActivity(uri);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            m.a(f.msg_translation_error, 1);
        }
    }

    public static void a(Context context, String s)
    {
        context = (ClipboardManager)context.getSystemService("clipboard");
        try
        {
            context.setPrimaryClip(ClipData.newPlainText(s, s));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
    }

    public static void a(View view)
    {
        view.performHapticFeedback(0, 3);
    }

    public static void a(EditText edittext)
    {
        int j = edittext.getSelectionStart();
        int k = edittext.getSelectionEnd();
        edittext.setInputType(0);
        edittext.setRawInputType(1);
        edittext.setTextIsSelectable(true);
        edittext.setInputType(0x20001);
        edittext.setSingleLine(false);
        edittext.setSelection(j, k);
    }

    public static void a(EditText edittext, Language language)
    {
        String s = "";
        Object obj = e(edittext.getContext());
        if (obj != null)
        {
            s = ((InputMethodSubtype) (obj)).getLocale();
        }
        obj = s;
        if (TextUtils.isEmpty(s))
        {
            obj = Locale.getDefault().getLanguage();
        }
        s = com.google.android.libraries.translate.e.f.b(((String) (obj)));
        language = language.getShortName().split("[\\-|\\_]")[0];
        int j = edittext.getInputType();
        if (!TextUtils.isEmpty(s) && s.split("\\-|\\_")[0].equals(language))
        {
            j = 0xfffeffff & j & 0xfff7ffff;
        } else
        {
            j = 0x10000 | j | 0x80000;
        }
        edittext.setInputType(j);
    }

    public static boolean a()
    {
        return (Singleton.a().getResources().getConfiguration().screenLayout & 0xf) >= 3;
    }

    public static boolean a(Context context)
    {
        return context.getPackageManager().hasSystemFeature("android.hardware.telephony");
    }

    private static boolean a(Intent intent, PackageManager packagemanager)
    {
        intent = packagemanager.resolveActivity(intent, 0x10000);
        return intent != null && ((ResolveInfo) (intent)).activityInfo != null && ((ResolveInfo) (intent)).activityInfo.exported;
    }

    public static String b()
    {
        com/google/android/libraries/translate/e/o;
        JVM INSTR monitorenter ;
        if (h == null) goto _L2; else goto _L1
_L1:
        String s = h;
_L4:
        com/google/android/libraries/translate/e/o;
        JVM INSTR monitorexit ;
        return s;
_L2:
        s = PreferenceManager.getDefaultSharedPreferences(Singleton.a()).getString("installation_id", "");
        h = s;
        if (TextUtils.isEmpty(s))
        {
            s = UUID.randomUUID().toString();
            SharedPreferences sharedpreferences = PreferenceManager.getDefaultSharedPreferences(Singleton.a());
            h = s;
            sharedpreferences.edit().putString("installation_id", h).commit();
        }
        s = h;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public static void b(EditText edittext)
    {
        int j = edittext.getSelectionStart();
        int k = edittext.getSelectionEnd();
        edittext.setInputType(0);
        edittext.setSingleLine(false);
        edittext.setSelection(j, k);
    }

    public static boolean b(Context context)
    {
        return ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo() != null;
    }

    public static boolean c()
    {
        return TextUtils.equals(Environment.getExternalStorageState(), "mounted");
    }

    public static boolean c(Context context)
    {
        context = ((ConnectivityManager)context.getSystemService("connectivity")).getNetworkInfo(1);
        return context != null && context.isConnected();
    }

    public static CharSequence d(Context context)
    {
        boolean flag = false;
        if (b)
        {
            ClipData clipdata = ((ClipboardManager)context.getSystemService("clipboard")).getPrimaryClip();
            StringBuilder stringbuilder = new StringBuilder();
            if (clipdata != null)
            {
                for (int j = 0; j < clipdata.getItemCount();)
                {
                    CharSequence charsequence = clipdata.getItemAt(j).coerceToStyledText(context);
                    boolean flag1 = flag;
                    if (charsequence != null)
                    {
                        if (flag)
                        {
                            stringbuilder.append('\n');
                        }
                        stringbuilder.append(charsequence);
                        flag1 = true;
                    }
                    j++;
                    flag = flag1;
                }

            }
            return stringbuilder;
        } else
        {
            return ((android.text.ClipboardManager)context.getSystemService("clipboard")).getText();
        }
    }

    public static boolean d()
    {
        return c && TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
    }

    public static InputMethodSubtype e(Context context)
    {
        return ((InputMethodManager)context.getSystemService("input_method")).getCurrentInputMethodSubtype();
    }

    public static boolean e()
    {
        if (i == null)
        {
            Method amethod[] = android/text/Layout.getMethods();
            int k = amethod.length;
            for (int j = 0; j < k; j++)
            {
                if ("getAdjustCursorPosition".equals(amethod[j].getName()))
                {
                    i = Boolean.valueOf(true);
                    return true;
                }
            }

            i = Boolean.valueOf(false);
        }
        return i.booleanValue();
    }

    public static Intent f(Context context)
    {
        PackageManager packagemanager = context.getPackageManager();
        context = new Intent("com.google.android.speech.embedded.MANAGE_LANGUAGES");
        if (!a(context, packagemanager))
        {
            Intent intent = (new Intent()).setComponent(new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.voicesearch.greco3.languagepack.InstallActivity"));
            context = intent;
            if (!a(intent, packagemanager))
            {
                return null;
            }
        }
        return context;
    }

    static 
    {
        boolean flag1 = true;
        a = android.os.Build.VERSION.SDK_INT;
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = flag;
        if (android.os.Build.VERSION.SDK_INT >= 18)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = flag;
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        e = flag;
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f = flag;
        if (android.os.Build.VERSION.SDK_INT >= 23)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        g = flag;
    }
}

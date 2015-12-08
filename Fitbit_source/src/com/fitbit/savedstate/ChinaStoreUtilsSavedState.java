// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.savedstate;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Environment;
import android.preference.PreferenceManager;
import com.fitbit.FitBitApplication;
import com.fitbit.config.BuildType;
import com.fitbit.config.b;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

// Referenced classes of package com.fitbit.savedstate:
//            a

public class ChinaStoreUtilsSavedState extends a
{
    public static final class ConfirmationScope extends Enum
    {

        public static final ConfirmationScope a;
        public static final ConfirmationScope b;
        public static final ConfirmationScope c;
        public static final ConfirmationScope d;
        private static final ConfirmationScope e[];
        private final int code;

        public static ConfirmationScope a(int l)
        {
            ConfirmationScope aconfirmationscope[] = values();
            int j1 = aconfirmationscope.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                ConfirmationScope confirmationscope = aconfirmationscope[i1];
                if (confirmationscope.a() == l)
                {
                    return confirmationscope;
                }
            }

            throw new IllegalArgumentException();
        }

        static String a(ConfirmationScope confirmationscope)
        {
            return confirmationscope.b();
        }

        private String b()
        {
            return (new StringBuilder()).append("ChinaStoreUtilsSavedState.").append(toString()).toString();
        }

        public static ConfirmationScope valueOf(String s)
        {
            return (ConfirmationScope)Enum.valueOf(com/fitbit/savedstate/ChinaStoreUtilsSavedState$ConfirmationScope, s);
        }

        public static ConfirmationScope[] values()
        {
            return (ConfirmationScope[])e.clone();
        }

        public int a()
        {
            return code;
        }

        static 
        {
            a = new ConfirmationScope("BLUETOOTH", 0, 0);
            b = new ConfirmationScope("NETWORK", 1, 1);
            c = new ConfirmationScope("CONTACTS", 2, 2);
            d = new ConfirmationScope("SENSITIVE_DATA", 3, 3);
            e = (new ConfirmationScope[] {
                a, b, c, d
            });
        }

        private ConfirmationScope(String s, int l, int i1)
        {
            super(s, l);
            code = i1;
        }
    }


    private static final ChinaStoreUtilsSavedState b = new ChinaStoreUtilsSavedState();
    private static final String c = "ChinaStoreUtilsSavedState.";
    private static final String d = ".DontShowAgain";
    private static final String e = "FACEBOOK_CHINA";

    ChinaStoreUtilsSavedState()
    {
        super("ChinaStoreUtilsSavedState");
    }

    public static Boolean a(ConfirmationScope confirmationscope)
    {
        SharedPreferences sharedpreferences = b.b();
        Object obj = null;
        String s = ConfirmationScope.a(confirmationscope);
        confirmationscope = obj;
        if (sharedpreferences.contains(s))
        {
            confirmationscope = Boolean.valueOf(sharedpreferences.getBoolean(s, true));
        }
        return confirmationscope;
    }

    public static void a(ConfirmationScope confirmationscope, boolean flag)
    {
        android.content.SharedPreferences.Editor editor = b.b().edit();
        editor.putBoolean(ConfirmationScope.a(confirmationscope), flag);
        editor.apply();
    }

    private static void a(boolean flag)
    {
        com/fitbit/savedstate/ChinaStoreUtilsSavedState;
        JVM INSTR monitorenter ;
        android.content.SharedPreferences.Editor editor = b.b().edit();
        editor.putBoolean("FACEBOOK_CHINA", flag);
        editor.apply();
        com/fitbit/savedstate/ChinaStoreUtilsSavedState;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static void b(ConfirmationScope confirmationscope, boolean flag)
    {
        android.content.SharedPreferences.Editor editor = b.b().edit();
        editor.putBoolean((new StringBuilder()).append(ConfirmationScope.a(confirmationscope)).append(".DontShowAgain").toString(), flag);
        editor.apply();
    }

    public static boolean b(ConfirmationScope confirmationscope)
    {
        return b.b().getBoolean((new StringBuilder()).append(ConfirmationScope.a(confirmationscope)).append(".DontShowAgain").toString(), true);
    }

    protected static a g()
    {
        return b;
    }

    public static boolean h()
    {
        com/fitbit/savedstate/ChinaStoreUtilsSavedState;
        JVM INSTR monitorenter ;
        boolean flag = b.b().getBoolean("FACEBOOK_CHINA", true);
        com/fitbit/savedstate/ChinaStoreUtilsSavedState;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public static Boolean i()
    {
        com/fitbit/savedstate/ChinaStoreUtilsSavedState;
        JVM INSTR monitorenter ;
        Boolean boolean1 = null;
        if (BuildType.e == b.a)
        {
            boolean1 = k();
        }
        com/fitbit/savedstate/ChinaStoreUtilsSavedState;
        JVM INSTR monitorexit ;
        return boolean1;
        Exception exception;
        exception;
        throw exception;
    }

    public static void j()
    {
        com/fitbit/savedstate/ChinaStoreUtilsSavedState;
        JVM INSTR monitorenter ;
        boolean flag;
        if (!h())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(flag);
        com/fitbit/savedstate/ChinaStoreUtilsSavedState;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private static Boolean k()
    {
        Object obj2 = null;
        Object obj = FitBitApplication.a().getExternalFilesDir(null);
        Object obj1;
        int l;
        int i1;
        if (obj != null)
        {
            obj = (new StringBuilder()).append(((File) (obj)).getAbsolutePath()).append("/").toString();
        } else
        {
            obj = null;
        }
        obj1 = obj;
        if (obj == null)
        {
            obj1 = (new StringBuilder()).append(Environment.getExternalStorageDirectory().getAbsolutePath()).append("/").toString();
        }
        obj = new File((new StringBuilder()).append(((String) (obj1))).append("UseChinaPlayStorePrefs.txt").toString());
        if (!((File) (obj)).exists() || !((File) (obj)).isFile()) goto _L2; else goto _L1
_L1:
        obj1 = new BufferedReader(new FileReader(((File) (obj))));
        obj = obj1;
        i1 = Integer.parseInt(((BufferedReader) (obj1)).readLine());
        l = i1;
        if (obj1 != null)
        {
            try
            {
                ((BufferedReader) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((IOException) (obj)).printStackTrace();
                l = i1;
                continue; /* Loop/switch isn't completed */
            }
            l = i1;
        }
        break MISSING_BLOCK_LABEL_150;
        obj2;
        obj1 = null;
_L5:
        obj = obj1;
        ((Exception) (obj2)).printStackTrace();
        if (obj1 != null)
        {
            try
            {
                ((BufferedReader) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((IOException) (obj)).printStackTrace();
                l = -1;
                continue; /* Loop/switch isn't completed */
            }
            l = -1;
            continue; /* Loop/switch isn't completed */
        }
        break; /* Loop/switch isn't completed */
        obj;
        obj1 = obj2;
_L4:
        if (obj1 != null)
        {
            try
            {
                ((BufferedReader) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                ((IOException) (obj1)).printStackTrace();
            }
        }
        throw obj;
_L7:
        if (l == 0)
        {
            return Boolean.valueOf(false);
        }
        if (1 == l)
        {
            return Boolean.valueOf(true);
        } else
        {
            return null;
        }
        obj2;
        obj1 = obj;
        obj = obj2;
        if (true) goto _L4; else goto _L3
_L3:
        obj2;
        if (true) goto _L5; else goto _L2
_L2:
        l = -1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public volatile int a()
    {
        return super.a();
    }

    public volatile SharedPreferences a(Context context)
    {
        return super.a(context);
    }

    public volatile void a(Context context, int l, int i1, android.content.SharedPreferences.Editor editor)
    {
        super.a(context, l, i1, editor);
    }

    public volatile SharedPreferences b()
    {
        return super.b();
    }

    public void b(Context context, int l, int i1, android.content.SharedPreferences.Editor editor)
    {
        context = PreferenceManager.getDefaultSharedPreferences(context);
        android.content.SharedPreferences.Editor editor1 = context.edit();
        ConfirmationScope aconfirmationscope[] = ConfirmationScope.values();
        i1 = aconfirmationscope.length;
        for (l = 0; l < i1; l++)
        {
            Object obj = aconfirmationscope[l];
            String s = (new StringBuilder()).append("SavedState.ChinaConfirmationSavedActionsState.").append(((ConfirmationScope) (obj)).toString()).toString();
            String s1 = (new StringBuilder()).append(s).append(".DontShowAgain").toString();
            String s2 = ConfirmationScope.a(((ConfirmationScope) (obj)));
            obj = (new StringBuilder()).append(ConfirmationScope.a(((ConfirmationScope) (obj)))).append(".DontShowAgain").toString();
            if (context.contains(s))
            {
                editor.putBoolean(s2, context.getBoolean(s, false));
                editor1.remove(s);
            }
            if (context.contains(s1))
            {
                editor.putBoolean(((String) (obj)), context.getBoolean(s1, false));
                editor1.remove(s1);
            }
        }

        if (context.contains("SavedState.FacebookChinaState.FACEBOOK_CHINA"))
        {
            editor.putBoolean("FACEBOOK_CHINA", context.getBoolean("SavedState.FacebookChinaState.FACEBOOK_CHINA", false));
            editor1.remove("SavedState.FacebookChinaState.FACEBOOK_CHINA");
        }
        editor1.apply();
    }

    public volatile android.content.SharedPreferences.Editor c()
    {
        return super.c();
    }

    public void d()
    {
    }

    public volatile void e()
    {
        super.e();
    }

    public volatile String f()
    {
        return super.f();
    }

}

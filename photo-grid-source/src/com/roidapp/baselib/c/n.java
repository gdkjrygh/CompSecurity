// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.c;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ConfigurationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.StateListDrawable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import org.json.JSONObject;

// Referenced classes of package com.roidapp.baselib.c:
//            o

public final class n
{

    private static int a = -1;
    private static String b = null;

    public static long a(JSONObject jsonobject, String s)
    {
        long l1 = 0L;
        long l = l1;
        if (jsonobject != null)
        {
            jsonobject = jsonobject.optString(s, null);
            l = l1;
            if (jsonobject != null)
            {
                try
                {
                    l = Long.parseLong(jsonobject);
                }
                // Misplaced declaration of an exception variable
                catch (JSONObject jsonobject)
                {
                    return 0L;
                }
            }
        }
        return l;
    }

    public static Drawable a(int j, int k, int l)
    {
        return a(j, k, l, 0);
    }

    public static Drawable a(int j, int k, int l, int i1)
    {
        Drawable drawable = a(j, l, i1, i1, i1, i1);
        if (k == j)
        {
            return drawable;
        } else
        {
            Drawable drawable1 = a(k, l, i1, i1, i1, i1);
            StateListDrawable statelistdrawable = new StateListDrawable();
            statelistdrawable.addState(new int[] {
                0x10100a7
            }, drawable1);
            statelistdrawable.addState(new int[0], drawable);
            return statelistdrawable;
        }
    }

    private static Drawable a(int j, int k, int l, int i1, int j1, int k1)
    {
        PaintDrawable paintdrawable = new PaintDrawable(j);
        if ((l | i1 | j1 | k1) != 0)
        {
            paintdrawable.setPadding(l, i1, j1, k1);
        }
        paintdrawable.setCornerRadius(k);
        return paintdrawable;
    }

    public static void a(ImageView imageview, int j)
    {
        if (imageview == null)
        {
            return;
        }
        try
        {
            imageview.setImageResource(j);
            return;
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            outofmemoryerror.printStackTrace();
        }
        imageview.setImageResource(0);
        imageview.setImageBitmap(null);
    }

    public static void a(PopupWindow popupwindow)
    {
        if (popupwindow == null || android.os.Build.VERSION.SDK_INT >= 14)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        Field field = android/widget/PopupWindow.getDeclaredField("mAnchor");
        field.setAccessible(true);
        Field field1 = android/widget/PopupWindow.getDeclaredField("mOnScrollChangedListener");
        field1.setAccessible(true);
        field1.set(popupwindow, new o(field, popupwindow, (android.view.ViewTreeObserver.OnScrollChangedListener)field1.get(popupwindow)));
        return;
        popupwindow;
        popupwindow.printStackTrace();
        return;
    }

    public static boolean a()
    {
        return android.os.Build.VERSION.SDK_INT >= 14;
    }

    public static boolean a(Context context)
    {
        int j = context.getResources().getConfiguration().screenLayout & 0xf;
        return j == 4 || j == 3;
    }

    public static boolean a(Context context, String s)
    {
        if (context != null && s != null && !s.isEmpty())
        {
            context = context.getPackageManager();
            int j;
            try
            {
                j = context.getApplicationEnabledSetting(s);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return false;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return false;
            }
            if (j == 0 || j == 1)
            {
                return true;
            }
        }
        return false;
    }

    public static boolean a(FragmentManager fragmentmanager, DialogFragment dialogfragment, String s)
    {
        if (fragmentmanager == null || fragmentmanager.isDestroyed())
        {
            return false;
        }
        FragmentTransaction fragmenttransaction;
        try
        {
            fragmenttransaction = fragmentmanager.beginTransaction();
            fragmentmanager = fragmentmanager.findFragmentByTag(s);
        }
        // Misplaced declaration of an exception variable
        catch (FragmentManager fragmentmanager)
        {
            fragmentmanager.printStackTrace();
            return false;
        }
        if (fragmentmanager == null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        fragmenttransaction.remove(fragmentmanager);
        dialogfragment.show(fragmenttransaction, s);
        return true;
    }

    public static boolean a(TextView textview, int j, int k, int l)
    {
        if (textview == null)
        {
            return false;
        }
        try
        {
            textview.setCompoundDrawablesWithIntrinsicBounds(j, k, l, 0);
        }
        // Misplaced declaration of an exception variable
        catch (TextView textview)
        {
            return false;
        }
        return true;
    }

    public static boolean a(Iterable iterable, String s)
    {
        if (s == null || iterable == null)
        {
            return false;
        }
        for (iterable = iterable.iterator(); iterable.hasNext();)
        {
            if (s.startsWith((String)iterable.next()))
            {
                return true;
            }
        }

        return false;
    }

    public static boolean a(String s)
    {
        Object obj2;
        int j;
        boolean flag;
        boolean flag1;
        obj2 = null;
        j = 2;
        flag1 = true;
        flag = true;
        Object obj = new FileReader("/proc/cpuinfo");
        Object obj1 = new BufferedReader(((java.io.Reader) (obj)), 8192);
_L4:
        obj2 = ((BufferedReader) (obj1)).readLine();
        if (obj2 == null) goto _L2; else goto _L1
_L1:
        obj2 = ((String) (obj2)).trim();
        if (!((String) (obj2)).startsWith("Features")) goto _L4; else goto _L3
_L3:
        obj2 = ((String) (obj2)).split("\\s+");
        if (obj2.length < 2) goto _L4; else goto _L5
_L5:
        if (j >= obj2.length)
        {
            break MISSING_BLOCK_LABEL_269;
        }
        if (obj2[j] == null) goto _L7; else goto _L6
_L6:
        boolean flag2 = obj2[j].trim().equalsIgnoreCase(s);
        if (!flag2) goto _L7; else goto _L8
_L8:
        try
        {
            ((BufferedReader) (obj1)).close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
        try
        {
            ((FileReader) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return flag;
        }
_L10:
        return flag;
_L7:
        j++;
          goto _L5
_L2:
        try
        {
            ((BufferedReader) (obj1)).close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
        try
        {
            ((FileReader) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return true;
        }
        return true;
        s;
        s = null;
        obj = obj2;
_L13:
        if (obj != null)
        {
            try
            {
                ((BufferedReader) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((IOException) (obj)).printStackTrace();
            }
        }
        flag = flag1;
        if (s == null) goto _L10; else goto _L9
_L9:
        try
        {
            s.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return true;
        }
        return true;
        s;
        obj1 = null;
        obj = null;
_L12:
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
        if (obj != null)
        {
            try
            {
                ((FileReader) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((IOException) (obj)).printStackTrace();
            }
        }
        throw s;
        s;
        obj1 = null;
        continue; /* Loop/switch isn't completed */
        s;
        if (true) goto _L12; else goto _L11
_L11:
        s;
        s = ((String) (obj));
        obj = obj2;
          goto _L13
        s;
        s = ((String) (obj));
        obj = obj1;
          goto _L13
        flag = false;
          goto _L8
    }

    public static boolean a(String s, String s1)
    {
        for (s = Pattern.compile("#\\w+").matcher(s); s.find();)
        {
            if (s.group().equalsIgnoreCase(s1))
            {
                return true;
            }
        }

        return false;
    }

    public static int[] a(int ai[])
    {
        int k = ai.length;
        int ai1[] = new int[k];
        Random random = new Random();
        for (int j = 0; j < k; j++)
        {
            int l = random.nextInt(k - j);
            ai1[j] = ai[l];
            ai[l] = ai[k - 1 - j];
        }

        return ai1;
    }

    public static String[] a(String s, String as[])
    {
        Pattern pattern = Pattern.compile("#\\w+");
        LinkedHashSet linkedhashset = new LinkedHashSet();
        if (as != null)
        {
            for (int j = 0; j < as.length; j++)
            {
                String as1[] = as[j].split("#");
                if (as1.length == 2)
                {
                    linkedhashset.add(as1[1]);
                }
            }

        }
        s = pattern.matcher(s);
        do
        {
            if (!s.find())
            {
                break;
            }
            as = s.group().split("#");
            if (as.length == 2)
            {
                linkedhashset.add(as[1]);
            }
        } while (true);
        return (String[])linkedhashset.toArray(new String[linkedhashset.size()]);
    }

    public static long b(String s)
    {
        if (s == null)
        {
            return 0L;
        } else
        {
            CRC32 crc32 = new CRC32();
            crc32.update(s.getBytes());
            return crc32.getValue();
        }
    }

    public static boolean b()
    {
        return android.os.Build.VERSION.SDK_INT >= 8;
    }

    public static boolean b(Context context)
    {
        return ((ActivityManager)context.getSystemService("activity")).getDeviceConfigurationInfo().reqGlEsVersion >= 0x20000;
    }

    public static int c(Context context)
    {
        if (a == -1)
        {
            try
            {
                context = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                a = ((PackageInfo) (context)).versionCode;
                b = ((PackageInfo) (context)).versionName;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return -1;
            }
        }
        return a;
    }

    public static boolean c()
    {
        return android.os.Build.VERSION.SDK_INT >= 9;
    }

    public static boolean c(String s)
    {
        boolean flag = false;
        s = Pattern.compile("#\\w+").matcher(s);
        int j;
        for (j = 0; s.find(); j++) { }
        if (j > 30)
        {
            flag = true;
        }
        return flag;
    }

    public static String d(Context context)
    {
        if (b == null)
        {
            try
            {
                context = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                a = ((PackageInfo) (context)).versionCode;
                b = ((PackageInfo) (context)).versionName;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return null;
            }
        }
        return b;
    }

    public static boolean d()
    {
        return android.os.Build.VERSION.SDK_INT >= 11;
    }

    public static boolean e()
    {
        return android.os.Build.VERSION.SDK_INT >= 12;
    }

    public static boolean f()
    {
        return android.os.Build.VERSION.SDK_INT >= 13;
    }

    public static boolean g()
    {
        return android.os.Build.VERSION.SDK_INT >= 16;
    }

    public static boolean h()
    {
        return android.os.Build.VERSION.SDK_INT >= 19;
    }

    public static int i()
    {
        return Calendar.getInstance().get(5);
    }

}

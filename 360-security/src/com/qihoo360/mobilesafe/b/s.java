// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.b;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import com.qihoo.security.SecurityApplication;
import com.qihoo360.common.utils.ByteConvertor;
import com.qihoo360.common.utils.SecurityUtil;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

public class s
{

    public static NumberFormat a;

    public static int a(long l, long l1)
    {
        if (l > 0L && l1 > 0L)
        {
            return (int)((100L * l1) / l);
        } else
        {
            return 0;
        }
    }

    private static long a(InputStream inputstream)
    {
        Object obj;
        Object obj2;
        obj = null;
        obj2 = null;
        Object obj1 = new DataInputStream(inputstream);
        long l = Long.parseLong(((DataInputStream) (obj1)).readLine());
        if (obj1 != null)
        {
            try
            {
                ((DataInputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream)
            {
                Log.e("Utils", "", inputstream);
                return l;
            }
        }
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        inputstream.close();
        return l;
        obj;
        obj1 = obj2;
        obj2 = obj;
_L4:
        obj = obj1;
        Log.e("Utils", "", ((Throwable) (obj2)));
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        ((DataInputStream) (obj1)).close();
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream)
            {
                Log.e("Utils", "", inputstream);
            }
        }
        return 0L;
        Exception exception;
        exception;
        obj1 = obj;
        obj = exception;
_L2:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        ((DataInputStream) (obj1)).close();
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream)
            {
                Log.e("Utils", "", inputstream);
            }
        }
        throw obj;
        obj;
        if (true) goto _L2; else goto _L1
_L1:
        exception;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static Intent a(Activity activity)
    {
        if (activity != null)
        {
            return activity.getIntent();
        } else
        {
            return null;
        }
    }

    public static View a(Activity activity, int i)
    {
        if (activity != null)
        {
            return activity.findViewById(i);
        } else
        {
            return null;
        }
    }

    public static InputStream a(InputStream inputstream, String s1)
    {
        try
        {
            SecureRandom securerandom = new SecureRandom();
            s1 = new DESKeySpec(b(s1.getBytes()));
            s1 = SecretKeyFactory.getInstance("DES").generateSecret(s1);
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(2, s1, securerandom);
            inputstream = new CipherInputStream(inputstream, cipher);
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            return null;
        }
        return inputstream;
    }

    public static String a()
    {
        if (Environment.getExternalStorageState().equals("mounted"))
        {
            return Environment.getExternalStorageDirectory().toString();
        } else
        {
            return null;
        }
    }

    public static String a(float f1)
    {
        float f2 = f1;
        if (f1 < 0.0F)
        {
            f2 = 0.0F;
        }
        Object obj = NumberFormat.getInstance();
        if (f2 == 0.0F)
        {
            return "0MB";
        }
        if (f2 < 1000F)
        {
            ((NumberFormat) (obj)).setMaximumFractionDigits(1);
            obj = ((NumberFormat) (obj)).format(f2);
            return (new StringBuilder()).append(((String) (obj))).append("B").toString();
        }
        if (f2 <= 1024F)
        {
            f1 = f2 / 1024F;
            ((NumberFormat) (obj)).setMaximumFractionDigits(1);
            return (new StringBuilder()).append(((NumberFormat) (obj)).format(f1)).append("KB").toString();
        }
        if (f2 <= 1048576F)
        {
            f1 = f2 / 1024F;
            if (f1 >= 1000F)
            {
                f1 /= 1024F;
                ((NumberFormat) (obj)).setMaximumFractionDigits(1);
                return (new StringBuilder()).append(((NumberFormat) (obj)).format(f1)).append("MB").toString();
            }
            if (f1 > 10F)
            {
                ((NumberFormat) (obj)).setMaximumFractionDigits(0);
            } else
            {
                ((NumberFormat) (obj)).setMaximumFractionDigits(1);
            }
            return (new StringBuilder()).append(((NumberFormat) (obj)).format(f1)).append("KB").toString();
        }
        if (f2 <= 1.073742E+09F)
        {
            f1 = f2 / 1024F / 1024F;
            if (f1 >= 1000F)
            {
                f1 /= 1024F;
                ((NumberFormat) (obj)).setMaximumFractionDigits(1);
                return (new StringBuilder()).append(((NumberFormat) (obj)).format(f1)).append("GB").toString();
            }
            if (f1 > 10F)
            {
                ((NumberFormat) (obj)).setMaximumFractionDigits(0);
            } else
            {
                ((NumberFormat) (obj)).setMaximumFractionDigits(1);
            }
            return (new StringBuilder()).append(((NumberFormat) (obj)).format(f1)).append("MB").toString();
        }
        f1 = f2 / 1024F / 1024F / 1024F;
        if (f1 >= 1000F)
        {
            f1 /= 1024F;
            ((NumberFormat) (obj)).setMaximumFractionDigits(1);
            return (new StringBuilder()).append(((NumberFormat) (obj)).format(f1)).append("TB").toString();
        }
        if (f1 > 10F)
        {
            ((NumberFormat) (obj)).setMaximumFractionDigits(0);
        } else
        {
            ((NumberFormat) (obj)).setMaximumFractionDigits(1);
        }
        return (new StringBuilder()).append(((NumberFormat) (obj)).format(f1)).append("GB").toString();
    }

    public static String a(String s1)
    {
        return SecurityUtil.getMD5(s1);
    }

    public static String a(String s1, String s2)
    {
        return SecurityUtil.DES_decrypt(s1, s2);
    }

    public static String a(byte abyte0[])
    {
        return ByteConvertor.bytesToHexString(abyte0);
    }

    public static ArrayList a(Context context)
    {
        ArrayList arraylist;
        boolean flag;
        flag = false;
        arraylist = new ArrayList();
        if (android.os.Build.VERSION.SDK_INT < 14) goto _L2; else goto _L1
_L1:
        context = ((Context) (c(context, "storage")));
        if (context == null) goto _L4; else goto _L3
_L3:
        Object obj;
        Method method;
        method = context.getClass().getMethod("getVolumeList", (Class[])null);
        obj = context.getClass().getMethod("getVolumeState", new Class[] {
            java/lang/String
        });
        if (method == null) goto _L4; else goto _L5
_L5:
        Object aobj[] = (Object[])(Object[])method.invoke(context, (Object[])null);
        if (aobj == null) goto _L4; else goto _L6
_L6:
        if (aobj.length <= 0) goto _L4; else goto _L7
_L7:
        Object obj1 = aobj[0];
        Method method1;
        int j;
        method1 = obj1.getClass().getMethod("isEmulated", (Class[])null);
        obj1 = obj1.getClass().getMethod("getPath", (Class[])null);
        j = aobj.length;
        int i = 0;
_L17:
        if (i >= j) goto _L9; else goto _L8
_L8:
        Object obj2 = aobj[i];
        if (((Boolean)method1.invoke(obj2, (Object[])null)).booleanValue())
        {
            obj2 = (String)((Method) (obj1)).invoke(obj2, (Object[])null);
            if ("mounted".equals(((Method) (obj)).invoke(context, new Object[] {
    obj2
})))
            {
                arraylist.add(obj2);
            }
        }
          goto _L10
_L9:
        j = aobj.length;
        i = ((flag) ? 1 : 0);
_L11:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        obj2 = aobj[i];
        if (!((Boolean)method1.invoke(obj2, (Object[])null)).booleanValue())
        {
            obj2 = (String)((Method) (obj1)).invoke(obj2, (Object[])null);
            if ("mounted".equals(((Method) (obj)).invoke(context, new Object[] {
    obj2
})))
            {
                arraylist.add(obj2);
            }
        }
        i++;
        if (true) goto _L11; else goto _L4
        context;
        context.printStackTrace();
_L4:
        if (arraylist.size() < 1)
        {
            context = a();
            if (!TextUtils.isEmpty(context))
            {
                arraylist.add(context);
            }
        }
        return arraylist;
        context;
        context.printStackTrace();
        if (true) goto _L4; else goto _L2
_L2:
        context = a();
        if (!TextUtils.isEmpty(context))
        {
            arraylist.add(context);
        }
        context = new BufferedReader(new InputStreamReader(new FileInputStream(new File("/proc/mounts"))));
_L13:
        obj = context.readLine();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_478;
        }
        if (!((String) (obj)).contains("uid=1000") || !((String) (obj)).contains("gid=1015") || ((String) (obj)).contains("asec")) goto _L13; else goto _L12
_L12:
        String as[] = ((String) (obj)).split(" ");
        if (as.length < 4) goto _L13; else goto _L14
_L14:
        as = as[1];
        if (arraylist.contains(as)) goto _L13; else goto _L15
_L15:
        arraylist.add(as);
          goto _L13
        context;
        return arraylist;
        try
        {
            context.close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return arraylist;
        }
        return arraylist;
_L10:
        i++;
        if (true) goto _L17; else goto _L16
_L16:
    }

    public static void a(Dialog dialog)
    {
        if (dialog != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Context context;
        try
        {
            context = dialog.getContext();
        }
        // Misplaced declaration of an exception variable
        catch (Dialog dialog)
        {
            return;
        }
        if (context == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if ((context instanceof Activity) && ((Activity)context).isFinishing()) goto _L1; else goto _L3
_L3:
        if (dialog == null) goto _L1; else goto _L4
_L4:
        if (!dialog.isShowing()) goto _L1; else goto _L5
_L5:
        dialog.dismiss();
        return;
    }

    public static void a(Context context, int i, int j)
    {
        Toast.makeText(context, i, j).show();
    }

    public static void a(Context context, Class class1, String s1, ServiceConnection serviceconnection, int i)
    {
        try
        {
            context = context.getApplicationContext();
            context.bindService((new Intent(context, class1)).setAction(s1), serviceconnection, i);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
    }

    public static void a(Context context, String s1, File file)
        throws IOException
    {
        a(context.getAssets().open(s1), file);
    }

    public static void a(Cursor cursor)
    {
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_19;
        }
        if (!cursor.isClosed())
        {
            cursor.close();
        }
        return;
        cursor;
    }

    public static void a(InputStream inputstream, File file)
        throws IOException
    {
        Object obj = new FileOutputStream(file);
        file = new byte[1024];
_L3:
        int i = inputstream.read(file);
        if (i == -1) goto _L2; else goto _L1
_L1:
        ((FileOutputStream) (obj)).write(file, 0, i);
          goto _L3
        file;
_L5:
        if (obj != null)
        {
            try
            {
                ((FileOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream) { }
        }
        throw file;
_L2:
        ((FileOutputStream) (obj)).flush();
        if (obj != null)
        {
            try
            {
                ((FileOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (File file) { }
        }
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        inputstream.close();
        return;
        inputstream;
        return;
        file;
        obj = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static void a(String s1, Context context, ServiceConnection serviceconnection)
    {
        try
        {
            context.getApplicationContext().unbindService(serviceconnection);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return;
        }
    }

    public static boolean a(int i, int j)
    {
        if (j < i)
        {
            return false;
        }
        GregorianCalendar gregoriancalendar = new GregorianCalendar(Locale.getDefault());
        GregorianCalendar gregoriancalendar1 = new GregorianCalendar(gregoriancalendar.get(1), gregoriancalendar.get(2), gregoriancalendar.get(5), i, 0, 0);
        GregorianCalendar gregoriancalendar2 = new GregorianCalendar(gregoriancalendar.get(1), gregoriancalendar.get(2), gregoriancalendar.get(5), j, 0, 0);
        return gregoriancalendar.compareTo(gregoriancalendar1) >= 0 && gregoriancalendar.compareTo(gregoriancalendar2) <= 0;
    }

    public static boolean a(Context context, String s1)
    {
        boolean flag = false;
        try
        {
            context = context.getPackageManager().getPackageInfo(s1, 0);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context = null;
        }
        if (context != null)
        {
            flag = true;
        }
        return flag;
    }

    private static String[] a(int i)
    {
        Object obj = SecurityApplication.a();
        NumberFormat numberformat = NumberFormat.getInstance();
        float f1;
        if (i <= 1)
        {
            obj = ((Context) (obj)).getString(0x7f0c0038);
            f1 = i;
            i = 0;
        } else
        if (i < 60)
        {
            obj = ((Context) (obj)).getString(0x7f0c0039);
            f1 = i;
            i = 0;
        } else
        if (i < 66)
        {
            obj = ((Context) (obj)).getString(0x7f0c003a);
            int j = i / 60;
            f1 = (float)(i % 60) / 60F;
            i = j;
        } else
        {
            obj = ((Context) (obj)).getString(0x7f0c003b);
            int k = i / 60;
            f1 = (float)(i % 60) / 60F;
            i = k;
        }
        if (f1 > 0.0F)
        {
            numberformat.setMaximumFractionDigits(1);
        } else
        {
            numberformat.setMaximumFractionDigits(0);
        }
        return (new String[] {
            numberformat.format((float)i + f1), obj
        });
    }

    public static String[] a(int i, long l, long l1)
    {
        return a(b(i, l, l1));
    }

    public static int b()
    {
        long l = c();
        long l1 = d();
        if (l > 0L && l1 > 0L)
        {
            return (int)(((l - l1) * 100L) / l);
        } else
        {
            return 0;
        }
    }

    public static int b(int i, long l, long l1)
    {
        float f1;
        int j;
        if (l > 0L && l1 > 0L)
        {
            f1 = (float)l1 / (float)l;
        } else
        {
            f1 = 0.0F;
        }
        if (i < 20)
        {
            j = 1000;
        } else
        if (i < 30)
        {
            j = 700;
        } else
        if (i < 50)
        {
            j = 500;
        } else
        if (i < 70)
        {
            j = 400;
        } else
        if (i < 90)
        {
            j = 300;
        } else
        {
            j = 200;
        }
        j = (int)(((float)(j * i) * f1) / 100F);
        if (i < 20 && j < 3)
        {
            return 3;
        } else
        {
            return j;
        }
    }

    public static InputStream b(Context context, String s1)
    {
        Object obj1;
        Object obj2;
        try
        {
            Object obj = new File(context.getFilesDir(), s1);
            if (!((File) (obj)).exists())
            {
                a(context, s1, ((File) (obj)));
            }
            obj = (new StringBuilder()).append(s1).append(".timestamp").toString();
            File file = new File(context.getFilesDir(), ((String) (obj)));
            if (!file.exists())
            {
                a(context, ((String) (obj)), file);
            }
        }
        catch (Exception exception) { }
        obj2 = null;
        obj1 = obj2;
        if (f(context, s1) >= g(context, s1))
        {
            try
            {
                obj1 = context.openFileInput(s1);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                obj1 = obj2;
            }
        }
        obj2 = obj1;
        if (obj1 == null)
        {
            try
            {
                obj2 = context.getAssets().open(s1);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return ((InputStream) (obj1));
            }
        }
        return ((InputStream) (obj2));
    }

    public static String b(String s1, String s2)
    {
        return SecurityUtil.DES_encrypt(s1, s2);
    }

    public static void b(Activity activity, int i)
    {
        if (activity == null)
        {
            return;
        } else
        {
            activity.setContentView(i);
            return;
        }
    }

    public static boolean b(Context context)
    {
        return ((ConnectivityManager)c(context, "connectivity")).getActiveNetworkInfo() != null;
    }

    public static byte[] b(byte abyte0[])
    {
        return SecurityUtil.MD5(abyte0);
    }

    public static String[] b(float f1)
    {
        float f2 = f1;
        if (f1 < 0.0F)
        {
            f2 = 0.0F;
        }
        NumberFormat numberformat = NumberFormat.getInstance();
        String as[] = new String[2];
        if (f2 == 0.0F)
        {
            as[0] = "0";
            as[1] = "MB";
        } else
        if (f2 < 1000F)
        {
            numberformat.setMaximumFractionDigits(1);
            as[0] = numberformat.format(f2);
            as[1] = "B";
        } else
        if (f2 <= 1024F)
        {
            f1 = f2 / 1024F;
            numberformat.setMaximumFractionDigits(1);
            as[0] = numberformat.format(f1);
            as[1] = "KB";
        } else
        if (f2 <= 1048576F)
        {
            f1 = f2 / 1024F;
            if (f1 >= 1000F)
            {
                f1 /= 1024F;
                numberformat.setMaximumFractionDigits(1);
                as[0] = numberformat.format(f1);
                as[1] = "MB";
                return as;
            }
            if (f1 > 10F)
            {
                numberformat.setMaximumFractionDigits(0);
            } else
            {
                numberformat.setMaximumFractionDigits(1);
            }
            as[0] = numberformat.format(f1);
            as[1] = "KB";
        } else
        if (f2 <= 1.073742E+09F)
        {
            f1 = f2 / 1024F / 1024F;
            if (f1 >= 1000F)
            {
                f1 /= 1024F;
                numberformat.setMaximumFractionDigits(1);
                as[0] = numberformat.format(f1);
                as[1] = "GB";
                return as;
            }
            if (f1 > 10F)
            {
                numberformat.setMaximumFractionDigits(0);
            } else
            {
                numberformat.setMaximumFractionDigits(1);
            }
            as[0] = numberformat.format(f1);
            as[1] = "MB";
        } else
        {
            f1 = f2 / 1024F / 1024F / 1024F;
            if (f1 >= 1000F)
            {
                f1 /= 1024F;
                numberformat.setMaximumFractionDigits(1);
                as[0] = numberformat.format(f1);
                as[1] = "TB";
                return as;
            }
            if (f1 > 10F)
            {
                numberformat.setMaximumFractionDigits(0);
            } else
            {
                numberformat.setMaximumFractionDigits(1);
            }
            as[0] = numberformat.format(f1);
            as[1] = "GB";
        }
        return as;
    }

    public static long c()
    {
        Object obj2;
        long l1;
        obj2 = null;
        l1 = -1L;
        Object obj = new BufferedReader(new FileReader("/proc/meminfo"));
_L2:
        String s2 = ((BufferedReader) (obj)).readLine();
        String s1;
        s1 = obj2;
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        if (!s2.startsWith("MemTotal:")) goto _L2; else goto _L1
_L1:
        s1 = s2.split(" +")[1];
        long l = Long.valueOf(s1).longValue();
        Object obj1;
        l1 = l;
        if (obj != null)
        {
            try
            {
                ((BufferedReader) (obj)).close();
            }
            catch (Exception exception)
            {
                return l;
            }
            l1 = l;
        }
        return l1;
        obj;
        obj = null;
_L6:
        if (obj != null)
        {
            try
            {
                ((BufferedReader) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return -1L;
            }
            return -1L;
        } else
        {
            break MISSING_BLOCK_LABEL_81;
        }
        obj1;
        obj = null;
_L4:
        if (obj != null)
        {
            try
            {
                ((BufferedReader) (obj)).close();
            }
            catch (Exception exception1) { }
        }
        throw obj1;
        obj1;
        if (true) goto _L4; else goto _L3
_L3:
        obj1;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static Object c(Context context, String s1)
    {
        return context.getApplicationContext().getSystemService(s1);
    }

    public static String c(byte abyte0[])
    {
        return SecurityUtil.getMD5(abyte0);
    }

    public static long d()
    {
        String s3;
        long l;
        s3 = null;
        l = -1L;
        BufferedReader bufferedreader = new BufferedReader(new FileReader("/proc/meminfo"));
        String s1;
        String s2;
        int i;
        i = 0;
        s1 = null;
        s2 = null;
_L6:
        String s7 = bufferedreader.readLine();
        String s4;
        String s5;
        String s6;
        s4 = s3;
        s5 = s2;
        s6 = s1;
        if (s7 == null) goto _L2; else goto _L1
_L1:
        if (!s7.startsWith("MemFree")) goto _L4; else goto _L3
_L3:
        int j = i + 1;
        s4 = s7.split(" +")[1];
        s3 = s4;
        i = j;
        if (j < 3) goto _L6; else goto _L5
_L5:
        s6 = s1;
        s5 = s2;
_L2:
        long l1;
        long l2;
        long l3;
        l1 = Long.valueOf(s4).longValue();
        l2 = Long.valueOf(s6).longValue();
        l3 = Long.valueOf(s5).longValue();
        Object obj;
        l1 = l3 + (l1 + l2);
        l = l1;
        if (bufferedreader != null)
        {
            int k;
            try
            {
                bufferedreader.close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return l1;
            }
            l = l1;
        }
        return l;
_L4:
        if (!s7.startsWith("Buffers"))
        {
            continue; /* Loop/switch isn't completed */
        }
        k = i + 1;
        s6 = s7.split(" +")[1];
        s1 = s6;
        i = k;
        if (k < 3) goto _L6; else goto _L7
_L7:
        s4 = s3;
        s5 = s2;
          goto _L2
        if (!s7.startsWith("Cached")) goto _L6; else goto _L8
_L8:
        k = i + 1;
        s5 = s7.split(" +")[1];
        s2 = s5;
        i = k;
        if (k < 3) goto _L6; else goto _L9
_L9:
        s4 = s3;
        s6 = s1;
          goto _L2
        obj;
        bufferedreader = null;
_L13:
        if (bufferedreader != null)
        {
            try
            {
                bufferedreader.close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return -1L;
            }
            return -1L;
        } else
        {
            break MISSING_BLOCK_LABEL_156;
        }
        obj;
        bufferedreader = null;
_L11:
        if (bufferedreader != null)
        {
            try
            {
                bufferedreader.close();
            }
            catch (IOException ioexception) { }
        }
        throw obj;
        obj;
        if (true) goto _L11; else goto _L10
_L10:
        obj;
        if (true) goto _L13; else goto _L12
_L12:
    }

    public static void d(Context context, String s1)
    {
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            context.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse((new StringBuilder()).append("package:").append(s1).toString())));
            return;
        }
        try
        {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setClassName("com.android.settings", "com.android.settings.InstalledAppDetails");
            intent.putExtra("com.android.settings.ApplicationPkgName", s1);
            intent.putExtra("pkg", s1);
            context.startActivity(intent);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
        }
        return;
    }

    public static int e()
    {
        long l = d();
        if (l == -1L)
        {
            return -1;
        } else
        {
            return (int)((float)l / 1024F);
        }
    }

    public static long e(Context context, String s1)
    {
        return Math.max(f(context, s1), g(context, s1));
    }

    public static long f(Context context, String s1)
    {
        Object obj = null;
        try
        {
            context = context.openFileInput((new StringBuilder()).append(s1).append(".timestamp").toString());
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context = obj;
        }
        if (context != null)
        {
            return a(context);
        } else
        {
            return 0L;
        }
    }

    public static long g(Context context, String s1)
    {
        Object obj = null;
        try
        {
            context = context.getAssets().open((new StringBuilder()).append(s1).append(".timestamp").toString());
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context = obj;
        }
        if (context != null)
        {
            return a(context);
        } else
        {
            return 0L;
        }
    }

    static 
    {
        a = NumberFormat.getInstance();
        a.setMaximumFractionDigits(2);
    }
}

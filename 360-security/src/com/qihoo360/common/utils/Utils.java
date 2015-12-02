// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.common.utils;

import android.app.Activity;
import android.app.Dialog;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemProperties;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.qihoo360.mobilesafe.support.NativeManager;
import com.qihoo360.mobilesafe.support.NativeUtils;
import com.qihoo360.mobilesafe.support.a;
import com.qihoo360.mobilesafe.support.a.f;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.InflaterInputStream;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import org.apache.commons.codec.binary.Base64;

// Referenced classes of package com.qihoo360.common.utils:
//            SecurityUtil, ByteConvertor, FileUtil, PermissionUtil

public class Utils
{

    private static String a = null;
    public static NumberFormat mSizeFormat;

    public Utils()
    {
    }

    public static void CopyStream(InputStream inputstream, OutputStream outputstream)
        throws IOException
    {
        byte abyte0[] = new byte[4096];
        do
        {
            int i = inputstream.read(abyte0);
            if (i <= 0)
            {
                outputstream.flush();
                return;
            }
            outputstream.write(abyte0, 0, i);
        } while (true);
    }

    public static String DES_decrypt(String s, String s1)
    {
        return SecurityUtil.DES_decrypt(s, s1);
    }

    public static String DES_encrypt(String s, String s1)
    {
        return SecurityUtil.DES_encrypt(s, s1);
    }

    public static byte[] MD5(File file)
    {
        return SecurityUtil.MD5(file);
    }

    public static byte[] MD5(String s)
    {
        return SecurityUtil.MD5(s);
    }

    public static byte[] MD5(byte abyte0[])
    {
        if (abyte0 == null)
        {
            return null;
        } else
        {
            return SecurityUtil.MD5(abyte0);
        }
    }

    private static long a(InputStream inputstream)
    {
        Object obj1 = null;
        Object obj = new DataInputStream(inputstream);
        long l = Long.parseLong(((DataInputStream) (obj)).readLine());
        Object obj2;
        if (obj != null)
        {
            try
            {
                ((DataInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream)
            {
                return l;
            }
        }
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        inputstream.close();
        return l;
        obj;
        obj = obj1;
_L4:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        ((DataInputStream) (obj)).close();
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream) { }
        }
        return 0L;
        obj2;
        obj = null;
_L2:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        ((DataInputStream) (obj)).close();
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream) { }
        }
        throw obj2;
        obj2;
        if (true) goto _L2; else goto _L1
_L1:
        obj2;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static ArrayList a(Context context, String s)
    {
        Object obj = ((DevicePolicyManager)context.getSystemService("device_policy")).getActiveAdmins();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        if (((List) (obj)).size() <= 0)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        context = new ArrayList();
        obj = ((List) (obj)).iterator();
_L2:
        if (!((Iterator) (obj)).hasNext())
        {
            return context;
        }
        ComponentName componentname = (ComponentName)((Iterator) (obj)).next();
        if (componentname.getPackageName().equals(s))
        {
            context.add(componentname);
        }
        if (true) goto _L2; else goto _L1
_L1:
        context;
        return null;
    }

    private static void a(Activity activity, ComponentName componentname)
    {
        Intent intent = new Intent();
        intent.setClassName("com.android.settings", "com.android.settings.DeviceAdminAdd");
        intent.putExtra("android.app.extra.DEVICE_ADMIN", componentname);
        try
        {
            activity.startActivity(intent);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            return;
        }
    }

    private static boolean a()
    {
        String s = SystemProperties.get("ro.product.manufacturer", "0");
        String s1 = SystemProperties.get("ro.build.product", "0");
        return TextUtils.equals(s, "Saihon") && TextUtils.equals(s1, "I97");
    }

    private static long b()
    {
        return 0x1f4000L;
    }

    public static void bindService(Context context, Class class1, String s, ServiceConnection serviceconnection, int i)
    {
        class1 = (new Intent(context, class1)).setAction(s);
        context.getApplicationContext().bindService(class1, serviceconnection, i);
    }

    public static String bytesToHexString(byte abyte0[])
    {
        return ByteConvertor.bytesToHexString(abyte0);
    }

    public static void closeCursor(Cursor cursor)
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

    public static int compareVersion(String s, String s1)
    {
        int ai[];
        int ai1[];
        int i;
        ai = new int[4];
        ai1 = new int[4];
        s = s.split("\\.");
        s1 = s1.split("\\.");
        i = 0;
_L5:
        if (i < s.length) goto _L2; else goto _L1
_L1:
        i = 0;
_L6:
        if (i < s1.length) goto _L4; else goto _L3
_L3:
        i = 0;
_L7:
        if (i >= 4)
        {
            return 0;
        }
        break MISSING_BLOCK_LABEL_95;
_L2:
        ai[i] = str2Int(s[i], 0);
        i++;
          goto _L5
_L4:
        ai1[i] = str2Int(s1[i], 0);
        i++;
          goto _L6
        if (ai[i] < ai1[i])
        {
            return -1;
        }
        if (ai[i] > ai1[i])
        {
            return 1;
        }
        i++;
          goto _L7
    }

    public static boolean copyRawFile(Context context, int i, File file, String s)
    {
        FileOutputStream fileoutputstream;
        byte abyte0[];
        abyte0 = new byte[1024];
        context = context.getResources().openRawResource(i);
        try
        {
            fileoutputstream = new FileOutputStream(file);
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return false;
            }
            return false;
        }
_L1:
        try
        {
            i = context.read(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            try
            {
                fileoutputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file) { }
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return false;
            }
            return false;
        }
        finally { }
        if (i <= 0)
        {
            try
            {
                fileoutputstream.close();
            }
            catch (Exception exception) { }
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
            try
            {
                Runtime.getRuntime().exec((new StringBuilder("chmod ")).append(s).append(" ").append(file.getAbsolutePath()).toString()).waitFor();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return false;
            }
            return true;
        }
        fileoutputstream.write(abyte0, 0, i);
          goto _L1
        try
        {
            fileoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        try
        {
            context.close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        throw file;
    }

    public static void desDecryptFile(File file, File file1, String s)
    {
        CipherInputStream cipherinputstream;
        Object obj1;
        obj1 = null;
        cipherinputstream = null;
        Cipher cipher;
        SecureRandom securerandom = new SecureRandom();
        s = new DESKeySpec(MD5(s.getBytes()));
        s = SecretKeyFactory.getInstance("DES").generateSecret(s);
        cipher = Cipher.getInstance("DES");
        cipher.init(2, s, securerandom);
        file = new FileInputStream(file);
        s = new FileOutputStream(file1);
        cipherinputstream = new CipherInputStream(file, cipher);
        file1 = new byte[1024];
_L3:
        int i = cipherinputstream.read(file1);
        if (i > 0) goto _L2; else goto _L1
_L1:
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file) { }
        }
        if (s != null)
        {
            try
            {
                s.flush();
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file) { }
        }
        if (cipherinputstream == null)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        cipherinputstream.close();
_L5:
        return;
_L2:
        s.write(file1, 0, i);
          goto _L3
        file1;
        file1 = file;
        file = cipherinputstream;
_L8:
        if (file1 != null)
        {
            try
            {
                file1.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file1) { }
        }
        if (s != null)
        {
            try
            {
                s.flush();
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file1) { }
        }
        if (file == null) goto _L5; else goto _L4
_L4:
        try
        {
            file.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            return;
        }
        file1;
        s = null;
        file = null;
        cipherinputstream = obj1;
_L7:
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file) { }
        }
        if (s != null)
        {
            try
            {
                s.flush();
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file) { }
        }
        if (cipherinputstream != null)
        {
            try
            {
                cipherinputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file) { }
        }
        throw file1;
        file;
        return;
        file1;
        s = null;
        cipherinputstream = obj1;
        continue; /* Loop/switch isn't completed */
        file1;
        cipherinputstream = obj1;
        continue; /* Loop/switch isn't completed */
        file1;
        if (true) goto _L7; else goto _L6
_L6:
        file;
        file = null;
        file1 = null;
        s = cipherinputstream;
          goto _L8
        file1;
        s = null;
        file1 = file;
        file = s;
        s = cipherinputstream;
          goto _L8
        file1;
        Object obj = null;
        file1 = file;
        file = obj;
          goto _L8
    }

    public static void desDecryptFile(String s, String s1, String s2)
    {
        desDecryptFile(new File(s), new File(s1), s2);
    }

    public static void desEncryptFile(File file, File file1, String s)
    {
        CipherInputStream cipherinputstream;
        Object obj1;
        obj1 = null;
        cipherinputstream = null;
        Cipher cipher;
        SecureRandom securerandom = new SecureRandom();
        s = new DESKeySpec(MD5(s.getBytes()));
        s = SecretKeyFactory.getInstance("DES").generateSecret(s);
        cipher = Cipher.getInstance("DES");
        cipher.init(1, s, securerandom);
        file = new FileInputStream(file);
        s = new FileOutputStream(file1);
        cipherinputstream = new CipherInputStream(file, cipher);
        file1 = new byte[1024];
_L3:
        int i = cipherinputstream.read(file1);
        if (i > 0) goto _L2; else goto _L1
_L1:
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file) { }
        }
        if (s != null)
        {
            try
            {
                s.flush();
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file) { }
        }
        if (cipherinputstream == null)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        cipherinputstream.close();
_L5:
        return;
_L2:
        s.write(file1, 0, i);
          goto _L3
        file1;
        file1 = file;
        file = cipherinputstream;
_L8:
        if (file1 != null)
        {
            try
            {
                file1.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file1) { }
        }
        if (s != null)
        {
            try
            {
                s.flush();
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file1) { }
        }
        if (file == null) goto _L5; else goto _L4
_L4:
        try
        {
            file.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            return;
        }
        file1;
        s = null;
        file = null;
        cipherinputstream = obj1;
_L7:
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file) { }
        }
        if (s != null)
        {
            try
            {
                s.flush();
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file) { }
        }
        if (cipherinputstream != null)
        {
            try
            {
                cipherinputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file) { }
        }
        throw file1;
        file;
        return;
        file1;
        s = null;
        cipherinputstream = obj1;
        continue; /* Loop/switch isn't completed */
        file1;
        cipherinputstream = obj1;
        continue; /* Loop/switch isn't completed */
        file1;
        if (true) goto _L7; else goto _L6
_L6:
        file;
        file = null;
        file1 = null;
        s = cipherinputstream;
          goto _L8
        file1;
        s = null;
        file1 = file;
        file = s;
        s = cipherinputstream;
          goto _L8
        file1;
        Object obj = null;
        file1 = file;
        file = obj;
          goto _L8
    }

    public static void desEncryptFile(String s, String s1, String s2)
    {
        desEncryptFile(new File(s), new File(s1), s2);
    }

    public static byte[] desString(String s, String s1)
    {
        try
        {
            SecureRandom securerandom = new SecureRandom();
            s1 = new DESKeySpec(s1.getBytes());
            s1 = SecretKeyFactory.getInstance("DES").generateSecret(s1);
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(1, s1, securerandom);
            s = cipher.doFinal(s.getBytes());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        return s;
    }

    public static byte[] des_decrypt(byte abyte0[])
    {
        try
        {
            SecureRandom securerandom = new SecureRandom();
            Object obj = new DESKeySpec(NativeManager.a.getBytes());
            obj = SecretKeyFactory.getInstance("DES").generateSecret(((java.security.spec.KeySpec) (obj)));
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(2, ((java.security.Key) (obj)), securerandom);
            abyte0 = cipher.doFinal(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            return null;
        }
        return abyte0;
    }

    public static byte[] des_encrypt(byte abyte0[])
    {
        return des_encrypt(abyte0, NativeManager.a.getBytes());
    }

    public static byte[] des_encrypt(byte abyte0[], byte abyte1[])
    {
        if (abyte1 == null || abyte0 == null)
        {
            return null;
        }
        try
        {
            SecureRandom securerandom = new SecureRandom();
            abyte1 = new DESKeySpec(abyte1);
            abyte1 = SecretKeyFactory.getInstance("DES").generateSecret(abyte1);
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(1, abyte1, securerandom);
            abyte0 = cipher.doFinal(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            return null;
        }
        return abyte0;
    }

    public static boolean diffStream(InputStream inputstream, InputStream inputstream1)
        throws IOException
    {
        byte abyte0[];
        byte abyte1[];
        boolean flag1;
        flag1 = false;
        abyte0 = new byte[1024];
        abyte1 = new byte[1024];
_L6:
        int j = inputstream.read(abyte0);
        if (j > 0) goto _L2; else goto _L1
_L1:
        boolean flag;
        flag = flag1;
        if (inputstream1.available() == 0)
        {
            flag = true;
        }
_L4:
        return flag;
_L2:
        flag = flag1;
        if (j != inputstream1.read(abyte1)) goto _L4; else goto _L3
_L3:
        int i = 0;
_L8:
        if (i >= j) goto _L6; else goto _L5
_L5:
        flag = flag1;
        if (abyte0[i] != abyte1[i]) goto _L4; else goto _L7
_L7:
        i++;
          goto _L8
    }

    public static void dismissDialog(Activity activity, int i)
    {
        if (activity == null)
        {
            throw new IllegalArgumentException();
        }
        if (activity.isFinishing())
        {
            return;
        }
        try
        {
            activity.dismissDialog(i);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            return;
        }
    }

    public static void dismissDialog(Dialog dialog)
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

    public static void doJarCmd(f f, Context context, ArrayList arraylist)
    {
        ArrayList arraylist1;
        String s;
        try
        {
            s = getAppProcessPath();
        }
        // Misplaced declaration of an exception variable
        catch (f f)
        {
            return;
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        arraylist1 = new ArrayList(5);
        arraylist1.add(s);
        arraylist1.add("com.qihoo360.mobilesafe.lib.appmgr.util.RT");
        arraylist1.addAll(arraylist);
        arraylist = new ArrayList(1);
        arraylist.add((new StringBuilder("CLASSPATH=")).append(getLatestFilePath(context, "appmgr.jar")).toString());
        com.qihoo360.mobilesafe.support.a.b(f, pathAppend(getAppProcessPath(), "app_process"), arraylist1, arraylist, 0L);
    }

    public static Bitmap drawableToBitmap(Drawable drawable)
    {
        Object obj;
        int i;
        int j;
        i = drawable.getIntrinsicWidth();
        j = drawable.getIntrinsicHeight();
        if (drawable.getOpacity() == -1)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        obj = android.graphics.Bitmap.Config.ARGB_8888;
_L1:
        obj = Bitmap.createBitmap(i, j, ((android.graphics.Bitmap.Config) (obj)));
        Canvas canvas = new Canvas(((Bitmap) (obj)));
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        drawable.draw(canvas);
        return ((Bitmap) (obj));
        try
        {
            obj = android.graphics.Bitmap.Config.RGB_565;
        }
        // Misplaced declaration of an exception variable
        catch (Drawable drawable)
        {
            log("Utils", "", drawable);
            return null;
        }
          goto _L1
    }

    public static String encodeBase64(String s)
    {
        return new String(Base64.encodeBase64(s.getBytes()));
    }

    public static String encodeBase64(byte abyte0[])
    {
        return new String(Base64.encodeBase64(abyte0));
    }

    public static boolean extractAssetFile(Context context, String s, File file)
    {
        Object obj = null;
        context = context.getAssets().open(s);
        boolean flag = FileUtil.copyToFile(context, file);
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return flag;
            }
        }
        return flag;
        context;
        context = obj;
_L4:
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
        return false;
        s;
        context = null;
_L2:
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
        throw s;
        s;
        if (true) goto _L2; else goto _L1
_L1:
        s;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static String formatBytes(Context context, double d)
    {
        if (d > 1000000D)
        {
            return String.format("%.2f MB", new Object[] {
                Float.valueOf((float)(int)(d / 1000D) / 1000F)
            });
        }
        if (d > 1024D)
        {
            return String.format("%.2f KB", new Object[] {
                Float.valueOf((float)(int)(d / 10D) / 100F)
            });
        } else
        {
            return String.format("%d bytes", new Object[] {
                Integer.valueOf((int)d)
            });
        }
    }

    public static String formatMemorySize(long l)
    {
        NumberFormat numberformat = NumberFormat.getInstance();
        numberformat.setMaximumFractionDigits(1);
        if (l < 1000L)
        {
            return (new StringBuilder(String.valueOf(l))).append("B").toString();
        }
        if (l < 0xfa000L)
        {
            return (new StringBuilder(String.valueOf(numberformat.format((float)l / 1024F)))).append("K").toString();
        }
        if (l < 0x3e800000L)
        {
            return (new StringBuilder(String.valueOf(numberformat.format((float)l / 1048576F)))).append("M").toString();
        } else
        {
            return (new StringBuilder(String.valueOf(numberformat.format((float)l / 1.073742E+09F)))).append("G").toString();
        }
    }

    public static String formatVoltage(int i)
    {
        if (i < 10)
        {
            return String.valueOf(i);
        } else
        {
            NumberFormat numberformat = NumberFormat.getInstance();
            numberformat.setMaximumFractionDigits(1);
            return numberformat.format((float)i / 1000F);
        }
    }

    public static String generateRandomString()
    {
        Object obj;
        try
        {
            obj = SecureRandom.getInstance("SHA1PRNG");
            byte abyte0[] = new byte[16];
            ((SecureRandom) (obj)).nextBytes(abyte0);
            obj = bytesToHexString(abyte0);
        }
        catch (NoSuchAlgorithmException nosuchalgorithmexception)
        {
            return Long.toString(System.currentTimeMillis());
        }
        return ((String) (obj));
    }

    public static Resources getApkResByRefrect(Context context, String s)
    {
        try
        {
            Class class1 = Class.forName("android.content.res.AssetManager");
            Object obj = class1.newInstance();
            class1.getMethod("addAssetPath", new Class[] {
                java/lang/String
            }).invoke(obj, new Object[] {
                s
            });
            context = context.getResources();
            context = new Resources((AssetManager)obj, context.getDisplayMetrics(), context.getConfiguration());
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        return context;
    }

    public static String getAppProcessPath()
    {
        if (a == null)
        {
            a = com.qihoo360.mobilesafe.support.a.a("app_process");
        }
        return a;
    }

    public static long getBundleTimestamp(Context context, String s)
    {
        Object obj = null;
        try
        {
            context = context.getAssets().open((new StringBuilder(String.valueOf(s))).append(".timestamp").toString());
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

    public static long getBundleTimestamp(Context context, String s, String s1)
    {
        Object obj = null;
        try
        {
            context = context.getAssets().open((new StringBuilder(String.valueOf(s))).append(File.separator).append(s1).append(".timestamp").toString());
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

    public static int getCpuUsage()
    {
        int i;
        try
        {
            i = NativeManager.getCpuUsage();
        }
        catch (Throwable throwable)
        {
            return 0;
        }
        return i;
    }

    public static InputStream getDESDecryptInputStream(InputStream inputstream, String s)
    {
        try
        {
            SecureRandom securerandom = new SecureRandom();
            s = new DESKeySpec(MD5(s.getBytes()));
            s = SecretKeyFactory.getInstance("DES").generateSecret(s);
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(2, s, securerandom);
            inputstream = new CipherInputStream(inputstream, cipher);
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            return null;
        }
        return inputstream;
    }

    public static InputStream getDESDecryptInputStream(String s, String s1)
    {
        try
        {
            s = getDESDecryptInputStream(((InputStream) (new FileInputStream(s))), s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    public static long getDataPartitionFreeSize()
    {
        StatFs statfs = new StatFs(Environment.getDataDirectory().getPath());
        long l = statfs.getBlockSize();
        return (long)statfs.getAvailableBlocks() * l;
    }

    public static long getDataPartitionTotalSize()
    {
        StatFs statfs = new StatFs(Environment.getDataDirectory().getPath());
        long l = statfs.getBlockSize();
        return (long)statfs.getBlockCount() * l;
    }

    public static String getFileMD5(String s)
    {
        return SecurityUtil.getFileMD5(s);
    }

    public static long getFileTimestamp(Context context, String s)
    {
        Object obj = null;
        try
        {
            context = context.openFileInput((new StringBuilder(String.valueOf(s))).append(".timestamp").toString());
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

    public static long getFileTimestamp(Context context, String s, String s1)
    {
        context = new File(context.getFilesDir(), s);
        if (!context.exists())
        {
            return 0L;
        }
        try
        {
            context = new FileInputStream(new File(context, (new StringBuilder(String.valueOf(s1))).append(".timestamp").toString()));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context = null;
        }
        if (context != null)
        {
            return a(context);
        } else
        {
            return 0L;
        }
    }

    public static ArrayList getHomeLauncherPackages(Context context)
    {
        Object obj;
        obj = new Intent("android.intent.action.MAIN");
        ((Intent) (obj)).addCategory("android.intent.category.HOME");
        try
        {
            context = context.getPackageManager().queryIntentActivities(((Intent) (obj)), 0x10000);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context = new ArrayList(1);
        }
        obj = new ArrayList();
        if (context == null || context.size() <= 0) goto _L2; else goto _L1
_L1:
        context = context.iterator();
_L5:
        if (context.hasNext()) goto _L3; else goto _L2
_L2:
        return ((ArrayList) (obj));
_L3:
        ResolveInfo resolveinfo = (ResolveInfo)context.next();
        String s = resolveinfo.activityInfo.applicationInfo.packageName;
        if (resolveinfo.isDefault)
        {
            ((ArrayList) (obj)).add(0, s);
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            ((ArrayList) (obj)).add(s);
        }
        catch (Exception exception) { }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static String getHumanReadableFormattedString(long l)
    {
        if (l == 0L)
        {
            return "0,B";
        }
        if (l <= 1024L)
        {
            return (new StringBuilder(String.valueOf(l))).append(",B").toString();
        }
        if (l <= 0x100000L)
        {
            return (new StringBuilder(String.valueOf(mSizeFormat.format((float)l / 1024F)))).append(",KB").toString();
        }
        if (l <= 0x40000000L)
        {
            return (new StringBuilder(String.valueOf(mSizeFormat.format((float)l / 1024F / 1024F)))).append(",MB").toString();
        } else
        {
            return (new StringBuilder(String.valueOf(mSizeFormat.format((float)l / 1024F / 1024F / 1024F)))).append(",GB").toString();
        }
    }

    public static String getHumanReadableSize(long l)
    {
        if (l == 0L)
        {
            return "0";
        }
        if (l < 1024L)
        {
            return (new StringBuilder(String.valueOf(l))).append("B").toString();
        }
        if (l < 0x100000L)
        {
            return (new StringBuilder(String.valueOf(mSizeFormat.format((float)l / 1024F)))).append("KB").toString();
        } else
        {
            return (new StringBuilder(String.valueOf(mSizeFormat.format((float)l / 1024F / 1024F)))).append("MB").toString();
        }
    }

    public static String getHumanReadableSizeByKb(long l)
    {
        if (l == 0L)
        {
            return "0";
        }
        if (l < 1024L)
        {
            return (new StringBuilder(String.valueOf(l))).append("KB").toString();
        } else
        {
            return (new StringBuilder(String.valueOf(mSizeFormat.format((float)l / 1024F)))).append("MB").toString();
        }
    }

    public static String getHumanReadableSizeMore(long l)
    {
        if (l == 0L)
        {
            return "0M";
        }
        if (l < 1024L)
        {
            return (new StringBuilder(String.valueOf(l))).append("B").toString();
        }
        if (l < 0x100000L)
        {
            return (new StringBuilder(String.valueOf(mSizeFormat.format((float)l / 1024F)))).append("KB").toString();
        }
        if (l < 0x40000000L)
        {
            return (new StringBuilder(String.valueOf(mSizeFormat.format((float)l / 1024F / 1024F)))).append("MB").toString();
        } else
        {
            return (new StringBuilder(String.valueOf(mSizeFormat.format((float)l / 1024F / 1024F / 1024F)))).append("GB").toString();
        }
    }

    public static String getHumanReadableSizeNoFraction(long l)
    {
        NumberFormat numberformat = NumberFormat.getInstance();
        numberformat.setMaximumFractionDigits(0);
        if (l == 0L)
        {
            return "0";
        }
        if (l < 1024L)
        {
            return (new StringBuilder(String.valueOf(l))).append("B").toString();
        }
        if (l < 0x100000L)
        {
            return (new StringBuilder(String.valueOf(numberformat.format((float)l / 1024F)))).append("KB").toString();
        } else
        {
            return (new StringBuilder(String.valueOf(numberformat.format((float)l / 1024F / 1024F)))).append("MB").toString();
        }
    }

    public static ArrayList getInternalAndExternalSDPath(Context context)
    {
        ArrayList arraylist;
        int j;
        j = 0;
        arraylist = new ArrayList();
        if (android.os.Build.VERSION.SDK_INT < 14) goto _L2; else goto _L1
_L1:
        context = ((Context) (getSystemService(context, "storage")));
        if (context == null) goto _L4; else goto _L3
_L3:
        Object obj;
        Method method;
        method = context.getClass().getMethod("getVolumeList", null);
        obj = context.getClass().getMethod("getVolumeState", new Class[] {
            java/lang/String
        });
        if (method == null) goto _L4; else goto _L5
_L5:
        Object aobj[] = (Object[])method.invoke(context, null);
        if (aobj == null) goto _L4; else goto _L6
_L6:
        if (aobj.length <= 0) goto _L4; else goto _L7
_L7:
        Object obj1 = aobj[0];
        Method method1;
        method1 = obj1.getClass().getMethod("isEmulated", null);
        obj1 = obj1.getClass().getMethod("getPath", null);
        int i = 0;
_L18:
        if (i < aobj.length) goto _L9; else goto _L8
_L8:
        i = j;
_L12:
        j = aobj.length;
        if (i < j) goto _L10; else goto _L4
_L4:
        if (arraylist.size() < 1)
        {
            context = getSDPathBySDKApi();
            if (!TextUtils.isEmpty(context))
            {
                arraylist.add(context);
            }
        }
        return arraylist;
_L9:
        Object obj2 = aobj[i];
        if (((Boolean)method1.invoke(obj2, null)).booleanValue())
        {
            obj2 = (String)((Method) (obj1)).invoke(obj2, null);
            if ("mounted".equals(((Method) (obj)).invoke(context, new Object[] {
    obj2
})))
            {
                arraylist.add(obj2);
            }
        }
          goto _L11
_L10:
        obj2 = aobj[i];
        if (!((Boolean)method1.invoke(obj2, null)).booleanValue())
        {
            obj2 = (String)((Method) (obj1)).invoke(obj2, null);
            if ("mounted".equals(((Method) (obj)).invoke(context, new Object[] {
    obj2
})))
            {
                arraylist.add(obj2);
            }
        }
        i++;
          goto _L12
        context;
        context.printStackTrace();
          goto _L4
_L2:
        context = getSDPathBySDKApi();
        if (!TextUtils.isEmpty(context))
        {
            arraylist.add(context);
        }
        context = new BufferedReader(new InputStreamReader(new FileInputStream(new File("/proc/mounts"))));
_L14:
        obj = context.readLine();
        if (obj == null)
        {
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
        }
        if (!((String) (obj)).contains("uid=1000") || !((String) (obj)).contains("gid=1015") || ((String) (obj)).contains("asec")) goto _L14; else goto _L13
_L13:
        String as[] = ((String) (obj)).split(" ");
        if (as.length < 4) goto _L14; else goto _L15
_L15:
        as = as[1];
        if (arraylist.contains(as)) goto _L14; else goto _L16
_L16:
        arraylist.add(as);
          goto _L14
        context;
        return arraylist;
_L11:
        i++;
        if (true) goto _L18; else goto _L17
_L17:
    }

    public static long getIntervalTime(long l)
    {
        return (System.currentTimeMillis() - l) / 0x5265c00L;
    }

    public static String getLatestFilePath(Context context, String s)
    {
        File file = context.getFileStreamPath(s);
        boolean flag;
        if (file != null && file.exists() && file.isFile() && getFileTimestamp(context, s) == getBundleTimestamp(context, s))
        {
            flag = false;
        } else
        {
            flag = true;
        }
        if (flag)
        {
            resetFile(context, s, true);
        }
        return context.getFileStreamPath(s).getAbsolutePath();
    }

    public static long getLatestFileTimestamp(Context context, String s)
    {
        return Math.max(getFileTimestamp(context, s), getBundleTimestamp(context, s));
    }

    public static List getLauncherAppList(Context context)
    {
        Object obj;
        context = context.getPackageManager();
        obj = new Intent("android.intent.action.MAIN");
        ((Intent) (obj)).addCategory("android.intent.category.LAUNCHER");
        try
        {
            context = context.queryIntentActivities(((Intent) (obj)), 32);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context = new ArrayList(1);
        }
        obj = new ArrayList();
        if (context == null || context.size() <= 0) goto _L2; else goto _L1
_L1:
        context = context.iterator();
_L5:
        if (context.hasNext()) goto _L3; else goto _L2
_L2:
        return ((List) (obj));
_L3:
        ResolveInfo resolveinfo = (ResolveInfo)context.next();
        try
        {
            ((ArrayList) (obj)).add(resolveinfo.activityInfo.applicationInfo.packageName);
        }
        catch (Exception exception) { }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static String getMD5(InputStream inputstream)
    {
        if (inputstream == null)
        {
            return "";
        } else
        {
            return SecurityUtil.getMD5(inputstream);
        }
    }

    public static String getMD5(String s)
    {
        if (s == null)
        {
            return "";
        } else
        {
            return SecurityUtil.getMD5(s);
        }
    }

    public static String getMD5(byte abyte0[])
    {
        if (abyte0 == null)
        {
            return "";
        } else
        {
            return SecurityUtil.getMD5(abyte0);
        }
    }

    public static int getMemoryFree()
    {
        long l = getMemoryFreeKb();
        if (l == -1L)
        {
            return -1;
        } else
        {
            return (int)((float)l / 1024F);
        }
    }

    public static long getMemoryFreeKb()
    {
        String s1;
        long l;
        s1 = null;
        l = -1L;
        BufferedReader bufferedreader = new BufferedReader(new FileReader("/proc/meminfo"));
        String s;
        int i;
        i = 0;
        s = null;
_L4:
        String s2 = bufferedreader.readLine();
        if (s2 != null) goto _L2; else goto _L1
_L1:
        long l1;
        long l2;
        l1 = Long.valueOf(s1).longValue();
        l2 = Long.valueOf(s).longValue();
        Object obj;
        l1 = l2 + l1;
        l = l1;
        if (bufferedreader != null)
        {
            int j;
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
_L2:
        if (!s2.startsWith("MemFree"))
        {
            break MISSING_BLOCK_LABEL_126;
        }
        j = i + 1;
        s2 = s2.split(" +")[1];
        s1 = s2;
        i = j;
        if (j < 3) goto _L4; else goto _L3
_L3:
        s1 = s2;
          goto _L1
        if (!s2.startsWith("Buffers"))
        {
            continue; /* Loop/switch isn't completed */
        }
        j = i + 1;
        s2 = s2.split(" +")[1];
        i = j;
        if (j < 3) goto _L4; else goto _L1
        if (!s2.startsWith("Cached")) goto _L4; else goto _L5
_L5:
        j = i + 1;
        s2 = s2.split(" +")[1];
        s = s2;
        i = j;
        if (j < 3) goto _L4; else goto _L6
_L6:
        s = s2;
          goto _L1
        obj;
        bufferedreader = null;
_L10:
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
            break MISSING_BLOCK_LABEL_80;
        }
        obj;
        bufferedreader = null;
_L8:
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
        if (true) goto _L8; else goto _L7
_L7:
        obj;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public static int getMemoryTotal()
    {
        long l = getMemoryTotalKb();
        if (l == -1L)
        {
            return -1;
        } else
        {
            return (int)((float)l / 1024F);
        }
    }

    public static long getMemoryTotalKb()
    {
        String s;
        long l1;
        s = null;
        l1 = -1L;
        Object obj = new BufferedReader(new FileReader("/proc/meminfo"));
_L2:
        String s1 = ((BufferedReader) (obj)).readLine();
        if (s1 != null)
        {
            continue; /* Loop/switch isn't completed */
        }
_L3:
        long l = Long.valueOf(s).longValue();
        Object obj1;
        l1 = l;
        l = l1;
        if (obj != null)
        {
            try
            {
                ((BufferedReader) (obj)).close();
            }
            catch (Exception exception)
            {
                return l1;
            }
            l = l1;
        }
        return l;
        if (!s1.startsWith("MemTotal:")) goto _L2; else goto _L1
_L1:
        s = s1.split(" +")[1];
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
        obj;
        obj = null;
_L11:
        if (obj != null)
        {
            try
            {
                ((BufferedReader) (obj)).close();
            }
            catch (Exception exception1) { }
        }
_L6:
        l = l1;
        if (-1L > 0L)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        l = l1;
        if (a())
        {
            return b();
        } else
        {
            break MISSING_BLOCK_LABEL_59;
        }
        obj;
        obj = null;
_L9:
        if (obj != null)
        {
            try
            {
                ((BufferedReader) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        if (true) goto _L6; else goto _L5
_L5:
        obj1;
        obj = null;
_L8:
        if (obj != null)
        {
            try
            {
                ((BufferedReader) (obj)).close();
            }
            catch (Exception exception2) { }
        }
        throw obj1;
        obj1;
        if (true) goto _L8; else goto _L7
_L7:
        obj1;
          goto _L9
        obj1;
        if (true) goto _L11; else goto _L10
_L10:
    }

    public static int getMemoryUsedPercent()
    {
        long l = getMemoryTotalKb();
        long l1 = getMemoryFreeKb();
        if (l > 0L && l1 > 0L)
        {
            return (int)(((l - l1) * 100L) / l);
        } else
        {
            return 0;
        }
    }

    public static String getNumberOnly(String s)
    {
        StringBuffer stringbuffer = new StringBuffer();
        int j = s.length();
        int i = 0;
        do
        {
            if (i >= j)
            {
                return stringbuffer.toString();
            }
            char c = s.charAt(i);
            if (c >= '0' && c <= '9')
            {
                stringbuffer.append(c);
            }
            i++;
        } while (true);
    }

    public static long getSDPartitionFreeSize()
    {
        if (Environment.getExternalStorageState().equals("mounted"))
        {
            StatFs statfs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            long l = statfs.getBlockSize();
            return (long)statfs.getAvailableBlocks() * l;
        } else
        {
            return -1L;
        }
    }

    public static long getSDPartitionTotalSize()
    {
        if (Environment.getExternalStorageState().equals("mounted"))
        {
            StatFs statfs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            long l = statfs.getBlockSize();
            return (long)statfs.getBlockCount() * l;
        } else
        {
            return -1L;
        }
    }

    public static String getSDPathBySDKApi()
    {
        if (Environment.getExternalStorageState().equals("mounted"))
        {
            return Environment.getExternalStorageDirectory().toString();
        } else
        {
            return null;
        }
    }

    public static transient SpannableStringBuilder getSpannableStringBuilder(Context context, int i, int j, String as[])
    {
        String s;
        int ai[];
        boolean flag;
        int k;
        flag = false;
        s = context.getString(i, as);
        k = as.length;
        ai = new int[k];
        i = 0;
_L3:
        if (i < k) goto _L2; else goto _L1
_L1:
        SpannableStringBuilder spannablestringbuilder;
        spannablestringbuilder = new SpannableStringBuilder(s);
        i = ((flag) ? 1 : 0);
_L4:
        if (i >= k)
        {
            return spannablestringbuilder;
        }
        break MISSING_BLOCK_LABEL_71;
_L2:
        ai[i] = s.indexOf(as[i]);
        i++;
          goto _L3
        ai[i] = s.indexOf(as[i]);
        spannablestringbuilder.setSpan(new ForegroundColorSpan(context.getResources().getColor(j)), ai[i], ai[i] + as[i].length(), 34);
        i++;
          goto _L4
    }

    public static Object getSystemService(Context context, String s)
    {
        return context.getApplicationContext().getSystemService(s);
    }

    public static SpannableStringBuilder getUnderlineSpanString(String s)
    {
        SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder(s);
        spannablestringbuilder.setSpan(new UnderlineSpan(), 0, s.length(), 33);
        return spannablestringbuilder;
    }

    public static int hexCharToInt(char c)
    {
        return ByteConvertor.hexCharToInt(c);
    }

    public static byte[] hexStringToBytes(String s)
    {
        return ByteConvertor.hexStringToBytes(s);
    }

    public static boolean isAdminActive(Context context, String s)
    {
        context = a(context, s);
        return context != null && context.size() > 0;
    }

    public static boolean isAuthenticatedTestUser(String s, Context context)
    {
        BufferedReader bufferedreader = null;
        ArrayList arraylist;
        arraylist = new ArrayList(1000);
        context = context.getAssets().open("cert.dat");
        bufferedreader = new BufferedReader(new InputStreamReader(new InflaterInputStream(context)));
_L1:
        String s1 = bufferedreader.readLine();
        if (s1 != null)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        boolean flag = arraylist.contains(s);
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return flag;
            }
        }
        return flag;
        arraylist.add(s1.trim().toUpperCase());
          goto _L1
        s;
_L5:
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
        return false;
        s;
        context = null;
_L3:
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
        throw s;
        s;
        if (true) goto _L3; else goto _L2
_L2:
        s;
        context = bufferedreader;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static boolean isChinese(char c)
    {
        return c >= '\u4E00' && c <= '\u9FA5';
    }

    public static boolean isChineseBiaodiao(char c)
    {
        return c >= '\u3000' && c <= '\u303F';
    }

    public static boolean isCmdExist(String s)
    {
        Object obj = System.getenv("PATH");
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            Log.e("Utils", "PATH is empty!");
        } else
        if (((String) (obj)).contains(":"))
        {
            obj = ((String) (obj)).split(":");
            int j = obj.length;
            int i = 0;
            while (i < j) 
            {
                if ((new File(obj[i], s)).exists())
                {
                    return true;
                }
                i++;
            }
        } else
        {
            return (new File(((String) (obj)), s)).exists();
        }
        return false;
    }

    public static boolean isFileUpdated(Context context, String s)
    {
        File file;
        file = context.getFileStreamPath(s);
        break MISSING_BLOCK_LABEL_6;
        if (file != null && file.exists())
        {
            long l = getFileTimestamp(context, s);
            if (getBundleTimestamp(context, s) <= l)
            {
                return true;
            }
        }
        return false;
    }

    public static boolean isLetter(char c)
    {
        return c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z';
    }

    public static boolean isListEmpty(List list)
    {
        return list == null || list.isEmpty();
    }

    public static boolean isMeizu()
    {
        return Build.MODEL.equalsIgnoreCase("meizu_m9") || Build.MODEL.equalsIgnoreCase("m9") || Build.MODEL.equalsIgnoreCase("meizu mx") || Build.MODEL.equalsIgnoreCase("mx") || Build.MODEL.equalsIgnoreCase("M040") || Build.MODEL.equalsIgnoreCase("M030") || Build.MODEL.equalsIgnoreCase("M031") || Build.MODEL.equalsIgnoreCase("M032");
    }

    public static boolean isNetworkAvailable(Context context)
    {
        context = (ConnectivityManager)context.getSystemService("connectivity");
        if (context == null) goto _L2; else goto _L1
_L1:
        context = context.getAllNetworkInfo();
        if (context == null) goto _L2; else goto _L3
_L3:
        int i = 0;
_L6:
        if (i < context.length) goto _L4; else goto _L2
_L2:
        return false;
_L4:
        if (context[i].getState() == android.net.NetworkInfo.State.CONNECTED)
        {
            return true;
        }
        i++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static boolean isNetworkConnected(Context context)
    {
        return ((ConnectivityManager)getSystemService(context, "connectivity")).getActiveNetworkInfo() != null;
    }

    public static int isNewVersionPower(Context context)
    {
        int i = 0;
        context = context.getPackageManager();
        int j;
        boolean flag;
        try
        {
            j = context.getPackageInfo("com.qihoo360.mobilesafe.opti.powerctl", 0).versionCode;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return -1;
        }
        if (j <= 5) goto _L2; else goto _L1
_L1:
        flag = PermissionUtil.isPkgMySignature(context, "com.qihoo360.mobilesafe.opti.powerctl");
        if (!flag) goto _L2; else goto _L3
_L3:
        i = 1;
_L5:
        return i;
_L2:
        if (j < 0 || j > 5)
        {
            return -1;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static boolean isNumber(char c)
    {
        return c >= '0' && c <= '9';
    }

    public static boolean isStorageDeviceEnable(Context context)
    {
        context = getInternalAndExternalSDPath(context);
        return context != null && context.size() > 0;
    }

    public static boolean isValidDomainChar(char c)
    {
        while (isLetter(c) || isNumber(c) || c == '-' || c == '_') 
        {
            return true;
        }
        return false;
    }

    public static void log(String s, String s1)
    {
    }

    public static void log(String s, String s1, int i)
    {
    }

    public static void log(String s, String s1, Throwable throwable)
    {
    }

    public static transient void log(String s, String s1, Object aobj[])
    {
    }

    public static boolean makeSurePathExists(File file)
    {
        if (file != null)
        {
            if (file.isDirectory())
            {
                return true;
            }
            if (!file.exists())
            {
                return file.mkdirs();
            }
        }
        return false;
    }

    public static boolean makeSurePathExists(String s)
    {
        return makeSurePathExists(new File(s));
    }

    public static List openConfigDescrypt(Context context, String s, String s1)
    {
        s = new FileInputStream(s);
        boolean flag;
        context = openConfigFile(new InputStreamReader(s));
        flag = context.isEmpty();
label0:
        {
            {
                if (!flag)
                {
                    break label0;
                }
                s1 = context;
                if (s != null)
                {
                    ArrayList arraylist;
                    boolean flag1;
                    try
                    {
                        s.close();
                    }
                    // Misplaced declaration of an exception variable
                    catch (String s)
                    {
                        return context;
                    }
                    s1 = context;
                }
            }
            return s1;
        }
        arraylist = new ArrayList(context.size());
        context = context.iterator();
_L1:
        flag1 = context.hasNext();
        if (!flag1)
        {
            if (s != null)
            {
                try
                {
                    s.close();
                }
                // Misplaced declaration of an exception variable
                catch (Context context) { }
            }
            return arraylist;
        }
        arraylist.add(DES_decrypt((String)context.next(), s1));
          goto _L1
        context;
        context = s;
_L5:
        s = new ArrayList(0);
        s1 = s;
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return s;
            }
            return s;
        } else
        {
            break MISSING_BLOCK_LABEL_46;
        }
        context;
        s = null;
_L3:
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
        throw context;
        context;
        continue; /* Loop/switch isn't completed */
        s1;
        s = context;
        context = s1;
        if (true) goto _L3; else goto _L2
_L2:
        context;
        context = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static List openConfigFile(Context context, String s)
    {
        InputStream inputstream = openLatestInputFile(context, s);
        if (inputstream != null) goto _L2; else goto _L1
_L1:
        context = new ArrayList(0);
_L3:
        return context;
_L2:
        s = openConfigFile(((Reader) (new InputStreamReader(inputstream))));
        context = s;
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return s;
            }
            return s;
        }
          goto _L3
        context;
        s = new ArrayList(0);
        context = s;
        if (inputstream == null) goto _L3; else goto _L4
_L4:
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return s;
        }
        return s;
        context;
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
        throw context;
    }

    public static List openConfigFile(Reader reader)
    {
        ArrayList arraylist = new ArrayList();
        Object obj1 = new BufferedReader(reader, 1024);
_L2:
        Object obj = obj1;
        String s = ((BufferedReader) (obj1)).readLine();
        obj = obj1;
        boolean flag = TextUtils.isEmpty(s);
        if (flag)
        {
            Exception exception;
            try
            {
                ((BufferedReader) (obj1)).close();
            }
            catch (Exception exception1) { }
            try
            {
                reader.close();
            }
            // Misplaced declaration of an exception variable
            catch (Reader reader) { }
            if (arraylist.size() > 0)
            {
                return arraylist;
            } else
            {
                return new ArrayList(0);
            }
        }
        obj = obj1;
        if (s.startsWith("#")) goto _L2; else goto _L1
_L1:
        obj = obj1;
        arraylist.add(s.trim());
          goto _L2
        obj;
_L6:
        obj = obj1;
        arraylist = new ArrayList(0);
        try
        {
            ((BufferedReader) (obj1)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception) { }
        try
        {
            reader.close();
        }
        // Misplaced declaration of an exception variable
        catch (Reader reader)
        {
            return arraylist;
        }
        return arraylist;
        obj1;
        obj = null;
_L4:
        try
        {
            ((BufferedReader) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception) { }
        try
        {
            reader.close();
        }
        // Misplaced declaration of an exception variable
        catch (Reader reader) { }
        throw obj1;
        obj1;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception2;
        exception2;
        obj1 = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static List openConfigFileDescrypt(Context context, String s, String s1)
    {
        s = openConfigFile(context, s);
        if (s.isEmpty())
        {
            return s;
        }
        context = new ArrayList(s.size());
        s = s.iterator();
        do
        {
            if (!s.hasNext())
            {
                return context;
            }
            context.add(DES_decrypt((String)s.next(), s1));
        } while (true);
    }

    public static void openDeviceAdminForPackage(Activity activity, String s)
    {
        s = a(activity.getApplicationContext(), s);
        if (s == null || s.size() <= 0) goto _L2; else goto _L1
_L1:
        s = s.iterator();
_L5:
        if (s.hasNext()) goto _L3; else goto _L2
_L2:
        return;
_L3:
        a(activity, (ComponentName)s.next());
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static InputStream openLatestInputFile(Context context, String s)
    {
        Object obj1 = null;
        Object obj = obj1;
        if (getFileTimestamp(context, s) >= getBundleTimestamp(context, s))
        {
            try
            {
                obj = context.openFileInput(s);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                obj = obj1;
            }
        }
        obj1 = obj;
        if (obj == null)
        {
            try
            {
                obj1 = context.getAssets().open(s);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return ((InputStream) (obj));
            }
        }
        return ((InputStream) (obj1));
    }

    public static InputStream openLatestInputFile(Context context, String s, String s1)
    {
        Object obj;
        Object obj1;
        if (getFileTimestamp(context, s, s1) >= getBundleTimestamp(context, s, s1))
        {
            try
            {
                obj = new FileInputStream(new File(new File(context.getFilesDir(), s), s1));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                obj = null;
            }
        } else
        {
            obj = null;
        }
        obj1 = obj;
        if (obj == null)
        {
            try
            {
                obj1 = context.getAssets().open((new StringBuilder(String.valueOf(s))).append(File.separator).append(s1).toString());
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return ((InputStream) (obj));
            }
        }
        return ((InputStream) (obj1));
    }

    public static List parseConfigFile(Context context, String s)
    {
        return openConfigFile(context, s);
    }

    public static List parseConfigFile(Reader reader)
    {
        return openConfigFile(reader);
    }

    public static List parseDesConfigFile(Context context, String s)
    {
        context = context.getFileStreamPath(s);
        if (!context.exists())
        {
            return new ArrayList(0);
        }
        context = parseDesConfigFileReader(new FileReader(context));
        return context;
        context;
        context = new ArrayList(0);
        return context;
        context;
        throw context;
    }

    public static List parseDesConfigFileReader(Reader reader)
    {
        ArrayList arraylist = new ArrayList();
        Object obj = new BufferedReader(reader, 1024);
_L2:
        reader = ((Reader) (obj));
        String s = ((BufferedReader) (obj)).readLine();
        reader = ((Reader) (obj));
        boolean flag = TextUtils.isEmpty(s);
        if (flag)
        {
            try
            {
                ((BufferedReader) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Reader reader) { }
            if (arraylist.size() > 0)
            {
                return arraylist;
            } else
            {
                return new ArrayList(0);
            }
        }
        reader = ((Reader) (obj));
        s = DES_decrypt(s, NativeManager.a);
        reader = ((Reader) (obj));
        if (s.startsWith("#")) goto _L2; else goto _L1
_L1:
        reader = ((Reader) (obj));
        arraylist.add(s.trim());
          goto _L2
        reader;
_L6:
        reader = ((Reader) (obj));
        arraylist = new ArrayList(0);
        try
        {
            ((BufferedReader) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Reader reader)
        {
            return arraylist;
        }
        return arraylist;
        obj;
        reader = null;
_L4:
        try
        {
            reader.close();
        }
        // Misplaced declaration of an exception variable
        catch (Reader reader) { }
        throw obj;
        obj;
        if (true) goto _L4; else goto _L3
_L3:
        reader;
        obj = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static List parseEncryptAssetFile(Context context, String s)
    {
        Object obj = null;
        try
        {
            s = parseEncryptInputStream(context.getAssets().open(s), s);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        context = obj;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        context = openConfigFile(new InputStreamReader(s));
        return context;
    }

    public static InputStream parseEncryptInputStream(InputStream inputstream, String s)
    {
        if (!NativeUtils.a())
        {
            return null;
        }
        ByteArrayOutputStream bytearrayoutputstream;
        byte abyte0[];
        s = NativeUtils.getEncryptByte(NativeUtils.getEncryptString(s).getBytes("UTF-8"));
        bytearrayoutputstream = new ByteArrayOutputStream();
        abyte0 = new byte[1024];
        int i = 0;
_L2:
        int k = inputstream.read(abyte0);
        int j;
        if (k >= 0)
        {
            break MISSING_BLOCK_LABEL_128;
        }
        byte byte0;
        try
        {
            inputstream = new ByteArrayInputStream(bytearrayoutputstream.toByteArray());
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            inputstream = null;
        }
        break MISSING_BLOCK_LABEL_126;
        for (; j < k; j = 0)
        {
            break MISSING_BLOCK_LABEL_84;
        }

        bytearrayoutputstream.write(abyte0, 0, k);
        continue; /* Loop/switch isn't completed */
        byte0 = abyte0[j];
        abyte0[j] = (byte)(s[i % s.length] ^ byte0);
        j++;
        i++;
        break MISSING_BLOCK_LABEL_66;
        return inputstream;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static List parseEncryptLatestFile(Context context, String s)
    {
        Object obj = null;
        try
        {
            s = parseEncryptInputStream(openLatestInputFile(context, s), s);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        context = obj;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        context = openConfigFile(new InputStreamReader(s));
        return context;
    }

    public static String pathAppend(String s, String s1)
    {
        StringBuffer stringbuffer = new StringBuffer(s);
        if (!s.endsWith("/"))
        {
            stringbuffer.append('/');
        }
        stringbuffer.append(s1);
        return stringbuffer.toString();
    }

    public static char quanjiao2Banjiao(char c)
    {
        char c1;
label0:
        {
            if ((c < '\uFF10' || c > '\uFF19') && (c < '\uFF21' || c > '\uFF3A'))
            {
                c1 = c;
                if (c < '\uFF41')
                {
                    break label0;
                }
                c1 = c;
                if (c > '\uFF5A')
                {
                    break label0;
                }
            }
            c1 = (char)(c - 65248);
        }
        return c1;
    }

    public static String quanjiao2banjiao(String s)
    {
        StringBuffer stringbuffer;
        int i;
        i = 0;
        stringbuffer = new StringBuffer();
_L2:
        if (i >= s.length())
        {
            return stringbuffer.toString();
        }
        String s1;
        byte abyte0[];
        s1 = s.substring(i, i + 1);
        abyte0 = s1.getBytes("unicode");
        if (abyte0[3] == -1)
        {
            abyte0[2] = (byte)(abyte0[2] + 32);
            abyte0[3] = 0;
            try
            {
                stringbuffer.append(new String(abyte0, "unicode"));
            }
            catch (UnsupportedEncodingException unsupportedencodingexception) { }
            break MISSING_BLOCK_LABEL_94;
        }
        stringbuffer.append(s1);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static void removeActiveAdmin(f f, Context context, String s)
    {
        Object obj = a(context, s);
        if (obj == null || ((List) (obj)).size() <= 0) goto _L2; else goto _L1
_L1:
        obj = ((List) (obj)).iterator();
_L5:
        if (((Iterator) (obj)).hasNext()) goto _L3; else goto _L2
_L2:
        return;
_L3:
        ComponentName componentname = (ComponentName)((Iterator) (obj)).next();
        if (componentname.getPackageName().equals(s))
        {
            ArrayList arraylist = new ArrayList(5);
            arraylist.add("removeActiveAdmin");
            arraylist.add(s);
            arraylist.add(componentname.getClassName());
            doJarCmd(f, context, arraylist);
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static boolean renameConfigFile(Context context, String s, String s1)
    {
        s = context.getFileStreamPath(s);
        if (s.exists())
        {
            context = context.getFileStreamPath(s1);
            if (!context.exists())
            {
                return s.renameTo(context);
            }
        }
        return true;
    }

    public static void resetFile(Context context, String s, boolean flag)
    {
        extractAssetFile(context, s, context.getFileStreamPath(s));
        if (flag)
        {
            setFileTimestamp(context, s, getBundleTimestamp(context, s));
        }
    }

    public static boolean saveDesUserConfigFile(Context context, String s, List list)
    {
        context = context.getFileStreamPath(s);
        if (list == null)
        {
            return true;
        }
        s = null;
        context = new BufferedWriter(new FileWriter(context), 512);
        s = list.iterator();
_L1:
        boolean flag = s.hasNext();
        if (!flag)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
            return true;
        }
        context.write(DES_encrypt((String)s.next(), NativeManager.a));
        context.newLine();
          goto _L1
        s;
_L5:
        try
        {
            context.close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        return false;
        s;
        context = null;
_L3:
        try
        {
            context.close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        throw s;
        s;
        if (true) goto _L3; else goto _L2
_L2:
        context;
        context = s;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static boolean saveUserConfigFile(Context context, String s, List list)
    {
        context = context.getFileStreamPath(s);
        if (list == null)
        {
            return true;
        }
        s = null;
        context = new BufferedWriter(new FileWriter(context), 512);
        s = list.iterator();
_L1:
        boolean flag = s.hasNext();
        if (!flag)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
            return true;
        }
        context.write((String)s.next());
        context.newLine();
          goto _L1
        s;
_L5:
        try
        {
            context.close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        return false;
        s;
        context = null;
_L3:
        try
        {
            context.close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        throw s;
        s;
        if (true) goto _L3; else goto _L2
_L2:
        context;
        context = s;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static void setFileTimestamp(Context context, String s, long l)
    {
        String s1;
        Object obj1;
        s1 = null;
        obj1 = null;
        context = context.openFileOutput((new StringBuilder(String.valueOf(s))).append(".timestamp").toString(), 0);
        s = new DataOutputStream(context);
        s.writeBytes(String.valueOf(l));
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return;
            }
        }
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        context.close();
_L2:
        return;
        context;
        context = null;
        s = obj1;
_L5:
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return;
            }
        }
        if (s == null) goto _L2; else goto _L1
_L1:
        s.close();
        return;
        s;
        context = null;
_L4:
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        s1.close();
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
        throw s;
        s;
        continue; /* Loop/switch isn't completed */
        Exception exception1;
        exception1;
        s1 = s;
        s = exception1;
        if (true) goto _L4; else goto _L3
_L3:
        s;
        Object obj = null;
        s = context;
        context = obj;
          goto _L5
        Exception exception;
        exception;
        Context context1 = context;
        context = s;
        s = context1;
          goto _L5
    }

    public static void setListViewHeightBasedOnChildren(ListView listview)
    {
        ListAdapter listadapter = listview.getAdapter();
        if (listadapter == null)
        {
            return;
        }
        int i = 0;
        int j = 0;
        do
        {
            if (i >= listadapter.getCount())
            {
                android.view.ViewGroup.LayoutParams layoutparams = listview.getLayoutParams();
                layoutparams.height = listview.getDividerHeight() * (listadapter.getCount() - 1) + j;
                listview.setLayoutParams(layoutparams);
                return;
            }
            View view = listadapter.getView(i, null, listview);
            view.measure(0, 0);
            j += view.getMeasuredHeight();
            i++;
        } while (true);
    }

    public static void showDialog(Activity activity, int i)
    {
        if (activity == null)
        {
            throw new IllegalArgumentException();
        }
        if (activity.isFinishing())
        {
            return;
        } else
        {
            activity.showDialog(i);
            return;
        }
    }

    public static void showDialog(Dialog dialog)
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
        if (dialog == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (dialog.isShowing()) goto _L1; else goto _L4
_L4:
        dialog.show();
        return;
    }

    public static void showPackageDetial(Context context, String s)
    {
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            s = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse((new StringBuilder("package:")).append(s).toString()));
            s.addFlags(0x50800000);
            context.startActivity(s);
            return;
        }
        try
        {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.addFlags(0x50800000);
            intent.setClassName("com.android.settings", "com.android.settings.InstalledAppDetails");
            intent.putExtra("com.android.settings.ApplicationPkgName", s);
            intent.putExtra("pkg", s);
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

    public static double str2Double(String s, double d)
    {
        double d1 = d;
        try
        {
            if (!TextUtils.isEmpty(s))
            {
                d1 = Double.parseDouble(s.trim());
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return d;
        }
        return d1;
    }

    public static float str2Float(String s, float f)
    {
        float f1 = f;
        try
        {
            if (!TextUtils.isEmpty(s))
            {
                f1 = Float.parseFloat(s.trim());
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return f;
        }
        return f1;
    }

    public static int str2Int(String s, int i)
    {
        int j = i;
        try
        {
            if (!TextUtils.isEmpty(s))
            {
                j = Integer.parseInt(s.trim());
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return i;
        }
        return j;
    }

    public static long str2Long(String s, long l)
    {
        long l1 = l;
        try
        {
            if (!TextUtils.isEmpty(s))
            {
                l1 = Long.parseLong(s.trim());
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return l;
        }
        return l1;
    }

    public static void unbindService(String s, Context context, ServiceConnection serviceconnection)
    {
        try
        {
            context.getApplicationContext().unbindService(serviceconnection);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
    }

    public static byte[] urlEncrypt(byte abyte0[])
    {
        return urlEncrypt(abyte0, NativeManager.b);
    }

    public static byte[] urlEncrypt(byte abyte0[], String s)
    {
        try
        {
            SecureRandom securerandom = new SecureRandom();
            s = new DESKeySpec(s.getBytes());
            s = SecretKeyFactory.getInstance("DES").generateSecret(s);
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(1, s, securerandom);
            abyte0 = cipher.doFinal(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            return null;
        }
        return abyte0;
    }

    public static boolean validateEmail(String s)
    {
        boolean flag = false;
        if (s.length() <= 50)
        {
            flag = Pattern.compile("^[\\w_-]+(\\.[\\w_-]+)*@[\\w_-]+(\\.\\w+)*(\\.[A-Za-z]{2,})$").matcher(s).matches();
        }
        return flag;
    }

    public static boolean wildcardMatches(String s, String s1)
    {
_L2:
        return false;
        if (s == null || s.length() == 0 || s1 == null || s1.length() == 0) goto _L2; else goto _L1
_L1:
        String s2;
        String s3;
        s3 = s;
        s2 = s1;
        if (s.charAt(0) != '+')
        {
            break; /* Loop/switch isn't completed */
        }
        if (s1.charAt(0) != '+')
        {
            continue; /* Loop/switch isn't completed */
        }
        s3 = s.substring(1);
        s2 = s1.substring(1);
        break; /* Loop/switch isn't completed */
        if (true) goto _L2; else goto _L3
_L3:
        s = "^";
        int i = 0;
        do
        {
label0:
            {
                if (i >= s3.length())
                {
                    s = (new StringBuilder(String.valueOf(s))).append("$").toString();
                    char c;
                    boolean flag;
                    try
                    {
                        flag = Pattern.matches(s, s2);
                    }
                    // Misplaced declaration of an exception variable
                    catch (String s)
                    {
                        s.printStackTrace();
                        return false;
                    }
                    return flag;
                }
                c = s3.charAt(i);
                if (c != '*')
                {
                    s1 = s;
                    if (c != '?')
                    {
                        break label0;
                    }
                }
                s1 = (new StringBuilder(String.valueOf(s))).append(".").toString();
            }
            s = (new StringBuilder(String.valueOf(s1))).append(c).toString();
            i++;
        } while (true);
    }

    static 
    {
        mSizeFormat = NumberFormat.getInstance();
        mSizeFormat.setMaximumFractionDigits(2);
    }
}

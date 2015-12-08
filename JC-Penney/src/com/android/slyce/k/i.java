// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.k;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.android.slyce.k:
//            h, j, f, l

public class i
{

    private static final String a = com/android/slyce/k/i.getSimpleName();

    public i()
    {
    }

    public static int a(Bitmap bitmap, String s)
    {
        boolean flag1 = false;
        boolean flag = false;
        if (bitmap == null)
        {
            h.b("uploadFile", "Bitmap Does not exist");
            return 0;
        }
        Object obj = new ByteArrayOutputStream();
        bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 85, ((java.io.OutputStream) (obj)));
        bitmap = new ByteArrayInputStream(((ByteArrayOutputStream) (obj)).toByteArray());
        int k = ((flag) ? 1 : 0);
        int l = ((flag1) ? 1 : 0);
        byte abyte0[];
        int i1;
        int j1;
        try
        {
            obj = (HttpsURLConnection)(new URL(s)).openConnection();
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            h.b(a, (new StringBuilder()).append("Upload file to server error: ").append(bitmap.getMessage()).toString());
            return k;
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            h.b(a, (new StringBuilder()).append("Upload file to server Exception : ").append(bitmap.getMessage()).toString());
            return l;
        }
        k = ((flag) ? 1 : 0);
        l = ((flag1) ? 1 : 0);
        ((HttpsURLConnection) (obj)).setDoOutput(true);
        k = ((flag) ? 1 : 0);
        l = ((flag1) ? 1 : 0);
        ((HttpsURLConnection) (obj)).setUseCaches(false);
        k = ((flag) ? 1 : 0);
        l = ((flag1) ? 1 : 0);
        ((HttpsURLConnection) (obj)).setRequestMethod("PUT");
        k = ((flag) ? 1 : 0);
        l = ((flag1) ? 1 : 0);
        ((HttpsURLConnection) (obj)).setRequestProperty("Content-Type", "image/jpeg");
        k = ((flag) ? 1 : 0);
        l = ((flag1) ? 1 : 0);
        ((HttpsURLConnection) (obj)).setConnectTimeout(5000);
        k = ((flag) ? 1 : 0);
        l = ((flag1) ? 1 : 0);
        ((HttpsURLConnection) (obj)).setReadTimeout(5000);
        k = ((flag) ? 1 : 0);
        l = ((flag1) ? 1 : 0);
        s = new DataOutputStream(((HttpsURLConnection) (obj)).getOutputStream());
        k = ((flag) ? 1 : 0);
        l = ((flag1) ? 1 : 0);
        i1 = Math.min(bitmap.available(), 0x100000);
        k = ((flag) ? 1 : 0);
        l = ((flag1) ? 1 : 0);
        abyte0 = new byte[i1];
        k = ((flag) ? 1 : 0);
        l = ((flag1) ? 1 : 0);
        j1 = bitmap.read(abyte0, 0, i1);
        k = j1;
_L2:
        if (k <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        k = ((flag) ? 1 : 0);
        l = ((flag1) ? 1 : 0);
        s.write(abyte0, 0, i1);
        k = ((flag) ? 1 : 0);
        l = ((flag1) ? 1 : 0);
        i1 = Math.min(bitmap.available(), 0x100000);
        k = ((flag) ? 1 : 0);
        l = ((flag1) ? 1 : 0);
        j1 = bitmap.read(abyte0, 0, i1);
        k = j1;
        if (true) goto _L2; else goto _L1
_L1:
        k = ((flag) ? 1 : 0);
        l = ((flag1) ? 1 : 0);
        i1 = ((HttpsURLConnection) (obj)).getResponseCode();
        k = i1;
        l = i1;
        obj = ((HttpsURLConnection) (obj)).getResponseMessage();
        k = i1;
        l = i1;
        h.a(a, (new StringBuilder()).append("uploadFile HTTP Response is : ").append(((String) (obj))).append(": ").append(i1).toString());
        if (i1 != 200)
        {
            break MISSING_BLOCK_LABEL_392;
        }
        k = i1;
        l = i1;
        h.a(a, "uploadFile File Upload Complete.");
        k = i1;
        l = i1;
        bitmap.close();
        k = i1;
        l = i1;
        s.flush();
        k = i1;
        l = i1;
        s.close();
        return i1;
    }

    public static Bitmap a(Bitmap bitmap)
    {
        float f1 = Math.min((float)500 / (float)bitmap.getWidth(), (float)500 / (float)bitmap.getHeight());
        return Bitmap.createScaledBitmap(bitmap, Math.round((float)bitmap.getWidth() * f1), Math.round(f1 * (float)bitmap.getHeight()), true);
    }

    public static String a()
    {
        return android.os.Build.VERSION.RELEASE;
    }

    public static String a(Context context)
    {
        PackageManager packagemanager = context.getPackageManager();
        Object obj = null;
        try
        {
            context = packagemanager.getApplicationInfo(context.getPackageName(), 0);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context = obj;
        }
        if (context != null)
        {
            return (String)packagemanager.getApplicationLabel(context);
        } else
        {
            return "App Name Not Found";
        }
    }

    public static String a(String s)
    {
        s = Base64.decode(s, 0);
        try
        {
            s = new String(s, "UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            h.a(a, "decodeBase64: UnsupportedEncodingException");
            return null;
        }
        return s;
    }

    public static String a(String s, String s1)
    {
        try
        {
            s = (new JSONObject(s1)).optString(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            h.a(a, "Utils.extractJsonField", s);
            return null;
        }
        return s;
    }

    public static String a(HttpURLConnection httpurlconnection)
    {
        String s;
        Object obj1;
        s = null;
        obj1 = new StringBuffer();
        Object obj = new BufferedInputStream(httpurlconnection.getInputStream());
        httpurlconnection = ((HttpURLConnection) (obj));
        BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(((java.io.InputStream) (obj))));
_L2:
        httpurlconnection = ((HttpURLConnection) (obj));
        String s1 = bufferedreader.readLine();
        if (s1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        httpurlconnection = ((HttpURLConnection) (obj));
        ((StringBuffer) (obj1)).append(s1);
        if (true) goto _L2; else goto _L1
        httpurlconnection;
_L6:
        httpurlconnection = ((HttpURLConnection) (obj));
        h.a(a, "Error reading InputStream");
        httpurlconnection = s;
        if (obj != null)
        {
            try
            {
                ((BufferedInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (HttpURLConnection httpurlconnection)
            {
                h.a(a, "Error closing InputStream");
                return null;
            }
            httpurlconnection = s;
        }
        return httpurlconnection;
_L1:
        httpurlconnection = ((HttpURLConnection) (obj));
        obj1 = ((StringBuffer) (obj1)).toString();
        s = ((String) (obj1));
        httpurlconnection = s;
        if (obj != null)
        {
            try
            {
                ((BufferedInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (HttpURLConnection httpurlconnection)
            {
                h.a(a, "Error closing InputStream");
                return s;
            }
            return s;
        } else
        {
            break MISSING_BLOCK_LABEL_91;
        }
        obj;
        httpurlconnection = null;
_L4:
        if (httpurlconnection != null)
        {
            try
            {
                httpurlconnection.close();
            }
            // Misplaced declaration of an exception variable
            catch (HttpURLConnection httpurlconnection)
            {
                h.a(a, "Error closing InputStream");
            }
        }
        throw obj;
        obj;
        if (true) goto _L4; else goto _L3
_L3:
        httpurlconnection;
        obj = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static void a(Context context, l l)
    {
        (new Thread(new j(context, l))).start();
    }

    public static String b()
    {
        return (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(Long.valueOf(System.currentTimeMillis()));
    }

    public static String b(Context context)
    {
        PackageManager packagemanager = context.getPackageManager();
        Object obj = null;
        try
        {
            context = packagemanager.getPackageInfo(context.getPackageName(), 0);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context = obj;
        }
        return ((PackageInfo) (context)).versionName;
    }

    public static String c()
    {
        String s1 = f.a(Build.DEVICE);
        String s = s1;
        if (TextUtils.isEmpty(s1))
        {
            s = "No Device Type";
        }
        return s;
    }

    public static String c(Context context)
    {
        return android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
    }

    static String d()
    {
        return a;
    }

}

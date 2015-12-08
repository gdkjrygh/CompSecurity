// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.common;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.http.AndroidHttpClient;
import android.os.Environment;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.TimeZone;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.HttpGet;

public class Utils
{

    private static volatile Utils _instance = null;
    private float m_density;

    public Utils()
    {
        m_density = 0.0F;
    }

    public static boolean ConvertToBoolean(String s, boolean flag)
    {
        boolean flag1;
        try
        {
            flag1 = Boolean.valueOf(s).booleanValue();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            LogException(s);
            return flag;
        }
        return flag1;
    }

    public static Date ConvertToDate(String s)
    {
        Object obj;
        obj = null;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        if (s.length() > 0)
        {
            try
            {
                s = (new SimpleDateFormat("yyyy/MM/dd hh:mm a")).parse(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                LogException(s);
                s = obj;
            }
            return s;
        }
        return null;
    }

    public static Date ConvertToDate(String s, String s1)
    {
        Object obj;
        obj = null;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        if (s.length() > 0)
        {
            try
            {
                s = (new SimpleDateFormat(s1)).parse(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                LogException(s);
                s = obj;
            }
            return s;
        }
        return null;
    }

    public static Date ConvertToDateComarator(String s)
    {
        Object obj;
        obj = null;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        if (s.length() > 0)
        {
            try
            {
                s = (new SimpleDateFormat("yyyy/MM/dd")).parse(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                LogException(s);
                s = obj;
            }
            return s;
        }
        return null;
    }

    public static double ConvertToDouble(String s)
    {
        double d;
        try
        {
            d = Double.parseDouble(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            LogException(s);
            return 0.0D;
        }
        return d;
    }

    public static float ConvertToFloat(String s)
    {
        float f;
        try
        {
            f = Float.parseFloat(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            LogException(s);
            return 0.0F;
        }
        return f;
    }

    public static int ConvertToInt(String s)
    {
        int i;
        try
        {
            i = Integer.parseInt(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            LogException(s);
            return 0;
        }
        return i;
    }

    public static long ConvertToLong(String s)
    {
        long l;
        try
        {
            l = Long.parseLong(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            LogException(s);
            return 0L;
        }
        return l;
    }

    public static Utils Instance()
    {
        if (_instance != null) goto _L2; else goto _L1
_L1:
        com/hmobile/common/Utils;
        JVM INSTR monitorenter ;
        _instance = new Utils();
        com/hmobile/common/Utils;
        JVM INSTR monitorexit ;
_L2:
        return _instance;
        Exception exception;
        exception;
        com/hmobile/common/Utils;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static void LogException(Exception exception)
    {
        Log.d("HOLYBIBLE Exception", (new StringBuilder("HOLYBIBLE Exception -- > ")).append(exception.getMessage()).append("\n").append(exception).toString());
    }

    public static void LogInfo(String s)
    {
        Log.i("HOLYBIBLE", (new StringBuilder("HOLYBIBLE -- >")).append(s).toString());
    }

    public static boolean ParseBoolean(String s)
    {
        boolean flag;
        try
        {
            flag = Boolean.valueOf(s).booleanValue();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        return flag;
    }

    public static String ReadFromfile(String s, Context context)
    {
        Object obj2;
        Exception exception;
        Object obj3;
        StringBuilder stringbuilder = new StringBuilder();
        Object obj8 = null;
        Object obj7 = null;
        Object obj5 = null;
        Object obj4 = null;
        Object obj6 = null;
        exception = null;
        obj3 = null;
        Object obj = obj7;
        Object obj1 = obj6;
        Context context1 = obj5;
        obj2 = obj8;
        try
        {
            (new File((new StringBuilder()).append(Environment.getExternalStorageDirectory()).append("/").append(s).toString())).createNewFile();
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            s = ((String) (obj2));
            obj2 = obj3;
            context = obj4;
            continue; /* Loop/switch isn't completed */
        }
        finally { }
        obj = obj7;
        obj1 = obj6;
        context1 = obj5;
        obj2 = obj8;
        s = context.getResources().getAssets().open(s, 1);
        obj = s;
        obj1 = obj6;
        context1 = obj5;
        obj2 = s;
        context = new InputStreamReader(s);
        obj = new BufferedReader(context);
_L1:
        obj1 = ((BufferedReader) (obj)).readLine();
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_176;
        }
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        context.close();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_162;
        }
        s.close();
        if (obj != null)
        {
            try
            {
                ((BufferedReader) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.getMessage();
            }
        }
        return stringbuilder.toString();
        stringbuilder.append(((String) (obj1)));
          goto _L1
        exception;
        obj2 = obj;
_L5:
        obj = s;
        obj1 = obj2;
        context1 = context;
        exception.getMessage();
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_213;
        }
        context.close();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_221;
        }
        s.close();
        if (obj2 != null)
        {
            try
            {
                ((BufferedReader) (obj2)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.getMessage();
            }
        }
        break MISSING_BLOCK_LABEL_170;
_L3:
        if (context1 == null)
        {
            break MISSING_BLOCK_LABEL_254;
        }
        context1.close();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_262;
        }
        ((InputStream) (obj)).close();
        if (obj1 != null)
        {
            try
            {
                ((BufferedReader) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                context.getMessage();
            }
        }
        throw s;
        obj2;
        obj = s;
        obj1 = exception;
        context1 = context;
        s = ((String) (obj2));
        continue; /* Loop/switch isn't completed */
        obj2;
        obj1 = obj;
        obj = s;
        context1 = context;
        s = ((String) (obj2));
        if (true) goto _L3; else goto _L2
        exception;
        obj2 = obj3;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static String RenameFileToNewPath(String s)
    {
        Object obj = s.replace("/mnt/sdcard/", "").replace(".ck", "");
        File file = Environment.getExternalStorageDirectory();
        s = new File(file, s);
        obj = new File(file, ((String) (obj)));
        s.renameTo(((File) (obj)));
        return ((File) (obj)).toString();
    }

    public static void RenameFileToOldPath(String s)
    {
        String s1 = (new StringBuilder(String.valueOf(s))).append(".ck").toString();
        File file = Environment.getExternalStorageDirectory();
        (new File(file, s)).renameTo(new File(file, s1));
    }

    public static long adjustTimezoneOffset(long l)
    {
        return l + (long)TimeZone.getTimeZone("CET").getOffset((new Date()).getTime());
    }

    public static String convertStreamToString(InputStream inputstream)
    {
        StringBuilder stringbuilder;
        BufferedReader bufferedreader;
        bufferedreader = new BufferedReader(new InputStreamReader(inputstream));
        stringbuilder = new StringBuilder();
_L2:
        String s = bufferedreader.readLine();
label0:
        {
            {
                if (s != null)
                {
                    break label0;
                }
                Exception exception;
                IOException ioexception;
                try
                {
                    inputstream.close();
                }
                // Misplaced declaration of an exception variable
                catch (InputStream inputstream)
                {
                    inputstream.printStackTrace();
                }
            }
            return stringbuilder.toString();
        }
        stringbuilder.append((new StringBuilder(String.valueOf(s))).append("\n").toString());
        continue; /* Loop/switch isn't completed */
        ioexception;
        ioexception.printStackTrace();
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            inputstream.printStackTrace();
        }
        if (false)
        {
        } else
        {
            break MISSING_BLOCK_LABEL_37;
        }
        exception;
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            inputstream.printStackTrace();
        }
        throw exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static Bitmap downloadDrawableImage(String s)
    {
        AndroidHttpClient androidhttpclient;
        HttpGet httpget;
        androidhttpclient = AndroidHttpClient.newInstance("Android");
        httpget = new HttpGet(s);
        Object obj;
        int i;
        obj = androidhttpclient.execute(httpget);
        i = ((HttpResponse) (obj)).getStatusLine().getStatusCode();
        if (i == 200) goto _L2; else goto _L1
_L1:
        Log.w("HISTORY MAP ", (new StringBuilder("HISTORY : Error ")).append(i).append(" while retrieving bitmap from ").append(s).toString());
        if (androidhttpclient != null)
        {
            androidhttpclient.close();
        }
        s = null;
_L6:
        return s;
_L2:
        HttpEntity httpentity = ((HttpResponse) (obj)).getEntity();
        if (httpentity == null) goto _L4; else goto _L3
_L3:
        obj = null;
        InputStream inputstream = httpentity.getContent();
        obj = inputstream;
        Bitmap bitmap = BitmapFactory.decodeStream(inputstream);
        obj = bitmap;
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_135;
        }
        inputstream.close();
        httpentity.consumeContent();
        s = ((String) (obj));
        if (androidhttpclient == null) goto _L6; else goto _L5
_L5:
        androidhttpclient.close();
        return ((Bitmap) (obj));
        Exception exception1;
        exception1;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_165;
        }
        ((InputStream) (obj)).close();
        httpentity.consumeContent();
        throw exception1;
        Exception exception;
        exception;
        httpget.abort();
        exception.printStackTrace();
        Log.w("HISTORY MAP", (new StringBuilder("Error while retrieving bitmap from ")).append(s).toString(), exception);
        if (androidhttpclient != null)
        {
            androidhttpclient.close();
        }
_L8:
        return null;
        s;
        if (androidhttpclient != null)
        {
            androidhttpclient.close();
        }
        throw s;
_L4:
        if (androidhttpclient != null)
        {
            androidhttpclient.close();
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static String formatMin(int i)
    {
        return (new StringBuilder(String.valueOf(i))).append(" : ").append("00").toString();
    }

    public static String getIMEINO(Context context)
    {
        return ((TelephonyManager)context.getSystemService("phone")).getDeviceId();
    }

    public static int getRandomInt(int i)
    {
        return (new Random()).nextInt(i - 1) + 1;
    }

    public static String getUTCForCSharp(String s)
    {
        long l;
        try
        {
            l = adjustTimezoneOffset(Long.parseLong(s));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return "";
        }
        return String.valueOf(l * 10000L + 0x89f7ff5f7b58000L);
    }

    public static void setListViewHeightBasedOnChildren(ListView listview)
    {
        ListAdapter listadapter = listview.getAdapter();
        if (listadapter == null)
        {
            return;
        }
        int j = 0;
        int i = 0;
        do
        {
            if (i >= listadapter.getCount())
            {
                android.view.ViewGroup.LayoutParams layoutparams = listview.getLayoutParams();
                layoutparams.height = listview.getDividerHeight() * (listadapter.getCount() - 1) + j + (listadapter.getCount() - 1) * 20;
                listview.setLayoutParams(layoutparams);
                return;
            }
            View view = listadapter.getView(i, null, listview);
            if (view instanceof ViewGroup)
            {
                view.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-2, -2));
            }
            view.measure(0, 0);
            j += view.getMeasuredHeight();
            i++;
        } while (true);
    }

    public ArrayList getColorArrayForGraph(int i)
    {
        ArrayList arraylist = new ArrayList();
        int j = 0;
        do
        {
            if (j >= i)
            {
                return arraylist;
            }
            if (j % 2 == 0)
            {
                arraylist.add("#4863A0");
            } else
            {
                arraylist.add("#EE9A4D");
            }
            j++;
        } while (true);
    }

    public float getDensity()
    {
        return m_density;
    }

    public int getDipFromPixel(int i)
    {
        if (m_density <= 0.0F)
        {
            return i;
        } else
        {
            float f = m_density;
            return (int)((float)i * f);
        }
    }

    public String getFormatedDate(String s)
    {
        SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        try
        {
            s = simpledateformat.parse(s);
            s = (new SimpleDateFormat("dd MMM, yyyy hh:mm a")).format(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return "";
        }
        return s;
    }

    public String join(List list, String s)
    {
        Object obj;
        int i = 0;
        int j = s.length();
        obj = list.iterator();
        if (((Iterator) (obj)).hasNext())
        {
            i = 0 + (((CharSequence)((Iterator) (obj)).next()).length() + j);
        }
        obj = new StringBuilder(i);
        list = list.iterator();
        if (!list.hasNext()) goto _L2; else goto _L1
_L1:
        ((StringBuilder) (obj)).append((CharSequence)list.next());
_L5:
        if (list.hasNext()) goto _L3; else goto _L2
_L2:
        return ((StringBuilder) (obj)).toString();
_L3:
        ((StringBuilder) (obj)).append(s);
        ((StringBuilder) (obj)).append((CharSequence)list.next());
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void setDensity(float f)
    {
        m_density = f;
    }

}

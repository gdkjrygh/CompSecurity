// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.Display;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import com.microsoft.advertising.android.a.e;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

// Referenced classes of package com.microsoft.advertising.android:
//            ai, av, af, d

final class by
{
    public static final class a
    {

        public Object a;

        public a()
        {
            a = null;
        }
    }

    public static abstract class b
        implements android.view.View.OnClickListener, Runnable
    {

        public b()
        {
        }
    }

    public static abstract class c
        implements android.view.GestureDetector.OnGestureListener, android.view.View.OnTouchListener
    {

        private GestureDetector a;

        public boolean onDown(MotionEvent motionevent)
        {
            return true;
        }

        public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
        {
            return false;
        }

        public void onLongPress(MotionEvent motionevent)
        {
        }

        public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
        {
            return false;
        }

        public void onShowPress(MotionEvent motionevent)
        {
        }

        public boolean onTouch(View view, MotionEvent motionevent)
        {
            return a.onTouchEvent(motionevent);
        }

        public c(Context context)
        {
            a = null;
            a = new GestureDetector(context, this, new Handler(Looper.getMainLooper()));
        }
    }


    private static final SparseArray a;

    static int a(int i, int j)
    {
        int k;
        if (i < 0)
        {
            k = 0;
        } else
        {
            k = j;
            if (i <= j)
            {
                return i;
            }
        }
        return k;
    }

    static android.view.ViewGroup.LayoutParams a()
    {
        return new android.view.ViewGroup.LayoutParams(-1, -1);
    }

    private static android.view.ViewGroup.LayoutParams a(Context context, String s, ai ai1)
    {
        int i;
        byte byte0;
        byte byte1;
        byte0 = -2;
        byte1 = -2;
        i = byte0;
        s = (BitmapDrawable)b(context, s);
        int j;
        int k;
        j = byte0;
        k = byte1;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        i = byte0;
        float f = context.getResources().getDisplayMetrics().density;
        i = byte0;
        j = (int)((float)s.getBitmap().getWidth() * f);
        i = j;
        k = s.getBitmap().getHeight();
        k = (int)((float)k * f);
_L2:
        return new android.view.ViewGroup.LayoutParams(j, k);
        context;
        j = i;
        k = byte1;
        if (ai1 != null)
        {
            ai1.a(context, e.a);
            j = i;
            k = byte1;
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    static LinearLayout a(Context context, int i)
    {
        context = new LinearLayout(context);
        context.setLayoutParams(a());
        context.setOrientation(1);
        context.setPadding(0, 0, 0, 0);
        context.setBackgroundColor(i);
        context.setGravity(17);
        return context;
    }

    public static LinearLayout a(Context context, Button button)
    {
        context = new LinearLayout(context);
        context.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1));
        context.setGravity(5);
        context.addView(button);
        return context;
    }

    public static String a(Context context)
    {
        PackageManager packagemanager = context.getPackageManager();
        if (packagemanager == null)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        context = packagemanager.getPackageInfo(context.getPackageName(), 0);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        context = ((PackageInfo) (context)).versionName;
        return context;
        context;
        return "";
    }

    public static String a(Context context, String s)
    {
        com/microsoft/advertising/android/by;
        JVM INSTR monitorenter ;
        Exception exception = null;
        Object obj = new File(context.getFilesDir(), s);
        context = exception;
        if (((File) (obj)).exists()) goto _L2; else goto _L1
_L1:
        context = exception;
        s = UUID.randomUUID().toString();
        obj = new FileOutputStream(((File) (obj)));
        ((FileOutputStream) (obj)).write(s.getBytes());
        ((FileOutputStream) (obj)).close();
        context = s;
        ((FileOutputStream) (obj)).close();
        context = s;
_L4:
        s = context;
        if (TextUtils.isEmpty(context))
        {
            s = "9774d56d682e549c";
        }
        com/microsoft/advertising/android/by;
        JVM INSTR monitorexit ;
        return s;
        exception;
        obj = null;
_L5:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        context = s;
        ((FileOutputStream) (obj)).close();
        context = s;
        try
        {
            throw exception;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        finally
        {
            com/microsoft/advertising/android/by;
        }
        av.a("Utils", "error writing/reading id", s);
        if (true) goto _L4; else goto _L3
_L3:
        JVM INSTR monitorexit ;
        throw context;
_L2:
        context = exception;
        s = a(((File) (obj)));
        context = s;
          goto _L4
        exception;
          goto _L5
    }

    private static String a(File file)
        throws IOException
    {
        Object obj = null;
        file = new RandomAccessFile(file, "r");
        String s;
        byte abyte0[] = new byte[(int)file.length()];
        file.readFully(abyte0);
        file.close();
        s = new String(abyte0);
        file.close();
        return s;
        Exception exception;
        exception;
        file = obj;
_L2:
        if (file != null)
        {
            file.close();
        }
        throw exception;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static String a(String s)
    {
        int i = 0;
        Object obj;
        int j;
        try
        {
            obj = MessageDigest.getInstance("MD5");
            ((MessageDigest) (obj)).update(s.getBytes());
            s = ((MessageDigest) (obj)).digest();
            obj = new StringBuilder();
            j = s.length;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            av.c("Utils.md5", s.getMessage());
            return null;
        }
        if (i < j)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        return ((StringBuilder) (obj)).toString();
        ((StringBuilder) (obj)).append(String.format("%02x", new Object[] {
            Byte.valueOf(s[i])
        }));
        i++;
        if (false)
        {
        } else
        {
            break MISSING_BLOCK_LABEL_32;
        }
    }

    static boolean a(Context context, ai ai1)
    {
        if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0)
        {
            ai1.b("Permission ACCESS_NETWORK_STATE has NOT been granted", e.d);
            return true;
        }
        boolean flag;
        try
        {
            context = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            av.a("AdController", "hasInternet() exception", context);
            return true;
        }
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        flag = context.isConnected();
        if (flag)
        {
            return true;
        }
        return false;
    }

    public static boolean a(View view, ai ai1, Point apoint[], Point apoint1[], Rect rect, float f, a a1)
    {
        a a2;
        a2 = a1;
        if (a1 == null)
        {
            a2 = new a();
        }
        boolean flag;
        if (f < 0.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!af.b(flag)) goto _L2; else goto _L1
_L1:
        f = 0.0F;
_L4:
        if (!view.isShown())
        {
            a2.a = "! isShown()";
            return false;
        }
        break; /* Loop/switch isn't completed */
_L2:
        boolean flag1;
        if (f > 100F)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (af.b(flag1))
        {
            f = 100F;
        }
        if (true) goto _L4; else goto _L3
_L3:
        int i;
        int k;
        if (view.getParent() == null)
        {
            a2.a = "getParent() == null";
            return false;
        }
        a1 = ((WindowManager)view.getContext().getApplicationContext().getSystemService("window")).getDefaultDisplay();
        i = 0;
        k = 0;
        int j = a1.getWidth();
        i = j;
        int l = a1.getHeight();
        k = l;
        i = j;
        j = k;
_L6:
        if (i <= 0 || j <= 0)
        {
            if (ai1 != null)
            {
                ai1.c("unable to get screen size", e.a);
            }
            a2.a = "unable to get screen size";
            return true;
        }
        a1 = new int[2];
        view.getLocationOnScreen(a1);
        ai1 = rect;
        if (rect == null)
        {
            ai1 = new Rect();
        }
        rect = ((Activity)view.getContext()).getWindow();
        rect.getDecorView().getWindowVisibleDisplayFrame(ai1);
        k = ((Rect) (ai1)).top;
        int i1 = rect.findViewById(0x1020002).getTop() - k;
        (new StringBuilder("statusBarHeight ")).append(k).append(" titlebarHeight ").append(i1);
        av.b("Utils");
        k = i1 + k;
        (new StringBuilder("X ")).append(a1[0]).append(" and Y ").append(a1[1]);
        av.b("Utils");
        if (a1[0] + view.getWidth() < 0)
        {
            return false;
        }
        if (a1[1] + view.getHeight() < 0)
        {
            return false;
        }
        if (a1[0] > i)
        {
            return false;
        }
        if (a1[1] > j)
        {
            return false;
        }
        if (apoint != null && apoint1 != null)
        {
            apoint[0].x = 0;
            apoint[0].y = k;
            apoint[1].x = i;
            apoint[1].y = j;
            apoint1[0].x = a1[0];
            apoint1[0].y = a1[1];
            apoint1[1].x = a1[0] + view.getWidth();
            apoint1[1].y = a1[1] + view.getHeight();
        } else
        {
            apoint = new Point[2];
            apoint[0] = new Point(0, k);
            apoint[1] = new Point(i, j);
            apoint1 = new Point[2];
            apoint1[0] = new Point(a1[0], a1[1]);
            apoint1[1] = new Point(a1[0] + view.getWidth(), a1[1] + view.getHeight());
        }
        ai1 = new Point(Math.max(apoint[0].x, apoint1[0].x), Math.max(apoint[0].y, apoint1[0].y));
        apoint = new Point(Math.min(apoint[1].x, apoint1[1].x), Math.min(apoint[1].y, apoint1[1].y));
        i = ((Point) (apoint)).x - ((Point) (ai1)).x;
        j = ((Point) (apoint)).y - ((Point) (ai1)).y;
        if (i > 0 && j > 0)
        {
            i *= j;
        } else
        {
            i = 0;
        }
        j = (int)((float)(view.getWidth() * view.getHeight()) * f);
        a2.a = "area on screen calculation";
        return i >= j;
        a1;
        j = k;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static boolean a(View view, Point apoint[], Point apoint1[], Rect rect, d d1)
    {
        if (!af.a(new Object[] {
    d1
}))
        {
            return false;
        } else
        {
            return a(view, null, apoint, apoint1, rect, d1.d(), null);
        }
    }

    static byte[] a(InputStream inputstream)
    {
        if (inputstream == null)
        {
            return null;
        }
        byte abyte0[];
        byte abyte1[];
        abyte0 = new ByteArrayOutputStream();
        abyte1 = new byte[1024];
_L1:
        int i = inputstream.read(abyte1, 0, 1024);
        if (i != -1)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        abyte0.flush();
        abyte0 = abyte0.toByteArray();
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            return abyte0;
        }
        return abyte0;
        abyte0.write(abyte1, 0, i);
          goto _L1
        Object obj;
        obj;
        av.c("Utils", (new StringBuilder("Failed to read from InputStream")).append(((IOException) (obj)).toString()).toString());
        obj = new byte[0];
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            return ((byte []) (obj));
        }
        return ((byte []) (obj));
        obj;
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream) { }
        throw obj;
    }

    public static Drawable b(Context context, String s)
    {
        int i = context.getResources().getDisplayMetrics().densityDpi;
        int j = context.getResources().getConfiguration().screenLayout;
        SparseArray sparsearray = (SparseArray)a.get(j & 0xf);
        String s1 = "normal/";
        if (sparsearray != null)
        {
            String s2 = (String)sparsearray.get(i);
            s1 = s2;
            if (s2 == null)
            {
                s1 = (String)sparsearray.get(-1);
            }
        }
        s = (new StringBuilder("MsAdsSDK/images/")).append(s1).append(s).toString();
        try
        {
            context = Drawable.createFromStream(context.getAssets().open(s), null);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            av.a("Utils", (new StringBuilder("Unable to access drawable file ")).append(s).toString(), context);
            return null;
        }
        return context;
    }

    public static Button b(Context context, ai ai1)
    {
        Button button = new Button(context);
        StateListDrawable statelistdrawable = new StateListDrawable();
        Drawable drawable = b(context, "b_close.png");
        statelistdrawable.addState(new int[] {
            0xfefeff59, 0x101009e
        }, drawable);
        drawable = b(context, "b_close.png");
        statelistdrawable.addState(new int[] {
            0x10100a7, 0x101009e
        }, drawable);
        drawable = b(context, "b_close.png");
        statelistdrawable.addState(new int[] {
            0xfefeff62
        }, drawable);
        button.setBackgroundDrawable(statelistdrawable);
        button.setLayoutParams(a(context, "b_close.png", ai1));
        return button;
    }

    public static LinearLayout b(Context context, Button button)
    {
        context = new LinearLayout(context);
        context.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
        context.setGravity(5);
        context.addView(button);
        return context;
    }

    static String b(InputStream inputstream)
    {
        StringBuilder stringbuilder = new StringBuilder();
        inputstream = new BufferedReader(new InputStreamReader(inputstream));
_L1:
        String s = inputstream.readLine();
        if (s == null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream)
            {
                av.c("Utils", (new StringBuilder("Failed to read from InputStream")).append(inputstream.toString()).toString());
            }
            return stringbuilder.toString();
        }
        stringbuilder.append(s);
          goto _L1
    }

    public static boolean b(Context context)
    {
        return ((PowerManager)context.getSystemService("power")).isScreenOn();
    }

    public static boolean b(String s)
    {
        return !TextUtils.isEmpty(s) && s.matches("-?\\d+(\\.\\d+)?");
    }

    public static String c(String s)
    {
        String s1 = Uri.parse(s).getScheme();
        return s.replace(s1, s1.toLowerCase());
    }

    public static boolean c(Context context)
    {
        return ((KeyguardManager)context.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
    }

    static 
    {
        a = new SparseArray(4);
        SparseArray sparsearray = new SparseArray(4);
        sparsearray.put(160, "large/");
        sparsearray.put(120, "large/");
        sparsearray.put(-1, "xlarge/");
        a.put(4, sparsearray);
        sparsearray = new SparseArray(4);
        sparsearray.put(160, "normal/");
        sparsearray.put(120, "normal/");
        sparsearray.put(-1, "large/");
        a.put(3, sparsearray);
        sparsearray = new SparseArray(4);
        sparsearray.put(160, "small/");
        sparsearray.put(120, "small/");
        sparsearray.put(-1, "normal/");
        a.put(2, sparsearray);
        sparsearray = new SparseArray(4);
        sparsearray.put(-1, "small/");
        a.put(1, sparsearray);
    }
}

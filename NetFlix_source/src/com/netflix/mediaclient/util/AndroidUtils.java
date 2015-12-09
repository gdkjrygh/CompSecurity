// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Debug;
import android.os.Environment;
import android.os.StatFs;
import android.os.StrictMode;
import android.text.format.Formatter;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.javabridge.transport.NativeTransport;
import com.netflix.mediaclient.media.PlayerType;
import com.netflix.mediaclient.repository.SecurityRepository;
import com.netflix.mediaclient.service.configuration.PlayerTypeFactory;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.netflix.mediaclient.util:
//            AndroidManifestUtils

public final class AndroidUtils
{
    private static class InputStreamHandler extends Thread
    {

        StringBuffer output;
        private final boolean sink;
        private final InputStream stream;

        public String getOutput()
        {
            return output.toString();
        }

        public void run()
        {
            if (sink)
            {
                while (stream.read() != -1) ;
                return;
            }
            BufferedReader bufferedreader;
            output = new StringBuffer();
            bufferedreader = new BufferedReader(new InputStreamReader(stream));
_L1:
            String s = bufferedreader.readLine();
            if (s == null)
            {
                break MISSING_BLOCK_LABEL_71;
            }
            output.append(s);
              goto _L1
            IOException ioexception;
            ioexception;
        }

        InputStreamHandler(InputStream inputstream, boolean flag)
        {
            sink = flag;
            stream = inputstream;
            start();
        }
    }

    static final class OUTPUT extends Enum
    {

        private static final OUTPUT $VALUES[];
        public static final OUTPUT BOTH;
        public static final OUTPUT STDERR;
        public static final OUTPUT STDOUT;

        public static OUTPUT valueOf(String s)
        {
            return (OUTPUT)Enum.valueOf(com/netflix/mediaclient/util/AndroidUtils$OUTPUT, s);
        }

        public static OUTPUT[] values()
        {
            return (OUTPUT[])$VALUES.clone();
        }

        static 
        {
            STDOUT = new OUTPUT("STDOUT", 0);
            STDERR = new OUTPUT("STDERR", 1);
            BOTH = new OUTPUT("BOTH", 2);
            $VALUES = (new OUTPUT[] {
                STDOUT, STDERR, BOTH
            });
        }

        private OUTPUT(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String EXIT = "exit\n";
    public static final String FILENAME = "FILENAME";
    private static final String NOT_AVAILABLE = "n/a";
    public static final String OUTRES = "OUTRES";
    private static final String SHELL = "/system/bin/sh";
    private static final String SU_COMMANDS[] = {
        "su", "/system/xbin/su", "/system/bin/su"
    };
    private static final String TAG = "nf_utils";
    private static final String TEST_COMMANDS[] = {
        "id", "/system/xbin/id", "/system/bin/id"
    };
    private static final Pattern UID_PATTERN = Pattern.compile("^uid=(\\d+).*?");
    public static final boolean debug = false;
    public static final boolean enableTestServer = false;
    public static final boolean release = true;
    private static String rootShell;

    private AndroidUtils()
    {
    }

    private static boolean checkSu()
    {
        String as[] = SU_COMMANDS;
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            rootShell = as[i];
            if (isRootUid())
            {
                return true;
            }
        }

        rootShell = null;
        return false;
    }

    public static void clearApplicationData(Context context)
    {
        context = new File(context.getCacheDir().getParent());
        if (context.exists())
        {
            String as[] = context.list();
            int j = as.length;
            for (int i = 0; i < j; i++)
            {
                String s = as[i];
                if (s.equals("lib"))
                {
                    continue;
                }
                deleteDir(new File(context, s));
                if (Log.isLoggable("nf_utils", 3))
                {
                    Log.i("TAG", (new StringBuilder()).append("File /data/data/com.netflix.mediaclient/").append(s).append(" DELETED").toString());
                }
            }

        }
    }

    public static boolean deleteDir(File file)
    {
        if (file != null && file.isDirectory())
        {
            String as[] = file.list();
            for (int i = 0; i < as.length; i++)
            {
                if (!deleteDir(new File(file, as[i])))
                {
                    return false;
                }
            }

        }
        return file.delete();
    }

    public static int dipToPixels(Context context, int i)
    {
        float f = context.getResources().getDisplayMetrics().density;
        return (int)((float)i * f + 0.5F);
    }

    private static String doRunCommanByProcess(String s, String s1, OUTPUT output)
        throws IOException
    {
        String s2;
        Object obj;
        String s3;
        DataOutputStream dataoutputstream;
        Object obj1;
        dataoutputstream = null;
        obj1 = null;
        s2 = null;
        s3 = null;
        obj = dataoutputstream;
        s = Runtime.getRuntime().exec(s);
        s3 = s;
        obj = dataoutputstream;
        s2 = s;
        dataoutputstream = new DataOutputStream(s.getOutputStream());
        output = sinkProcessOutput(s, output);
        dataoutputstream.writeBytes((new StringBuilder()).append(s1).append('\n').toString());
        dataoutputstream.flush();
        dataoutputstream.writeBytes("exit\n");
        dataoutputstream.flush();
        s.waitFor();
        if (output == null) goto _L2; else goto _L1
_L1:
        s1 = output.getOutput();
        if (dataoutputstream != null)
        {
            try
            {
                dataoutputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return s1;
            }
        }
        output = s1;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_128;
        }
        s.destroy();
        output = s1;
_L4:
        return output;
_L2:
        output = null;
        if (dataoutputstream != null)
        {
            try
            {
                dataoutputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return null;
            }
        }
        if (s == null) goto _L4; else goto _L3
_L3:
        s.destroy();
        return null;
        output;
        s = s3;
        s1 = obj1;
_L8:
        obj = s1;
        s2 = s;
        output = output.getMessage();
        obj = s1;
        s2 = s;
        Log.e("nf_utils", (new StringBuilder()).append("runCommand error: ").append(output).toString());
        obj = s1;
        s2 = s;
        throw new IOException(output);
        s;
_L6:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_227;
        }
        ((DataOutputStream) (obj)).close();
        if (s2 != null)
        {
            try
            {
                s2.destroy();
            }
            // Misplaced declaration of an exception variable
            catch (String s1) { }
        }
        throw s;
        s1;
        obj = dataoutputstream;
        s2 = s;
        s = s1;
        if (true) goto _L6; else goto _L5
_L5:
        output;
        s1 = dataoutputstream;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private static String doRunCommand(String s, OUTPUT output)
        throws IOException
    {
        return doRunCommanByProcess("/system/bin/sh", s, output);
    }

    public static void dumpHprofToDisk()
    {
        Object obj = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        ((File) (obj)).mkdirs();
        obj = (new File(((File) (obj)), "netflix.prof")).getAbsolutePath();
        try
        {
            Log.v("nf_utils", "************************************************************");
            Log.v("nf_utils", "Dumping HPROF profile to file...");
            Log.v("nf_utils", "************************************************************");
            Debug.dumpHprofData(((String) (obj)));
            Log.v("nf_utils", "************************************************************");
            Log.v("nf_utils", (new StringBuilder()).append("Dump complete.  File: ").append(((String) (obj))).toString());
            Log.v("nf_utils", "************************************************************");
            return;
        }
        catch (IOException ioexception)
        {
            Log.handleException("nf_utils", ioexception);
        }
    }

    public static String dumpMemInfo(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Process can not be null!");
        } else
        {
            return "SKIP DUMP_INFO";
        }
    }

    public static void enableStrictMode()
    {
        StrictMode.setThreadPolicy((new android.os.StrictMode.ThreadPolicy.Builder()).detectAll().penaltyLog().build());
        StrictMode.setVmPolicy((new android.os.StrictMode.VmPolicy.Builder()).detectAll().penaltyLog().build());
    }

    public static int getAndroidVersion()
    {
        return android.os.Build.VERSION.SDK_INT;
    }

    public static String[] getAppSignatures(Context context)
    {
        Object obj3 = context.getPackageManager();
        if (obj3 != null) goto _L2; else goto _L1
_L1:
        Object obj;
        Log.e("nf_utils", "Package manager not found, this should NOT happen");
        obj = null;
_L4:
        return ((String []) (obj));
_L2:
        Object obj1 = null;
        Object obj2 = null;
        obj = null;
        String as[] = ((String []) (obj));
        String as1[] = obj1;
        String as2[] = obj2;
        int i;
        try
        {
            obj3 = ((PackageManager) (obj3)).getPackageInfo(context.getPackageName(), 64);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("nf_utils", "Name not found", context);
            return as;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("nf_utils", "No such an algorithm", context);
            return as1;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("nf_utils", "Error while getting signature", context);
            return as2;
        }
        as = ((String []) (obj));
        as1 = obj1;
        as2 = obj2;
        if (!Log.isLoggable("nf_utils", 3))
        {
            break MISSING_BLOCK_LABEL_115;
        }
        as = ((String []) (obj));
        as1 = obj1;
        as2 = obj2;
        Log.d("nf_utils", (new StringBuilder()).append("Found # signatures: ").append(((PackageInfo) (obj3)).signatures.length).toString());
        as = ((String []) (obj));
        as1 = obj1;
        as2 = obj2;
        context = new String[((PackageInfo) (obj3)).signatures.length];
        i = 0;
_L5:
        obj = context;
        as = context;
        as1 = context;
        as2 = context;
        if (i >= ((PackageInfo) (obj3)).signatures.length) goto _L4; else goto _L3
_L3:
        as = context;
        as1 = context;
        as2 = context;
        obj = MessageDigest.getInstance("SHA");
        as = context;
        as1 = context;
        as2 = context;
        ((MessageDigest) (obj)).update(((PackageInfo) (obj3)).signatures[i].toByteArray());
        as = context;
        as1 = context;
        as2 = context;
        context[i] = new String(Base64.encode(((MessageDigest) (obj)).digest(), 0));
        as = context;
        as1 = context;
        as2 = context;
        if (!Log.isLoggable("nf_utils", 3))
        {
            break MISSING_BLOCK_LABEL_280;
        }
        as = context;
        as1 = context;
        as2 = context;
        Log.d("nf_utils", (new StringBuilder()).append("hash key[").append(i).append("]:").append(context[i]).toString());
        i++;
          goto _L5
    }

    public static long getAvailableInternalMemory()
    {
        StatFs statfs = new StatFs(Environment.getDataDirectory().getPath());
        long l = statfs.getBlockSize();
        return (long)statfs.getAvailableBlocks() * l;
    }

    public static String getAvailableInternalMemoryAsString(Context context)
    {
        return Formatter.formatFileSize(context, getAvailableInternalMemory());
    }

    public static int getDimensionInDip(Context context, int i)
    {
        return (int)(context.getResources().getDimension(i) / context.getResources().getDisplayMetrics().density);
    }

    public static String getHeapSizeString(Context context)
    {
        return Formatter.formatShortFileSize(context, Runtime.getRuntime().maxMemory());
    }

    public static PackageInfo getPackageInfo(Context context, String s)
    {
        if (context == null)
        {
            throw new IllegalArgumentException("Context cannot be null!");
        }
        if (s == null)
        {
            throw new IllegalArgumentException("App name cannot be null!");
        }
        try
        {
            context = context.getPackageManager().getPackageInfo(s, 0);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        s = context;
        if (context == null)
        {
            s = null;
        }
        return s;
    }

    public static Bitmap getRoundedCornerBitmap(Bitmap bitmap, int i, int j, int k)
    {
        if (k == 0)
        {
            return bitmap;
        } else
        {
            Bitmap bitmap1 = Bitmap.createBitmap(i, j, android.graphics.Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmap1);
            Paint paint = new Paint();
            Rect rect = new Rect(0, 0, i, j);
            RectF rectf = new RectF(rect);
            float f = k;
            paint.setAntiAlias(true);
            canvas.drawARGB(0, 0, 0, 0);
            paint.setColor(0xff424242);
            canvas.drawRoundRect(rectf, f, f, paint);
            paint.setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), rect, paint);
            return bitmap1;
        }
    }

    public static String getUserAgent(Context context)
    {
        String s = AndroidManifestUtils.getVersion(context);
        int i = AndroidManifestUtils.getVersionCode(context);
        Object obj = PlayerTypeFactory.getCurrentType(context);
        context = ((Context) (obj));
        if (obj == null)
        {
            Log.e("nf_utils", "This should not happen, player type was null at this point! Use default.");
            context = PlayerTypeFactory.findDefaultPlayerType();
        }
        context = mapPlayerType(context);
        obj = new StringBuilder();
        ((StringBuilder) (obj)).append("Netflix/").append(SecurityRepository.getNrdLibVersion());
        ((StringBuilder) (obj)).append(' ').append("NCCP/2.15");
        ((StringBuilder) (obj)).append(" (DEVTYPE=").append(s).append("-").append(i);
        ((StringBuilder) (obj)).append(' ').append("R").append(' ').append(SecurityRepository.getNrdLibVersion());
        ((StringBuilder) (obj)).append(" android-").append(getAndroidVersion()).append('-');
        ((StringBuilder) (obj)).append(context).append(" ; CERTVER=0)");
        return ((StringBuilder) (obj)).toString();
    }

    public static boolean hasHoneycombAtLeast()
    {
        return getAndroidVersion() >= 11;
    }

    public static boolean isActivityFinishedOrDestroyed(Activity activity)
    {
        boolean flag = false;
        if (activity instanceof NetflixActivity)
        {
            flag = ((NetflixActivity)activity).destroyed();
        } else
        if (getAndroidVersion() >= 17)
        {
            flag = activity.isDestroyed();
        }
        return flag || activity.isFinishing();
    }

    public static boolean isAppInstalled(Context context, String s)
    {
        context = context.getPackageManager();
        if (context == null)
        {
            return false;
        }
        try
        {
            context.getPackageInfo(s, 1);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        return true;
    }

    public static boolean isDrmPlayDrmPlayPost3()
    {
        return getAndroidVersion() >= 11 && isDrmPlaySupported();
    }

    public static final boolean isDrmPlaySupported()
    {
        if (!NativeTransport.isDrmPlayPresent())
        {
            Log.d("nf_utils", "drm.play component is not found");
            return false;
        } else
        {
            Log.d("nf_utils", "drm.play component found.");
            return true;
        }
    }

    public static boolean isHd()
    {
        return NativeTransport.isHdCapable();
    }

    public static boolean isNetflixPreloaded(Context context)
    {
label0:
        {
label1:
            {
                boolean flag = false;
                PackageManager packagemanager = context.getPackageManager();
                int i;
                try
                {
                    context = packagemanager.getPackageInfo(context.getPackageName(), 0);
                    if ((((PackageInfo) (context)).applicationInfo.flags & 1) != 0)
                    {
                        break label1;
                    }
                    i = ((PackageInfo) (context)).applicationInfo.flags;
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    return false;
                }
                if ((i & 0x80) == 0)
                {
                    break label0;
                }
            }
            flag = true;
        }
        if (Log.isLoggable("nf_utils", 3))
        {
            Log.d("nf_utils", (new StringBuilder()).append("Netflix Stub/App present in the system folder ?=").append(flag).append(" ApplicationInfo.flags=").append(((PackageInfo) (context)).applicationInfo.flags).toString());
        }
        return flag;
    }

    public static boolean isOpenMaxALSupportMainprofile()
    {
        return NativeTransport.isOMXALmpCapable();
    }

    public static boolean isOpenMaxALSupported()
    {
        return getAndroidVersion() > 13;
    }

    public static boolean isPreHoneycombDevice()
    {
        return getAndroidVersion() < 11;
    }

    public static boolean isPropertyStreamingVideoDrs()
    {
        return NativeTransport.isPropertyStreamingVideoDrs();
    }

    private static boolean isRootUid()
    {
        Object obj;
        String as[];
        int i;
        int j;
        boolean flag;
        flag = true;
        obj = null;
        as = TEST_COMMANDS;
        j = as.length;
        i = 0;
_L9:
        if (i >= j) goto _L2; else goto _L1
_L1:
        obj = runCommand(as[i]);
        if (obj == null || ((String) (obj)).length() <= 0) goto _L3; else goto _L2
_L2:
        if (obj != null && ((String) (obj)).length() != 0) goto _L5; else goto _L4
_L4:
        flag = false;
_L7:
        return flag;
_L3:
        i++;
        continue; /* Loop/switch isn't completed */
_L5:
        obj = UID_PATTERN.matcher(((CharSequence) (obj)));
        if (((Matcher) (obj)).matches() && "0".equals(((Matcher) (obj)).group(1))) goto _L7; else goto _L6
_L6:
        return false;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public static boolean isScreenResolutionSameOrMore(Activity activity, int i, int j)
    {
        if (activity == null || activity.getWindowManager() == null)
        {
            Log.e("nf_utils", "Unable to get window manager! It should not happen!");
        } else
        {
            DisplayMetrics displaymetrics = new DisplayMetrics();
            activity.getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
            if (Log.isLoggable("nf_utils", 3))
            {
                Log.d("nf_utils", (new StringBuilder()).append("Given size (w,h): ").append(i).append(", ").append(j).toString());
                Log.d("nf_utils", (new StringBuilder()).append("Screen size (w,h): ").append(displaymetrics.widthPixels).append(", ").append(displaymetrics.heightPixels).toString());
            }
            if (displaymetrics.widthPixels < i || displaymetrics.heightPixels < j)
            {
                return false;
            }
        }
        return true;
    }

    public static boolean isSuAvailable()
    {
        com/netflix/mediaclient/util/AndroidUtils;
        JVM INSTR monitorenter ;
        String s;
        if (rootShell == null)
        {
            checkSu();
        }
        s = rootShell;
        boolean flag;
        if (s != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com/netflix/mediaclient/util/AndroidUtils;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public static void logDeviceDensity(Activity activity)
    {
        if (!Log.isLoggable("nf_utils", 3) || activity == null)
        {
            return;
        }
        DisplayMetrics displaymetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        Log.d("nf_utils", (new StringBuilder()).append("Logical density: ").append(displaymetrics.density).toString());
        Log.d("nf_utils", (new StringBuilder()).append("DPI density: ").append(displaymetrics.densityDpi).toString());
        switch (displaymetrics.densityDpi)
        {
        default:
            Log.d("nf_utils", "Uknown screen density!");
            return;

        case 120: // 'x'
            Log.d("nf_utils", "ldpi - 120 pixels/inch; dpi scale = .75 (4 dpi = 3 pixels)");
            return;

        case 160: 
            Log.d("nf_utils", "mdpi - 160 pixels/inch; dpi scale = 1 (1 dpi = 1 pixel)");
            return;

        case 240: 
            Log.d("nf_utils", "hdpi - 240 pixels/inch; dpi scale = 1.5 (2 dpi = 3 pixels)");
            return;

        case 213: 
            Log.d("nf_utils", "tvhdpi - 213 pixels/inch; dpi scale = 1.33 (1 dpi = 3 pixels)");
            return;

        case 320: 
            Log.d("nf_utils", "xhdpi - 320 pixels/inch; dpi scale = 2 (1 dpi = 2 pixels)");
            return;

        case 480: 
            Log.d("nf_utils", "xxhdpi - 480 pixels/inch; dpi scale = 3 (1 dpi = 3 pixels)");
            break;
        }
    }

    public static void logIntent(String s, Intent intent)
    {
        if (Log.isLoggable(s, 3))
        {
            Log.d(s, (new StringBuilder()).append("intent.getAction(): ").append(intent.getAction()).toString());
            if (intent.getCategories() == null)
            {
                Log.d(s, "intent.getCategories(): null");
            } else
            {
                Iterator iterator1 = intent.getCategories().iterator();
                while (iterator1.hasNext()) 
                {
                    String s2 = (String)iterator1.next();
                    Log.d(s, (new StringBuilder()).append("intent.category: ").append(s2).toString());
                }
            }
            Log.d(s, (new StringBuilder()).append("intent.getData(): ").append(intent.getData()).toString());
            Log.d(s, (new StringBuilder()).append("intent.getDataString(): ").append(intent.getDataString()).toString());
            Log.d(s, (new StringBuilder()).append("intent.getScheme(): ").append(intent.getScheme()).toString());
            Log.d(s, (new StringBuilder()).append("intent.getType(): ").append(intent.getType()).toString());
            intent = intent.getExtras();
            if (intent != null && !intent.isEmpty())
            {
                String s1;
                Object obj;
                for (Iterator iterator = intent.keySet().iterator(); iterator.hasNext(); Log.d(s, (new StringBuilder()).append("EXTRA: {").append(s1).append(": ").append(obj).append("}").toString()))
                {
                    s1 = (String)iterator.next();
                    obj = intent.get(s1);
                }

            } else
            {
                Log.d(s, "NO EXTRAS");
            }
        }
    }

    public static void logVerboseIntentInfo(String s, Intent intent)
    {
        if (!Log.isLoggable(s, 2)) goto _L2; else goto _L1
_L1:
        Object obj = "n/a";
        if (intent.getDataString() != null) goto _L4; else goto _L3
_L3:
        obj = "n/a";
_L5:
        Object obj1;
        String s1;
        if (intent.getCategories() == null)
        {
            obj1 = "n/a";
        } else
        {
            obj1 = intent.getCategories().toString();
        }
        if (intent.getExtras() == null)
        {
            s1 = "n/a";
        } else
        {
            s1 = intent.getExtras().toString();
        }
        Log.v(s, String.format("Handling intent\n   action: %s\n   uri: %s\n   decodedUri: %s\n   categories: %s\n   extras: %s", new Object[] {
            intent.getAction(), intent.getDataString(), obj, obj1, s1
        }));
_L2:
        return;
_L4:
        obj1 = URLDecoder.decode(intent.getDataString(), "utf-8");
        obj = obj1;
          goto _L5
        obj1;
        Log.w(s, (new StringBuilder()).append("Couldn't decode url: ").append(intent.getDataString()).toString());
          goto _L5
    }

    public static String mapPlayerType(PlayerType playertype)
    {
        if (playertype == PlayerType.device7)
        {
            return "XAL";
        }
        if (playertype == PlayerType.device8)
        {
            return "XALMP";
        }
        if (playertype == PlayerType.device10)
        {
            return "JPLAYER";
        }
        if (playertype == PlayerType.device11)
        {
            return "JPLAYERBASE";
        }
        if (playertype == PlayerType.device12)
        {
            return "JPLAYER2";
        } else
        {
            return "N/A";
        }
    }

    public static ResolveInfo queryIntentActivities(Context context, Intent intent)
    {
        if (context == null)
        {
            throw new IllegalArgumentException("Context cannot be null!");
        }
        if (intent == null)
        {
            throw new IllegalArgumentException("Intent cannot be null!");
        }
        try
        {
            context = context.getPackageManager().resolveActivity(intent, 0);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        return context;
    }

    public static String runCommand(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Cmd can not be null!");
        }
        try
        {
            s = doRunCommand(s, OUTPUT.STDERR);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    public static InputStreamHandler sinkProcessOutput(Process process, OUTPUT output)
    {
        static class _cls1
        {

            static final int $SwitchMap$com$netflix$mediaclient$util$AndroidUtils$OUTPUT[];

            static 
            {
                $SwitchMap$com$netflix$mediaclient$util$AndroidUtils$OUTPUT = new int[OUTPUT.values().length];
                try
                {
                    $SwitchMap$com$netflix$mediaclient$util$AndroidUtils$OUTPUT[OUTPUT.STDOUT.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$netflix$mediaclient$util$AndroidUtils$OUTPUT[OUTPUT.STDERR.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$netflix$mediaclient$util$AndroidUtils$OUTPUT[OUTPUT.BOTH.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.netflix.mediaclient.util.AndroidUtils.OUTPUT[output.ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            output = new InputStreamHandler(process.getErrorStream(), false);
            new InputStreamHandler(process.getInputStream(), true);
            return output;

        case 2: // '\002'
            output = new InputStreamHandler(process.getInputStream(), false);
            new InputStreamHandler(process.getErrorStream(), true);
            return output;

        case 3: // '\003'
            new InputStreamHandler(process.getInputStream(), true);
            break;
        }
        new InputStreamHandler(process.getErrorStream(), true);
        return null;
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.nativeandroid.common;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Environment;
import android.os.StatFs;
import com.worklight.common.Logger;
import com.worklight.common.NoSuchResourceException;
import com.worklight.common.WLConfig;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Formatter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.TreeMap;
import java.util.zip.CRC32;
import java.util.zip.Checksum;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class WLUtils
{

    public static final int ANDROID_BUFFER_8K = 8192;
    public static final String BUNDLE_BASENAME = "com.worklight.wlclient.messages";
    public static final String BUNDLE_RESOURCE = "/com/worklight/wlclient/messages";
    private static HashSet LOADED_LIBS = new HashSet();
    public static final String LOG_CAT = "WL";
    private static int MAX_PERMITTED_DATA_SIZE = 0;
    public static final String WL_CHALLENGE_DATA = "WL-Challenge-Data";
    public static final String WL_CHALLENGE_RESPONSE_DATA = "WL-Challenge-Response-Data";
    public static final String WL_INSTANCE_AUTH_ID = "WL-Instance-Id";
    public static final String WL_PREFS = "WLPrefs";
    public static final String WWW = "www";
    private static ResourceBundle bundle;
    private static final Logger logger = Logger.getInstance(com/worklight/nativeandroid/common/WLUtils.getName());

    public WLUtils()
    {
    }

    public static final String byteArrayToHexString(byte abyte0[])
    {
        StringBuilder stringbuilder = new StringBuilder(abyte0.length * 2);
        Formatter formatter = new Formatter(stringbuilder);
        int j = abyte0.length;
        for (int i = 0; i < j; i++)
        {
            formatter.format("%02x", new Object[] {
                Byte.valueOf(abyte0[i])
            });
        }

        formatter.close();
        return stringbuilder.toString();
    }

    public static void calculateCheckSum(InputStream inputstream, Checksum checksum)
    {
        byte abyte0[] = new byte[8192];
_L1:
        int i = inputstream.read(abyte0);
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        checksum.update(abyte0, 0, i);
          goto _L1
        checksum;
        logger.error("An error occurred while trying to read checksum from assets folder", checksum);
        throw new RuntimeException("An error occurred while trying to read checksum from assets folder");
        checksum;
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream)
            {
                logger.debug("Problem while trying to close InputStream", inputstream);
            }
        }
        throw checksum;
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        inputstream.close();
        return;
        inputstream;
        logger.debug("Problem while trying to close InputStream", inputstream);
        return;
    }

    public static void clearState()
    {
        bundle = null;
    }

    public static long computeChecksumOnExternal(String s)
    {
        Object obj = getTree(new File(s));
        Collections.sort(((List) (obj)));
        s = new CRC32();
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
        {
            File file = (File)((Iterator) (obj)).next();
            try
            {
                calculateCheckSum(new FileInputStream(file), s);
            }
            catch (IOException ioexception)
            {
                logger.error((new StringBuilder()).append("Application failed to load, because checksum was not calculated for file ").append(file.getName()).append(" with ").append(ioexception.getMessage()).toString(), ioexception);
            }
        }

        return s.getValue();
    }

    public static String convertGZIPStreamToString(InputStream inputstream)
    {
        Object obj;
        int i;
        try
        {
            if (inputstream.available() > MAX_PERMITTED_DATA_SIZE)
            {
                logger.warn("Data size exceeds maximum permitted value of 10Mb");
                throw new RuntimeException("Data size exceeds maximum permitted value of 10Mb");
            }
        }
        catch (IOException ioexception)
        {
            logger.debug("Calling available is not supported", ioexception);
        }
        obj = new StringBuilder();
        i = 0;
        BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(new GZIPInputStream(inputstream), Charset.forName("UTF-8")));
_L1:
        String s = bufferedreader.readLine();
        int j;
        j = i;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        i += s.getBytes("UTF-8").length;
        if (i <= MAX_PERMITTED_DATA_SIZE)
        {
            break MISSING_BLOCK_LABEL_144;
        }
        logger.warn("Data size exceeds maximum permitted value of 10Mb");
        j = i;
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            logger.debug((new StringBuilder()).append("Failed to close input stream because ").append(inputstream.getMessage()).toString(), inputstream);
        }
        if (j > MAX_PERMITTED_DATA_SIZE)
        {
            throw new RuntimeException("Data size exceeds maximum permitted value of 10Mb");
        } else
        {
            return ((StringBuilder) (obj)).toString();
        }
        ((StringBuilder) (obj)).append((new StringBuilder()).append(s).append("\n").toString());
          goto _L1
        obj;
        throw new RuntimeException((new StringBuilder()).append("Error reding input stream (").append(inputstream).append(").").toString(), ((Throwable) (obj)));
        obj;
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            logger.debug((new StringBuilder()).append("Failed to close input stream because ").append(inputstream.getMessage()).toString(), inputstream);
        }
        throw obj;
    }

    public static final List convertJSONArrayToList(JSONArray jsonarray)
    {
        ArrayList arraylist = new ArrayList();
        int i = 0;
        while (i < jsonarray.length()) 
        {
            try
            {
                arraylist.add((String)jsonarray.get(i));
            }
            // Misplaced declaration of an exception variable
            catch (JSONArray jsonarray)
            {
                throw new RuntimeException(jsonarray);
            }
            i++;
        }
        return arraylist;
    }

    public static String convertStreamToString(InputStream inputstream)
    {
        Object obj;
        BufferedReader bufferedreader;
        int i;
        try
        {
            if (inputstream.available() > MAX_PERMITTED_DATA_SIZE)
            {
                logger.warn("Data size exceeds maximum permitted value of 10Mb");
                throw new RuntimeException("Data size exceeds maximum permitted value of 10Mb");
            }
        }
        catch (IOException ioexception)
        {
            logger.debug("Calling available is not supported", ioexception);
        }
        bufferedreader = new BufferedReader(new InputStreamReader(inputstream));
        obj = new StringBuilder();
        i = 0;
_L1:
        String s = bufferedreader.readLine();
        int j;
        j = i;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        i += s.getBytes().length;
        if (i <= MAX_PERMITTED_DATA_SIZE)
        {
            break MISSING_BLOCK_LABEL_130;
        }
        logger.warn("Data size exceeds maximum permitted value of 10Mb");
        j = i;
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            logger.debug((new StringBuilder()).append("Failed to close input stream because ").append(inputstream.getMessage()).toString(), inputstream);
        }
        if (j > MAX_PERMITTED_DATA_SIZE)
        {
            throw new RuntimeException("Data size exceeds maximum permitted value of 10Mb");
        } else
        {
            return ((StringBuilder) (obj)).toString();
        }
        ((StringBuilder) (obj)).append((new StringBuilder()).append(s).append("\n").toString());
          goto _L1
        obj;
        throw new RuntimeException((new StringBuilder()).append("Error reding input stream (").append(inputstream).append(").").toString(), ((Throwable) (obj)));
        obj;
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            logger.debug((new StringBuilder()).append("Failed to close input stream because ").append(inputstream.getMessage()).toString(), inputstream);
        }
        throw obj;
    }

    public static final JSONObject convertStringToJSON(String s)
        throws JSONException
    {
        int i = s.indexOf("{");
        int j = s.lastIndexOf("}");
        if (i == -1 || j == -1 || i > j + 1)
        {
            s = (new StringBuilder()).append("Input string does not contain brackets, or input string is invalid. The string is: ").append(s).toString();
            logger.debug(s);
            throw new JSONException(s);
        } else
        {
            return new JSONObject(s.substring(i, j + 1));
        }
    }

    public static void copyFile(File file, File file1)
        throws IOException
    {
        FileInputStream fileinputstream;
        fileinputstream = new FileInputStream(file);
        int i;
        if (!file1.exists())
        {
            if (file.isDirectory())
            {
                file1.mkdirs();
            } else
            {
                file = new File(file1.getParent());
                if (!file.exists())
                {
                    file.mkdirs();
                }
                file1.createNewFile();
            }
        }
        file = new FileOutputStream(file1);
        file1 = new byte[8192];
_L1:
        i = fileinputstream.read(file1);
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        file.write(file1, 0, i);
          goto _L1
        file1;
        throw file1;
        file1;
        fileinputstream.close();
        file.close();
        throw file1;
        fileinputstream.close();
        file.close();
        return;
    }

    public static void copyFile(InputStream inputstream, OutputStream outputstream)
        throws IOException
    {
        byte abyte0[] = new byte[8192];
        do
        {
            int i = inputstream.read(abyte0);
            if (i != -1)
            {
                outputstream.write(abyte0, 0, i);
            } else
            {
                outputstream.flush();
                return;
            }
        } while (true);
    }

    public static void copyStream(InputStream inputstream, OutputStream outputstream)
        throws IOException
    {
        byte abyte0[] = new byte[8192];
        do
        {
            int i = inputstream.read(abyte0);
            if (i != -1)
            {
                outputstream.write(abyte0, 0, i);
            } else
            {
                outputstream.flush();
                inputstream.close();
                return;
            }
        } while (true);
    }

    public static boolean deleteDirectory(File file)
    {
        if (file.isDirectory())
        {
            File afile[] = file.listFiles();
            int j = afile.length;
            for (int i = 0; i < j; i++)
            {
                deleteDirectory(afile[i]);
            }

        }
        return file.delete();
    }

    public static TreeMap extractParametersFromURL(String s)
    {
        try
        {
            Object obj = URLEncodedUtils.parse(new URI(s), "UTF8");
            s = new TreeMap();
            NameValuePair namevaluepair;
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); s.put(namevaluepair.getName(), namevaluepair.getValue()))
            {
                namevaluepair = (NameValuePair)((Iterator) (obj)).next();
            }

        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new Error(s);
        }
        return s;
    }

    private static ResourceBundle getBundle(String s, String s1, boolean flag)
    {
        ResourceBundle resourcebundle = null;
        if (s != null) goto _L2; else goto _L1
_L1:
        resourcebundle = ResourceBundle.getBundle("com.worklight.wlclient.messages", Locale.getDefault());
_L4:
        return resourcebundle;
_L2:
        if (s1 != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        if ("en".equals(s))
        {
            return ResourceBundle.getBundle("com.worklight.wlclient.messages", new Locale(""));
        }
        if (com/worklight/nativeandroid/common/WLUtils.getResource((new StringBuilder()).append("/com/worklight/wlclient/messages_").append(s).append(".properties").toString()) == null) goto _L4; else goto _L3
_L3:
        return ResourceBundle.getBundle("com.worklight.wlclient.messages", new Locale(s));
        if (flag && com/worklight/nativeandroid/common/WLUtils.getResource((new StringBuilder()).append("/com/worklight/wlclient/messages_").append(s).append("_").append(s1).append(".properties").toString()) == null) goto _L4; else goto _L5
_L5:
        return ResourceBundle.getBundle("com.worklight.wlclient.messages", new Locale(s, s1));
    }

    public static long getFreeSpaceOnDevice()
    {
        StatFs statfs = new StatFs(Environment.getDataDirectory().getPath());
        return (long)statfs.getBlockSize() * (long)statfs.getAvailableBlocks();
    }

    public static String getFullAppName(Context context)
    {
        return (new StringBuilder()).append(context.getPackageName()).append(".").append(context.getString(getResourceId(context, "string", "app_name"))).toString();
    }

    public static ResourceBundle getMessagesBundle()
    {
        com/worklight/nativeandroid/common/WLUtils;
        JVM INSTR monitorenter ;
        if (bundle == null) goto _L2; else goto _L1
_L1:
        Object obj = bundle;
_L6:
        com/worklight/nativeandroid/common/WLUtils;
        JVM INSTR monitorexit ;
        return ((ResourceBundle) (obj));
_L2:
        String s1 = WLConfig.getInstance().getLanguagePreferences();
        if (s1 == null) goto _L4; else goto _L3
_L3:
        if (s1.length() <= 0) goto _L4; else goto _L5
_L5:
        String s;
        String s2;
        obj = Locale.getDefault();
        s = ((Locale) (obj)).getLanguage();
        s2 = ((Locale) (obj)).getCountry();
        if (!s.isEmpty())
        {
            break MISSING_BLOCK_LABEL_76;
        }
        bundle = ResourceBundle.getBundle("com.worklight.wlclient.messages", Locale.getDefault());
        obj = bundle;
          goto _L6
        StringBuilder stringbuilder = (new StringBuilder()).append(s);
        if (!s2.isEmpty()) goto _L8; else goto _L7
_L7:
        obj = "";
_L11:
        String as[];
        obj = stringbuilder.append(((String) (obj))).toString();
        as = s1.split(",");
        int i = 0;
_L10:
        if (i >= as.length)
        {
            break; /* Loop/switch isn't completed */
        }
        as[i] = as[i].trim();
        i++;
        if (true) goto _L10; else goto _L9
_L8:
        obj = (new StringBuilder()).append("-").append(s2).toString();
          goto _L11
_L9:
        int j = as.length;
        i = 0;
_L27:
        if (i >= j) goto _L13; else goto _L12
_L12:
        if (!((String) (obj)).equals(as[i])) goto _L15; else goto _L14
_L14:
        bundle = getBundle(s, s2, true);
        if (bundle == null) goto _L15; else goto _L16
_L16:
        obj = bundle;
          goto _L6
_L13:
        if (s2.isEmpty()) goto _L18; else goto _L17
_L17:
        j = as.length;
        i = 0;
_L28:
        if (i >= j) goto _L18; else goto _L19
_L19:
        if (!s.equals(as[i])) goto _L21; else goto _L20
_L20:
        bundle = getBundle(s, null, true);
        if (bundle == null) goto _L21; else goto _L22
_L22:
        obj = bundle;
          goto _L6
_L18:
        j = as.length;
        i = 0;
_L30:
        if (i >= j) goto _L24; else goto _L23
_L23:
        s1 = as[i];
        s = null;
        if (s1.length() <= 2) goto _L26; else goto _L25
_L25:
        obj = s1.substring(0, 2);
        s = s1.substring(3, 2);
_L29:
        bundle = getBundle(((String) (obj)), s, true);
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_406;
        }
        obj = bundle;
          goto _L6
_L24:
        try
        {
            bundle = getBundle("en", null, true);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
_L4:
        if (bundle == null)
        {
            bundle = getBundle(null, null, false);
        }
        obj = bundle;
          goto _L6
        obj;
        throw obj;
_L15:
        i++;
          goto _L27
_L21:
        i++;
          goto _L28
_L26:
        obj = s1;
          goto _L29
        i++;
          goto _L30
    }

    public static int getResourceId(Context context, String s, String s1)
        throws NoSuchResourceException
    {
        byte byte0 = -1;
        int i;
        int j;
        try
        {
            context = Class.forName((new StringBuilder()).append(context.getPackageName()).append(".R").toString()).getDeclaredClasses();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new NoSuchResourceException((new StringBuilder()).append("Failed to find resource R.").append(s).append(".").append(s1).toString(), context);
        }
        i = 0;
        j = byte0;
        if (i < context.length)
        {
            if (!context[i].getSimpleName().equals(s))
            {
                break MISSING_BLOCK_LABEL_74;
            }
            j = context[i].getField(s1).getInt(null);
        }
        return j;
        for (i++; false;)
        {
        }

        break MISSING_BLOCK_LABEL_35;
    }

    public static String getResourceString(String s, Context context)
    {
        return getResourceString(s, null, context);
    }

    public static String getResourceString(String s, String s1, Context context)
    {
        Class class1;
        class1 = null;
        if (false)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        class1 = Class.forName((new StringBuilder()).append(context.getPackageName()).append(".R$string").toString());
        s = (Integer)class1.getDeclaredField(s).get(null);
        if (s1 != null)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        return context.getResources().getString(s.intValue());
        s = context.getResources().getString(s.intValue(), new Object[] {
            s1
        });
        return s;
        s;
        logger.error(s.getMessage(), s);
        return "";
    }

    public static int getSDKVersion()
    {
        return android.os.Build.VERSION.SDK_INT;
    }

    public static List getTree(File file)
    {
        return getTree(file, ((List) (new ArrayList())));
    }

    private static List getTree(File file, List list)
    {
        int j;
        file = file.listFiles();
        j = file.length;
        int i = 0;
_L2:
        File file1;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        file1 = file[i];
        if (file1.isDirectory())
        {
            getTree(file1, list);
            break MISSING_BLOCK_LABEL_55;
        }
        try
        {
            list.add(file1);
            break MISSING_BLOCK_LABEL_55;
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            file.printStackTrace();
        }
        return list;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static final byte[] hexStringToByteArray(String s)
    {
        int j = s.length();
        byte abyte0[] = new byte[j / 2];
        for (int i = 0; i < j; i += 2)
        {
            abyte0[i / 2] = (byte)((Character.digit(s.charAt(i), 16) << 4) + Character.digit(s.charAt(i + 1), 16));
        }

        return abyte0;
    }

    public static final boolean isStringEmpty(String s)
    {
        return s == null || s.length() == 0;
    }

    public static final void loadLib(Context context, String s)
    {
        com/worklight/nativeandroid/common/WLUtils;
        JVM INSTR monitorenter ;
        if (LOADED_LIBS.contains(s)) goto _L2; else goto _L1
_L1:
        String s1;
        s1 = System.getProperty("os.arch");
        logger.debug((new StringBuilder()).append("os.arch: ").append(s1).toString());
        if (s1 == null) goto _L4; else goto _L3
_L3:
        if (!s1.toLowerCase().startsWith("i") && !s1.toLowerCase().startsWith("x86")) goto _L4; else goto _L5
_L8:
        Object obj;
        s1 = (new StringBuilder()).append("featurelibs").append(File.separator).append(s1).append(File.separator).append(s).toString();
        new File(context.getFilesDir(), (new StringBuilder()).append(s1).append(".zip").toString());
        deleteDirectory(new File(context.getFilesDir(), (new StringBuilder()).append("featurelibs").append(File.separator).append(((String) (obj))).toString()));
        obj = new File(context.getFilesDir(), s);
        ((File) (obj)).delete();
        logger.debug((new StringBuilder()).append("Extracting zip file: ").append(s1).toString());
        unpack(context.getAssets().open((new StringBuilder()).append(s1).append(".zip").toString()), ((File) (obj)).getParentFile());
_L6:
        logger.debug((new StringBuilder()).append("Loading library using System.load: ").append(((File) (obj)).getAbsolutePath()).toString());
        System.load(((File) (obj)).getAbsolutePath());
        LOADED_LIBS.add(s);
_L2:
        com/worklight/nativeandroid/common/WLUtils;
        JVM INSTR monitorexit ;
        return;
_L4:
        s1 = "armeabi";
        obj = "x86";
        continue; /* Loop/switch isn't completed */
        context;
        context.printStackTrace();
        logger.debug((new StringBuilder()).append("Error extracting zip file: ").append(context.getMessage()).toString());
          goto _L6
        context;
        throw context;
_L5:
        s1 = "x86";
        obj = "armeabi";
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static byte[] read(File file)
        throws IOException
    {
        File file1;
        byte abyte0[];
        abyte0 = new byte[(int)file.length()];
        file1 = null;
        file = new FileInputStream(file);
        if (file.read(abyte0) == -1)
        {
            throw new IOException("EOF reached while trying to read the whole file");
        }
          goto _L1
        abyte0;
        file1 = file;
        file = abyte0;
_L3:
        if (file1 != null)
        {
            try
            {
                file1.close();
            }
            catch (IOException ioexception) { }
        }
        throw file;
_L1:
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                return abyte0;
            }
        }
        return abyte0;
        file;
        if (true) goto _L3; else goto _L2
_L2:
    }

    public static byte[] readStreamToByteArray(InputStream inputstream)
        throws IOException
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        copyStream(inputstream, bytearrayoutputstream);
        inputstream = bytearrayoutputstream.toByteArray();
        bytearrayoutputstream.close();
        return inputstream;
    }

    public static Drawable scaleImage(Drawable drawable, float f, float f1)
    {
        Object obj = null;
        if (drawable != null)
        {
            drawable = ((BitmapDrawable)drawable).getBitmap();
            int i = drawable.getWidth();
            int j = drawable.getHeight();
            obj = new Matrix();
            ((Matrix) (obj)).postScale(f, f1);
            obj = new BitmapDrawable(Bitmap.createBitmap(drawable, 0, 0, i, j, ((Matrix) (obj)), true));
        }
        return ((Drawable) (obj));
    }

    public static void showDialog(Context context, String s, String s1, String s2)
    {
        showDialog(context, s, s1, s2, new android.content.DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface.dismiss();
            }

        });
    }

    public static void showDialog(Context context, String s, String s1, String s2, android.content.DialogInterface.OnClickListener onclicklistener)
    {
        ((Activity)context).runOnUiThread(new Runnable(context, s, s1, s2, onclicklistener) {

            final android.content.DialogInterface.OnClickListener val$buttonClickListener;
            final String val$buttonText;
            final Context val$context;
            final String val$message;
            final String val$title;

            public void run()
            {
                android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(context);
                builder.setTitle(title);
                builder.setMessage(message);
                builder.setCancelable(false);
                builder.setPositiveButton(buttonText, buttonClickListener);
                builder.create();
                builder.show();
            }

            
            {
                context = context1;
                title = s;
                message = s1;
                buttonText = s2;
                buttonClickListener = onclicklistener;
                super();
            }
        });
    }

    public static void unpack(InputStream inputstream, File file)
        throws IOException
    {
        ZipInputStream zipinputstream = new ZipInputStream(inputstream);
label0:
        do
        {
            ZipEntry zipentry;
label1:
            {
                zipentry = zipinputstream.getNextEntry();
                if (zipentry == null)
                {
                    break label0;
                }
                String s = zipentry.getName();
                if (!s.startsWith("/"))
                {
                    inputstream = s;
                    if (!s.startsWith("\\"))
                    {
                        break label1;
                    }
                }
                inputstream = s.substring(1);
            }
            inputstream = new File((new StringBuilder()).append(file.getPath()).append(File.separator).append(inputstream).toString());
            if (zipentry.isDirectory())
            {
                if (!inputstream.exists())
                {
                    inputstream.mkdirs();
                }
            } else
            {
                File file1 = inputstream.getParentFile();
                if (!file1.exists())
                {
                    file1.mkdirs();
                }
                inputstream = new BufferedOutputStream(new FileOutputStream(inputstream));
                copyFile(zipinputstream, inputstream);
                inputstream.flush();
                inputstream.close();
            }
        } while (true);
    }

    static 
    {
        MAX_PERMITTED_DATA_SIZE = 0xa00000;
    }
}

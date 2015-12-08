// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.common;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Environment;
import android.os.StatFs;
import android.util.Log;
import com.worklight.androidgap.NoSuchResourceException;
import com.worklight.androidgap.WLDroidGap;
import com.worklight.utils.SecurityUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.zip.CRC32;
import java.util.zip.Checksum;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.worklight.common:
//            WLConfig

public class WLUtils
{

    public static final int ANDROID_BUFFER_8K = 8192;
    public static final String LOG_CAT = "WLDroidGap";
    public static final String WL_CHALLENGE_DATA = "WL-Challenge-Data";
    public static final String WL_CHALLENGE_RESPONSE_DATA = "WL-Challenge-Response-Data";
    public static final String WL_INSTANCE_AUTH_ID = "WL-Instance-Id";
    public static final String WL_PREFS = "WLPrefs";

    public WLUtils()
    {
    }

    public static String byteArrayToHexString(byte abyte0[])
    {
        StringBuilder stringbuilder = new StringBuilder(abyte0.length * 2);
        Formatter formatter = new Formatter(stringbuilder);
        int j = abyte0.length;
        int i = 0;
        do
        {
            if (i >= j)
            {
                return stringbuilder.toString();
            }
            formatter.format("%02x", new Object[] {
                Byte.valueOf(abyte0[i])
            });
            i++;
        } while (true);
    }

    public static boolean checkIfMediaFile(File file)
    {
        String as[] = WLDroidGap.getWLConfig().getMediaExtensions();
        if (as == null) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        file = file.getPath();
        file = file.substring(file.lastIndexOf(".") + 1, file.length());
        j = as.length;
        i = 0;
_L5:
        if (i < j) goto _L3; else goto _L2
_L2:
        return false;
_L3:
        if (as[i].equals(file))
        {
            return true;
        }
        i++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static boolean checksumTestOnResources(String s, Context context)
    {
        String s1;
label0:
        {
            s = SecurityUtils.hashData(Long.toString(computeChecksumOnResources(s)), "SHA-1");
            s1 = readWLPref(context, "wlResourcesChecksum");
            if (!s.equals(s1))
            {
                debug(String.format("Checksomes are different, current checksum is %s, last checksum was %s", new Object[] {
                    s, s1
                }));
                if (s1 != null)
                {
                    break label0;
                }
                debug("save web resources checksum on device");
                writeWLPref(context, "wlResourcesChecksum", s);
            }
            return true;
        }
        error((new StringBuilder("web resource checksum is different: old:")).append(s1).append(" new:").append(s).toString());
        return false;
    }

    public static void clearWLPref(Context context)
    {
        context = context.getSharedPreferences("WLPrefs", 0).edit();
        context.clear();
        context.commit();
    }

    public static long computeChecksumOnResources(String s)
    {
        CRC32 crc32;
        Iterator iterator;
        s = getTree(new File(s));
        crc32 = new CRC32();
        iterator = s.iterator();
_L2:
        File file;
        do
        {
            if (!iterator.hasNext())
            {
                return crc32.getValue();
            }
            file = (File)iterator.next();
        } while (WLDroidGap.getWLConfig().getMediaExtensions() != null && checkIfMediaFile(file));
        s = (byte[])null;
        byte abyte0[] = read(file);
        s = abyte0;
_L3:
        crc32.update(s, 0, s.length);
        if (true) goto _L2; else goto _L1
_L1:
        IOException ioexception;
        ioexception;
        error((new StringBuilder("Problem when trying to read resource ")).append(file.getName()).toString(), ioexception);
          goto _L3
    }

    public static List convertJSONArrayToList(JSONArray jsonarray)
    {
        ArrayList arraylist = new ArrayList();
        int i = 0;
        do
        {
            if (i >= jsonarray.length())
            {
                return arraylist;
            }
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
        } while (true);
    }

    public static String convertStreamToString(InputStream inputstream)
    {
        BufferedReader bufferedreader;
        StringBuilder stringbuilder;
        bufferedreader = new BufferedReader(new InputStreamReader(inputstream));
        stringbuilder = new StringBuilder();
_L1:
        String s = bufferedreader.readLine();
        if (s == null)
        {
            Object obj;
            try
            {
                inputstream.close();
            }
            catch (IOException ioexception)
            {
                throw new RuntimeException((new StringBuilder("Error closing input stream (")).append(inputstream).append(")").toString(), ioexception);
            }
            return stringbuilder.toString();
        }
        stringbuilder.append((new StringBuilder(String.valueOf(s))).append("\n").toString());
          goto _L1
        obj;
        throw new RuntimeException((new StringBuilder("Error reding input stream (")).append(inputstream).append(").").toString(), ((Throwable) (obj)));
        obj;
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeException((new StringBuilder("Error closing input stream (")).append(inputstream).append(")").toString(), ((Throwable) (obj)));
        }
        throw obj;
    }

    public static JSONObject convertStringToJSON(String s)
        throws JSONException
    {
        return new JSONObject(s.substring(s.indexOf("{"), s.lastIndexOf("}") + 1));
    }

    public static void copyFile(File file, File file1)
        throws IOException
    {
        FileInputStream fileinputstream;
        int i;
        fileinputstream = new FileInputStream(file);
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
            fileinputstream.close();
            file.close();
            return;
        }
        file.write(file1, 0, i);
          goto _L1
        file1;
        throw file1;
        file1;
        fileinputstream.close();
        file.close();
        throw file1;
    }

    public static void copyFile(InputStream inputstream, OutputStream outputstream)
        throws IOException
    {
        byte abyte0[] = new byte[8192];
        do
        {
            int i = inputstream.read(abyte0);
            if (i == -1)
            {
                outputstream.flush();
                return;
            }
            outputstream.write(abyte0, 0, i);
        } while (true);
    }

    public static void debug(String s)
    {
        Log.d("WLDroidGap", s);
    }

    public static void debug(String s, Throwable throwable)
    {
        Log.d("WLDroidGap", s, throwable);
    }

    public static boolean deleteDirectory(File file)
        throws Exception
    {
        if (!file.exists()) goto _L2; else goto _L1
_L1:
        File afile[] = file.listFiles();
        int i = 0;
_L5:
        int j;
        try
        {
            j = afile.length;
        }
        catch (Exception exception)
        {
            throw new Exception((new StringBuilder("Error occurred while trying to delete directory ")).append(file).toString());
        }
        if (i < j) goto _L3; else goto _L2
_L2:
        return file.delete();
_L3:
        if (afile[i].isDirectory())
        {
            deleteDirectory(afile[i]);
            break MISSING_BLOCK_LABEL_82;
        }
        afile[i].delete();
        i++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static void error(String s)
    {
        Log.e("WLDroidGap", s);
    }

    public static void error(String s, Throwable throwable)
    {
        Log.e("WLDroidGap", s, throwable);
    }

    public static Drawable findDrawableAsset(WLDroidGap wldroidgap, String s)
    {
        Object obj1;
        Object obj2;
        String s1;
        obj1 = null;
        Object obj = null;
        obj2 = null;
        s1 = (new StringBuilder(String.valueOf(wldroidgap.getLocalStorageWebRoot()))).append("/").append(s).toString();
        wldroidgap = obj;
        FileInputStream fileinputstream = new FileInputStream(new File(s1));
        wldroidgap = Drawable.createFromStream(fileinputstream, s);
        if (fileinputstream == null) goto _L2; else goto _L1
_L1:
        fileinputstream.close();
_L4:
        return wldroidgap;
        wldroidgap;
        fileinputstream = obj2;
_L7:
        wldroidgap = fileinputstream;
        error((new StringBuilder("Failed to load icon from path ")).append(s).toString());
        wldroidgap = obj1;
        if (fileinputstream == null) goto _L4; else goto _L3
_L3:
        try
        {
            fileinputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (WLDroidGap wldroidgap)
        {
            error((new StringBuilder("Error closing icon stream for ")).append(s1).toString(), wldroidgap);
            return null;
        }
        return null;
        s;
_L6:
        if (wldroidgap != null)
        {
            try
            {
                wldroidgap.close();
            }
            // Misplaced declaration of an exception variable
            catch (WLDroidGap wldroidgap)
            {
                error((new StringBuilder("Error closing icon stream for ")).append(s1).toString(), wldroidgap);
            }
        }
        throw s;
        s;
        error((new StringBuilder("Error closing icon stream for ")).append(s1).toString(), s);
_L2:
        return wldroidgap;
        s;
        wldroidgap = fileinputstream;
        if (true) goto _L6; else goto _L5
_L5:
        wldroidgap;
          goto _L7
    }

    public static long getFreeSpaceOnDevice()
    {
        StatFs statfs = new StatFs(Environment.getDataDirectory().getPath());
        return (long)statfs.getBlockSize() * (long)statfs.getAvailableBlocks();
    }

    public static String getFullAppName(Context context)
    {
        return (new StringBuilder(String.valueOf(context.getPackageName()))).append(".").append(context.getString(getResourceId(context, "string", "app_name"))).toString();
    }

    public static int getResourceId(Context context, String s, String s1)
        throws NoSuchResourceException
    {
        int i;
        try
        {
            context = Class.forName((new StringBuilder(String.valueOf(context.getPackageName()))).append(".R").toString()).getDeclaredClasses();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new NoSuchResourceException((new StringBuilder("Failed to find resource R.")).append(s).append(".").append(s1).toString(), context);
        }
        i = 0;
        if (i >= context.length)
        {
            return -1;
        }
        if (!context[i].getSimpleName().equals(s))
        {
            break MISSING_BLOCK_LABEL_67;
        }
        i = context[i].getField(s1).getInt(null);
        return i;
        for (i++; false;)
        {
        }

        break MISSING_BLOCK_LABEL_32;
    }

    public static String getResourceString(String s, Activity activity)
    {
        Class class1;
        class1 = null;
        if (false)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        class1 = Class.forName((new StringBuilder(String.valueOf(activity.getPackageName()))).append(".R$string").toString());
        s = activity.getResources().getString(((Integer)class1.getDeclaredField(s).get(null)).intValue());
        return s;
        s;
        Log.e(activity.getPackageName(), s.getMessage(), s);
        activity.finish();
        return "";
    }

    public static List getTree(File file)
    {
        return getTree(file, ((List) (new ArrayList())));
    }

    private static List getTree(File file, List list)
    {
        file = file.listFiles();
        int j = file.length;
        int i = 0;
        do
        {
            if (i >= j)
            {
                return list;
            }
            File file1 = file[i];
            if (file1.isDirectory())
            {
                getTree(file1, list);
            } else
            {
                list.add(file1);
            }
            i++;
        } while (true);
    }

    public static byte[] hexStringToByteArray(String s)
    {
        int j = s.length();
        byte abyte0[] = new byte[j / 2];
        int i = 0;
        do
        {
            if (i >= j)
            {
                return abyte0;
            }
            abyte0[i / 2] = (byte)((Character.digit(s.charAt(i), 16) << 4) + Character.digit(s.charAt(i + 1), 16));
            i += 2;
        } while (true);
    }

    public static void info(String s)
    {
        Log.i("WLDroidGap", s);
    }

    public static boolean isStringEmpty(String s)
    {
        return s == null || s.length() == 0;
    }

    public static void log(String s, int i)
    {
        Log.println(i, "WLDroidGap", s);
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

    public static String readWLPref(Context context, String s)
    {
        return context.getSharedPreferences("WLPrefs", 0).getString(s, null);
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
        context = new android.app.AlertDialog.Builder(context);
        context.setTitle(s);
        context.setMessage(s1);
        context.setCancelable(false);
        context.setPositiveButton(s2, onclicklistener);
        context.create();
        context.show();
    }

    public static void unpack(InputStream inputstream, File file)
        throws IOException
    {
        ZipInputStream zipinputstream = new ZipInputStream(inputstream);
        do
        {
            ZipEntry zipentry;
label0:
            {
                zipentry = zipinputstream.getNextEntry();
                if (zipentry == null)
                {
                    return;
                }
                String s = zipentry.getName();
                if (!s.startsWith("/"))
                {
                    inputstream = s;
                    if (!s.startsWith("\\"))
                    {
                        break label0;
                    }
                }
                inputstream = s.substring(1);
            }
            inputstream = new File((new StringBuilder(String.valueOf(file.getPath()))).append(File.separator).append(inputstream).toString());
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
                inputstream = new FileOutputStream(inputstream);
                copyFile(zipinputstream, inputstream);
                inputstream.flush();
                inputstream.close();
            }
        } while (true);
    }

    public static void warning(String s)
    {
        Log.w("WLDroidGap", s);
    }

    public static void writeWLPref(Context context, String s, String s1)
    {
        context = context.getSharedPreferences("WLPrefs", 0).edit();
        context.putString(s, s1);
        context.commit();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.richmedia.controller;

import android.content.Context;
import android.os.StatFs;
import com.amobee.richmedia.view.AmobeeView;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.jar.JarFile;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

// Referenced classes of package com.amobee.richmedia.controller:
//            OrmmaController

public class OrmmaAssetController extends OrmmaController
{

    private static final char HEX_CHARS[] = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        'a', 'b', 'c', 'd', 'e', 'f'
    };
    private String mSubDir;

    public OrmmaAssetController(AmobeeView amobeeview, Context context)
    {
        super(amobeeview, context);
        mSubDir = null;
    }

    private String asHex(MessageDigest messagedigest)
    {
        messagedigest = messagedigest.digest();
        char ac[] = new char[messagedigest.length * 2];
        int i = 0;
        int j = 0;
        do
        {
            if (i >= messagedigest.length)
            {
                return new String(ac);
            }
            int k = j + 1;
            ac[j] = HEX_CHARS[messagedigest[i] >>> 4 & 0xf];
            j = k + 1;
            ac[k] = HEX_CHARS[messagedigest[i] & 0xf];
            i++;
        } while (true);
    }

    public static boolean deleteDirectory(File file)
    {
        if (!file.exists()) goto _L2; else goto _L1
_L1:
        File afile[];
        int i;
        afile = file.listFiles();
        i = 0;
_L5:
        if (i < afile.length) goto _L3; else goto _L2
_L2:
        return file.delete();
_L3:
        if (afile[i].isDirectory())
        {
            deleteDirectory(afile[i]);
        } else
        {
            afile[i].delete();
        }
        i++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static boolean deleteDirectory(String s)
    {
        if (s != null)
        {
            return deleteDirectory(new File(s));
        } else
        {
            return false;
        }
    }

    private File getAssetDir(String s)
    {
        return new File((new StringBuilder(String.valueOf(mContext.getFilesDir().getPath()))).append(File.separator).append(s).toString());
    }

    private String getAssetName(String s)
    {
        int i = s.lastIndexOf(File.separatorChar);
        String s1 = s;
        if (i >= 0)
        {
            s1 = s.substring(s.lastIndexOf(File.separatorChar) + 1);
        }
        return s1;
    }

    private String getAssetPath(String s)
    {
        int i = s.lastIndexOf(File.separatorChar);
        String s1 = "/";
        if (i >= 0)
        {
            s1 = s.substring(0, s.lastIndexOf(File.separatorChar));
        }
        return s1;
    }

    private String getFilesDir()
    {
        return mContext.getFilesDir().getPath();
    }

    private HttpEntity getHttpEntity(String s)
    {
        try
        {
            s = (new DefaultHttpClient()).execute(new HttpGet(s)).getEntity();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    private String moveToAdDirectory(String s, String s1, String s2)
    {
        mSubDir = s2;
        s = new File((new StringBuilder(String.valueOf(s1))).append(File.separator).append(s).toString());
        (new File((new StringBuilder(String.valueOf(s1))).append(File.separator).append("ad").toString())).mkdir();
        s1 = new File((new StringBuilder(String.valueOf(s1))).append(File.separator).append("ad").append(File.separator).append(s2).toString());
        s1.mkdir();
        s.renameTo(new File(s1, s.getName()));
        return (new StringBuilder(String.valueOf(s1.getPath()))).append(File.separator).toString();
    }

    public static String readFileAsString(String s)
        throws IOException
    {
        BufferedReader bufferedreader = new BufferedReader(new FileReader(s));
        String s1 = "";
        s = bufferedreader.readLine();
        do
        {
            if (s == null)
            {
                bufferedreader.close();
                return s1;
            }
            s1 = (new StringBuilder(String.valueOf(s1))).append(s).toString();
            s = bufferedreader.readLine();
        } while (true);
    }

    public void addAsset(String s, String s1)
    {
        HttpEntity httpentity = getHttpEntity(s1);
        InputStream inputstream = null;
        s1 = null;
        InputStream inputstream1;
        try
        {
            inputstream1 = httpentity.getContent();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            if (s1 != null)
            {
                try
                {
                    s1.close();
                }
                // Misplaced declaration of an exception variable
                catch (String s) { }
            }
            break MISSING_BLOCK_LABEL_87;
        }
        finally
        {
            if (inputstream != null)
            {
                try
                {
                    inputstream.close();
                }
                // Misplaced declaration of an exception variable
                catch (String s1) { }
            }
            throw s;
        }
        s1 = inputstream1;
        inputstream = inputstream1;
        writeToDisk(inputstream1, s, false);
        s1 = inputstream1;
        inputstream = inputstream1;
        s = (new StringBuilder("OrmmaAdController.addedAsset('")).append(s).append("' )").toString();
        s1 = inputstream1;
        inputstream = inputstream1;
        mOrmmaView.injectJavaScript(s);
        if (inputstream1 != null)
        {
            try
            {
                inputstream1.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
        try
        {
            httpentity.consumeContent();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
    }

    public int cacheRemaining()
    {
        StatFs statfs = new StatFs(mContext.getFilesDir().getPath());
        return statfs.getFreeBlocks() * statfs.getBlockSize();
    }

    public String copyTextFromJarIntoAssetDir(String s, String s1)
    {
        Object obj2 = null;
        Object obj1 = null;
        String s2 = obj1;
        String s3 = obj2;
        Object obj;
        String s4;
        int i;
        try
        {
            s4 = com/amobee/richmedia/controller/OrmmaAssetController.getClassLoader().getResource(s1).getFile();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            if (s2 != null)
            {
                try
                {
                    s2.close();
                }
                // Misplaced declaration of an exception variable
                catch (String s) { }
            }
            return null;
        }
        finally
        {
            if (s3 == null) goto _L0; else goto _L0
        }
        obj = s4;
        s2 = obj1;
        s3 = obj2;
        if (!s4.startsWith("file:"))
        {
            break MISSING_BLOCK_LABEL_64;
        }
        s2 = obj1;
        s3 = obj2;
        obj = s4.substring(5);
        s2 = obj1;
        s3 = obj2;
        i = ((String) (obj)).indexOf("!");
        s4 = ((String) (obj));
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_105;
        }
        s2 = obj1;
        s3 = obj2;
        s4 = ((String) (obj)).substring(0, i);
        s2 = obj1;
        s3 = obj2;
        obj = new JarFile(s4);
        s2 = obj1;
        s3 = obj2;
        s1 = ((JarFile) (obj)).getInputStream(((JarFile) (obj)).getJarEntry(s1));
        s2 = s1;
        s3 = s1;
        System.out.println((new StringBuilder("Stream = ")).append(s1).toString());
        s2 = s1;
        s3 = s1;
        s = writeToDisk(s1, s, false);
        if (s1 != null)
        {
            try
            {
                s1.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s1) { }
        }
        return s;
        try
        {
            s3.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s1) { }
        throw s;
    }

    public void deleteOldAds()
    {
        if (mSubDir == null)
        {
            return;
        } else
        {
            deleteDirectory(new File((new StringBuilder(String.valueOf(getFilesDir()))).append(File.separator).append("ad").append(File.separator).append(mSubDir).toString()));
            return;
        }
    }

    protected void finalize()
        throws Throwable
    {
        deleteOldAds();
        super.finalize();
    }

    public FileOutputStream getAssetOutputString(String s)
        throws FileNotFoundException
    {
        File file = getAssetDir(getAssetPath(s));
        file.mkdirs();
        return new FileOutputStream(new File(file, getAssetName(s)));
    }

    public String getAssetPath()
    {
        return (new StringBuilder("file://")).append(mContext.getFilesDir()).append("/").toString();
    }

    public void removeAsset(String s)
    {
        File file = getAssetDir(getAssetPath(s));
        file.mkdirs();
        (new File(file, getAssetName(s))).delete();
        s = (new StringBuilder("OrmmaAdController.assetRemoved('")).append(s).append("' )").toString();
        mOrmmaView.injectJavaScript(s);
    }

    public void stopAllListeners()
    {
    }

    public String writeToDisk(InputStream inputstream, String s, boolean flag)
        throws IllegalStateException, IOException
    {
        byte abyte0[] = new byte[1024];
        Object obj1 = null;
        Object obj = obj1;
        FileOutputStream fileoutputstream;
        int i;
        if (flag)
        {
            try
            {
                obj = MessageDigest.getInstance("MD5");
            }
            catch (NoSuchAlgorithmException nosuchalgorithmexception)
            {
                nosuchalgorithmexception = ((NoSuchAlgorithmException) (obj1));
            }
        }
        obj1 = null;
        fileoutputstream = getAssetOutputString(s);
_L2:
        obj1 = fileoutputstream;
        i = inputstream.read(abyte0);
        if (i > 0)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        obj1 = fileoutputstream;
        fileoutputstream.flush();
        if (fileoutputstream != null)
        {
            try
            {
                fileoutputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream) { }
        }
        obj1 = getFilesDir();
        inputstream = ((InputStream) (obj1));
        if (flag)
        {
            inputstream = ((InputStream) (obj1));
            if (obj != null)
            {
                inputstream = moveToAdDirectory(s, ((String) (obj1)), asHex(((MessageDigest) (obj))));
            }
        }
        return (new StringBuilder(String.valueOf(inputstream))).append(s).toString();
        if (!flag || obj == null)
        {
            break MISSING_BLOCK_LABEL_146;
        }
        obj1 = fileoutputstream;
        ((MessageDigest) (obj)).update(abyte0);
        obj1 = fileoutputstream;
        fileoutputstream.write(abyte0, 0, i);
        if (true) goto _L2; else goto _L1
_L1:
        inputstream;
        if (obj1 != null)
        {
            try
            {
                ((FileOutputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
        throw inputstream;
    }

    public String writeToDiskWrap(InputStream inputstream, String s, boolean flag, String s1, String s2, String s3)
        throws IllegalStateException, IOException
    {
        byte abyte0[] = new byte[1024];
        FileOutputStream fileoutputstream = null;
        Object obj = fileoutputstream;
        FileOutputStream fileoutputstream1;
        ByteArrayOutputStream bytearrayoutputstream;
        String s4;
        int i;
        int j;
        if (flag)
        {
            try
            {
                obj = MessageDigest.getInstance("MD5");
            }
            catch (NoSuchAlgorithmException nosuchalgorithmexception)
            {
                nosuchalgorithmexception = fileoutputstream;
            }
        }
        bytearrayoutputstream = new ByteArrayOutputStream();
        fileoutputstream1 = null;
        fileoutputstream = fileoutputstream1;
        i = inputstream.read(abyte0);
        if (i > 0) goto _L2; else goto _L1
_L1:
        fileoutputstream = fileoutputstream1;
        s4 = bytearrayoutputstream.toString();
        fileoutputstream = fileoutputstream1;
        if (s4.indexOf("<html") >= 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        inputstream = null;
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_230;
        }
        fileoutputstream = fileoutputstream1;
        abyte0 = new StringBuffer(s4);
        fileoutputstream = fileoutputstream1;
        j = abyte0.indexOf("/amobee_richmedia_bridge.js");
        if (j <= -1)
        {
            break MISSING_BLOCK_LABEL_165;
        }
        fileoutputstream = fileoutputstream1;
        abyte0.replace(j, "/amobee_richmedia_bridge.js".length() + j, (new StringBuilder("file:/")).append(s2).toString());
        fileoutputstream = fileoutputstream1;
        j = abyte0.indexOf("/amobee_richmedia.js");
        inputstream = abyte0;
        if (j <= -1)
        {
            break MISSING_BLOCK_LABEL_230;
        }
        fileoutputstream = fileoutputstream1;
        abyte0.replace(j, "/amobee_richmedia.js".length() + j, (new StringBuilder("file:/")).append(s3).toString());
        inputstream = abyte0;
        fileoutputstream = fileoutputstream1;
        if (s4.indexOf("mraid.js") >= 0)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        fileoutputstream = fileoutputstream1;
        fileoutputstream1 = getAssetOutputString(s);
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_590;
        }
        fileoutputstream = fileoutputstream1;
        fileoutputstream1.write("<html>".getBytes());
        fileoutputstream = fileoutputstream1;
        fileoutputstream1.write("<head>".getBytes());
        fileoutputstream = fileoutputstream1;
        fileoutputstream1.write("<meta name='viewport' content='".getBytes());
        if (true)
        {
            break MISSING_BLOCK_LABEL_328;
        }
        fileoutputstream = fileoutputstream1;
        fileoutputstream1.write("target-densitydpi=device-dpi, ".getBytes());
        fileoutputstream = fileoutputstream1;
        fileoutputstream1.write("user-scalable=no, initial-scale=1.0' />".getBytes());
        fileoutputstream = fileoutputstream1;
        fileoutputstream1.write("<title>Amobee</title> ".getBytes());
        fileoutputstream = fileoutputstream1;
        if (s4.indexOf("<script") <= -1)
        {
            break MISSING_BLOCK_LABEL_446;
        }
        fileoutputstream = fileoutputstream1;
        fileoutputstream1.write((new StringBuilder("<script src=\"file://")).append(s2).append("\" type=\"text/javascript\"></script>").toString().getBytes());
        fileoutputstream = fileoutputstream1;
        fileoutputstream1.write((new StringBuilder("<script src=\"file://")).append(s3).append("\" type=\"text/javascript\"></script>").toString().getBytes());
        if (!j)
        {
            break MISSING_BLOCK_LABEL_496;
        }
        fileoutputstream = fileoutputstream1;
        fileoutputstream1.write("<script type=\"text/javascript\">".getBytes());
        fileoutputstream = fileoutputstream1;
        fileoutputstream1.write("ormmaview.scriptFound = true;".getBytes());
        fileoutputstream = fileoutputstream1;
        fileoutputstream1.write("</script>".getBytes());
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_545;
        }
        fileoutputstream = fileoutputstream1;
        fileoutputstream1.write("<script type=\"text/javascript\">".getBytes());
        fileoutputstream = fileoutputstream1;
        fileoutputstream1.write(s1.getBytes());
        fileoutputstream = fileoutputstream1;
        fileoutputstream1.write("</script>".getBytes());
        fileoutputstream = fileoutputstream1;
        fileoutputstream1.write("</head>".getBytes());
        fileoutputstream = fileoutputstream1;
        fileoutputstream1.write("<body style=\"margin:0; padding:0; overflow:hidden; background-color:transparent;text-align:center\">".getBytes());
        fileoutputstream = fileoutputstream1;
        fileoutputstream1.write("<div> ".getBytes());
        if (i != 0) goto _L4; else goto _L3
_L3:
        fileoutputstream = fileoutputstream1;
        fileoutputstream1.write(bytearrayoutputstream.toByteArray());
_L5:
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_659;
        }
        fileoutputstream = fileoutputstream1;
        fileoutputstream1.write("</div> ".getBytes());
        fileoutputstream = fileoutputstream1;
        fileoutputstream1.write("</body> ".getBytes());
        fileoutputstream = fileoutputstream1;
        fileoutputstream1.write("</html> ".getBytes());
        fileoutputstream = fileoutputstream1;
        fileoutputstream1.flush();
        if (bytearrayoutputstream != null)
        {
            try
            {
                bytearrayoutputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream) { }
        }
        if (fileoutputstream1 != null)
        {
            try
            {
                fileoutputstream1.close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream) { }
        }
        s1 = getFilesDir();
        inputstream = s1;
        if (flag)
        {
            inputstream = s1;
            if (obj != null)
            {
                inputstream = moveToAdDirectory(s, s1, asHex(((MessageDigest) (obj))));
            }
        }
        return inputstream;
_L2:
        if (!flag || obj == null)
        {
            break MISSING_BLOCK_LABEL_745;
        }
        fileoutputstream = fileoutputstream1;
        ((MessageDigest) (obj)).update(abyte0);
        fileoutputstream = fileoutputstream1;
        bytearrayoutputstream.write(abyte0, 0, i);
        break MISSING_BLOCK_LABEL_38;
        inputstream;
        if (bytearrayoutputstream != null)
        {
            try
            {
                bytearrayoutputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
        if (fileoutputstream != null)
        {
            try
            {
                fileoutputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
        throw inputstream;
_L4:
        fileoutputstream = fileoutputstream1;
        fileoutputstream1.write(inputstream.toString().getBytes());
          goto _L5
    }

}

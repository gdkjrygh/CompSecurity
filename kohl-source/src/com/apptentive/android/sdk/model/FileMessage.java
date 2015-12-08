// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.model;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.apptentive.android.sdk.Log;
import com.apptentive.android.sdk.storage.ApptentiveDatabase;
import com.apptentive.android.sdk.storage.FileStore;
import com.apptentive.android.sdk.util.CountingOutputStream;
import com.apptentive.android.sdk.util.ImageUtil;
import com.apptentive.android.sdk.util.Util;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import org.json.JSONException;

// Referenced classes of package com.apptentive.android.sdk.model:
//            Message, StoredFile

public class FileMessage extends Message
{

    private static final String KEY_FILE_NAME = "file_name";
    private static final String KEY_MIME_TYPE = "mime_type";
    private static final int MAX_STORED_IMAGE_EDGE = 1024;

    public FileMessage()
    {
    }

    public FileMessage(String s)
        throws JSONException
    {
        super(s);
    }

    private String getStoredFileId()
    {
        return (new StringBuilder()).append("apptentive-file-").append(getNonce()).toString();
    }

    public boolean createStoredFile(Context context, InputStream inputstream, String s)
        throws IOException
    {
        byte abyte0[];
        File file;
        setMimeType(s);
        file = new File(getStoredFileId());
        abyte0 = null;
        CountingOutputStream countingoutputstream = new CountingOutputStream(new BufferedOutputStream(context.openFileOutput(file.getPath(), 0)));
        abyte0 = new byte[2048];
_L3:
        int i = inputstream.read(abyte0, 0, 2048);
        if (i == -1) goto _L2; else goto _L1
_L1:
        countingoutputstream.write(abyte0, 0, i);
          goto _L3
        inputstream;
        context = countingoutputstream;
_L5:
        Util.ensureClosed(context);
        throw inputstream;
_L2:
        Log.d((new StringBuilder()).append("File saved, size = ").append(countingoutputstream.getBytesWritten() / 1024).append("k").toString(), new Object[0]);
        Util.ensureClosed(countingoutputstream);
        inputstream = new StoredFile();
        inputstream.setId(getStoredFileId());
        inputstream.setLocalFilePath(file.getPath());
        inputstream.setMimeType(s);
        return ApptentiveDatabase.getInstance(context).putStoredFile(inputstream);
        inputstream;
        context = abyte0;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public boolean createStoredFile(Context context, String s)
    {
        String s2;
        String s3;
        MimeTypeMap mimetypemap;
        Uri uri;
        uri = Uri.parse(s);
        s3 = context.getContentResolver().getType(uri);
        mimetypemap = MimeTypeMap.getSingleton();
        s2 = mimetypemap.getExtensionFromMimeType(s3);
        String s1 = s2;
        if (s2 == null)
        {
            s1 = MimeTypeMap.getFileExtensionFromUrl(s);
        }
        s2 = s3;
        if (s3 == null)
        {
            s2 = s3;
            if (s1 != null)
            {
                s2 = mimetypemap.getMimeTypeFromExtension(s1);
            }
        }
        setFileName((new StringBuilder()).append(uri.getLastPathSegment()).append(".").append(s1).toString());
        setMimeType(s2);
        mimetypemap = null;
        s = null;
        s3 = null;
        Object obj = new BufferedInputStream(context.getContentResolver().openInputStream(uri));
        boolean flag = createStoredFile(context, ((InputStream) (obj)), s2);
        Util.ensureClosed(((java.io.Closeable) (obj)));
        return flag;
        obj;
        context = s3;
_L6:
        s = context;
        Log.e("File not found while storing file.", ((Throwable) (obj)), new Object[0]);
        Util.ensureClosed(context);
        return false;
        obj;
        context = mimetypemap;
_L4:
        s = context;
        Log.a("Error storing image.", ((Throwable) (obj)), new Object[0]);
        Util.ensureClosed(context);
        return false;
        context;
_L2:
        Util.ensureClosed(s);
        throw context;
        context;
        s = ((String) (obj));
        if (true) goto _L2; else goto _L1
_L1:
        s;
        context = ((Context) (obj));
        obj = s;
        if (true) goto _L4; else goto _L3
_L3:
        s;
        context = ((Context) (obj));
        obj = s;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public boolean createStoredFile(Context context, byte abyte0[], String s)
    {
        Object obj;
        Object obj1;
        Object obj2;
        obj2 = null;
        obj = null;
        obj1 = null;
        abyte0 = new ByteArrayInputStream(abyte0);
        boolean flag = createStoredFile(context, ((InputStream) (abyte0)), s);
        Util.ensureClosed(abyte0);
        return flag;
        abyte0;
        context = obj1;
_L6:
        obj = context;
        Log.e("File not found while storing file.", abyte0, new Object[0]);
        Util.ensureClosed(context);
        return false;
        abyte0;
        context = obj2;
_L4:
        obj = context;
        Log.a("Error storing file.", abyte0, new Object[0]);
        Util.ensureClosed(context);
        return false;
        context;
_L2:
        Util.ensureClosed(((java.io.Closeable) (obj)));
        throw context;
        context;
        obj = abyte0;
        if (true) goto _L2; else goto _L1
_L1:
        s;
        context = abyte0;
        abyte0 = s;
        if (true) goto _L4; else goto _L3
_L3:
        s;
        context = abyte0;
        abyte0 = s;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void deleteStoredFile(Context context)
    {
        ApptentiveDatabase.getInstance(context).deleteStoredFile(getStoredFileId());
    }

    public String getFileName()
    {
        String s;
        try
        {
            s = getString("file_name");
        }
        catch (JSONException jsonexception)
        {
            return null;
        }
        return s;
    }

    public String getMimeType()
    {
        String s;
        try
        {
            s = getString("mime_type");
        }
        catch (JSONException jsonexception)
        {
            return null;
        }
        return s;
    }

    public StoredFile getStoredFile(Context context)
    {
        return ApptentiveDatabase.getInstance(context).getStoredFile(getStoredFileId());
    }

    protected void initType()
    {
        setType(Message.Type.FileMessage);
    }

    public boolean internalCreateStoredImage(Context context, String s)
    {
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Uri uri;
        File file;
        uri = Uri.parse(s);
        s = context.getContentResolver().getType(uri);
        obj = MimeTypeMap.getSingleton().getExtensionFromMimeType(s);
        setFileName((new StringBuilder()).append(uri.getLastPathSegment()).append(".").append(((String) (obj))).toString());
        setMimeType(s);
        file = new File(getStoredFileId());
        obj6 = null;
        obj1 = null;
        obj5 = null;
        obj4 = null;
        obj = null;
        obj2 = null;
        obj3 = null;
        s = new BufferedInputStream(context.getContentResolver().openInputStream(uri));
        try
        {
            obj = new CountingOutputStream(new BufferedOutputStream(context.openFileOutput(file.getPath(), 0)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2)
        {
            context = s;
            s = obj3;
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2)
        {
            context = s;
            s = obj4;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            obj = obj2;
            obj1 = s;
            continue; /* Loop/switch isn't completed */
        }
        System.gc();
        obj1 = ImageUtil.createScaledBitmapFromStream(s, 1024, 1024, null);
        ((Bitmap) (obj1)).compress(android.graphics.Bitmap.CompressFormat.JPEG, 95, ((java.io.OutputStream) (obj)));
        ((CountingOutputStream) (obj)).flush();
        Log.d((new StringBuilder()).append("Bitmap saved, size = ").append(((CountingOutputStream) (obj)).getBytesWritten() / 1024).append("k").toString(), new Object[0]);
        ((Bitmap) (obj1)).recycle();
        System.gc();
        Util.ensureClosed(s);
        Util.ensureClosed(((java.io.Closeable) (obj)));
        s = new StoredFile();
        s.setId(getStoredFileId());
        s.setOriginalUri(uri.toString());
        s.setLocalFilePath(file.getPath());
        s.setMimeType("image/jpeg");
        return ApptentiveDatabase.getInstance(context).putStoredFile(s);
        obj2;
        context = obj5;
        s = obj3;
_L6:
        obj = s;
        obj1 = context;
        Log.e("File not found while storing image.", ((Throwable) (obj2)), new Object[0]);
        Util.ensureClosed(context);
        Util.ensureClosed(s);
        return false;
        obj2;
        context = obj6;
        s = obj4;
_L4:
        obj = s;
        obj1 = context;
        Log.a("Error storing image.", ((Throwable) (obj2)), new Object[0]);
        Util.ensureClosed(context);
        Util.ensureClosed(s);
        return false;
        context;
_L2:
        Util.ensureClosed(((java.io.Closeable) (obj1)));
        Util.ensureClosed(((java.io.Closeable) (obj)));
        throw context;
        context;
        obj1 = s;
        if (true) goto _L2; else goto _L1
_L1:
        break MISSING_BLOCK_LABEL_135;
        obj2;
        context = s;
        s = ((String) (obj));
        if (true) goto _L4; else goto _L3
_L3:
        break MISSING_BLOCK_LABEL_135;
        obj2;
        context = s;
        s = ((String) (obj));
        if (true) goto _L6; else goto _L5
_L5:
    }

    public String marshallForSending()
    {
        return toString();
    }

    public void setFileName(String s)
    {
        try
        {
            put("file_name", s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("Unable to set file name.", new Object[0]);
        }
    }

    public void setMimeType(String s)
    {
        try
        {
            put("mime_type", s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("Unable to set mime type.", new Object[0]);
        }
    }
}

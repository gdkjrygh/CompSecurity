// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.file;

import android.app.Activity;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaResourceApi;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.PluginManager;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package org.apache.cordova.file:
//            Filesystem, InvalidModificationException, NoModificationAllowedException, FileExistsException, 
//            LocalFilesystem, LocalFilesystemURL, TypeMismatchException

public class ContentFilesystem extends Filesystem
{

    private CordovaInterface cordova;
    private CordovaResourceApi resourceApi;

    public ContentFilesystem(String s, CordovaInterface cordovainterface, CordovaWebView cordovawebview)
    {
        Class class1;
        name = s;
        cordova = cordovainterface;
        class1 = cordovawebview.getClass();
        s = null;
        cordovainterface = (PluginManager)class1.getMethod("getPluginManager", new Class[0]).invoke(cordovawebview, new Object[0]);
        s = cordovainterface;
_L2:
        cordovainterface = s;
        if (s == null)
        {
            try
            {
                cordovainterface = (PluginManager)class1.getField("pluginManager").get(cordovawebview);
            }
            // Misplaced declaration of an exception variable
            catch (CordovaInterface cordovainterface)
            {
                cordovainterface = s;
            }
            // Misplaced declaration of an exception variable
            catch (CordovaInterface cordovainterface)
            {
                cordovainterface = s;
            }
        }
        resourceApi = new CordovaResourceApi(cordovawebview.getContext(), cordovainterface);
        return;
        cordovainterface;
        continue; /* Loop/switch isn't completed */
        cordovainterface;
        continue; /* Loop/switch isn't completed */
        cordovainterface;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public LocalFilesystemURL URLforFilesystemPath(String s)
    {
        return null;
    }

    public boolean canRemoveFileAtLocalURL(LocalFilesystemURL localfilesystemurl)
    {
        return (new File(filesystemPathForURL(localfilesystemurl))).exists();
    }

    public JSONObject copyFileToURL(LocalFilesystemURL localfilesystemurl, String s, Filesystem filesystem, LocalFilesystemURL localfilesystemurl1, boolean flag)
        throws IOException, InvalidModificationException, JSONException, NoModificationAllowedException, FileExistsException
    {
        if (org/apache/cordova/file/LocalFilesystem.isInstance(filesystem))
        {
            s = makeDestinationURL(s, localfilesystemurl1, localfilesystemurl);
            localfilesystemurl = resourceApi.openOutputStream(localfilesystemurl.URL);
            org.apache.cordova.CordovaResourceApi.OpenForReadResult openforreadresult = resourceApi.openForRead(localfilesystemurl1.URL);
            if (flag && !filesystem.canRemoveFileAtLocalURL(localfilesystemurl1))
            {
                throw new NoModificationAllowedException("Cannot move file at source URL");
            }
            try
            {
                resourceApi.copyResource(openforreadresult, localfilesystemurl);
            }
            // Misplaced declaration of an exception variable
            catch (LocalFilesystemURL localfilesystemurl)
            {
                throw new IOException("Cannot read file at source URL");
            }
            if (flag)
            {
                filesystem.removeFileAtLocalURL(localfilesystemurl1);
            }
            return makeEntryForURL(s, Boolean.valueOf(false), ((LocalFilesystemURL) (s)).URL.toString());
        } else
        {
            return super.copyFileToURL(localfilesystemurl, s, filesystem, localfilesystemurl1, flag);
        }
    }

    protected String filesystemPathForCursor(Cursor cursor)
    {
        int i = cursor.getColumnIndex((new String[] {
            "_data"
        })[0]);
        if (i != -1)
        {
            return cursor.getString(i);
        } else
        {
            return null;
        }
    }

    public String filesystemPathForURL(LocalFilesystemURL localfilesystemurl)
    {
        localfilesystemurl = openCursorForURL(localfilesystemurl);
        if (localfilesystemurl == null)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        String s;
        if (!localfilesystemurl.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_37;
        }
        s = filesystemPathForCursor(localfilesystemurl);
        if (localfilesystemurl != null)
        {
            localfilesystemurl.close();
        }
        return s;
        if (localfilesystemurl != null)
        {
            localfilesystemurl.close();
        }
        return null;
        Exception exception;
        exception;
        if (localfilesystemurl != null)
        {
            localfilesystemurl.close();
        }
        throw exception;
    }

    public JSONObject getEntryForLocalURL(LocalFilesystemURL localfilesystemurl)
        throws IOException
    {
        Object obj;
        if ("/".equals(localfilesystemurl.fullPath))
        {
            try
            {
                localfilesystemurl = LocalFilesystem.makeEntryForURL(localfilesystemurl, Boolean.valueOf(true), localfilesystemurl.URL.toString());
            }
            // Misplaced declaration of an exception variable
            catch (LocalFilesystemURL localfilesystemurl)
            {
                throw new IOException();
            }
            return localfilesystemurl;
        }
        obj = openCursorForURL(localfilesystemurl);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        if (((Cursor) (obj)).moveToFirst())
        {
            break MISSING_BLOCK_LABEL_79;
        }
        throw new FileNotFoundException();
        localfilesystemurl;
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw localfilesystemurl;
        String s = filesystemPathForCursor(((Cursor) (obj)));
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        if (s == null)
        {
            obj = localfilesystemurl.URL.toString();
        } else
        {
            obj = (new StringBuilder()).append("file://").append(s).toString();
        }
        try
        {
            localfilesystemurl = makeEntryForPath(localfilesystemurl.fullPath, localfilesystemurl.filesystemName, Boolean.valueOf(false), ((String) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (LocalFilesystemURL localfilesystemurl)
        {
            throw new IOException();
        }
        return localfilesystemurl;
    }

    public JSONObject getFileForLocalURL(LocalFilesystemURL localfilesystemurl, String s, JSONObject jsonobject, boolean flag)
        throws IOException, TypeMismatchException, JSONException
    {
        if (jsonobject != null && jsonobject.optBoolean("create"))
        {
            throw new IOException("Cannot create content url");
        }
        localfilesystemurl = new LocalFilesystemURL(Uri.withAppendedPath(localfilesystemurl.URL, s));
        s = new File(filesystemPathForURL(localfilesystemurl));
        if (!s.exists())
        {
            throw new FileNotFoundException("path does not exist");
        }
        if (flag)
        {
            if (s.isFile())
            {
                throw new TypeMismatchException("path doesn't exist or is file");
            }
        } else
        if (s.isDirectory())
        {
            throw new TypeMismatchException("path doesn't exist or is directory");
        }
        return makeEntryForPath(localfilesystemurl.fullPath, localfilesystemurl.filesystemName, Boolean.valueOf(flag), Uri.fromFile(s).toString());
    }

    public JSONObject getFileMetadataForLocalURL(LocalFilesystemURL localfilesystemurl)
        throws FileNotFoundException
    {
        Object obj;
        obj = openCursorForURL(localfilesystemurl);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        Integer integer;
        Integer integer1;
        if (!((Cursor) (obj)).moveToFirst())
        {
            break MISSING_BLOCK_LABEL_114;
        }
        integer = resourceSizeForCursor(((Cursor) (obj)));
        integer1 = lastModifiedDateForCursor(((Cursor) (obj)));
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        obj = new JSONObject();
        try
        {
            ((JSONObject) (obj)).put("size", integer);
            ((JSONObject) (obj)).put("type", resourceApi.getMimeType(localfilesystemurl.URL));
            ((JSONObject) (obj)).put("name", localfilesystemurl.filesystemName);
            ((JSONObject) (obj)).put("fullPath", localfilesystemurl.fullPath);
            ((JSONObject) (obj)).put("lastModifiedDate", integer1);
        }
        // Misplaced declaration of an exception variable
        catch (LocalFilesystemURL localfilesystemurl)
        {
            return null;
        }
        return ((JSONObject) (obj));
        throw new FileNotFoundException();
        localfilesystemurl;
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw localfilesystemurl;
    }

    OutputStream getOutputStreamForURL(LocalFilesystemURL localfilesystemurl)
        throws IOException
    {
        return resourceApi.openOutputStream(localfilesystemurl.URL);
    }

    protected Integer lastModifiedDateForCursor(Cursor cursor)
    {
        int i = cursor.getColumnIndex((new String[] {
            "date_modified"
        })[0]);
        if (i != -1)
        {
            cursor = cursor.getString(i);
            if (cursor != null)
            {
                return Integer.valueOf(Integer.parseInt(cursor, 10));
            }
        }
        return null;
    }

    protected Cursor openCursorForURL(LocalFilesystemURL localfilesystemurl)
    {
        return cordova.getActivity().getContentResolver().query(localfilesystemurl.URL, null, null, null, null);
    }

    public JSONArray readEntriesAtLocalURL(LocalFilesystemURL localfilesystemurl)
        throws FileNotFoundException
    {
        return null;
    }

    public void readFileAtURL(LocalFilesystemURL localfilesystemurl, long l, long l1, Filesystem.ReadFileCallback readfilecallback)
        throws IOException
    {
        long l2;
        localfilesystemurl = resourceApi.openForRead(localfilesystemurl.URL);
        l2 = l1;
        if (l1 < 0L)
        {
            l2 = ((org.apache.cordova.CordovaResourceApi.OpenForReadResult) (localfilesystemurl)).length;
        }
        if (l <= 0L)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        ((org.apache.cordova.CordovaResourceApi.OpenForReadResult) (localfilesystemurl)).inputStream.skip(l);
        readfilecallback.handleData(new Filesystem.LimitedInputStream(this, ((org.apache.cordova.CordovaResourceApi.OpenForReadResult) (localfilesystemurl)).inputStream, l2 - l), ((org.apache.cordova.CordovaResourceApi.OpenForReadResult) (localfilesystemurl)).mimeType);
        ((org.apache.cordova.CordovaResourceApi.OpenForReadResult) (localfilesystemurl)).inputStream.close();
        return;
        readfilecallback;
        ((org.apache.cordova.CordovaResourceApi.OpenForReadResult) (localfilesystemurl)).inputStream.close();
        throw readfilecallback;
    }

    public boolean recursiveRemoveFileAtLocalURL(LocalFilesystemURL localfilesystemurl)
        throws NoModificationAllowedException
    {
        throw new NoModificationAllowedException("Cannot remove content url");
    }

    public boolean removeFileAtLocalURL(LocalFilesystemURL localfilesystemurl)
        throws NoModificationAllowedException
    {
        String s = filesystemPathForURL(localfilesystemurl);
        localfilesystemurl = new File(s);
        try
        {
            cordova.getActivity().getContentResolver().delete(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "_data = ?", new String[] {
                s
            });
        }
        catch (UnsupportedOperationException unsupportedoperationexception) { }
        return localfilesystemurl.delete();
    }

    protected Integer resourceSizeForCursor(Cursor cursor)
    {
        int i = cursor.getColumnIndex("_size");
        if (i != -1)
        {
            cursor = cursor.getString(i);
            if (cursor != null)
            {
                return Integer.valueOf(Integer.parseInt(cursor, 10));
            }
        }
        return null;
    }

    public long truncateFileAtURL(LocalFilesystemURL localfilesystemurl, long l)
        throws NoModificationAllowedException
    {
        throw new NoModificationAllowedException("Couldn't truncate file given its content URI");
    }

    public long writeToFileAtURL(LocalFilesystemURL localfilesystemurl, String s, int i, boolean flag)
        throws NoModificationAllowedException
    {
        throw new NoModificationAllowedException("Couldn't write to file given its content URI");
    }
}

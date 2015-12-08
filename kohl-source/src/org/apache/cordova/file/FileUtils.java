// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.file;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package org.apache.cordova.file:
//            NoModificationAllowedException, InvalidModificationException, EncodingException, FileExistsException, 
//            TypeMismatchException, Filesystem, LocalFilesystemURL, LocalFilesystem, 
//            ContentFilesystem, DirectoryManager

public class FileUtils extends CordovaPlugin
{
    private static interface FileOp
    {

        public abstract void run()
            throws Exception;
    }


    public static int ABORT_ERR = 0;
    public static int ENCODING_ERR = 0;
    public static int INVALID_MODIFICATION_ERR = 0;
    public static int INVALID_STATE_ERR = 0;
    private static final String LOG_TAG = "FileUtils";
    public static int NOT_FOUND_ERR = 1;
    public static int NOT_READABLE_ERR = 4;
    public static int NO_MODIFICATION_ALLOWED_ERR = 6;
    public static int PATH_EXISTS_ERR = 12;
    public static int QUOTA_EXCEEDED_ERR = 10;
    public static int SECURITY_ERR = 2;
    public static int SYNTAX_ERR = 8;
    public static int TYPE_MISMATCH_ERR = 11;
    public static int UNKNOWN_ERR = 1000;
    private static FileUtils filePlugin;
    private boolean configured;
    private ArrayList filesystems;

    public FileUtils()
    {
        configured = false;
    }

    private Filesystem filesystemForName(String s)
    {
        for (Iterator iterator = filesystems.iterator(); iterator.hasNext();)
        {
            Filesystem filesystem = (Filesystem)iterator.next();
            if (filesystem != null && filesystem.name != null && filesystem.name.equals(s))
            {
                return filesystem;
            }
        }

        return null;
    }

    private Filesystem filesystemForURL(LocalFilesystemURL localfilesystemurl)
    {
        if (localfilesystemurl == null)
        {
            return null;
        } else
        {
            return filesystemForName(localfilesystemurl.filesystemName);
        }
    }

    public static JSONObject getEntry(File file)
        throws JSONException
    {
        if (getFilePlugin() != null)
        {
            return getFilePlugin().getEntryForFile(file);
        } else
        {
            return null;
        }
    }

    private JSONObject getFile(String s, String s1, JSONObject jsonobject, boolean flag)
        throws FileExistsException, IOException, TypeMismatchException, EncodingException, JSONException
    {
        Filesystem filesystem;
        try
        {
            s = new LocalFilesystemURL(s);
            filesystem = filesystemForURL(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new MalformedURLException("Unrecognized filesystem URL");
        }
        if (filesystem != null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        throw new MalformedURLException("No installed handlers for this URL");
        s = filesystem.getFileForLocalURL(s, s1, jsonobject, flag);
        return s;
    }

    private JSONObject getFileMetadata(String s)
        throws FileNotFoundException, JSONException, MalformedURLException
    {
        Filesystem filesystem;
        try
        {
            s = new LocalFilesystemURL(s);
            filesystem = filesystemForURL(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new MalformedURLException("Unrecognized filesystem URL");
        }
        if (filesystem != null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        throw new MalformedURLException("No installed handlers for this URL");
        s = filesystem.getFileMetadataForLocalURL(s);
        return s;
    }

    public static FileUtils getFilePlugin()
    {
        return filePlugin;
    }

    private JSONObject getParent(String s)
        throws JSONException, IOException
    {
        Filesystem filesystem;
        try
        {
            s = new LocalFilesystemURL(s);
            filesystem = filesystemForURL(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new MalformedURLException("Unrecognized filesystem URL");
        }
        if (filesystem != null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        throw new MalformedURLException("No installed handlers for this URL");
        s = filesystem.getParentForLocalURL(s);
        return s;
    }

    private JSONArray readEntries(String s)
        throws FileNotFoundException, JSONException, MalformedURLException
    {
        Filesystem filesystem;
        try
        {
            s = new LocalFilesystemURL(s);
            filesystem = filesystemForURL(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new MalformedURLException("Unrecognized filesystem URL");
        }
        if (filesystem != null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        throw new MalformedURLException("No installed handlers for this URL");
        s = filesystem.readEntriesAtLocalURL(s);
        return s;
    }

    private boolean remove(String s)
        throws NoModificationAllowedException, InvalidModificationException, MalformedURLException
    {
        try
        {
            s = new LocalFilesystemURL(s);
            if ("".equals(((LocalFilesystemURL) (s)).fullPath) || "/".equals(((LocalFilesystemURL) (s)).fullPath))
            {
                throw new NoModificationAllowedException("You can't delete the root directory");
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new MalformedURLException("Unrecognized filesystem URL");
        }
        Filesystem filesystem = filesystemForURL(s);
        if (filesystem != null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        throw new MalformedURLException("No installed handlers for this URL");
        boolean flag = filesystem.removeFileAtLocalURL(s);
        return flag;
    }

    private boolean removeRecursively(String s)
        throws FileExistsException, NoModificationAllowedException, MalformedURLException
    {
        try
        {
            s = new LocalFilesystemURL(s);
            if ("".equals(((LocalFilesystemURL) (s)).fullPath) || "/".equals(((LocalFilesystemURL) (s)).fullPath))
            {
                throw new NoModificationAllowedException("You can't delete the root directory");
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new MalformedURLException("Unrecognized filesystem URL");
        }
        Filesystem filesystem = filesystemForURL(s);
        if (filesystem != null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        throw new MalformedURLException("No installed handlers for this URL");
        boolean flag = filesystem.recursiveRemoveFileAtLocalURL(s);
        return flag;
    }

    private JSONArray requestAllFileSystems()
        throws IOException, JSONException
    {
        JSONArray jsonarray = new JSONArray();
        Filesystem filesystem;
        for (Iterator iterator = filesystems.iterator(); iterator.hasNext(); jsonarray.put(filesystem.getEntryForLocalURL(new LocalFilesystemURL((new StringBuilder()).append("cdvfile://localhost/").append(filesystem.name).append("/").toString()))))
        {
            filesystem = (Filesystem)iterator.next();
        }

        return jsonarray;
    }

    private JSONObject requestAllPaths()
        throws JSONException
    {
        Activity activity = cordova.getActivity();
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("applicationDirectory", "file:///android_asset/");
        jsonobject.put("applicationStorageDirectory", toDirUrl(activity.getFilesDir().getParentFile()));
        jsonobject.put("dataDirectory", toDirUrl(activity.getFilesDir()));
        jsonobject.put("cacheDirectory", toDirUrl(activity.getCacheDir()));
        if (Environment.getExternalStorageState().equals("mounted"))
        {
            try
            {
                jsonobject.put("externalApplicationStorageDirectory", toDirUrl(activity.getExternalFilesDir(null).getParentFile()));
                jsonobject.put("externalDataDirectory", toDirUrl(activity.getExternalFilesDir(null)));
                jsonobject.put("externalCacheDirectory", toDirUrl(activity.getExternalCacheDir()));
                jsonobject.put("externalRootDirectory", toDirUrl(Environment.getExternalStorageDirectory()));
            }
            catch (NullPointerException nullpointerexception)
            {
                Log.d("FileUtils", "Unable to access these paths, most liklely due to USB storage");
                return jsonobject;
            }
        }
        return jsonobject;
    }

    private JSONObject requestFileSystem(int i)
        throws IOException, JSONException
    {
        Filesystem filesystem;
        JSONObject jsonobject;
        jsonobject = new JSONObject();
        filesystem = null;
        Filesystem filesystem1 = (Filesystem)filesystems.get(i);
        filesystem = filesystem1;
_L2:
        if (filesystem == null)
        {
            throw new IOException("No filesystem of type requested");
        } else
        {
            LocalFilesystemURL localfilesystemurl = new LocalFilesystemURL((new StringBuilder()).append("cdvfile://localhost/").append(filesystem.name).append("/").toString());
            jsonobject.put("name", filesystem.name);
            jsonobject.put("root", filesystem.getEntryForLocalURL(localfilesystemurl));
            return jsonobject;
        }
        ArrayIndexOutOfBoundsException arrayindexoutofboundsexception;
        arrayindexoutofboundsexception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private JSONObject resolveLocalFileSystemURI(String s)
        throws IOException, JSONException
    {
        Object obj;
        if (s == null)
        {
            throw new MalformedURLException("Unrecognized filesystem URL");
        }
        if (s.startsWith("file:/"))
        {
            obj = s;
            if (!s.startsWith("file://"))
            {
                obj = (new StringBuilder()).append("file:///").append(s.substring(6)).toString();
            }
            s = URLDecoder.decode(((String) (obj)), "UTF-8");
            int i = s.indexOf("?");
            if (i < 0)
            {
                i = s.length();
            }
            int j = s.indexOf("/", 7);
            if (j < 0 || j > i)
            {
                s = "";
            } else
            {
                s = s.substring(j, i);
            }
            s = filesystemURLforLocalPath(s);
        } else
        {
            s = new LocalFilesystemURL(s);
        }
        try
        {
            obj = filesystemForURL(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new MalformedURLException("Unrecognized filesystem URL");
        }
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_179;
        }
        throw new MalformedURLException("No installed handlers for this URL");
        s = ((Filesystem) (obj)).getEntryForLocalURL(s);
        return s;
    }

    private void threadhelper(final FileOp f, final CallbackContext callbackContext)
    {
        cordova.getThreadPool().execute(new Runnable() {

            final FileUtils this$0;
            final CallbackContext val$callbackContext;
            final FileOp val$f;

            public void run()
            {
                try
                {
                    f.run();
                    return;
                }
                catch (Exception exception)
                {
                    exception.printStackTrace();
                    if (exception instanceof EncodingException)
                    {
                        callbackContext.error(FileUtils.ENCODING_ERR);
                        return;
                    }
                    if (exception instanceof FileNotFoundException)
                    {
                        callbackContext.error(FileUtils.NOT_FOUND_ERR);
                        return;
                    }
                    if (exception instanceof FileExistsException)
                    {
                        callbackContext.error(FileUtils.PATH_EXISTS_ERR);
                        return;
                    }
                    if (exception instanceof NoModificationAllowedException)
                    {
                        callbackContext.error(FileUtils.NO_MODIFICATION_ALLOWED_ERR);
                        return;
                    }
                    if (exception instanceof InvalidModificationException)
                    {
                        callbackContext.error(FileUtils.INVALID_MODIFICATION_ERR);
                        return;
                    }
                    if (exception instanceof MalformedURLException)
                    {
                        callbackContext.error(FileUtils.ENCODING_ERR);
                        return;
                    }
                    if (exception instanceof IOException)
                    {
                        callbackContext.error(FileUtils.INVALID_MODIFICATION_ERR);
                        return;
                    }
                    if (exception instanceof EncodingException)
                    {
                        callbackContext.error(FileUtils.ENCODING_ERR);
                        return;
                    }
                    if (exception instanceof TypeMismatchException)
                    {
                        callbackContext.error(FileUtils.TYPE_MISMATCH_ERR);
                        return;
                    } else
                    {
                        callbackContext.error(FileUtils.UNKNOWN_ERR);
                        return;
                    }
                }
            }

            
            {
                this$0 = FileUtils.this;
                f = fileop;
                callbackContext = callbackcontext;
                super();
            }
        });
    }

    private static String toDirUrl(File file)
    {
        return (new StringBuilder()).append(Uri.fromFile(file).toString()).append('/').toString();
    }

    private JSONObject transferTo(String s, String s1, String s2, boolean flag)
        throws JSONException, NoModificationAllowedException, IOException, InvalidModificationException, EncodingException, FileExistsException
    {
        if (s == null || s1 == null)
        {
            throw new FileNotFoundException();
        }
        s = new LocalFilesystemURL(s);
        s1 = new LocalFilesystemURL(s1);
        Filesystem filesystem = filesystemForURL(s);
        Filesystem filesystem1 = filesystemForURL(s1);
        if (s2 != null && s2.contains(":"))
        {
            throw new EncodingException("Bad file name");
        } else
        {
            return filesystem1.copyFileToURL(s1, s2, filesystem, s, flag);
        }
    }

    private long truncateFile(String s, long l)
        throws FileNotFoundException, IOException, NoModificationAllowedException
    {
        Filesystem filesystem;
        try
        {
            s = new LocalFilesystemURL(s);
            filesystem = filesystemForURL(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new MalformedURLException("Unrecognized filesystem URL");
        }
        if (filesystem != null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        throw new MalformedURLException("No installed handlers for this URL");
        l = filesystem.truncateFileAtURL(s, l);
        return l;
    }

    public boolean execute(String s, JSONArray jsonarray, final CallbackContext callbackContext)
        throws JSONException
    {
        if (!configured)
        {
            callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.PluginResult.Status.ERROR, "File plugin is not configured. Please see the README.md file for details on how to update config.xml"));
            return true;
        }
        if (s.equals("testSaveLocationExists"))
        {
            threadhelper(new FileOp() {

                final FileUtils this$0;
                final CallbackContext val$callbackContext;

                public void run()
                {
                    boolean flag = DirectoryManager.testSaveLocationExists();
                    callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.PluginResult.Status.OK, flag));
                }

            
            {
                this$0 = FileUtils.this;
                callbackContext = callbackcontext;
                super();
            }
            }, callbackContext);
        } else
        if (s.equals("getFreeDiskSpace"))
        {
            threadhelper(new FileOp() {

                final FileUtils this$0;
                final CallbackContext val$callbackContext;

                public void run()
                {
                    long l2 = DirectoryManager.getFreeDiskSpace(false);
                    callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.PluginResult.Status.OK, l2));
                }

            
            {
                this$0 = FileUtils.this;
                callbackContext = callbackcontext;
                super();
            }
            }, callbackContext);
        } else
        if (s.equals("testFileExists"))
        {
            threadhelper(new FileOp() {

                final FileUtils this$0;
                final CallbackContext val$callbackContext;
                final String val$fname;

                public void run()
                {
                    boolean flag = DirectoryManager.testFileExists(fname);
                    callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.PluginResult.Status.OK, flag));
                }

            
            {
                this$0 = FileUtils.this;
                fname = s;
                callbackContext = callbackcontext;
                super();
            }
            }, callbackContext);
        } else
        if (s.equals("testDirectoryExists"))
        {
            threadhelper(new FileOp() {

                final FileUtils this$0;
                final CallbackContext val$callbackContext;
                final String val$fname;

                public void run()
                {
                    boolean flag = DirectoryManager.testFileExists(fname);
                    callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.PluginResult.Status.OK, flag));
                }

            
            {
                this$0 = FileUtils.this;
                fname = s;
                callbackContext = callbackcontext;
                super();
            }
            }, callbackContext);
        } else
        if (s.equals("readAsText"))
        {
            s = jsonarray.getString(1);
            int i = jsonarray.getInt(2);
            int j1 = jsonarray.getInt(3);
            threadhelper(new FileOp() {

                final FileUtils this$0;
                final CallbackContext val$callbackContext;
                final String val$encoding;
                final int val$end;
                final String val$fname;
                final int val$start;

                public void run()
                    throws MalformedURLException
                {
                    readFileAs(fname, start, end, callbackContext, encoding, 1);
                }

            
            {
                this$0 = FileUtils.this;
                fname = s;
                start = i;
                end = j;
                callbackContext = callbackcontext;
                encoding = s1;
                super();
            }
            }, callbackContext);
        } else
        if (s.equals("readAsDataURL"))
        {
            int j = jsonarray.getInt(1);
            int k1 = jsonarray.getInt(2);
            threadhelper(new FileOp() {

                final FileUtils this$0;
                final CallbackContext val$callbackContext;
                final int val$end;
                final String val$fname;
                final int val$start;

                public void run()
                    throws MalformedURLException
                {
                    readFileAs(fname, start, end, callbackContext, null, -1);
                }

            
            {
                this$0 = FileUtils.this;
                fname = s;
                start = i;
                end = j;
                callbackContext = callbackcontext;
                super();
            }
            }, callbackContext);
        } else
        if (s.equals("readAsArrayBuffer"))
        {
            int k = jsonarray.getInt(1);
            int l1 = jsonarray.getInt(2);
            threadhelper(new FileOp() {

                final FileUtils this$0;
                final CallbackContext val$callbackContext;
                final int val$end;
                final String val$fname;
                final int val$start;

                public void run()
                    throws MalformedURLException
                {
                    readFileAs(fname, start, end, callbackContext, null, 6);
                }

            
            {
                this$0 = FileUtils.this;
                fname = s;
                start = i;
                end = j;
                callbackContext = callbackcontext;
                super();
            }
            }, callbackContext);
        } else
        if (s.equals("readAsBinaryString"))
        {
            int l = jsonarray.getInt(1);
            int i2 = jsonarray.getInt(2);
            threadhelper(new FileOp() {

                final FileUtils this$0;
                final CallbackContext val$callbackContext;
                final int val$end;
                final String val$fname;
                final int val$start;

                public void run()
                    throws MalformedURLException
                {
                    readFileAs(fname, start, end, callbackContext, null, 7);
                }

            
            {
                this$0 = FileUtils.this;
                fname = s;
                start = i;
                end = j;
                callbackContext = callbackcontext;
                super();
            }
            }, callbackContext);
        } else
        if (s.equals("write"))
        {
            threadhelper(new FileOp() {

                final FileUtils this$0;
                final CallbackContext val$callbackContext;
                final String val$data;
                final String val$fname;
                final Boolean val$isBinary;
                final int val$offset;

                public void run()
                    throws FileNotFoundException, IOException, NoModificationAllowedException
                {
                    long l2 = write(fname, data, offset, isBinary.booleanValue());
                    callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.PluginResult.Status.OK, l2));
                }

            
            {
                this$0 = FileUtils.this;
                fname = s;
                data = s1;
                offset = i;
                isBinary = boolean1;
                callbackContext = callbackcontext;
                super();
            }
            }, callbackContext);
        } else
        if (s.equals("truncate"))
        {
            threadhelper(new FileOp() {

                final FileUtils this$0;
                final CallbackContext val$callbackContext;
                final String val$fname;
                final int val$offset;

                public void run()
                    throws FileNotFoundException, IOException, NoModificationAllowedException
                {
                    long l2 = truncateFile(fname, offset);
                    callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.PluginResult.Status.OK, l2));
                }

            
            {
                this$0 = FileUtils.this;
                fname = s;
                offset = i;
                callbackContext = callbackcontext;
                super();
            }
            }, callbackContext);
        } else
        if (s.equals("requestAllFileSystems"))
        {
            threadhelper(new FileOp() {

                final FileUtils this$0;
                final CallbackContext val$callbackContext;

                public void run()
                    throws IOException, JSONException
                {
                    callbackContext.success(requestAllFileSystems());
                }

            
            {
                this$0 = FileUtils.this;
                callbackContext = callbackcontext;
                super();
            }
            }, callbackContext);
        } else
        if (s.equals("requestAllPaths"))
        {
            cordova.getThreadPool().execute(new Runnable() {

                final FileUtils this$0;
                final CallbackContext val$callbackContext;

                public void run()
                {
                    try
                    {
                        callbackContext.success(requestAllPaths());
                        return;
                    }
                    catch (JSONException jsonexception)
                    {
                        jsonexception.printStackTrace();
                    }
                }

            
            {
                this$0 = FileUtils.this;
                callbackContext = callbackcontext;
                super();
            }
            });
        } else
        if (s.equals("requestFileSystem"))
        {
            int i1 = jsonarray.getInt(0);
            threadhelper(new FileOp() {

                final FileUtils this$0;
                final CallbackContext val$callbackContext;
                final int val$fstype;
                final long val$size;

                public void run()
                    throws IOException, JSONException
                {
                    if (size != 0L && size > DirectoryManager.getFreeDiskSpace(true) * 1024L)
                    {
                        callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.PluginResult.Status.ERROR, FileUtils.QUOTA_EXCEEDED_ERR));
                        return;
                    } else
                    {
                        JSONObject jsonobject = requestFileSystem(fstype);
                        callbackContext.success(jsonobject);
                        return;
                    }
                }

            
            {
                this$0 = FileUtils.this;
                size = l;
                callbackContext = callbackcontext;
                fstype = i;
                super();
            }
            }, callbackContext);
        } else
        if (s.equals("resolveLocalFileSystemURI"))
        {
            threadhelper(new FileOp() {

                final FileUtils this$0;
                final CallbackContext val$callbackContext;
                final String val$fname;

                public void run()
                    throws IOException, JSONException
                {
                    JSONObject jsonobject = resolveLocalFileSystemURI(fname);
                    callbackContext.success(jsonobject);
                }

            
            {
                this$0 = FileUtils.this;
                fname = s;
                callbackContext = callbackcontext;
                super();
            }
            }, callbackContext);
        } else
        if (s.equals("getFileMetadata"))
        {
            threadhelper(new FileOp() {

                final FileUtils this$0;
                final CallbackContext val$callbackContext;
                final String val$fname;

                public void run()
                    throws FileNotFoundException, JSONException, MalformedURLException
                {
                    JSONObject jsonobject = getFileMetadata(fname);
                    callbackContext.success(jsonobject);
                }

            
            {
                this$0 = FileUtils.this;
                fname = s;
                callbackContext = callbackcontext;
                super();
            }
            }, callbackContext);
        } else
        if (s.equals("getParent"))
        {
            threadhelper(new FileOp() {

                final FileUtils this$0;
                final CallbackContext val$callbackContext;
                final String val$fname;

                public void run()
                    throws JSONException, IOException
                {
                    JSONObject jsonobject = getParent(fname);
                    callbackContext.success(jsonobject);
                }

            
            {
                this$0 = FileUtils.this;
                fname = s;
                callbackContext = callbackcontext;
                super();
            }
            }, callbackContext);
        } else
        if (s.equals("getDirectory"))
        {
            threadhelper(new FileOp() {

                final FileUtils this$0;
                final JSONArray val$args;
                final CallbackContext val$callbackContext;
                final String val$dirname;
                final String val$path;

                public void run()
                    throws FileExistsException, IOException, TypeMismatchException, EncodingException, JSONException
                {
                    JSONObject jsonobject = getFile(dirname, path, args.optJSONObject(2), true);
                    callbackContext.success(jsonobject);
                }

            
            {
                this$0 = FileUtils.this;
                dirname = s;
                path = s1;
                args = jsonarray;
                callbackContext = callbackcontext;
                super();
            }
            }, callbackContext);
        } else
        if (s.equals("getFile"))
        {
            threadhelper(new FileOp() {

                final FileUtils this$0;
                final JSONArray val$args;
                final CallbackContext val$callbackContext;
                final String val$dirname;
                final String val$path;

                public void run()
                    throws FileExistsException, IOException, TypeMismatchException, EncodingException, JSONException
                {
                    JSONObject jsonobject = getFile(dirname, path, args.optJSONObject(2), false);
                    callbackContext.success(jsonobject);
                }

            
            {
                this$0 = FileUtils.this;
                dirname = s;
                path = s1;
                args = jsonarray;
                callbackContext = callbackcontext;
                super();
            }
            }, callbackContext);
        } else
        if (s.equals("remove"))
        {
            threadhelper(new FileOp() {

                final FileUtils this$0;
                final CallbackContext val$callbackContext;
                final String val$fname;

                public void run()
                    throws NoModificationAllowedException, InvalidModificationException, MalformedURLException
                {
                    if (remove(fname))
                    {
                        callbackContext.success();
                        return;
                    } else
                    {
                        callbackContext.error(FileUtils.NO_MODIFICATION_ALLOWED_ERR);
                        return;
                    }
                }

            
            {
                this$0 = FileUtils.this;
                fname = s;
                callbackContext = callbackcontext;
                super();
            }
            }, callbackContext);
        } else
        if (s.equals("removeRecursively"))
        {
            threadhelper(new FileOp() {

                final FileUtils this$0;
                final CallbackContext val$callbackContext;
                final String val$fname;

                public void run()
                    throws FileExistsException, MalformedURLException, NoModificationAllowedException
                {
                    if (removeRecursively(fname))
                    {
                        callbackContext.success();
                        return;
                    } else
                    {
                        callbackContext.error(FileUtils.NO_MODIFICATION_ALLOWED_ERR);
                        return;
                    }
                }

            
            {
                this$0 = FileUtils.this;
                fname = s;
                callbackContext = callbackcontext;
                super();
            }
            }, callbackContext);
        } else
        if (s.equals("moveTo"))
        {
            threadhelper(new FileOp() {

                final FileUtils this$0;
                final CallbackContext val$callbackContext;
                final String val$fname;
                final String val$newName;
                final String val$newParent;

                public void run()
                    throws JSONException, NoModificationAllowedException, IOException, InvalidModificationException, EncodingException, FileExistsException
                {
                    JSONObject jsonobject = transferTo(fname, newParent, newName, true);
                    callbackContext.success(jsonobject);
                }

            
            {
                this$0 = FileUtils.this;
                fname = s;
                newParent = s1;
                newName = s2;
                callbackContext = callbackcontext;
                super();
            }
            }, callbackContext);
        } else
        if (s.equals("copyTo"))
        {
            threadhelper(new FileOp() {

                final FileUtils this$0;
                final CallbackContext val$callbackContext;
                final String val$fname;
                final String val$newName;
                final String val$newParent;

                public void run()
                    throws JSONException, NoModificationAllowedException, IOException, InvalidModificationException, EncodingException, FileExistsException
                {
                    JSONObject jsonobject = transferTo(fname, newParent, newName, false);
                    callbackContext.success(jsonobject);
                }

            
            {
                this$0 = FileUtils.this;
                fname = s;
                newParent = s1;
                newName = s2;
                callbackContext = callbackcontext;
                super();
            }
            }, callbackContext);
        } else
        if (s.equals("readEntries"))
        {
            threadhelper(new FileOp() {

                final FileUtils this$0;
                final CallbackContext val$callbackContext;
                final String val$fname;

                public void run()
                    throws FileNotFoundException, JSONException, MalformedURLException
                {
                    JSONArray jsonarray1 = readEntries(fname);
                    callbackContext.success(jsonarray1);
                }

            
            {
                this$0 = FileUtils.this;
                fname = s;
                callbackContext = callbackcontext;
                super();
            }
            }, callbackContext);
        } else
        if (s.equals("_getLocalFilesystemPath"))
        {
            threadhelper(new FileOp() {

                final FileUtils this$0;
                final CallbackContext val$callbackContext;
                final String val$localURLstr;

                public void run()
                    throws FileNotFoundException, JSONException, MalformedURLException
                {
                    String s1 = filesystemPathForURL(localURLstr);
                    callbackContext.success(s1);
                }

            
            {
                this$0 = FileUtils.this;
                localURLstr = s;
                callbackContext = callbackcontext;
                super();
            }
            }, callbackContext);
        } else
        {
            return false;
        }
        return true;
    }

    public String filesystemPathForURL(String s)
        throws MalformedURLException
    {
        Filesystem filesystem;
        try
        {
            s = new LocalFilesystemURL(s);
            filesystem = filesystemForURL(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new MalformedURLException("Unrecognized filesystem URL");
        }
        if (filesystem != null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        throw new MalformedURLException("No installed handlers for this URL");
        s = filesystem.filesystemPathForURL(s);
        return s;
    }

    public LocalFilesystemURL filesystemURLforLocalPath(String s)
    {
        LocalFilesystemURL localfilesystemurl = null;
        int i = 0;
        Iterator iterator = filesystems.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (Filesystem)iterator.next();
            if (obj != null)
            {
                obj = ((Filesystem) (obj)).URLforFilesystemPath(s);
                if (obj != null && (localfilesystemurl == null || ((LocalFilesystemURL) (obj)).fullPath.length() < i))
                {
                    localfilesystemurl = ((LocalFilesystemURL) (obj));
                    i = ((LocalFilesystemURL) (obj)).fullPath.length();
                }
            }
        } while (true);
        return localfilesystemurl;
    }

    protected HashMap getAvailableFileSystems(Activity activity)
    {
        Context context = activity.getApplicationContext();
        activity = new HashMap();
        activity.put("files", context.getFilesDir().getAbsolutePath());
        activity.put("documents", (new File(context.getFilesDir(), "Documents")).getAbsolutePath());
        activity.put("cache", context.getCacheDir().getAbsolutePath());
        activity.put("root", "/");
        if (Environment.getExternalStorageState().equals("mounted"))
        {
            try
            {
                activity.put("files-external", context.getExternalFilesDir(null).getAbsolutePath());
                activity.put("sdcard", Environment.getExternalStorageDirectory().getAbsolutePath());
                activity.put("cache-external", context.getExternalCacheDir().getAbsolutePath());
            }
            catch (NullPointerException nullpointerexception)
            {
                Log.d("FileUtils", "External storage unavailable, check to see if USB Mass Storage Mode is on");
                return activity;
            }
        }
        return activity;
    }

    public JSONObject getEntryForFile(File file)
        throws JSONException
    {
        for (Iterator iterator = filesystems.iterator(); iterator.hasNext();)
        {
            JSONObject jsonobject = ((Filesystem)iterator.next()).makeEntryForFile(file);
            if (jsonobject != null)
            {
                return jsonobject;
            }
        }

        return null;
    }

    protected String[] getExtraFileSystemsPreference(Activity activity)
    {
        String s = activity.getIntent().getStringExtra("androidextrafilesystems");
        activity = s;
        if (s == null)
        {
            activity = "files,files-external,documents,sdcard,cache,cache-external,root";
        }
        return activity.split(",");
    }

    public void initialize(CordovaInterface cordovainterface, CordovaWebView cordovawebview)
    {
        super.initialize(cordovainterface, cordovawebview);
        filesystems = new ArrayList();
        String s = null;
        Activity activity = cordovainterface.getActivity();
        String s4 = activity.getPackageName();
        String s1 = activity.getIntent().getStringExtra("androidpersistentfilelocation");
        String s2 = s1;
        if (s1 == null)
        {
            s2 = "compatibility";
        }
        s1 = activity.getCacheDir().getAbsolutePath();
        String s3;
        if ("internal".equalsIgnoreCase(s2))
        {
            s = (new StringBuilder()).append(activity.getFilesDir().getAbsolutePath()).append("/files/").toString();
            configured = true;
            s3 = s1;
        } else
        {
            s3 = s1;
            if ("compatibility".equalsIgnoreCase(s2))
            {
                if (Environment.getExternalStorageState().equals("mounted"))
                {
                    s = Environment.getExternalStorageDirectory().getAbsolutePath();
                    s1 = (new StringBuilder()).append(Environment.getExternalStorageDirectory().getAbsolutePath()).append("/Android/data/").append(s4).append("/cache/").toString();
                } else
                {
                    s = (new StringBuilder()).append("/data/data/").append(s4).toString();
                }
                configured = true;
                s3 = s1;
            }
        }
        if (configured)
        {
            (new File(s3)).mkdirs();
            (new File(s)).mkdirs();
            registerFilesystem(new LocalFilesystem("temporary", cordovainterface, s3));
            registerFilesystem(new LocalFilesystem("persistent", cordovainterface, s));
            registerFilesystem(new ContentFilesystem("content", cordovainterface, cordovawebview));
            registerExtraFileSystems(getExtraFileSystemsPreference(activity), getAvailableFileSystems(activity));
            if (filePlugin == null)
            {
                filePlugin = this;
            }
            return;
        } else
        {
            Log.e("FileUtils", "File plugin configuration error: Please set AndroidPersistentFileLocation in config.xml to one of \"internal\" (for new applications) or \"compatibility\" (for compatibility with previous versions)");
            activity.finish();
            return;
        }
    }

    public void readFileAs(String s, int i, int j, final CallbackContext callbackContext, final String encoding, final int resultType)
        throws MalformedURLException
    {
        Filesystem filesystem;
        s = new LocalFilesystemURL(s);
        filesystem = filesystemForURL(s);
        if (filesystem == null)
        {
            long l;
            long l1;
            try
            {
                throw new MalformedURLException("No installed handlers for this URL");
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new MalformedURLException("Unrecognized filesystem URL");
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.PluginResult.Status.IO_EXCEPTION, NOT_FOUND_ERR));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Log.d("FileUtils", s.getLocalizedMessage());
            }
            break MISSING_BLOCK_LABEL_108;
        }
        l = i;
        l1 = j;
        filesystem.readFileAtURL(s, l, l1, new Filesystem.ReadFileCallback() {

            final FileUtils this$0;
            final CallbackContext val$callbackContext;
            final String val$encoding;
            final int val$resultType;

            public void handleData(InputStream inputstream, String s1)
            {
                ByteArrayOutputStream bytearrayoutputstream;
                byte abyte0[];
                bytearrayoutputstream = new ByteArrayOutputStream();
                abyte0 = new byte[8192];
_L7:
                int k = inputstream.read(abyte0, 0, 8192);
                if (k > 0) goto _L2; else goto _L1
_L1:
                resultType;
                JVM INSTR lookupswitch 3: default 243
            //                           1: 184
            //                           6: 206
            //                           7: 224;
                   goto _L3 _L4 _L5 _L6
_L6:
                break MISSING_BLOCK_LABEL_224;
_L3:
                inputstream = Base64.encode(bytearrayoutputstream.toByteArray(), 2);
                inputstream = (new StringBuilder()).append("data:").append(s1).append(";base64,").append(new String(inputstream, "US-ASCII")).toString();
                inputstream = new PluginResult(org.apache.cordova.PluginResult.Status.OK, inputstream);
_L8:
                callbackContext.sendPluginResult(inputstream);
                return;
_L2:
                try
                {
                    bytearrayoutputstream.write(abyte0, 0, k);
                }
                // Misplaced declaration of an exception variable
                catch (InputStream inputstream)
                {
                    Log.d("FileUtils", inputstream.getLocalizedMessage());
                    callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.PluginResult.Status.IO_EXCEPTION, FileUtils.NOT_READABLE_ERR));
                    return;
                }
                  goto _L7
_L4:
                inputstream = new PluginResult(org.apache.cordova.PluginResult.Status.OK, bytearrayoutputstream.toString(encoding));
                  goto _L8
_L5:
                inputstream = new PluginResult(org.apache.cordova.PluginResult.Status.OK, bytearrayoutputstream.toByteArray());
                  goto _L8
                inputstream = new PluginResult(org.apache.cordova.PluginResult.Status.OK, bytearrayoutputstream.toByteArray(), true);
                  goto _L8
            }

            
            {
                this$0 = FileUtils.this;
                resultType = i;
                encoding = s;
                callbackContext = callbackcontext;
                super();
            }
        });
        return;
        callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.PluginResult.Status.IO_EXCEPTION, NOT_READABLE_ERR));
        return;
    }

    protected void registerExtraFileSystems(String as[], HashMap hashmap)
    {
        HashSet hashset = new HashSet();
        int j = as.length;
        int i = 0;
        while (i < j) 
        {
            String s = as[i];
            if (!hashset.contains(s))
            {
                String s1 = (String)hashmap.get(s);
                if (s1 != null)
                {
                    File file = new File(s1);
                    if (file.mkdirs() || file.isDirectory())
                    {
                        registerFilesystem(new LocalFilesystem(s, cordova, s1));
                        hashset.add(s);
                    } else
                    {
                        Log.d("FileUtils", (new StringBuilder()).append("Unable to create root dir for fileystem \"").append(s).append("\", skipping").toString());
                    }
                } else
                {
                    Log.d("FileUtils", (new StringBuilder()).append("Unrecognized extra filesystem identifier: ").append(s).toString());
                }
            }
            i++;
        }
    }

    public void registerFilesystem(Filesystem filesystem)
    {
        if (filesystem != null && filesystemForName(filesystem.name) == null)
        {
            filesystems.add(filesystem);
        }
    }

    public Uri remapUri(Uri uri)
    {
        Filesystem filesystem;
        uri = new LocalFilesystemURL(uri);
        filesystem = filesystemForURL(uri);
        if (filesystem == null)
        {
            return null;
        }
        if (filesystem.filesystemPathForURL(uri) == null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        uri = Uri.parse((new StringBuilder()).append("file:///").append(filesystem.filesystemPathForURL(uri)).toString());
        return uri;
        uri;
        return null;
    }

    public long write(String s, String s1, int i, boolean flag)
        throws FileNotFoundException, IOException, NoModificationAllowedException
    {
        LocalFilesystemURL localfilesystemurl;
        Filesystem filesystem;
        try
        {
            localfilesystemurl = new LocalFilesystemURL(s);
            filesystem = filesystemForURL(localfilesystemurl);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new MalformedURLException("Unrecognized filesystem URL");
        }
        if (filesystem != null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        throw new MalformedURLException("No installed handlers for this URL");
        long l;
        l = filesystem.writeToFileAtURL(localfilesystemurl, s1, i, flag);
        Log.d("TEST", (new StringBuilder()).append(s).append(": ").append(l).toString());
        return l;
    }

    static 
    {
        ABORT_ERR = 3;
        ENCODING_ERR = 5;
        INVALID_STATE_ERR = 7;
        INVALID_MODIFICATION_ERR = 9;
    }












}

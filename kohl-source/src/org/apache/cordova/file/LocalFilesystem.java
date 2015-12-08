// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.file;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.apache.cordova.CordovaInterface;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package org.apache.cordova.file:
//            Filesystem, NoModificationAllowedException, InvalidModificationException, FileExistsException, 
//            LocalFilesystemURL, TypeMismatchException, EncodingException, FileHelper

public class LocalFilesystem extends Filesystem
{

    private CordovaInterface cordova;
    private String fsRoot;

    public LocalFilesystem(String s, CordovaInterface cordovainterface, String s1)
    {
        name = s;
        fsRoot = s1;
        cordova = cordovainterface;
    }

    private void broadcastNewFile(LocalFilesystemURL localfilesystemurl)
    {
        localfilesystemurl = new File(filesystemPathForURL(localfilesystemurl));
        if (localfilesystemurl.exists())
        {
            cordova.getActivity().getApplicationContext().sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.fromFile(localfilesystemurl)));
        }
    }

    private void copyAction(File file, File file1)
        throws FileNotFoundException, IOException
    {
        FileChannel filechannel;
        FileChannel filechannel1;
        file = new FileInputStream(file);
        file1 = new FileOutputStream(file1);
        filechannel = file.getChannel();
        filechannel1 = file1.getChannel();
        filechannel.transferTo(0L, filechannel.size(), filechannel1);
        file.close();
        file1.close();
        filechannel.close();
        filechannel1.close();
        return;
        Exception exception;
        exception;
        file.close();
        file1.close();
        filechannel.close();
        filechannel1.close();
        throw exception;
    }

    private JSONObject copyDirectory(File file, File file1)
        throws JSONException, IOException, NoModificationAllowedException, InvalidModificationException
    {
        if (file1.exists() && file1.isFile())
        {
            throw new InvalidModificationException("Can't rename a file to a directory");
        }
        if (isCopyOnItself(file.getAbsolutePath(), file1.getAbsolutePath()))
        {
            throw new InvalidModificationException("Can't copy itself into itself");
        }
        if (!file1.exists() && !file1.mkdir())
        {
            throw new NoModificationAllowedException("Couldn't create the destination directory");
        }
        file = file.listFiles();
        int j = file.length;
        int i = 0;
        while (i < j) 
        {
            File file2 = file[i];
            File file3 = new File((new StringBuilder()).append(file1.getAbsoluteFile()).append(File.separator).append(file2.getName()).toString());
            if (file2.isDirectory())
            {
                copyDirectory(file2, file3);
            } else
            {
                copyFile(file2, file3);
            }
            i++;
        }
        return makeEntryForFile(file1);
    }

    private JSONObject copyFile(File file, File file1)
        throws IOException, InvalidModificationException, JSONException
    {
        if (file1.exists() && file1.isDirectory())
        {
            throw new InvalidModificationException("Can't rename a file to a directory");
        } else
        {
            copyAction(file, file1);
            return makeEntryForFile(file1);
        }
    }

    private String fullPathForFilesystemPath(String s)
    {
        if (s != null && s.startsWith(fsRoot))
        {
            return s.substring(fsRoot.length());
        } else
        {
            return null;
        }
    }

    private boolean isCopyOnItself(String s, String s1)
    {
        return s1.equals(s) || s1.startsWith((new StringBuilder()).append(s).append(File.separator).toString());
    }

    private JSONObject moveDirectory(File file, File file1)
        throws IOException, JSONException, InvalidModificationException, NoModificationAllowedException, FileExistsException
    {
label0:
        {
            if (file1.exists() && file1.isFile())
            {
                throw new InvalidModificationException("Can't rename a file to a directory");
            }
            if (isCopyOnItself(file.getAbsolutePath(), file1.getAbsolutePath()))
            {
                throw new InvalidModificationException("Can't move itself into itself");
            }
            if (file1.exists() && file1.list().length > 0)
            {
                throw new InvalidModificationException("directory is not empty");
            }
            if (!file.renameTo(file1))
            {
                copyDirectory(file, file1);
                if (!file1.exists())
                {
                    break label0;
                }
                removeDirRecursively(file);
            }
            return makeEntryForFile(file1);
        }
        throw new IOException("moved failed");
    }

    private JSONObject moveFile(File file, File file1)
        throws IOException, JSONException, InvalidModificationException
    {
label0:
        {
            if (file1.exists() && file1.isDirectory())
            {
                throw new InvalidModificationException("Can't rename a file to a directory");
            }
            if (!file.renameTo(file1))
            {
                copyAction(file, file1);
                if (!file1.exists())
                {
                    break label0;
                }
                file.delete();
            }
            return makeEntryForFile(file1);
        }
        throw new IOException("moved failed");
    }

    public LocalFilesystemURL URLforFilesystemPath(String s)
    {
        return URLforFullPath(fullPathForFilesystemPath(s));
    }

    protected LocalFilesystemURL URLforFullPath(String s)
    {
        if (s != null)
        {
            if (s.startsWith("/"))
            {
                return new LocalFilesystemURL((new StringBuilder()).append("cdvfile://localhost/").append(name).append(s).toString());
            } else
            {
                return new LocalFilesystemURL((new StringBuilder()).append("cdvfile://localhost/").append(name).append("/").append(s).toString());
            }
        } else
        {
            return null;
        }
    }

    public boolean canRemoveFileAtLocalURL(LocalFilesystemURL localfilesystemurl)
    {
        return (new File(filesystemPathForURL(localfilesystemurl))).exists();
    }

    public JSONObject copyFileToURL(LocalFilesystemURL localfilesystemurl, String s, Filesystem filesystem, LocalFilesystemURL localfilesystemurl1, boolean flag)
        throws IOException, InvalidModificationException, JSONException, NoModificationAllowedException, FileExistsException
    {
        if (!(new File(filesystemPathForURL(localfilesystemurl))).exists())
        {
            throw new FileNotFoundException("The source does not exist");
        }
        if (org/apache/cordova/file/LocalFilesystem.isInstance(filesystem))
        {
            localfilesystemurl = makeDestinationURL(s, localfilesystemurl1, localfilesystemurl);
            s = new File(filesystem.filesystemPathForURL(localfilesystemurl1));
            localfilesystemurl = new File(filesystemPathForURL(localfilesystemurl));
            if (!s.exists())
            {
                throw new FileNotFoundException("The source does not exist");
            }
            if (s.getAbsolutePath().equals(localfilesystemurl.getAbsolutePath()))
            {
                throw new InvalidModificationException("Can't copy a file onto itself");
            }
            if (s.isDirectory())
            {
                if (flag)
                {
                    return moveDirectory(s, localfilesystemurl);
                } else
                {
                    return copyDirectory(s, localfilesystemurl);
                }
            }
            if (flag)
            {
                return moveFile(s, localfilesystemurl);
            } else
            {
                return copyFile(s, localfilesystemurl);
            }
        } else
        {
            return super.copyFileToURL(localfilesystemurl, s, filesystem, localfilesystemurl1, flag);
        }
    }

    public String filesystemPathForFullPath(String s)
    {
        String s1 = (new File(fsRoot, s)).toString();
        int i = s1.indexOf("?");
        s = s1;
        if (i >= 0)
        {
            s = s1.substring(0, i);
        }
        s1 = s;
        if (s.length() > 1)
        {
            s1 = s;
            if (s.endsWith("/"))
            {
                s1 = s.substring(0, s.length() - 1);
            }
        }
        return s1;
    }

    public String filesystemPathForURL(LocalFilesystemURL localfilesystemurl)
    {
        return filesystemPathForFullPath(localfilesystemurl.fullPath);
    }

    public JSONObject getEntryForLocalURL(LocalFilesystemURL localfilesystemurl)
        throws IOException
    {
        File file = new File(filesystemPathForURL(localfilesystemurl));
        if (!file.exists())
        {
            throw new FileNotFoundException();
        }
        if (!file.canRead())
        {
            throw new IOException();
        }
        try
        {
            localfilesystemurl = makeEntryForURL(localfilesystemurl, Boolean.valueOf(file.isDirectory()), Uri.fromFile(file).toString());
        }
        // Misplaced declaration of an exception variable
        catch (LocalFilesystemURL localfilesystemurl)
        {
            throw new IOException();
        }
        return localfilesystemurl;
    }

    public JSONObject getFileForLocalURL(LocalFilesystemURL localfilesystemurl, String s, JSONObject jsonobject, boolean flag)
        throws FileExistsException, IOException, TypeMismatchException, EncodingException, JSONException
    {
        boolean flag1 = false;
        boolean flag3 = false;
        boolean flag2 = flag3;
        if (jsonobject != null)
        {
            boolean flag4 = jsonobject.optBoolean("create");
            flag1 = flag4;
            flag2 = flag3;
            if (flag4)
            {
                flag2 = jsonobject.optBoolean("exclusive");
                flag1 = flag4;
            }
        }
        if (s.contains(":"))
        {
            throw new EncodingException("This path has an invalid \":\" in it.");
        }
        if (s.startsWith("/"))
        {
            localfilesystemurl = URLforFilesystemPath(s);
        } else
        {
            localfilesystemurl = URLforFullPath(normalizePath((new StringBuilder()).append(localfilesystemurl.fullPath).append("/").append(s).toString()));
        }
        s = new File(filesystemPathForURL(localfilesystemurl));
        if (flag1)
        {
            if (flag2 && s.exists())
            {
                throw new FileExistsException("create/exclusive fails");
            }
            if (flag)
            {
                s.mkdir();
            } else
            {
                s.createNewFile();
            }
            if (!s.exists())
            {
                throw new FileExistsException("create fails");
            }
        } else
        {
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
        }
        return makeEntryForPath(localfilesystemurl.fullPath, localfilesystemurl.filesystemName, Boolean.valueOf(flag), Uri.fromFile(s).toString());
    }

    public JSONObject getFileMetadataForLocalURL(LocalFilesystemURL localfilesystemurl)
        throws FileNotFoundException
    {
        File file;
        JSONObject jsonobject;
        file = new File(filesystemPathForURL(localfilesystemurl));
        if (!file.exists())
        {
            throw new FileNotFoundException((new StringBuilder()).append("File at ").append(localfilesystemurl.URL).append(" does not exist.").toString());
        }
        jsonobject = new JSONObject();
        if (!file.isDirectory())
        {
            break MISSING_BLOCK_LABEL_142;
        }
        long l = 0L;
_L1:
        try
        {
            jsonobject.put("size", l);
            jsonobject.put("type", FileHelper.getMimeType(file.getAbsolutePath(), cordova));
            jsonobject.put("name", file.getName());
            jsonobject.put("fullPath", localfilesystemurl.fullPath);
            jsonobject.put("lastModifiedDate", file.lastModified());
        }
        // Misplaced declaration of an exception variable
        catch (LocalFilesystemURL localfilesystemurl)
        {
            return null;
        }
        return jsonobject;
        l = file.length();
          goto _L1
    }

    OutputStream getOutputStreamForURL(LocalFilesystemURL localfilesystemurl)
        throws FileNotFoundException
    {
        return new FileOutputStream(new File(filesystemPathForURL(localfilesystemurl)));
    }

    public JSONObject makeEntryForFile(File file)
        throws JSONException
    {
        String s = fullPathForFilesystemPath(file.getAbsolutePath());
        if (s != null)
        {
            return makeEntryForPath(s, name, Boolean.valueOf(file.isDirectory()), Uri.fromFile(file).toString());
        } else
        {
            return null;
        }
    }

    protected String normalizePath(String s)
    {
        boolean flag = s.startsWith("/");
        Object obj = s;
        if (flag)
        {
            obj = s.substring(1);
        }
        obj = new ArrayList(Arrays.asList(((String) (obj)).split("/+")));
        int j;
        for (int i = 0; i < ((ArrayList) (obj)).size(); i = j + 1)
        {
            j = i;
            if (!((String)((ArrayList) (obj)).get(i)).equals(".."))
            {
                continue;
            }
            ((ArrayList) (obj)).remove(i);
            j = i;
            if (i > 0)
            {
                ((ArrayList) (obj)).remove(i - 1);
                j = i - 1;
            }
        }

        s = new StringBuilder();
        String s1;
        for (obj = ((ArrayList) (obj)).iterator(); ((Iterator) (obj)).hasNext(); s.append(s1))
        {
            s1 = (String)((Iterator) (obj)).next();
            s.append("/");
        }

        if (flag)
        {
            return s.toString();
        } else
        {
            return s.toString().substring(1);
        }
    }

    public JSONArray readEntriesAtLocalURL(LocalFilesystemURL localfilesystemurl)
        throws FileNotFoundException
    {
        File file = new File(filesystemPathForURL(localfilesystemurl));
        if (!file.exists())
        {
            throw new FileNotFoundException();
        }
        JSONArray jsonarray = new JSONArray();
        if (file.isDirectory())
        {
            File afile[] = file.listFiles();
            int i = 0;
            while (i < afile.length) 
            {
                if (afile[i].canRead())
                {
                    try
                    {
                        jsonarray.put(makeEntryForPath(fullPathForFilesystemPath(afile[i].getAbsolutePath()), localfilesystemurl.filesystemName, Boolean.valueOf(afile[i].isDirectory()), Uri.fromFile(afile[i]).toString()));
                    }
                    catch (JSONException jsonexception) { }
                }
                i++;
            }
        }
        return jsonarray;
    }

    public void readFileAtURL(LocalFilesystemURL localfilesystemurl, long l, long l1, Filesystem.ReadFileCallback readfilecallback)
        throws IOException
    {
        Object obj;
        long l2;
        obj = new File(filesystemPathForURL(localfilesystemurl));
        localfilesystemurl = FileHelper.getMimeTypeForExtension(((File) (obj)).getAbsolutePath());
        l2 = l1;
        if (l1 < 0L)
        {
            l2 = ((File) (obj)).length();
        }
        obj = new FileInputStream(((File) (obj)));
        if (l <= 0L)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        ((InputStream) (obj)).skip(l);
        readfilecallback.handleData(new Filesystem.LimitedInputStream(this, ((InputStream) (obj)), l2 - l), localfilesystemurl);
        ((InputStream) (obj)).close();
        return;
        localfilesystemurl;
        ((InputStream) (obj)).close();
        throw localfilesystemurl;
    }

    public boolean recursiveRemoveFileAtLocalURL(LocalFilesystemURL localfilesystemurl)
        throws FileExistsException
    {
        return removeDirRecursively(new File(filesystemPathForURL(localfilesystemurl)));
    }

    protected boolean removeDirRecursively(File file)
        throws FileExistsException
    {
        if (file.isDirectory())
        {
            File afile[] = file.listFiles();
            int j = afile.length;
            for (int i = 0; i < j; i++)
            {
                removeDirRecursively(afile[i]);
            }

        }
        if (!file.delete())
        {
            throw new FileExistsException((new StringBuilder()).append("could not delete: ").append(file.getName()).toString());
        } else
        {
            return true;
        }
    }

    public boolean removeFileAtLocalURL(LocalFilesystemURL localfilesystemurl)
        throws InvalidModificationException
    {
        localfilesystemurl = new File(filesystemPathForURL(localfilesystemurl));
        if (localfilesystemurl.isDirectory() && localfilesystemurl.list().length > 0)
        {
            throw new InvalidModificationException("You can't delete a directory that is not empty.");
        } else
        {
            return localfilesystemurl.delete();
        }
    }

    public long truncateFileAtURL(LocalFilesystemURL localfilesystemurl, long l)
        throws IOException
    {
        if (!(new File(filesystemPathForURL(localfilesystemurl))).exists())
        {
            throw new FileNotFoundException((new StringBuilder()).append("File at ").append(localfilesystemurl.URL).append(" does not exist.").toString());
        }
        localfilesystemurl = new RandomAccessFile(filesystemPathForURL(localfilesystemurl), "rw");
        if (localfilesystemurl.length() < l)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        localfilesystemurl.getChannel().truncate(l);
        localfilesystemurl.close();
        return l;
        l = localfilesystemurl.length();
        localfilesystemurl.close();
        return l;
        Exception exception;
        exception;
        localfilesystemurl.close();
        throw exception;
    }

    public long writeToFileAtURL(LocalFilesystemURL localfilesystemurl, String s, int i, boolean flag)
        throws IOException, NoModificationAllowedException
    {
        boolean flag1 = false;
        if (i > 0)
        {
            truncateFileAtURL(localfilesystemurl, i);
            flag1 = true;
        }
        FileOutputStream fileoutputstream;
        ByteArrayInputStream bytearrayinputstream;
        byte abyte0[];
        if (flag)
        {
            s = Base64.decode(s, 0);
        } else
        {
            s = s.getBytes();
        }
        bytearrayinputstream = new ByteArrayInputStream(s);
        try
        {
            abyte0 = new byte[s.length];
            fileoutputstream = new FileOutputStream(filesystemPathForURL(localfilesystemurl), flag1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new NoModificationAllowedException(localfilesystemurl.toString());
        }
        bytearrayinputstream.read(abyte0, 0, abyte0.length);
        fileoutputstream.write(abyte0, 0, s.length);
        fileoutputstream.flush();
        fileoutputstream.close();
        broadcastNewFile(localfilesystemurl);
        return (long)s.length;
        s;
        fileoutputstream.close();
        throw s;
    }
}

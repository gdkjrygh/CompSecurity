// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.file;

import android.net.Uri;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package org.apache.cordova.file:
//            LocalFilesystemURL, InvalidModificationException, NoModificationAllowedException, FileExistsException, 
//            TypeMismatchException, EncodingException

public abstract class Filesystem
{
    protected class LimitedInputStream extends FilterInputStream
    {

        long numBytesToRead;
        final Filesystem this$0;

        public int read()
            throws IOException
        {
            if (numBytesToRead <= 0L)
            {
                return -1;
            } else
            {
                numBytesToRead = numBytesToRead - 1L;
                return in.read();
            }
        }

        public int read(byte abyte0[], int i, int j)
            throws IOException
        {
            if (numBytesToRead <= 0L)
            {
                return -1;
            }
            int k = j;
            if ((long)j > numBytesToRead)
            {
                k = (int)numBytesToRead;
            }
            i = in.read(abyte0, i, k);
            numBytesToRead = numBytesToRead - (long)i;
            return i;
        }

        public LimitedInputStream(InputStream inputstream, long l)
        {
            this$0 = Filesystem.this;
            super(inputstream);
            numBytesToRead = l;
        }
    }

    public static interface ReadFileCallback
    {

        public abstract void handleData(InputStream inputstream, String s)
            throws IOException;
    }


    public String name;

    public Filesystem()
    {
    }

    public static JSONObject makeEntryForPath(String s, String s1, Boolean boolean1, String s2)
        throws JSONException
    {
        boolean flag = false;
        JSONObject jsonobject = new JSONObject();
        String as[];
        String s3;
        int i;
        boolean flag1;
        if (s.endsWith("/"))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        as = s.substring(0, s.length() - i).split("/+");
        s3 = as[as.length - 1];
        if (!boolean1.booleanValue())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        jsonobject.put("isFile", flag1);
        jsonobject.put("isDirectory", boolean1);
        jsonobject.put("name", s3);
        jsonobject.put("fullPath", s);
        jsonobject.put("filesystemName", s1);
        if ("temporary".equals(s1))
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 1;
        }
        jsonobject.put("filesystem", i);
        s = s2;
        if (boolean1.booleanValue())
        {
            s = s2;
            if (!s2.endsWith("/"))
            {
                s = (new StringBuilder()).append(s2).append("/").toString();
            }
        }
        jsonobject.put("nativeURL", s);
        return jsonobject;
    }

    public static JSONObject makeEntryForURL(LocalFilesystemURL localfilesystemurl, Boolean boolean1, String s)
        throws JSONException
    {
        return makeEntryForPath(localfilesystemurl.fullPath, localfilesystemurl.filesystemName, boolean1, s);
    }

    abstract LocalFilesystemURL URLforFilesystemPath(String s);

    abstract boolean canRemoveFileAtLocalURL(LocalFilesystemURL localfilesystemurl);

    JSONObject copyFileToURL(final LocalFilesystemURL destination, String s, Filesystem filesystem, LocalFilesystemURL localfilesystemurl, boolean flag)
        throws IOException, InvalidModificationException, JSONException, NoModificationAllowedException, FileExistsException
    {
        if (!flag || filesystem.canRemoveFileAtLocalURL(localfilesystemurl))
        {
            destination = makeDestinationURL(s, localfilesystemurl, destination);
            filesystem.readFileAtURL(localfilesystemurl, 0L, -1L, new ReadFileCallback() {

                final Filesystem this$0;
                final LocalFilesystemURL val$destination;

                public void handleData(InputStream inputstream, String s1)
                    throws IOException
                {
                    if (inputstream != null)
                    {
                        s1 = getOutputStreamForURL(destination);
                        byte abyte0[] = new byte[8192];
                        do
                        {
                            int i = inputstream.read(abyte0, 0, 8192);
                            if (i <= 0)
                            {
                                s1.close();
                                return;
                            }
                            s1.write(abyte0, 0, i);
                        } while (true);
                    } else
                    {
                        throw new IOException("Cannot read file at source URL");
                    }
                }

            
            {
                this$0 = Filesystem.this;
                destination = localfilesystemurl;
                super();
            }
            });
            if (flag)
            {
                filesystem.removeFileAtLocalURL(localfilesystemurl);
            }
            return getEntryForLocalURL(destination);
        } else
        {
            throw new NoModificationAllowedException("Cannot move file at source URL");
        }
    }

    abstract String filesystemPathForURL(LocalFilesystemURL localfilesystemurl);

    abstract JSONObject getEntryForLocalURL(LocalFilesystemURL localfilesystemurl)
        throws IOException;

    abstract JSONObject getFileForLocalURL(LocalFilesystemURL localfilesystemurl, String s, JSONObject jsonobject, boolean flag)
        throws FileExistsException, IOException, TypeMismatchException, EncodingException, JSONException;

    abstract JSONObject getFileMetadataForLocalURL(LocalFilesystemURL localfilesystemurl)
        throws FileNotFoundException;

    abstract OutputStream getOutputStreamForURL(LocalFilesystemURL localfilesystemurl)
        throws IOException;

    public JSONObject getParentForLocalURL(LocalFilesystemURL localfilesystemurl)
        throws IOException
    {
        LocalFilesystemURL localfilesystemurl1 = new LocalFilesystemURL(localfilesystemurl.URL);
        if (!"".equals(localfilesystemurl.fullPath) && !"/".equals(localfilesystemurl.fullPath))
        {
            int i = localfilesystemurl.fullPath.replaceAll("/+$", "").lastIndexOf('/');
            localfilesystemurl1.fullPath = localfilesystemurl1.fullPath.substring(0, i + 1);
        }
        return getEntryForLocalURL(localfilesystemurl1);
    }

    protected LocalFilesystemURL makeDestinationURL(String s, LocalFilesystemURL localfilesystemurl, LocalFilesystemURL localfilesystemurl1)
    {
        String s1;
label0:
        {
            if (!"null".equals(s))
            {
                s1 = s;
                if (!"".equals(s))
                {
                    break label0;
                }
            }
            s1 = localfilesystemurl.URL.getLastPathSegment();
        }
        s = localfilesystemurl1.URL.toString();
        if (s.endsWith("/"))
        {
            s = (new StringBuilder()).append(s).append(s1).toString();
        } else
        {
            s = (new StringBuilder()).append(s).append("/").append(s1).toString();
        }
        return new LocalFilesystemURL(s);
    }

    public JSONObject makeEntryForFile(File file)
        throws JSONException
    {
        return null;
    }

    abstract JSONArray readEntriesAtLocalURL(LocalFilesystemURL localfilesystemurl)
        throws FileNotFoundException;

    abstract void readFileAtURL(LocalFilesystemURL localfilesystemurl, long l, long l1, ReadFileCallback readfilecallback)
        throws IOException;

    abstract boolean recursiveRemoveFileAtLocalURL(LocalFilesystemURL localfilesystemurl)
        throws FileExistsException, NoModificationAllowedException;

    abstract boolean removeFileAtLocalURL(LocalFilesystemURL localfilesystemurl)
        throws InvalidModificationException, NoModificationAllowedException;

    abstract long truncateFileAtURL(LocalFilesystemURL localfilesystemurl, long l)
        throws IOException, NoModificationAllowedException;

    abstract long writeToFileAtURL(LocalFilesystemURL localfilesystemurl, String s, int i, boolean flag)
        throws NoModificationAllowedException, IOException;
}

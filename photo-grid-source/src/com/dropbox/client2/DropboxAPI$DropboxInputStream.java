// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dropbox.client2;

import com.dropbox.client2.exception.DropboxException;
import com.dropbox.client2.exception.DropboxIOException;
import com.dropbox.client2.exception.DropboxLocalStorageFullException;
import com.dropbox.client2.exception.DropboxPartialFileException;
import java.io.BufferedOutputStream;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.SyncFailedException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpUriRequest;

// Referenced classes of package com.dropbox.client2:
//            ProgressListener

public class it> extends FilterInputStream
{

    private final info info;
    private final HttpUriRequest request;

    public void close()
    {
        request.abort();
    }

    public void copyStreamToOutput(OutputStream outputstream, ProgressListener progresslistener)
    {
        Object obj1;
        long l2;
        long l4;
        obj1 = null;
        l2 = 0L;
        l4 = info.FileSize();
        Object obj = new BufferedOutputStream(outputstream);
        obj1 = new byte[4096];
        long l;
        long l1;
        l1 = 0L;
        l = 0L;
_L11:
        l2 = l1;
        int i = read(((byte []) (obj1)));
        if (i >= 0) goto _L2; else goto _L1
_L1:
        if (l4 < 0L || l1 >= l4) goto _L4; else goto _L3
_L3:
        long l3;
        l2 = l1;
        try
        {
            throw new DropboxPartialFileException(l1);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            progresslistener = ((ProgressListener) (obj));
        }
        finally { }
        obj = obj1;
_L8:
        obj = ((IOException) (obj)).getMessage();
        if (obj == null) goto _L6; else goto _L5
_L5:
        if (((String) (obj)).startsWith("No space"))
        {
            throw new DropboxLocalStorageFullException();
        }
          goto _L6
        obj1;
        obj = progresslistener;
        progresslistener = ((ProgressListener) (obj1));
_L7:
        if (obj != null)
        {
            try
            {
                ((BufferedOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        if (outputstream != null)
        {
            try
            {
                outputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (OutputStream outputstream) { }
        }
        try
        {
            close();
        }
        // Misplaced declaration of an exception variable
        catch (OutputStream outputstream) { }
        throw progresslistener;
_L2:
        l2 = l1;
        ((BufferedOutputStream) (obj)).write(((byte []) (obj1)), 0, i);
        l3 = l1 + (long)i;
        l1 = l3;
        if (progresslistener == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        l2 = l3;
        l1 = System.currentTimeMillis();
        l2 = l3;
        if (l1 - l <= progresslistener.progressInterval())
        {
            break MISSING_BLOCK_LABEL_340;
        }
        l2 = l3;
        progresslistener.onProgress(l3, l4);
        l = l1;
        break MISSING_BLOCK_LABEL_340;
_L4:
        l2 = l1;
        ((BufferedOutputStream) (obj)).flush();
        l2 = l1;
        outputstream.flush();
        l2 = l1;
        if (!(outputstream instanceof FileOutputStream))
        {
            break MISSING_BLOCK_LABEL_260;
        }
        l2 = l1;
        ((FileOutputStream)outputstream).getFD().sync();
_L9:
        try
        {
            ((BufferedOutputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (ProgressListener progresslistener) { }
        if (outputstream != null)
        {
            try
            {
                outputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (OutputStream outputstream) { }
        }
        try
        {
            close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (OutputStream outputstream)
        {
            return;
        }
_L6:
        throw new DropboxPartialFileException(l2);
        progresslistener;
        obj = null;
          goto _L7
        obj;
        progresslistener = ((ProgressListener) (obj1));
          goto _L8
        IOException ioexception;
        ioexception;
        progresslistener = ((ProgressListener) (obj));
        obj = ioexception;
          goto _L8
        progresslistener;
          goto _L9
        l1 = l3;
        if (true) goto _L11; else goto _L10
_L10:
    }

    public ception getFileInfo()
    {
        return info;
    }

    public ullException(HttpUriRequest httpurirequest, HttpResponse httpresponse)
    {
        super(null);
        HttpEntity httpentity = httpresponse.getEntity();
        if (httpentity == null)
        {
            throw new DropboxException("Didn't get entity from HttpResponse");
        }
        try
        {
            in = httpentity.getContent();
        }
        // Misplaced declaration of an exception variable
        catch (HttpUriRequest httpurirequest)
        {
            throw new DropboxIOException(httpurirequest);
        }
        request = httpurirequest;
        info = new it>(httpresponse, null);
    }
}

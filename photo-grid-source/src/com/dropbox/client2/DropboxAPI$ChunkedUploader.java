// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dropbox.client2;

import com.dropbox.client2.exception.DropboxPartialFileException;
import com.dropbox.client2.exception.DropboxServerException;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Map;

// Referenced classes of package com.dropbox.client2:
//            DropboxAPI, ProgressListener

public class <init>
{

    static final boolean $assertionsDisabled;
    private static final int DEFAULT_CHUNK_SIZE = 0x400000;
    private boolean active;
    private int bytesInChunkToUpload;
    private byte chunk[];
    private uest lastRequest;
    private long offset;
    private InputStream stream;
    private long targetLength;
    final DropboxAPI this$0;
    private String uploadId;

    public void abort()
    {
        this;
        JVM INSTR monitorenter ;
        if (lastRequest != null)
        {
            lastRequest.abort();
        }
        active = false;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public active finish(String s, String s1)
    {
        return DropboxAPI.access$300(DropboxAPI.this, s, uploadId, false, s1);
    }

    public boolean getActive()
    {
        return active;
    }

    public long getOffset()
    {
        return offset;
    }

    public boolean isComplete()
    {
        return offset == targetLength;
    }

    public void upload()
    {
        upload(null);
    }

    public void upload(ProgressListener progresslistener)
    {
        Object obj;
        boolean flag;
        if (targetLength == -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
_L8:
        obj = null;
        if (progresslistener != null)
        {
            obj = new init>(progresslistener, offset, targetLength);
        }
        if (bytesInChunkToUpload != 0) goto _L2; else goto _L1
_L1:
        int i;
        if (flag)
        {
            i = chunk.length;
        } else
        {
            i = (int)Math.min(chunk.length, targetLength - offset);
        }
        bytesInChunkToUpload = stream.read(chunk, 0, i);
        if (bytesInChunkToUpload != -1) goto _L2; else goto _L3
_L3:
        if (!flag) goto _L5; else goto _L4
_L4:
        targetLength = offset;
        bytesInChunkToUpload = 0;
_L10:
        return;
_L5:
        abort();
        throw new IllegalStateException((new StringBuilder("InputStream ended after ")).append(offset).append(" bytes, expecting ").append(targetLength).append(" bytes.").toString());
_L2:
        this;
        JVM INSTR monitorenter ;
        if (!active)
        {
            throw new DropboxPartialFileException(0L);
        }
          goto _L6
        obj;
        this;
        JVM INSTR monitorexit ;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        if (!((DropboxServerException) (obj)).body.fields.containsKey("offset"))
        {
            break MISSING_BLOCK_LABEL_373;
        }
        long l = ((Long)((DropboxServerException) (obj)).body.fields.get("offset")).longValue();
        if (l <= offset)
        {
            break MISSING_BLOCK_LABEL_371;
        }
        bytesInChunkToUpload = 0;
        offset = l;
_L11:
        if (flag || offset < targetLength) goto _L8; else goto _L7
_L7:
        if ($assertionsDisabled || offset == targetLength) goto _L10; else goto _L9
_L9:
        throw new AssertionError();
_L6:
        lastRequest = chunkedUploadRequest(new ByteArrayInputStream(chunk), bytesInChunkToUpload, ((ProgressListener) (obj)), offset, uploadId);
        this;
        JVM INSTR monitorexit ;
        obj = lastRequest.upload();
        offset = ((ponse) (obj)).getOffset();
        uploadId = ((ponse) (obj)).getUploadId();
        bytesInChunkToUpload = 0;
          goto _L11
        throw obj;
        throw obj;
    }

    static 
    {
        boolean flag;
        if (!com/dropbox/client2/DropboxAPI.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }

    private ption(InputStream inputstream, long l)
    {
        this(inputstream, l, 0x400000);
    }

    private <init>(InputStream inputstream, long l, int i)
    {
        this$0 = DropboxAPI.this;
        super();
        offset = 0L;
        bytesInChunkToUpload = 0;
        active = true;
        lastRequest = null;
        stream = inputstream;
        targetLength = l;
        chunk = new byte[i];
    }

    chunk(InputStream inputstream, long l, int i, chunk chunk1)
    {
        this(inputstream, l, i);
    }

    <init>(InputStream inputstream, long l, <init> <init>1)
    {
        this(inputstream, l);
    }
}

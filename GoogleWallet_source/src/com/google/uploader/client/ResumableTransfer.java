// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.uploader.client;

import com.google.common.base.Preconditions;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

// Referenced classes of package com.google.uploader.client:
//            Transfer, HttpHeaders, TransferOptions, TransferException, 
//            HttpClient, DataStream, ChunkedDataStream, HttpResponse, 
//            TransferListener, TransferExceptionOrHttpResponse, StringDataStream

class ResumableTransfer
    implements Transfer
{
    static final class ControlState extends Enum
    {

        private static final ControlState $VALUES[];
        public static final ControlState CANCELED;
        public static final ControlState IN_PROGRESS;
        public static final ControlState PAUSED;

        public static ControlState valueOf(String s)
        {
            return (ControlState)Enum.valueOf(com/google/uploader/client/ResumableTransfer$ControlState, s);
        }

        public static ControlState[] values()
        {
            return (ControlState[])$VALUES.clone();
        }

        static 
        {
            IN_PROGRESS = new ControlState("IN_PROGRESS", 0);
            PAUSED = new ControlState("PAUSED", 1);
            CANCELED = new ControlState("CANCELED", 2);
            $VALUES = (new ControlState[] {
                IN_PROGRESS, PAUSED, CANCELED
            });
        }

        private ControlState(String s, int i)
        {
            super(s, i);
        }
    }

    final class HttpTransferListener extends TransferListener
    {

        private TransferListener outerListener;
        private Transfer outerTransfer;
        final ResumableTransfer this$0;

        public final void onUploadProgress(Transfer transfer)
        {
            outerListener.onUploadProgress(outerTransfer);
        }

        public HttpTransferListener(Transfer transfer, TransferListener transferlistener)
        {
            this$0 = ResumableTransfer.this;
            super();
            outerListener = transferlistener;
            outerTransfer = transfer;
        }
    }

    final class Pair
    {

        public final Object first;
        public final Object second;
        final ResumableTransfer this$0;

        public Pair(Object obj, Object obj1)
        {
            this$0 = ResumableTransfer.this;
            super();
            first = obj;
            second = obj1;
        }
    }


    static final boolean $assertionsDisabled;
    private long backoffSecs;
    private int chunkGranularity;
    private ControlState controlState;
    private double currentWaitSecs;
    private final HttpClient httpClient;
    private Transfer httpRequest;
    private final long idleTimeoutSecs;
    private int progressThreshold;
    private Random random;
    private HttpHeaders startRequestHeaders;
    private String startRequestMetadata;
    private String startRequestMethod;
    private String startRequestUrl;
    private TransferListener transferListener;
    private final DataStream uploadStream;
    private String uploadUrl;

    private ResumableTransfer(String s, String s1, HttpHeaders httpheaders, DataStream datastream, String s2, HttpClient httpclient, TransferOptions transferoptions, 
            boolean flag)
    {
        chunkGranularity = 1;
        long l;
        if (!flag)
        {
            startRequestUrl = s;
            startRequestMethod = s1;
            s = httpheaders;
            if (httpheaders == null)
            {
                s = new HttpHeaders();
            }
            startRequestHeaders = s;
            startRequestMetadata = s2;
        } else
        {
            uploadUrl = s;
        }
        httpClient = httpclient;
        uploadStream = datastream;
        if (transferoptions == null)
        {
            l = 60L;
        } else
        {
            l = transferoptions.getIdleTimeoutSecs();
        }
        idleTimeoutSecs = l;
        currentWaitSecs = 0.0D;
        backoffSecs = 1L;
        random = new Random();
        controlState = ControlState.IN_PROGRESS;
    }

    private void checkControlState()
        throws TransferException
    {
        this;
        JVM INSTR monitorenter ;
_L3:
        ControlState controlstate;
        ControlState controlstate1;
        controlstate = controlState;
        controlstate1 = ControlState.PAUSED;
        if (controlstate != controlstate1) goto _L2; else goto _L1
_L1:
        Exception exception;
        try
        {
            wait();
        }
        catch (InterruptedException interruptedexception) { }
        finally
        {
            this;
        }
        if (true) goto _L3; else goto _L2
_L2:
        if (controlState == ControlState.CANCELED)
        {
            throw new TransferException(TransferException.Type.CANCELED, "");
        }
        if (true)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        JVM INSTR monitorexit ;
        throw exception;
        if (!$assertionsDisabled && controlState != ControlState.IN_PROGRESS)
        {
            throw new AssertionError();
        }
        this;
        JVM INSTR monitorexit ;
    }

    public static ResumableTransfer createNewTransfer(String s, String s1, HttpHeaders httpheaders, DataStream datastream, String s2, HttpClient httpclient, TransferOptions transferoptions)
    {
        return new ResumableTransfer(s, s1, httpheaders, datastream, s2, httpclient, transferoptions, false);
    }

    private Transfer createRequest(HttpHeaders httpheaders, String s, DataStream datastream)
    {
        HttpHeaders httpheaders1 = new HttpHeaders();
        httpheaders1.set("X-Goog-Upload-Protocol", "resumable");
        httpheaders1.set("X-Goog-Upload-Command", s);
        for (Iterator iterator = httpheaders.getHeaderNames().iterator(); iterator.hasNext();)
        {
            String s2 = (String)iterator.next();
            Iterator iterator1 = httpheaders.getHeaderValues(s2).iterator();
            while (iterator1.hasNext()) 
            {
                httpheaders1.set(s2, (String)iterator1.next());
            }
        }

        String s1;
        if (s.equals("start"))
        {
            httpheaders = startRequestUrl;
        } else
        {
            httpheaders = uploadUrl;
        }
        if (s.contains("start"))
        {
            s1 = startRequestMethod;
        } else
        {
            s1 = "PUT";
        }
        httpheaders = httpClient.createTransfer(httpheaders, s1, httpheaders1, datastream);
        if (s.equals("start")) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        httpheaders.attachListener(new HttpTransferListener(this, transferListener), progressThreshold);
        this;
        JVM INSTR monitorexit ;
_L2:
        return httpheaders;
        httpheaders;
        this;
        JVM INSTR monitorexit ;
        throw httpheaders;
    }

    private void expBackoff(TransferException transferexception)
        throws TransferException
    {
        if (currentWaitSecs >= (double)idleTimeoutSecs)
        {
            throw transferexception;
        }
        double d = random.nextDouble();
        try
        {
            currentWaitSecs = currentWaitSecs + (double)backoffSecs * d;
            Thread.sleep((long)((double)(backoffSecs * 1000L) * d));
        }
        // Misplaced declaration of an exception variable
        catch (TransferException transferexception) { }
        backoffSecs = backoffSecs + backoffSecs;
    }

    private Pair getDataStreamForNextChunk()
        throws TransferException
    {
        if (!uploadStreamHasMoreData())
        {
            return new Pair(uploadStream, Boolean.valueOf(true));
        }
        if (uploadStream.getReadAheadLimit() == 0x7fffffffffffffffL)
        {
            return new Pair(uploadStream, Boolean.valueOf(true));
        }
        Object obj;
        boolean flag;
        try
        {
            obj = new ChunkedDataStream(uploadStream, chunkGranularity);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new TransferException(TransferException.Type.REQUEST_BODY_READ_ERROR, "Could not create chunked data stream.");
        }
        if (((DataStream) (obj)).getSize() < (uploadStream.getReadAheadLimit() / (long)chunkGranularity) * (long)chunkGranularity || uploadStream.getReadPosition() + ((DataStream) (obj)).getSize() == uploadStream.getSize())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return new Pair(uploadStream, Boolean.valueOf(true));
        } else
        {
            return new Pair(obj, Boolean.valueOf(false));
        }
    }

    private static boolean is4xxResponse(HttpResponse httpresponse)
    {
        return httpresponse.getResponseCode() / 100 == 4;
    }

    private static boolean isFinalResponse(HttpResponse httpresponse)
    {
        if (httpresponse.getResponseHeaders() == null)
        {
            return false;
        } else
        {
            return "final".equalsIgnoreCase(httpresponse.getResponseHeaders().getHeaderValuesAsString("X-Goog-Upload-Status"));
        }
    }

    private static boolean isUploadSessionActive(HttpResponse httpresponse)
    {
        while (httpresponse.getResponseHeaders() == null || !"active".equalsIgnoreCase(httpresponse.getResponseHeaders().getHeaderValuesAsString("X-Goog-Upload-Status")) || httpresponse.getResponseCode() != 200) 
        {
            return false;
        }
        return true;
    }

    private HttpResponse issueQueryRequest()
        throws TransferException
    {
_L5:
        Object obj;
        try
        {
            obj = sendRequest(new HttpHeaders(), "query", null);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            if (!((TransferException) (obj)).isRecoverable())
            {
                throw obj;
            }
            expBackoff(((TransferException) (obj)));
            continue; /* Loop/switch isn't completed */
        }
        if (!isFinalResponse(((HttpResponse) (obj)))) goto _L2; else goto _L1
_L1:
        return ((HttpResponse) (obj));
_L2:
        if (isUploadSessionActive(((HttpResponse) (obj))))
        {
            break; /* Loop/switch isn't completed */
        }
        if (is4xxResponse(((HttpResponse) (obj)))) goto _L1; else goto _L3
_L3:
        expBackoff(new TransferException(TransferException.Type.SERVER_ERROR, ((HttpResponse) (obj)).toDebugString()));
        if (true) goto _L5; else goto _L4
_L4:
        String s = ((HttpResponse) (obj)).getResponseHeaders().getHeaderValuesAsString("X-Goog-Upload-Chunk-Granularity");
        long l;
        if (s != null)
        {
            try
            {
                chunkGranularity = Integer.parseInt(s);
            }
            catch (NumberFormatException numberformatexception)
            {
                throw new TransferException(TransferException.Type.SERVER_ERROR, "Server returned an invalid chunk granularity.", numberformatexception);
            }
        }
        try
        {
            l = Long.parseLong(((HttpResponse) (obj)).getResponseHeaders().getHeaderValuesAsString("X-Goog-Upload-Size-Received"));
        }
        catch (NumberFormatException numberformatexception1)
        {
            throw new TransferException(TransferException.Type.SERVER_ERROR, "Failed to parse X-Goog-Upload-Size-Received header", numberformatexception1);
        }
        if (l < uploadStream.getMarkPosition())
        {
            TransferException.Type type = TransferException.Type.SERVER_ERROR;
            long l1 = uploadStream.getMarkPosition();
            throw new TransferException(type, (new StringBuilder(123)).append("The server lost bytes that were previously committed. Our offset: ").append(l1).append(", server offset: ").append(l).toString());
        }
        if (l < uploadStream.getReadPosition())
        {
            uploadStream.rewind();
        }
        while (uploadStream.getReadPosition() < l) 
        {
            if (!uploadStreamHasMoreData())
            {
                TransferException.Type type1 = TransferException.Type.REQUEST_BODY_READ_ERROR;
                String s1 = String.valueOf("Upload stream does not have more data but it should. Maybe the caller passed in a data stream to upload with a mark position that didn't match the transfer handle? Confirmed offset from server: ");
                long l2 = uploadStream.getReadPosition();
                throw new TransferException(type1, (new StringBuilder(String.valueOf(s1).length() + 47)).append(s1).append(l).append(" Size: ").append(l2).toString());
            }
            try
            {
                uploadStream.skip(l - uploadStream.getReadPosition());
                uploadStream.mark();
            }
            catch (IOException ioexception)
            {
                throw new TransferException(TransferException.Type.REQUEST_BODY_READ_ERROR, "Could not skip in the data stream.", ioexception);
            }
        }
        markUploadProgress();
        return null;
    }

    private void markUploadProgress()
    {
        if (uploadStream.getReadPosition() > uploadStream.getMarkPosition())
        {
            uploadStream.mark();
            resetBackoff();
        }
    }

    private void resetBackoff()
    {
        backoffSecs = 1L;
        currentWaitSecs = 0.0D;
    }

    private HttpResponse resumeExistingUpload(boolean flag)
        throws TransferException
    {
_L8:
        boolean flag1 = flag;
        if (!flag) goto _L2; else goto _L1
_L1:
        Object obj = issueQueryRequest();
        if (obj == null) goto _L4; else goto _L3
_L3:
        return ((HttpResponse) (obj));
_L4:
        flag1 = false;
_L2:
        Object obj1;
        obj = getDataStreamForNextChunk();
        obj1 = (DataStream)((Pair) (obj)).first;
        flag = ((Boolean)((Pair) (obj)).second).booleanValue();
        HttpHeaders httpheaders;
        if (uploadStreamHasMoreData())
        {
            if (flag)
            {
                obj = "upload, finalize";
            } else
            {
                obj = "upload";
            }
        } else
        {
            obj = "finalize";
        }
        if (transferListener != null)
        {
            transferListener.onUploadProgress(this);
        }
        httpheaders = new HttpHeaders();
        httpheaders.set("X-Goog-Upload-Offset", Long.toString(uploadStream.getReadPosition()));
        try
        {
            obj1 = sendRequest(httpheaders, ((String) (obj)), ((DataStream) (obj1)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            if (!((TransferException) (obj)).isRecoverable())
            {
                throw obj;
            }
            flag = true;
            expBackoff(((TransferException) (obj)));
            continue; /* Loop/switch isn't completed */
        }
        obj = obj1;
        if (isFinalResponse(((HttpResponse) (obj1)))) goto _L3; else goto _L5
_L5:
        if (isUploadSessionActive(((HttpResponse) (obj1))))
        {
            if (flag)
            {
                throw new TransferException(TransferException.Type.SERVER_ERROR, "Finalize call returned active state.");
            }
            markUploadProgress();
            flag = flag1;
            continue; /* Loop/switch isn't completed */
        }
        if (!is4xxResponse(((HttpResponse) (obj1))))
        {
            break; /* Loop/switch isn't completed */
        }
        obj = obj1;
        if (((HttpResponse) (obj1)).getResponseCode() != 400) goto _L3; else goto _L6
_L6:
        flag = true;
        expBackoff(new TransferException(TransferException.Type.SERVER_ERROR, ((HttpResponse) (obj1)).toDebugString()));
        if (true) goto _L8; else goto _L7
_L7:
    }

    private HttpResponse sendRequest(HttpHeaders httpheaders, String s, DataStream datastream)
        throws TransferException
    {
        checkControlState();
        httpheaders = createRequest(httpheaders, s, datastream);
        this;
        JVM INSTR monitorenter ;
        httpRequest = httpheaders;
        httpheaders = httpheaders.send();
        this;
        JVM INSTR monitorexit ;
        try
        {
            httpheaders = (TransferExceptionOrHttpResponse)httpheaders.get();
        }
        // Misplaced declaration of an exception variable
        catch (HttpHeaders httpheaders)
        {
            httpheaders = String.valueOf(httpheaders.getMessage());
            if (httpheaders.length() != 0)
            {
                httpheaders = "Unexpected error occurred: ".concat(httpheaders);
            } else
            {
                httpheaders = new String("Unexpected error occurred: ");
            }
            throw new RuntimeException(httpheaders);
        }
        // Misplaced declaration of an exception variable
        catch (HttpHeaders httpheaders)
        {
            httpheaders = String.valueOf(httpheaders.getMessage());
            if (httpheaders.length() != 0)
            {
                httpheaders = "Unexpected error occurred: ".concat(httpheaders);
            } else
            {
                httpheaders = new String("Unexpected error occurred: ");
            }
            throw new RuntimeException(httpheaders);
        }
        if (httpheaders.hasTransferException())
        {
            if (httpheaders.getTransferException().getType() != TransferException.Type.CANCELED)
            {
                throw httpheaders.getTransferException();
            } else
            {
                checkControlState();
                throw new TransferException(TransferException.Type.CONNECTION_ERROR, "");
            }
        } else
        {
            return httpheaders.getHttpResponse();
        }
        httpheaders;
        this;
        JVM INSTR monitorexit ;
        throw httpheaders;
    }

    private HttpResponse startNewUpload()
        throws TransferException
    {
        this;
        JVM INSTR monitorenter ;
        if (transferListener != null)
        {
            transferListener.onStart(this);
        }
        this;
        JVM INSTR monitorexit ;
        resetBackoff();
_L8:
        Object obj2 = startRequestHeaders;
        if (startRequestMetadata != null) goto _L2; else goto _L1
_L1:
        Object obj = "";
_L5:
        try
        {
            obj = sendRequest(((HttpHeaders) (obj2)), "start", new StringDataStream(((String) (obj))));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            if (!((TransferException) (obj)).isRecoverable())
            {
                throw obj;
            }
            expBackoff(((TransferException) (obj)));
            continue; /* Loop/switch isn't completed */
        }
        if (!isFinalResponse(((HttpResponse) (obj)))) goto _L4; else goto _L3
_L3:
        return ((HttpResponse) (obj));
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
_L2:
        obj = startRequestMetadata;
          goto _L5
_L4:
        if (isUploadSessionActive(((HttpResponse) (obj))))
        {
            break; /* Loop/switch isn't completed */
        }
        if (is4xxResponse(((HttpResponse) (obj)))) goto _L3; else goto _L6
_L6:
        expBackoff(new TransferException(TransferException.Type.SERVER_ERROR, ((HttpResponse) (obj)).toDebugString()));
        if (true) goto _L8; else goto _L7
_L7:
        obj = ((HttpResponse) (obj)).getResponseHeaders();
        obj2 = ((HttpHeaders) (obj)).getHeaderValuesAsString("X-Goog-Upload-URL");
        new URL(((String) (obj2)));
        uploadUrl = ((String) (obj2));
        this;
        JVM INSTR monitorenter ;
        if (transferListener != null)
        {
            transferListener.onTransferHandleReady(this);
            TransferListener transferlistener = transferListener;
        }
        this;
        JVM INSTR monitorexit ;
        obj = ((HttpHeaders) (obj)).getHeaderValuesAsString("X-Goog-Upload-Chunk-Granularity");
        Object obj1;
        if (obj != null)
        {
            try
            {
                chunkGranularity = Integer.parseInt(((String) (obj)));
            }
            catch (NumberFormatException numberformatexception)
            {
                throw new TransferException(TransferException.Type.SERVER_ERROR, "Server returned an invalid chunk granularity.", numberformatexception);
            }
        }
        return resumeExistingUpload(false);
        obj1;
        this;
        JVM INSTR monitorexit ;
        try
        {
            throw obj1;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            throw new TransferException(TransferException.Type.SERVER_ERROR, "Server returned an invalid upload url.");
        }
    }

    private boolean uploadStreamHasMoreData()
        throws TransferException
    {
        boolean flag;
        try
        {
            flag = uploadStream.hasMoreData();
        }
        catch (IOException ioexception)
        {
            throw new TransferException(TransferException.Type.REQUEST_BODY_READ_ERROR, "Could not call hasMoreData() on upload stream.", ioexception);
        }
        return flag;
    }

    public final void attachListener(TransferListener transferlistener, int i)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Progress threshold must be greater than 0");
        transferListener = transferlistener;
        progressThreshold = i;
        this;
        JVM INSTR monitorexit ;
        return;
        transferlistener;
        throw transferlistener;
    }

    public final void cancel()
    {
        this;
        JVM INSTR monitorenter ;
        if (httpRequest != null)
        {
            httpRequest.cancel();
            httpRequest = null;
        }
        controlState = ControlState.CANCELED;
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final long getBytesUploaded()
    {
        return uploadStream.getReadPosition();
    }

    public final String getTransferHandle()
    {
        return uploadUrl;
    }

    public final Future send()
    {
        FutureTask futuretask = new FutureTask(new Callable() {

            final ResumableTransfer this$0;

            private TransferExceptionOrHttpResponse call()
            {
                if (uploadUrl != null) goto _L2; else goto _L1
_L1:
                Object obj = startNewUpload();
_L7:
                obj = new TransferExceptionOrHttpResponse(((HttpResponse) (obj)));
_L8:
                ResumableTransfer resumabletransfer = ResumableTransfer.this;
                resumabletransfer;
                JVM INSTR monitorenter ;
                if (transferListener == null) goto _L4; else goto _L3
_L3:
                if (!((TransferExceptionOrHttpResponse) (obj)).hasHttpResponse()) goto _L6; else goto _L5
_L5:
                transferListener.onResponseReceived(ResumableTransfer.this, ((TransferExceptionOrHttpResponse) (obj)).getHttpResponse());
_L4:
                return ((TransferExceptionOrHttpResponse) (obj));
_L2:
                obj = resumeExistingUpload(true);
                  goto _L7
                obj;
                obj = new TransferExceptionOrHttpResponse(((TransferException) (obj)));
                  goto _L8
                obj;
                obj = new TransferExceptionOrHttpResponse(new TransferException(TransferException.Type.UNKNOWN, ((Throwable) (obj))));
                  goto _L8
_L6:
                transferListener.onException(ResumableTransfer.this, ((TransferExceptionOrHttpResponse) (obj)).getTransferException());
                  goto _L4
                Exception exception;
                exception;
                resumabletransfer;
                JVM INSTR monitorexit ;
                throw exception;
                  goto _L7
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = ResumableTransfer.this;
                super();
            }
        });
        ExecutorService executorservice = Executors.newSingleThreadExecutor();
        executorservice.submit(futuretask);
        executorservice.shutdown();
        return futuretask;
    }

    static 
    {
        boolean flag;
        if (!com/google/uploader/client/ResumableTransfer.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }




}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.uploader.client;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

// Referenced classes of package com.google.uploader.client:
//            HttpClient, HttpHeaders, DataStream, Transfer, 
//            TransferException, HttpResponse, TransferListener, TransferExceptionOrHttpResponse

public class HttpUrlConnectionHttpClient
    implements HttpClient
{
    static final class ConnectionFactory
    {

        public static HttpURLConnection createConnection(String s)
            throws IOException
        {
            return (HttpURLConnection)(new URL(s)).openConnection();
        }

        ConnectionFactory()
        {
        }
    }

    static final class HttpUrlConnectionTransfer
        implements Transfer
    {

        static final boolean $assertionsDisabled;
        private final HttpURLConnection connection;
        private ControlState controlState;
        private long estimatedBytesTransferred;
        private int progressThreshold;
        private final DataStream requestBody;
        private TransferListener transferListener;

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

        private HttpResponse getHttpResponseFromConnection()
            throws TransferException
        {
            checkControlState();
            Object obj;
            Object obj1;
            Map map;
            int i;
            try
            {
                i = connection.getResponseCode();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new TransferException(TransferException.Type.CONNECTION_ERROR, "Error while reading response code.", ((Throwable) (obj)));
            }
            try
            {
                obj = connection.getInputStream();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                obj = connection.getErrorStream();
            }
            obj1 = null;
            map = connection.getHeaderFields();
            if (map != null)
            {
                HttpHeaders httpheaders = new HttpHeaders();
                Iterator iterator = map.keySet().iterator();
                do
                {
                    obj1 = httpheaders;
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    obj1 = (String)iterator.next();
                    if (obj1 != null)
                    {
                        Iterator iterator1 = ((List)map.get(obj1)).iterator();
                        while (iterator1.hasNext()) 
                        {
                            httpheaders.add(((String) (obj1)), (String)iterator1.next());
                        }
                    }
                } while (true);
            }
            return new HttpResponse(i, ((HttpHeaders) (obj1)), ((java.io.InputStream) (obj)));
        }

        private boolean requestBodyHasMoreData()
            throws TransferException
        {
            boolean flag;
            try
            {
                flag = requestBody.hasMoreData();
            }
            catch (IOException ioexception)
            {
                throw new TransferException(TransferException.Type.REQUEST_BODY_READ_ERROR, ioexception);
            }
            return flag;
        }

        private HttpResponse sendInternal()
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
            checkControlState();
            Exception exception;
            try
            {
                connection.connect();
            }
            catch (FileNotFoundException filenotfoundexception)
            {
                throw new TransferException(TransferException.Type.BAD_URL, filenotfoundexception);
            }
            catch (IOException ioexception)
            {
                HttpResponse httpresponse;
                try
                {
                    httpresponse = getHttpResponseFromConnection();
                }
                catch (TransferException transferexception)
                {
                    throw new TransferException(TransferException.Type.CONNECTION_ERROR, ioexception);
                }
                return httpresponse;
            }
            if (requestBody == null)
            {
                return getHttpResponseFromConnection();
            }
            break MISSING_BLOCK_LABEL_81;
            exception;
            this;
            JVM INSTR monitorexit ;
            throw exception;
            int i;
            int j;
            OutputStream outputstream;
            IOException ioexception1;
            byte abyte0[];
            int k;
            try
            {
                outputstream = connection.getOutputStream();
            }
            catch (IOException ioexception2)
            {
                HttpResponse httpresponse1;
                try
                {
                    httpresponse1 = getHttpResponseFromConnection();
                }
                catch (TransferException transferexception1)
                {
                    throw new TransferException(TransferException.Type.CONNECTION_ERROR, ioexception2);
                }
                return httpresponse1;
            }
            i = 0;
_L2:
            do
            {
                if (!requestBodyHasMoreData())
                {
                    break MISSING_BLOCK_LABEL_264;
                }
                checkControlState();
                j = 0;
                abyte0 = new byte[0x10000];
                while (j < 0x10000 && requestBodyHasMoreData()) 
                {
                    try
                    {
                        k = requestBody.read(abyte0, j, 0x10000 - j);
                        estimatedBytesTransferred = estimatedBytesTransferred + (long)k;
                    }
                    catch (IOException ioexception3)
                    {
                        throw new TransferException(TransferException.Type.REQUEST_BODY_READ_ERROR, ioexception3);
                    }
                    j += k;
                    try
                    {
                        outputstream.write(abyte0, j - k, k);
                    }
                    // Misplaced declaration of an exception variable
                    catch (IOException ioexception1)
                    {
                        return getHttpResponseFromConnection();
                    }
                }
                j = i + j;
                i = j;
            } while (j <= progressThreshold);
            this;
            JVM INSTR monitorenter ;
            if (transferListener != null)
            {
                transferListener.onUploadProgress(this);
            }
            this;
            JVM INSTR monitorexit ;
            i = 0;
            if (true) goto _L2; else goto _L1
_L1:
            Exception exception1;
            exception1;
            this;
            JVM INSTR monitorexit ;
            throw exception1;
            return getHttpResponseFromConnection();
        }

        public final void attachListener(TransferListener transferlistener, int i)
        {
            this;
            JVM INSTR monitorenter ;
            transferListener = transferlistener;
            if (i <= 0)
            {
                break MISSING_BLOCK_LABEL_16;
            }
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
            return estimatedBytesTransferred;
        }

        public final String getTransferHandle()
        {
            return null;
        }

        public final Future send()
        {
            FutureTask futuretask = new FutureTask(new Callable() {

                final HttpUrlConnectionTransfer this$0;

                private TransferExceptionOrHttpResponse call()
                {
                    HttpResponse httpresponse = sendInternal();
                    synchronized (HttpUrlConnectionTransfer.this)
                    {
                        if (transferListener != null)
                        {
                            transferListener.onResponseReceived(HttpUrlConnectionTransfer.this, httpresponse);
                        }
                    }
                    try
                    {
                        obj = new TransferExceptionOrHttpResponse(httpresponse);
                    }
                    catch (TransferException transferexception)
                    {
                        synchronized (HttpUrlConnectionTransfer.this)
                        {
                            if (transferListener != null)
                            {
                                transferListener.onException(HttpUrlConnectionTransfer.this, transferexception);
                            }
                        }
                        return new TransferExceptionOrHttpResponse(transferexception);
                    }
                    return ((TransferExceptionOrHttpResponse) (obj));
                    exception;
                    obj;
                    JVM INSTR monitorexit ;
                    throw exception;
                    exception1;
                    httpurlconnectiontransfer;
                    JVM INSTR monitorexit ;
                    throw exception1;
                }

                public final volatile Object call()
                    throws Exception
                {
                    return call();
                }

            
            {
                this$0 = HttpUrlConnectionTransfer.this;
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
            if (!com/google/uploader/client/HttpUrlConnectionHttpClient.desiredAssertionStatus())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            $assertionsDisabled = flag;
        }



        public HttpUrlConnectionTransfer(HttpURLConnection httpurlconnection, String s, HttpHeaders httpheaders, DataStream datastream)
        {
            progressThreshold = -1;
            connection = httpurlconnection;
            try
            {
                httpurlconnection.setRequestMethod(s);
            }
            // Misplaced declaration of an exception variable
            catch (HttpURLConnection httpurlconnection)
            {
                throw new IllegalArgumentException("Invalid http method.", httpurlconnection);
            }
            httpurlconnection.setReadTimeout(0x493e0);
            httpurlconnection.setConnectTimeout(0x493e0);
            httpurlconnection.setDoInput(true);
            requestBody = datastream;
            if (datastream != null)
            {
                httpurlconnection.setDoOutput(true);
                if (datastream.getSize() >= 0L)
                {
                    long l = datastream.getSize() - datastream.getReadPosition();
                    Iterator iterator;
                    if (l < 0x7fffffffL)
                    {
                        httpurlconnection.setFixedLengthStreamingMode((int)l);
                    } else
                    {
                        httpurlconnection.setFixedLengthStreamingMode(l);
                    }
                } else
                {
                    httpurlconnection.setChunkedStreamingMode(0);
                }
            }
            for (s = httpheaders.getHeaderNames().iterator(); s.hasNext();)
            {
                datastream = (String)s.next();
                iterator = httpheaders.getHeaderValues(datastream).iterator();
                while (iterator.hasNext()) 
                {
                    httpurlconnection.addRequestProperty(datastream, (String)iterator.next());
                }
            }

            controlState = ControlState.IN_PROGRESS;
        }
    }

    static final class HttpUrlConnectionTransfer.ControlState extends Enum
    {

        private static final HttpUrlConnectionTransfer.ControlState $VALUES[];
        public static final HttpUrlConnectionTransfer.ControlState CANCELED;
        public static final HttpUrlConnectionTransfer.ControlState IN_PROGRESS;
        public static final HttpUrlConnectionTransfer.ControlState PAUSED;

        public static HttpUrlConnectionTransfer.ControlState valueOf(String s)
        {
            return (HttpUrlConnectionTransfer.ControlState)Enum.valueOf(com/google/uploader/client/HttpUrlConnectionHttpClient$HttpUrlConnectionTransfer$ControlState, s);
        }

        public static HttpUrlConnectionTransfer.ControlState[] values()
        {
            return (HttpUrlConnectionTransfer.ControlState[])$VALUES.clone();
        }

        static 
        {
            IN_PROGRESS = new HttpUrlConnectionTransfer.ControlState("IN_PROGRESS", 0);
            PAUSED = new HttpUrlConnectionTransfer.ControlState("PAUSED", 1);
            CANCELED = new HttpUrlConnectionTransfer.ControlState("CANCELED", 2);
            $VALUES = (new HttpUrlConnectionTransfer.ControlState[] {
                IN_PROGRESS, PAUSED, CANCELED
            });
        }

        private HttpUrlConnectionTransfer.ControlState(String s, int i)
        {
            super(s, i);
        }
    }


    private ConnectionFactory connectionFactory;

    public HttpUrlConnectionHttpClient()
    {
        connectionFactory = new ConnectionFactory();
    }

    public final Transfer createTransfer(String s, String s1, HttpHeaders httpheaders, DataStream datastream)
    {
        try
        {
            ConnectionFactory connectionfactory = connectionFactory;
            s = ConnectionFactory.createConnection(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IllegalArgumentException("Url is malformed.", s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IllegalStateException("Http connection could not be created.", s);
        }
        return new HttpUrlConnectionTransfer(s, s1, httpheaders, datastream);
    }
}

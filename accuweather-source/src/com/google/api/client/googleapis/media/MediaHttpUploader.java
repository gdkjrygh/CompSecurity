// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis.media;

import com.google.api.client.googleapis.MethodOverride;
import com.google.api.client.http.AbstractInputStreamContent;
import com.google.api.client.http.ByteArrayContent;
import com.google.api.client.http.EmptyContent;
import com.google.api.client.http.GZipEncoding;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpContent;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.InputStreamContent;
import com.google.api.client.http.MultipartContent;
import com.google.api.client.util.ByteStreams;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.Sleeper;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

// Referenced classes of package com.google.api.client.googleapis.media:
//            MediaUploadErrorHandler, MediaHttpUploaderProgressListener

public final class MediaHttpUploader
{
    public static final class UploadState extends Enum
    {

        private static final UploadState $VALUES[];
        public static final UploadState INITIATION_COMPLETE;
        public static final UploadState INITIATION_STARTED;
        public static final UploadState MEDIA_COMPLETE;
        public static final UploadState MEDIA_IN_PROGRESS;
        public static final UploadState NOT_STARTED;

        public static UploadState valueOf(String s)
        {
            return (UploadState)Enum.valueOf(com/google/api/client/googleapis/media/MediaHttpUploader$UploadState, s);
        }

        public static UploadState[] values()
        {
            return (UploadState[])$VALUES.clone();
        }

        static 
        {
            NOT_STARTED = new UploadState("NOT_STARTED", 0);
            INITIATION_STARTED = new UploadState("INITIATION_STARTED", 1);
            INITIATION_COMPLETE = new UploadState("INITIATION_COMPLETE", 2);
            MEDIA_IN_PROGRESS = new UploadState("MEDIA_IN_PROGRESS", 3);
            MEDIA_COMPLETE = new UploadState("MEDIA_COMPLETE", 4);
            $VALUES = (new UploadState[] {
                NOT_STARTED, INITIATION_STARTED, INITIATION_COMPLETE, MEDIA_IN_PROGRESS, MEDIA_COMPLETE
            });
        }

        private UploadState(String s, int i)
        {
            super(s, i);
        }
    }


    public static final String CONTENT_LENGTH_HEADER = "X-Upload-Content-Length";
    public static final String CONTENT_TYPE_HEADER = "X-Upload-Content-Type";
    public static final int DEFAULT_CHUNK_SIZE = 0xa00000;
    private static final int KB = 1024;
    static final int MB = 0x100000;
    public static final int MINIMUM_CHUNK_SIZE = 0x40000;
    private Byte cachedByte;
    private int chunkSize;
    private InputStream contentInputStream;
    private int currentChunkLength;
    private HttpRequest currentRequest;
    private byte currentRequestContentBuffer[];
    private boolean directUploadEnabled;
    private boolean disableGZipContent;
    private HttpHeaders initiationHeaders;
    private String initiationRequestMethod;
    private boolean isMediaContentLengthCalculated;
    private final AbstractInputStreamContent mediaContent;
    private long mediaContentLength;
    String mediaContentLengthStr;
    private HttpContent metadata;
    private MediaHttpUploaderProgressListener progressListener;
    private final HttpRequestFactory requestFactory;
    Sleeper sleeper;
    private long totalBytesClientSent;
    private long totalBytesServerReceived;
    private final HttpTransport transport;
    private UploadState uploadState;

    public MediaHttpUploader(AbstractInputStreamContent abstractinputstreamcontent, HttpTransport httptransport, HttpRequestInitializer httprequestinitializer)
    {
        uploadState = UploadState.NOT_STARTED;
        initiationRequestMethod = "POST";
        initiationHeaders = new HttpHeaders();
        mediaContentLengthStr = "*";
        chunkSize = 0xa00000;
        sleeper = Sleeper.DEFAULT;
        mediaContent = (AbstractInputStreamContent)Preconditions.checkNotNull(abstractinputstreamcontent);
        transport = (HttpTransport)Preconditions.checkNotNull(httptransport);
        if (httprequestinitializer == null)
        {
            abstractinputstreamcontent = httptransport.createRequestFactory();
        } else
        {
            abstractinputstreamcontent = httptransport.createRequestFactory(httprequestinitializer);
        }
        requestFactory = abstractinputstreamcontent;
    }

    private HttpResponse directUpload(GenericUrl genericurl)
        throws IOException
    {
        updateStateAndNotifyListener(UploadState.MEDIA_IN_PROGRESS);
        Object obj = mediaContent;
        if (metadata != null)
        {
            obj = (new MultipartContent()).setContentParts(Arrays.asList(new HttpContent[] {
                metadata, mediaContent
            }));
            genericurl.put("uploadType", "multipart");
        } else
        {
            genericurl.put("uploadType", "media");
        }
        genericurl = requestFactory.buildRequest(initiationRequestMethod, genericurl, ((HttpContent) (obj)));
        genericurl.getHeaders().putAll(initiationHeaders);
        genericurl = executeCurrentRequest(genericurl);
        if (isMediaLengthKnown())
        {
            totalBytesServerReceived = getMediaContentLength();
        }
        updateStateAndNotifyListener(UploadState.MEDIA_COMPLETE);
        if (false)
        {
            genericurl.disconnect();
        }
        return genericurl;
        Exception exception;
        exception;
        if (true)
        {
            genericurl.disconnect();
        }
        throw exception;
    }

    private HttpResponse executeCurrentRequest(HttpRequest httprequest)
        throws IOException
    {
        if (!disableGZipContent && !(httprequest.getContent() instanceof EmptyContent))
        {
            httprequest.setEncoding(new GZipEncoding());
        }
        return executeCurrentRequestWithoutGZip(httprequest);
    }

    private HttpResponse executeCurrentRequestWithoutGZip(HttpRequest httprequest)
        throws IOException
    {
        (new MethodOverride()).intercept(httprequest);
        httprequest.setThrowExceptionOnExecuteError(false);
        return httprequest.execute();
    }

    private HttpResponse executeUploadInitiation(GenericUrl genericurl)
        throws IOException
    {
        updateStateAndNotifyListener(UploadState.INITIATION_STARTED);
        genericurl.put("uploadType", "resumable");
        Object obj;
        if (metadata == null)
        {
            obj = new EmptyContent();
        } else
        {
            obj = metadata;
        }
        genericurl = requestFactory.buildRequest(initiationRequestMethod, genericurl, ((HttpContent) (obj)));
        initiationHeaders.set("X-Upload-Content-Type", mediaContent.getType());
        if (isMediaLengthKnown())
        {
            initiationHeaders.set("X-Upload-Content-Length", Long.valueOf(getMediaContentLength()));
        }
        genericurl.getHeaders().putAll(initiationHeaders);
        genericurl = executeCurrentRequest(genericurl);
        updateStateAndNotifyListener(UploadState.INITIATION_COMPLETE);
        if (false)
        {
            genericurl.disconnect();
        }
        return genericurl;
        Exception exception;
        exception;
        if (true)
        {
            genericurl.disconnect();
        }
        throw exception;
    }

    private long getMediaContentLength()
        throws IOException
    {
        if (!isMediaContentLengthCalculated)
        {
            mediaContentLength = mediaContent.getLength();
            isMediaContentLengthCalculated = true;
        }
        return mediaContentLength;
    }

    private long getNextByteIndex(String s)
    {
        if (s == null)
        {
            return 0L;
        } else
        {
            return Long.parseLong(s.substring(s.indexOf('-') + 1)) + 1L;
        }
    }

    private boolean isMediaLengthKnown()
        throws IOException
    {
        return getMediaContentLength() >= 0L;
    }

    private HttpResponse resumableUpload(GenericUrl genericurl)
        throws IOException
    {
        Object obj = executeUploadInitiation(genericurl);
        if (((HttpResponse) (obj)).isSuccessStatusCode()) goto _L2; else goto _L1
_L1:
        return ((HttpResponse) (obj));
_L2:
        genericurl = new GenericUrl(((HttpResponse) (obj)).getHeaders().getLocation());
        ((HttpResponse) (obj)).disconnect();
        contentInputStream = mediaContent.getInputStream();
        obj = genericurl;
        if (!contentInputStream.markSupported())
        {
            obj = genericurl;
            if (isMediaLengthKnown())
            {
                contentInputStream = new BufferedInputStream(contentInputStream);
                obj = genericurl;
            }
        }
_L10:
        currentRequest = requestFactory.buildPutRequest(((GenericUrl) (obj)), null);
        setContentAndHeadersOnCurrentRequest();
        new MediaUploadErrorHandler(this, currentRequest);
        if (isMediaLengthKnown())
        {
            genericurl = executeCurrentRequestWithoutGZip(currentRequest);
        } else
        {
            genericurl = executeCurrentRequest(currentRequest);
        }
        if (!genericurl.isSuccessStatusCode())
        {
            break MISSING_BLOCK_LABEL_199;
        }
        totalBytesServerReceived = getMediaContentLength();
        if (mediaContent.getCloseInputStream())
        {
            contentInputStream.close();
        }
        updateStateAndNotifyListener(UploadState.MEDIA_COMPLETE);
        obj = genericurl;
        if (true) goto _L1; else goto _L3
_L3:
        genericurl.disconnect();
        return genericurl;
        genericurl;
        ((HttpResponse) (obj)).disconnect();
        throw genericurl;
        int i = genericurl.getStatusCode();
        if (i == 308)
        {
            break MISSING_BLOCK_LABEL_225;
        }
        obj = genericurl;
        if (true) goto _L1; else goto _L4
_L4:
        genericurl.disconnect();
        return genericurl;
        String s = genericurl.getHeaders().getLocation();
        Object obj1;
        obj1 = obj;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_251;
        }
        obj1 = new GenericUrl(s);
        long l;
        long l1;
        l = getNextByteIndex(genericurl.getHeaders().getRange());
        l1 = l - totalBytesServerReceived;
        if (l1 < 0L) goto _L6; else goto _L5
_L5:
        if (l1 > (long)currentChunkLength) goto _L6; else goto _L7
_L7:
        boolean flag = true;
_L11:
        long l2;
        Preconditions.checkState(flag);
        l2 = (long)currentChunkLength - l1;
        if (!isMediaLengthKnown()) goto _L9; else goto _L8
_L8:
        if (l2 <= 0L)
        {
            break MISSING_BLOCK_LABEL_353;
        }
        contentInputStream.reset();
        if (l1 == contentInputStream.skip(l1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
_L13:
        totalBytesServerReceived = l;
        updateStateAndNotifyListener(UploadState.MEDIA_IN_PROGRESS);
        obj = obj1;
        if (true)
        {
            genericurl.disconnect();
            obj = obj1;
        }
          goto _L10
_L6:
        flag = false;
          goto _L11
_L9:
        if (l2 != 0L) goto _L13; else goto _L12
_L12:
        currentRequestContentBuffer = null;
          goto _L13
        Exception exception;
        exception;
        if (true)
        {
            genericurl.disconnect();
        }
        throw exception;
          goto _L10
    }

    private void setContentAndHeadersOnCurrentRequest()
        throws IOException
    {
        Object obj;
        int i;
        int j;
        if (isMediaLengthKnown())
        {
            i = (int)Math.min(chunkSize, getMediaContentLength() - totalBytesServerReceived);
        } else
        {
            i = chunkSize;
        }
        j = i;
        if (isMediaLengthKnown())
        {
            contentInputStream.mark(i);
            obj = ByteStreams.limit(contentInputStream, i);
            obj = (new InputStreamContent(mediaContent.getType(), ((InputStream) (obj)))).setRetrySupported(true).setLength(i).setCloseInputStream(false);
            mediaContentLengthStr = String.valueOf(getMediaContentLength());
        } else
        {
            boolean flag = false;
            int l;
            int i1;
            if (currentRequestContentBuffer == null)
            {
                int k;
                if (cachedByte == null)
                {
                    k = i + 1;
                } else
                {
                    k = i;
                }
                currentRequestContentBuffer = new byte[i + 1];
                l = k;
                i1 = ((flag) ? 1 : 0);
                if (cachedByte != null)
                {
                    currentRequestContentBuffer[0] = cachedByte.byteValue();
                    i1 = ((flag) ? 1 : 0);
                    l = k;
                }
            } else
            {
                i1 = (int)(totalBytesClientSent - totalBytesServerReceived);
                System.arraycopy(currentRequestContentBuffer, currentChunkLength - i1, currentRequestContentBuffer, 0, i1);
                if (cachedByte != null)
                {
                    currentRequestContentBuffer[i1] = cachedByte.byteValue();
                }
                l = i - i1;
            }
            k = ByteStreams.read(contentInputStream, currentRequestContentBuffer, (i + 1) - l, l);
            if (k < l)
            {
                j = i1 + Math.max(0, k);
                i = j;
                if (cachedByte != null)
                {
                    i = j + 1;
                    cachedByte = null;
                }
                j = i;
                if (mediaContentLengthStr.equals("*"))
                {
                    mediaContentLengthStr = String.valueOf(totalBytesServerReceived + (long)i);
                    j = i;
                }
            } else
            {
                cachedByte = Byte.valueOf(currentRequestContentBuffer[i]);
            }
            obj = new ByteArrayContent(mediaContent.getType(), currentRequestContentBuffer, 0, j);
            totalBytesClientSent = totalBytesServerReceived + (long)j;
        }
        currentChunkLength = j;
        currentRequest.setContent(((HttpContent) (obj)));
        if (j == 0)
        {
            currentRequest.getHeaders().setContentRange("bytes */0");
            return;
        } else
        {
            HttpHeaders httpheaders = currentRequest.getHeaders();
            long l1 = totalBytesServerReceived;
            long l2 = totalBytesServerReceived;
            long l3 = j;
            String s = String.valueOf(String.valueOf(mediaContentLengthStr));
            httpheaders.setContentRange((new StringBuilder(s.length() + 48)).append("bytes ").append(l1).append("-").append((l2 + l3) - 1L).append("/").append(s).toString());
            return;
        }
    }

    private void updateStateAndNotifyListener(UploadState uploadstate)
        throws IOException
    {
        uploadState = uploadstate;
        if (progressListener != null)
        {
            progressListener.progressChanged(this);
        }
    }

    public int getChunkSize()
    {
        return chunkSize;
    }

    public boolean getDisableGZipContent()
    {
        return disableGZipContent;
    }

    public HttpHeaders getInitiationHeaders()
    {
        return initiationHeaders;
    }

    public String getInitiationRequestMethod()
    {
        return initiationRequestMethod;
    }

    public HttpContent getMediaContent()
    {
        return mediaContent;
    }

    public HttpContent getMetadata()
    {
        return metadata;
    }

    public long getNumBytesUploaded()
    {
        return totalBytesServerReceived;
    }

    public double getProgress()
        throws IOException
    {
        Preconditions.checkArgument(isMediaLengthKnown(), "Cannot call getProgress() if the specified AbstractInputStreamContent has no content length. Use  getNumBytesUploaded() to denote progress instead.");
        if (getMediaContentLength() == 0L)
        {
            return 0.0D;
        } else
        {
            return (double)totalBytesServerReceived / (double)getMediaContentLength();
        }
    }

    public MediaHttpUploaderProgressListener getProgressListener()
    {
        return progressListener;
    }

    public Sleeper getSleeper()
    {
        return sleeper;
    }

    public HttpTransport getTransport()
    {
        return transport;
    }

    public UploadState getUploadState()
    {
        return uploadState;
    }

    public boolean isDirectUploadEnabled()
    {
        return directUploadEnabled;
    }

    void serverErrorCallback()
        throws IOException
    {
        Preconditions.checkNotNull(currentRequest, "The current request should not be null");
        currentRequest.setContent(new EmptyContent());
        HttpHeaders httpheaders = currentRequest.getHeaders();
        Object obj;
        if (isMediaLengthKnown())
        {
            obj = Long.valueOf(getMediaContentLength());
        } else
        {
            obj = "*";
        }
        obj = String.valueOf(String.valueOf(obj));
        httpheaders.setContentRange((new StringBuilder(((String) (obj)).length() + 8)).append("bytes */").append(((String) (obj))).toString());
    }

    public MediaHttpUploader setChunkSize(int i)
    {
        boolean flag;
        if (i > 0 && i % 0x40000 == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        chunkSize = i;
        return this;
    }

    public MediaHttpUploader setDirectUploadEnabled(boolean flag)
    {
        directUploadEnabled = flag;
        return this;
    }

    public MediaHttpUploader setDisableGZipContent(boolean flag)
    {
        disableGZipContent = flag;
        return this;
    }

    public MediaHttpUploader setInitiationHeaders(HttpHeaders httpheaders)
    {
        initiationHeaders = httpheaders;
        return this;
    }

    public MediaHttpUploader setInitiationRequestMethod(String s)
    {
        boolean flag;
        if (s.equals("POST") || s.equals("PUT"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        initiationRequestMethod = s;
        return this;
    }

    public MediaHttpUploader setMetadata(HttpContent httpcontent)
    {
        metadata = httpcontent;
        return this;
    }

    public MediaHttpUploader setProgressListener(MediaHttpUploaderProgressListener mediahttpuploaderprogresslistener)
    {
        progressListener = mediahttpuploaderprogresslistener;
        return this;
    }

    public MediaHttpUploader setSleeper(Sleeper sleeper1)
    {
        sleeper = sleeper1;
        return this;
    }

    public HttpResponse upload(GenericUrl genericurl)
        throws IOException
    {
        boolean flag;
        if (uploadState == UploadState.NOT_STARTED)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        if (directUploadEnabled)
        {
            return directUpload(genericurl);
        } else
        {
            return resumableUpload(genericurl);
        }
    }
}

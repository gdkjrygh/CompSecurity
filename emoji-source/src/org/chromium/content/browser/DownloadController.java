// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;

import android.content.Context;

// Referenced classes of package org.chromium.content.browser:
//            ContentViewCore, ContentViewDownloadDelegate, DownloadInfo

public class DownloadController
{
    public static interface DownloadNotificationService
    {

        public abstract void onDownloadCompleted(DownloadInfo downloadinfo);

        public abstract void onDownloadUpdated(DownloadInfo downloadinfo);
    }


    private static final String LOGTAG = "DownloadController";
    private static DownloadNotificationService sDownloadNotificationService;
    private static final DownloadController sInstance = new DownloadController();

    private DownloadController()
    {
        nativeInit();
    }

    private static ContentViewDownloadDelegate downloadDelegateFromView(ContentViewCore contentviewcore)
    {
        return contentviewcore.getDownloadDelegate();
    }

    public static DownloadController getInstance()
    {
        return sInstance;
    }

    private native void nativeInit();

    public static void setDownloadNotificationService(DownloadNotificationService downloadnotificationservice)
    {
        sDownloadNotificationService = downloadnotificationservice;
    }

    public void newHttpGetDownload(ContentViewCore contentviewcore, String s, String s1, String s2, String s3, String s4, String s5, 
            boolean flag, String s6, long l)
    {
        contentviewcore = downloadDelegateFromView(contentviewcore);
        if (contentviewcore != null)
        {
            contentviewcore.requestHttpGetDownload((new DownloadInfo.Builder()).setUrl(s).setUserAgent(s1).setContentDisposition(s2).setMimeType(s3).setCookie(s4).setReferer(s5).setHasUserGesture(flag).setFileName(s6).setContentLength(l).setIsGETRequest(true).build());
        }
    }

    public void onDangerousDownload(ContentViewCore contentviewcore, String s, int i)
    {
        contentviewcore = downloadDelegateFromView(contentviewcore);
        if (contentviewcore != null)
        {
            contentviewcore.onDangerousDownload(s, i);
        }
    }

    public void onDownloadCompleted(Context context, String s, String s1, String s2, String s3, long l, 
            boolean flag, int i)
    {
        if (sDownloadNotificationService != null)
        {
            context = (new DownloadInfo.Builder()).setUrl(s).setMimeType(s1).setFileName(s2).setFilePath(s3).setContentLength(l).setIsSuccessful(flag).setDescription(s2).setDownloadId(i).setHasDownloadId(true).build();
            sDownloadNotificationService.onDownloadCompleted(context);
        }
    }

    public void onDownloadStarted(ContentViewCore contentviewcore, String s, String s1)
    {
        contentviewcore = downloadDelegateFromView(contentviewcore);
        if (contentviewcore != null)
        {
            contentviewcore.onDownloadStarted(s, s1);
        }
    }

    public void onDownloadUpdated(Context context, String s, String s1, String s2, String s3, long l, 
            boolean flag, int i, int j, long l1)
    {
        if (sDownloadNotificationService != null)
        {
            context = (new DownloadInfo.Builder()).setUrl(s).setMimeType(s1).setFileName(s2).setFilePath(s3).setContentLength(l).setIsSuccessful(flag).setDescription(s2).setDownloadId(i).setHasDownloadId(true).setPercentCompleted(j).setTimeRemainingInMillis(l1).build();
            sDownloadNotificationService.onDownloadUpdated(context);
        }
    }

}

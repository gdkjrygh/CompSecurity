// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.directupdate;

import android.content.Context;
import com.worklight.common.Logger;
import com.worklight.common.WLConfig;
import com.worklight.nativeandroid.common.WLUtils;
import com.worklight.utils.SecurityUtils;

// Referenced classes of package com.worklight.androidgap.directupdate:
//            WLDirectUpdateDownloader, WLDirectUpdateStatus, WLDirectUpdateListener

public class WLDirectUpdateManager
{

    private static WLDirectUpdateManager instance = new WLDirectUpdateManager();
    private static final Logger logger = Logger.getInstance(com/worklight/androidgap/directupdate/WLDirectUpdateManager.getName());
    private WLDirectUpdateDownloader downloader;

    private WLDirectUpdateManager()
    {
        downloader = null;
    }

    public static WLDirectUpdateManager getInstance()
    {
        com/worklight/androidgap/directupdate/WLDirectUpdateManager;
        JVM INSTR monitorenter ;
        WLDirectUpdateManager wldirectupdatemanager = instance;
        com/worklight/androidgap/directupdate/WLDirectUpdateManager;
        JVM INSTR monitorexit ;
        return wldirectupdatemanager;
        Exception exception;
        exception;
        throw exception;
    }

    private boolean isDownloaderStarted()
    {
        return downloader != null && downloader.getStatus() != android.os.AsyncTask.Status.FINISHED;
    }

    private boolean isHasEnoughSpaceOnDevice(long l, long l1)
    {
        return WLUtils.getFreeSpaceOnDevice() > l + l1;
    }

    private boolean isStartFreshDownload(long l)
    {
        if (l != WLConfig.getInstance().getInProgressChecksumPref())
        {
            WLConfig.getInstance().setInProgressChecksumPref(l);
            return true;
        } else
        {
            return false;
        }
    }

    private void onDownloadAndUnzipingFinished(WLDirectUpdateListener wldirectupdatelistener, WLDirectUpdateStatus wldirectupdatestatus)
    {
        if (wldirectupdatestatus == WLDirectUpdateStatus.SUCCESS)
        {
            if ("true".equals(WLConfig.getInstance().getTestWebResourcesChecksumFlag()))
            {
                logger.debug("Saving new web resources checksum on device.");
                saveChecksum();
            }
            WLConfig.getInstance().setClearCacheNextLoadPref(true);
            WLConfig.getInstance().setExternalWebResourcesPref(true);
            WLConfig.getInstance().setExitOnSkinLoaderPref(false);
        }
        wldirectupdatelistener.onFinish(wldirectupdatestatus);
    }

    private void saveChecksum()
    {
        String s = SecurityUtils.hashData(Long.toString(WLUtils.computeChecksumOnExternal(WLConfig.getInstance().getApplicationAbsolutePathToExternalWWWFiles())), "SHA-1");
        WLConfig.getInstance().setResourceChecksumPref(s);
    }

    public void start(Context context, final String final_s, long l, long l1, long l2, WLDirectUpdateListener wldirectupdatelistener)
    {
        this;
        JVM INSTR monitorenter ;
        if (wldirectupdatelistener != null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        throw new NullPointerException("WLDirectUpdateManager listener parameter cannot be null.");
        context;
        this;
        JVM INSTR monitorexit ;
        throw context;
        if (!isDownloaderStarted()) goto _L2; else goto _L1
_L1:
        logger.warn("Direct update already in progress.");
        wldirectupdatelistener.onFinish(WLDirectUpdateStatus.FAILURE_ALREADY_IN_PROGRESS);
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
label0:
        {
            if (isHasEnoughSpaceOnDevice(l1, l2))
            {
                break label0;
            }
            logger.warn("Not enough available free space for Direct Update.");
            wldirectupdatelistener.onFinish(WLDirectUpdateStatus.FAILURE_NOT_ENOUGH_SPACE);
        }
          goto _L3
        String s = WLConfig.getInstance().getSkinNamePref();
        boolean flag = isStartFreshDownload(l);
        final_s = (new StringBuilder()).append(WLConfig.getInstance().getRootURL()).append("/").append(final_s).toString();
        wldirectupdatelistener.onStart(l1);
        downloader = new WLDirectUpdateDownloader(l1, s, flag, wldirectupdatelistener, wldirectupdatelistener) {

            final WLDirectUpdateManager this$0;
            final WLDirectUpdateListener val$listener;

            protected void onCancelled(WLDirectUpdateStatus wldirectupdatestatus)
            {
                super.onCancelled(wldirectupdatestatus);
                onDownloadAndUnzipingFinished(listener, wldirectupdatestatus);
            }

            protected volatile void onCancelled(Object obj)
            {
                onCancelled((WLDirectUpdateStatus)obj);
            }

            protected void onPostExecute(WLDirectUpdateStatus wldirectupdatestatus)
            {
                super.onPostExecute(wldirectupdatestatus);
                onDownloadAndUnzipingFinished(listener, wldirectupdatestatus);
            }

            protected volatile void onPostExecute(Object obj)
            {
                onPostExecute((WLDirectUpdateStatus)obj);
            }

            
            {
                this$0 = WLDirectUpdateManager.this;
                listener = wldirectupdatelistener1;
                super(final_s, l, s1, flag, wldirectupdatelistener);
            }
        };
        downloader.execute(new Context[] {
            context
        });
          goto _L3
    }

    public void stop()
    {
        this;
        JVM INSTR monitorenter ;
        if (!isDownloaderStarted()) goto _L2; else goto _L1
_L1:
        downloader.cancel(true);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        logger.warn("Direct update was not started.");
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }


}

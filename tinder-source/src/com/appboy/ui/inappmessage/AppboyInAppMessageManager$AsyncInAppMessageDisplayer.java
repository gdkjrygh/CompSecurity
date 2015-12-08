// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import android.app.Activity;
import android.os.AsyncTask;
import com.appboy.AppboyImageUtils;
import com.appboy.models.IInAppMessage;
import com.appboy.models.InAppMessageHtmlFull;
import com.appboy.support.AppboyLogger;
import com.appboy.ui.support.StringUtils;
import com.appboy.ui.support.WebContentUtils;
import com.facebook.datasource.DataSource;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.appboy.ui.inappmessage:
//            AppboyInAppMessageManager

class this._cls0 extends AsyncTask
{

    final AppboyInAppMessageManager this$0;

    private void prepareInAppMessageWithFresco(IInAppMessage iinappmessage, String s)
    {
        DataSource datasource;
        for (datasource = Fresco.getImagePipeline().prefetchToDiskCache(ImageRequest.fromUri(s), new Object()); !datasource.isFinished();) { }
        if (!datasource.hasFailed())
        {
            break MISSING_BLOCK_LABEL_117;
        }
        if (datasource.getFailureCause() != null) goto _L2; else goto _L1
_L1:
        AppboyLogger.w(AppboyInAppMessageManager.access$000(), "Fresco disk prefetch failed with a null cause.");
_L3:
        datasource.close();
        return;
_L2:
        try
        {
            AppboyLogger.w(AppboyInAppMessageManager.access$000(), (new StringBuilder("Fresco disk prefetch failed with cause: ")).append(datasource.getFailureCause().getMessage()).append(" with image url: ").append(s).toString());
        }
        // Misplaced declaration of an exception variable
        catch (IInAppMessage iinappmessage)
        {
            AppboyLogger.e(AppboyInAppMessageManager.access$000(), "Fresco image pipeline could not be retrieved. Fresco most likely prematurely shutdown.", iinappmessage);
            return;
        }
          goto _L3
        iinappmessage.setImageDownloadSuccessful(true);
          goto _L3
    }

    protected transient IInAppMessage doInBackground(IInAppMessage aiinappmessage[])
    {
        AppboyLogger.d(AppboyInAppMessageManager.access$000(), "Starting asynchronous in-app message preparation.");
        aiinappmessage = aiinappmessage[0];
        if (aiinappmessage instanceof InAppMessageHtmlFull)
        {
            prepareInAppMessageWithHtml(aiinappmessage);
            return aiinappmessage;
        }
        String s = aiinappmessage.getImageUrl();
        if (StringUtils.isNullOrBlank(s))
        {
            AppboyLogger.w(AppboyInAppMessageManager.access$000(), "In-app message has no image URL. Not downloading image from URL.");
            return aiinappmessage;
        }
        if (AppboyInAppMessageManager.access$100(AppboyInAppMessageManager.this))
        {
            prepareInAppMessageWithFresco(aiinappmessage, s);
            return aiinappmessage;
        } else
        {
            prepareInAppMessageWithBitmapDownload(aiinappmessage, s);
            return aiinappmessage;
        }
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((IInAppMessage[])aobj);
    }

    protected void onPostExecute(final IInAppMessage inAppMessage)
    {
        if (AppboyInAppMessageManager.access$200(AppboyInAppMessageManager.this) == null)
        {
            AppboyLogger.e(AppboyInAppMessageManager.access$000(), "No activity is currently registered to receive in-app messages. Doing nothing.");
            return;
        }
        AppboyLogger.d(AppboyInAppMessageManager.access$000(), "Finished asynchronous in-app message preparation. Attempting to display in-app message.");
        if (inAppMessage != null)
        {
            AppboyInAppMessageManager.access$200(AppboyInAppMessageManager.this).runOnUiThread(new Runnable() {

                final AppboyInAppMessageManager.AsyncInAppMessageDisplayer this$1;
                final IInAppMessage val$inAppMessage;

                public void run()
                {
                    AppboyLogger.d(AppboyInAppMessageManager.access$000(), "Displaying in-app message.");
                    AppboyInAppMessageManager.access$300(this$0, inAppMessage);
                }

            
            {
                this$1 = AppboyInAppMessageManager.AsyncInAppMessageDisplayer.this;
                inAppMessage = iinappmessage;
                super();
            }
            });
            return;
        } else
        {
            AppboyLogger.e(AppboyInAppMessageManager.access$000(), "Cannot display the in-app message because the in-app message was null.");
            AppboyInAppMessageManager.access$400(AppboyInAppMessageManager.this).set(false);
            return;
        }
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((IInAppMessage)obj);
    }

    void prepareInAppMessageWithBitmapDownload(IInAppMessage iinappmessage, String s)
    {
        if (iinappmessage.getBitmap() == null)
        {
            iinappmessage.setBitmap(AppboyImageUtils.downloadImageBitmap(s));
            if (iinappmessage.getBitmap() != null)
            {
                iinappmessage.setImageDownloadSuccessful(true);
            }
            return;
        } else
        {
            AppboyLogger.i(AppboyInAppMessageManager.access$000(), "In-app message already contains image bitmap. Not downloading image from URL.");
            return;
        }
    }

    void prepareInAppMessageWithHtml(IInAppMessage iinappmessage)
    {
        iinappmessage = (InAppMessageHtmlFull)iinappmessage;
        String s = WebContentUtils.getLocalHtmlUrlFromRemoteUrl(AppboyInAppMessageManager.access$200(AppboyInAppMessageManager.this).getCacheDir(), iinappmessage.getAssetsZipRemoteUrl());
        if (!StringUtils.isNullOrBlank(s))
        {
            AppboyLogger.d(AppboyInAppMessageManager.access$000(), (new StringBuilder("Local url for html in-app message is ")).append(s).toString());
            iinappmessage.setLocalAssetsDirectoryUrl(s);
            return;
        } else
        {
            AppboyLogger.w(AppboyInAppMessageManager.access$000(), String.format("Download of html content to local directory failed for remote url: %s . Returned local url is: %s", new Object[] {
                iinappmessage.getAssetsZipRemoteUrl(), s
            }));
            return;
        }
    }

    _cls1.val.inAppMessage()
    {
        this$0 = AppboyInAppMessageManager.this;
        super();
    }
}

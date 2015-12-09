// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.upload;

import com.google.android.apps.wallet.logging.BufferedLog;
import java.nio.charset.Charset;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.apps.wallet.wobs.upload:
//            ImageUploadManager

final class val.identifier
    implements Runnable
{

    final val.identifier this$1;
    final String val$identifier;

    public final void run()
    {
        ImageUploadManager.access$100(_fld0, val$identifier);
    }

    is._cls0()
    {
        this$1 = final__pcls0;
        val$identifier = String.this;
        super();
    }

    // Unreferenced inner class com/google/android/apps/wallet/wobs/upload/ImageUploadManager$1

/* anonymous class */
    final class ImageUploadManager._cls1
        implements com.google.android.libraries.uploader.service.lib.service.Uploader.Listener
    {

        final ImageUploadManager this$0;

        public final void onResponseReceived(final String identifier, byte abyte0[], int i)
        {
            if (i == 200)
            {
                log.logfmt(com.google.android.apps.wallet.logging.WLog.LogPriority.INFO, "Upload response received: identifier=%s, responseText=\"%s\"", new Object[] {
                    identifier, new String(abyte0, Charset.forName("UTF-8"))
                });
                ImageUploadManager.access$000(ImageUploadManager.this, identifier);
                ImageUploadManager.access$200(ImageUploadManager.this).execute(identifier. new ImageUploadManager._cls1._cls1());
                return;
            }
            log.logfmt(com.google.android.apps.wallet.logging.WLog.LogPriority.ERROR, "Upload response received: identifier=%s, responseText=\"%s\", responseCode=%s", new Object[] {
                identifier, new String(abyte0, Charset.forName("UTF-8")), Integer.valueOf(i)
            });
            ImageUploadManager.access$300(ImageUploadManager.this, identifier, Integer.valueOf(i));
            if (i == 401)
            {
                log.logfmt(com.google.android.apps.wallet.logging.WLog.LogPriority.ERROR, "Got 401, retrying upload: identifier=%s", new Object[] {
                    identifier
                });
                ImageUploadManager.access$200(ImageUploadManager.this).execute(new ImageUploadManager._cls1._cls2());
                return;
            } else
            {
                ImageUploadManager.access$500(ImageUploadManager.this, identifier);
                return;
            }
        }

        public final void onUploadFailed(String s)
        {
            log.logfmt(com.google.android.apps.wallet.logging.WLog.LogPriority.ERROR, "Upload failed: identifier=%s", new Object[] {
                s
            });
            ImageUploadManager.access$300(ImageUploadManager.this, s, null);
            ImageUploadManager.access$500(ImageUploadManager.this, s);
        }

            
            {
                this$0 = ImageUploadManager.this;
                super();
            }

        // Unreferenced inner class com/google/android/apps/wallet/wobs/upload/ImageUploadManager$1$2

/* anonymous class */
        final class ImageUploadManager._cls1._cls2
            implements Runnable
        {

            final ImageUploadManager._cls1 this$1;
            final String val$identifier;

            public final void run()
            {
                try
                {
                    ImageUploadManager.access$400(this$0, identifier);
                    return;
                }
                catch (ImageUploadManager.UploadException uploadexception)
                {
                    log.log(com.google.android.apps.wallet.logging.WLog.LogPriority.ERROR, "Upload retry failed", uploadexception);
                }
            }

                    
                    {
                        this$1 = ImageUploadManager._cls1.this;
                        identifier = s;
                        super();
                    }
        }

    }

}

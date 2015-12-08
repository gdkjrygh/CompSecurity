// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.upload;

import com.google.android.apps.wallet.logging.BufferedLog;

// Referenced classes of package com.google.android.apps.wallet.wobs.upload:
//            ImageUploadManager, ImageUploadManagerRegistry

final class val.identifier
    implements Runnable
{

    final ImageUploadManager this$0;
    final String val$identifier;

    public final void run()
    {
        Object obj = ImageUploadManager.access$600(ImageUploadManager.this).remove(val$identifier);
        if (obj != null)
        {
            ImageUploadManager.access$800(ImageUploadManager.this);
            ImageUploadManager.access$900(ImageUploadManager.this, ((com.google.wallet.proto.eUploadManagerRegistryData.Entry) (obj)).wobInstanceId);
            return;
        }
        BufferedLog bufferedlog = log;
        com.google.android.apps.wallet.logging.r r = com.google.android.apps.wallet.logging.R;
        obj = String.valueOf(val$identifier);
        if (((String) (obj)).length() != 0)
        {
            obj = "missing upload file for identifier: ".concat(((String) (obj)));
        } else
        {
            obj = new String("missing upload file for identifier: ");
        }
        bufferedlog.log(r, ((String) (obj)));
        ImageUploadManager.access$900(ImageUploadManager.this, null);
    }

    tryData.Entry()
    {
        this$0 = final_imageuploadmanager;
        val$identifier = String.this;
        super();
    }
}

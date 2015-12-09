// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.upload;

import android.os.SystemClock;
import com.google.android.apps.wallet.logging.BufferedLog;

// Referenced classes of package com.google.android.apps.wallet.wobs.upload:
//            ImageUploadManager, ImageUploadManagerRegistry

final class val.itemDeleted
    implements Runnable
{

    final ImageUploadManager this$0;
    final boolean val$itemDeleted;
    final com.google.wallet.proto.Instance val$wobInstance;

    public final void run()
    {
        boolean flag = false;
        boolean flag1 = ImageUploadManager.access$600(ImageUploadManager.this).clearOldAndDereferencedEntries(val$wobInstance);
        boolean flag2;
        flag2 = flag1;
        flag = flag1;
        if (!val$itemDeleted)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        flag = flag1;
        ImageUploadManager.access$600(ImageUploadManager.this).clearEntryWithId(val$wobInstance.id);
        flag2 = flag1;
_L2:
        if (!flag2 && SystemClock.uptimeMillis() - ImageUploadManager.access$700(ImageUploadManager.this) <= ImageUploadManager.CLEAR_ORPHANED_FILES_PERIOD)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        ImageUploadManager.access$800(ImageUploadManager.this);
        ImageUploadManager.access$702(ImageUploadManager.this, SystemClock.uptimeMillis());
        return;
        Throwable throwable;
        throwable;
        log.log(com.google.android.apps.wallet.logging.R, "Failure while clearing dereferenced registry entries", throwable);
        flag2 = flag;
        if (true) goto _L2; else goto _L1
_L1:
        throwable;
        log.log(com.google.android.apps.wallet.logging.R, "Failure while clearing orphaned files", throwable);
        return;
    }

    istry()
    {
        this$0 = final_imageuploadmanager;
        val$wobInstance = instance;
        val$itemDeleted = Z.this;
        super();
    }
}

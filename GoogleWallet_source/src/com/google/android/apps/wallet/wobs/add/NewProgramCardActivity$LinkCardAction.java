// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.add;

import com.google.android.apps.wallet.callstatus.CallErrorException;
import com.google.android.apps.wallet.callstatus.CallStatus;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.rpc.RpcException;
import com.google.android.apps.wallet.wobs.caching.WobsManager;
import com.google.android.apps.wallet.wobs.upload.ImageUploadManager;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.wobs.add:
//            NewProgramCardActivity, ProgramCardInfo, ImageInfo, ProgramCardsHandler, 
//            DaggerOcrImageHolder, OcrUserEventData, ProgramCardsUiProperties

final class <init>
    implements Callable
{

    private final ProgramCardInfo actionCardInfo;
    final NewProgramCardActivity this$0;

    private CallStatus call()
        throws RpcException, CallErrorException
    {
        ImageInfo aimageinfo[] = actionCardInfo.getImages();
        if (aimageinfo != null)
        {
            int k = aimageinfo.length;
            for (int i = 0; i < k; i++)
            {
                aimageinfo[i].setIdentifier(imageUploadManager.generateIdentifier());
            }

        }
        com.google.wallet.proto.  = getProgramCardsHandler().makeWobInstance(actionCardInfo);
        if ( != null)
        {
            if (aimageinfo != null)
            {
                int l = aimageinfo.length;
                int j = 0;
                while (j < l) 
                {
                    ImageInfo imageinfo = aimageinfo[j];
                    String s = imageinfo.getIdentifier();
                    try
                    {
                        imageUploadManager.registerAndUploadImage(s, .registerAndUploadImage, imageinfo.getImageBytes());
                    }
                    catch (com.google.android.apps.wallet.wobs.upload.it> it>)
                    {
                        WLog.efmt(NewProgramCardActivity.access$000(), it>, "Failed to start upload: identifier=%s", new Object[] {
                            s
                        });
                    }
                    j++;
                }
                DaggerOcrImageHolder daggerocrimageholder = ocrImageHolder;
                DaggerOcrImageHolder.clear();
            }
            wobsManager.upsertWobIfNecessary();
            ocrUserEventData.setSaveResult(true);
            NewProgramCardActivity.access$200(NewProgramCardActivity.this);
            return CallStatus.SUCCESS;
        } else
        {
            ocrUserEventData.setSaveResult(false);
            NewProgramCardActivity.access$200(NewProgramCardActivity.this);
            return CallStatus.failure(getUiProperties().getErrorDialogTitle(), getUiProperties().getErrorDialogMessage());
        }
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    private (ProgramCardInfo programcardinfo)
    {
        this$0 = NewProgramCardActivity.this;
        super();
        actionCardInfo = programcardinfo.copy();
    }

    actionCardInfo(ProgramCardInfo programcardinfo, actionCardInfo actioncardinfo)
    {
        this(programcardinfo);
    }
}

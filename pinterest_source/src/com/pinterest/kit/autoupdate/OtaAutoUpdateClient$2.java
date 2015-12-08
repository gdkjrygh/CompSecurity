// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.autoupdate;

import com.android.volley.VolleyError;
import com.pinterest.api.ByteApiResponseHandler;
import com.pinterest.base.Application;
import com.pinterest.kit.log.PLog;
import com.pinterest.kit.notification.NotificationHelper;
import com.pinterest.kit.utils.FileUtils;
import java.io.File;
import java.io.IOException;

// Referenced classes of package com.pinterest.kit.autoupdate:
//            OtaAutoUpdateClient

final class  extends ByteApiResponseHandler
{

    public final void onErrorResponse(VolleyError volleyerror)
    {
        Application.showToast(0x7f07072f);
        OtaAutoUpdateClient.a(false);
    }

    public final volatile void onResponse(Object obj)
    {
        onResponse((byte[])obj);
    }

    public final void onResponse(byte abyte0[])
    {
        File file = new File(Application.context().getExternalCacheDir(), "pinterest-master.apk");
        file.delete();
        try
        {
            FileUtils.writeByteArrayToFile(file, abyte0);
            if (file.exists())
            {
                OtaAutoUpdateClient.a(file);
            }
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            PLog.error(abyte0, "exception occurred", new Object[0]);
        }
        NotificationHelper.cancelNotification(1);
        OtaAutoUpdateClient.a(false);
    }

    public final void onStart()
    {
        OtaAutoUpdateClient.d();
        OtaAutoUpdateClient.a(true);
    }

    ()
    {
    }
}

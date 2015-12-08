// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.utils;

import android.os.Process;
import com.pinterest.common.async.BackgroundTask;
import com.pinterest.kit.log.PLog;
import java.io.InputStream;
import org.apache.commons.io.IOUtils;

// Referenced classes of package com.pinterest.kit.utils:
//            GifDecoder, AppUtils

public class _inputStream extends BackgroundTask
{

    private InputStream _inputStream;
    final GifDecoder this$0;

    public void onFinish()
    {
        super.onFinish();
    }

    public void run()
    {
        Process.setThreadPriority(19);
        in = _inputStream;
        if (_inputStream != null)
        {
            readHeader();
            if (!err() && AppUtils.hasEnoughHeapSpace())
            {
                readContents();
                if (frameCount < 0)
                {
                    status = 1;
                }
            }
        } else
        {
            status = 2;
        }
        try
        {
            IOUtils.closeQuietly(_inputStream);
            return;
        }
        catch (Exception exception)
        {
            PLog.error(exception, "exception occurred", new Object[0]);
        }
    }

    public (InputStream inputstream)
    {
        this$0 = GifDecoder.this;
        super();
        _inputStream = inputstream;
    }
}

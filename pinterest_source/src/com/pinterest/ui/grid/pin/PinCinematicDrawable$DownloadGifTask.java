// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.grid.pin;

import android.graphics.Bitmap;
import com.pinterest.api.ApiHttpClient;
import com.pinterest.common.async.BackgroundTask;
import com.pinterest.kit.data.DiskCache;
import com.pinterest.kit.log.PLog;
import com.pinterest.kit.utils.AppUtils;
import com.pinterest.kit.utils.GifDecoder;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.apache.commons.lang3.BooleanUtils;

public class NG extends BackgroundTask
{

    private final Listener _listener;
    private boolean _shouldExit;
    private final String _url;

    private boolean shouldExit()
    {
        return _shouldExit;
    }

    public void cancel()
    {
        _shouldExit = true;
    }

    public void onFinish()
    {
    }

    public void run()
    {
        if (!shouldExit()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj = ApiHttpClient.cacheGifResponse(_url);
        if (obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = new ByteArrayInputStream(((Response) (obj)).g().e());
        if (shouldExit())
        {
            continue; /* Loop/switch isn't completed */
        }
        _listener.onStatusChanged(D);
_L4:
        Object obj1;
        if (!shouldExit())
        {
            if (!AppUtils.hasEnoughHeapSpace())
            {
                System.gc();
            }
            if (AppUtils.hasEnoughHeapSpace() && obj != null)
            {
                _listener.onStatusChanged(Listener.onStatusChanged);
                obj1 = GifDecoder.instance((new StringBuilder("Cinematic")).append(_url).toString());
                DiskCache.ensureDirectory("Cinematic");
                if (BooleanUtils.isFalse(Boolean.valueOf(DiskCache.cacheFileExists(_url, "Cinematic"))) && !((GifDecoder) (obj1)).isStatusOk())
                {
                    ((GifDecoder) (obj1)).read(((java.io.InputStream) (obj)), _listener);
                } else
                {
                    ((GifDecoder) (obj1)).getFirstFrame(_listener);
                }
                if (!shouldExit())
                {
                    _listener.onDecoderReady(((GifDecoder) (obj1)));
                    return;
                }
            }
        }
        if (true) goto _L1; else goto _L3
        obj1;
        obj = null;
_L5:
        if (shouldExit())
        {
            continue; /* Loop/switch isn't completed */
        }
        _listener.onStatusChanged(Listener.onStatusChanged);
        _shouldExit = true;
        PLog.error(((Throwable) (obj1)), "exception occurred", new Object[0]);
          goto _L4
        obj1;
          goto _L5
_L3:
        obj = null;
          goto _L4
    }

    public Listener(String s, Listener listener)
    {
        _url = s;
        _listener = listener;
        class Listener
        {

            public abstract void onDecodeFinished(int i);

            public abstract void onDecoderReady(GifDecoder gifdecoder);

            public abstract void onFirstFrameReady(Bitmap bitmap);

            public abstract void onMemoryMappedFinish();

            public abstract void onStatusChanged(PinCinematicDrawable.Status status);

            public Listener()
            {
            }
        }

        _listener.onStatusChanged(NG);
    }
}

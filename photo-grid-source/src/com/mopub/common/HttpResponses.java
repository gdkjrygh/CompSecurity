// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.common;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import org.json.JSONObject;
import org.json.JSONTokener;

// Referenced classes of package com.mopub.common:
//            DownloadResponse

public final class HttpResponses
{

    private HttpResponses()
    {
    }

    public static Bitmap asBitmap(DownloadResponse downloadresponse)
    {
        if (downloadresponse == null)
        {
            return null;
        } else
        {
            downloadresponse = downloadresponse.getByteArray();
            return BitmapFactory.decodeByteArray(downloadresponse, 0, downloadresponse.length);
        }
    }

    public static JSONObject asJsonObject(DownloadResponse downloadresponse)
    {
        if (downloadresponse == null)
        {
            return null;
        }
        try
        {
            downloadresponse = new JSONObject(new JSONTokener(asResponseString(downloadresponse)));
        }
        // Misplaced declaration of an exception variable
        catch (DownloadResponse downloadresponse)
        {
            return null;
        }
        return downloadresponse;
    }

    public static String asResponseString(DownloadResponse downloadresponse)
    {
        if (downloadresponse == null)
        {
            return null;
        }
        try
        {
            downloadresponse = new String(downloadresponse.getByteArray(), "UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (DownloadResponse downloadresponse)
        {
            return null;
        }
        return downloadresponse;
    }
}

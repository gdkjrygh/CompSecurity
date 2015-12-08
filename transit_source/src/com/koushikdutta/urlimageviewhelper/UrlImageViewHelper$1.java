// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.koushikdutta.urlimageviewhelper;

import android.content.Context;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package com.koushikdutta.urlimageviewhelper:
//            UrlImageViewHelper, UrlDownloader

static final class ader extends ader
{

    static final boolean $assertionsDisabled;
    final Context val$context;
    final String val$filename;
    final int val$targetHeight;
    final int val$targetWidth;
    final String val$url;

    public void onDownloadComplete(UrlDownloader urldownloader, InputStream inputstream, String s)
    {
        if ($assertionsDisabled || inputstream == null || s == null) goto _L2; else goto _L1
_L1:
        String s1;
        try
        {
            throw new AssertionError();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream) { }
        finally { }
_L10:
        (new File(val$filename)).delete();
        if (urldownloader != null && !urldownloader.allowCache())
        {
            (new File(val$filename)).delete();
        }
_L8:
        return;
_L2:
        if (inputstream == null && s == null)
        {
            if (urldownloader != null && !urldownloader.allowCache())
            {
                (new File(val$filename)).delete();
                return;
            }
            continue; /* Loop/switch isn't completed */
        }
        s1 = val$filename;
        if (inputstream == null) goto _L4; else goto _L3
_L3:
        inputstream = new BufferedInputStream(inputstream, 8192);
        s = new BufferedOutputStream(new FileOutputStream(val$filename), 8192);
        UrlImageViewHelper.copyStream(inputstream, s);
        s.close();
        inputstream = s1;
_L6:
        result = UrlImageViewHelper.access$100(val$context, val$url, inputstream, val$targetWidth, val$targetHeight);
        if (urldownloader != null && !urldownloader.allowCache())
        {
            (new File(val$filename)).delete();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        inputstream = s;
        if (true) goto _L6; else goto _L5
_L5:
        if (urldownloader != null && !urldownloader.allowCache())
        {
            (new File(val$filename)).delete();
        }
        throw inputstream;
        if (true) goto _L8; else goto _L7
_L7:
        inputstream;
          goto _L5
        inputstream;
        if (true) goto _L10; else goto _L9
_L9:
    }

    static 
    {
        boolean flag;
        if (!com/koushikdutta/urlimageviewhelper/UrlImageViewHelper.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }

    ader(String s, Context context1, String s1, int i, int j)
    {
        val$filename = s;
        val$context = context1;
        val$url = s1;
        val$targetWidth = i;
        val$targetHeight = j;
        super(null);
    }
}

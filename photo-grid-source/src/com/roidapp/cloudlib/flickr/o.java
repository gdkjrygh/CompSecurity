// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.flickr;

import android.os.Handler;
import android.widget.ImageView;
import java.io.FileOutputStream;
import java.io.IOException;

// Referenced classes of package com.roidapp.cloudlib.flickr:
//            FlickrListCloud, p

final class o extends Thread
{

    final String a;
    final String b;
    final ImageView c;
    final FlickrListCloud d;

    o(FlickrListCloud flickrlistcloud, String s, String s1, ImageView imageview)
    {
        d = flickrlistcloud;
        a = s;
        b = s1;
        c = imageview;
        super();
    }

    public final void run()
    {
        FileOutputStream fileoutputstream = new FileOutputStream(a);
        Object obj = fileoutputstream;
        if (!FlickrListCloud.a(b, fileoutputstream))
        {
            break MISSING_BLOCK_LABEL_46;
        }
        obj = fileoutputstream;
        FlickrListCloud.b(d).post(new p(this));
        fileoutputstream.flush();
        fileoutputstream.close();
_L2:
        return;
        obj;
        ((Exception) (obj)).printStackTrace();
        return;
        IOException ioexception;
        ioexception;
        fileoutputstream = null;
_L5:
        obj = fileoutputstream;
        ioexception.printStackTrace();
        if (fileoutputstream == null) goto _L2; else goto _L1
_L1:
        try
        {
            fileoutputstream.flush();
            fileoutputstream.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((Exception) (obj)).printStackTrace();
        }
        return;
        Exception exception1;
        exception1;
        obj = null;
_L4:
        if (obj != null)
        {
            try
            {
                ((FileOutputStream) (obj)).flush();
                ((FileOutputStream) (obj)).close();
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
            }
        }
        throw exception1;
        exception1;
        if (true) goto _L4; else goto _L3
_L3:
        ioexception;
          goto _L5
    }
}

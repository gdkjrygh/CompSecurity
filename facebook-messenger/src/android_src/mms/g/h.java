// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.mms.g;

import android.net.Uri;
import android.widget.Toast;
import android_src.mms.d;
import com.facebook.debug.log.b;

// Referenced classes of package android_src.mms.g:
//            d

class h
    implements Runnable
{

    final Uri a;
    final android_src.mms.g.d b;

    h(android_src.mms.g.d d1, Uri uri)
    {
        b = d1;
        a = uri;
        super();
    }

    public void run()
    {
        try
        {
            Toast.makeText(d.a(b), d.a(b, a), 1).show();
            return;
        }
        catch (d d1)
        {
            com.facebook.debug.log.b.d("DownloadManager", d1.getMessage(), d1);
        }
    }
}

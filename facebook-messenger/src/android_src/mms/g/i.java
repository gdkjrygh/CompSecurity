// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.mms.g;

import android.widget.Toast;
import com.facebook.debug.log.b;

// Referenced classes of package android_src.mms.g:
//            d

class i
    implements Runnable
{

    final int a;
    final d b;

    i(d d1, int j)
    {
        b = d1;
        a = j;
        super();
    }

    public void run()
    {
        try
        {
            Toast.makeText(d.a(b), a, 1).show();
            return;
        }
        catch (Exception exception)
        {
            com.facebook.debug.log.b.e("DownloadManager", "Caught an exception in showErrorCodeToast");
        }
    }
}

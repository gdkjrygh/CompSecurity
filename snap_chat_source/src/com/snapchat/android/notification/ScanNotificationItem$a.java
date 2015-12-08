// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.notification;

import IQ;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.widget.ImageView;
import java.io.PrintStream;
import java.net.URL;

// Referenced classes of package com.snapchat.android.notification:
//            ScanNotificationItem

public class a extends AsyncTask
{

    private ScanNotificationItem a;

    private static transient Bitmap a(String as[])
    {
        try
        {
            as = IQ.a(new URL(as[0]));
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            System.out.println(as);
            return null;
        }
        return as;
    }

    public void a(Bitmap bitmap)
    {
        if (bitmap != null)
        {
            a.j().setImageBitmap(bitmap);
            a.j().setVisibility(0);
        }
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((String[])aobj);
    }

    public void onPostExecute(Object obj)
    {
        a((Bitmap)obj);
    }

    public (ScanNotificationItem scannotificationitem)
    {
        a = scannotificationitem;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.webkit.DownloadListener;

// Referenced classes of package p.cp:
//            d

class .Object
    implements DownloadListener
{

    final d a;

    public void onDownloadStart(String s, String s1, String s2, String s3, long l)
    {
        if (d.c(a) != null)
        {
            s = new Intent("android.intent.action.VIEW", Uri.parse(s));
            d.c(a).startActivity(s);
        }
    }

    .String(d d1)
    {
        a = d1;
        super();
    }
}

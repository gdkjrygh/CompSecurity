// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import java.io.File;

final class gyu extends azf
{

    private gys a;

    public gyu(gys gys1)
    {
        a = gys1;
        super(0x80000000, 0x80000000);
    }

    public final void a(Object obj, azp azp)
    {
        obj = (File)obj;
        azp = a;
        if (((gys) (azp)).g.a())
        {
            noy.a("from start load", ((gys) (azp)).h);
            noy.a("file", obj);
        }
        if (((gys) (azp)).e != null)
        {
            ((gys) (azp)).e.cancel(true);
        }
        azp.e = new gyt(azp, ((File) (obj)));
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            ((gys) (azp)).e.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            return;
        } else
        {
            ((gys) (azp)).e.execute(new Void[0]);
            return;
        }
    }

    public final void c(Drawable drawable)
    {
    }
}

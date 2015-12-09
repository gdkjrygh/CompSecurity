// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cm;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import com.pandora.android.provider.b;
import java.util.concurrent.ExecutionException;
import p.l.a;
import p.l.d;
import p.l.g;
import p.l.j;

public abstract class t extends AsyncTask
{

    public t()
    {
    }

    private Bitmap c(Bitmap bitmap)
    {
        if (bitmap == null)
        {
            return null;
        } else
        {
            return bitmap.copy(bitmap.getConfig(), false);
        }
    }

    protected transient Bitmap a(String as[])
    {
        Object obj;
        android.app.Application application;
        String s;
        application = b.a.h();
        s = as[0];
        obj = as[1];
        if (!isCancelled()) goto _L2; else goto _L1
_L1:
        obj = null;
_L4:
        return ((Bitmap) (obj));
_L2:
        try
        {
            as = (Bitmap)g.b(application).a(s).h().a(p.s.b.c).a(new p.ao.b(((String) (obj)))).c(0x80000000, 0x80000000).get();
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            return BitmapFactory.decodeResource(application.getResources(), 0x7f0200e9);
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            return null;
        }
        as = c(as);
_L5:
        obj = as;
        if (as == null)
        {
            return BitmapFactory.decodeResource(application.getResources(), 0x7f0200e9);
        }
        if (true) goto _L4; else goto _L3
_L3:
        as;
_L6:
        com.crashlytics.android.d.a(new RuntimeException((new StringBuilder()).append("Error on ImageFetchAsyncTaskexecuted by ").append(((String) (obj))).toString(), as));
        as = null;
          goto _L5
        as;
          goto _L6
    }

    protected abstract void a(Bitmap bitmap);

    protected abstract void b(Bitmap bitmap);

    protected Object doInBackground(Object aobj[])
    {
        return a((String[])aobj);
    }

    protected void onCancelled(Object obj)
    {
        a((Bitmap)obj);
    }

    protected void onPostExecute(Object obj)
    {
        b((Bitmap)obj);
    }
}

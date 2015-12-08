// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.AsyncTask;
import android.util.Log;
import com.google.android.apps.photos.slideshow.SlideshowService;
import java.util.List;

public final class img extends AsyncTask
{

    private SlideshowService a;

    img(SlideshowService slideshowservice)
    {
        a = slideshowservice;
        super();
    }

    protected final Object doInBackground(Object aobj[])
    {
        return ((emp[])aobj)[0].s();
    }

    protected final void onPostExecute(Object obj)
    {
        obj = (elb)obj;
        try
        {
            SlideshowService.a(a, (List)((elb) (obj)).a());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            SlideshowService.a();
        }
        Log.e("SlideshowService", "Slideshow can't advance because provided cursor is null.");
    }
}

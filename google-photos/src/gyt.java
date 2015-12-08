// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.AsyncTask;
import com.google.android.apps.photos.photofragment.components.photoview.PhotoView;
import java.io.File;

final class gyt extends AsyncTask
{

    private File a;
    private gys b;

    gyt(gys gys1, File file)
    {
        b = gys1;
        a = file;
        super();
    }

    private transient ohp a()
    {
        Object obj;
        try
        {
            obj = a.getAbsolutePath();
            int i = b.z(((String) (obj)));
            obj = new ohp(b.i.getContext(), ((String) (obj)), PhotoView.e(), i);
        }
        catch (Exception exception)
        {
            return null;
        }
        return ((ohp) (obj));
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a();
    }

    protected final void onPostExecute(Object obj)
    {
        obj = (ohp)obj;
        if (!isCancelled())
        {
            b.b = ((ohp) (obj));
            b.e = null;
            if (b.b != null)
            {
                b.e();
            }
            if (b.g.a())
            {
                noy.a("from file", a);
                noy.a("from start load", b.h);
            }
        }
    }
}

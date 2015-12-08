// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.AsyncTask;
import android.widget.ImageView;
import com.google.android.apps.photos.daydream.DreamViewFlipper;
import java.util.List;

public final class ezs extends AsyncTask
{

    private DreamViewFlipper a;

    public ezs(DreamViewFlipper dreamviewflipper)
    {
        a = dreamviewflipper;
        super();
    }

    protected final Object doInBackground(Object aobj[])
    {
        aobj = ((ekq[])aobj)[0];
        return DreamViewFlipper.a(a, ((ekq) (aobj)));
    }

    protected final void onPostExecute(Object obj)
    {
        obj = (List)obj;
        super.onPostExecute(obj);
        if (((List) (obj)).size() > 0)
        {
            DreamViewFlipper.a(a, ((List) (obj)));
            DreamViewFlipper.a(a, 0);
            DreamViewFlipper.a(a, true);
            DreamViewFlipper.f(a).setAlpha(0.0F);
            DreamViewFlipper.c(a, DreamViewFlipper.f(a));
            return;
        } else
        {
            DreamViewFlipper.d(a);
            return;
        }
    }
}

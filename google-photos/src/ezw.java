// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.apps.photos.daydream.PhotosDreamService;
import java.util.Set;

public final class ezw extends AsyncTask
{

    private final Context a;
    private final ezv b;

    public ezw(Context context, ezv ezv1)
    {
        a = context;
        b = ezv1;
    }

    protected final Object doInBackground(Object aobj[])
    {
        return PhotosDreamService.a(((Integer[])aobj)[0].intValue(), a);
    }

    protected final void onPostExecute(Object obj)
    {
        obj = (Set)obj;
        b.a(((Set) (obj)));
    }
}

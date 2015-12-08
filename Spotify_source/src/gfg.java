// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.os.AsyncTask;
import java.lang.ref.WeakReference;

final class gfg extends AsyncTask
{

    private WeakReference a;
    private gfh b;

    public gfg(Context context, gfh gfh1)
    {
        a = new WeakReference(context);
        b = gfh1;
    }

    private transient Long a()
    {
        Object obj = (Context)a.get();
        if (obj != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        if (!((Cursor) (obj = ((Context) (obj)).getContentResolver().query(dtw.a, gff.a, null, null, null))).moveToFirst()) goto _L1; else goto _L3
_L3:
        Exception exception;
        long l;
        try
        {
            l = ((Cursor) (obj)).getLong(0);
        }
        catch (NumberFormatException numberformatexception)
        {
            ((Cursor) (obj)).close();
            return null;
        }
        finally
        {
            ((Cursor) (obj)).close();
        }
        ((Cursor) (obj)).close();
        return Long.valueOf(l);
        throw exception;
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a();
    }

    protected final void onPostExecute(Object obj)
    {
        obj = (Long)obj;
        a.clear();
        if (obj != null && ((Long) (obj)).longValue() != 0L)
        {
            b.a(((Long) (obj)).longValue());
        }
    }
}

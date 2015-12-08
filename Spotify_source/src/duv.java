// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.AsyncTask;

public final class duv extends AsyncTask
{

    public duv()
    {
    }

    protected final volatile Object doInBackground(Object aobj[])
    {
        return null;
    }

    protected final void onPreExecute()
    {
        geh.b("This dummy task must be called from the main thread");
        super.onPreExecute();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.AsyncTask;

final class npg extends AsyncTask
{

    private npe a;

    npg(npe npe1)
    {
        a = npe1;
        super();
    }

    protected final Object doInBackground(Object aobj[])
    {
        a.e.run();
        return null;
    }
}

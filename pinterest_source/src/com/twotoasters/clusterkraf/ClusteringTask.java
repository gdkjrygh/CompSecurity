// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.twotoasters.clusterkraf;

import android.os.AsyncTask;
import android.os.Process;

// Referenced classes of package com.twotoasters.clusterkraf:
//            ClustersBuilder

public class ClusteringTask extends AsyncTask
{

    private final Host a;

    ClusteringTask(Host host)
    {
        a = host;
    }

    protected Object doInBackground(Object aobj[])
    {
        Argument aargument[] = (Argument[])aobj;
        aobj = new Result();
        if (aargument != null && aargument.length == 1)
        {
            Process.setThreadPriority(1);
            Argument argument = aargument[0];
            ClustersBuilder clustersbuilder = new ClustersBuilder(argument.a, argument.b, argument.d);
            clustersbuilder.a(argument.c);
            aobj.b = clustersbuilder.a();
            aobj.a = argument.a;
            Process.setThreadPriority(10);
        }
        return ((Object) (aobj));
    }

    protected void onPostExecute(Object obj)
    {
        obj = (Result)obj;
        super.onPostExecute(obj);
        if (!isCancelled() && obj != null && a != null)
        {
            a.onClusteringTaskPostExecute(((Result) (obj)));
        }
    }

    private class Result
    {

        Projection a;
        ArrayList b;

        Result()
        {
        }
    }


    private class Argument
    {

        Projection a;
        Options b;
        ArrayList c;
        ArrayList d;

        Argument()
        {
        }
    }


    private class Host
    {

        public abstract void onClusteringTaskPostExecute(Result result);
    }

}

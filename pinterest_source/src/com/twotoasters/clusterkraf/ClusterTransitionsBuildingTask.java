// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.twotoasters.clusterkraf;

import android.os.AsyncTask;
import android.os.Process;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.twotoasters.clusterkraf:
//            ClusterPoint, ClusterTransitions

public class ClusterTransitionsBuildingTask extends AsyncTask
{

    private final Host a;

    ClusterTransitionsBuildingTask(Host host)
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
            Object obj = aargument[0];
            ClusterTransitions.Builder builder = new ClusterTransitions.Builder(((Argument) (obj)).a, ((Argument) (obj)).b);
            if (((Argument) (obj)).c != null)
            {
                for (obj = ((Argument) (obj)).c.iterator(); ((Iterator) (obj)).hasNext(); builder.a((ClusterPoint)((Iterator) (obj)).next())) { }
            }
            aobj.a = new ClusterTransitions(builder, (byte)0);
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
            a.onClusterTransitionsBuildingTaskPostExecute(((Result) (obj)));
        }
    }

    private class Result
    {

        ClusterTransitions a;

        Result()
        {
        }
    }


    private class Argument
    {

        Projection a;
        ArrayList b;
        ArrayList c;

        Argument()
        {
        }
    }


    private class Host
    {

        public abstract void onClusterTransitionsBuildingTaskPostExecute(Result result);
    }

}

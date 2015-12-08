// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android;

import io.fabric.sdk.android.services.concurrency.Priority;
import io.fabric.sdk.android.services.concurrency.PriorityAsyncTask;
import io.fabric.sdk.android.services.concurrency.PriorityProvider;
import io.fabric.sdk.android.services.concurrency.UnmetDependencyException;

// Referenced classes of package io.fabric.sdk.android:
//            Kit, InitializationException, InitializationCallback, Fabric, 
//            Logger

class InitializationTask extends PriorityAsyncTask
    implements PriorityProvider
{

    private final Kit kit;

    public InitializationTask(Kit kit1)
    {
        kit = kit1;
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected transient Object doInBackground(Void avoid[])
    {
        if (!isCancelled())
        {
            return kit.doInBackground();
        } else
        {
            return null;
        }
    }

    public Priority getPriority()
    {
        return Priority.HIGH;
    }

    protected void onCancelled(Object obj)
    {
        kit.onCancelled(obj);
        obj = new InitializationException((new StringBuilder()).append(kit.getIdentifier()).append(" Initialization was cancelled").toString());
        kit.initializationCallback.failure(((Exception) (obj)));
    }

    protected void onPostExecute(Object obj)
    {
        kit.onPostExecute(obj);
        kit.initializationCallback.success(obj);
    }

    protected void onPreExecute()
    {
        super.onPreExecute();
        boolean flag = kit.onPreExecute();
        if (!flag)
        {
            cancel(true);
        }
_L2:
        return;
        Object obj;
        obj;
        throw obj;
        obj;
        if (true)
        {
            cancel(true);
        }
        throw obj;
        obj;
        Fabric.getLogger().e("Fabric", "Failure onPreExecute()", ((Throwable) (obj)));
        if (true)
        {
            cancel(true);
            return;
        }
        if (true) goto _L2; else goto _L1
_L1:
    }
}
